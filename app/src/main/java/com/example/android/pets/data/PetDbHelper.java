package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by Amanda on 1/31/2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    //Database version must be incremented if database schema is changed
    public static final int DATABASE_VERSION = 1;
    //Name of the database file
    public static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //deletes old database and schema and builds new database
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                    PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PetEntry.COLUMN_PET_NAME + " TEXT, " +
                    PetEntry.COLUMN_PET_BREED + " TEXT, " +
                    PetEntry.COLUMN_PET_GENDER + " INTEGER, " +
                    PetEntry.COLUMN_PET_WEIGHT + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;
}
