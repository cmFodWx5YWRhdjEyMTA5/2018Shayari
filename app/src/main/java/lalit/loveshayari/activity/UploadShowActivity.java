package lalit.loveshayari.activity;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.balltrianglecustomprogress.BallTriangleDialog;
import lalit.loveshayari.english.EnglishFunnyActivity;
import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;
import lalit.loveshayari.utilities.Utility;

import static lalit.loveshayari.R.id.list;

public class UploadShowActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String text;
    EditText edt_upload;
    JSONParser jsonParser;
    String url = Contants.SERVICE_BASE_URL + Contants.UserShayariSetData;
    BallTriangleDialog ballTriangleDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_upload_show);
        edt_upload = (EditText) findViewById(R.id.edt_upload);
        Button save = (Button) findViewById(R.id.btn_upload);
        jsonParser = new JSONParser();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Utility.isOnline(UploadShowActivity.this)) {
                    new product().execute();
                    text = edt_upload.getText().toString();
                } else {
                    Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", UploadShowActivity.this);
                }
            }
        });
        recyclerView = (RecyclerView) findViewById(list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        init();
    }

    public class product extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            List<NameValuePair> parm = new ArrayList<NameValuePair>();
            parm.add(new BasicNameValuePair("textdata", text));
            JSONObject obj = jsonParser.makeHttpRequest(url, "POST", parm);

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            ballTriangleDialog.dismiss();
            Toast.makeText(UploadShowActivity.this, "Save Data Success. ", Toast.LENGTH_SHORT).show();

        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ballTriangleDialog = new BallTriangleDialog(UploadShowActivity.this);
            ballTriangleDialog.show();
            ballTriangleDialog.setCancelable(false);
        }
    }

    private void init() {
        if (Utility.isOnline(this)) {
            final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callShowUsershayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        ContentData data = new Gson().fromJson(workName, ContentData.class);
                        if (data != null) {
                            if (data.getResult() != null) {
                                Result[] results = data.getResult();
                                Collections.reverse(Arrays.asList(results));
                                ShayariAdapter shayariAdapter = new ShayariAdapter(UploadShowActivity.this, results);
                                recyclerView.setAdapter(shayariAdapter);
                                shayariAdapter.notifyDataSetChanged();
                            }
                        }
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", UploadShowActivity.this);
                    }

                    if (ballTriangleDialog.isShowing()) {
                        ballTriangleDialog.dismiss();
                    }


                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }
    //for hid keyboard when tab outside edittext box
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }
}
