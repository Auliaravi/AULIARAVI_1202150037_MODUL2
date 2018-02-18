package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView tv_food, tv_price,tv_komposisi;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        String tkomposisi = intent.getStringExtra("komposisi");
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);
        //melakukan inisiasi pada id
        tv_food = (TextView)findViewById(R.id.tv_detFood);
        tv_price = (TextView)findViewById(R.id.tv_detPrice);
        tv_komposisi = (TextView)findViewById(R.id.tv_detKomposisi);
        iv_photo = (ImageView)findViewById(R.id.iv_detPhoto);
        //melakukan set untuk data yang sudag dibawa dari layout sebelumnya
        tv_food.setText(food);
        tv_price.setText("Rp. "+price);
        tv_komposisi.setText(tkomposisi);
        iv_photo.setImageResource(photo);
    }
}

