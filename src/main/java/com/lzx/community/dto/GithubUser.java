package com.lzx.community.dto;

import org.springframework.stereotype.Component;

@Component
public class GithubUser {
    private String name;
    private String location;
    private String bio;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", bio='" + bio + '\'' +
                ", id=" + id +
                '}';
    }
}
