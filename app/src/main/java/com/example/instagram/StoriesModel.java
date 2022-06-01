package com.example.instagram;

import java.util.List;

public class StoriesModel {

    private String UsenName;
    private int imgUser;
    private List<Integer> images;
    private Boolean isAddStory;

    public StoriesModel(Boolean isAddStory) {
        this.isAddStory = isAddStory;
    }

    public StoriesModel(String usenName, int imgUser, List<Integer> images, Boolean isAddStory) {
        UsenName = usenName;
        this.imgUser = imgUser;
        this.images = images;
        this.isAddStory = isAddStory;
    }

    public String getUsenName() {
        return UsenName;
    }

    public int getImgUser() {
        return imgUser;
    }

    public List<Integer> getImages() {
        return images;
    }

    public Boolean getAddStory() {
        return isAddStory;
    }
}
