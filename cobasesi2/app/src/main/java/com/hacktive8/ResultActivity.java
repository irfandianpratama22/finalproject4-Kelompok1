package com.hacktive8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView namaTv;
    TextView emailTv;
    TextView handphoneTv;
    TextView alamatTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        namaTv=findViewById(R.id.nama_tv);
        emailTv=findViewById(R.id.email_tv);
        handphoneTv=findViewById(R.id.handphone_tv);
        alamatTv=findViewById(R.id.alamat_tv);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("nama");
        String email= bundle.getString("email");
        String handphone = bundle.getString("handphone");
        String alamat = bundle.getString("alamat");

        namaTv.setText(nama);
        emailTv.setText(email);
        handphoneTv.setText(handphone);
        alamatTv.setText(alamat);
    }
}