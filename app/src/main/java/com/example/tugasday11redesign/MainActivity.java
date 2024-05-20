package com.example.tugasday11redesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menambahkan listener untuk setiap view
        findViewById(R.id.vRiwayat).setOnClickListener(this);
        findViewById(R.id.vBantuan).setOnClickListener(this);
        findViewById(R.id.vInbox).setOnClickListener(this);
        findViewById(R.id.vAkun).setOnClickListener(this);
        findViewById(R.id.vInternet).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Menangani klik pada setiap view
        if (v.getId() == R.id.vRiwayat) {
            openActivity(RiwayatActivity.class);
        } else if (v.getId() == R.id.vBantuan) {
            openActivity(BantuanActivity.class);
        } else if (v.getId() == R.id.vInbox) {
            openActivity(InboxActivity.class);
        } else if (v.getId() == R.id.vAkun) {
            openActivity(AkunActivity.class);
        } else if (v.getId() == R.id.vInternet) {
            openActivity(InternetActivity.class);
        }
    }

    // Method untuk membuka halaman activity
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
