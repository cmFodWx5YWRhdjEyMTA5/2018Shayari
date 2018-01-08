package lalit.loveshayari.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Collections;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;

import static lalit.loveshayari.R.id.list;

public class DataViewActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_data_view);
        listView = (ListView) findViewById(list);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        final String mData = intent.getStringExtra("data");
        if (mData != null) {
            ContentData data = new Gson().fromJson(mData, ContentData.class);
            if (data != null) {
                if (data.getResult() != null) {
                    final Result[] results = data.getResult();
                    Collections.reverse(Arrays.asList(results));
                    ShayariAdapter shayariAdapter = new ShayariAdapter(DataViewActivity.this, results);
                    listView.setAdapter(shayariAdapter);
                    shayariAdapter.notifyDataSetChanged();
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(DataViewActivity.this, ActionViewActivity.class);
                            intent.putExtra("textdata",results[position].getTextdata());
                            intent.putExtra("data",mData);
                            intent.putExtra("pos",position);
                            startActivity(intent);
                        }
                    });
                }
            }
        }
    }
}
