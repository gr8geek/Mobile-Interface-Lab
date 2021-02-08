package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('+');
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('-');

            }
        });
        findViewById(R.id.division).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('/');

            }
        });
        findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('*');
            }
        });
        findViewById(R.id.sin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('s');
            }
        });
        findViewById(R.id.cos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('c');

            }
        });
        findViewById(R.id.pow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('p');

            }
        });
        findViewById(R.id.mod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('m');
            }
        });
    }
    public void Operate(char ch){
        try {
            EditText txt1 = (EditText) findViewById(R.id.op1);
            EditText txt2 = (EditText) findViewById(R.id.op2);
            double num1 = Float.parseFloat(txt1.getText().toString());
            double num2 = Float.parseFloat(txt2.getText().toString());
            TextView result = (TextView) findViewById(R.id.Result);
            switch (ch) {
                case '+':
                    result.setText(Double.toString(num1 + num2));
                    break;
                case '-':
                    result.setText(Double.toString(num1 - num2));
                    break;
                case '/':
                    result.setText(Double.toString(num1 / num2));
                    break;
                case '*':
                    result.setText(Double.toString(num1 * num2));
                    break;
                case 's':
                    result.setText(Double.toString(Math.sin(num1)));
                    break;
                case 'c':
                    result.setText(Double.toString(Math.cos(num1)));
                    break;
                case 'p':
                    result.setText(Double.toString(Math.pow(num1,num2)));
                    break;
                case 'm':
                    result.setText(Double.toString((int)(num1)%(int)(num2)));
                    break;

            }
        }
        catch (Exception e){
            Toast.makeText(this,"Please give correct input",Toast.LENGTH_SHORT);
        }
    }
}