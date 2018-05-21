package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baidu.weiying.R;
import com.baidu.weiying.view.bean.HomePageSuperClass;

import java.util.List;

/**
 * Created by lenovo on 2018/5/21.
 */

public class MyChoicenessAdapter extends RecyclerView.Adapter<MyChoicenessAdapter.MyViewHolder>{
    private List<HomePageSuperClass.RetBean.ListBean.ChildListBean> data;
    private Context context;

    public MyChoicenessAdapter(Context context) {
        this.context = context;
    }
    public void setList(List<HomePageSuperClass.RetBean.ListBean.ChildListBean> data){
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.choiceess_item,parent,false);

        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
