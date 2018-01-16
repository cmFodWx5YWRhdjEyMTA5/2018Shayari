package lalit.loveshayari.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import lalit.loveshayari.R;
import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.utilities.Utility;

public class CategoryEngliahActivity extends AppCompatActivity implements View.OnClickListener {
    Button love, sad, romantic, funny, yaad, favourite;
    //String loveData, sadData, romanticData, funnyData, yaadData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_category_engliah);
        love = (Button) findViewById(R.id.love);
        sad = (Button) findViewById(R.id.sad);
        romantic = (Button) findViewById(R.id.romantic);
        funny = (Button) findViewById(R.id.funny);
        yaad = (Button) findViewById(R.id.yaad);
        favourite = (Button) findViewById(R.id.favourite);
        love.setOnClickListener(this);
        sad.setOnClickListener(this);
        romantic.setOnClickListener(this);
        funny.setOnClickListener(this);
        yaad.setOnClickListener(this);
        favourite.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.love:
                Intent intent = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intent.putExtra("data", "loveData");
                startActivity(intent);
                break;
            case R.id.sad:
                Intent intentsad = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentsad.putExtra("data", "sadData");
                startActivity(intentsad);
                break;
            case R.id.romantic:
                Intent intentromantic = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentromantic.putExtra("data", "romanticData");
                startActivity(intentromantic);
                break;
            case R.id.funny:
                Intent intentfunny = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentfunny.putExtra("data", "funnyData");
                startActivity(intentfunny);
                break;
            case R.id.yaad:
                Intent intentyaad = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentyaad.putExtra("data", "yaadData");
                startActivity(intentyaad);
                break;
            case R.id.favourite:
                Intent intentfavourite = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentfavourite.putExtra("data", "favourite");
                intentfavourite.putExtra("fav", "true");
                startActivity(intentfavourite);
                break;
        }
    }
}