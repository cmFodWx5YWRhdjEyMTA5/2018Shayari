package lalit.loveshayari.framework;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import lalit.loveshayari.database.DbHelper;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;


/**
 * Created by lalit on 7/25/2017.
 */
public class ServiceCaller {
    Context context;

    public ServiceCaller(Context context) {
        this.context = context;
    }

    //hindi  data..........................................................................................................

    public void callhindiLoveshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiLoveShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiLoveData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callhindiLoveshayari done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiLoveData
    public void parseAndhindiLoveData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiLoveData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiLoveData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callhindiLoveshayari done", true);
                } else {
                    workCompletedCallback.onDone("callhindiLoveshayari done", false);
                }
            }
        }.execute();
    }

    public void callhindiSadshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiSadShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindSadData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callhindiSadshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndhindSadData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiSadData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiSadData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callhindiSadshayari done", true);
                } else {
                    workCompletedCallback.onDone("callhindiSadshayari done", false);
                }
            }
        }.execute();
    }
    public void callhindiRomanticshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiRomanticShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndhindRomanticData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callhindiRomanticshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndhindRomanticData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiRomanticData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiRomanticData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callhindiRomanticshayari done", true);
                } else {
                    workCompletedCallback.onDone("callhindiRomanticshayari done", false);
                }
            }
        }.execute();
    }
    public void callhindiFunnyshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiFunnyShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndhindFunnyData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callhindiFunnyshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndhindFunnyData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiFunnyData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiFunnyData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callhindiLoveshayari done", true);
                } else {
                    workCompletedCallback.onDone("callhindiLoveshayari done", false);
                }
            }
        }.execute();
    }
    public void callhindiYaadshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiYaadShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndhindYaadData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callhindiYaadshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndhindYaadData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiYaadData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiYaadData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callhindiLoveshayari done", true);
                } else {
                    workCompletedCallback.onDone("callhindiLoveshayari done", false);
                }
            }
        }.execute();
    }
    public void callhindiAankheinshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiAankheinShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiAankheinData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAankhein done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiAankheinData
    public void parseAndhindiAankheinData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiAankheinData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiAankheinData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAankhein done", true);
                } else {
                    workCompletedCallback.onDone("hindiAankhein done", false);
                }
            }
        }.execute();
    }

    public void callhindiAansooshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiAansooShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiAansooData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAansoo done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiAansooData
    public void parseAndhindiAansooData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiAansooData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiAansooData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAansoo done", true);
                } else {
                    workCompletedCallback.onDone("hindiAansoo done", false);
                }
            }
        }.execute();
    }

    public void callhindiAloneshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiAloneShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiAloneData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAlone done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiAloneData
    public void parseAndhindiAloneData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiAloneData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiAloneata(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAlone done", true);
                } else {
                    workCompletedCallback.onDone("hindiAlone done", false);
                }
            }
        }.execute();
    }

    public void callhindiAttitudeshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiAttitudeShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiAttitudeData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Attitude done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiAttitudeData
    public void parseAndhindiAttitudeData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiAttitudeData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiAttitudeData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Attitude done", true);
                } else {
                    workCompletedCallback.onDone("Attitude done", false);
                }
            }
        }.execute();
    }

    public void callhindiBeautyshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiBeautyShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiBeautyData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Beauty done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiBeautyData
    public void parseAndhindiBeautyData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiBeautyData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiBeautyData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Beauty done", true);
                } else {
                    workCompletedCallback.onDone("Beauty done", false);
                }
            }
        }.execute();
    }

    public void callhindiBewafashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiBewafaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiBewafaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Bewafa done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiBewafaData
    public void parseAndhindiBewafaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiBewafaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiBewafaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Bewafa done", true);
                } else {
                    workCompletedCallback.onDone("Bewafa done", false);
                }
            }
        }.execute();
    }

    public void callhindiBirthdayshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiBirthdayShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiBirthdayData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Birthday done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiBirthdayData
    public void parseAndhindiBirthdayData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiLoveData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiLoveData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Birthday done", true);
                } else {
                    workCompletedCallback.onDone("Birthday done", false);
                }
            }
        }.execute();
    }

    public void callhindiBollywoodshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiBollywoodShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiBollywoodData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Bollywood done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiBollywoodData
    public void parseAndhindiBollywoodData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiBollywoodData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiBollywoodData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Bollywood done", true);
                } else {
                    workCompletedCallback.onDone("Bollywood done", false);
                }
            }
        }.execute();
    }

    public void callhindiBrokenHeartshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiBrokenHeartShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiBrokenHeartData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("BrokenHeart done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiBrokenHeartData
    public void parseAndhindiBrokenHeartData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiBrokenHeartData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiBrokenHeartData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("BrokenHeart done", true);
                } else {
                    workCompletedCallback.onDone("BrokenHeart done", false);
                }
            }
        }.execute();
    }

    public void callhindiDeshBhaktishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiDeshBhaktiShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiDeshBhaktiData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("DeshBhakti done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiDeshBhaktiData
    public void parseAndhindiDeshBhaktiData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiDeshBhaktiData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiDeshBhaktiData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("DeshBhakti done", true);
                } else {
                    workCompletedCallback.onDone("DeshBhakti done", false);
                }
            }
        }.execute();
    }

    public void callhindiDilshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiDilShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiDilData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dil done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiDilData
    public void parseAndhindiDilData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiDilShayariData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiDilShayariData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dil done", true);
                } else {
                    workCompletedCallback.onDone("Dil done", false);
                }
            }
        }.execute();
    }

    public void callhindiDooriyanshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiDooriyanShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiDooriyanData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dooriyan done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiDooriyanData
    public void parseAndhindiDooriyanData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiDooriyanData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiDooriyanData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dooriyan done", true);
                } else {
                    workCompletedCallback.onDone("Dooriyan done", false);
                }
            }
        }.execute();
    }

    public void callhindiDuashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiDuaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiDuaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dua done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiDuaData
    public void parseAndhindiDuaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiDuaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiDuaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dua done", true);
                } else {
                    workCompletedCallback.onDone("Dua done", false);
                }
            }
        }.execute();
    }

    public void callhindiFriendshipshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiFriendshipShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiFriendshipData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Friendship done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiFriendshipData
    public void parseAndhindiFriendshipData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiFriendshipData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiFriendshipData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Friendship done", true);
                } else {
                    workCompletedCallback.onDone("Friendship done", false);
                }
            }
        }.execute();
    }

    public void callhindiHeartTouchingshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiHeartTouchingShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiHeartTouchingData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("HeartTouching done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiHeartTouchingData
    public void parseAndhindiHeartTouchingData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiHeartTouchingData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiHeartTouchingData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("HeartTouching done", true);
                } else {
                    workCompletedCallback.onDone("HeartTouching done", false);
                }
            }
        }.execute();
    }

    public void callhindiInspirationalshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiInspirationalShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiInspirationalData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Inspirational done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiInspirationalData
    public void parseAndhindiInspirationalData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiInspirationalData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiInspirationalData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Inspirational done", true);
                } else {
                    workCompletedCallback.onDone("Inspirational done", false);
                }
            }
        }.execute();
    }

    public void callhindiInsultshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiInsultShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiInsultData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Insult done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiInsultData
    public void parseAndhindiInsultData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiInsultData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiInsultData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Insult done", true);
                } else {
                    workCompletedCallback.onDone("Insult done", false);
                }
            }
        }.execute();
    }

    public void callhindiIntezaarshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiIntezaarShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiIntezaarData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Intezaar done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiIntezaarData
    public void parseAndhindiIntezaarData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiIntezaarData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiIntezaarData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Intezaar done", true);
                } else {
                    workCompletedCallback.onDone("Intezaar done", false);
                }
            }
        }.execute();
    }

    public void callhindiJudaishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiJudaiShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiJudaiData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Judai done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiJudaiData
    public void parseAndhindiJudaiData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.delethindiJudaiData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiJudaiData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Judai done", true);
                } else {
                    workCompletedCallback.onDone("Judai done", false);
                }
            }
        }.execute();
    }

    public void callhindiMaashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiMaaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiMaaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Maa done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiMaaData
    public void parseAndhindiMaaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.delethindiMaaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiMaaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Maa done", true);
                } else {
                    workCompletedCallback.onDone("Maa done", false);
                }
            }
        }.execute();
    }

    public void callhindiMausamshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiMausamShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiMausamData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Mausam done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiMausamData
    public void parseAndhindiMausamData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiMausamData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiMausamData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Mausam done", true);
                } else {
                    workCompletedCallback.onDone("Mausam done", false);
                }
            }
        }.execute();
    }

    public void callhindiMautshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiMautShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiMautData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Maut done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiMautData
    public void parseAndhindiMautData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiMautData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiMautData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Maut done", true);
                } else {
                    workCompletedCallback.onDone("Maut done", false);
                }
            }
        }.execute();
    }

    public void callhindiNafratshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiNafratShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiNafratData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Nafrat done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiNafratData
    public void parseAndhindiNafratData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiNafratData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiNafratData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Nafrat done", true);
                } else {
                    workCompletedCallback.onDone("Nafrat done", false);
                }
            }
        }.execute();
    }

    public void callhindiSharabshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiSharabShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiSharabData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Sharab done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiSharabData
    public void parseAndhindiSharabData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiSharabData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiSharabData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Sharab done", true);
                } else {
                    workCompletedCallback.onDone("Sharab done", false);
                }
            }
        }.execute();
    }

    public void callhindiShayariOnLifeshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiShayariOnLifeFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiShayariOnLifeData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("ShayariOnLife done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiShayariOnLifeData
    public void parseAndhindiShayariOnLifeData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiShayariOnLifeData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiShayariOnLifeData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("ShayariOnLife done", true);
                } else {
                    workCompletedCallback.onDone("ShayariOnLife done", false);
                }
            }
        }.execute();
    }

    public void callhindiSorryshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiSorryShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiSorryData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Sorry done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiSorryData
    public void parseAndhindiSorryData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiSorryData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiSorryData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Sorry done", true);
                } else {
                    workCompletedCallback.onDone("Sorry done", false);
                }
            }
        }.execute();
    }

    public void callhindiTwoLineShayarishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.HindiTwoLineShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndhindiTwoLineShayariData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("TwoLineShayari done", false);
                }
            }
        });
    }

    //parse and save parseAndhindiTwoLineShayariData
    public void parseAndhindiTwoLineShayariData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deletehindiTwoLineShayariData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.inserthindiTwoLineShayariData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("TwoLineShayari done", true);
                } else {
                    workCompletedCallback.onDone("TwoLineShayari done", false);
                }
            }
        }.execute();
    }
























    // english data.................................................................................................
    public void callEnglishYaadshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishYaadShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndSaveEnglishYaadData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callEnglishYaadshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndSaveEnglishYaadData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishYaadData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishYaadData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callEnglishYaadshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishYaadshayari done", false);
                }
            }
        }.execute();
    }
    public void callEnglishSadshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishSadShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndSaveEnglishSadData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callEnglishSadshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndSaveEnglishSadData
    public void parseAndSaveEnglishSadData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishSadData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishSadData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callEnglishSadshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishSadshayari done", false);
                }
            }
        }.execute();
    }
    public void callEnglishRomanticshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishRomanticShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndSaveEnglishRomnticData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callEnglishRomanticshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndSaveEnglishRomnticData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishRomanticData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishRomanticData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callEnglishRomanticshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishRomanticshayari done", false);
                }
            }
        }.execute();
    }
    public void callEnglishLoveshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishLoveShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndSaveEnglishLoveData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callEnglishLoveshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndSaveEnglishLoveData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishLoveData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishLoveData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callEnglishLoveshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishLoveshayari done", false);
                }
            }
        }.execute();
    }
    public void callEnglishFunnyshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishFunnyShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
