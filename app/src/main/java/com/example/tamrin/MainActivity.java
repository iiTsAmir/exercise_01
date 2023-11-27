package com.example.tamrin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        Button LoginBtn = (Button) findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                if ((username.getText().toString()).equals("") || (password.getText().toString()).equals(""))
                    error("pleas fill the boxes!");
                else if ((username.getText().toString()).equals("admin") && (password.getText().toString()).equals("admin")) {
                    Goto(CalculateActivity.class,username.getText().toString());
                } else if ((username.getText().toString()).equals("user1") && (password.getText().toString()).equals("1111")) {
                    Goto(CalculateActivity.class,username.getText().toString());
                } else if ((username.getText().toString()).equals("user2") && (password.getText().toString()).equals("2222")) {
                    Goto(TxtActivity.class,username.getText().toString());
                } else error("username or password wrong!");
            }
        });
    }

    private void error(String txt) {
        Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
    }

    private void Goto (Class<?> destination,String extra) {
        Intent i=new Intent(MainActivity.this, destination);
        i.putExtra("username", extra);
        startActivity(i);
    }


}