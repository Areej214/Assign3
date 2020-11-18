package com.example.assign3;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText emp;
    EditText pwr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emp=(EditText)findViewById(R.id.email);
        pwr=(EditText)findViewById(R.id.pass);
    }
    public void logIn(View v)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("email",emp.getText().toString());
        intent.putExtra("pass", pwr.getText().toString());
        startActivity(intent);
    }
}
