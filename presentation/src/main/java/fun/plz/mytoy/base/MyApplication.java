package fun.plz.mytoy.base;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by PLZ on 2016/11/8.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
