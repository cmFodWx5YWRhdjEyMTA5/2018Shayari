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
 * Created by Neeraj on 7/25/2017.
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
                    workCompletedCallback.onDone("callEnglishFunnyshayari done", true);
                } else {
                    workCompletedCallback.onDone("callEnglishFunnyshayari done", false);
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