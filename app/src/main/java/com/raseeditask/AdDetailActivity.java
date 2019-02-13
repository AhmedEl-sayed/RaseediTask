package com.raseeditask;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AdDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private TextView titleTv;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_detail);

        imageView = findViewById(R.id.myImage);
        titleTv = findViewById(R.id.myTitle);
        findViewById(R.id.seebtn).setOnClickListener(this);

        intent = getIntent();
        setImage(imageView);
        titleTv.setText(intent.getStringExtra("title"));
    }

    public void setImage(ImageView image){
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.placeholder);
        Glide.with(this).load(intent.getStringExtra("url"))
                .apply(options).into(image);

    }

    @Override
    public void onClick(View view) {
        String url = intent.getStringExtra("link");
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

    }
}
