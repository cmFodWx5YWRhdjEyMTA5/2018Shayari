package lalit.loveshayari.utilities;

import android.os.Environment;

/**
 * Created by lalit on 7/25/2017.
 */
public class Contants {
    public static final Boolean IS_DEBUG_LOG = true;

    public static final String LOG_TAG = "shayari";
    public static final String APP_NAME = "appName"; // Do NOT change this value; meant for user preference

    public static final String DEFAULT_APPLICATION_NAME = "shayari";

    public static final String APP_DIRECTORY = "/E" + DEFAULT_APPLICATION_NAME + "Directory/";
    public static final String DATABASE_NAME = "shayari.db";// Environment.getExternalStorageDirectory() +  APP_DIRECTORY + "evergreen.db";

    public static String SERVICE_BASE_URL = "http://lalitsingh2.esy.es/shayariapis/";

    public static String outputBasePath = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static String outputDirectoryLocation = outputBasePath + "/shayariUnzipped/";


    public static final int LIST_PAGE_SIZE = 50;
    public static String InternetMessage = " You are Online.";
    public static final String BAD_NETWORK_MESSAGE = "We are trying hard to get latest content but the network seems to be slow. " +
            "You may continue to use app and get latest with in the app itself. ";


    public static final String OFFLINE_MESSAGE = "Oops! You are Offline. Please check your Internet Connection.";

