package com.raseeditask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.raseeditask.Adapter.RecyclerViewAdapter;
import com.raseeditask.Model.Ads;
import com.raseeditask.MvpPackage.MainInterface;
import com.raseeditask.MvpPackage.MainPresenterImp;
import com.raseeditask.MvpPackage.RecyclerItemClickListner;
import com.raseeditask.MvpPackage.getNoticeResponseImp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainInterface.MainView {

    MainInterface.Presenter presenter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefineRecyclerView();
        //we take the reference of mainPresenter to call its functions
        presenter = new MainPresenterImp(new getNoticeResponseImp(),this);
        presenter.FetchDataFromServer();


    }

    public void DefineRecyclerView() {
        recyclerView = findViewById(R.id.myrecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
    }

    RecyclerItemClickListner recyclerItemClickListner = new RecyclerItemClickListner() {
        @Override
        public void onItemClick(Ads ads) {
            Intent intent = new Intent(MainActivity.this,AdDetailActivity.class);
            intent.putExtra("title",ads.getTitle());
            intent.putExtra("url",ads.getPicture());
            intent.putExtra("link",ads.getUrl());
            startActivity(intent);
        }
    };


    @Override
    public void setDataToRecyclerView(List<Ads> adsList) {
        Collections.sort(adsList);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(adsList,recyclerItemClickListner);
        recyclerView.setAdapter(adapter);
    }

}
