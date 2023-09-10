package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    Button ansBut,again;
    TextView answer;
    EditText getValue;
    RadioButton c2f,f2c;
    Double x;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ansBut=(Button) findViewById(R.id.ansBut);
        answer=(TextView) findViewById(R.id.answer);
        getValue=(EditText) findViewById(R.id.getValue);
        c2f=(RadioButton) findViewById(R.id.c2f);
        f2c=(RadioButton) findViewById(R.id.f2c);
        again=(Button) findViewById(R.id.again);

        ansBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getValue.getText().toString().isEmpty()){
                    answer.setText("ENTER TEMPERATURE");
                }
                else {
                    x= Double.parseDouble(String.valueOf(getValue.getText()));

                    if(c2f.isChecked()){

                        x=(x*9)/5+32;




                        answer.setText(String.valueOf(x) + "Degree F");

                    } else if (f2c.isChecked()) {

                        x= (x-32)*5/9;

                        answer.setText(String.valueOf(x) + "Degree C");
                    }

                        else {
                            answer.setText("please select an option !");
                    }


                }

            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("0.0");
                getValue.setText("");
                c2f.setChecked(false);
                f2c.setChecked(false);
            }
        });




    }

}