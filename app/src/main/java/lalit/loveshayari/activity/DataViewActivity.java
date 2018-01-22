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
    List<Result> hindiLoveList, hindisadList, hindiromanticList, hindifunnyList, hindiyaadList, favouriteList, hindiTwoLineShayariList,
            hindiAankheinList, hindiAansooList, hindiAloneList, hindiAttitudeList, hindiBeautyList, hindiBewafaList,
            hindiBirthdayList, hindiBollywoodList, hindiBrokenHeartList, hindiDeshBhaktiList, hindiDilShayariList, hindiDooriyanList,
            hindiDuaList, hindiFriendshipList, hindiHeartTouchingList, hindiInspirationalList, hindiInsultList, hindiIntezaarList,
            hindiJudaiList, hindiMaaList, hindiMausamList, hindiMautList, hindiNafratList, hindiSharabList, hindiShayariOnLifeList, hindiSorryList;
    List<Result> englishLoveList, englishsadList, englishromanticList, englishfunnyList, englishyaadList, englishTwoLineShayariList,
            englishAankheinList, englishAansooList, englishAloneList, englishAttitudeList, englishBeautyList, englishBewafaList,
            englishBirthdayList, englishBollywoodList, englishBrokenHeartList, englishDeshBhaktiList, englishDilShayariList, englishDooriyanList,
            englishDuaList, englishFriendshipList, englishHeartTouchingList, englishInspirationalList, englishInsultList, englishIntezaarList,
            englishJudaiList, englishMaaList, englishMausamList, englishMautList, englishNafratList, englishSharabList, englishShayariOnLifeList, englishSorryList;
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
            hindiLoveList = dbHelper.getAllhindiLoveData();
            hindisadList = dbHelper.getAllhindiSadData();
            hindiromanticList = dbHelper.getAllhindiRomanticData();
            hindifunnyList = dbHelper.getAllhindiFunnyData();
            hindiyaadList = dbHelper.getAllhindiYaadData();
            hindiTwoLineShayariList = dbHelper.getAllhindiTwoLineShayariData();
            hindiAankheinList = dbHelper.getAllhindiAankheinData();
            hindiAansooList = dbHelper.getAllhindiAansooData();
            hindiAloneList = dbHelper.getAllhindiAloneData();
            hindiAttitudeList = dbHelper.getAllhindiAttitudeData();
            hindiBeautyList = dbHelper.getAllhindiBeautyData();
            hindiBewafaList = dbHelper.getAllhindiBewafaData();
            hindiBirthdayList = dbHelper.getAllhindiBirthdayData();
            hindiBollywoodList = dbHelper.getAllhindiBollywoodData();
            hindiBrokenHeartList = dbHelper.getAllhindiBrokenHeartData();
            hindiDeshBhaktiList = dbHelper.getAllhindiDeshBhaktiData();
            hindiDilShayariList = dbHelper.getAllhindiDilShayariData();
            hindiDooriyanList = dbHelper.getAllhindiDooriyanData();
            hindiDuaList = dbHelper.getAllhindiDuaData();
            hindiFriendshipList = dbHelper.getAllhindiFriendshipData();
            hindiHeartTouchingList = dbHelper.getAllhindiHeartTouchingData();
            hindiInspirationalList = dbHelper.getAllhindiInspirationalData();
            hindiInsultList = dbHelper.getAllhindiInsultData();
            hindiIntezaarList = dbHelper.getAllhindiIntezaarData();
            hindiJudaiList = dbHelper.getAllhindiJudaiData();
            hindiMaaList = dbHelper.getAllhindiMaaData();
            hindiMausamList = dbHelper.getAllhindiMausamData();
            hindiMautList = dbHelper.getAllhindiMautData();
            hindiNafratList = dbHelper.getAllhindiNafratData();
            hindiSharabList = dbHelper.getAllhindiSharabData();
            hindiShayariOnLifeList = dbHelper.getAllhindiShayariOnLifeData();
            hindiSorryList = dbHelper.getAllhindiSorryData();

            if (hindiLoveList.size() != 0 && hindiLoveList != null && mData.equalsIgnoreCase("hindiLoveList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiLoveList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindisadList.size() != 0 && hindisadList != null && mData.equalsIgnoreCase("hindisadList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindisadList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiromanticList.size() != 0 && hindiromanticList != null && mData.equalsIgnoreCase("hindiromanticList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiromanticList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindifunnyList.size() != 0 && hindifunnyList != null && mData.equalsIgnoreCase("hindifunnyList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindifunnyList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiyaadList.size() != 0 && hindiyaadList != null && mData.equalsIgnoreCase("hindiyaadList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiyaadList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiTwoLineShayariList.size() != 0 && hindiTwoLineShayariList != null && mData.equalsIgnoreCase("hindiTwoLineShayariList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiTwoLineShayariList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiAankheinList.size() != 0 && hindiAankheinList != null && mData.equalsIgnoreCase("hindiAankheinData")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiAankheinList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiAansooList.size() != 0 && hindiAansooList != null && mData.equalsIgnoreCase("hindiAansooList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiAansooList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiAloneList.size() != 0 && hindiAloneList != null && mData.equalsIgnoreCase("hindiAloneList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiAloneList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiAttitudeList.size() != 0 && hindiAttitudeList != null && mData.equalsIgnoreCase("hindiAttitudeList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiAttitudeList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiBeautyList.size() != 0 && hindiBeautyList != null && mData.equalsIgnoreCase("hindiBeautyList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiBeautyList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiBewafaList.size() != 0 && hindiBewafaList != null && mData.equalsIgnoreCase("hindiBewafaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiBewafaList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiBirthdayList.size() != 0 && hindiBirthdayList != null && mData.equalsIgnoreCase("hindiBirthdayList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiBirthdayList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiBollywoodList.size() != 0 && hindiBollywoodList != null && mData.equalsIgnoreCase("hindiBollywoodList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiBollywoodList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiBrokenHeartList.size() != 0 && hindiBrokenHeartList != null && mData.equalsIgnoreCase("hindiBrokenHeartList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiBrokenHeartList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiDeshBhaktiList.size() != 0 && hindiDeshBhaktiList != null && mData.equalsIgnoreCase("hindiDeshBhaktiList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiDeshBhaktiList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiDilShayariList.size() != 0 && hindiDilShayariList != null && mData.equalsIgnoreCase("hindiDilShayariList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiDilShayariList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiDooriyanList.size() != 0 && hindiDooriyanList != null && mData.equalsIgnoreCase("hindiDooriyanList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiDooriyanList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiDuaList.size() != 0 && hindiDuaList != null && mData.equalsIgnoreCase("hindiDuaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiDuaList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiFriendshipList.size() != 0 && hindiFriendshipList != null && mData.equalsIgnoreCase("hindiFriendshipList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiFriendshipList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiHeartTouchingList.size() != 0 && hindiHeartTouchingList != null && mData.equalsIgnoreCase("hindiHeartTouchingList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiHeartTouchingList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiInspirationalList.size() != 0 && hindiInspirationalList != null && mData.equalsIgnoreCase("hindiInspirationalList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiInspirationalList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiInsultList.size() != 0 && hindiInsultList != null && mData.equalsIgnoreCase("hindiInsultList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiInsultList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiIntezaarList.size() != 0 && hindiIntezaarList != null && mData.equalsIgnoreCase("hindiIntezaarList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiIntezaarList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiJudaiList.size() != 0 && hindiJudaiList != null && mData.equalsIgnoreCase("hindiJudaiList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiJudaiList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiMaaList.size() != 0 && hindiMaaList != null && mData.equalsIgnoreCase("hindiMaaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiMaaList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiMausamList.size() != 0 && hindiMausamList != null && mData.equalsIgnoreCase("hindiMausamList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiMausamList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiMautList.size() != 0 && hindiMautList != null && mData.equalsIgnoreCase("hindiMautList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiMautList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiNafratList.size() != 0 && hindiNafratList != null && mData.equalsIgnoreCase("hindiNafratList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiNafratList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiSharabList.size() != 0 && hindiSharabList != null && mData.equalsIgnoreCase("hindiSharabList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiSharabList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiShayariOnLifeList.size() != 0 && hindiShayariOnLifeList != null && mData.equalsIgnoreCase("hindiShayariOnLifeList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiShayariOnLifeList);
                listView.setAdapter(shayariAdapter);
            }
            if (hindiSorryList.size() != 0 && hindiSorryList != null && mData.equalsIgnoreCase("hindiSorryList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, hindiSorryList);
                listView.setAdapter(shayariAdapter);
            }

        } else {
            englishLoveList = dbHelper.getAllEnglishLoveData();
            englishsadList = dbHelper.getAllEnglishSadData();
            englishromanticList = dbHelper.getAllEnglishRomanticData();
            englishfunnyList = dbHelper.getAllEnglishFunnyData();
            englishyaadList = dbHelper.getAllEnglishYaadData();
            englishTwoLineShayariList = dbHelper.getAllEnglishTwoLineShayariData();
            englishAankheinList = dbHelper.getAllEnglishAankheinData();
            englishAansooList = dbHelper.getAllEnglishAansooData();
            englishAloneList = dbHelper.getAllEnglishAloneData();
            englishAttitudeList = dbHelper.getAllEnglishAttitudeData();
            englishBeautyList = dbHelper.getAllEnglishBeautyData();
            englishBewafaList = dbHelper.getAllEnglishBewafaData();
            englishBirthdayList = dbHelper.getAllEnglishBirthdayData();
            englishBollywoodList = dbHelper.getAllEnglishBollywoodData();
            englishBrokenHeartList = dbHelper.getAllEnglishBrokenHeartData();
            englishDeshBhaktiList = dbHelper.getAllEnglishDeshBhaktiData();
            englishDilShayariList = dbHelper.getAllEnglishDilShayariData();
            englishDooriyanList = dbHelper.getAllEnglishDooriyanData();
            englishDuaList = dbHelper.getAllEnglishDuaData();
            englishFriendshipList = dbHelper.getAllEnglishFriendshipData();
            englishHeartTouchingList = dbHelper.getAllEnglishHeartTouchingData();
            englishInspirationalList = dbHelper.getAllEnglishInspirationalData();
            englishInsultList = dbHelper.getAllEnglishInsultData();
            englishIntezaarList = dbHelper.getAllEnglishIntezaarData();
            englishJudaiList = dbHelper.getAllEnglishJudaiData();
            englishMaaList = dbHelper.getAllEnglishMaaData();
            englishMausamList = dbHelper.getAllEnglishMausamData();
            englishMautList = dbHelper.getAllEnglishMautData();
            englishNafratList = dbHelper.getAllEnglishNafratData();
            englishSharabList = dbHelper.getAllEnglishSharabData();
            englishShayariOnLifeList = dbHelper.getAllEnglishShayariOnLifeData();
            englishSorryList = dbHelper.getAllEnglishSorryData();

            if (englishLoveList.size() != 0 && englishLoveList != null && mData.equalsIgnoreCase("englishLoveList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishLoveList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishsadList.size() != 0 && englishsadList != null && mData.equalsIgnoreCase("englishsadList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishsadList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishromanticList.size() != 0 && englishromanticList != null && mData.equalsIgnoreCase("englishromanticList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishromanticList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishfunnyList.size() != 0 && englishfunnyList != null && mData.equalsIgnoreCase("englishfunnyList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishfunnyList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishyaadList.size() != 0 && englishyaadList != null && mData.equalsIgnoreCase("englishyaadList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishyaadList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishTwoLineShayariList.size() != 0 && englishTwoLineShayariList != null && mData.equalsIgnoreCase("englishTwoLineShayariList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishTwoLineShayariList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishAankheinList.size() != 0 && englishAankheinList != null && mData.equalsIgnoreCase("englishAankheinList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishAankheinList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishAansooList.size() != 0 && englishAansooList != null && mData.equalsIgnoreCase("englishAansooList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishAansooList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishAloneList.size() != 0 && englishAloneList != null && mData.equalsIgnoreCase("englishAloneList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishAloneList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishAttitudeList.size() != 0 && englishAttitudeList != null && mData.equalsIgnoreCase("englishAttitudeList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishAttitudeList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishBeautyList.size() != 0 && englishBeautyList != null && mData.equalsIgnoreCase("englishBeautyList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishBeautyList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishBewafaList.size() != 0 && englishBewafaList != null && mData.equalsIgnoreCase("englishBewafaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishBewafaList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishBirthdayList.size() != 0 && englishBirthdayList != null && mData.equalsIgnoreCase("englishBirthdayList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishBirthdayList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishBollywoodList.size() != 0 && englishBollywoodList != null && mData.equalsIgnoreCase("englishBollywoodList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishBollywoodList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishBrokenHeartList.size() != 0 && englishBrokenHeartList != null && mData.equalsIgnoreCase("englishBrokenHeartList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishBrokenHeartList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishDeshBhaktiList.size() != 0 && englishDeshBhaktiList != null && mData.equalsIgnoreCase("englishDeshBhaktiList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishDeshBhaktiList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishDilShayariList.size() != 0 && englishDilShayariList != null && mData.equalsIgnoreCase("englishDilShayariList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishDilShayariList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishDooriyanList.size() != 0 && englishDooriyanList != null && mData.equalsIgnoreCase("englishDooriyanList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishDooriyanList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishDuaList.size() != 0 && englishDuaList != null && mData.equalsIgnoreCase("englishDuaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishDuaList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishFriendshipList.size() != 0 && englishFriendshipList != null && mData.equalsIgnoreCase("englishFriendshipList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishFriendshipList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishHeartTouchingList.size() != 0 && englishHeartTouchingList != null && mData.equalsIgnoreCase("englishHeartTouchingList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishHeartTouchingList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishInspirationalList.size() != 0 && englishInspirationalList != null && mData.equalsIgnoreCase("englishInspirationalList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishInspirationalList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishInsultList.size() != 0 && englishInsultList != null && mData.equalsIgnoreCase("englishInsultList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishInsultList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishIntezaarList.size() != 0 && englishIntezaarList != null && mData.equalsIgnoreCase("englishIntezaarList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishIntezaarList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishJudaiList.size() != 0 && englishJudaiList != null && mData.equalsIgnoreCase("englishJudaiList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishJudaiList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishMaaList.size() != 0 && englishMaaList != null && mData.equalsIgnoreCase("englishMaaList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishMaaList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishMausamList.size() != 0 && englishMausamList != null && mData.equalsIgnoreCase("englishMausamList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishMausamList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishMautList.size() != 0 && englishMautList != null && mData.equalsIgnoreCase("englishMautList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishMautList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishNafratList.size() != 0 && englishNafratList != null && mData.equalsIgnoreCase("englishNafratList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishNafratList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishSharabList.size() != 0 && englishSharabList != null && mData.equalsIgnoreCase("englishSharabList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishSharabList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishShayariOnLifeList.size() != 0 && englishShayariOnLifeList != null && mData.equalsIgnoreCase("englishShayariOnLifeList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishShayariOnLifeList);
                listView.setAdapter(shayariAdapter);
            }
            if (englishSorryList.size() != 0 && englishSorryList != null && mData.equalsIgnoreCase("englishSorryList")) {
                shayariAdapter = new ShayariAdapter(DataViewActivity.this, englishSorryList);
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
