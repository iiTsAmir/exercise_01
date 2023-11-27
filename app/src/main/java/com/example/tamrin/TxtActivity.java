package com.example.tamrin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TxtActivity extends AppCompatActivity {
    int j = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt);

        EditText txtEnter = (EditText) findViewById(R.id.txtEnter);
        Button txtAddBtn = (Button) findViewById(R.id.txtAddBtn);
        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        ArrayList<String> txtArr = new ArrayList<>();

        txtAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = txtEnter.getText().toString();
                StringBuilder output= new StringBuilder();

                txtArr.add(j+". "+input);

                for (int i = 0; i < txtArr.size(); i++) {
                    output.append(txtArr.get(i)).append("\n");
                }

                txtResult.setText(output.toString());
                j++;
                txtEnter.setText("");

            }
        });
    }
}