package cz.trantanh.gpe.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static cz.trantanh.gpe.constants.DatabaseConstants.DATABASE_NAME;
import static cz.trantanh.gpe.constants.DatabaseConstants.DATABASE_VERSION;
import static cz.trantanh.gpe.constants.DatabaseConstants.SQL_CREATE_PRODUCTS;
import static cz.trantanh.gpe.constants.DatabaseConstants.TABLE_NAME;


/**
 * Abstract of SQL Lite
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PRODUCTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
