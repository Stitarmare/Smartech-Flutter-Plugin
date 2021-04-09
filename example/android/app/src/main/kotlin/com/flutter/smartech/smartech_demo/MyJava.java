package com.flutter.smartech.smartech_demo;

import android.os.Bundle;

import androidx.annotation.Nullable;



import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugins.smartech_plugin.DeeplinkReceivers;

public class MyJava  extends FlutterActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new DeeplinkReceivers().onReceive(this, getIntent());
    }
}
