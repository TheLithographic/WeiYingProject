package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;
import com.bumptech.glide.Glide;

import java.util.List;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * 简介适配器
 */

public class IntroAdapter extends RecyclerView.Adapter<IntroAdapter.ViewHolder> {
    private Context context;
    private List<VideoInfoSuperClass.RetBean.ListBean.ChildListBean> list;

    public IntroAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<VideoInfoSuperClass.RetBean.ListBean.ChildListBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public IntroAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.intro_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(IntroAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(list.get(position).getPic())
                .placeholder(R.mipmap.default_200)
                .bitmapTransform(new RoundedCornersTransformation(context, 5, 0))
                .into(holder.image_view);
        holder.text_view.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image_view;
        private TextView text_view;
        public ViewHolder(View itemView) {
            super(itemView);
            image_view = itemView.findViewById(R.id.info_image_view);
            text_view = itemView.findViewById(R.id.info_text_view);
        }
    }
}
