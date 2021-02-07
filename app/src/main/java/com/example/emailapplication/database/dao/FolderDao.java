package com.example.emailapplication.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public abstract class FolderDao {

    @Query("SELECT * FROM `folder`")
    public abstract List<Folder> allFolders();

    @Query("SELECT * FROM `folder` WHERE name= :name")
    public abstract List<Folder> findFolder(String name);

    @Query("DELETE FROM `folder` WHERE id= :id")
    public abstract void deleteFolder(String id);

    @Query("UPDATE `folder` SET name= :name WHERE id= :id")
    public abstract void editFolder(String name, String id);

}
