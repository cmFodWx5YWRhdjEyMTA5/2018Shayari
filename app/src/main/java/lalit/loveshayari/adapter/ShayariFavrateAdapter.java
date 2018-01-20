package lalit.loveshayari.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import lalit.loveshayari.R;
import lalit.loveshayari.activity.ActionViewActivity;
import lalit.loveshayari.activity.CategoryHindiActivity;
import lalit.loveshayari.database.DbHelper;
import lalit.loveshayari.model.Result;
import lalit.loveshayari.utilities.FontManager;

/**
 * Created by lalit on 11/8/2017.
 */

public class ShayariFavrateAdapter extends RecyclerView.Adapter<ShayariFavrateAdapter.MyViewHolder> implements Filterable {
    private List<Result> DataList,filterDatalist;
    public Context mContext;
    Typeface materialdesignicons_font;
    public ShayariFavrateAdapter(Context mContext, List<Result> DataList) {
        this.mContext = mContext;
        this.DataList = DataList;
        this.filterDatalist = DataList;
        this.materialdesignicons_font = FontManager.getFontTypefaceMaterialDesignIcons(mContext, "fonts/materialdesignicons-webfont.otf");
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shayari, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int i) {
        holder.data.setText(filterDatalist.get(i).getTextdata());
        holder.sno.setText(String.valueOf(i + 1));
        final DbHelper dbHelper = new DbHelper(mContext);
       final Result result1 = dbHelper.getallFavouriteData(filterDatalist.get(i).getTextdata());
       if (result1!=null) {
           if (result1.getTextdata() != null) {
                   holder.favourite.setTextColor(Color.RED);
                   holder.favourite.setText(Html.fromHtml("&#xf2d1;"));

           }
       }
        holder.favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result result = new Result();
                //result.setPosition(i);
                result.setTextdata(filterDatalist.get(i).getTextdata());
                final Result result1 = dbHelper.getallFavouriteData(filterDatalist.get(i).getTextdata());
                if (result1 != null) {
                    if (result1.getTextdata() != null) {
                        dbHelper.deleteFavouriteData(filterDatalist.get(i).getTextdata());
                        filterDatalist.remove(i);
                        holder.favourite.setText(Html.fromHtml("&#xf2d5;"));
                        if (filterDatalist.size()==0){
                            Intent intent = new Intent(mContext, CategoryHindiActivity.class);
                            mContext.startActivity(intent);
                        }
                    } else {
                        dbHelper.insertFavouriteData(result);
                        holder.favourite.setTextColor(Color.RED);
                        holder.favourite.setText(Html.fromHtml("&#xf2d1;"));
                    }
                }else {
                    dbHelper.insertFavouriteData(result);
                    holder.favourite.setTextColor(Color.RED);
                    holder.favourite.setText(Html.fromHtml("&#xf2d1;"));
                }
                notifyDataSetChanged();
            }
        });
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String listData=new Gson().toJson(filterDatalist);
                Intent intent = new Intent(mContext, ActionViewActivity.class);
                intent.putExtra("textdata", filterDatalist.get(i).getTextdata());
                intent.putExtra("postion", i+1);
                intent.putExtra("totalSize", filterDatalist.size());
                intent.putExtra("list", listData);
                mContext.startActivity(intent);
            }
        });
    }

//    private void moveFragment(Fragment fragment) {
//        FragmentManager fragmentManager = ((FragmentActivity) mContext).getSupportFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.container, fragment)
//                .addToBackStack(null)
//                .commit();
//    }


    @Override
    public int getItemCount() {
        return filterDatalist.size();

    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString().trim();
                // name match condition. this might differ depending on your requirement
                // here we are looking for name or phone number match
                if (charString.isEmpty()) {
                    filterDatalist = DataList;
                } else {
                    List<Result> filteredList = new ArrayList<>();
                    for (Result row : DataList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getTextdata().toLowerCase().trim().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }


                    filterDatalist = filteredList;
                }


                FilterResults filterResults = new FilterResults();
                filterResults.values = filterDatalist;
                return filterResults;
            }


            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filterDatalist = (ArrayList<Result>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView data, sno, favourite;
        LinearLayout linearlayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            data = (TextView) itemView.findViewById(R.id.data);
            sno = (TextView) itemView.findViewById(R.id.sno);
            favourite = (TextView) itemView.findViewById(R.id.favourite);
            linearlayout = (LinearLayout) itemView.findViewById(R.id.linearlayout);
            favourite.setTypeface(materialdesignicons_font);
            favourite.setText(Html.fromHtml("&#xf2d5;"));
        }
    }
}