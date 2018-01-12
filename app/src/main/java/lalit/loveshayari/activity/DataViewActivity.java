package lalit.loveshayari.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.adapter.ShayariFavrateAdapter;
import lalit.loveshayari.database.DbHelper;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;

import static lalit.loveshayari.R.id.list;
import static lalit.loveshayari.R.id.tabMode;

public class DataViewActivity extends AppCompatActivity {
    RecyclerView listView;
LinearLayout linearlayout,nodatalayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_data_view);
        listView = (RecyclerView) findViewById(R.id.list);
        linearlayout = (LinearLayout) findViewById(R.id.linearlayout);
        nodatalayout = (LinearLayout) findViewById(R.id.nodatalayout);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(layoutManager);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        String mData = intent.getStringExtra("data");
        String fav = intent.getStringExtra("fav");
        DbHelper dbHelper = new DbHelper(DataViewActivity.this);
        final List<Result> LoveList = dbHelper.getAllhindiLoveData();
        final List<Result> sadList = dbHelper.getAllhindiSadData();
        final List<Result> romanticList = dbHelper.getAllhindiRomanticData();
        final List<Result> funnyList = dbHelper.getAllhindiFunnyData();
        final List<Result> yaadList = dbHelper.getAllhindiYaadData();
        final List<Result> favouriteList = dbHelper.getAllFavouriteData();
        if (LoveList.size() != 0 && LoveList != null && mData.equalsIgnoreCase("loveData")) {
            ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, LoveList);
            listView.setAdapter(shayariAdapter);
        }
        if (sadList.size() != 0 && sadList != null && mData.equalsIgnoreCase("sadData")) {
            ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, sadList);
            listView.setAdapter(shayariAdapter);
        }
        if (romanticList.size() != 0 && romanticList != null && mData.equalsIgnoreCase("romanticData")) {
            ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, romanticList);
            listView.setAdapter(shayariAdapter);
        }
        if (funnyList.size() != 0 && funnyList != null && mData.equalsIgnoreCase("funnyData")) {
            ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, funnyList);
            listView.setAdapter(shayariAdapter);
        }
        if (yaadList.size() != 0 && yaadList != null && mData.equalsIgnoreCase("yaadData")) {
            ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, yaadList);
            listView.setAdapter(shayariAdapter);
        }
        if (fav!=null&&fav.equalsIgnoreCase("true")) {
            if (favouriteList.size() != 0 && favouriteList != null && mData.equalsIgnoreCase("favourite")) {
                ShayariFavrateAdapter shayariAdapter = new ShayariFavrateAdapter(DataViewActivity.this, favouriteList);
                listView.setAdapter(shayariAdapter);
            } else {
                nodatalayout.setVisibility(View.VISIBLE);
                linearlayout.setVisibility(View.INVISIBLE);
                TextView nodata = (TextView) findViewById(R.id.nodata);
                nodata.setText("Any Favourite Shayari Not Found");
                nodatalayout.setGravity(Gravity.CENTER);
            }
        }

    }
}
