package lalit.loveshayari.hindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.balltrianglecustomprogress.BallTriangleDialog;
import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Utility;

import static lalit.loveshayari.R.id.list;

public class HindiLoveActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_love_hindi);
        recyclerView = (RecyclerView) findViewById(list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        init();
    }

    private void init() {
        if (Utility.isOnline(this)) {
            final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiLoveshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        ContentData data = new Gson().fromJson(workName, ContentData.class);
                        if (data != null) {
                            if (data.getResult() != null) {
                                Result[] results = data.getResult();
                                Collections.reverse(Arrays.asList(results));
                                ShayariAdapter shayariAdapter = new ShayariAdapter(HindiLoveActivity.this, results);
                                recyclerView.setAdapter(shayariAdapter);
                                shayariAdapter.notifyDataSetChanged();
                            }
                        }
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", HindiLoveActivity.this);
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
}