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
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = Contants.DATABASE_NAME;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS userData");
        onCreate(db);

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public void onCreate(SQLiteDatabase db) {
        String CREATE_user_TABLE = "CREATE TABLE userData(textdata TEXT)";
        db.execSQL(CREATE_user_TABLE);

    }

    //--------------------------userDataData---------------
    public boolean upsertUserData(Result ob) {
        boolean done = false;
        Result data = null;
        if (ob.getTextdata() == null) {
            //data = getUserDataByLoginId(ob.getTextdata());
            //if (data == null) {
            done = insertUserData(ob);
        } else {
            done = updateUserData(ob);
            //}
        }
        return done;
    }

    //userData data
    public Result getUserDataByLoginId(String textdata) {

        String query = "Select * FROM userData WHERE textdata = '" + textdata + "' ";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Result data = new Result();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            populateUserData(cursor, data);

            cursor.close();
        } else {
            data = null;
        }
        db.close();
        return data;
    }

    // for user data..........
    private void populateUserData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    //get all city data
    public List<Result> getAllUserData() {
        String query = "Select * FROM userData ";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateUserData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    //insert userData data.............
    public boolean insertUserData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("userData", null, values);
        db.close();
        return i > 0;
    }

    //userData data
    public Result getUserData() {

        String query = "Select * FROM userData";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Result data = new Result();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            populateUserData(cursor, data);

            cursor.close();
        } else {
            data = null;
        }
        db.close();
        return data;
    }

    //update user data
    public boolean updateUserData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();
        long i = 0;
        i = db.update("userData", values, null, null);

        db.close();
        return i > 0;
    }

    // delete Address Data from addressId
    public boolean deleteUserData(int LoginId) {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "LoginId = " + LoginId + " ";
        db.delete("userData", query, null);
        db.close();
        return result;
    }
}