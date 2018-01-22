package lalit.loveshayari;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import lalit.loveshayari.framework.IAsyncWorkCompletedCallback;
import lalit.loveshayari.framework.ServiceCaller;
import lalit.loveshayari.utilities.Utility;

/**
 * Created by Lalit on 1/22/2018.
 */

public class checkNetwork extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        checkConnection(context);
    }

    private void checkConnection(Context context) {
        if (Utility.isOnline(context)) {
            //hindi.......................................
            HindiLoveShayariFetchData(context);
            HindiSadShayariFetchData(context);
            HindiRomanticShayariFetchData(context);
            HindiFunnyShayariFetchData(context);
            HindiYaadShayariFetchData(context);
            HindiAankheinShayariFetchData(context);
            HindiAansooShayariFetchData(context);
            HindiAloneShayariFetchData(context);
            HindiAttitudeShayariFetchData(context);
            HindiBeautyShayariFetchData(context);
            HindiBewafaShayariFetchData(context);
            HindiBirthdayShayariFetchData(context);
            HindiBollywoodShayariFetchData(context);
            HindiBrokenHeartShayariFetchData(context);
            HindiDeshBhaktiShayariFetchData(context);
            HindiDilShayariFetchData(context);
            HindiDooriyanShayariFetchData(context);
            HindiDuaShayariFetchData(context);
            HindiFriendshipShayariFetchData(context);
            HindiHeartTouchingShayariFetchData(context);
            HindiInspirationalShayariFetchData(context);
            HindiInsultShayariFetchData(context);
            HindiIntezaarShayariFetchData(context);
            HindiJudaiShayariFetchData(context);
            HindiMaaShayariFetchData(context);
            HindiMausamShayariFetchData(context);
            HindiMautShayariFetchData(context);
            HindiNafratShayariFetchData(context);
            HindiSharabShayariFetchData(context);
            HindiShayariOnLifeFetchData(context);
            HindiSorryShayariFetchData(context);
            HindiTwoLineShayariFetchData(context);
            // english....................................
            EnglishLoveShayariFetchData(context);
            EnglishAankheinShayariFetchData(context);
            EnglishAansooShayariFetchData(context);
            EnglishAloneShayariFetchData(context);
            EnglishAttitudeShayariFetchData(context);
            EnglishBeautyShayariFetchData(context);
            EnglishBewafaShayariFetchData(context);
            EnglishBirthdayShayariFetchData(context);
            EnglishBollywoodShayariFetchData(context);
            EnglishBrokenHeartShayariFetchData(context);
            EnglishDeshBhaktiShayariFetchData(context);
            EnglishDilShayariFetchData(context);
            EnglishDooriyanShayariFetchData(context);
            EnglishDuaShayariFetchData(context);
            EnglishFriendshipShayariFetchData(context);
            EnglishHeartTouchingShayariFetchData(context);
            EnglishInspirationalShayariFetchData(context);
            EnglishInsultShayariFetchData(context);
            EnglishIntezaarShayariFetchData(context);
            EnglishJudaiShayariFetchData(context);
            EnglishMaaShayariFetchData(context);
            EnglishMausamShayariFetchData(context);
            EnglishMautShayariFetchData(context);
            EnglishNafratShayariFetchData(context);
            EnglishSharabShayariFetchData(context);
            EnglishShayariOnLifeFetchData(context);
            EnglishSorryShayariFetchData(context);
            EnglishTwoLineShayariFetchData(context);
            EnglishSadShayariFetchData(context);
            EnglishRomanticShayariFetchData(context);
            EnglishFunnyShayariFetchData(context);
            EnglishYaadShayariFetchData(context);
        }

    }


    private void HindiDooriyanShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiDooriyanshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDuaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiDuashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDilShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiDilshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBewafaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiBewafashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiMaaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiMaashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiJudaiShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiJudaishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiIntezaarShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiIntezaarshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiInsultShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiInsultshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


    private void HindiInspirationalShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiInspirationalshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiHeartTouchingShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiHeartTouchingshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiFriendshipShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiFriendshipshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiBirthdayShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiBirthdayshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBollywoodShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiBollywoodshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBrokenHeartShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiBrokenHeartshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiDeshBhaktiShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiDeshBhaktishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiSharabShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiSharabshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiNafratShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiNafratshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiMautShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiMautshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiMausamShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiMausamshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });

    }

    private void HindiShayariOnLifeFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiShayariOnLifeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiSorryShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiSorryshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiBeautyShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiBeautyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiTwoLineShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiTwoLineShayarishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAttitudeShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiAttitudeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAloneShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiAloneshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAansooShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiAansooshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiAankheinShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiAankheinshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiSadShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiSadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiRomanticShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiRomanticshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiFunnyShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiFunnyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiYaadShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiYaadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void HindiLoveShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callhindiLoveshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    //...................................................................english.................................
    private void EnglishLoveShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishLoveshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSadShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishSadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {

                }
            }
        });
    }

    private void EnglishRomanticShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishRomanticshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {

                }
            }
        });
    }

    private void EnglishFunnyShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishFunnyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishYaadShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishYaadshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishTwoLineShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishTwoLineShayarishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSorryShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishSorryshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishShayariOnLifeFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishShayariOnLifeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishSharabShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishSharabshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishNafratShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishNafratshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMautShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishMautshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMausamShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishMausamshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishMaaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishMaashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishJudaiShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishJudaishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishIntezaarShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishIntezaarshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishInsultShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishInsultshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishInspirationalShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishInspirationalshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishHeartTouchingShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishHeartTouchingshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishFriendshipShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishFriendshipshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDuaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishDuashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDooriyanShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishDooriyanshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDilShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishDilshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishDeshBhaktiShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishDeshBhaktishayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBrokenHeartShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishBrokenHeartshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBollywoodShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishBollywoodshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBirthdayShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishBirthdayshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBewafaShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishBewafashayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAloneShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishAloneshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAttitudeShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishAttitudeshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishAankheinShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishAankheinshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }

    private void EnglishBeautyShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishBeautyshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


    private void EnglishAansooShayariFetchData(Context context) {
        ServiceCaller serviceCaller = new ServiceCaller(context);
        serviceCaller.callEnglishAansooshayari(new IAsyncWorkCompletedCallback() {
            @Override
            public void onDone(String workName, boolean isComplete) {
                if (isComplete) {
                }
            }
        });
    }


}
