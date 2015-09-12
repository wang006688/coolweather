package com.mygame.example.course.coolweather.util;

/**
 * Created by Wang on 9/11/2015.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
