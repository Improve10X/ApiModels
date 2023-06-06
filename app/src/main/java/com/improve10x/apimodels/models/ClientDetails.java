package com.improve10x.apimodels.models;

import com.google.gson.annotations.SerializedName;

public class ClientDetails {

@SerializedName("accept_language")
    private String language;

@SerializedName( "browser_height")
    private Integer height;

@SerializedName("browser_ip")
    private String ip;

@SerializedName( "browser_width")
    private Integer width;

@SerializedName("session_hash")
    private String hash;

@SerializedName( "user_agent")
    private String agent;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}
