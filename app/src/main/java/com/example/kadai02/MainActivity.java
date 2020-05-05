package com.example.kadai02;

import androidx.appcompat.app.AppCompatActivity;
import  android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText editText =(EditText) findViewById(R.id.edit_message);
        TextView textView = (TextView) findViewById(R.id.view_message);
        String message = editText.getText().toString();
        textView.setText(message);
    }
}
