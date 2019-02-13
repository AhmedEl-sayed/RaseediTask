package com.raseeditask.MvpPackage;

import com.raseeditask.Model.Ads;

import java.util.List;

public class MainPresenterImp implements MainInterface.Presenter,MainInterface.getNoticeResponse.onFinishedListner {
    MainInterface.getNoticeResponse getNoticeResponse;
    MainInterface.MainView mainView;

    public MainPresenterImp( MainInterface.getNoticeResponse getNoticeResponse,MainInterface.MainView mainView) {
        this.getNoticeResponse = getNoticeResponse;
        this.mainView = mainView;
    }
    //I call the function from getNoticeResponse interface
    //this fun will be called in mainActivity
    @Override
    public void FetchDataFromServer() {
        getNoticeResponse.getNoticeList(this);
    }

    @Override
    public void onFinished(List<Ads> adsLists) {
        if(mainView!=null){
            mainView.setDataToRecyclerView(adsLists);
        }
    }

    @Override
    public void onFail(Throwable t) {

    }
}
