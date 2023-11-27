package com.example.tamrin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.util.regex.Pattern;

public class CalculateActivity extends AppCompatActivity {

    TextView CNumber1, CNumber2, CMark, CResult;
    Button CClear, CMultiply, CDivide, CMines, CPlus, C9, C8, C7, C6, C5, C4, C3, C2, C1, C0, CDeci, CEquals;

    boolean num1 = true;
    int mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        CNumber1 = (TextView) findViewById(R.id.CNumber1);
        CNumber2 = (TextView) findViewById(R.id.CNumber2);
        CMark = (TextView) findViewById(R.id.CMark);
        CResult = (TextView) findViewById(R.id.CResult);

        CClear = (Button) findViewById(R.id.CClear);
        CMultiply = (Button) findViewById(R.id.CMultiply);
        CDivide = (Button) findViewById(R.id.CDivide);
        CMines = (Button) findViewById(R.id.CMines);
        CPlus = (Button) findViewById(R.id.CPlus);
        C9 = (Button) findViewById(R.id.C9);
        C8 = (Button) findViewById(R.id.C8);
        C7 = (Button) findViewById(R.id.C7);
        C6 = (Button) findViewById(R.id.C6);
        C5 = (Button) findViewById(R.id.C5);
        C4 = (Button) findViewById(R.id.C4);
        C3 = (Button) findViewById(R.id.C3);
        C2 = (Button) findViewById(R.id.C2);
        C1 = (Button) findViewById(R.id.C1);
        C0 = (Button) findViewById(R.id.C0);
        CDeci = (Button) findViewById(R.id.CDeci);
        CEquals = (Button) findViewById(R.id.CEquals);

        Intent i2 = getIntent();
        Bundle b = i2.getExtras();
        String username = (String) b.get("username");

        if (username.equals("user1")) {
            CMines.setVisibility(View.GONE);
            CDivide.setVisibility(View.GONE);
            CMultiply.setVisibility(View.GONE);

            ConstraintLayout row1 = (ConstraintLayout) findViewById(R.id.row1);

            ConstraintSet set = new ConstraintSet();

            set.constrainPercentHeight(R.id.CPlus, .99f);
            set.constrainPercentWidth(R.id.CPlus, .99f);

            set.applyTo(row1);

        }

        C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "9");
                else
                    CNumber2.setText(CNumber2.getText() + "9");

            }
        });
        C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "8");
                else
                    CNumber2.setText(CNumber2.getText() + "8");

            }
        });
        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "7");
                else
                    CNumber2.setText(CNumber2.getText() + "7");

            }
        });
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "6");
                else
                    CNumber2.setText(CNumber2.getText() + "6");

            }
        });
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "5");
                else
                    CNumber2.setText(CNumber2.getText() + "5");

            }
        });
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "4");
                else
                    CNumber2.setText(CNumber2.getText() + "4");

            }
        });
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "3");
                else
                    CNumber2.setText(CNumber2.getText() + "3");

            }
        });
        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "2");
                else
                    CNumber2.setText(CNumber2.getText() + "2");

            }
        });
        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "1");
                else
                    CNumber2.setText(CNumber2.getText() + "1");

            }
        });
        C0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + "0");
                else
                    CNumber2.setText(CNumber2.getText() + "0");

            }
        });
        CDeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1)
                    CNumber1.setText(CNumber1.getText() + ".");
                else
                    CNumber2.setText(CNumber2.getText() + ".");

            }
        });


        CPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark = 1;
                num1 = false;
                CMark.setText("+");

            }
        });
        CMines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark = 2;
                num1 = false;
                CMark.setText("-");

            }
        });
        CDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark = 3;
                num1 = false;
                CMark.setText("÷");

            }
        });
        CMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mark = 4;
                num1 = false;
                CMark.setText("×");

            }
        });

        CClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CNumber1.setText("");
                CNumber2.setText("");
                CResult.setText("");
                CMark.setText("*");
                num1 = true;

            }
        });

        CEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CNumber2.getText().toString().equals("")||CNumber1.getText().toString().equals("")) {
                    Toast.makeText(CalculateActivity.this, "Enter 2 number", Toast.LENGTH_SHORT).show();
                } else {
                    float x1 = Float.parseFloat(CNumber1.getText().toString());
                    float x2 = Float.parseFloat(CNumber2.getText().toString());

                    switch (mark) {
                        case 1:
                            CResult.setText(chaap(x1 + x2));
                            break;
                        case 2:
                            CResult.setText(chaap(x1 - x2));
                            break;
                        case 3:
                            CResult.setText(chaap(x1 / x2));
                            break;
                        case 4:
                            CResult.setText(chaap(x1 * x2));
                            break;
                        default:
                            Toast.makeText(CalculateActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    private  String chaap (float input){
        String regex = "-?[0-9]+[.]+0*";
        boolean check = !Pattern.matches(regex,input+"");

        if (check)
            return String.valueOf(input);
        else
            return String.format("%.0f", input);
    }
}