    public static final String HindiLoveShayariFetchData = "HindiLoveShayariFetchData.php";
    public static final String HindiRomanticShayariFetchData = "HindiRomanticShayariFetchData.php";
    public static final String HindiSadShayariFetchData = "HindiSadShayariFetchData.php";
    public static final String HindiFunnyShayariFetchData = "HindiFunnyShayariFetchData.php";
    public static final String HindiYaadShayariFetchData = "HindiYaadShayariFetchData.php";
    public static final String HindiAankheinShayariFetchData = "HindiAankheinShayariFetchData.php";
    public static final String HindiAansooShayariFetchData = "HindiAansooShayariFetchData.php";
    public static final String HindiAloneShayariFetchData = "HindiAloneShayariFetchData.php";
    public static final String HindiAttitudeShayariFetchData = "HindiAttitudeShayariFetchData.php";
    public static final String HindiBeautyShayariFetchData = "HindiBeautyShayariFetchData.php";
    public static final String HindiBewafaShayariFetchData = "HindiBewafaShayariFetchData.php";
    public static final String HindiBirthdayShayariFetchData = "HindiBirthdayShayariFetchData.php";
    public static final String HindiBollywoodShayariFetchData = "HindiBollywoodShayariFetchData.php";
    public static final String HindiBrokenHeartShayariFetchData = "HindiBrokenHeartShayariFetchData.php";
    public static final String HindiDeshBhaktiShayariFetchData = "HindiDeshBhaktiShayariFetchData.php";
    public static final String HindiDilShayariFetchData = "HindiDilShayariFetchData.php";
    public static final String HindiDooriyanShayariFetchData = "HindiDooriyanShayariFetchData.php";
    public static final String HindiDuaShayariFetchData = "HindiDuaShayariFetchData.php";
    public static final String HindiFriendshipShayariFetchData = "HindiFriendshipShayariFetchData.php";
    public static final String HindiHeartTouchingShayariFetchData = "HindiHeartTouchingShayariFetchData.php";
    public static final String HindiInspirationalShayariFetchData = "HindiInspirationalShayariFetchData.php";
    public static final String HindiInsultShayariFetchData = "HindiInsultShayariFetchData.php";
    public static final String HindiIntezaarShayariFetchData = "HindiIntezaarShayariFetchData.php";
    public static final String HindiJudaiShayariFetchData = "HindiJudaiShayariFetchData.php";
    public static final String HindiMaaShayariFetchData = "HindiMaaShayariFetchData.php";
    public static final String HindiMausamShayariFetchData = "HindiMausamShayariFetchData.php";
    public static final String HindiMautShayariFetchData = "HindiMautShayariFetchData.php";
    public static final String HindiNafratShayariFetchData = "HindiNafratShayariFetchData.php";
    public static final String HindiSharabShayariFetchData = "HindiSharabShayariFetchData.php";
    public static final String HindiShayariOnLifeFetchData = "HindiShayariOnLifeFetchData.php";
    public static final String HindiSorryShayariFetchData = "HindiSorryShayariFetchData.php";
    public static final String HindiTwoLineShayariFetchData = "HindiTwoLineShayariFetchData.php";
    //english.........
    public static final String EnglishLoveShayariFetchData = "EnglishLoveShayariFetchData.php";
    public static final String EnglishAankheinShayariFetchData = "EnglishAankheinShayariFetchData.php";
    public static final String EnglishAansooShayariFetchData= "EnglishAansooShayariFetchData.php";
    public static final String EnglishAloneShayariFetchData= "EnglishAloneShayariFetchData.php";
    public static final String EnglishAttitudeShayariFetchData= "EnglishAttitudeShayariFetchData.php";
    public static final String EnglishBeautyShayariFetchData= "EnglishBeautyShayariFetchData.php";
    public static final String EnglishBewafaShayariFetchData= "EnglishBewafaShayariFetchData.php";
    public static final String EnglishBirthdayShayariFetchData= "EnglishBirthdayShayariFetchData.php";
    public static final String EnglishBollywoodShayariFetchData= "EnglishBollywoodShayariFetchData.php";
    public static final String EnglishBrokenHeartShayariFetchData= "EnglishBrokenHeartShayariFetchData.php";
    public static final String EnglishDeshBhaktiShayariFetchData= "EnglishDeshBhaktiShayariFetchData.php";
    public static final String EnglishDilShayariFetchData= "EnglishDilShayariFetchData.php";
    public static final String EnglishDooriyanShayariFetchData= "EnglishDooriyanShayariFetchData.php";
    public static final String EnglishDuaShayariFetchData= "EnglishDuaShayariFetchData.php";
    public static final String EnglishFriendshipShayariFetchData= "EnglishFriendshipShayariFetchData.php";
    public static final String EnglishHeartTouchingShayariFetchData= "EnglishHeartTouchingShayariFetchData.php";
    public static final String EnglishInspirationalShayariFetchData= "EnglishInspirationalShayariFetchData.php";
    public static final String EnglishInsultShayariFetchData= "EnglishInsultShayariFetchData.php";
    public static final String EnglishIntezaarShayariFetchData= "EnglishIntezaarShayariFetchData.php";
    public static final String EnglishJudaiShayariFetchData= "EnglishJudaiShayariFetchData.php";
    public static final String EnglishMaaShayariFetchData= "EnglishMaaShayariFetchData.php";
    public static final String EnglishMausamShayariFetchData= "EnglishMausamShayariFetchData.php";
    public static final String EnglishMautShayariFetchData= "EnglishMautShayariFetchData.php";
    public static final String EnglishNafratShayariFetchData= "EnglishNafratShayariFetchData.php";
    public static final String EnglishSharabShayariFetchData= "EnglishSharabShayariFetchData.php";
    public static final String EnglishShayariOnLifeFetchData= "EnglishShayariOnLifeFetchData.php";
    public static final String EnglishSorryShayariFetchData= "EnglishSorryShayariFetchData.php";
    public static final String EnglishTwoLineShayariFetchData= "EnglishTwoLineShayariFetchData.php";
    public static final String EnglishSadShayariFetchData = "EnglishSadShayariFetchData.php";
    public static final String EnglishRomanticShayariFetchData = "EnglishRomanticShayariFetchData.php";
    public static final String EnglishFunnyShayariFetchData = "EnglishFunnyShayariFetchData.php";
    public static final String EnglishYaadShayariFetchData = "EnglishYaadShayariFetchData.php";




    public static final String UserShayariFetchData = "UserShayariFetchData.php";
    public static final String UserShayariSetData = "UserShayariSetData.php";
}
