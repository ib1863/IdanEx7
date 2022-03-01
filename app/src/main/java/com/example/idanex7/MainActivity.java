package com.example.idanex7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView randNum1;
    TextView randNum2;
    TextView randNum3;
    TextView randNum4;
    TextView randNum5;
    TextView randNum6;
    EditText enterNum1;
    EditText enterNum2;
    EditText enterNum3;
    ImageView VorX1;
    ImageView VorX2;
    ImageView VorX3;
    Button clicktocheck1;
    Button clicktocheck2;
    Button clicktocheck3;
    Button refresh;
    int rndNum1;
    int rndNum2;
    int rndNum4;
    int rndNum6;
    String showRndNum1;
    String showRndNum2;
    String showRndNum3;
    String showRndNum4;
    String showRndNum5;
    String showRndNum6;
    String editTextInput = " ";
    int editTextInt = 0;
    int count = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randNum1 =  findViewById(R.id.txV1);
        randNum2 = findViewById(R.id.txV2);
        randNum3 =  findViewById(R.id.txV3);
        randNum4 =  findViewById(R.id.txV4);
        randNum5 =  findViewById(R.id.txV5);
        randNum6 =  findViewById(R.id.txV6);
        enterNum1 = findViewById(R.id.edT1);
        enterNum2 = findViewById(R.id.edT2);
        enterNum3 = findViewById(R.id.edT3);
        VorX1 = findViewById(R.id.imV1);
        VorX2 = findViewById(R.id.imV2);
        VorX3 = findViewById(R.id.imV3);
        clicktocheck1 = findViewById(R.id.Btn1);
        clicktocheck2 = findViewById(R.id.Btn2);
        clicktocheck3 = findViewById(R.id.Btn3);
        refresh = findViewById(R.id.Btn4);


        rndNum1 = (int)(Math.random() * 90) + 10;
        rndNum2 = (int)(Math.random() * 90) + 10;


        showRndNum1 = Integer.toString(rndNum1);
        showRndNum2 = Integer.toString(rndNum2);

        randNum2.setText(showRndNum1);
        randNum5.setText(showRndNum2);

        clicktocheck2.setEnabled(false);
        clicktocheck3.setEnabled(false);



    }
    public void check1(View view) {
        editTextInput = enterNum1.getText().toString();

        editTextInt = Integer.parseInt(editTextInput);


        if(editTextInt == rndNum1+rndNum2)
        {
            VorX1.setImageResource(R.drawable.v);
            count++;
        }
        else
        {
            VorX1.setImageResource(R.drawable.x);
        }


        rndNum4 = (int)(Math.random() * 90) + 10;


        showRndNum3 = Integer.toString(rndNum1+rndNum2);
        showRndNum4 = Integer.toString(rndNum4);

        randNum1.setText(showRndNum3);
        randNum4.setText(showRndNum4);
        clicktocheck1.setEnabled(false);
        clicktocheck2.setEnabled(true);
    }

    public void check2(View view)
    {

        editTextInput = enterNum3.getText().toString();
        editTextInt = Integer.parseInt(editTextInput);

        if(editTextInt == rndNum1+rndNum2+rndNum4)
        {
            VorX2.setImageResource(R.drawable.v);
            count++;
        }
        else
        {
            VorX2.setImageResource(R.drawable.x);
        }
        rndNum6 = (int)(Math.random() * 90) + 10;


        showRndNum5 = Integer.toString(rndNum1+rndNum2+rndNum4);
        showRndNum6 = Integer.toString(rndNum6);

        randNum3.setText(showRndNum5);
        randNum6.setText(showRndNum6);

        clicktocheck3.setEnabled(true);
        clicktocheck2.setEnabled(false);
    }

    public void check3(View view) {

        editTextInput = enterNum2.getText().toString();

        int editTextInt = Integer.parseInt(editTextInput);
        if(editTextInt == rndNum1+rndNum2+rndNum4+rndNum6)
        {
            VorX3.setImageResource(R.drawable.v);
            count++;
        }
        else
        {
            VorX3.setImageResource(R.drawable.x);
        }

        int ahozim = (count*100)/3;
        Toast.makeText(this, "You got" + " " + count + " " +  "out of 3" + " " + ahozim + "%" , Toast.LENGTH_SHORT).show();
        clicktocheck3.setEnabled(false);

    }

    public void refresh(View view) {
        count = 0;
        enterNum1.setText("");;
        enterNum2.setText("");;
        enterNum3.setText("");;
        randNum1.setText("");
        randNum2.setText("");
        randNum3.setText("");
        randNum4.setText("");
         randNum5.setText("");
         randNum6.setText("");
         VorX1.setImageResource(0);
         VorX2.setImageResource(0);
         VorX3.setImageResource(0);
        rndNum1 = (int)(Math.random() * 90) + 10;
        rndNum2 = (int)(Math.random() * 90) + 10;


        showRndNum1 = Integer.toString(rndNum1);
        showRndNum2 = Integer.toString(rndNum2);

        randNum2.setText(showRndNum1);
        randNum5.setText(showRndNum2);
        clicktocheck2.setEnabled(false);
        clicktocheck3.setEnabled(false);
        clicktocheck1.setEnabled(true);
    }
}
