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
    public static final int DATABASE_VERSION = 7;
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
        db.execSQL("DROP TABLE IF EXISTS favouritetbl");
        db.execSQL("DROP TABLE IF EXISTS englishfavouritetbl");
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
        String CREATE_favouritetbl_TABLE = "CREATE TABLE favouritetbl(textdata TEXT)";
        db.execSQL(CREATE_hindiLove_TABLE);
        db.execSQL(CREATE_hindisad_TABLE);
        db.execSQL(CREATE_hindiromantic_TABLE);
        db.execSQL(CREATE_hindifunny_TABLE);
        db.execSQL(CREATE_hindiyaad_TABLE);
        db.execSQL(CREATE_favouritetbl_TABLE);
        String CREATE_englishLove_TABLE = "CREATE TABLE englishLove(textdata TEXT)";
        String CREATE_englishsad_TABLE = "CREATE TABLE englishsad(textdata TEXT)";
        String CREATE_englishromantic_TABLE = "CREATE TABLE englishromantic(textdata TEXT)";
        String CREATE_englishfunny_TABLE = "CREATE TABLE englishfunny(textdata TEXT)";
        String CREATE_englishyaad_TABLE = "CREATE TABLE englishyaad(textdata TEXT)";
        String CREATE_englishfavouritetbl_TABLE = "CREATE TABLE englishfavouritetbl(textdata TEXT)";
        db.execSQL(CREATE_englishLove_TABLE);
        db.execSQL(CREATE_englishsad_TABLE);
        db.execSQL(CREATE_englishromantic_TABLE);
        db.execSQL(CREATE_englishfunny_TABLE);
        db.execSQL(CREATE_englishyaad_TABLE);
        db.execSQL(CREATE_englishfavouritetbl_TABLE);

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
    //...............................favourite shayaries...................

    //insertFavouriteData......................................................................
    public boolean insertFavouriteData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());
        //values.put("position", ob.getPosition());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("favouritetbl", null, values);
        db.close();
        return i > 0;
    }

    //getAllFavouriteData
    public List<Result> getAllFavouriteData() {
        String query = "Select * FROM favouritetbl ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateFavouriteData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }
    public Result getallFavouriteData(String textdata, int position) {

        String query = "Select * FROM favouritetbl WHERE textdata= '" + textdata + "' AND position =" + position + "";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Result data = new Result();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            populateFavouriteData(cursor, data);

            cursor.close();
        } else {
            data = null;
        }
        db.close();
        return data;
    }

    public Result getallFavouriteData(String textdata) {

        String query = "Select * FROM favouritetbl WHERE textdata= '" + textdata + "'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Result data = new Result();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            populateFavouriteData(cursor, data);

            cursor.close();
        } else {
            data = null;
        }
        db.close();
        return data;
    }

    private void populateFavouriteData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
        //ob.setPosition(cursor.getInt(1));
    }


    public boolean deleteFavouriteData(String textdata) {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "textdata = '" + textdata + "' ";
        db.delete("favouritetbl", query, null);
        db.close();
        return result;

    }


    //...............................english....................................


    //insert englishLove data.............
    public boolean insertEnglishLoveData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishLove", null, values);
        db.close();
        return i > 0;
    }

    //getAllEnglishLoveData
    public List<Result> getAllEnglishLoveData() {
        String query = "Select * FROM englishLove ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishLoveData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishLoveData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishLoveData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishLove", null, null);
        db.close();
        return result;
    }


    //insert English sad data......................................................................
    public boolean insertEnglishSadData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishsad", null, values);
        db.close();
        return i > 0;
    }

    //getAllEnglishSadData
    public List<Result> getAllEnglishSadData() {
        String query = "Select * FROM englishsad ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishSadData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishSadData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishSadData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishsad", null, null);
        db.close();
        return result;
    }


    //insertEnglishRomanticData......................................................................
    public boolean insertEnglishRomanticData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiromantic", null, values);
        db.close();
        return i > 0;
    }

    //getAllEnglishRomanticData
    public List<Result> getAllEnglishRomanticData() {
        String query = "Select * FROM hindiromantic ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishRomanticData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishRomanticData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishRomanticData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiromantic", null, null);
        db.close();
        return result;
    }


    //insertEnglishFunnyData......................................................................
    public boolean insertEnglishFunnyData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishfunny", null, values);
        db.close();
        return i > 0;
    }

    //ggetAllEnglishFunnyData
    public List<Result> getAllEnglishFunnyData() {
        String query = "Select * FROM englishfunny ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishFunnyData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishFunnyData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishFunnyData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishfunny", null, null);
        db.close();
        return result;
    }

    //insertEnglishYaadData......................................................................
    public boolean insertEnglishYaadData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishyaad", null, values);
        db.close();
        return i > 0;
    }

    //getAllEnglishYaadData
    public List<Result> getAllEnglishYaadData() {
        String query = "Select * FROM englishyaad ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishYaadData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishYaadData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishYaadData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishyaad", null, null);
        db.close();
        return result;
    }
    //...............................favourite shayaries...................

    //insertFavouriteData......................................................................
    public boolean insertEnglishFavouriteData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());
//        values.put("position", ob.getPosition());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("favouritetbl", null, values);
        db.close();
        return i > 0;
    }

    //getAllFavouriteData
    public List<Result> getAllEnglishFavouriteData() {
        String query = "Select * FROM englishfavouritetbl ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishFavouriteData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    public Result getallEnglishFavouriteData(String textdata) {

        String query = "Select * FROM englishfavouritetbl WHERE textdata= '" + textdata + "'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Result data = new Result();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            populateEnglishFavouriteData(cursor, data);

            cursor.close();
        } else {
            data = null;
        }
        db.close();
        return data;
    }

    private void populateEnglishFavouriteData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
//        ob.setPosition(cursor.getInt(1));
    }


    public boolean deleteEnglishFavouriteData(String textdata) {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "textdata = '" + textdata + "' ";
        db.delete("englishfavouritetbl", query, null);
        db.close();
        return result;
    }
}