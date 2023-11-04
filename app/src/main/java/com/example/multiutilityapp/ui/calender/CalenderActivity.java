package com.example.multiutilityapp.ui.calender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.multiutilityapp.R;

public class CalenderActivity extends AppCompatActivity {
    private ScaleGestureDetector scaleGestureDetector;
    private float FACTOR = 1.0f;
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        /* //for hiding actionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }*/

        /* // back button in action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_arrow_back);
        actionBar.setDisplayHomeAsUpEnabled(true); */

        Intent intent = getIntent();

        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);

        textView = (TextView)findViewById(R.id.monthName);
        textView.setText(receivedName);

        imageView = (ImageView) findViewById(R.id.monthImage);
        imageView.setImageResource(receivedImage);
        scaleGestureDetector = new ScaleGestureDetector(this,new ScaleListner());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        scaleGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class ScaleListner extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            FACTOR *= detector.getScaleFactor();
            FACTOR = Math.max(0.1f, Math.min(FACTOR, 10.f));
            imageView.setScaleX(FACTOR);
            imageView.setScaleY(FACTOR);
            return true;
        }
    }
}