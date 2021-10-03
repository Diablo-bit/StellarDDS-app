package com.example.stellarddsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class accounts extends AppCompatActivity {

    private EditText searchBAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts_page);

        searchBAR = (EditText)findViewById(R.id.search_box);
        searchBAR.setShowSoftInputOnFocus(true);

        searchBAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("Search".equals(searchBAR.getText().toString()))
                {
                    searchBAR.setText("");
                }
            }
        });

    }
}