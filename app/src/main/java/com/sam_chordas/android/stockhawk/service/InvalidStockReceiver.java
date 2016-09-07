package com.sam_chordas.android.stockhawk.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.sam_chordas.android.stockhawk.R;

/**
 * udacity-stockhawk
 * Created on 07/09/2016 by Frédéric Letellier.
 */
public class InvalidStockReceiver extends BroadcastReceiver {
    public InvalidStockReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, R.string.invalid_stock_toast, Toast.LENGTH_LONG).show();
    }
}
