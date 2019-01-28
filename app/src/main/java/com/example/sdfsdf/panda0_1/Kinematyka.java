package com.example.sdfsdf.panda0_1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Kinematyka extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinematyka);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


    }
    public void backToMainIntent(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void openAccelerationZero(View view) {
        Intent intent = new Intent(this, AccelerationZero.class);


        startActivity(intent);
    }

    public void opena(View view) {
        Intent intent = new Intent(this, AccelerationZero.class);


        startActivity(intent);
    }


}
