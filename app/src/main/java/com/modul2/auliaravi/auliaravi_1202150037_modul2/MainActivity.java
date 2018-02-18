package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickOrder(View view) {
       //membantu agar radio button dapat dipilih
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            //untuk perpindahan mainactivity ke dinein activity
            Toast.makeText(this,"Anda telah memilih Dine In",Toast.LENGTH_SHORT).show();
            //untuk memunculkan notifikasi
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            //untuk perpindahan mainactivity ke takeaway acitivity
            Toast.makeText(this,"Anda telah memilih Take Away",Toast.LENGTH_SHORT).show();
            //untuk memunculkan notifikasi
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
            //untuk memunculkan notifikasi
        }
    }
}
