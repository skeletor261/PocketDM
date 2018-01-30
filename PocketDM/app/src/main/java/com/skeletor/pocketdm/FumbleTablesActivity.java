package com.skeletor.pocketdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class FumbleTablesActivity extends AppCompatActivity {

    // Class Variables
    //
    // View Objects
    private EditText rollInput;
    private TextView resultText;
    //
    // Values
    private int rollValue;
    //
    // Creates an empty HashMap for importing fumble table
    private Map<Integer, String> valueTable = new HashMap<Integer, String>() {};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fumble_tables);

        // Set View objects to class instances
        rollInput = (EditText) findViewById(R.id.rollInput);
        resultText = (TextView) findViewById(R.id.resultText);
    }

    // Finds the value of the percentile roll in the fumble table
    public void onButtonClick(View goButton) {

        try {
            // Receive the value input for the percentile roll
            rollValue = Integer.parseInt(rollInput.getText().toString());
        } catch(NumberFormatException e){
            // If the input string was not an integer this exception will be caught
            resultText.setText("Please enter a valid percentile roll.");
        }

        // Check for rollValue > 100 or < 1 and return error message if true
        if (rollValue < 1 || rollValue > 100) {
            resultText.setText("Please enter a valid percentile roll.");
            return;
        }

        valueTable = fumbleTable.resultTable;

        // Search the selected table for the key <= rollInput
        while (!valueTable.containsKey(rollValue)){
            rollValue --;
        }

        // Print the result from the table to the screen
        resultText.setText(valueTable.get(rollValue));
    }
}
