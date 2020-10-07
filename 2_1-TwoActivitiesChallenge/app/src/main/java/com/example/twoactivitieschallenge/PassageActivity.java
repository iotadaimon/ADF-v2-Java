package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);

        TextView scrollViewPassage = findViewById(R.id.scrollview_passage);

        Intent intent = getIntent();
        int passageID = intent.getIntExtra(MainActivity.EXTRA_PASSAGE_ID, -1);
        String passage = getResources().getStringArray(R.array.passages)[passageID];
        scrollViewPassage.setText(passage);
    }
}