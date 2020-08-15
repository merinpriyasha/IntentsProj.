package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView textViewNumber1 = findViewById(R.id.text_view_num1);
        textViewNumber1.setText("Number 1:     " );
        mEditTextNumber1 = findViewById(R.id.edit_text_num1);

        TextView textViewNumber2 = findViewById(R.id.text_view_num2);
        textViewNumber2.setText("Number 2:     " );
        mEditTextNumber2 = findViewById(R.id.edit_text_num2);

        Button buttonOpenActivity2 = findViewById(R.id.button_ok);
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEditTextNumber1.getText().toString().equals("")|| mEditTextNumber2.getText().toString().equals("")){
                    Toast.makeText(FirstActivity.this, "Please insert numbers", Toast.LENGTH_SHORT).show();
                }else{

                    Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                    CharSequence message = "Sending Massage";
                    //Display string
                    int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                    Toast toast = Toast.makeText(context, message, duration); toast.show();

                    int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                    int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());

                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra("number1", number1);
                    intent.putExtra("number2", number2);
                    startActivityForResult(intent, 1);

                }
            }
        });

    }
}