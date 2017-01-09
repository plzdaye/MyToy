package fun.plz.mytoy.application;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import fun.plz.mytoy.UIThread;
import fun.plz.mytoy.data.executor.JobExecutor;
import fun.plz.mytoy.executor.PostExecutionThread;
import fun.plz.mytoy.executor.ThreadExecutor;

/**
 * Created by PLZ on 2017/1/6.
 */
@Module
public class ApplicationModule {
    private final MyToyApplication application;

    public ApplicationModule(MyToyApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    Context provideApplication(){
        return this.application;
    }

    @Provides @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    @Provides @Singleton
    PostExecutionThread providePostExcutionThread(UIThread uiThread){
        return uiThread;
    }
}
