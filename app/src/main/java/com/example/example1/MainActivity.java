package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName ;
    private EditText edtPassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtPassword =  findViewById(R.id.edtPassword);
    }

    public void btnSubmitOnClick(View view) {
       String Name = edtName.getText().toString();
       String Pass = edtPassword.getText().toString();

        Toast.makeText(this,"Username : " +Name +"\nPassword : " +Pass ,Toast.LENGTH_SHORT).show();
    }
}