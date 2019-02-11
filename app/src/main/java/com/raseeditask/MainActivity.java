package com.raseeditask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.raseeditask.MvpPackage.MainInterface;
import com.raseeditask.MvpPackage.MainPresenterImp;
import com.raseeditask.MvpPackage.getNoticeResponseImp;

public class MainActivity extends AppCompatActivity {

    MainInterface.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenterImp(new getNoticeResponseImp());
        presenter.FetchDataFromServer();


    }
}
