package com.skeletor.pocketdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CriticalHitTablesActivity extends AppCompatActivity {

    // Sets a class variable reference to the EditText input View object
    final EditText rollInput = (EditText) findViewById(R.id.rollInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.critical_hit_tables);
    }

    // Determines which weapon button is pressed
    void onButtonClick(View weaponButton) {
        
        // Receive the value input for the percentile roll
        int rollValue = Integer.parseInt(rollInput.getText().toString());

        switch(weaponButton.getId()) {
            case R.id.slashingButton :
                // Import slashingTable
                break;
            case R.id.bludgeoningButton :
                // Import bludgeoningTable
                break;
            case R.id.piercingButton :
                // Import piercingTable
                break;
            case R.id.magicButton :
                // Import magicTable
                break;
        }

        // Search the selected table for the key <= rollInput

        // Print the value to resultText
    }
}
