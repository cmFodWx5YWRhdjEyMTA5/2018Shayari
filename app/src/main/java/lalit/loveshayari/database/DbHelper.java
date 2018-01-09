package lalit.loveshayari.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;


public class DbHelper extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = Contants.DATABASE_NAME;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS hindiLove");
        db.execSQL("DROP TABLE IF EXISTS hindisad");
        db.execSQL("DROP TABLE IF EXISTS hindiromantic");
        db.execSQL("DROP TABLE IF EXISTS hindifunny");
        db.execSQL("DROP TABLE IF EXISTS hindiyaad");
        db.execSQL("DROP TABLE IF EXISTS englishLove");
        db.execSQL("DROP TABLE IF EXISTS englishsad");
        db.execSQL("DROP TABLE IF EXISTS englishromantic");
        db.execSQL("DROP TABLE IF EXISTS englishfunny");
        db.execSQL("DROP TABLE IF EXISTS englishyaad");
        onCreate(db);

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public void onCreate(SQLiteDatabase db) {
        String CREATE_hindiLove_TABLE = "CREATE TABLE hindiLove(textdata TEXT)";
        String CREATE_hindisad_TABLE = "CREATE TABLE hindisad(textdata TEXT)";
        String CREATE_hindiromantic_TABLE = "CREATE TABLE hindiromantic(textdata TEXT)";
        String CREATE_hindifunny_TABLE = "CREATE TABLE hindifunny(textdata TEXT)";
        String CREATE_hindiyaad_TABLE = "CREATE TABLE hindiyaad(textdata TEXT)";
        db.execSQL(CREATE_hindiLove_TABLE);
        db.execSQL(CREATE_hindisad_TABLE);
        db.execSQL(CREATE_hindiromantic_TABLE);
        db.execSQL(CREATE_hindifunny_TABLE);
        db.execSQL(CREATE_hindiyaad_TABLE);

    }

    //insert hindiLove data.............
    public boolean inserthindiLoveData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiLove", null, values);
        db.close();
        return i > 0;
    }

    //getAllhindiLoveData
    public List<Result> getAllhindiLoveData() {
        String query = "Select * FROM hindiLove ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiLoveData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiLoveData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiLoveData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiLove", null, null);
        db.close();
        return result;
    }


    //insert hind sad data......................................................................
    public boolean inserthindiSadData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindisad", null, values);
        db.close();
        return i > 0;
    }

    //getAllhindiSadData
    public List<Result> getAllhindiSadData() {
        String query = "Select * FROM hindisad ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiSadData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiSadData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiSadData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindisad", null, null);
        db.close();
        return result;
    }


    //inserthindiRomanticData......................................................................
    public boolean inserthindiRomanticData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiromantic", null, values);
        db.close();
        return i > 0;
    }

    //getAllhindiRomanticData
    public List<Result> getAllhindiRomanticData() {
        String query = "Select * FROM hindiromantic ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiRomanticData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiRomanticData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiRomanticData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiromantic", null, null);
        db.close();
        return result;
    }


    //inserthindiFunnyData......................................................................
    public boolean inserthindiFunnyData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindifunny", null, values);
        db.close();
        return i > 0;
    }

    //ggetAllhindiFunnyData
    public List<Result> getAllhindiFunnyData() {
        String query = "Select * FROM hindifunny ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiFunnyData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiFunnyData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiFunnyData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindifunny", null, null);
        db.close();
        return result;
    }

    //inserthindiYaadData......................................................................
    public boolean inserthindiYaadData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiyaad", null, values);
        db.close();
        return i > 0;
    }

    //getAllhindiYaadData
    public List<Result> getAllhindiYaadData() {
        String query = "Select * FROM hindiyaad ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiYaadData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiYaadData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiYaadData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiyaad", null, null);
        db.close();
        return result;
    }
}