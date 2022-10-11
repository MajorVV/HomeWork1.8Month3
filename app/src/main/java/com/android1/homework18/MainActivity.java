package com.android1.homework18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etTo;
        EditText etObject;
        EditText etMessage;
        Button btnSend;

        etTo = findViewById(R.id.et_to);
        etObject = findViewById(R.id.et_object);
        etMessage = findViewById(R.id.et_message);
        btnSend = findViewById(R.id.btn_send);

       btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, etTo.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT, etObject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, etMessage.getText().toString());
                startActivity(intent);

            }
        });
    }
}

