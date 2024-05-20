package com.example.tugasday11redesign;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InternetActivity extends AppCompatActivity {

    private static final String TAG = "InternetActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        ImageView ivInternet = findViewById(R.id.ivInternet);
        ivInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tampilkan pesan notifikasi ketika gambar diklik
                showToast();
                // Cetak pesan ke logcat
                Log.d(TAG, "ImageView clicked");
            }
        });
    }

    private void showToast() {
        Toast.makeText(this, "Semua paket sedang dalam proses pengisian, mohon coba lagi beberapa jam kemudian", Toast.LENGTH_LONG).show();
    }
}
