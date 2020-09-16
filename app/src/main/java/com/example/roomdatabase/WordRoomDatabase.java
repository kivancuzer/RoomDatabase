package com.example.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Word.class}, version = 1,exportSchema = false)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao wordDao();

    public static WordRoomDatabase instance;

    static WordRoomDatabase getInstance(Context context){
        if(instance == null){
            synchronized (WordRoomDatabase.class){
                if(instance == null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),WordRoomDatabase.class,"word_database").allowMainThreadQueries().build();
                }
            }
        }
        return instance;
    }

}
