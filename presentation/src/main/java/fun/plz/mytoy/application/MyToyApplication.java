package fun.plz.mytoy.application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import fun.plz.mytoy.BuildConfig;

/**
 * Created by PLZ on 2016/11/8.
 */

public class MyToyApplication extends Application {
    private ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
        initializeLeakDetection();
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    private void initializeLeakDetection() {
        if(BuildConfig.DEBUG){
            LeakCanary.install(this);
        }
    }
}
