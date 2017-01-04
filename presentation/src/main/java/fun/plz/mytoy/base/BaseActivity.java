package fun.plz.mytoy.base;

import android.support.v7.app.AppCompatActivity;

import fun.plz.mytoy.network.GankApi;
import fun.plz.mytoy.network.PLZFactory;

/**
 * Created by PLZ on 2016/11/18.
 */

public class BaseActivity extends AppCompatActivity {
    public static final GankApi sGankIO = PLZFactory.getGankIOSingleton();

    @Override protected void onDestroy() {
        super.onDestroy();
    }

}
