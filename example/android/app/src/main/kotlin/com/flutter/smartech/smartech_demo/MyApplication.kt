package com.flutter.smartech.smartech_demo

import android.app.Application
import android.content.IntentFilter
import android.util.Log
import io.flutter.app.FlutterApplication
import io.flutter.plugins.smartech_plugin.*

class MyApplication: FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
        Log.d("onCreate","onCreate")
         SmartechPlugin.initializePlugin(this)
        SmartechPlugin.setDebugLevel(9)
        SmartechPlugin.trackAppInstallUpdateBySmartech()
        val deeplinkReceiver = DeeplinkReceivers()
        val filter = IntentFilter("com.smartech.EVENT_PN_INBOX_CLICK")
        registerReceiver(deeplinkReceiver,filter)
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d("onTerminate","onTerminate")
        System.exit(0);

    }
}