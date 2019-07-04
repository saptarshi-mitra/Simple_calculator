package com.iamsm.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1,b2;
    int count=0;
    Double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.etext1);
        e2=findViewById(R.id.etext2);
        e3=findViewById(R.id.etext3);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
    }

    public void mode_select(View  view)
    {
        try {

            count++;
            if (count == 1) {
                add(view);
                b1.setText("MODE ADDITION");
            } else if (count == 2) {
                sub(view);
                b1.setText("MODE SUBTRACTION");
            } else if (count == 3) {
                mul(view);
                b1.setText("MODE MULTIPLICATION");
            } else {
                div(view);
                b1.setText("MODE DIVISION");
                count = 0;
            }
        }
        catch(Exception e) {
            Toast.makeText(this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
        }
    }


    public void add(View view)
    {
        String s1=String.valueOf(e1.getText());
        String s2=String.valueOf(e2.getText());
        Double num1,num2;
        num1=Double.valueOf(s1);
        num2=Double.valueOf(s2);
        ans=num1+num2;


    }

    public void sub(View view)
    {
        String s1=String.valueOf(e1.getText());
        String s2=String.valueOf(e2.getText());
        Double num1,num2;
        num1=Double.valueOf(s1);
        num2=Double.valueOf(s2);
        ans=num1-num2;

    }

    public void mul(View view)
    {
        String s1=String.valueOf(e1.getText());
        String s2=String.valueOf(e2.getText());
        Double num1,num2;
        num1=Double.valueOf(s1);
        num2=Double.valueOf(s2);
        ans=num1*num2;

    }

    public void div(View view)
    {
        String s1=String.valueOf(e1.getText());
        String s2=String.valueOf(e2.getText());
        Double num1,num2;
        num1=Double.valueOf(s1);
        num2=Double.valueOf(s2);
        ans=num1/num2;

    }

    public void disp (View view)throws Exception
    {
        try{e3.setText(Double.toString(ans));}
        catch(Exception e){
            Toast.makeText(this, "Please Press Mode Button", Toast.LENGTH_SHORT).show();
        }
    }
}