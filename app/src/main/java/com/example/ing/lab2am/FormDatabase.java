package com.example.ing.lab2am;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;



@Database (entities = {Forms.class}, version = 1, exportSchema = false)
public abstract class FormDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess() ;
}