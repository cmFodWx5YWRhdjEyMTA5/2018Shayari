package lalit.loveshayari.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.Contants;

/**
 * Created by lalit on 11/8/2017.
 */

public class ShayariAdapter extends RecyclerView.Adapter<ShayariAdapter.ViewHolder> {
    private Result [] DataList;
    private Context context;

    public ShayariAdapter(Context context, Result [] DataList) {
        this.context = context;
        this.DataList = DataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shayari, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.data.setText(DataList[i].getTextdata());
        holder.sno.setText(String.valueOf(i));
        //Log.d(Contants.LOG_TAG,"lalit"+DataList.get(i).getTextdata());
    }

//    //move to fragment
//    public void moveFragment(Fragment fragment) {
//        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.container, fragment)
//                .addToBackStack(null)
//                .commit();
//    }

    @Override
    public int getItemCount() {
        return DataList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView data,sno;


        public ViewHolder(View view) {
            super(view);
            data = (TextView) view.findViewById(R.id.data);
            sno = (TextView) view.findViewById(R.id.sno);
        }
    }
}
