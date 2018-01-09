package lalit.loveshayari.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import lalit.loveshayari.R;
import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.utilities.CompatibilityUtility;
import lalit.loveshayari.utilities.Utility;

public class SplashActivity extends AppCompatActivity {
    Boolean CheckOrientation=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);// Removes action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);// Removes title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        if (CompatibilityUtility.isTablet(SplashActivity.this)) {
            CheckOrientation = true;
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            CheckOrientation = false;
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        HindiLove();
        HindiSad();
        HindiRomantic();
        HindiFunny();
        HindiYaad();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,LanguageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        },4000);
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
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
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
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
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
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
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
                        // loveData = workName;
                    }
                    //  if (ballTriangleDialog.isShowing()) {
                    //     ballTriangleDialog.dismiss();
                    //  }
                }
            });
        }
    }

}
