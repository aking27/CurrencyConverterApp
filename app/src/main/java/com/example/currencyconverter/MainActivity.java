package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){

        Log.i("info","Button pressed");
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String inputString = myTextField.getText().toString();
        double num = Double.parseDouble(inputString);
        //109.85 is the current exchange rate for USD to Yen
        String convertedCurrency = Double.toString(num * 109.85);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(convertedCurrency);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
