package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.view.activity.VideoInfoActivity;
import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.slidecard.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.List;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * 滑动卡片适配器
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private Context context;
    private List<DiscoverSuperClass.RetBean.ListBean> list;
    private int count = 0;

    public CardAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<DiscoverSuperClass.RetBean.ListBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        final CardViewHolder holder = new CardViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getLayoutPosition();
                Intent intent = new Intent(context,VideoInfoActivity.class);
                intent.putExtra("title",list.get(position).getTitle());
                intent.putExtra("dataId",list.get(position).getDataId());
                intent.putExtra("pic",list.get(position).getPic());
                intent.putExtra("airTime",list.get(position).getAirTime());
                intent.putExtra("score",list.get(position).getScore());
                context.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.itemCar_title.setText(list.get(position).getTitle());
        holder.itemCar_content.setText("\u3000\u3000" + list.get(position).getDescription());
        Glide.with(context)
                .load(list.get(position).getPic())
                .placeholder(R.mipmap.default_200)
                .bitmapTransform(new RoundedCornersTransformation(context, 15, 0))
                .into(holder.itemCar_image);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    //右滑的时候调用
    public void addLoveCount() {
        count++;
    }

    //左滑的时候调用
    public void addDelCount(){
        count++;
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        private TextView itemCar_title,itemCar_content;
        private ImageView itemCar_image;

        public CardViewHolder(View itemView) {
            super(itemView);
            itemCar_title = itemView.findViewById(R.id.itemCar_title);
            itemCar_image = itemView.findViewById(R.id.itemCar_image);
            itemCar_content = itemView.findViewById(R.id.itemCar_content);
        }
    }
}
