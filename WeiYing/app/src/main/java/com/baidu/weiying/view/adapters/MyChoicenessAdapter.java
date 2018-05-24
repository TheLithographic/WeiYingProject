package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by lenovo on 2018/5/21.
 */

public class MyChoicenessAdapter extends RecyclerView.Adapter<MyChoicenessAdapter.MyViewHolder>{
    private List<HomePageSuperClass.RetBean.ListBean> data;
    private Context context;
    private setOnClick onClickListener;
    public MyChoicenessAdapter(Context context) {
        this.context = context;
    }
    public void setList(List<HomePageSuperClass.RetBean.ListBean> data){
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.choiceess_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Glide.with(context).load(data.get(position).getChildList().get(0).getPic()).into(holder.iv);
        holder.tv.setText(data.get(position).getChildList().get(0).getTitle());
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClickListener(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iv;
        private final TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.choiceness_item_iv);
            tv = itemView.findViewById(R.id.choiceness_item_tv);
        }
    }
    public interface setOnClick{
        void onClickListener(int position);
    }
    public void setOnClickListener(setOnClick onClickListener){
        this.onClickListener = onClickListener;
    }
}
