package com.zyc.entity;

public class DemoUser {

    private long id;
    private String title;
    private Integer found;
    private String photo;

    public DemoUser(long id, String title, Integer found, String photo) {
        this.id = id;
        this.title = title;
        this.found = found;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "DemoUser{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", found=" + found +
                ", photo='" + photo + '\'' +
                '}';
    }
}
