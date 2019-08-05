package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ck_grapes,ck_apple;
    Button btn;
    RadioGroup rg_gen;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn=findViewById(R.id.btn);
    ck_apple=findViewById(R.id.ck_apple);
    ck_grapes=findViewById(R.id.ck_grapes);
rg_gen=findViewById(R.id.rg_gen);

ck_grapes.setChecked(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ck_apple.isChecked()&& ck_grapes.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"both checked",Toast.LENGTH_LONG).show();
                }
               else if (ck_apple.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"only apple checked",Toast.LENGTH_LONG).show();
                }
                else if(ck_grapes.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"only grapes checked",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"kuch taa khala",Toast.LENGTH_LONG).show();
                }


                rg_gen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        radioButton=findViewById(i);
                        Toast.makeText(getApplicationContext(),"sdr"+radioButton.getText(),Toast.LENGTH_LONG).show();
                    }
                });





            }
        });

    }
}
