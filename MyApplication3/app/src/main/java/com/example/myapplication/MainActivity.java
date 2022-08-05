package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView  x=findViewById(R.id.thefirst);
        TextView z=findViewById(R.id.thefourth);
        EditText c=findViewById(R.id.second);
        EditText s=findViewById(R.id.third);
        Button q=findViewById(R.id.fifth);
    }

}