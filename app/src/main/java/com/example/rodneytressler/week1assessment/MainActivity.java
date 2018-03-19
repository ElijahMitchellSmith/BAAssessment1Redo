package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private EditText mEditText;
    private Button mButton;
    private Button newButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button_submit);
        mTextView = findViewById(R.id.text_view);
        mEditText = findViewById(R.id.edit_text);
        newButton = findViewById(R.id.button_travel);

        startListener();

        goHome();

    }

    private void startListener() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = mEditText.getText().toString();
                mTextView.setText(textInput);
                mEditText.setText("");
                Toast.makeText(MainActivity.this, "Android is Fun!", Toast.LENGTH_SHORT).show();


            }
        });
    }

    private void goHome() {
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTravel();

            }

        });


    }

    private void startTravel() {
        Intent startup = new Intent(this, Main2Activity.class);
        startActivity(startup);

    }
}
