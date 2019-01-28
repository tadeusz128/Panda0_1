package com.example.sdfsdf.panda0_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Solution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        Intent intent = getIntent();
        String message = intent.getStringExtra("DISTANCE");

        TextView distanceTextView = findViewById(R.id.valueDistance);
        distanceTextView.setText(message);
    }
}
