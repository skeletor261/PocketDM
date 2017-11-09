package com.skeletor.pocketdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    void toCritTables(View v) {
        Intent critIntent = new Intent(MainActivity.this, CriticalHitTablesActivity.class);
        startActivity(critIntent);
        /*TextView welcomeMessage = (TextView) findViewById(R.id.welcomeText);
        welcomeMessage.setText("Fuck off, Android Studio");*/
    }
}
