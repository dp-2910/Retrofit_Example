package com.example.serpentcs.retrofitwithgsonexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by serpentcs on 13/12/17.
 */

public class RepoModel {

    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;
    @SerializedName("full_name")
    String full_name;
    @SerializedName("html_url")
    String html_url;
    @SerializedName("description")
    String description;
    @SerializedName("url")
    String url;
    @SerializedName("owner")
    RepoOwner repoOwner;

    public RepoModel(int id, String name, String full_name, String html_url, String description, String url, RepoOwner repoOwner) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.html_url = html_url;
        this.description = description;
        this.url = url;
        this.repoOwner = repoOwner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public RepoOwner getRepoOwner() {
        return repoOwner;
    }

    @Override
    public String toString() {
        return "RepoModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", html_url='" + html_url + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
