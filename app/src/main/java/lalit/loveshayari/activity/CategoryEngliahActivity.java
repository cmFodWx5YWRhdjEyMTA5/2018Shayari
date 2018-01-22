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
    Button love, sad, romantic, funny, yaad, favourite,englishAankhein,englishAansoo,englishAlone,englishAttitude,englishBeauty,
            englishBewafa,englishBirthday,englishBollywood,englishBrokenHeart,englishDeshBhakti,englishDilShayari,englishDooriyan,
            englishDua,englishFriendship,englishHeartTouching,englishInspirational,englishInsult,englishIntezaar,englishJudai,
            englishMaa,englishMausam,englishMaut,englishNafrat,englishSharab,englishShayariOnLife,englishSorry,englishTwoLineShayari;
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
        englishAankhein = (Button) findViewById(R.id.englishAankhein);
        englishAansoo = (Button) findViewById(R.id.englishAansoo);
        englishAlone = (Button) findViewById(R.id.englishAlone);
        englishAttitude = (Button) findViewById(R.id.englishAttitude);
        englishBeauty = (Button) findViewById(R.id.englishBeauty);
        englishBewafa = (Button) findViewById(R.id.englishBewafa);
        englishBirthday = (Button) findViewById(R.id.englishBirthday);
        englishBollywood = (Button) findViewById(R.id.englishBollywood);
        englishBrokenHeart = (Button) findViewById(R.id.englishBrokenHeart);
        englishDeshBhakti = (Button) findViewById(R.id.englishDeshBhakti);
        englishDilShayari = (Button) findViewById(R.id.englishDilShayari);
        englishDooriyan = (Button) findViewById(R.id.englishDooriyan);
        englishDua = (Button) findViewById(R.id.englishDua);
        englishFriendship = (Button) findViewById(R.id.englishFriendship);
        englishHeartTouching = (Button) findViewById(R.id.englishHeartTouching);
        englishInspirational = (Button) findViewById(R.id.englishInspirational);
        englishInsult = (Button) findViewById(R.id.englishInsult);
        englishIntezaar = (Button) findViewById(R.id.englishIntezaar);
        englishJudai = (Button) findViewById(R.id.englishJudai);
        englishMaa = (Button) findViewById(R.id.englishMaa);
        englishMausam = (Button) findViewById(R.id.englishMausam);
        englishMaut = (Button) findViewById(R.id.englishMaut);
        englishNafrat = (Button) findViewById(R.id.englishNafrat);
        englishSharab = (Button) findViewById(R.id.englishSharab);
        englishShayariOnLife = (Button) findViewById(R.id.englishShayariOnLife);
        englishSorry = (Button) findViewById(R.id.englishSorry);
        englishTwoLineShayari = (Button) findViewById(R.id.englishTwoLineShayari);
        love.setOnClickListener(this);
        sad.setOnClickListener(this);
        romantic.setOnClickListener(this);
        funny.setOnClickListener(this);
        yaad.setOnClickListener(this);
        favourite.setOnClickListener(this);
        englishAankhein.setOnClickListener(this);
        englishAansoo.setOnClickListener(this);
        englishAlone.setOnClickListener(this);
        englishAttitude.setOnClickListener(this);
        englishBeauty.setOnClickListener(this);
        englishBewafa.setOnClickListener(this);
        englishBirthday.setOnClickListener(this);
        englishBollywood.setOnClickListener(this);
        englishBrokenHeart.setOnClickListener(this);
        englishDeshBhakti.setOnClickListener(this);
        englishDilShayari.setOnClickListener(this);
        englishDooriyan.setOnClickListener(this);
        englishDua.setOnClickListener(this);
        englishFriendship.setOnClickListener(this);
        englishHeartTouching.setOnClickListener(this);
        englishInspirational.setOnClickListener(this);
        englishInsult.setOnClickListener(this);
        englishIntezaar.setOnClickListener(this);
        englishJudai.setOnClickListener(this);
        englishMaa.setOnClickListener(this);
        englishMausam.setOnClickListener(this);
        englishMaut.setOnClickListener(this);
        englishNafrat.setOnClickListener(this);
        englishSharab.setOnClickListener(this);
        englishShayariOnLife.setOnClickListener(this);
        englishSorry.setOnClickListener(this);
        englishTwoLineShayari.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.love:
                Intent intent = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intent.putExtra("data", "englishLoveList");
                intent.putExtra("key", "english");
                startActivity(intent);
                break;
            case R.id.sad:
                Intent intentsad = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentsad.putExtra("data", "englishsadList");
                intentsad.putExtra("key", "english");
                startActivity(intentsad);
                break;
            case R.id.romantic:
                Intent intentromantic = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentromantic.putExtra("data", "englishromanticList");
                intentromantic.putExtra("key", "english");
                startActivity(intentromantic);
                break;
            case R.id.funny:
                Intent intentfunny = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentfunny.putExtra("data", "englishfunnyList");
                intentfunny.putExtra("key", "english");
                startActivity(intentfunny);
                break;
            case R.id.yaad:
                Intent intentyaad = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                intentyaad.putExtra("data", "englishyaadList");
                intentyaad.putExtra("key", "english");
                startActivity(intentyaad);
                break;
            case R.id.englishAankhein:
                Intent hindiAankheinintent = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiAankheinintent.putExtra("data", "englishAankheinList");
                hindiAankheinintent.putExtra("key", "english");
                startActivity(hindiAankheinintent);
                break;
            case R.id.englishAansoo:
                Intent hindiAansoo = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiAansoo.putExtra("data", "englishAansooList");
                hindiAansoo.putExtra("key", "english");
                startActivity(hindiAansoo);
                break;
            case R.id.englishAlone:
                Intent hindiAlone = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiAlone.putExtra("data", "englishAloneList");
                hindiAlone.putExtra("key", "english");
                startActivity(hindiAlone);
                break;
            case R.id.englishAttitude:
                Intent hindiAttitude = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiAttitude.putExtra("data", "englishAttitudeList");
                hindiAttitude.putExtra("key", "english");
                startActivity(hindiAttitude);
                break;
            case R.id.englishBeauty:
                Intent hindiBeauty = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiBeauty.putExtra("data", "englishBeautyList");
                hindiBeauty.putExtra("key", "english");
                startActivity(hindiBeauty);
                break;
            case R.id.englishBewafa:
                Intent hindiBewafa = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiBewafa.putExtra("data", "englishBewafaList");
                hindiBewafa.putExtra("key", "english");
                startActivity(hindiBewafa);
                break;
            case R.id.englishBirthday:
                Intent hindiBirthday = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiBirthday.putExtra("data", "englishBirthdayList");
                hindiBirthday.putExtra("key", "english");
                startActivity(hindiBirthday);
                break;
            case R.id.englishBollywood:
                Intent hindiBollywood = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiBollywood.putExtra("data", "englishBollywoodList");
                hindiBollywood.putExtra("key", "english");
                startActivity(hindiBollywood);
                break;
            case R.id.englishBrokenHeart:
                Intent hindiBrokenHeart = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiBrokenHeart.putExtra("data", "englishBrokenHeartList");
                hindiBrokenHeart.putExtra("key", "english");
                startActivity(hindiBrokenHeart);
                break;
            case R.id.englishDeshBhakti:
                Intent hindiDeshBhakti = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiDeshBhakti.putExtra("data", "englishDeshBhaktiList");
                hindiDeshBhakti.putExtra("key", "english");
                startActivity(hindiDeshBhakti);
                break;
            case R.id.englishDilShayari:
                Intent hindiDilShayari = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiDilShayari.putExtra("data", "englishDilShayariList");
                hindiDilShayari.putExtra("key", "english");
                startActivity(hindiDilShayari);
                break;
            case R.id.englishDooriyan:
                Intent hindiDooriyan = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiDooriyan.putExtra("data", "englishDooriyanList");
                hindiDooriyan.putExtra("key", "english");
                startActivity(hindiDooriyan);
                break;
            case R.id.englishDua:
                Intent hindiDua = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiDua.putExtra("data", "englishDuaList");
                hindiDua.putExtra("key", "english");
                startActivity(hindiDua);
                break;
            case R.id.englishFriendship:
                Intent hindiFriendship = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiFriendship.putExtra("data", "englishFriendshipList");
                hindiFriendship.putExtra("key", "english");
                startActivity(hindiFriendship);
                break;
            case R.id.englishHeartTouching:
                Intent hindiHeartTouching = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiHeartTouching.putExtra("data", "englishHeartTouchingList");
                hindiHeartTouching.putExtra("key", "english");
                startActivity(hindiHeartTouching);
                break;
            case R.id.englishInspirational:
                Intent hindiInspirational = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiInspirational.putExtra("data", "englishInspirationalList");
                hindiInspirational.putExtra("key", "english");
                startActivity(hindiInspirational);
                break;
            case R.id.englishInsult:
                Intent hindiInsult = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiInsult.putExtra("data", "englishInsultList");
                hindiInsult.putExtra("key", "english");
                startActivity(hindiInsult);
                break;
            case R.id.englishIntezaar:
                Intent hindiIntezaar = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiIntezaar.putExtra("data", "englishIntezaarList");
                hindiIntezaar.putExtra("key", "english");
                startActivity(hindiIntezaar);
                break;
            case R.id.englishJudai:
                Intent hindiJudai = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiJudai.putExtra("data", "englishJudaiList");
                hindiJudai.putExtra("key", "english");
                startActivity(hindiJudai);
                break;
            case R.id.englishMaa:
                Intent hindiMaa = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiMaa.putExtra("data", "englishMaaList");
                hindiMaa.putExtra("key", "english");
                startActivity(hindiMaa);
                break;
            case R.id.englishMausam:
                Intent hindiMausam = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiMausam.putExtra("data", "englishMausamList");
                hindiMausam.putExtra("key", "english");
                startActivity(hindiMausam);
                break;
            case R.id.englishMaut:
                Intent hindiMaut = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiMaut.putExtra("data", "englishMautList");
                hindiMaut.putExtra("key", "english");
                startActivity(hindiMaut);
                break;
            case R.id.englishNafrat:
                Intent hindiNafrat = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiNafrat.putExtra("data", "englishNafratList");
                hindiNafrat.putExtra("key", "english");
                startActivity(hindiNafrat);
                break;
            case R.id.englishSharab:
                Intent hindiSharab = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiSharab.putExtra("data", "englishSharabList");
                hindiSharab.putExtra("key", "english");
                startActivity(hindiSharab);
                break;
            case R.id.englishShayariOnLife:
                Intent hindiShayariOnLife = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiShayariOnLife.putExtra("data", "englishShayariOnLifeList");
                hindiShayariOnLife.putExtra("key", "english");
                startActivity(hindiShayariOnLife);
                break;
            case R.id.englishSorry:
                Intent hindiSorry = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiSorry.putExtra("data", "englishSorryList");
                hindiSorry.putExtra("key", "english");
                startActivity(hindiSorry);
                break;
            case R.id.englishTwoLineShayari:
                Intent hindiTwoLineShayari = new Intent(CategoryEngliahActivity.this, DataViewActivity.class);
                hindiTwoLineShayari.putExtra("data", "englishTwoLineShayariList");
                hindiTwoLineShayari.putExtra("key", "english");
                startActivity(hindiTwoLineShayari);
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