package com.example.gameswicher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class P15shki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p15shki);
        Intent intent=this.getIntent();
        ((TextView)findViewById(R.id.transferView)).setText(intent.getStringExtra("Key15"));
    }
}