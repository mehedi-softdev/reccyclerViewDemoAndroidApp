package com.myapp.recylcerviewdemo;

public class Contact {
    private String name;
    private String email;
    private String imageURL;

    public Contact(String name, String email, String imageURL) {
        this.name = name;
        this.email = email;
        this.imageURL = imageURL;
    }
    public Contact() {}
//  setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

//    getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageURL() {
        return imageURL;
    }
}
