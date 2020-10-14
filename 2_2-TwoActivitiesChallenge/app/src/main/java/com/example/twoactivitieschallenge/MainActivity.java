package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new TextView[10];
        items[0] = findViewById(R.id.textView1);
        items[1] = findViewById(R.id.textView2);
        items[2] = findViewById(R.id.textView3);
        items[3] = findViewById(R.id.textView4);
        items[4] = findViewById(R.id.textView5);
        items[5] = findViewById(R.id.textView6);
        items[6] = findViewById(R.id.textView7);
        items[7] = findViewById(R.id.textView8);
        items[8] = findViewById(R.id.textView9);
        items[9] = findViewById(R.id.textView10);
    }

    public void openItemSelectionActivity(View view) {

    }
}