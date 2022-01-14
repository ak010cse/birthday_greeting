package com.onqanet.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {
    TextView txt_birthday_greeting;
    String birthdayName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        birthdayName =getIntent().getExtras().getString("name_extra");
        txt_birthday_greeting=(TextView)findViewById(R.id.txt_birthday_greeting);

        txt_birthday_greeting.setText("Happy Birthday"+"\n"+birthdayName);

    }
}