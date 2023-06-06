package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

public class TaxLines {

    @SerializedName("channel_liable")
    private boolean channelLiable;

    @SerializedName( "price")
    private String price;

    @SerializedName("price_set")
    private PriceSet priceSet;
    private Float rate;
    private String title;

    public boolean isChannelLiable() {
        return channelLiable;
    }

    public void setChannelLiable(boolean channelLiable) {
        this.channelLiable = channelLiable;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PriceSet getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(PriceSet priceSet) {
        this.priceSet = priceSet;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
