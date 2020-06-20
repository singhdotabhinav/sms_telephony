package com.example.smstelephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button phone;
    Button sms;
    Button web;
    EditText editText;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.dialer);
        sms = findViewById(R.id.messaging);
        web = findViewById(R.id.browse);
        editText = findViewById(R.id.editText3);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = editText.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", data, null));
                startActivity(i);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = editText.getText().toString();
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("smsto", data, null));
                startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = editText.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.fromParts("http", data, null));
                startActivity(i);
            }
        });
    }
}
