package fun.plz.mytoy.base.baseActivity;

import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import fun.plz.mytoy.base.PerActivity;

/**
 * Created by PLZ on 2017/1/9.
 */
@Module
public class ActivityModule {
    private final AppCompatActivity appCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides
    @PerActivity
    AppCompatActivity AppCompatActivity() {
        return this.appCompatActivity;
    }
}
