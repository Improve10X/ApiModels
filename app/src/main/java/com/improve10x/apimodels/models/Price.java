package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

public class Price {
    @SerializedName("amount")
    private String amount;

    @SerializedName("currency_code")
    private String currencyCode;
}
