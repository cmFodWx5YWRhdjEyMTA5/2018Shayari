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

public class CategoryHindiActivity extends AppCompatActivity implements View.OnClickListener {
    Button love, sad, romantic, funny, yaad, favourite, hindiAankhein,hindiAansoo, hindiAlone, hindiAttitude, hindiBeauty, hindiBewafa,
            hindiBirthday, hindiBollywood, hindiBrokenHeart, hindiDeshBhakti, hindiDilShayari, hindiDooriyan, hindiDua, hindiFriendship,
            hindiHeartTouching, hindiInspirational, hindiInsult, hindiIntezaar, hindiJudai, hindiMaa, hindiMausam, hindiMaut, hindiNafrat,
            hindiSharab, hindiShayariOnLife, hindiSorry, hindiTwoLineShayari;
    //String loveData, sadData, romanticData, funnyData, yaadData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_category_hindi);
        love = (Button) findViewById(R.id.love);
        sad = (Button) findViewById(R.id.sad);
        romantic = (Button) findViewById(R.id.romantic);
        funny = (Button) findViewById(R.id.funny);
        yaad = (Button) findViewById(R.id.yaad);
        hindiAankhein = (Button) findViewById(R.id.hindiAankhein);
        hindiAansoo = (Button) findViewById(R.id.hindiAansoo);
        hindiAlone = (Button) findViewById(R.id.hindiAlone);
        hindiAttitude = (Button) findViewById(R.id.hindiAttitude);
        hindiBeauty = (Button) findViewById(R.id.hindiBeauty);
        hindiBewafa = (Button) findViewById(R.id.hindiBewafa);
        hindiBirthday = (Button) findViewById(R.id.hindiBirthday);
        hindiBollywood = (Button) findViewById(R.id.hindiBollywood);
        hindiBrokenHeart = (Button) findViewById(R.id.hindiBrokenHeart);
        hindiDeshBhakti = (Button) findViewById(R.id.hindiDeshBhakti);
        hindiDilShayari = (Button) findViewById(R.id.hindiDilShayari);
        hindiDooriyan = (Button) findViewById(R.id.hindiDooriyan);
        hindiFriendship = (Button) findViewById(R.id.hindiFriendship);
        hindiHeartTouching = (Button) findViewById(R.id.hindiHeartTouching);
        hindiInspirational = (Button) findViewById(R.id.hindiInspirational);
        hindiInsult = (Button) findViewById(R.id.hindiInsult);
        hindiDua = (Button) findViewById(R.id.hindiDua);
        hindiIntezaar = (Button) findViewById(R.id.hindiIntezaar);
        hindiJudai = (Button) findViewById(R.id.hindiJudai);
        hindiMaa = (Button) findViewById(R.id.hindiMaa);
        hindiMausam = (Button) findViewById(R.id.hindiMausam);
        hindiMaut = (Button) findViewById(R.id.hindiMaut);
        hindiNafrat = (Button) findViewById(R.id.hindiNafrat);
        hindiSharab = (Button) findViewById(R.id.hindiSharab);
        hindiShayariOnLife = (Button) findViewById(R.id.hindiShayariOnLife);
        hindiTwoLineShayari = (Button) findViewById(R.id.hindiTwoLineShayari);
        hindiSorry = (Button) findViewById(R.id.hindiSorry);
        favourite = (Button) findViewById(R.id.favourite);
        love.setOnClickListener(this);
        sad.setOnClickListener(this);
        romantic.setOnClickListener(this);
        funny.setOnClickListener(this);
        yaad.setOnClickListener(this);
        favourite.setOnClickListener(this);
        hindiAankhein.setOnClickListener(this);
        hindiAansoo.setOnClickListener(this);
        hindiAlone.setOnClickListener(this);
        hindiAttitude.setOnClickListener(this);
        hindiBeauty.setOnClickListener(this);
        hindiBewafa.setOnClickListener(this);
        hindiBirthday.setOnClickListener(this);
        hindiBollywood.setOnClickListener(this);
        hindiBrokenHeart.setOnClickListener(this);
        hindiDeshBhakti.setOnClickListener(this);
        hindiDilShayari.setOnClickListener(this);
        hindiDooriyan.setOnClickListener(this);
        hindiDua.setOnClickListener(this);
        hindiFriendship.setOnClickListener(this);
        hindiHeartTouching.setOnClickListener(this);
        hindiInspirational.setOnClickListener(this);
        hindiInsult.setOnClickListener(this);
        hindiIntezaar.setOnClickListener(this);
        hindiJudai.setOnClickListener(this);
        hindiMaa.setOnClickListener(this);
        hindiMausam.setOnClickListener(this);
        hindiMaut.setOnClickListener(this);
        hindiNafrat.setOnClickListener(this);
        hindiSharab.setOnClickListener(this);
        hindiShayariOnLife.setOnClickListener(this);
        hindiSorry.setOnClickListener(this);
        hindiTwoLineShayari.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.love:
                Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intent.putExtra("data", "hindiLoveList");
                intent.putExtra("key", "hindi");
                startActivity(intent);
                break;
            case R.id.sad:
                Intent intentsad = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intentsad.putExtra("data", "hindisadList");
                intentsad.putExtra("key", "hindi");
                startActivity(intentsad);
                break;
            case R.id.romantic:
                Intent intentromantic = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intentromantic.putExtra("data", "hindiromanticList");
                intentromantic.putExtra("key", "hindi");
                startActivity(intentromantic);
                break;
            case R.id.funny:
                Intent intentfunny = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intentfunny.putExtra("data", "hindifunnyList");
                intentfunny.putExtra("key", "hindi");
                startActivity(intentfunny);
                break;
            case R.id.yaad:
                Intent intentyaad = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intentyaad.putExtra("data", "hindiyaadList");
                intentyaad.putExtra("key", "hindi");
                startActivity(intentyaad);
                break;
            case R.id.hindiAankhein:
                Intent hindiAankheinintent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiAankheinintent.putExtra("data", "hindiAankheinData");
                hindiAankheinintent.putExtra("key", "hindi");
                startActivity(hindiAankheinintent);
                break;
            case R.id.hindiAansoo:
                Intent hindiAansoo = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiAansoo.putExtra("data", "hindiAansooList");
                hindiAansoo.putExtra("key", "hindi");
                startActivity(hindiAansoo);
                break;
            case R.id.hindiAlone:
                Intent hindiAlone = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiAlone.putExtra("data", "hindiAloneList");
                hindiAlone.putExtra("key", "hindi");
                startActivity(hindiAlone);
                break;
            case R.id.hindiAttitude:
                Intent hindiAttitude = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiAttitude.putExtra("data", "hindiAttitudeList");
                hindiAttitude.putExtra("key", "hindi");
                startActivity(hindiAttitude);
                break;
            case R.id.hindiBeauty:
                Intent hindiBeauty = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiBeauty.putExtra("data", "hindiBeautyList");
                hindiBeauty.putExtra("key", "hindi");
                startActivity(hindiBeauty);
                break;
            case R.id.hindiBewafa:
                Intent hindiBewafa = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiBewafa.putExtra("data", "hindiBewafaList");
                hindiBewafa.putExtra("key", "hindi");
                startActivity(hindiBewafa);
                break;
            case R.id.hindiBirthday:
                Intent hindiBirthday = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiBirthday.putExtra("data", "hindiBirthdayList");
                hindiBirthday.putExtra("key", "hindi");
                startActivity(hindiBirthday);
                break;
            case R.id.hindiBollywood:
                Intent hindiBollywood = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiBollywood.putExtra("data", "hindiBollywoodList");
                hindiBollywood.putExtra("key", "hindi");
                startActivity(hindiBollywood);
                break;
            case R.id.hindiBrokenHeart:
                Intent hindiBrokenHeart = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiBrokenHeart.putExtra("data", "hindiBrokenHeartList");
                hindiBrokenHeart.putExtra("key", "hindi");
                startActivity(hindiBrokenHeart);
                break;
            case R.id.hindiDeshBhakti:
                Intent hindiDeshBhakti = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiDeshBhakti.putExtra("data", "hindiDeshBhaktiList");
                hindiDeshBhakti.putExtra("key", "hindi");
                startActivity(hindiDeshBhakti);
                break;
            case R.id.hindiDilShayari:
                Intent hindiDilShayari = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiDilShayari.putExtra("data", "hindiDilShayariList");
                hindiDilShayari.putExtra("key", "hindi");
                startActivity(hindiDilShayari);
                break;
            case R.id.hindiDooriyan:
                Intent hindiDooriyan = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiDooriyan.putExtra("data", "hindiDooriyanList");
                hindiDooriyan.putExtra("key", "hindi");
                startActivity(hindiDooriyan);
                break;
            case R.id.hindiDua:
                Intent hindiDua = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiDua.putExtra("data", "hindiDuaList");
                hindiDua.putExtra("key", "hindi");
                startActivity(hindiDua);
                break;
            case R.id.hindiFriendship:
                Intent hindiFriendship = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiFriendship.putExtra("data", "hindiFriendshipList");
                hindiFriendship.putExtra("key", "hindi");
                startActivity(hindiFriendship);
                break;
            case R.id.hindiHeartTouching:
                Intent hindiHeartTouching = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiHeartTouching.putExtra("data", "hindiHeartTouchingList");
                hindiHeartTouching.putExtra("key", "hindi");
                startActivity(hindiHeartTouching);
                break;
            case R.id.hindiInspirational:
                Intent hindiInspirational = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiInspirational.putExtra("data", "hindiInspirationalList");
                hindiInspirational.putExtra("key", "hindi");
                startActivity(hindiInspirational);
                break;
            case R.id.hindiInsult:
                Intent hindiInsult = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiInsult.putExtra("data", "hindiInsultList");
                hindiInsult.putExtra("key", "hindi");
                startActivity(hindiInsult);
                break;
            case R.id.hindiIntezaar:
                Intent hindiIntezaar = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiIntezaar.putExtra("data", "hindiIntezaarList");
                hindiIntezaar.putExtra("key", "hindi");
                startActivity(hindiIntezaar);
                break;
            case R.id.hindiJudai:
                Intent hindiJudai = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiJudai.putExtra("data", "hindiJudaiList");
                hindiJudai.putExtra("key", "hindi");
                startActivity(hindiJudai);
                break;
            case R.id.hindiMaa:
                Intent hindiMaa = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiMaa.putExtra("data", "hindiMaaList");
                hindiMaa.putExtra("key", "hindi");
                startActivity(hindiMaa);
                break;
            case R.id.hindiMausam:
                Intent hindiMausam = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiMausam.putExtra("data", "hindiMausamList");
                hindiMausam.putExtra("key", "hindi");
                startActivity(hindiMausam);
                break;
            case R.id.hindiMaut:
                Intent hindiMaut = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiMaut.putExtra("data", "hindiMautList");
                hindiMaut.putExtra("key", "hindi");
                startActivity(hindiMaut);
                break;
            case R.id.hindiNafrat:
                Intent hindiNafrat = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiNafrat.putExtra("data", "hindiNafratList");
                hindiNafrat.putExtra("key", "hindi");
                startActivity(hindiNafrat);
                break;
            case R.id.hindiSharab:
                Intent hindiSharab = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiSharab.putExtra("data", "hindiSharabList");
                hindiSharab.putExtra("key", "hindi");
                startActivity(hindiSharab);
                break;
            case R.id.hindiShayariOnLife:
                Intent hindiShayariOnLife = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiShayariOnLife.putExtra("data", "hindiShayariOnLifeList");
                hindiShayariOnLife.putExtra("key", "hindi");
                startActivity(hindiShayariOnLife);
                break;
            case R.id.hindiSorry:
                Intent hindiSorry = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiSorry.putExtra("data", "hindiSorryList");
                hindiSorry.putExtra("key", "hindi");
                startActivity(hindiSorry);
                break;
            case R.id.hindiTwoLineShayari:
                Intent hindiTwoLineShayari = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                hindiTwoLineShayari.putExtra("data", "hindiTwoLineShayariList");
                hindiTwoLineShayari.putExtra("key", "hindi");
                startActivity(hindiTwoLineShayari);
                break;
            case R.id.favourite:
                Intent intentfavourite = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                intentfavourite.putExtra("data", "favourite");
                intentfavourite.putExtra("fav", "true");
                intentfavourite.putExtra("key", "hindi");
                startActivity(intentfavourite);
                break;
        }
    }
}
