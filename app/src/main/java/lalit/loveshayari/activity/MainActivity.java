package lalit.loveshayari.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.database.DbHelper;
import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;
import lalit.loveshayari.utilities.Utility;

import static lalit.loveshayari.R.id.list;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        init();
    }

    private void init() {
        if (Utility.isOnline(this)) {
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callLoginService(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        ContentData data = new Gson().fromJson(workName, ContentData.class);
                        if (data != null) {
                            if (data.getResult() != null) {
                                Result[] results = data.getResult();
                                ShayariAdapter shayariAdapter = new ShayariAdapter(MainActivity.this, results);
                                recyclerView.setAdapter(shayariAdapter);
                                shayariAdapter.notifyDataSetChanged();
                            }
                        }
                    }
                }
            });
        }
        else {
            Toast.makeText(this, "Please Connect To Internet ", Toast.LENGTH_SHORT).show();
        }
    }
}


