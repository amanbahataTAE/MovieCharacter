package com.example.aman1.moviecharacters.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aman1 on 05/12/2017.
 */

public class RelatedTopic {

    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("FirstURL")
    @Expose
    private String firstURL;
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Icon")
    @Expose
    private Icon icon;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFirstURL() {
        return firstURL;
    }

    public void setFirstURL(String firstURL) {
        this.firstURL = firstURL;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }



}
