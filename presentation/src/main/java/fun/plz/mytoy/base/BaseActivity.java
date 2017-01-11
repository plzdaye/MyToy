package fun.plz.mytoy.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import fun.plz.mytoy.application.ApplicationComponent;
import fun.plz.mytoy.application.MyToyApplication;
import fun.plz.mytoy.network.GankApi;
import fun.plz.mytoy.network.PLZFactory;

/**
 * Created by PLZ on 2016/11/18.
 */

public class BaseActivity extends AppCompatActivity {
    public static final GankApi sGankIO = PLZFactory.getGankIOSingleton();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent(){
        return ((MyToyApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }
}
