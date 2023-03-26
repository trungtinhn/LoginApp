package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    private ListUser list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        list = new ListUser();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(Acount user: list.listUser)
                {
                    if(usernameEditText.getText().toString().equals(user.username.toString())
                    && passwordEditText.getText().toString().equals(user.password.toString())){
                        Toast.makeText(MainActivity.this, "Login Successed", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Infomation User Wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}