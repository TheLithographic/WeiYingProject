package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.bean.CommentSuperClass;
import com.bumptech.glide.Glide;

import java.util.List;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * 评论的适配器
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private Context context;
    private List<CommentSuperClass.RetBean.ListBean> list;

    public CommentAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<CommentSuperClass.RetBean.ListBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comment_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CommentAdapter.ViewHolder holder, int position) {
        String userPic = list.get(position).getUserPic();
        if (!"".equals(userPic)){
            Log.i("AAA",userPic + "--");
            //设置头像为圆形
            Glide.with(context)
                    .load(userPic)
                    .bitmapTransform(new RoundedCornersTransformation(context, 100, 10))
                    .into(holder.comment_iamgeView);
        }else {
            Glide.with(context)
                    .load(R.mipmap.photo)
                    .bitmapTransform(new RoundedCornersTransformation(context, 100, 10))
                    .into(holder.comment_iamgeView);
        }
        holder.comment_userName.setText(list.get(position).getPhoneNumber());
        holder.comment_time.setText(list.get(position).getTime());
        holder.comment_content.setText(list.get(position).getMsg());
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView comment_iamgeView;
        private TextView comment_userName,comment_time,comment_content;

        public ViewHolder(View itemView) {
            super(itemView);
            comment_iamgeView = itemView.findViewById(R.id.comment_iamgeView);
            comment_userName = itemView.findViewById(R.id.comment_userName);
            comment_time = itemView.findViewById(R.id.comment_time);
            comment_content = itemView.findViewById(R.id.comment_content);
        }
    }
}
