package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_PASSAGE_ID = "PASSAGE_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonOneClick(View view) {
        launchPassageActivity(0);
    }

    public void onButtonTwoClick(View view) {
        launchPassageActivity(1);
    }

    public void onButtonThreeClick(View view) {
        launchPassageActivity(2);
    }

    private void launchPassageActivity(int passageNumber){
        Intent intent = new Intent(this, PassageActivity.class);
        intent.putExtra(EXTRA_PASSAGE_ID, passageNumber);
        startActivity(intent);
    }
}