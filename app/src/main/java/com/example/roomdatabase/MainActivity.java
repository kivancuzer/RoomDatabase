package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WordRoomDatabase wordRoomDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addWord();


    }

    public void addWord(){
        Word word = new Word("kivanc");
        wordRoomDatabase = WordRoomDatabase.getInstance(this);
        wordRoomDatabase.wordDao().addWord(word);
        System.out.println(wordRoomDatabase.wordDao().getWords());
    }

}