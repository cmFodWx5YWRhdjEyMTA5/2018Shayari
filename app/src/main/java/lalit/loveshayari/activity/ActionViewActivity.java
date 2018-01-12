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
    TextView textdata,tv_countSize;
    int current = 0,postion,totalSize;
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
        postion = intent.getIntExtra("postion",0);
        totalSize = intent.getIntExtra("totalSize",0);
        textdata = (TextView) findViewById(R.id.textdata);
        tv_countSize = (TextView) findViewById(R.id.tv_countSize);
        textdata.setText(data);
        tv_countSize.setText(String.valueOf(postion)+"/"+String.valueOf(totalSize));
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
