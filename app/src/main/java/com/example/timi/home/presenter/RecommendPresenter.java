package com.example.timi.home.presenter;

import android.util.Log;

import com.example.timi.base.BasePresenter;
import com.example.timi.home.bean.ColunmBean;
import com.example.timi.home.bean.NewsBean;
import com.example.timi.home.contract.RecommendContract;
import com.example.timi.home.model.RecommendModel;
import com.example.timi.net.INetCallBack;


public class RecommendPresenter extends BasePresenter<RecommendContract.IRecommendView> implements RecommendContract.IRecommendPresenter {


    RecommendContract.IRecommendMode iRecommendMode;

    public RecommendPresenter() {
        iRecommendMode = new RecommendModel();
    }

    @Override
    public void getColumList() {

        iRecommendMode.getColumList(new INetCallBack<ColunmBean>() {
            @Override
            public void onSuccess(ColunmBean remBean) {

                mview.setColumList(remBean);

            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

    }

    @Override
    public void getRecommendList(String id) {

        iRecommendMode.getRecommendList(id,new INetCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean remBean) {

               mview.setRecommendList(remBean);

            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

    }
}
