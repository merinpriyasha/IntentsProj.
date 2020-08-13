package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("SecondActivity");
        Intent intent = getIntent();
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextView textViewNumber1 = findViewById(R.id.text_view_number1);
        textViewNumber1.setText("Number 1:     " + number1);
        TextView textViewNumber2 = findViewById(R.id.text_view_number2);
        textViewNumber2.setText("Number 2:     " + number2);

        Button buttonAdd = findViewById(R.id.button_add);
        Button buttonSubstract = findViewById(R.id.button_substract);
        Button buttonMulti = findViewById(R.id.button_multi);
        Button buttonDevi = findViewById(R.id.button_devision);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t1 = (TextView) findViewById(R.id.text_view_result);

                int sum = number1 + number2;

                t1.setText(Integer.toString(number1)+"+"+Integer.toString(number2)+"="+Integer.toString(sum));
            }
        });

        buttonSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t1 = (TextView) findViewById(R.id.text_view_result);

                int sum = number1 - number2;

                t1.setText(Integer.toString(number1)+"-"+Integer.toString(number2)+"="+Integer.toString(sum));
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t1 = (TextView) findViewById(R.id.text_view_result);

                int sum = number1 * number2;

                t1.setText(Integer.toString(number1)+"*"+Integer.toString(number2)+"="+Integer.toString(sum));
            }
        });

        buttonDevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t1 = (TextView) findViewById(R.id.text_view_result);

                double sum = number1 / number2;

                t1.setText(Integer.toString(number1)+"/"+Integer.toString(number2)+"="+Double.toString(sum));
            }
        });

    }
}