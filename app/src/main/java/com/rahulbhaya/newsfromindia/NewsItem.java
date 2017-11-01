package com.rahulbhaya.newsfromindia;

/**
 * Created by rahulbhaya on 9/24/17.
 */

public class NewsItem {
    private String newsHeading;
    private String newsDesc;
    private String newsDescSmall;
    private int imageID;
    private String time;
    private String date;
    private String url;

    public String getNewsHeading() {
        return newsHeading;
    }

    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsDescSmall() {
        return newsDescSmall;
    }

    public void setNewsDescSmall(String newsDescSmall) {
        this.newsDescSmall = newsDescSmall;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }




}
