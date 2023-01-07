package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {
    Button get_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        get_start=findViewById(R.id.login01);
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        Intent inext;
        inext=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(inext);
    }
}