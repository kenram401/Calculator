package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextFirstNumber, editTextSecondNumber;
    Button buttonAdd,buttonSub;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNumber=findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber=findViewById(R.id.editTextSecondNumber);
        buttonAdd=findViewById(R.id.btnAdd);
        buttonSub=findViewById(R.id.btnSubtract);
        textViewResult=findViewById((R.id.Result));

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstnum=editTextFirstNumber.getText().toString();
                String secondnum=editTextSecondNumber.getText().toString();
                int sum=Integer.parseInt(firstnum)+Integer.parseInt(secondnum);
                String result=Integer.toString(sum);
                textViewResult.setText("Sum= "+result);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstnum=editTextFirstNumber.getText().toString();
                String secondnum=editTextSecondNumber.getText().toString();
                int diff=Integer.parseInt(firstnum)-Integer.parseInt(secondnum);
                String result=Integer.toString(diff);
                textViewResult.setText("Difference= "+result);

            }
        });
    }
}
