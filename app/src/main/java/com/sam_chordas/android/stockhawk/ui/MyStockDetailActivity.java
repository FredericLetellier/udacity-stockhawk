package com.sam_chordas.android.stockhawk.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sam_chordas.android.stockhawk.R;

/**
 * udacity-stockhawk
 * Created on 02/09/2016 by Espace de travail.
 */
public class MyStockDetailActivity extends AppCompatActivity {

    public static final String ARG_STOCK_SYMBOL = "stock_symbol";

    private String stockSymbol;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_graph);

        stockSymbol = getIntent().getExtras().getString(ARG_STOCK_SYMBOL);

    }
}
