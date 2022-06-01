package com.example.instagram;

public class PostCommentsModel {
    private int image;
    private String username, commentsTxt;

    public PostCommentsModel(int image, String username, String commentsTxt) {
        this.image = image;
        this.username = username;
        this.commentsTxt = commentsTxt;
    }

    public int getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public String getCommentsTxt() {
        return commentsTxt;
    }
}
