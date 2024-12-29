package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edtName = findViewById(R.id.name);
        EditText edtfamily = findViewById(R.id.family);
        EditText edtAge = findViewById(R.id.age);
        Button btn= findViewById(R.id.enter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Sname= edtName.getText().toString();
                String Sfamiy=edtfamily.getText().toString();
                String SAge=edtAge.getText().toString();

                Intent intent=new Intent(MainActivity.this,Info.class);
                intent.putExtra("name",Sname);
                intent.putExtra("family",Sfamiy);
                intent.putExtra("age",SAge);

                startActivity(intent);

            }
        });






    }
}