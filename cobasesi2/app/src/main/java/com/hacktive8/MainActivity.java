package com.hacktive8;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText namaET;
    EditText emailET;
    EditText handphoneET;
    EditText alamatET;
    Button   buttonDaftar;
    Button   buttonDaftarWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaET= findViewById(R.id.nama);
        emailET=findViewById(R.id.email);
        handphoneET=findViewById(R.id.handphone);
        alamatET=findViewById(R.id.alamat);

        buttonDaftar=findViewById(R.id.button_submit);
        buttonDaftar.setOnClickListener(this);

        buttonDaftarWeb=findViewById(R.id.button_daftar_web);
        buttonDaftarWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.button_submit){
            Intent intent = new Intent(this,ResultActivity.class);

            intent.putExtra("nama",namaET.getText().toString());
            intent.putExtra("email",emailET.getText().toString());
            intent.putExtra("handphone",handphoneET.getText().toString());
            intent.putExtra("alamat",alamatET.getText().toString());

            startActivity(intent);
        }
        else{
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url= "https://hacktiv8.com/register";
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }
    }
}