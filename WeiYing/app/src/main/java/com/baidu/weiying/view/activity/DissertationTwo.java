package com.baidu.weiying.view.activity;

 import android.os.Bundle;
 import android.os.Parcelable;
 import android.support.v7.widget.RecyclerView;

 import android.support.v7.widget.StaggeredGridLayoutManager;
 import android.view.View;
 import android.widget.TextView;
 import android.widget.Toast;

 import com.baidu.weiying.R;
 import com.baidu.weiying.presenter.DissertationPersenter;
 import com.baidu.weiying.view.adapters.DissTwoAdapter;
 import com.baidu.weiying.view.adapters.DisstaterAdapter;
 import com.baidu.weiying.view.base.BaseActivity;
 import com.baidu.weiying.view.bean.DissertationSuperClass;
 import com.baidu.weiying.view.ifragments.IDissertationFragment;

 import java.util.ArrayList;
 import java.util.List;

public class DissertationTwo extends BaseActivity<DissertationPersenter> implements IDissertationFragment, DissTwoAdapter.OnItemClickListener {


     private Bundle bundle;
     private int nameId;
     private TextView tvss;
    private List<DissertationSuperClass.RetBean.ListBean.ChildListBean> childList;
    private RecyclerView recycleTwo;


    @Override
    protected int getLayoutId() {

        return R.layout.activity_dissertation_two;
    }

    @Override
    protected DissertationPersenter getPresenter() {
        presenter = new DissertationPersenter(this);
        return presenter;
    }

    @Override
    protected void initView() {

        recycleTwo = findViewById(R.id.recycleTwo);
        bundle = this.getIntent().getExtras();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recycleTwo.setLayoutManager(staggeredGridLayoutManager);


    }


    @Override
    protected void getData() {
        presenter.getDissertation();

        nameId = bundle.getInt("firstListId");

     }


    @Override
    public void onSucess(DissertationSuperClass.RetBean data) {
        childList = data.getList().get(nameId).getChildList();


        DissTwoAdapter dissTwoAdapter = new DissTwoAdapter(this, childList);
        recycleTwo.setAdapter(dissTwoAdapter);
        dissTwoAdapter.setItemClickListener(this);


    }

    @Override
    public void onFailed(String s) {

    }

    @Override
    public void onItemClick(Integer tag) {
        Toast.makeText(this, "点击成功！！！", Toast.LENGTH_SHORT).show();

    }
}
