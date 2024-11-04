package com.example.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews


class Widget2Provider : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            // 레이아웃 설정
            val views = RemoteViews(context.packageName, R.layout.widget2_layout)


            // 데이터 설정
//            views.setTextViewText(R.id.tv_name, "김철수")
//            views.setTextViewText(R.id.tv_d_day, "D-213")
//            views.setTextViewText(R.id.tv_percentage, "15%")
//            views.setProgressBar(R.id.progress_bar, 100, 15, false)

            // 위젯 업데이트
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}