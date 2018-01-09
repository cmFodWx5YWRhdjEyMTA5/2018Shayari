package lalit.loveshayari.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;

/**
 * Created by lalit on 11/8/2017.
 */

public class ShayariAdapter extends BaseAdapter {
    private List<Result> DataList;
    private LayoutInflater mInflater;
    public Context mContext;
    public ShayariAdapter(Context mContext,List<Result> DataList) {
        mInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.DataList = DataList;
    }

    @Override
    public int getCount() {

        return DataList.size();
    }


    @Override
    public Object getItem(int arg0) {

        return null;
    }

    @Override
    public long getItemId(int arg0) {

        return 0;
    }

    @Override
    public View getView(final int i, View convertview, ViewGroup parent) {
        ViewHolder holder;
        if (convertview == null) {
            convertview = mInflater.inflate(R.layout.item_shayari, null);
            holder = new ViewHolder();
            {
                holder.data = (TextView) convertview.findViewById(R.id.data);
                holder.sno = (TextView) convertview.findViewById(R.id.sno);
                holder.data.setText(DataList.get(i).getTextdata());
                holder.sno.setText(String.valueOf(i));
                    convertview.setTag(holder);

            }
        } else {
            holder = (ViewHolder) convertview.getTag();
        }
        return convertview;
    }
    public static class ViewHolder {
        TextView data,sno;
    }
}

