package lalit.loveshayari.activity;

import android.content.Context;
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
    Boolean CheckOrientation = false;

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
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LanguageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }, 5000);

//hindi.....................
        HindiLoveShayariFetchData();
        HindiSadShayariFetchData();
        HindiRomanticShayariFetchData();
        HindiFunnyShayariFetchData();
        HindiYaadShayariFetchData();
        HindiAankheinShayariFetchData();
        HindiAansooShayariFetchData();
        HindiAloneShayariFetchData();
        HindiAttitudeShayariFetchData();
        HindiBeautyShayariFetchData();
        HindiBewafaShayariFetchData();
        HindiBirthdayShayariFetchData();
        HindiBollywoodShayariFetchData();
        HindiBrokenHeartShayariFetchData();
        HindiDeshBhaktiShayariFetchData();
        HindiDilShayariFetchData();
        HindiDooriyanShayariFetchData();
        HindiDuaShayariFetchData();
        HindiFriendshipShayariFetchData();
        HindiHeartTouchingShayariFetchData();
        HindiInspirationalShayariFetchData();
        HindiInsultShayariFetchData();
        HindiIntezaarShayariFetchData();
        HindiJudaiShayariFetchData();
        HindiMaaShayariFetchData();
        HindiMausamShayariFetchData();
        HindiMautShayariFetchData();
        HindiNafratShayariFetchData();
        HindiSharabShayariFetchData();
        HindiShayariOnLifeFetchData();
        HindiSorryShayariFetchData();
        HindiTwoLineShayariFetchData();
        // english....................................
        EnglishLoveShayariFetchData();
        EnglishAankheinShayariFetchData();
        EnglishAansooShayariFetchData();
        EnglishAloneShayariFetchData();
        EnglishAttitudeShayariFetchData();
        EnglishBeautyShayariFetchData();
        EnglishBewafaShayariFetchData();
        EnglishBirthdayShayariFetchData();
        EnglishBollywoodShayariFetchData();
        EnglishBrokenHeartShayariFetchData();
        EnglishDeshBhaktiShayariFetchData();
        EnglishDilShayariFetchData();
        EnglishDooriyanShayariFetchData();
        EnglishDuaShayariFetchData();
        EnglishFriendshipShayariFetchData();
        EnglishHeartTouchingShayariFetchData();
        EnglishInspirationalShayariFetchData();
        EnglishInsultShayariFetchData();
        EnglishIntezaarShayariFetchData();
        EnglishJudaiShayariFetchData();
        EnglishMaaShayariFetchData();
        EnglishMausamShayariFetchData();
        EnglishMautShayariFetchData();
        EnglishNafratShayariFetchData();
        EnglishSharabShayariFetchData();
        EnglishShayariOnLifeFetchData();
        EnglishSorryShayariFetchData();
        EnglishTwoLineShayariFetchData();
        EnglishSadShayariFetchData();
        EnglishRomanticShayariFetchData();
        EnglishFunnyShayariFetchData();
        EnglishYaadShayariFetchData();
    }

    private void HindiDooriyanShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiDooriyanshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDuaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiDuashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDilShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiDilshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBewafaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiBewafashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiMaaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiMaashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiJudaiShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiJudaishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiIntezaarShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiIntezaarshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiInsultShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiInsultshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


    private void HindiInspirationalShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiInspirationalshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiHeartTouchingShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiHeartTouchingshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiFriendshipShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiFriendshipshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiBirthdayShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiBirthdayshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBollywoodShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiBollywoodshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBrokenHeartShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiBrokenHeartshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDeshBhaktiShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiDeshBhaktishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiSharabShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiSharabshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiNafratShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiNafratshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiMautShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiMautshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiMausamShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiMausamshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiShayariOnLifeFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiShayariOnLifeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiSorryShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiSorryshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBeautyShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiBeautyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiTwoLineShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiTwoLineShayarishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAttitudeShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiAttitudeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAloneShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiAloneshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAansooShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiAansooshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAankheinShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiAankheinshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiSadShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiSadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiRomanticShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiRomanticshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiFunnyShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiFunnyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiYaadShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiYaadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiLoveShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callhindiLoveshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    //...................................................................english.................................
    private void EnglishLoveShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishLoveshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSadShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishSadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {

                }
            }
        });
    }

    private void EnglishRomanticShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishRomanticshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {

                }
            }
        });
    }

    private void EnglishFunnyShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishFunnyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishYaadShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishYaadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishTwoLineShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishTwoLineShayarishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSorryShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishSorryshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishShayariOnLifeFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishShayariOnLifeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSharabShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishSharabshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishNafratShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishNafratshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMautShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishMautshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMausamShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishMausamshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMaaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishMaashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishJudaiShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishJudaishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishIntezaarShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishIntezaarshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishInsultShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishInsultshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishInspirationalShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishInspirationalshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishHeartTouchingShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishHeartTouchingshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishFriendshipShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishFriendshipshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDuaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishDuashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDooriyanShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishDooriyanshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDilShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishDilshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDeshBhaktiShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishDeshBhaktishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBrokenHeartShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishBrokenHeartshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBollywoodShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishBollywoodshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBirthdayShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishBirthdayshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBewafaShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishBewafashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAloneShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishAloneshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAttitudeShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishAttitudeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAankheinShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishAankheinshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBeautyShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishBeautyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


    private void EnglishAansooShayariFetchData() {
        ServiceCaller serviceCaller = new ServiceCaller(this);
        serviceCaller.callEnglishAansooshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


}

