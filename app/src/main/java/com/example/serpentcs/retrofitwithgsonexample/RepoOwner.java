package com.example.serpentcs.retrofitwithgsonexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by serpentcs on 13/12/17.
 */

public class RepoOwner {

    @SerializedName("id")
    int id;
    @SerializedName("login")
    String login;
    @SerializedName("avatar_url")
    String avatar_url;
    @SerializedName("type")
    String type;

    public RepoOwner(int id, String login, String avatar_url, String type) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar_url;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "RepoOwner{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
