package com.getitgoing.farmersubsidyportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("http://www.yourarticlelibrary.com/agriculture/agricultural-subsidies-kinds-of-agricultural-subsidies-in-india/40242");

    }
}
