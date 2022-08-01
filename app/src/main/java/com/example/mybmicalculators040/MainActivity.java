package com.example.mybmicalculators040;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btButton1 = findViewById(R.id.btButton1);
        Button btButton2 = findViewById(R.id.btButton2);
        ItemListener listener = new ItemListener();
        btButton1.setOnClickListener(listener);
        btButton2.setOnClickListener(listener);
    }

    private class ItemListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            TextView text1 = findViewById(R.id.etText1);
            TextView text2 = findViewById(R.id.etText2);
            EditText input1 = findViewById(R.id.etNunber1);
            EditText input2 = findViewById(R.id.etNunber2);
            EditText input3 = findViewById(R.id.etNunber3);
            int id = view.getId();
            switch(id) {
                case R.id.btButton1:
                    String inputStr1 = input1.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    String inputStr3 = input3.getText().toString();
                    int number1 = Integer.parseInt(inputStr1);
                    Float number2 = Float.parseFloat(inputStr2);
                    Float number3 = Float.parseFloat(inputStr3);
                    Float sum1 = (number2 / 100) * 2;
                    Float BMI = number3 / sum1;
                    if(BMI < 18.5){
                        text1.setText("低体重(痩せ型)");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(BMI >= 18.5 && BMI < 25){
                        text1.setText("普通体重");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(BMI >= 25 && BMI < 30){
                        text1.setText("肥満(１度)");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(BMI >= 30 && BMI < 35){
                        text1.setText("肥満(２度)");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(BMI >= 35 && BMI < 40){
                        text1.setText("肥満(３度)");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(BMI >= 40){
                        text1.setText("肥満(４度)");
                        text2.setText(String.format("%.1f",22 * sum1));
                        break;
                    }
                    else if(number1 < 16){
                        OrderConfirmDialogFragment dialogFragment = new OrderConfirmDialogFragment();
                        dialogFragment.show(getSupportFragmentManager(), "OrderConfirmDialogFragment");
                        break;
                    }
                case R.id.btButton2:
                    text1.setText("");
                    text2.setText("");
                    input1.setText("");
                    input2.setText("");
                    input3.setText("");
                    break;
            }
        }
    }
}