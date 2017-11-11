package com.skeletor.pocketdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CriticalHitTablesActivity extends AppCompatActivity {

    final EditText rollInput = (EditText) findViewById(R.id.rollInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.critical_hit_tables);
    }

    void onButtonClick(View weaponButton) {
        int rollValue = Integer.parseInt(rollInput.getText().toString());
    }
}
