package fun.plz.mytoy.base.baseFragment;

import android.support.v4.app.FragmentManager;

import dagger.Module;
import dagger.Provides;
import fun.plz.mytoy.base.PerBaseClassifyFragment;
import fun.plz.mytoy.jiandan.JianDanFragment;

/**
 * Created by PLZ on 2017/1/12.
 */
@Module
public class BaseClassifyFragmentModule {
    final BaseClassifyFragment baseClassifyFragment;

    public BaseClassifyFragmentModule(BaseClassifyFragment baseClassifyFragment) {
        this.baseClassifyFragment = baseClassifyFragment;
    }

    @Provides
    @PerBaseClassifyFragment
    FragmentManager provideChildFragmentManager(){
        return baseClassifyFragment.getChildFragmentManager();
    }
}
