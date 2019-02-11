package com.raseeditask.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ads {
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("solo")
    @Expose
    private Boolean solo;
    @SerializedName("best_offer")
    @Expose
    private Boolean bestOffer;
    @SerializedName("sucess")
    @Expose
    private Boolean sucess;
    @SerializedName("order")
    @Expose
    private Integer order;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSolo() {
        return solo;
    }

    public void setSolo(Boolean solo) {
        this.solo = solo;
    }

    public Boolean getBestOffer() {
        return bestOffer;
    }

    public void setBestOffer(Boolean bestOffer) {
        this.bestOffer = bestOffer;
    }

    public Boolean getSucess() {
        return sucess;
    }

    public void setSucess(Boolean sucess) {
        this.sucess = sucess;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
