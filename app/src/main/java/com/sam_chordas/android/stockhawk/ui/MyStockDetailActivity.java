package com.sam_chordas.android.stockhawk.ui;

import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sam_chordas.android.stockhawk.R;
import com.sam_chordas.android.stockhawk.data.HistoricalQuotationColumns;
import com.sam_chordas.android.stockhawk.data.QuoteProvider;

/**
 * udacity-stockhawk
 * Created on 02/09/2016 by Espace de travail.
 */
public class MyStockDetailActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    public static final String ARG_STOCK_SYMBOL = "stock_symbol";
    private static final int CURSOR_LOADER_ID = 0;

    private String stockSymbol;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_graph);

        stockSymbol = getIntent().getExtras().getString(ARG_STOCK_SYMBOL);

        getLoaderManager().initLoader(CURSOR_LOADER_ID, null, this);

    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String[] projection = new String[]{
                HistoricalQuotationColumns._ID,
                HistoricalQuotationColumns.SYMBOL,
                HistoricalQuotationColumns.DATE,
                HistoricalQuotationColumns.OPENPRICE};

        String selection = HistoricalQuotationColumns.SYMBOL + " = ?";

        String[] selectionArgs = new String[]{stockSymbol};

        String sortOrder = HistoricalQuotationColumns.DATE + " ASC";

        return new CursorLoader(this,
                QuoteProvider.HistoricalQuotation.CONTENT_URI,
                projection,
                selection,
                selectionArgs,
                sortOrder);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
