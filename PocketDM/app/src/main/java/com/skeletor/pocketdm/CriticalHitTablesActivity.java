package com.skeletor.pocketdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class CriticalHitTablesActivity extends AppCompatActivity {

    // Class Variables
    //
    // View Objects
    private EditText rollInput;
    private TextView resultText;
    //
    // Values
    private Integer rollValue;
    //
    // Creates an empty HashMap for importing crit tables
    private Map<Integer, String> weaponTable = new HashMap<Integer, String>() {};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.critical_hit_tables);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set View objects to class instances
        rollInput = (EditText) findViewById(R.id.rollInput);
        resultText = (TextView) findViewById(R.id.resultText);
    }

    // Determines which weapon button is pressed
    public void onButtonClick(View weaponButton) {

        try {
            // Receive the value input for the percentile roll
            rollValue = Integer.parseInt(rollInput.getText().toString());
        } catch(NumberFormatException | NullPointerException e){
            // If the input string was not an integer this exception will be caught
            resultText.setText("Please enter a valid percentile roll.");
            return;
        }
        
        // Check for rollValue > 100 or < 1 and return error message if true
        if (rollValue < 1 || rollValue > 100) {
            resultText.setText("Please enter a valid percentile roll.");
            return;
        }

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
