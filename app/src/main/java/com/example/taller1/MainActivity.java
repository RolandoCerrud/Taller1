package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    Button sum, rest, mul, div;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.result);
        sum = (Button) findViewById(R.id.sum);
        rest = (Button) findViewById(R.id.rest);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Suma();
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resta();
            }
        });

    }

    public boolean getNumbers() {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            Toast.makeText(MainActivity.this,
                    "ERROR-Rellene los campos!", Toast.LENGTH_LONG).show();
            t1.setText("");
            return false;
        } else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }

        return true;
    }
    public void Suma() {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

}