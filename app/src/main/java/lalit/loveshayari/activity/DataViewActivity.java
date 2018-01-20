package lalit.loveshayari.activity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
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
    LinearLayout linearlayout, nodatalayout;
    List<Result> LoveList, sadList, romanticList, funnyList, yaadList, favouriteList, eLoveList, esadList, eromanticList, efunnyList, eyaadList, efavouriteList;
    SearchView search_bar;
    ShayariAdapter shayariAdapter;
    ShayariFavrateAdapter shayariFavrateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_data_view);
        listView = (RecyclerView) findViewById(R.id.list);
        search_bar = (SearchView) findViewById(R.id.search_bar);
        linearlayout = (LinearLayout) findViewById(R.id.linearlayout);
        nodatalayout = (LinearLayout) findViewById(R.id.nodatalayout);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(layoutManager);
        init();
    }

    private void init() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search_bar.setSearchableInfo(searchManager
                .getSearchableInfo(this.getComponentName()));
        search_bar.setIconified(true);
        EditText searchEditText = (EditText) search_bar.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(Color.BLACK);
        searchEditText.setHintTextColor(Color.BLACK);
        search_bar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // filter recycler view when query submitted
                if (shayariAdapter != null) {
                    shayariAdapter.getFilter().filter(query);
                }
                if (shayariFavrateAdapter != null) {
                    shayariFavrateAdapter.getFilter().filter(query);
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                // filter recycler view when text is changed
                if (shayariAdapter != null) {
                    shayariAdapter.getFilter().filter(query);
                }
                if (shayariFavrateAdapter != null) {
                    shayariFavrateAdapter.getFilter().filter(query);
                }
                return false;
            }
        });
        Intent intent = getIntent();
        String mData = intent.getStringExtra("data");
        String fav = intent.getStringExtra("fav");
        String key = intent.getStringExtra("key");
        DbHelper dbHelper = new DbHelper(DataViewActivity.this);
        favouriteList = dbHelper.getAllFavouriteData();
        if (key != null && key.equalsIgnoreCase("hindi")) {
            LoveList = dbHelper.getAllhindiLoveData();
            sadList = dbHelper.getAllhindiSadData();
            romanticList = dbHelper.getAllhindiRomanticData();
            funnyList = dbHelper.getAllhindiFunnyData();
            yaadList = dbHelper.getAllhindiYaadData();

            if (LoveList.size() != 0 && LoveList != null && mData.equalsIgnoreCase("loveData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, LoveList);
                listView.setAdapter(shayariAdapter);
            }
            if (sadList.size() != 0 && sadList != null && mData.equalsIgnoreCase("sadData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, sadList);
                listView.setAdapter(shayariAdapter);
            }
            if (romanticList.size() != 0 && romanticList != null && mData.equalsIgnoreCase("romanticData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, romanticList);
                listView.setAdapter(shayariAdapter);
            }
            if (funnyList.size() != 0 && funnyList != null && mData.equalsIgnoreCase("funnyData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, funnyList);
                listView.setAdapter(shayariAdapter);
            }
            if (yaadList.size() != 0 && yaadList != null && mData.equalsIgnoreCase("yaadData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, yaadList);
                listView.setAdapter(shayariAdapter);
            }

        } else {
            eLoveList = dbHelper.getAllEnglishLoveData();
            esadList = dbHelper.getAllEnglishSadData();
            eromanticList = dbHelper.getAllEnglishRomanticData();
            eyaadList = dbHelper.getAllEnglishYaadData();
            efunnyList = dbHelper.getAllEnglishFunnyData();
            //efavouriteList = dbHelper.getAllEnglishFavouriteData();


            if (eLoveList.size() != 0 && eLoveList != null && mData.equalsIgnoreCase("loveData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, eLoveList);
                listView.setAdapter(shayariAdapter);
            }
            if (esadList.size() != 0 && esadList != null && mData.equalsIgnoreCase("sadData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, esadList);
                listView.setAdapter(shayariAdapter);
            }
            if (eromanticList.size() != 0 && eromanticList != null && mData.equalsIgnoreCase("romanticData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, eromanticList);
                listView.setAdapter(shayariAdapter);
            }
            if (efunnyList.size() != 0 && efunnyList != null && mData.equalsIgnoreCase("funnyData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, efunnyList);
                listView.setAdapter(shayariAdapter);
            }
            if (eyaadList.size() != 0 && eyaadList != null && mData.equalsIgnoreCase("yaadData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, eyaadList);
                listView.setAdapter(shayariAdapter);
            }


        }
        if (fav != null && fav.equalsIgnoreCase("true")) {
            if (favouriteList.size() != 0 && favouriteList != null && mData.equalsIgnoreCase("favourite")) {
                Collections.reverse(favouriteList);
                shayariFavrateAdapter = new ShayariFavrateAdapter(DataViewActivity.this, favouriteList);
                listView.setAdapter(shayariFavrateAdapter);
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
