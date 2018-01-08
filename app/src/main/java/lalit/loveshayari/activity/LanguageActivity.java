package lalit.loveshayari.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.jsoup.Jsoup;

import lalit.loveshayari.R;
import lalit.loveshayari.utilities.Utility;

public class LanguageActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_language);
        checkForceUpdate();
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
        Button hindi = (Button) findViewById(R.id.hindi);
       //TextView upload = (TextView) findViewById(R.id.upload);
        Button engliah = (Button) findViewById(R.id.english);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageActivity.this, CategoryHindiActivity.class));
            }
        });
        engliah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageActivity.this, CategoryEngliahActivity.class));
            }
        });

    }
    public void checkForceUpdate() {

        new AsyncTask<Void, String, String>() {
            @Override
            protected String doInBackground(Void... voids) {

                String newVersion = null;
                try {
                    newVersion = Jsoup.connect("https://play.google.com/store/apps/details?id=" + LanguageActivity.this.getPackageName() + "&hl=it")
                            .timeout(30000)
                            .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                            .referrer("http://www.google.com")
                            .get()
                            .select("div[itemprop=softwareVersion]")
                            .first()
                            .ownText();
                    return newVersion;
                } catch (Exception e) {
                    return newVersion;
                }
            }

            @Override
            protected void onPostExecute(String onlineVersion) {
                super.onPostExecute(onlineVersion);
                if (onlineVersion != null && !onlineVersion.isEmpty()) {
                    if (Float.valueOf(Utility.getAppVersionName(LanguageActivity.this)) < Float.valueOf(onlineVersion)) {
                        //show dialog
                        showUpdateDialog(LanguageActivity.this);
                    } else {
                        //  MoveNextScreen();
                    }
                }

                Log.d("update", "Current version " + Utility.getAppVersionName(LanguageActivity.this) + "playstore version " + onlineVersion);
            }
        }.execute();
    }

    private void showUpdateDialog(final Context context) {
        //alert for error message

        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        Typeface robotoRegular = Typeface.createFromAsset(context.getAssets(), "fonts/roboto.regular.ttf");
        Typeface robotoMedium = Typeface.createFromAsset(context.getAssets(), "fonts/roboto.medium.ttf");
        final AlertDialog alert = builder.create();
        View view = alert.getLayoutInflater().inflate(R.layout.custom_update_alert, null);
        TextView title = (TextView) view.findViewById(R.id.textMessage);
        TextView title2 = (TextView) view.findViewById(R.id.textMessage2);
        title.setTypeface(robotoMedium);
        title2.setTypeface(robotoRegular);
        Button ok = (Button) view.findViewById(R.id.buttonUpdate);
        Button buttonCancel = (Button) view.findViewById(R.id.buttonCancel);
        ok.setTypeface(robotoMedium);
        buttonCancel.setTypeface(robotoMedium);
        alert.setCustomTitle(view);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + "lalit.loveshayari" + "&hl=en"));
                context.startActivity(intent);
                alert.dismiss();
            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
                //MoveNextScreen();
            }
        });
        alert.show();
        alert.setCanceledOnTouchOutside(false);
    }


    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}
