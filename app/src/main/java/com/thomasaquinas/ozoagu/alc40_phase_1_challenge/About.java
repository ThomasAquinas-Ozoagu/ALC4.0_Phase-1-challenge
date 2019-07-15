package com.thomasaquinas.ozoagu.alc40_phase_1_challenge;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {
    private WebView andela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        andela = (WebView) findViewById(R.id.about_andela);
        // andela.loadUrl("https://andela.com/alc/");

        // Enable Javascript
        WebSettings webSettings = andela.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Clear SSL error
        andela.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });
        andela.loadUrl("www.google.com");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


/*
    @Override
    public void onBackPressed(){
        if(andela.canGoBack()) {
            andela.goBack();
        }else {
            super.onBackPressed();
        }
    }  */


    }




