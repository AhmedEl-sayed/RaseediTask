package com.raseeditask.MyInterface;

import com.raseeditask.Model.Ads;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InterfaceRetrofit {

    @GET("get_ad/")
    Call<List<Ads>> getAdsList(@Query("solo") String solo);
}
