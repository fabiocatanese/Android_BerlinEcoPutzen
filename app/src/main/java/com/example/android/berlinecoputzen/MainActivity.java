package com.example.android.berlinecoputzen;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tx = (TextView)findViewById(R.id.my_text);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Lobster_1.3.otf");

        tx.setTypeface(custom_font);


        TextView tx2 = (TextView)findViewById(R.id.my_text2);

        Typeface custom_font2 = Typeface.createFromAsset(getAssets(),"fonts/Lobster_1.3.otf");

        tx2.setTypeface(custom_font2);


        TextView tx3 = (TextView)findViewById(R.id.my_text3);

        Typeface custom_font3 = Typeface.createFromAsset(getAssets(),"fonts/Lobster_1.3.otf");

        tx3.setTypeface(custom_font3);


    }
}
