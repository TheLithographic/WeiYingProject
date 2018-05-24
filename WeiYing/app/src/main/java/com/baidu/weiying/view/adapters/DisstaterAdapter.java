package com.baidu.weiying.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.activity.MainActivity;
import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2018/5/22.
 */

public class DisstaterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
   private Context context;
    private List<DissertationSuperClass.RetBean.ListBean> list;
    //2.声明一个接口变量
    private OnItemClickListener itemClickListener;

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
    public DisstaterAdapter(Context context, List<DissertationSuperClass.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dissertation_item, parent, false);
        RecyclerView.ViewHolder holder=null;
        holder=new ViewHolder(view);
        view.setOnClickListener(this);
        return holder;    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //先进行强转
        ViewHolder holder1 = (ViewHolder) holder;
        //绑定数据
        holder1.tv.setText(list.get(position).getTitle());

        holder1.itemView.setTag(position);

        //  Glide.with(context).load(list.get(position).getChildList().get(position).getPic()).into(holder1.iv);
    }


    @Override
    public int getItemCount() {
        return list==null?0:list.size();

    }

    //定义一个ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        private ImageView iv;
        public ViewHolder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.disstv);
            iv=(ImageView)itemView.findViewById(R.id.dissImg);
        }
    }
}
