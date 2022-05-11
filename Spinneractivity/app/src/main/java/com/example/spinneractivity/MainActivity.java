package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    ImageView im;
    String[] option = {"Food_menu","breakfast","lunch","dinner"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        im=(ImageView)findViewById(R.id.imageView);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,option);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);

        sp.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if(sp.getSelectedItemId()==0)
                {
                    im.setImageResource(R.drawable.menu);
                }
                if(sp.getSelectedItemId()==1)
                {
                    im.setImageResource(R.drawable.image1);
                }
                if(sp.getSelectedItemId()==2)
                {
                    im.setImageResource(R.drawable.image3);
                }
                if(sp.getSelectedItemId()==3)
                {
                    im.setImageResource(R.drawable.image2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
//do nothing
            }
        });
    }
}