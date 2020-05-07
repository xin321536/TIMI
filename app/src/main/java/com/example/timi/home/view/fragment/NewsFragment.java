package com.example.timi.home.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.timi.R;
import com.example.timi.base.BaseFragment;
import com.example.timi.home.bean.NewsBean;
import com.example.timi.home.contract.NewsFragmentContract;
import com.example.timi.home.presenter.NewsPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends BaseFragment<NewsPresenter> implements NewsFragmentContract.INewsView {

    private  String tabID;


    public NewsFragment(String tabID) {
        this.tabID = tabID;
    }

    @Override
    protected NewsPresenter initPresenter() {
        return new NewsPresenter();
    }

    @Override
    protected void initLinstener() {

    }

    @Override
    protected void initData() {

        mPresenter.getRecommendList(tabID);

    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getLayoutID() {
        return R.layout.fragment_news;
    }

    @Override
    public void setRecommendList(NewsBean string) {

        Log.e("TAG","推荐列表数据"+string.toString());


    }
}
