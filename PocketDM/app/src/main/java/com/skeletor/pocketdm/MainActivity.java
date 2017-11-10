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

    void toCritTables(View view) {
        Intent critIntent = new Intent(this, CriticalHitTablesActivity.class);
        startActivity(critIntent);
    }
}
