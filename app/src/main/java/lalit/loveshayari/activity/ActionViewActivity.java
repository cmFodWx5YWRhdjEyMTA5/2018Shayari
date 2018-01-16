package lalit.loveshayari.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;

public class ActionViewActivity extends AppCompatActivity {
    TextView tv_countSize;
    int current = 0, postion, totalSize;
    String data, listData;
    //  int postion;
    //  ListView listView;
    ViewPager viewPager;
    Result[] results;
    MyPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_view);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        data = intent.getStringExtra("textdata");
        postion = intent.getIntExtra("postion", 0);
        totalSize = intent.getIntExtra("totalSize", 0);
        listData = intent.getStringExtra("list");
        viewPager = (ViewPager) findViewById(R.id.textdata);
        tv_countSize = (TextView) findViewById(R.id.tv_countSize);
        tv_countSize.setText(String.valueOf(postion) + "/" + String.valueOf(totalSize));
        results = new Gson().fromJson(listData, Result[].class);
        pagerAdapter = new MyPagerAdapter();
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(postion);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tv_countSize.setText(String.valueOf(position) + "/" + String.valueOf(totalSize));
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    public void shareClick(View view) {
        Intent paramView = new Intent();
        paramView.setAction("android.intent.action.SEND");
        paramView.setType("text/plain");
        paramView.putExtra("android.intent.extra.TEXT", data);
        startActivity(Intent.createChooser(paramView, "Share Shayari"));
    }

    public void copyClick(View view) {
        ClipboardManager cm = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(data);
        Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
    }
    public void priviousClick(View view) {
        int i = viewPager.getCurrentItem();
        viewPager.setCurrentItem(i - 1);
        if (i != 0) {
            tv_countSize.setText(String.valueOf(i - 1) + "/" + String.valueOf(totalSize));
        }
    }
    public void nextClick(View view) {
        int i=viewPager.getCurrentItem();
        viewPager.setCurrentItem(i+1);
        tv_countSize.setText(String.valueOf(i+1) + "/" + String.valueOf(totalSize));

    }
    private class MyPagerAdapter extends PagerAdapter {
        private MyPagerAdapter() {
        }

        public void destroyItem(View paramView, int paramInt, Object paramObject) {
            ((ViewPager) paramView).removeView((TextView) paramObject);
        }

        public void finishUpdate(View paramView) {
        }

        public int getCount() {
            return ActionViewActivity.this.results.length;
        }

        public Object instantiateItem(View paramView, int paramInt) {
            TextView localTextView = new TextView(ActionViewActivity.this);
            localTextView.setTextColor(Color.BLACK);
            localTextView.setTextSize(20.0F);
            localTextView.setText(String.valueOf(results[paramInt].getTextdata()));
            ((ViewPager) paramView).addView(localTextView, 0);
            return localTextView;
        }

        public boolean isViewFromObject(View paramView, Object paramObject) {
            return paramView == (TextView) paramObject;
        }

        public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader) {
        }

        public Parcelable saveState() {
            return null;
        }

        public void startUpdate(View paramView) {
        }
    }
}
