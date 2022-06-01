package com.example.instagram;

import java.util.List;

public class PostModel {
    private String userName, location, description;
    private int lakeAmount, postImage;
    private List<PostCommentsModel> coments;

    public PostModel(String userName, String location, String description, int lakeAmount, int postImage, List<PostCommentsModel> coments) {
        this.userName = userName;
        this.location = location;
        this.description = description;
        this.lakeAmount = lakeAmount;
        this.postImage = postImage;
        this.coments = coments;
    }

    public PostModel(String userName, String location, String description, int lakeAmount, int postImage) {
        this.userName = userName;
        this.location = location;
        this.description = description;
        this.lakeAmount = lakeAmount;
        this.postImage = postImage;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getLakeAmount() {
        return lakeAmount;
    }

    public int getPostImage() {
        return postImage;
    }

    public List<PostCommentsModel> getComents() {
        return coments;
    }
}
