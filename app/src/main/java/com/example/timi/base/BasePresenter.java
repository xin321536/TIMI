package com.example.timi.base;

import com.example.timi.base.BaseActivity;

public class BasePresenter<T extends BaseView> {

   protected T mview;

    public void AttachView(T baseView){
        mview = baseView;
    }
    public void disAttachView(){
        mview = null;
    }

    public <P extends BasePresenter> void AttachView(BaseActivity<P> pBaseActivity) {
    }
}
