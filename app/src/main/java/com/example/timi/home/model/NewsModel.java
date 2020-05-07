package com.example.timi.home.model;

import android.util.Log;

import com.example.timi.home.contract.NewsFragmentContract;
import com.example.timi.net.INetCallBack;
import com.example.timi.net.NetWorkFactory;
import com.example.timi.net.ParamsUtils;
import com.example.timi.net.api.URLConstants;

import java.util.HashMap;

public class NewsModel implements NewsFragmentContract.INewsMode {
    @Override
    public <T> void getRecommendList(String tabID, INetCallBack<T> iNetCallBack) {
        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("id",tabID);
        commonParams.put("start","0");
        commonParams.put("number ","0");
        commonParams.put("point_time","0");
//        此处  -- 登录以后，  需要修改

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }
        NetWorkFactory.getInstance().getNetWork().get(URLConstants.RECOMMEND_LIST,commonParams,iNetCallBack);

    }
}
