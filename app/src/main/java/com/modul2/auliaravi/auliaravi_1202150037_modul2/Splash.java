package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this,"AULIA RAVI_1202150037",Toast.LENGTH_SHORT).show();
        //menampilkan notifikasi berisikan nama_nim
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                //menghubungkan activity splash ke mainactivity menggunakan intent
                finish();
            }
        },  3000L);
    }
}
