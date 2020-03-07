package cn.addapp.androidpickers;

import android.app.Application;

import androidx.multidex.BuildConfig;

import cn.addapp.pickers.common.AppConfig;
import cn.addapp.pickers.util.LogUtils;

/**
 * @author matt
 * blog: addapp.cn
 */
public class PickerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.setIsDebug(BuildConfig.DEBUG);
        if (!LogUtils.isDebug()) {
            android.util.Log.d(AppConfig.DEBUG_TAG, "logcat is disabled");
        }
    }

}
