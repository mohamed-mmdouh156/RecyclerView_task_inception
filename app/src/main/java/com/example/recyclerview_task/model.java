package com.example.recyclerview_task;

public class model {

    private int user_image ;
    private String username , description;
    private int user_photo ;


    public model(int user_image, String username, String description, int user_photo) {
        this.user_image = user_image;
        this.username = username;
        this.description = description;
        this.user_photo = user_photo;
    }

    public int getUser_image() {
        return user_image;
    }

    public void setUser_image(int user_image) {
        this.user_image = user_image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUser_photo() {
        return user_photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser_photo(int user_photo) {
        this.user_photo = user_photo;
    }
}
