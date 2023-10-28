package com.example.multiutilityapp.ui.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.multiutilityapp.R;

public class CalenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String receivedText = bundle.getString("key_text");
            int receivedImage = bundle.getInt("key_image");
            ImageView imageView = findViewById(R.id.monthImage);
            imageView.setImageResource(receivedImage);

            TextView myAwesomeTextView = (TextView)findViewById(R.id.monthName);
            myAwesomeTextView.setText("January");

        }


    }
}