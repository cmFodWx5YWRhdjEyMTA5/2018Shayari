package lalit.loveshayari.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import lalit.loveshayari.R;
import lalit.loveshayari.adapter.ShayariAdapter;
import lalit.loveshayari.model.ContentData;
import lalit.loveshayari.model.Result;

public class ActionViewActivity extends AppCompatActivity {
    TextView textdata;
    int current = 0;
    String data, allData;
    //  int postion;
    //  ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_view);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        data = intent.getStringExtra("textdata");
        // postion = intent.getIntExtra("pos", 0);
        textdata = (TextView) findViewById(R.id.textdata);
        // listView = (ListView) findViewById(R.id.list);
        textdata.setText(data);
//        if (allData != null) {
//            ContentData data = new Gson().fromJson(allData, ContentData.class);
//            if (data != null) {
//                if (data.getResult() != null) {
//                    final Result[] results = data.getResult();
//                    ShayariAdapter shayariAdapter = new ShayariAdapter(ActionViewActivity.this, results);
//                    listView.setAdapter(shayariAdapter);
//                    shayariAdapter.notifyDataSetChanged();
//                }
//            }
//        }
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

    private class MyPagerAdapter extends PagerAdapter {
        private MyPagerAdapter() {
        }

        public void destroyItem(View paramView, int paramInt, Object paramObject) {
            ((ViewPager) paramView).removeView((TextView) paramObject);
            current += 1;
        }

        public void finishUpdate(View paramView) {
        }

        public int getCount() {
            return 0;
        }

        public Object instantiateItem(View paramView, int paramInt) {
//            TextView localTextView = new TextView(HindiShyariDisplay.this);
//            localTextView.setTextColor(-16777216);
//            localTextView.setTextSize(20.0F);
//            HindiShyariDisplay.this.str123 = localTextView.getText().toString();
//            HindiShyariDisplay.this.resource = HindiShyariDisplay.this.pos;
//            Log.v("pos11", HindiShyariDisplay.this.pos);
//            Log.v("shayri", HindiShyariDisplay.this.str_shayari);
//            HindiShyariDisplay.this.str123 = localTextView.getText().toString();
//            localTextView.setText(HindiShyariDisplay.this.urls[paramInt]);
//            HindiShyariDisplay.this.str123 = localTextView.getText().toString();
//            HindiShyariDisplay.this.current = 0;
//            ((ViewPager)paramView).addView(localTextView, 0);
//            localTextView.getText().toString();
//            localTextView.setText(HindiShyariDisplay.this.urls[paramInt]);
            return paramView;
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

    class TapGestureListener extends GestureDetector.SimpleOnGestureListener {
        TapGestureListener() {
        }

        private void setDisable() {
            // HindiShyariDisplay.this.r1.setVisibility(4);
        }

        private void setEnable() {
            // HindiShyariDisplay.this.r1.setVisibility(0);
        }

        public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent) {
//            if (HindiShyariDisplay.this.flag)
//            {
//                setDisable();
//                HindiShyariDisplay.this.flag = false;
//                return false;
//            }
//            setEnable();
//            HindiShyariDisplay.this.flag = true;
            return false;
        }
    }
}
