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
    Button love, sad, romantic, funny, yaad;
    String loveData, sadData, romanticData, funnyData, yaadData;

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
        love.setOnClickListener(this);
        sad.setOnClickListener(this);
        romantic.setOnClickListener(this);
        funny.setOnClickListener(this);
        yaad.setOnClickListener(this);
        HindiLove();
        HindiSad();
        HindiRomantic();
        HindiFunny();
        HindiYaad();
    }

    private void HindiSad() {
        if (Utility.isOnline(this)) {
            // final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            //  ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiSadshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        sadData = workName;
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", CategoryHindiActivity.this);
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }

    private void HindiRomantic() {
        if (Utility.isOnline(this)) {
            // final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            //  ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiRomanticshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        romanticData = workName;
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", CategoryHindiActivity.this);
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }

    private void HindiFunny() {
        if (Utility.isOnline(this)) {
            // final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            //  ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiFunnyshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        funnyData = workName;
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", CategoryHindiActivity.this);
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }

    private void HindiYaad() {
        if (Utility.isOnline(this)) {
            // final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            //  ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiYaadshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        yaadData = workName;
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", CategoryHindiActivity.this);
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }

    private void HindiLove() {
        if (Utility.isOnline(this)) {
            // final BallTriangleDialog ballTriangleDialog = new BallTriangleDialog(this);
            //  ballTriangleDialog.show();
            ServiceCaller serviceCaller = new ServiceCaller(this);
            serviceCaller.callhindiLoveshayari(new IAsyncWorkCompletedCallback() {
                @Override
                public void onDone(String workName, boolean isComplete) {
                    if (isComplete) {
                        loveData = workName;
                    } else {
                        Utility.alertForErrorMessage("Some Problem Try Again", CategoryHindiActivity.this);
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        } else {
            Utility.alertForErrorMessage("Please Connect Your Internet Connection.And Try Again", this);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.love:
                if (loveData != null) {
                    Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                    intent.putExtra("data", loveData);
                    startActivity(intent);
                }
                break;
            case R.id.sad:
                if (sadData != null) {
                    Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                    intent.putExtra("data", sadData);
                    startActivity(intent);
                }
                break;
            case R.id.romantic:
                if (romanticData != null) {
                    Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                    intent.putExtra("data", romanticData);
                    startActivity(intent);
                }
                break;
            case R.id.funny:
                if (funnyData != null) {
                    Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                    intent.putExtra("data", funnyData);
                    startActivity(intent);
                }
                break;
            case R.id.yaad:
                if (yaadData != null) {
                    Intent intent = new Intent(CategoryHindiActivity.this, DataViewActivity.class);
                    intent.putExtra("data", yaadData);
                    startActivity(intent);
                }
                break;
        }
    }
}
