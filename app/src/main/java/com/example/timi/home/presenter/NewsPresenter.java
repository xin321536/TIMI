package com.example.timi.home.presenter;


import com.example.timi.base.BasePresenter;
import com.example.timi.home.bean.NewsBean;
import com.example.timi.home.contract.NewsFragmentContract;
import com.example.timi.home.contract.RecommendContract;
import com.example.timi.home.model.NewsModel;
import com.example.timi.net.INetCallBack;

public class NewsPresenter extends BasePresenter<NewsFragmentContract.INewsView> implements RecommendContract.IRecommendPresenter {
    private NewsFragmentContract.INewsMode iNewsMode;

    @Override
    public void getColumList() {

    }

    public NewsPresenter() {

        iNewsMode = new NewsModel();

    }

    @Override
    public void getRecommendList(String id) {
        iNewsMode.getRecommendList(id,new INetCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean newsBean) {

                mview.setRecommendList(newsBean);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });


    }
}
