package com.daffaalam.rukunislamiman;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = (TextView) findViewById(R.id.judul_det);
        WebView webView = (WebView) findViewById(R.id.web_view_det);

        Intent dapat = getIntent();
        String data = dapat.getStringExtra("JUDUL");

        textView.setText(data);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.loadUrl("file:///android_asset/" + data + "/" + data + ".html");

    }
}
