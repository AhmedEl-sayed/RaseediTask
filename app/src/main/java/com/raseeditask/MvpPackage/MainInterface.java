package com.raseeditask.MvpPackage;

import com.raseeditask.Model.Ads;

import java.util.List;

public interface MainInterface {

    interface MainView{
        void setDataToRecyclerView(List<Ads> adsList);
    }

    interface Presenter{
        void FetchDataFromServer();
    }

    interface getNoticeResponse{
        interface onFinishedListner {
            void onFinished(List<Ads> adsList);
            void onFail(Throwable t);
        }
        void getNoticeList(onFinishedListner onFinishedListner);
    }
}
