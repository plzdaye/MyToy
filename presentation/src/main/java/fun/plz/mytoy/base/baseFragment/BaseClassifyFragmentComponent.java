package fun.plz.mytoy.base.baseFragment;

import android.support.v4.app.FragmentManager;

import dagger.Component;
import fun.plz.mytoy.base.PerBaseClassifyFragment;
import fun.plz.mytoy.jiandan.JianDanFragment;

/**
 * Created by PLZ on 2017/1/12.
 */
@PerBaseClassifyFragment
@Component(modules = BaseClassifyFragmentModule.class)
public interface BaseClassifyFragmentComponent {
    void inject(JianDanFragment fragment);
//    void inject(JianDanFragment fragment);
//    void inject(JianDanFragment fragment);
//    void inject(JianDanFragment fragment);
    FragmentManager childFragmentManager();
    BaseClassifyFragmentAdapter adapter();
}
