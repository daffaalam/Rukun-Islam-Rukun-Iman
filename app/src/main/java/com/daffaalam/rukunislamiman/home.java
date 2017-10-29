package com.daffaalam.rukunislamiman;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    RecyclerView rv_islam, rv_iman;
    ArrayList<data> dataArrayList_islam = new ArrayList<>();
    ArrayList<data> dataArrayList_iman = new ArrayList<>();

    String[] islam = {
            "syahadat",
            "shalat",
            "zakat",
            "puasa",
            "haji"
    };
    Integer[] islam_img = {
            R.drawable.syahdat,
            R.drawable.shalat,
            R.drawable.zakat,
            R.drawable.puasa,
            R.drawable.haji
    };

    String[] iman = {
            "allah swt",
            "malaikat",
            "kitab",
            "rasul",
            "kiamat",
            "qadha\' dan qadar"
    };
    Integer[] iman_img = {
            R.drawable.allah,
            R.drawable.no_image,
            R.drawable.alquran,
            R.drawable.rasul,
            R.drawable.no_image,
            R.drawable.no_image
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rv_islam = (RecyclerView) findViewById(R.id.rv_islam);
        rv_islam.setHasFixedSize(true);
        rv_islam.setLayoutManager(new LinearLayoutManager(this));
        rv_islam.setAdapter(new adapter(this, dataArrayList_islam));

        rv_iman = (RecyclerView) findViewById(R.id.rv_iman);
        rv_iman.setHasFixedSize(true);
        rv_iman.setLayoutManager(new LinearLayoutManager(this));
        rv_iman.setAdapter(new adapter(this, dataArrayList_iman));

        for (int urutanIslam = 0; urutanIslam < islam.length; ++urutanIslam) {
            dataArrayList_islam.add(new data(islam[urutanIslam], islam_img[urutanIslam]));
        }
        for (int urutanIman = 0; urutanIman < iman.length; ++urutanIman) {
            dataArrayList_iman.add(new data(iman[urutanIman], iman_img[urutanIman]));
        }

        String versi = BuildConfig.VERSION_NAME;
        TextView ver = (TextView) findViewById(R.id.ver);
        ver.setText("App version : " + versi);

        TextView about = (TextView) findViewById(R.id.about);
        about.setPaintFlags(about.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, about.class));
            }
        });

    }
}
