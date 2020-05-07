package com.example.timi.home.model;

import com.example.timi.base.BaseModel;
import com.example.timi.home.contract.HomeContract;
import com.example.timi.net.INetCallBack;

public class HomeModelImpl extends BaseModel implements HomeContract.IHomeMode {

    private HomeContract.IHomePresenter iHomePresenter;

    public HomeModelImpl(HomeContract.IHomePresenter iHomePresenter) {
        this.iHomePresenter = iHomePresenter;
    }

    @Override
    public <T> void getHomeBannview(INetCallBack<T> netCallBack) {
    }

    @Override
    public <T> void getHomeTabList(INetCallBack<T> iNetCallBack) {
    }
}
