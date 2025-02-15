package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Integer likes, Date creationDate){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }
}
