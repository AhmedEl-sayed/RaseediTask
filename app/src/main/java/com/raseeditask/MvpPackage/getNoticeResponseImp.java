package com.raseeditask.MvpPackage;

import android.util.Log;
import android.widget.Toast;

import com.raseeditask.Model.Ads;
import com.raseeditask.MyInterface.InterfaceRetrofit;
import com.raseeditask.Network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getNoticeResponseImp implements MainInterface.getNoticeResponse {


    @Override
    public void getNoticeList(final onFinishedListner onFinishedListner) {
        InterfaceRetrofit interfaceRetrofit= RetrofitInstance.getRetrofitInstance().create(InterfaceRetrofit.class);
        Call<List<Ads>> call = interfaceRetrofit.getAdsList("false");
        call.enqueue(new Callback<List<Ads>>() {
            @Override
            public void onResponse(Call<List<Ads>> call, Response<List<Ads>> response) {
                onFinishedListner.onFinished(response.body());
                Log.v("MinInterface","Sucssssful");
            }

            @Override
            public void onFailure(Call<List<Ads>> call, Throwable t) {
                onFinishedListner.onFail(t);
                Log.v("MinInterface","error "+t.getMessage().toString());

            }
        });

    }
}
