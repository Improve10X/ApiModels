package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LineItems {

    @SerializedName("id")
    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String admin;

    @SerializedName("fulfillable_quantity")
    private Integer quantity;

    @SerializedName("fulfillment_service")
    private String service;

    @SerializedName("fulfillment_status")
    private String status;

    @SerializedName("gift_card")
    private boolean card;

    @SerializedName("grams")
    private Integer grams;

    @SerializedName("name")
    private String name;

    @SerializedName( "origin_location")
    private OriginLocation originLocation;

    @SerializedName( "pre_tax_price")
    private String  preTaxPrice;

    @SerializedName("pre_tax_price_set")
    private PriceSet preTaxPriceSet;

    @SerializedName("price")
    private String price;

    @SerializedName("price_set")
    private PriceSet priceSet;

    @SerializedName("product_exists")
    private boolean exists;

    @SerializedName("product_id")
    private Integer productId;

    @SerializedName( "properties")
    private ArrayList<String> properties;

    @SerializedName("quantity")
    private Integer quantity1;

    @SerializedName( "requires_shipping")
    private boolean shipping;

    @SerializedName("sku")
    private String sku;

    @SerializedName("tax_code")
    private  String taxCode;

    @SerializedName( "taxable")
    private boolean tax;

    @SerializedName( "title")
    private String title;

    @SerializedName( "total_discount")
    private String discount;

    @SerializedName("total_discount_set")
    private PriceSet totalDiscountSet;

    @SerializedName("variant_id")
    private Integer variantId;

    @SerializedName("variant_inventory_management")
    private String management;

    @SerializedName( "variant_title")
    private String  variantTitle;

    @SerializedName("vendor")
    private String vendor;

    @SerializedName("tax_lines")
    public ArrayList<TaxLines> taxLines;

    @SerializedName("duties")
    public ArrayList<String> duties;

    @SerializedName( "payment_terms")
    public ArrayList<String>  paymentTerms;

    @SerializedName("discount_allocations")
    private ArrayList<String> discountAllocations;

}
