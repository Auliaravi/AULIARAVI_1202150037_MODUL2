package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

import java.util.LinkedList;

public class MenuAdapter extends
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

        private final LinkedList<String> mFoodList;
        private final LinkedList<String> mKomposisi;
        private final LinkedList<Integer> mPriceList;
        private final LinkedList<Integer> mPhotoList;
        private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> foodList,LinkedList<String> komposisi, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
            mInflater = LayoutInflater.from(context);
            this.mFoodList = foodList;
            this.mKomposisi = komposisi;
            this.mPriceList = priceList;
            this.mPhotoList = photoList;
        }

        @Override
        public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View mItemView = mInflater.inflate(R.layout.activity_menu_adapter, parent, false);
            return new MenuViewHolder(mItemView, this);
        }

        @Override
        public void onBindViewHolder(MenuViewHolder holder, int position) {
            String mCurrentFood = mFoodList.get(position);
            String test = mKomposisi.get(position);
            Integer mCurrentPrice = mPriceList.get(position);
            Integer mCurrentPhoto = mPhotoList.get(position);
            holder.foodItemView.setText(mCurrentFood);
            holder.komposisiItemView.setText(test);
            holder.priceItemView.setText("Rp."+mCurrentPrice.toString());
            holder.photoItemView.setImageResource(mCurrentPhoto);
        }

        @Override
        public int getItemCount() {
            return mFoodList.size();
        }

        class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            // di tutorial ini kita hanya menggunakan data String dan Integer untuk tiap item
            public final TextView foodItemView;
            public final TextView priceItemView;
            public final ImageView photoItemView;
            public final TextView komposisiItemView;

            final MenuAdapter mAdapter;
            public MenuViewHolder(final View itemView, MenuAdapter adapter) {
                super(itemView);
                foodItemView = (TextView)itemView.findViewById(R.id.tv_food);
                komposisiItemView = (TextView)itemView.findViewById(R.id.tv_komposisi);
                priceItemView = (TextView)itemView.findViewById(R.id.tv_price);
                photoItemView = (ImageView)itemView.findViewById(R.id.iv_photo);
                photoItemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Get the position of the item that was clicked.
                        int mPosition = getLayoutPosition();
                        // Use that to access the affected item in mWordList.
                        String food = mFoodList.get(mPosition);
                        Integer price = mPriceList.get(mPosition);
                        Integer photo = mPhotoList.get(mPosition);
                        String komposisi = mKomposisi.get(mPosition);
                        Intent intent = new Intent(itemView.getContext(), DetailMenu.class);
                        intent.putExtra("food",food);
                        intent.putExtra("price",price);
                        intent.putExtra("photo",photo);
                        intent.putExtra("komposisi",komposisi);
                        itemView.getContext().startActivity(intent);
                    }
                });
                this.mAdapter = adapter;
            }

            @Override
            public void onClick(View view) {

            }
        }

    }
