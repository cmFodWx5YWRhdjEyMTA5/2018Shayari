package lalit.loveshayari.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import lalit.loveshayari.R;
import lalit.loveshayari.english.EnglishFunnyActivity;
import lalit.loveshayari.english.EnglishLoveActivity;
import lalit.loveshayari.english.EnglishRomanticActivity;
import lalit.loveshayari.english.EnglishSadActivity;
import lalit.loveshayari.english.EnglishYaadActivity;
import lalit.loveshayari.hindi.HindiFunnyActivity;
import lalit.loveshayari.hindi.HindiLoveActivity;
import lalit.loveshayari.hindi.HindiRomanticActivity;
import lalit.loveshayari.hindi.HindiSadActivity;
import lalit.loveshayari.hindi.HindiYaadActivity;

public class CategoryEngliahActivity extends AppCompatActivity implements View.OnClickListener {
    Button love, sad, romantic, funny, yaad;

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
        love.setOnClickListener(this);
        sad.setOnClickListener(this);
        romantic.setOnClickListener(this);
        funny.setOnClickListener(this);
        yaad.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.love:
                startActivity(new Intent(CategoryEngliahActivity.this, EnglishLoveActivity.class));
                break;
            case R.id.sad:
                startActivity(new Intent(CategoryEngliahActivity.this, EnglishSadActivity.class));
                break;
            case R.id.romantic:
                startActivity(new Intent(CategoryEngliahActivity.this, EnglishRomanticActivity.class));
                break;
            case R.id.funny:
                startActivity(new Intent(CategoryEngliahActivity.this, EnglishFunnyActivity.class));
                break;
            case R.id.yaad:
                startActivity(new Intent(CategoryEngliahActivity.this, EnglishYaadActivity.class));
                break;
        }
    }
}
