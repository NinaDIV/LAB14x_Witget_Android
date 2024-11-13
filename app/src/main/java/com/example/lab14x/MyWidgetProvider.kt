package com.example.lab14x

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class MyWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(
        context: Context ,
        appWidgetManager: AppWidgetManager ,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.primerwidget)
            // Configura el contenido del widget aquí
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}
