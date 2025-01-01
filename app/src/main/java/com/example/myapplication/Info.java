package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);

        Intent reciveData=getIntent();
        String NAME = reciveData.getStringExtra("name");
        String FAMILY = reciveData.getStringExtra("family");
        String AGE = reciveData.getStringExtra("age");

        TextView txtNAME=findViewById(R.id.TextViewNAME);
        TextView txtFAMILY=findViewById(R.id.TextViewFAMILY);
        TextView txtAGE=findViewById(R.id.TextViewAGE);

        txtNAME.setText(NAME);
        txtFAMILY.setText(FAMILY);
        txtAGE.setText(AGE);
        Intent intent = new Intent(Info.this, RecyclerActivity.class);


        ArrayList<String> data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");
        data.add("Item 4");
        data.add("Item 5");
        data.add("Item 6");
        data.add("Item 7");
        data.add("Item 8");

        intent.putStringArrayListExtra("data", data);


        startActivity(intent);


    }
}