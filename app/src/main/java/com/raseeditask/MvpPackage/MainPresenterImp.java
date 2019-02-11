package com.raseeditask.MvpPackage;

import com.raseeditask.Model.Ads;

import java.util.List;

public class MainPresenterImp implements MainInterface.Presenter,MainInterface.getNoticeResponse.onFinishedListner {
    MainInterface.getNoticeResponse getNoticeResponse;

    public MainPresenterImp( MainInterface.getNoticeResponse getNoticeResponse) {
        this.getNoticeResponse = getNoticeResponse;
    }
    @Override
    public void FetchDataFromServer() {
        getNoticeResponse.getNoticeList(this);
    }

    @Override
    public void onFinished(List<Ads> adsLists) {

    }

    @Override
    public void onFail(Throwable t) {

    }
}
