package com.example.sdfsdf.panda0_1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class kinematicDataGiven extends Activity {
boolean isTwoObjects=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kinematic_data_given);

   }
    public void openSolution(View view) {
        EditText distaceGivenEditText = findViewById(R.id.distanceEditText);
        String distanceGiven = distaceGivenEditText.getText().toString();

        Intent intent = new Intent(this, Solution.class);
intent.putExtra("DISTANCE", distanceGiven);

        startActivity(intent);
    }




}
