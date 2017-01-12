package fun.plz.mytoy.application;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import fun.plz.mytoy.base.baseActivity.BaseActivity;
import fun.plz.mytoy.executor.PostExecutionThread;
import fun.plz.mytoy.executor.ThreadExecutor;

/**
 * Created by PLZ on 2017/1/6.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
    ThreadExecutor threadExcutor();
    PostExecutionThread postExecutionThread();
}
