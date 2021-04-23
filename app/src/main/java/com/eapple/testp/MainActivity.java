package com.eapple.testp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView name, phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name_is);
        phone = findViewById(R.id.pone);
        email = findViewById(R.id.adress);
        findViewById(R.id.btn_login).setOnClickListener(v -> {
            String n = name.getText().toString().trim();
            String ph = phone.getText().toString().trim();
            String em = email.getText().toString().trim();
            if (n.isEmpty() && ph.isEmpty() && em.isEmpty()) {
                name.setError("Enter right!");
                phone.setError("Enter right!");
                email.setError("Enter right!");
                return;
            } else {
                Toast.makeText(this, "Успешно вошли!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}