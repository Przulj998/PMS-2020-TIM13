package com.example.emailapplication.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "photo")
public class Photo {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public Long id;
    public String path;

    public Photo(Long id, String path, int contactOwnerId) {
        this.id = id;
        this.path = path;
        this.contactOwnerId = contactOwnerId;
    }

    public int getContactOwnerId() {
        return contactOwnerId;
    }

    public void setContactOwnerId(int contactOwnerId) {
        this.contactOwnerId = contactOwnerId;
    }

    public int contactOwnerId;

  /*  public Photo(Long id, String path) {
        this.id = id;
        this.path = path;
     } */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
