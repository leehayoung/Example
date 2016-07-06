package com.example.ccei.compoundwidget;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageTextCompoundWidget compWidget, compWidget2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compWidget = (ImageTextCompoundWidget) findViewById(R.id.compound_widget);
        compWidget2 = (ImageTextCompoundWidget) findViewById(R.id.compound_widget2);

        Resources res = getResources();
        ImageTextData data1 = new ImageTextData("지연", R.drawable.t_ara_icon_jiyeon);
        ImageTextData data2 = new ImageTextData("보람", R.drawable.t_ara_icon_boram);

        compWidget.setImageText(data1);
        compWidget2.setImageText(data2);
    }
}
