package com.example.timi.home.contract;

import com.example.timi.base.BaseView;
import com.example.timi.home.bean.NewsBean;
import com.example.timi.net.INetCallBack;

public class NewsFragmentContract {


    public interface INewsView extends BaseView {
        void  setRecommendList(NewsBean newsBean);
    }
    public interface INewsMode{
        <T> void getRecommendList(String tabID, INetCallBack<T> iNetCallBack);
    }
    public interface INewsPresenter{
        void getRecommend(String string);
    }
}
