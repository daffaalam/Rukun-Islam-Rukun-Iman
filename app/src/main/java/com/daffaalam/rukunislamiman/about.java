package com.daffaalam.rukunislamiman;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String versi = BuildConfig.VERSION_NAME;
        TextView ver = (TextView) findViewById(R.id.versi);
        ver.setText("Version : " + versi);

        WebView tx_about = (WebView) findViewById(R.id.text_about);
        tx_about.setBackgroundColor(Color.TRANSPARENT);
        tx_about.loadUrl("file:///android_asset/about.html");

    }

    public void send_mail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "smk_daffa@rbs.sch.id", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback Rukun Islam dan Iman");
        startActivity(Intent.createChooser(emailIntent, "Feedback"));
    }

    public void maps(View view) {
        Uri url_map = Uri.parse("https://goo.gl/maps/gdJsH8tKQu42");
        Intent open_map = new Intent(Intent.ACTION_VIEW, url_map);
        startActivity(open_map);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:082299368783");
        Intent calls = new Intent(Intent.ACTION_DIAL, number);
        startActivity(calls);
    }
}
