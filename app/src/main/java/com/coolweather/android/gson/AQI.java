package com.coolweather.android.gson;

import java.security.PublicKey;

/**
 * Created by Administrator on 2017/9/13 0013.
 */

public class AQI {

    public AQICity city;


    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
