package com.example.assign3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    String Countries[]={"Austria","Argentina","Australia","Algeria","Armenia","Bhutan","Bangladesh","Brazil",
            "Belgium","Bahrain","China","Canada","Colombia","Cuba","Cambodia","Denmark","Dominica","Djibouti",
            "Dominican Republic","Duchy of Parma","Ethopia","Estonia","Egypt","Ecuadoe","Eritrea","Finland",
            "Fiji","Faroe Islands","Falkland Islands","French Guiana","Germany","Greece","Georgia","Ghana",
            "Grenada","Haiti","Honduras","Hungary","Holy See","Hanover","Iran","Iraq","Indonesia","Ireland","Iceland",
            "Japan","Jordan","Jamaica","Kenya","Kazakhstan","Kyrgystan","Kuwait","Kiribati","Libya","Lebanon","Liberia",
            "Lativa","Laos","Mexico","Morocco","Malaysia","Mali","Malta","Nigeria","Nepal","Niger","Netherlands",
            "New Zealand","Oman","Orange Free State","Oldenburg","Pakistan","Poland","Portugal","Philippines",
            "Peru","Qatar","Russia","Romania","Rwanda","Spain","Sudan","Sri Lanka","Saudia Arabia","Sweden","Turkey",
            "Thailand","Togo","Tajikistan","Tunisia","Uganda","Ukraine","Uzbekistan","USA","UK","Vietnam","Venezuela",
            "Vanuatu","Wurttemberg","No country with X","Yemen","Zambia","Zimbabwe"};
    TextView C;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String A = getIntent().getStringExtra("alpha");

        C = (TextView) findViewById(R.id.Country);

        ArrayAdapter<String> adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,Countries);
        ListView listview=(ListView) findViewById(R.id.ListView1);
        for(String i : Countries)
        {
            if(i.startsWith(A)){
                C.append(i +"\n");
            }
        }
    }
}
