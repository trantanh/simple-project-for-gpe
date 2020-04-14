package cz.trantanh.gpe.dao.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import cz.trantanh.gpe.dao.DatabaseHelper;
import cz.trantanh.gpe.dao.ProductDao;
import cz.trantanh.gpe.model.Product;

import static cz.trantanh.gpe.constants.DatabaseConstants.COLUMN_NAME_BARCODE;
import static cz.trantanh.gpe.constants.DatabaseConstants.COLUMN_NAME_CREATED;
import static cz.trantanh.gpe.constants.DatabaseConstants.COLUMN_NAME_NAME;
import static cz.trantanh.gpe.constants.DatabaseConstants.COLUMN_NAME_PRICE;
import static cz.trantanh.gpe.constants.DatabaseConstants.ID;
import static cz.trantanh.gpe.constants.DatabaseConstants.TABLE_NAME;

/**
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public class ProductDaoImpl implements ProductDao {

    private DatabaseHelper databaseHelper;

    public ProductDaoImpl(Context context) {
        databaseHelper = new DatabaseHelper(context);
    }

    @Override
    public boolean save(Product product) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID, product.getId());
        contentValues.put(COLUMN_NAME_NAME, product.getName());
        contentValues.put(COLUMN_NAME_PRICE, product.getPrice());
        contentValues.put(COLUMN_NAME_BARCODE, product.getBarcode());
        contentValues.put(COLUMN_NAME_CREATED, product.getCreated());
        long isInsert = db.insert(TABLE_NAME, null, contentValues);
        return isInsert > 0;
    }

    @Override
    public Product findBytId(int id) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        String[] projection = {ID, COLUMN_NAME_NAME, COLUMN_NAME_PRICE, COLUMN_NAME_BARCODE, COLUMN_NAME_CREATED};
        Cursor cursor = db.query(TABLE_NAME, projection, "id=?", new String[]{String.valueOf(id)}, null, null, null);
        Product product = new Product("1", "product", 4.5, "123456", "14.04.2020");
        return product;
    }

    @Override
    public boolean deleteBytId(int id) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int isDelete = db.delete(TABLE_NAME, ID + " = ?", new String[]{String.valueOf(id)});
        return isDelete > 0;
    }
}
