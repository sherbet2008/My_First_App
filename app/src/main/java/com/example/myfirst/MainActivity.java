package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editEmail;
    private EditText editPassword;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        editEmail = findViewById(R.id.Edit_txt);
        editPassword = findViewById(R.id.editPassword);
        textView = findViewById(R.id.txtView2);
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
    }

    public void onClick(View view) {
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();
        if (email.isEmpty() || password.isEmpty()) {
            textView.setText(R.string.errors_email);
        } else {
            textView.setText(R.string.email_successfully);
        }

    }
}
