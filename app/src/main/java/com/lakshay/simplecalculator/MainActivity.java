package com.lakshay.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    EditText val1ET;
    EditText val2ET;
    TextView result;
    TextView operator;
    String val1;
    String val2;

    private void initialize()
    {
        val1ET = (EditText) findViewById(R.id.value1);
        val2ET = (EditText) findViewById(R.id.value2);
        result = (TextView) findViewById(R.id.result);
        operator = (TextView) findViewById(R.id.operator);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }


    private void getValues()
    {
        val1 = val1ET.getText().toString();
        val2 = val2ET.getText().toString();
    }

    public void add(View view) {
        getValues();
        operator.setText("+");
        try {
            Double ans = Double.parseDouble(val1) + Double.parseDouble(val2);
            result.setText("" + ans);
        } catch (Exception e) {
            return;
        }
    }

    public void sub(View view) {
        getValues();
        operator.setText("-");
        try {
            Double ans = Double.parseDouble(val1) - Double.parseDouble(val2);
            result.setText("" + ans);
        } catch (Exception e) {
            return;
        }
    }

    public void mul(View view) {
        getValues();
        operator.setText("*");
        try {
            Double ans = Double.parseDouble(val1) * Double.parseDouble(val2);
            result.setText("" + ans);
        } catch (Exception e) {
            return;
        }
    }

    public void div(View view) {
        operator.setText("/");
        getValues();
        try {
            Double ans = Double.parseDouble(val1) / Double.parseDouble(val2);
            result.setText("" + ans);
        } catch (Exception e) {
            return;
        }
    }

    public void mod(View view) {
        getValues();
        operator.setText("%");
        try {
            Double ans = Double.parseDouble(val1) % Double.parseDouble(val2);
            result.setText("" + ans);
        } catch (Exception e) {
            return;
        }
    }

    public void clear(View view)
    {
        operator.setText("");
        result.setText("");
        val1ET.setText("");
        val2ET.setText("");
    }
}