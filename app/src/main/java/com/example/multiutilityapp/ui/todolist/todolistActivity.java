package com.example.multiutilityapp.ui.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.multiutilityapp.R;

import org.mozilla.javascript.Context;

public class todolistActivity extends AppCompatActivity {
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        /* // for hiding action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        } */

        tv = (TextView) findViewById(R.id.textView2);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this::suraj);

    }
    public void suraj(View v){
        tv.setText("TOODLIST");
    }

}