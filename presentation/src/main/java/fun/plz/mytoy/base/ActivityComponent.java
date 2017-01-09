package fun.plz.mytoy.base;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import dagger.Component;
import fun.plz.mytoy.PerActivity;

/**
 * Created by PLZ on 2017/1/9.
 */
@PerActivity
@Component(dependencies = ActivityComponent.class, modules = ActivityModule.class)
interface ActivityComponent {
    Activity activity();
}
