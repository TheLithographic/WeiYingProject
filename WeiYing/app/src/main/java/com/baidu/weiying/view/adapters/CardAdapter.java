package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.slidecard.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.List;

/**
 * 滑动卡片适配器
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private Context context;
    private List<User> mData;

    public CardAdapter(Context context) {
        this.context = context;
    }

    public void setmData(List<User> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        CardViewHolder holder = new CardViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        /*holder.tv_name.setText(mData.get(position).getName());
        holder.tv_sign.setText(mData.get(position).getSign());
        //用Glide来加载图片getApplicationContext()
        Glide.with(context)
                .load(mData.get(position).getPhotoResId())
                .into(holder.iv_photo);*/
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    //右滑的时候调用
    public void addLoveCount() {

    }

    //左滑的时候调用
    public void addDelCount(){

    }

    class CardViewHolder extends RecyclerView.ViewHolder {


        public CardViewHolder(View itemView) {
            super(itemView);

        }
    }
}
