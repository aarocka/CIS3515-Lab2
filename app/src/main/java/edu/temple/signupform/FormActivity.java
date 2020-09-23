package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                //check if user has entered required fields
                if (nameField.getText().toString().matches("")||
                        emailField.getText().toString().matches("")||
                        passwordField.getText().toString().matches("")||
                        passwordField2.getText().toString().matches("")
                ){
                    Context context = getApplicationContext();

                    CharSequence text = "Ensure all required forms are filled";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {//forms must be filled to get to this block of code
                    //check if password and password2 match
                    if (passwordField.getText().toString().matches(passwordField2.getText().toString())) {

                    }else {//runs if the password fields mismatch

                    }
                }

            }
        });


    }
}