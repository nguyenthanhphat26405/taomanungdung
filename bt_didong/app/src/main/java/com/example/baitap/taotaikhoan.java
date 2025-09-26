package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class taotaikhoan extends AppCompatActivity {

    EditText etFullName, etEmail, etPassword, etConfirmPassword;
    Button btnSignup;
    TextView tvSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taotaikhoan);

        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignup = findViewById(R.id.btnSignup);
        tvSignin = findViewById(R.id.tvSignin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = etPassword.getText().toString();
                String confirm = etConfirmPassword.getText().toString();

                if (pass.equals(confirm)) {
                    Toast.makeText(taotaikhoan.this, "Account Created!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(taotaikhoan.this, MainActivity.class));
                } else {
                    Toast.makeText(taotaikhoan.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(taotaikhoan.this, MainActivity.class));
            }
        });
    }
}
