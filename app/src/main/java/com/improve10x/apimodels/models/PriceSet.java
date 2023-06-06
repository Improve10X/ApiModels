package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

public class PriceSet {

    @SerializedName("shop_money")
    private Price shopMoney;

    @SerializedName( "presentment_money")
    private Price presentmentMoney;

}

