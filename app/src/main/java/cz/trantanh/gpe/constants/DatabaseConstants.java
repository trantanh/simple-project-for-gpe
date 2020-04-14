package cz.trantanh.gpe.constants;

/**
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public final class DatabaseConstants {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "store";
    public static final String TABLE_NAME = "products";
    public static final String ID = "_id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_PRICE = "price";
    public static final String COLUMN_NAME_BARCODE = "barcode";
    public static final String COLUMN_NAME_CREATED = "created";

    public static final String SQL_CREATE_PRODUCTS =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NAME_NAME + " TEXT," +
                    COLUMN_NAME_PRICE + " NUMERIC," +
                    COLUMN_NAME_BARCODE + " TEXT," +
                    COLUMN_NAME_CREATED + " TEXT" +
                    ")";
}
