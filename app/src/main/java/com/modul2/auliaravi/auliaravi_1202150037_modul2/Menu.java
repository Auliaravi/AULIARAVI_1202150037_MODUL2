package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<String> mkomposisi = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods,mkomposisi, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Chicken");
            foods.add("Chicken Katsu");
            foods.add("Burger");
        //daftar makanan
            priceses.add(32000);
            priceses.add(15000);
            priceses.add(25000);
            //daftar harga

            photos.add(R.drawable.chicken);
            photos.add(R.drawable.chickenkatsu);
            photos.add(R.drawable.burger);
            //daftar gambar
            mkomposisi.add("ayam krispy dimasak dengan suhu yang khusu dan bumbu rahasia dari nenek moyang");
            mkomposisi.add("Chicken katsu yang dibumbui saus yang sangat gurih dengan ditambah beberapa salad");
            mkomposisi.add("Burger dengan isi daging ayam dan terdapat sayuran didalamnya dan makan bersama kentang goreng yang crunyi");
        }
    }
}
