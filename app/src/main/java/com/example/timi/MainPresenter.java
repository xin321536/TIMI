package com.example.timi;

import android.util.Log;

import com.example.timi.MainActivity;
import com.example.timi.MainContract;
import com.example.timi.MainModel;
import com.example.timi.base.BasePresenter;
import com.example.timi.net.INetCallBack;


public class MainPresenter  extends BasePresenter<MainActivity> implements MainContract.IMainPresenter {

    private MainContract.IMainMode iMainMode;

    public MainPresenter() {
        iMainMode = new MainModel();
    }

    @Override
    public void getRecommendList() {

        iMainMode.getRecommendList(new INetCallBack<RemBean>() {
            @Override
            public void onSuccess(RemBean remBean) {


                Log.e("TAG","打印网络请求返回实体类:"+remBean.toString());

            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

    }
}
