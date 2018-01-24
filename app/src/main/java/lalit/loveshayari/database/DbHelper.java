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
    public static final int DATABASE_VERSION = 10;
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
        db.execSQL("DROP TABLE IF EXISTS hindiAankhein");
        db.execSQL("DROP TABLE IF EXISTS hindiAansoo");
        db.execSQL("DROP TABLE IF EXISTS hindiAlone");
        db.execSQL("DROP TABLE IF EXISTS hindiAttitude");
        db.execSQL("DROP TABLE IF EXISTS hindiBeauty");
        db.execSQL("DROP TABLE IF EXISTS hindiBewafa");
        db.execSQL("DROP TABLE IF EXISTS hindiBirthday");
        db.execSQL("DROP TABLE IF EXISTS hindiBollywood");
        db.execSQL("DROP TABLE IF EXISTS hindiBrokenHeart");
        db.execSQL("DROP TABLE IF EXISTS hindiDeshBhakti");
        db.execSQL("DROP TABLE IF EXISTS hindiDilShayari");
        db.execSQL("DROP TABLE IF EXISTS hindiDooriyan");
        db.execSQL("DROP TABLE IF EXISTS hindiDua");
        db.execSQL("DROP TABLE IF EXISTS hindiFriendship");
        db.execSQL("DROP TABLE IF EXISTS hindiHeartTouching");
        db.execSQL("DROP TABLE IF EXISTS hindiInspirational");
        db.execSQL("DROP TABLE IF EXISTS hindiInsult");
        db.execSQL("DROP TABLE IF EXISTS hindiIntezaar");
        db.execSQL("DROP TABLE IF EXISTS hindiJudai");
        db.execSQL("DROP TABLE IF EXISTS hindiMaa");
        db.execSQL("DROP TABLE IF EXISTS hindiMausam");
        db.execSQL("DROP TABLE IF EXISTS hindiMaut");
        db.execSQL("DROP TABLE IF EXISTS hindiNafrat");
        db.execSQL("DROP TABLE IF EXISTS hindiSharab");
        db.execSQL("DROP TABLE IF EXISTS hindiShayariOnLife");
        db.execSQL("DROP TABLE IF EXISTS hindiSorry");
        db.execSQL("DROP TABLE IF EXISTS hindiTwoLineShayari");
        db.execSQL("DROP TABLE IF EXISTS favouritetbl");
        db.execSQL("DROP TABLE IF EXISTS englishLove");
        db.execSQL("DROP TABLE IF EXISTS englishsad");
        db.execSQL("DROP TABLE IF EXISTS englishromantic");
        db.execSQL("DROP TABLE IF EXISTS englishfunny");
        db.execSQL("DROP TABLE IF EXISTS englishyaad");
        db.execSQL("DROP TABLE IF EXISTS englishAankhein");
        db.execSQL("DROP TABLE IF EXISTS englishAansoo");
        db.execSQL("DROP TABLE IF EXISTS englishAlone");
        db.execSQL("DROP TABLE IF EXISTS englishAttitude");
        db.execSQL("DROP TABLE IF EXISTS englishBeauty");
        db.execSQL("DROP TABLE IF EXISTS englishBewafa");
        db.execSQL("DROP TABLE IF EXISTS englishBirthday");
        db.execSQL("DROP TABLE IF EXISTS englishBollywood");
        db.execSQL("DROP TABLE IF EXISTS englishBrokenHeart");
        db.execSQL("DROP TABLE IF EXISTS englishDeshBhakti");
        db.execSQL("DROP TABLE IF EXISTS englishDilShayari");
        db.execSQL("DROP TABLE IF EXISTS englishDooriyan");
        db.execSQL("DROP TABLE IF EXISTS englishDua");
        db.execSQL("DROP TABLE IF EXISTS englishFriendship");
        db.execSQL("DROP TABLE IF EXISTS englishHeartTouching");
        db.execSQL("DROP TABLE IF EXISTS englishInspirational");
        db.execSQL("DROP TABLE IF EXISTS englishInsult");
        db.execSQL("DROP TABLE IF EXISTS englishIntezaar");
        db.execSQL("DROP TABLE IF EXISTS englishJudai");
        db.execSQL("DROP TABLE IF EXISTS englishMaa");
        db.execSQL("DROP TABLE IF EXISTS englishMausam");
        db.execSQL("DROP TABLE IF EXISTS englishMaut");
        db.execSQL("DROP TABLE IF EXISTS englishNafrat");
        db.execSQL("DROP TABLE IF EXISTS englishSharab");
        db.execSQL("DROP TABLE IF EXISTS englishShayariOnLife");
        db.execSQL("DROP TABLE IF EXISTS englishSorry");
        db.execSQL("DROP TABLE IF EXISTS englishTwoLineShayari");
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
        String CREATE_hindiAankhein_TABLE = "CREATE TABLE hindiAankhein(textdata TEXT)";
        String CREATE_hindiAansoo_TABLE = "CREATE TABLE hindiAansoo(textdata TEXT)";
        String CREATE_hindiAlone_TABLE = "CREATE TABLE hindiAlone(textdata TEXT)";
        String CREATE_hindiAttitude_TABLE = "CREATE TABLE hindiAttitude(textdata TEXT)";
        String CREATE_hindiBeauty_TABLE = "CREATE TABLE hindiBeauty(textdata TEXT)";
        String CREATE_hindiBewafa_TABLE = "CREATE TABLE hindiBewafa(textdata TEXT)";
        String CREATE_hindiBirthday_TABLE = "CREATE TABLE hindiBirthday(textdata TEXT)";
        String CREATE_hindiBollywood_TABLE = "CREATE TABLE hindiBollywood(textdata TEXT)";
        String CREATE_hindiBrokenHeart_TABLE = "CREATE TABLE hindiBrokenHeart(textdata TEXT)";
        String CREATE_hindiDeshBhakti_TABLE = "CREATE TABLE hindiDeshBhakti(textdata TEXT)";
        String CREATE_hindiDilShayari_TABLE = "CREATE TABLE hindiDilShayari(textdata TEXT)";
        String CREATE_hindiDooriyan_TABLE = "CREATE TABLE hindiDooriyan(textdata TEXT)";
        String CREATE_hindiDua_TABLE = "CREATE TABLE hindiDua(textdata TEXT)";
        String CREATE_hindiFriendship_TABLE = "CREATE TABLE hindiFriendship(textdata TEXT)";
        String CREATE_hindiHeartTouching_TABLE = "CREATE TABLE hindiHeartTouching(textdata TEXT)";
        String CREATE_hindiInspirational_TABLE = "CREATE TABLE hindiInspirational(textdata TEXT)";
        String CREATE_hindiInsult_TABLE = "CREATE TABLE hindiInsult(textdata TEXT)";
        String CREATE_hindiIntezaar_TABLE = "CREATE TABLE hindiIntezaar(textdata TEXT)";
        String CREATE_hindiJudai_TABLE = "CREATE TABLE hindiJudai(textdata TEXT)";
        String CREATE_hindiMaa_TABLE = "CREATE TABLE hindiMaa(textdata TEXT)";
        String CREATE_hindiMausam_TABLE = "CREATE TABLE hindiMausam(textdata TEXT)";
        String CREATE_hindiMaut_TABLE = "CREATE TABLE hindiMaut(textdata TEXT)";
        String CREATE_hindiNafrat_TABLE = "CREATE TABLE hindiNafrat(textdata TEXT)";
        String CREATE_hindiSharab_TABLE = "CREATE TABLE hindiSharab(textdata TEXT)";
        String CREATE_hindiShayariOnLife_TABLE = "CREATE TABLE hindiShayariOnLife(textdata TEXT)";
        String CREATE_hindiSorry_TABLE = "CREATE TABLE hindiSorry(textdata TEXT)";
        String CREATE_hindiTwoLineShayari_TABLE = "CREATE TABLE hindiTwoLineShayari(textdata TEXT)";


        String CREATE_favouritetbl_TABLE = "CREATE TABLE favouritetbl(textdata TEXT)";
        db.execSQL(CREATE_favouritetbl_TABLE);
        db.execSQL(CREATE_hindiLove_TABLE);
        db.execSQL(CREATE_hindisad_TABLE);
        db.execSQL(CREATE_hindiromantic_TABLE);
        db.execSQL(CREATE_hindifunny_TABLE);
        db.execSQL(CREATE_hindiyaad_TABLE);
        db.execSQL(CREATE_hindiAankhein_TABLE);
        db.execSQL(CREATE_hindiAansoo_TABLE);
        db.execSQL(CREATE_hindiAlone_TABLE);
        db.execSQL(CREATE_hindiAttitude_TABLE);
        db.execSQL(CREATE_hindiBeauty_TABLE);
        db.execSQL(CREATE_hindiBewafa_TABLE);
        db.execSQL(CREATE_hindiBirthday_TABLE);
        db.execSQL(CREATE_hindiBollywood_TABLE);
        db.execSQL(CREATE_hindiBrokenHeart_TABLE);
        db.execSQL(CREATE_hindiDeshBhakti_TABLE);
        db.execSQL(CREATE_hindiDilShayari_TABLE);
        db.execSQL(CREATE_hindiDooriyan_TABLE);
        db.execSQL(CREATE_hindiDua_TABLE);
        db.execSQL(CREATE_hindiFriendship_TABLE);
        db.execSQL(CREATE_hindiHeartTouching_TABLE);
        db.execSQL(CREATE_hindiInspirational_TABLE);
        db.execSQL(CREATE_hindiInsult_TABLE);
        db.execSQL(CREATE_hindiIntezaar_TABLE);
        db.execSQL(CREATE_hindiJudai_TABLE);
        db.execSQL(CREATE_hindiMaa_TABLE);
        db.execSQL(CREATE_hindiMausam_TABLE);
        db.execSQL(CREATE_hindiMaut_TABLE);
        db.execSQL(CREATE_hindiNafrat_TABLE);
        db.execSQL(CREATE_hindiSharab_TABLE);
        db.execSQL(CREATE_hindiShayariOnLife_TABLE);
        db.execSQL(CREATE_hindiSorry_TABLE);
        db.execSQL(CREATE_hindiTwoLineShayari_TABLE);

        String CREATE_englishLove_TABLE = "CREATE TABLE englishLove(textdata TEXT)";
        String CREATE_englishsad_TABLE = "CREATE TABLE englishsad(textdata TEXT)";
        String CREATE_englishromantic_TABLE = "CREATE TABLE englishromantic(textdata TEXT)";
        String CREATE_englishfunny_TABLE = "CREATE TABLE englishfunny(textdata TEXT)";
        String CREATE_englishyaad_TABLE = "CREATE TABLE englishyaad(textdata TEXT)";
        String CREATE_englishAankhein_TABLE = "CREATE TABLE englishAankhein(textdata TEXT)";
        String CREATE_englishAansoo_TABLE = "CREATE TABLE englishAansoo(textdata TEXT)";
        String CREATE_englishAlone_TABLE = "CREATE TABLE englishAlone(textdata TEXT)";
        String CREATE_englishAttitude_TABLE = "CREATE TABLE englishAttitude(textdata TEXT)";
        String CREATE_englishBeauty_TABLE = "CREATE TABLE englishBeauty(textdata TEXT)";
        String CREATE_englishBewafa_TABLE = "CREATE TABLE englishBewafa(textdata TEXT)";
        String CREATE_englishBirthday_TABLE = "CREATE TABLE englishBirthday(textdata TEXT)";
        String CREATE_englishBollywood_TABLE = "CREATE TABLE englishBollywood(textdata TEXT)";
        String CREATE_englishBrokenHeart_TABLE = "CREATE TABLE englishBrokenHeart(textdata TEXT)";
        String CREATE_englishDeshBhakti_TABLE = "CREATE TABLE englishDeshBhakti(textdata TEXT)";
        String CREATE_englishDilShayari_TABLE = "CREATE TABLE englishDilShayari(textdata TEXT)";
        String CREATE_englishDooriyan_TABLE = "CREATE TABLE englishDooriyan(textdata TEXT)";
        String CREATE_englishDua_TABLE = "CREATE TABLE englishDua(textdata TEXT)";
        String CREATE_englishFriendship_TABLE = "CREATE TABLE englishFriendship(textdata TEXT)";
        String CREATE_englishHeartTouching_TABLE = "CREATE TABLE englishHeartTouching(textdata TEXT)";
        String CREATE_englishInspirational_TABLE = "CREATE TABLE englishInspirational(textdata TEXT)";
        String CREATE_englishInsult_TABLE = "CREATE TABLE englishInsult(textdata TEXT)";
        String CREATE_englishIntezaar_TABLE = "CREATE TABLE englishIntezaar(textdata TEXT)";
        String CREATE_englishJudai_TABLE = "CREATE TABLE englishJudai(textdata TEXT)";
        String CREATE_englishMaa_TABLE = "CREATE TABLE englishMaa(textdata TEXT)";
        String CREATE_englishMausam_TABLE = "CREATE TABLE englishMausam(textdata TEXT)";
        String CREATE_englishMaut_TABLE = "CREATE TABLE englishMaut(textdata TEXT)";
        String CREATE_englishNafrat_TABLE = "CREATE TABLE englishNafrat(textdata TEXT)";
        String CREATE_englishSharab_TABLE = "CREATE TABLE englishSharab(textdata TEXT)";
        String CREATE_englishShayariOnLife_TABLE = "CREATE TABLE englishShayariOnLife(textdata TEXT)";
        String CREATE_englishSorry_TABLE = "CREATE TABLE englishSorry(textdata TEXT)";
        String CREATE_englishTwoLineShayari_TABLE = "CREATE TABLE englishTwoLineShayari(textdata TEXT)";
        db.execSQL(CREATE_englishLove_TABLE);
        db.execSQL(CREATE_englishsad_TABLE);
        db.execSQL(CREATE_englishromantic_TABLE);
        db.execSQL(CREATE_englishfunny_TABLE);
        db.execSQL(CREATE_englishyaad_TABLE);
        db.execSQL(CREATE_englishAankhein_TABLE);
        db.execSQL(CREATE_englishAansoo_TABLE);
        db.execSQL(CREATE_englishAlone_TABLE);
        db.execSQL(CREATE_englishAttitude_TABLE);
        db.execSQL(CREATE_englishBeauty_TABLE);
        db.execSQL(CREATE_englishBewafa_TABLE);
        db.execSQL(CREATE_englishBirthday_TABLE);
        db.execSQL(CREATE_englishBollywood_TABLE);
        db.execSQL(CREATE_englishBrokenHeart_TABLE);
        db.execSQL(CREATE_englishDeshBhakti_TABLE);
        db.execSQL(CREATE_englishDilShayari_TABLE);
        db.execSQL(CREATE_englishDooriyan_TABLE);
        db.execSQL(CREATE_englishDua_TABLE);
        db.execSQL(CREATE_englishFriendship_TABLE);
        db.execSQL(CREATE_englishHeartTouching_TABLE);
        db.execSQL(CREATE_englishInspirational_TABLE);
        db.execSQL(CREATE_englishInsult_TABLE);
        db.execSQL(CREATE_englishIntezaar_TABLE);
        db.execSQL(CREATE_englishJudai_TABLE);
        db.execSQL(CREATE_englishMaa_TABLE);
        db.execSQL(CREATE_englishMausam_TABLE);
        db.execSQL(CREATE_englishMaut_TABLE);
        db.execSQL(CREATE_englishNafrat_TABLE);
        db.execSQL(CREATE_englishSharab_TABLE);
        db.execSQL(CREATE_englishShayariOnLife_TABLE);
        db.execSQL(CREATE_englishSorry_TABLE);
        db.execSQL(CREATE_englishTwoLineShayari_TABLE);

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

    //...............................hindiAankhein.....................................................
    public boolean inserthindiAankheinData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiAankhein", null, values);
        db.close();
        return i > 0;
    }

    //getAhindiAankhein
    public List<Result> getAllhindiAankheinData() {
        String query = "Select * FROM hindiAankhein";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiAankheinData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiAankheinData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiAankheinData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiAankhein", null, null);
        db.close();
        return result;
    }

    //...............................hindiAansoo.....................................................
    public boolean inserthindiAansooData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiAansoo", null, values);
        db.close();
        return i > 0;
    }

    //gethindiAansoo
    public List<Result> getAllhindiAansooData() {
        String query = "Select * FROM hindiAansoo";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiAansooData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiAansooData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiAansooData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiAansoo", null, null);
        db.close();
        return result;
    }

    //...............................hindiAlone.....................................................
    public boolean inserthindiAloneata(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiAlone", null, values);
        db.close();
        return i > 0;
    }

    //gethindiAlone
    public List<Result> getAllhindiAloneData() {
        String query = "Select * FROM hindiAlone";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiAloneData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiAloneData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiAloneData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiAlone", null, null);
        db.close();
        return result;
    }

    //...............................hindiAttitude.....................................................
    public boolean inserthindiAttitudeData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiAttitude", null, values);
        db.close();
        return i > 0;
    }

    //gethindiAttitude
    public List<Result> getAllhindiAttitudeData() {
        String query = "Select * FROM hindiAttitude";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiAttitudeData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiAttitudeData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiAttitudeData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiAttitude", null, null);
        db.close();
        return result;
    }

    //...............................hindiBeauty.....................................................
    public boolean inserthindiBeautyData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiBeauty", null, values);
        db.close();
        return i > 0;
    }

    //gethindiBeauty
    public List<Result> getAllhindiBeautyData() {
        String query = "Select * FROM hindiBeauty";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiBeautyData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiBeautyData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiBeautyData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiBeauty", null, null);
        db.close();
        return result;
    }

    //...............................hindiBewafa.....................................................
    public boolean inserthindiBewafaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiBewafa", null, values);
        db.close();
        return i > 0;
    }

    //gethindiBewafa
    public List<Result> getAllhindiBewafaData() {
        String query = "Select * FROM hindiBewafa";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiBewafaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiBewafaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiBewafaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiBewafa", null, null);
        db.close();
        return result;
    }

    //...............................hindiBirthday.....................................................
    public boolean inserthindiBirthdayData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiBirthday", null, values);
        db.close();
        return i > 0;
    }

    //gethindiBirthday
    public List<Result> getAllhindiBirthdayData() {
        String query = "Select * FROM hindiBirthday";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiBirthdayData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiBirthdayData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiBirthdayData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiBirthday", null, null);
        db.close();
        return result;
    }

    //...............................hindiBollywood.....................................................
    public boolean inserthindiBollywoodData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiBollywood", null, values);
        db.close();
        return i > 0;
    }

    //gethindiBollywood
    public List<Result> getAllhindiBollywoodData() {
        String query = "Select * FROM hindiBollywood";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiBollywoodData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiBollywoodData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiBollywoodData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiBollywood", null, null);
        db.close();
        return result;
    }

    //...............................hindiBrokenHeart.....................................................
    public boolean inserthindiBrokenHeartData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiBrokenHeart", null, values);
        db.close();
        return i > 0;
    }

    //gethindiBrokenHeart
    public List<Result> getAllhindiBrokenHeartData() {
        String query = "Select * FROM hindiBrokenHeart";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiBrokenHeartData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiBrokenHeartData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiBrokenHeartData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiBrokenHeart", null, null);
        db.close();
        return result;
    }

    //...............................hindiDeshBhakti.....................................................
    public boolean inserthindiDeshBhaktiData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiDeshBhakti", null, values);
        db.close();
        return i > 0;
    }

    //gethindiDeshBhakti
    public List<Result> getAllhindiDeshBhaktiData() {
        String query = "Select * FROM hindiDeshBhakti";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiDeshBhaktiData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiDeshBhaktiData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiDeshBhaktiData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiDeshBhakti", null, null);
        db.close();
        return result;
    }

    //...............................hindiDilShayari.....................................................
    public boolean inserthindiDilShayariData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiDilShayari", null, values);
        db.close();
        return i > 0;
    }

    //gethindiDilShayari
    public List<Result> getAllhindiDilShayariData() {
        String query = "Select * FROM hindiDilShayari";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiDilShayariData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiDilShayariData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiDilShayariData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiDilShayari", null, null);
        db.close();
        return result;
    }

    //...............................hindiDooriyan.....................................................
    public boolean inserthindiDooriyanData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiDooriyan", null, values);
        db.close();
        return i > 0;
    }

    //gethindiDooriyan
    public List<Result> getAllhindiDooriyanData() {
        String query = "Select * FROM hindiDooriyan";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiDooriyanData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiDooriyanData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiDooriyanData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiDooriyan", null, null);
        db.close();
        return result;
    }

    //...............................hindiDua.....................................................
    public boolean inserthindiDuaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiDua", null, values);
        db.close();
        return i > 0;
    }

    //gethindiDua
    public List<Result> getAllhindiDuaData() {
        String query = "Select * FROM hindiDua";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiDuaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiDuaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiDuaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiDua", null, null);
        db.close();
        return result;
    }

    //...............................hindiFriendship.....................................................
    public boolean inserthindiFriendshipData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiFriendship", null, values);
        db.close();
        return i > 0;
    }

    //gethindiFriendship
    public List<Result> getAllhindiFriendshipData() {
        String query = "Select * FROM hindiFriendship";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiFriendshipData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiFriendshipData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiFriendshipData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiFriendship", null, null);
        db.close();
        return result;
    }

    //...............................hindiHeartTouching.....................................................
    public boolean inserthindiHeartTouchingData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiHeartTouching", null, values);
        db.close();
        return i > 0;
    }

    //gethindiHeartTouching
    public List<Result> getAllhindiHeartTouchingData() {
        String query = "Select * FROM hindiHeartTouching";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiHeartTouchingData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiHeartTouchingData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiHeartTouchingData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiHeartTouching", null, null);
        db.close();
        return result;
    }

    //...............................hindiInspirational.....................................................
    public boolean inserthindiInspirationalData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiInspirational", null, values);
        db.close();
        return i > 0;
    }

    //gethindiInspirational
    public List<Result> getAllhindiInspirationalData() {
        String query = "Select * FROM hindiInspirational";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiInspirationalData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiInspirationalData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiInspirationalData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiInspirational", null, null);
        db.close();
        return result;
    }

    //...............................hindiInsult.....................................................
    public boolean inserthindiInsultData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiInsult", null, values);
        db.close();
        return i > 0;
    }

    //gethindiInsult
    public List<Result> getAllhindiInsultData() {
        String query = "Select * FROM hindiInsult";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiInsultData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiInsultData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiInsultData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiInsult", null, null);
        db.close();
        return result;
    }

    //...............................hindiIntezaar.....................................................
    public boolean inserthindiIntezaarData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiIntezaar", null, values);
        db.close();
        return i > 0;
    }

    //gethindiIntezaar
    public List<Result> getAllhindiIntezaarData() {
        String query = "Select * FROM hindiIntezaar";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiIntezaarData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiIntezaarData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiIntezaarData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiIntezaar", null, null);
        db.close();
        return result;
    }

    //...............................hindiJudai.....................................................
    public boolean inserthindiJudaiData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiJudai", null, values);
        db.close();
        return i > 0;
    }

    //gethindiJudai
    public List<Result> getAllhindiJudaiData() {
        String query = "Select * FROM hindiJudai";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiJudaiData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiJudaiData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean delethindiJudaiData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiJudai", null, null);
        db.close();
        return result;
    }

    //...............................hindiMaa.....................................................
    public boolean inserthindiMaaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiMaa", null, values);
        db.close();
        return i > 0;
    }

    //gethindiMaa
    public List<Result> getAllhindiMaaData() {
        String query = "Select * FROM hindiMaa";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiMaaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiMaaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean delethindiMaaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiMaa", null, null);
        db.close();
        return result;
    }

    //...............................hindiMausam.....................................................
    public boolean inserthindiMausamData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiMausam", null, values);
        db.close();
        return i > 0;
    }

    //gethindiMausam
    public List<Result> getAllhindiMausamData() {
        String query = "Select * FROM hindiMausam";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiMausamData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiMausamData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiMausamData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiMausam", null, null);
        db.close();
        return result;
    }

    //...............................hindiMaut.....................................................
    public boolean inserthindiMautData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiMaut", null, values);
        db.close();
        return i > 0;
    }

    //gethindiMaut
    public List<Result> getAllhindiMautData() {
        String query = "Select * FROM hindiMaut";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiMautData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiMautData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiMautData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiMaut", null, null);
        db.close();
        return result;
    }

    //...............................hindiNafrat.....................................................
    public boolean inserthindiNafratData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiNafrat", null, values);
        db.close();
        return i > 0;
    }

    //gethindiNafrat
    public List<Result> getAllhindiNafratData() {
        String query = "Select * FROM hindiNafrat";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiNafratData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiNafratData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiNafratData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiNafrat", null, null);
        db.close();
        return result;
    }

    //...............................hindiSharab.....................................................
    public boolean inserthindiSharabData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiSharab", null, values);
        db.close();
        return i > 0;
    }

    //gethindiSharab
    public List<Result> getAllhindiSharabData() {
        String query = "Select * FROM hindiSharab";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiSharabData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiSharabData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiSharabData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiSharab", null, null);
        db.close();
        return result;
    }

    //...............................hindiShayariOnLife.....................................................
    public boolean inserthindiShayariOnLifeData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiShayariOnLife", null, values);
        db.close();
        return i > 0;
    }

    //gethindiShayariOnLife
    public List<Result> getAllhindiShayariOnLifeData() {
        String query = "Select * FROM hindiShayariOnLife";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiShayariOnLifeData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiShayariOnLifeData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiShayariOnLifeData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiShayariOnLife", null, null);
        db.close();
        return result;
    }

    //...............................hindiSorry.....................................................
    public boolean inserthindiSorryData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiSorry", null, values);
        db.close();
        return i > 0;
    }

    //gethindiSorry
    public List<Result> getAllhindiSorryData() {
        String query = "Select * FROM hindiSorry";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiSorryData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiSorryData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiSorryData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiSorry", null, null);
        db.close();
        return result;
    }

    //...............................hindiTwoLineShayari.....................................................
    public boolean inserthindiTwoLineShayariData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("hindiTwoLineShayari", null, values);
        db.close();
        return i > 0;
    }

    //gethindiTwoLineShayari
    public List<Result> getAllhindiTwoLineShayariData() {
        String query = "Select * FROM hindiTwoLineShayari";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populatehindiTwoLineShayariData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populatehindiTwoLineShayariData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deletehindiTwoLineShayariData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("hindiTwoLineShayari", null, null);
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
        String query = "Select * FROM favouritetbl";

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

        long i = db.insert("englishromantic", null, values);
        db.close();
        return i > 0;
    }

    //getAllEnglishRomanticData
    public List<Result> getAllEnglishRomanticData() {
        String query = "Select * FROM englishromantic ";

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
        db.delete("englishromantic", null, null);
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

    //...............................EnglishAankhein.....................................................
    public boolean insertEnglishAankheinData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishAankhein", null, values);
        db.close();
        return i > 0;
    }

    //getAEnglishAankhein
    public List<Result> getAllEnglishAankheinData() {
        String query = "Select * FROM englishAankhein";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishAankheinData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishAankheinData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishAankheinData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishAankhein", null, null);
        db.close();
        return result;
    }

    //...............................englishAansoo.....................................................
    public boolean insertEnglishAansooData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishAansoo", null, values);
        db.close();
        return i > 0;
    }

    //getenglishAansoo
    public List<Result> getAllEnglishAansooData() {
        String query = "Select * FROM englishAansoo";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishAansooData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishAansooData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishAansooData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishAansoo", null, null);
        db.close();
        return result;
    }

    //...............................englishAlone.....................................................
    public boolean insertEnglishAloneata(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishAlone", null, values);
        db.close();
        return i > 0;
    }

    //getenglishAlone
    public List<Result> getAllEnglishAloneData() {
        String query = "Select * FROM englishAlone";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishAloneData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishAloneData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishAloneData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishAlone", null, null);
        db.close();
        return result;
    }

    //...............................englishAttitude.....................................................
    public boolean insertEnglishAttitudeData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishAttitude", null, values);
        db.close();
        return i > 0;
    }

    //getenglishAttitude
    public List<Result> getAllEnglishAttitudeData() {
        String query = "Select * FROM englishAttitude";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishAttitudeData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishAttitudeData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishAttitudeData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishAttitude", null, null);
        db.close();
        return result;
    }

    //...............................englishBeauty.....................................................
    public boolean insertEnglishBeautyData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishBeauty", null, values);
        db.close();
        return i > 0;
    }

    //getenglishBeauty
    public List<Result> getAllEnglishBeautyData() {
        String query = "Select * FROM englishBeauty";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishBeautyData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishBeautyData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishBeautyData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishBeauty", null, null);
        db.close();
        return result;
    }

    //...............................englishBewafa.....................................................
    public boolean insertEnglishBewafaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishBewafa", null, values);
        db.close();
        return i > 0;
    }

    //getenglishBewafa
    public List<Result> getAllEnglishBewafaData() {
        String query = "Select * FROM englishBewafa";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishBewafaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishBewafaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishBewafaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishBewafa", null, null);
        db.close();
        return result;
    }

    //...............................englishBirthday.....................................................
    public boolean insertEnglishBirthdayData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishBirthday", null, values);
        db.close();
        return i > 0;
    }

    //getenglishBirthday
    public List<Result> getAllEnglishBirthdayData() {
        String query = "Select * FROM englishBirthday";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishBirthdayData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishBirthdayData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishBirthdayData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishBirthday", null, null);
        db.close();
        return result;
    }

    //...............................englishBollywood.....................................................
    public boolean insertEnglishBollywoodData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishBollywood", null, values);
        db.close();
        return i > 0;
    }

    //getenglishBollywood
    public List<Result> getAllEnglishBollywoodData() {
        String query = "Select * FROM englishBollywood";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishBollywoodData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishBollywoodData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishBollywoodData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishBollywood", null, null);
        db.close();
        return result;
    }

    //...............................englishBrokenHeart.....................................................
    public boolean insertEnglishBrokenHeartData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishBrokenHeart", null, values);
        db.close();
        return i > 0;
    }

    //getenglishBrokenHeart
    public List<Result> getAllEnglishBrokenHeartData() {
        String query = "Select * FROM englishBrokenHeart";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishBrokenHeartData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishBrokenHeartData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishBrokenHeartData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishBrokenHeart", null, null);
        db.close();
        return result;
    }

    //...............................englishDeshBhakti.....................................................
    public boolean insertEnglishDeshBhaktiData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishDeshBhakti", null, values);
        db.close();
        return i > 0;
    }

    //getenglishDeshBhakti
    public List<Result> getAllEnglishDeshBhaktiData() {
        String query = "Select * FROM englishDeshBhakti";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishDeshBhaktiData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishDeshBhaktiData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishDeshBhaktiData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishDeshBhakti", null, null);
        db.close();
        return result;
    }

    //...............................englishDilShayari.....................................................
    public boolean insertEnglishDilShayariData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishDilShayari", null, values);
        db.close();
        return i > 0;
    }

    //getenglishDilShayari
    public List<Result> getAllEnglishDilShayariData() {
        String query = "Select * FROM englishDilShayari";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishDilShayariData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishDilShayariData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishDilShayariData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishDilShayari", null, null);
        db.close();
        return result;
    }

    //...............................englishDooriyan.....................................................
    public boolean insertEnglishDooriyanData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishDooriyan", null, values);
        db.close();
        return i > 0;
    }

    //getenglishDooriyan
    public List<Result> getAllEnglishDooriyanData() {
        String query = "Select * FROM englishDooriyan";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishDooriyanData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishDooriyanData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishDooriyanData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishDooriyan", null, null);
        db.close();
        return result;
    }

    //...............................englishDua.....................................................
    public boolean insertEnglishDuaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishDua", null, values);
        db.close();
        return i > 0;
    }

    //getenglishDua
    public List<Result> getAllEnglishDuaData() {
        String query = "Select * FROM englishDua";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishDuaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishDuaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishDuaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishDua", null, null);
        db.close();
        return result;
    }

    //...............................englishFriendship.....................................................
    public boolean insertEnglishFriendshipData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishFriendship", null, values);
        db.close();
        return i > 0;
    }

    //getenglishFriendship
    public List<Result> getAllEnglishFriendshipData() {
        String query = "Select * FROM englishFriendship";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishFriendshipData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishFriendshipData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishFriendshipData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishFriendship", null, null);
        db.close();
        return result;
    }

    //...............................englishHeartTouching.....................................................
    public boolean insertEnglishHeartTouchingData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishHeartTouching", null, values);
        db.close();
        return i > 0;
    }

    //getenglishHeartTouching
    public List<Result> getAllEnglishHeartTouchingData() {
        String query = "Select * FROM englishHeartTouching";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishHeartTouchingData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishHeartTouchingData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishHeartTouchingData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishHeartTouching", null, null);
        db.close();
        return result;
    }

    //...............................englishInspirational.....................................................
    public boolean insertEnglishInspirationalData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishInspirational", null, values);
        db.close();
        return i > 0;
    }

    //getenglishInspirational
    public List<Result> getAllEnglishInspirationalData() {
        String query = "Select * FROM englishInspirational";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishInspirationalData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishInspirationalData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishInspirationalData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishInspirational", null, null);
        db.close();
        return result;
    }

    //...............................englishInsult.....................................................
    public boolean insertEnglishInsultData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishInsult", null, values);
        db.close();
        return i > 0;
    }

    //getenglishInsult
    public List<Result> getAllEnglishInsultData() {
        String query = "Select * FROM englishInsult";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishInsultData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishInsultData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishInsultData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishInsult", null, null);
        db.close();
        return result;
    }

    //...............................englishIntezaar.....................................................
    public boolean insertEnglishIntezaarData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishIntezaar", null, values);
        db.close();
        return i > 0;
    }

    //getenglishIntezaar
    public List<Result> getAllEnglishIntezaarData() {
        String query = "Select * FROM englishIntezaar";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishIntezaarData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishIntezaarData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishIntezaarData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishIntezaar", null, null);
        db.close();
        return result;
    }

    //...............................englishJudai.....................................................
    public boolean insertEnglishJudaiData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishJudai", null, values);
        db.close();
        return i > 0;
    }

    //getenglishJudai
    public List<Result> getAllEnglishJudaiData() {
        String query = "Select * FROM englishJudai";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishJudaiData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishJudaiData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishJudaiData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishJudai", null, null);
        db.close();
        return result;
    }

    //...............................englishMaa.....................................................
    public boolean insertEnglishMaaData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishMaa", null, values);
        db.close();
        return i > 0;
    }

    //getenglishMaa
    public List<Result> getAllEnglishMaaData() {
        String query = "Select * FROM englishMaa";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishMaaData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishMaaData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishMaaData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishMaa", null, null);
        db.close();
        return result;
    }

    //...............................englishMausam.....................................................
    public boolean insertEnglishMausamData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishMausam", null, values);
        db.close();
        return i > 0;
    }

    //getenglishMausam
    public List<Result> getAllEnglishMausamData() {
        String query = "Select * FROM englishMausam";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishMausamData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishMausamData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishMausamData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishMausam", null, null);
        db.close();
        return result;
    }

    //...............................englishMaut.....................................................
    public boolean insertEnglishMautData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishMaut", null, values);
        db.close();
        return i > 0;
    }

    //getenglishMaut
    public List<Result> getAllEnglishMautData() {
        String query = "Select * FROM englishMaut";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishMautData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishMautData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishMautData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishMaut", null, null);
        db.close();
        return result;
    }

    //...............................englishNafrat.....................................................
    public boolean insertEnglishNafratData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishNafrat", null, values);
        db.close();
        return i > 0;
    }

    //getenglishNafrat
    public List<Result> getAllEnglishNafratData() {
        String query = "Select * FROM englishNafrat";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishNafratData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishNafratData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishNafratData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishNafrat", null, null);
        db.close();
        return result;
    }

    //...............................englishSharab.....................................................
    public boolean insertEnglishSharabData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishSharab", null, values);
        db.close();
        return i > 0;
    }

    //getenglishSharab
    public List<Result> getAllEnglishSharabData() {
        String query = "Select * FROM englishSharab";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishSharabData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishSharabData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishSharabData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishSharab", null, null);
        db.close();
        return result;
    }

    //...............................englishShayariOnLife.....................................................
    public boolean insertEnglishShayariOnLifeData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishShayariOnLife", null, values);
        db.close();
        return i > 0;
    }

    //getenglishShayariOnLife
    public List<Result> getAllEnglishShayariOnLifeData() {
        String query = "Select * FROM englishShayariOnLife";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishShayariOnLifeData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishShayariOnLifeData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishShayariOnLifeData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishShayariOnLife", null, null);
        db.close();
        return result;
    }

    //...............................englishSorry.....................................................
    public boolean insertEnglishSorryData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishSorry", null, values);
        db.close();
        return i > 0;
    }

    //getenglishSorry
    public List<Result> getAllEnglishSorryData() {
        String query = "Select * FROM englishSorry";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishSorryData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishSorryData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishSorryData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishSorry", null, null);
        db.close();
        return result;
    }

    //...............................englishTwoLineShayari.....................................................
    public boolean insertEnglishTwoLineShayariData(Result ob) {
        ContentValues values = new ContentValues();

        values.put("textdata", ob.getTextdata());

        SQLiteDatabase db = this.getWritableDatabase();

        long i = db.insert("englishTwoLineShayari", null, values);
        db.close();
        return i > 0;
    }

    //getenglishTwoLineShayari
    public List<Result> getAllEnglishTwoLineShayariData() {
        String query = "Select * FROM englishTwoLineShayari";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        List<Result> list = new ArrayList<Result>();

        if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() == false) {
                Result ob = new Result();
                populateEnglishTwoLineShayariData(cursor, ob);
                list.add(ob);
                cursor.moveToNext();
            }
        }
        db.close();
        return list;
    }

    private void populateEnglishTwoLineShayariData(Cursor cursor, Result ob) {
        ob.setTextdata(cursor.getString(0));
    }

    public boolean deleteEnglishTwoLineShayariData() {
        boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("englishTwoLineShayari", null, null);
        db.close();
        return result;
    }

}