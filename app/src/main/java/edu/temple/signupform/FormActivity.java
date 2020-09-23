package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    EditText nameField;
    EditText emailField;
    EditText passwordField;
    EditText passwordField2;
    Button submissionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the views from the layout
        nameField = findViewById(R.id.editTextName);
        emailField = findViewById(R.id.editTextEmailAddress);
        passwordField = findViewById(R.id.editTextPassword);
        passwordField2 = findViewById(R.id.editTextPassword2);
        submissionButton = findViewById(R.id.submissionButton);

        submissionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


    }
}