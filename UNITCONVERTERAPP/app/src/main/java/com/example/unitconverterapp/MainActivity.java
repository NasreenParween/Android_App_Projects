package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private TextView output;
    private Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText) findViewById(R.id.editTextId);
        output=(TextView)findViewById(R.id.textViewId);
        convert=(Button)findViewById(R.id.convertId);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul=100;
                double result=0.0;
                double n=Double.parseDouble(input.getText().toString());
                result=n*mul;
                output.setText(Double.toString(result) + " cm");
            }
        });
    }
}