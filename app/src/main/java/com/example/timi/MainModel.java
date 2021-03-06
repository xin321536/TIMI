package com.example.timi;

import android.util.Log;


import com.example.timi.base.BaseModel;
import com.example.timi.net.INetCallBack;
import com.example.timi.net.NetWorkFactory;
import com.example.timi.net.ParamsUtils;
import com.example.timi.net.api.URLConstants;

import java.util.HashMap;

public class MainModel  extends BaseModel implements MainContract.IMainMode {



    public MainModel() {
    }

    @Override
    public <T> void getRecommendList(INetCallBack<T> netCallBack) {

//        测试添加参数
        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("start","0");
        commonParams.put("number","0");
        commonParams.put("point_time ","0");

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }

        NetWorkFactory.getInstance().getNetWork().get(URLConstants.VEDIO_LIST,commonParams ,netCallBack);


//        NetWorkFactory.getInstance().getNetWork().post(URLConstants.VEDIO_LIST,commonParams ,netCallBack);


    }
}
