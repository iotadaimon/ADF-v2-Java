package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemSelectionActivity extends AppCompatActivity {

    private static final String EXTRA_ITEM = "com.example.twoactivitieschallenge.extra.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selection);
    }

    public void addItem(View view) {
        String itemName = ((Button) view).getText().toString();

        Intent resultIntent = new Intent();
        resultIntent.putExtra(EXTRA_ITEM, itemName);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}