package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bac, bsign, bpc, badd, bsub, bmul, bdiv, beq, bdot;
    private TextView text;
    private TableLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button)findViewById(R.id.n0);
        b1 = (Button)findViewById(R.id.n1);
        b2 = (Button)findViewById(R.id.n2);
        b3 = (Button)findViewById(R.id.n3);
        b4 = (Button)findViewById(R.id.n4);
        b5 = (Button)findViewById(R.id.n5);
        b6 = (Button)findViewById(R.id.n6);
        b7 = (Button)findViewById(R.id.n7);
        b8 = (Button)findViewById(R.id.n8);
        b9 = (Button)findViewById(R.id.n9);
        bac = (Button)findViewById(R.id.ac);
        bsign = (Button)findViewById(R.id.sign);
        bpc = (Button)findViewById(R.id.percent);
        bdiv = (Button)findViewById(R.id.divide);
        bmul = (Button)findViewById(R.id.multiply);
        bsub = (Button)findViewById(R.id.subtract);
        badd = (Button)findViewById(R.id.add);
        beq = (Button)findViewById(R.id.equals);
        bdot = (Button)findViewById(R.id.dot);

        text = (TextView)findViewById(R.id.text);





    }
}