package com.example.ing.lab2am;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface daoAccess {

    @Insert
    void insertOnlySingleForm (Forms forms);
    @Insert
    void insertMultipleForms (List<Forms> FormsList);
    @Query("SELECT * FROM Forms WHERE FormId = :FormId")
    Forms fetchOneFormsbyFormId (int formId);
    @Update
    void updateForm (Forms forms);
    @Delete
    void deleteForm (Forms forms);
}

