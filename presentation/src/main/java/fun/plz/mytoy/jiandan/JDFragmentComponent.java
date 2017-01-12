package fun.plz.mytoy.jiandan;

import android.support.v4.app.FragmentManager;

import dagger.Component;
import fun.plz.mytoy.base.PerBaseClassifyFragment;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragmentAdapter;

/**
 * Created by PLZ on 2017/1/12.
 */
@PerBaseClassifyFragment
@Component(modules = JDFragmentModule.class)
public interface JDFragmentComponent {

}
