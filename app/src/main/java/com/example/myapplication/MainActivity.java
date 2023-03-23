package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    RadioButton add, sub, mult, div;
    Button submit;
    EditText a, b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (RadioButton) findViewById(R.id.add);
        mult = (RadioButton) findViewById(R.id.mult);
        sub = (RadioButton) findViewById(R.id.sub);
        div = (RadioButton) findViewById(R.id.div);
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        TextView output = (TextView) findViewById(R.id.result);
        submit = (Button) findViewById(R.id.submitButton);
        final int[] result = {0};
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a1 = a.getText().toString();
                String b1 = b.getText().toString();
                if (add.isChecked()) {
                    result[0] = Integer.parseInt(a1.toString()) + Integer.parseInt(b1.toString());
                } else if (mult.isChecked()) {
                    result[0] = Integer.parseInt(a1.toString()) * Integer.parseInt(b1.toString());
                } else if (sub.isChecked()) {
                    result[0] = Integer.parseInt(a1.toString()) - Integer.parseInt(b1.toString());
                } else if (div.isChecked()) {
                    result[0] = Integer.parseInt(a1.toString()) / Integer.parseInt(b1.toString());
                }
                output.setText(String.valueOf(result[0]));
                Toast.makeText(getApplicationContext(), String.valueOf(result[0]), Toast.LENGTH_LONG).show();
            }

        });
    }


}