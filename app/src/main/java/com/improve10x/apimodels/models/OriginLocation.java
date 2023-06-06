package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

public class OriginLocation {

    @SerializedName( "id")
    private Integer id;

    @SerializedName("country_code")
    private String code;

    @SerializedName( "province_code")
    private String provinceCode;

    @SerializedName( "name")
    private String name;

    @SerializedName( "address1")
    private String  address1;

    @SerializedName("address2")
    private String address2;

    @SerializedName( "city")
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @SerializedName( "zip")
    private String zip;
}
