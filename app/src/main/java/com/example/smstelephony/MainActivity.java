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
    EditText phoneno;
    String phone_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.button);
        sms = findViewById(R.id.button2);
        phoneno = findViewById(R.id.editText3);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_no = phoneno.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone_no, null));
                startActivity(i);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_no = phoneno.getText().toString();
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("smsto", phone_no, null));
                startActivity(i);
            }
        });
    }
}
