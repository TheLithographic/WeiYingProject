package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.view.activity.DissertationTwo;
import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */

public class DissTwoAdapter extends  RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    private Context context;
    private List<DissertationSuperClass.RetBean.ListBean.ChildListBean> childList;
    //2.声明一个接口变量
    private  OnItemClickListener itemClickListener;

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (itemClickListener!=null){
            itemClickListener.onItemClick((Integer) v.getTag());
        }
    }


    //1.定义一个接口
    public interface OnItemClickListener{

        void onItemClick(Integer tag);
    }
    public void setItemClickListener(OnItemClickListener itemClickListener1) {
        itemClickListener = itemClickListener1;
    }

    public DissTwoAdapter(Context context, List<DissertationSuperClass.RetBean.ListBean.ChildListBean> childList) {
        this.context = context;
        this.childList = childList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.clery_two, parent, false);
        ViewHolder holder=new ViewHolder(view);

        view.setOnClickListener(this);
        return holder;    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //先进行强转
         ViewHolder holder1 = (ViewHolder) holder;
        //绑定数据'
        holder1.dissTwo.setText(childList.get(position).getTitle());
          Log.i("sssssssssssssss",childList.get(position).getTitle());

        Glide.with(context)
                .load(childList.get(position).getPic())
                .into(holder1.dissImg);

        holder1.itemView.setTag(position);

        //  Glide.with(context).load(list.get(position).getChildList().get(position).getPic()).into(holder1.iv);
    }


    @Override
    public int getItemCount() {
        return childList==null?0:childList.size();

    }





    //定义一个ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView dissTwo;
        private final ImageView dissImg;

        public ViewHolder(View itemView) {
            super(itemView);
              dissTwo = itemView.findViewById(R.id.disstwotv);
               dissImg = itemView.findViewById(R.id.disstwoImg);

        }
    }
}
