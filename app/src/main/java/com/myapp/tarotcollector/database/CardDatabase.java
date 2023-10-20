```java
package com.myapp.tarotcollector.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.myapp.tarotcollector.models.Card;
import com.myapp.tarotcollector.models.Set;

public class CardDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tarotCollector.db";
    private static final int DATABASE_VERSION = 1;

    public CardDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CARD_TABLE = "CREATE TABLE " + Card.TABLE_NAME + "("
                + Card.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Card.COLUMN_NAME + " TEXT,"
                + Card.COLUMN_IMAGE + " TEXT,"
                + Card.COLUMN_DESCRIPTION + " TEXT" + ")";

        String CREATE_SET_TABLE = "CREATE TABLE " + Set.TABLE_NAME + "("
                + Set.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Set.COLUMN_NAME + " TEXT,"
                + Set.COLUMN_CARDS + " TEXT" + ")";

        db.execSQL(CREATE_CARD_TABLE);
        db.execSQL(CREATE_SET_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Card.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Set.TABLE_NAME);
        onCreate(db);
    }
}
```