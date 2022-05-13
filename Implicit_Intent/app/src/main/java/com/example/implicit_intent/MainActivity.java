package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText=(EditText)findViewById(R.id.editText);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url=editText.getText().toString();
                Intent intent=new Intent(android.content.Intent.ACTION_SEND);
                String title= "Share";
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,title);
                startActivity(Intent.createChooser(intent,""));
            }

        });
    }
}