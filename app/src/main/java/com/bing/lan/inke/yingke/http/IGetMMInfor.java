package com.bing.lan.inke.yingke.http;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kay on 16/12/20.
 */

public interface IGetMMInfor {
    @GET
    public Call<ResponseBody> doGet(@Url String ur);
}
