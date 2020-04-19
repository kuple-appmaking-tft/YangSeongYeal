package com.example.kupleapp.Model;

public class PostPhoto {
    private int image;
    private String contents;
    private String title;

    public PostPhoto(int image, String contents, String title) {
        this.image = image;
        this.contents = contents;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Post_Photo{" +
                "image=" + image +
                ", contents='" + contents + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
