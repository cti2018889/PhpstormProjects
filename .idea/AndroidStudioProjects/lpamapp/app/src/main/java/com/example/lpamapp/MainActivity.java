package com.example.lpamapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.nio.file.WatchEvent;

public class MainActivity extends AppCompatActivity {
    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings=mywebview.getSettings();
        mywebview.loadUrl("https://files.000webhost.com/");
        webSettings.setJavaScriptEnabled(true);
    }
    public class myWebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view , String url){
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed (){
        if (mywebview.canGoBack()) {
            mywebview.goBack();
        } else{
            super.onBackPressed();
        }
    }

}
