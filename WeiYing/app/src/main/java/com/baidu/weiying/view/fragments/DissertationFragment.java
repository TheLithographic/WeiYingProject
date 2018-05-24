package com.baidu.weiying.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.DissertationPersenter;
import com.baidu.weiying.view.activity.DissertationTwo;
import com.baidu.weiying.view.adapters.DisstaterAdapter;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.baidu.weiying.view.ifragments.IDissertationFragment;

import java.util.List;

/**
 * 专题页面
 */

public class DissertationFragment extends BaseFragment<DissertationPersenter> implements IDissertationFragment, DisstaterAdapter.OnItemClickListener {
    private DissertationPersenter presenter;
    private TextView tvs;
    private RecyclerView disserView;
    private DisstaterAdapter disstaterAdapter;
    private List<DissertationSuperClass.RetBean.ListBean> list;



    @Override
    protected int getLayoutId() {

        return R.layout.dissertation_fragment;
    }

    @Override
    protected DissertationPersenter getPresenter() {
        presenter = new DissertationPersenter(this);
        return presenter;
    }


    @Override
    protected void initView(View view) {
        disserView = view.findViewById(R.id.disserView);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        disserView.setLayoutManager(staggeredGridLayoutManager);

    }


    @Override
    protected void getData() {
     presenter.getDissertation();
 


    }

    @Override
    public void onSucess(DissertationSuperClass.RetBean data) {
        list = data.getList();

        disstaterAdapter = new DisstaterAdapter(getActivity(),list);
        disserView.setAdapter(disstaterAdapter);
        disstaterAdapter.setItemClickListener(this);
      }

    @Override
    public void onFailed(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemClick(Integer tag) {

        Toast.makeText(getActivity(), ""+tag, Toast.LENGTH_SHORT).show();
        Context context;
        context = getActivity().getApplicationContext();
        Intent intent = new Intent(context, DissertationTwo.class);
         Bundle bundle = new Bundle();
         bundle.putInt("firstListId", tag);
         intent.putExtras(bundle);
          startActivity(intent);


    }

}
