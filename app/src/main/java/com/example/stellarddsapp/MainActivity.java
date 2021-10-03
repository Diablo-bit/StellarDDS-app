package com.example.stellarddsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stellarddsapp.pojofile.Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView wrong_pass;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        username = findViewById(R.id.username_box);
        username.setShowSoftInputOnFocus(true);

        username.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.username).equals(username.getText().toString()))
                {
                    username.setText("");
                }
            }
        }));
        password = findViewById(R.id.password_box);
        password.setShowSoftInputOnFocus(true);

        password.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.password).equals(password.getText().toString())) {
                    password.setText("");
                }
            }
        }));

        login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressBar pb = (ProgressBar) findViewById(R.id.Progressbar);
                pb.setVisibility(ProgressBar.VISIBLE);
                String a =  username.getText().toString();
                String b =  password.getText().toString();
                if(a.isEmpty()||b.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter valid credentials",Toast.LENGTH_SHORT);
                }
                else{
                    //validate(username.getText().toString(),password.getText().toString());

                    getdata(a,b);
                }
                pb.setVisibility(ProgressBar.INVISIBLE);
            }
        });

        wrong_pass=(TextView)findViewById(R.id.wrong_password);
        wrong_pass.setText("");
    }

    private void getdata(String a,String b){
        Call<Data> data = ApiClient.getService().getData(a,b);
        data.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Data data = response.body();

                int statusCode = response.code();
                Log.e("Status code", String.valueOf(statusCode));


//                if(response.isSuccessful()||response!=null){
//                    response.body(); // have your all data
//                    String userName = response.body().getName();
//                    Toast.makeText(MainActivity.this, userName, Toast.LENGTH_SHORT).show();
//                }


                Intent intent=new Intent(MainActivity.this, accounts.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void validate(String Username, String Password)
    {
        if ((Username.equals("Agent1")) && (Password.equals("12345")))
        {
            Intent intent=new Intent(MainActivity.this, accounts.class);
            startActivity(intent);
        }

        else
        {
            wrong_pass.setText("Password or username is incorrect. Try again or reset password.");
        }
    }

}