//                    workCompletedCallback.onDone(result, true);
                    parseAndSaveEnglishFunnyData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callEnglishFunnyshayari done", false);
                }
            }
        });
    }
    //parse and save parseAndhindiLoveData
    public void parseAndSaveEnglishFunnyData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishFunnyData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishFunnyData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("callEnglishFunnyshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishFunnyshayari done", false);
                }
            }
        }.execute();
    }





    public void callEnglishAankheinshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishAankheinShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishAankheinData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAankhein done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishAankheinData
    public void parseAndEnglishAankheinData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishAankheinData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishAankheinData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAankhein done", true);
                } else {
                    workCompletedCallback.onDone("hindiAankhein done", false);
                }
            }
        }.execute();
    }

    public void callEnglishAansooshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishAansooShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishAansooData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAansoo done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishAansooData
    public void parseAndEnglishAansooData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishAansooData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishAansooData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAansoo done", true);
                } else {
                    workCompletedCallback.onDone("hindiAansoo done", false);
                }
            }
        }.execute();
    }

    public void callEnglishAloneshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishAloneShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishAloneData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("hindiAlone done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishAloneData
    public void parseAndEnglishAloneData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishAloneData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishAloneata(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("hindiAlone done", true);
                } else {
                    workCompletedCallback.onDone("hindiAlone done", false);
                }
            }
        }.execute();
    }

    public void callEnglishAttitudeshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishAttitudeShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishAttitudeData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Attitude done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishAttitudeData
    public void parseAndEnglishAttitudeData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishAttitudeData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishAttitudeData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Attitude done", true);
                } else {
                    workCompletedCallback.onDone("Attitude done", false);
                }
            }
        }.execute();
    }

    public void callEnglishBeautyshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishBeautyShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishBeautyData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Beauty done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishBeautyData
    public void parseAndEnglishBeautyData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishBeautyData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishBeautyData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Beauty done", true);
                } else {
                    workCompletedCallback.onDone("Beauty done", false);
                }
            }
        }.execute();
    }

    public void callEnglishBewafashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishBewafaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishBewafaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Bewafa done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishBewafaData
    public void parseAndEnglishBewafaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishBewafaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishBewafaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Bewafa done", true);
                } else {
                    workCompletedCallback.onDone("Bewafa done", false);
                }
            }
        }.execute();
    }

    public void callEnglishBirthdayshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishBirthdayShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishBirthdayData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Birthday done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishBirthdayData
    public void parseAndEnglishBirthdayData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishLoveData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishLoveData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Birthday done", true);
                } else {
                    workCompletedCallback.onDone("Birthday done", false);
                }
            }
        }.execute();
    }

    public void callEnglishBollywoodshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishBollywoodShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishBollywoodData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Bollywood done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishBollywoodData
    public void parseAndEnglishBollywoodData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishBollywoodData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishBollywoodData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Bollywood done", true);
                } else {
                    workCompletedCallback.onDone("Bollywood done", false);
                }
            }
        }.execute();
    }

    public void callEnglishBrokenHeartshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishBrokenHeartShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishBrokenHeartData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("BrokenHeart done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishBrokenHeartData
    public void parseAndEnglishBrokenHeartData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishBrokenHeartData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishBrokenHeartData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("BrokenHeart done", true);
                } else {
                    workCompletedCallback.onDone("BrokenHeart done", false);
                }
            }
        }.execute();
    }

    public void callEnglishDeshBhaktishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishDeshBhaktiShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishDeshBhaktiData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("DeshBhakti done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishDeshBhaktiData
    public void parseAndEnglishDeshBhaktiData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishDeshBhaktiData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishDeshBhaktiData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("DeshBhakti done", true);
                } else {
                    workCompletedCallback.onDone("DeshBhakti done", false);
                }
            }
        }.execute();
    }

    public void callEnglishDilshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishDilShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishDilData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dil done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishDilData
    public void parseAndEnglishDilData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishDilShayariData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishDilShayariData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dil done", true);
                } else {
                    workCompletedCallback.onDone("Dil done", false);
                }
            }
        }.execute();
    }

    public void callEnglishDooriyanshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishDooriyanShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishDooriyanData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dooriyan done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishDooriyanData
    public void parseAndEnglishDooriyanData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishDooriyanData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishDooriyanData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dooriyan done", true);
                } else {
                    workCompletedCallback.onDone("Dooriyan done", false);
                }
            }
        }.execute();
    }

    public void callEnglishDuashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishDuaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishDuaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Dua done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishDuaData
    public void parseAndEnglishDuaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishDuaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishDuaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Dua done", true);
                } else {
                    workCompletedCallback.onDone("Dua done", false);
                }
            }
        }.execute();
    }

    public void callEnglishFriendshipshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishFriendshipShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishFriendshipData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Friendship done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishiFriendshipData
    public void parseAndEnglishFriendshipData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishFriendshipData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishFriendshipData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Friendship done", true);
                } else {
                    workCompletedCallback.onDone("Friendship done", false);
                }
            }
        }.execute();
    }

    public void callEnglishHeartTouchingshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishHeartTouchingShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishHeartTouchingData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("HeartTouching done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishHeartTouchingData
    public void parseAndEnglishHeartTouchingData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishHeartTouchingData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishHeartTouchingData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("HeartTouching done", true);
                } else {
                    workCompletedCallback.onDone("HeartTouching done", false);
                }
            }
        }.execute();
    }

    public void callEnglishInspirationalshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishInspirationalShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishInspirationalData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Inspirational done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishInspirationalData
    public void parseAndEnglishInspirationalData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishInspirationalData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishInspirationalData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Inspirational done", true);
                } else {
                    workCompletedCallback.onDone("Inspirational done", false);
                }
            }
        }.execute();
    }

    public void callEnglishInsultshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishInsultShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishInsultData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Insult done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishInsultData
    public void parseAndEnglishInsultData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishInsultData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishInsultData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Insult done", true);
                } else {
                    workCompletedCallback.onDone("Insult done", false);
                }
            }
        }.execute();
    }

    public void callEnglishIntezaarshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishIntezaarShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishIntezaarData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Intezaar done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishIntezaarData
    public void parseAndEnglishIntezaarData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishIntezaarData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishIntezaarData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Intezaar done", true);
                } else {
                    workCompletedCallback.onDone("Intezaar done", false);
                }
            }
        }.execute();
    }

    public void callEnglishJudaishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishJudaiShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishJudaiData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Judai done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishJudaiData
    public void parseAndEnglishJudaiData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishJudaiData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishJudaiData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Judai done", true);
                } else {
                    workCompletedCallback.onDone("Judai done", false);
                }
            }
        }.execute();
    }

    public void callEnglishMaashayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishMaaShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishMaaData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Maa done", false);
                }
            }
        });
    }

    //parse and save parseAndhEnglishMaaData
    public void parseAndEnglishMaaData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishMaaData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishMaaData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Maa done", true);
                } else {
                    workCompletedCallback.onDone("Maa done", false);
                }
            }
        }.execute();
    }

    public void callEnglishMausamshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishMausamShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishMausamData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Mausam done", false);
                }
            }
        });
    }

    //parse and save parseAndhEnglishMausamData
    public void parseAndEnglishMausamData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishMausamData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishMausamData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Mausam done", true);
                } else {
                    workCompletedCallback.onDone("Mausam done", false);
                }
            }
        }.execute();
    }

    public void callEnglishMautshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishMautShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishMautData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Maut done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishMautData
    public void parseAndEnglishMautData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishMautData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishMautData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Maut done", true);
                } else {
                    workCompletedCallback.onDone("Maut done", false);
                }
            }
        }.execute();
    }

    public void callEnglishNafratshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishNafratShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishNafratData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Nafrat done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishNafratData
    public void parseAndEnglishNafratData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishNafratData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishNafratData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Nafrat done", true);
                } else {
                    workCompletedCallback.onDone("Nafrat done", false);
                }
            }
        }.execute();
    }

    public void callEnglishSharabshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishSharabShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishSharabData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Sharab done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishSharabData
    public void parseAndEnglishSharabData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishSharabData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishSharabData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Sharab done", true);
                } else {
                    workCompletedCallback.onDone("Sharab done", false);
                }
            }
        }.execute();
    }

    public void callEnglishShayariOnLifeshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishShayariOnLifeFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishShayariOnLifeData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("ShayariOnLife done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishShayariOnLifeData
    public void parseAndEnglishShayariOnLifeData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishShayariOnLifeData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishShayariOnLifeData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("ShayariOnLife done", true);
                } else {
                    workCompletedCallback.onDone("ShayariOnLife done", false);
                }
            }
        }.execute();
    }

    public void callEnglishSorryshayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishSorryShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishSorryData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("Sorry done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishSorryData
    public void parseAndEnglishSorryData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishSorryData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishSorryData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("Sorry done", true);
                } else {
                    workCompletedCallback.onDone("Sorry done", false);
                }
            }
        }.execute();
    }

    public void callEnglishTwoLineShayarishayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.EnglishTwoLineShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    //workCompletedCallback.onDone(result, true);
                    parseAndEnglishTwoLineShayariData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("TwoLineShayari done", false);
                }
            }
        });
    }

    //parse and save parseAndEnglishTwoLineShayariData
    public void parseAndEnglishTwoLineShayariData(final String result, final IAsyncWorkCompletedCallback workCompletedCallback) {
        new AsyncTask<Void, Void, Boolean>() {


            @Override
            protected Boolean doInBackground(Void... voids) {
                Boolean flag = false;
                if (result != null) {
                    ContentData data = new Gson().fromJson(result, ContentData.class);
                    if (data != null) {
                        if (data.getResult() != null) {
                            DbHelper dbHelper = new DbHelper(context);
                            dbHelper.deleteEnglishTwoLineShayariData();
                            for (Result result1 : data.getResult()) {
                                if (result1 != null) {
                                    dbHelper.insertEnglishTwoLineShayariData(result1);
                                }
                            }
                            flag = true;
                        }
                    }
                }
                return flag;

            }


            @Override
            protected void onPostExecute(Boolean flag) {
                super.onPostExecute(flag);
                if (flag) {
                    workCompletedCallback.onDone("TwoLineShayari done", true);
                } else {
                    workCompletedCallback.onDone("TwoLineShayari done", false);
                }
            }
        }.execute();
    }






    public void callShowUsershayari(final IAsyncWorkCompletedCallback workCompletedCallback) {

        final String url = Contants.SERVICE_BASE_URL + Contants.UserShayariFetchData;
        JSONObject obj = new JSONObject();
        try {
            // obj.put("PhoneNumber", phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(Contants.LOG_TAG, "Payload*****" + obj);
        new ServiceHelper().callService(url, obj, new IServiceSuccessCallback() {
            @Override
            public void onDone(String doneWhatCode, String result, String error) {
                if (result != null) {
                    workCompletedCallback.onDone(result, true);
                    //parseAndSaveLoginData(result, workCompletedCallback);
                } else {
                    workCompletedCallback.onDone("callShowUsershayari done", false);
                }
            }
        });
    }
}