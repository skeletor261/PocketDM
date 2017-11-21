package com.skeletor.pocketdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import com.skeletor.pocketdm.tables;

public class CriticalHitTablesActivity extends AppCompatActivity {

    // Sets a class variable reference to the EditText input View object
    final EditText rollInput = (EditText) findViewById(R.id.rollInput);

    // Sets a class variable reference to the TextView output View object
    final TextView resultText = (TextView) findViewById(R.id.resultText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.critical_hit_tables);
    }

    // Determines which weapon button is pressed
    void onButtonClick(View weaponButton) {

        // Receive the value input for the percentile roll
         int rollValue = Integer.parseInt(rollInput.getText().toString());

        // Check for rollValue > 100 or < 1 and return error message if true

        // Creates an empty HashMap for importing crit tables
        Map<Integer, String> weaponTable = new HashMap<Integer, String>() {};

        // Determines which weapon button is pressed and imports the corresponding table
        switch(weaponButton.getId()) {
            case R.id.slashingButton :
                weaponTable = critTable.getTable("slashingTable");
                break;
            case R.id.bludgeoningButton :
                weaponTable = critTable.getTable("bludgeoningTable");
                break;
            case R.id.piercingButton :
                weaponTable = critTable.getTable("piercingTable");
                break;
            case R.id.magicButton :
                weaponTable = critTable.getTable("magicTable");
                break;
        }

        // Search the selected table for the key <= rollInput
        while (!weaponTable.containsKey(rollValue)){
            rollValue --;
        }

        // Print the result from the table to the screen
        resultText.setText(weaponTable.get(rollValue));
    }
}
