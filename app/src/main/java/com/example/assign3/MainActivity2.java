package com.example.assign3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {
    String emails[] = {"abc@gmail.com", "def@gmail.com", "ghi@gmail.com", "jkl@gmail.com", "mno@gmail.com", "pqr@gmail.com", "stu@gmail.com", "vwx@gmail.coma", "yza@gmail.com", "areej@gmail.com"};
    int Passwords[] = {123, 345, 567, 789, 901, 111, 113, 114, 115, 116};
    TextView message;
    TextView message1;
    TextView message2;
    String[] alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setContentView(R.layout.activity_main2);
        message = (TextView) findViewById(R.id.msg);
        message1 = (TextView) findViewById(R.id.msg1);
        message2 = (TextView) findViewById(R.id.msg2);
        Intent intent = getIntent();
        String e = intent.getStringExtra("email");
        String p = intent.getStringExtra("pass");
        for (int i = 0; i < emails.length; i++)
            if ((e.matches(emails[i])) && (p.matches(String.valueOf(Passwords[i])))) {
                alpha = getResources().getStringArray(R.array.alphabets);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alpha);
                GridView gridview = (GridView) findViewById(R.id.gridView1);
                gridview.setAdapter(adapter);
                gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent in = new Intent(MainActivity2.this, MainActivity3.class);
                        in.putExtra("alpha", alpha[position]);

                        startActivity(in);
                    }

                });
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "PLEASE ENTER VALID NUMBERS", Toast.LENGTH_LONG);
                toast.setMargin(50, 50);
                toast.show();
            }
    }
}



