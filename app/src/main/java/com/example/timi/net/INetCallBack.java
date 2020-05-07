package com.example.timi.net;

public interface INetCallBack<T> {
    void onSuccess(T t);
    void onError(Throwable throwable);
}
