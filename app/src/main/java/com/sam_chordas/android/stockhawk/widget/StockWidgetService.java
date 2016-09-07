package com.sam_chordas.android.stockhawk.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * udacity-stockhawk
 * Created on 06/09/2016 by Frédéric Letellier.
 */
public class StockWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StockWidgetRemoteViewsService(getApplicationContext(), intent);
    }
}
