package com.example.personal;

public class searchRetreive {
    public String name, url;

    public searchRetreive(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public searchRetreive(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }
}
