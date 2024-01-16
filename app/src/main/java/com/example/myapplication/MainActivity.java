package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         num1=(EditText)findViewById(R.id.txt1);
        num2= (EditText)findViewById(R.id.txt1);
     btnAdd = (Button)findViewById(R.id.btn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    int n1 = Integer.parseInt(num1.getText().toString());
                    int n2 = Integer.parseInt(num2.getText().toString());
                    Toast.makeText(getApplicationContext(), "SUM = " + (n1 + n2), Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}