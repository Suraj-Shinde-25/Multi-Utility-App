package com.example.multiutilityapp.ui.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.multiutilityapp.R;

public class CalenderActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        //for hiding actionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Intent intent = getIntent();

        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);

        textView = (TextView)findViewById(R.id.monthName);
        textView.setText(receivedName);

        ImageView imageView = (ImageView) findViewById(R.id.monthImage);
        imageView.setImageResource(receivedImage);
    }
}