package com.example.group5_as2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button RandomButton = null;
    EditText Name = null;
    TextView Output = null;
    int RandomNumber = 0;
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RandomButton = (Button)findViewById(R.id.Button);
        Name = (EditText)findViewById(R.id.Name);
        Output = (TextView)findViewById(R.id.Output);
        Intent intent = new Intent(this, SecondActivity.class);



        RandomButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    RandomNumber = (int)(Math.random()*(6-1+1))+1;
//                    Output.setText(Name.getText().toString() + " got number: " + RandomNumber + "\n");

                    String message = Name.getText().toString() + " got number: " + RandomNumber + "\n";
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }

            }
        );
    }
}