package com.onqanet.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ext_input_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ext_input_name=(EditText)findViewById(R.id.ext_input_name);
    }

    public void createBirthdayCard(View view) {
        if (!ext_input_name.getText().toString().isEmpty()) {
            Intent intent = new Intent(MainActivity.this, BirthdayGreetingActivity.class);
            intent.putExtra("name_extra", ext_input_name.getText().toString());
            startActivity(intent);
        }else {
            ext_input_name.requestFocus();
            ext_input_name.setError("Enter Your Name");
        }
    }
}