package com.example.gameswicher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button XO,_15shki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void XOClick(View view) {
        Toast.makeText(this,"XOClick",Toast.LENGTH_SHORT).show();

    }

    public void P15shkiClick(View view) {


        Intent intent=new Intent(this,P15shki.class); //Zapuskator novoy aktivnosti
        intent.putExtra("Key15","P15shki");
        startActivity(intent);
    }
}