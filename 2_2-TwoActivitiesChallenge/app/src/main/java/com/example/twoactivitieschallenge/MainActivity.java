package com.example.twoactivitieschallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int ITEM_REQUEST = 1;

    private TextView[] items;
    private int pos = 0;
    private final int MAX_POS = 10;

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
        Intent intent = new Intent(this, ItemSelectionActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemName = data.getStringExtra(ItemSelectionActivity.EXTRA_ITEM);
                addItem(itemName);
            }
        }
    }

    private void addItem(String itemName) {
        if (pos + 1 < MAX_POS) {
            TextView textView = items[pos++];
            textView.setText(itemName);
            textView.setVisibility(View.VISIBLE);
        } else {
            Toast toast = Toast.makeText(this, "Too many items!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}