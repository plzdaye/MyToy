package fun.plz.mytoy.base.baseFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import fun.plz.mytoy.base.HasComponent;

/**
 * Created by PLZ on 2017/1/12.
 */

public abstract class BaseClassifyFragment extends Fragment {
    BaseClassifyFragmentComponent baseClassifyFragmentComponent;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseClassifyFragmentComponent = DaggerBaseClassifyFragmentComponent.builder()
                .baseClassifyFragmentModule(new BaseClassifyFragmentModule(this))
                .build();
        inject(baseClassifyFragmentComponent);
    }

    /**
     * Gets a component for dependency injection by its type.
     */
    @SuppressWarnings("unchecked")
    protected BaseClassifyFragmentComponent getComponent(BaseClassifyFragmentComponent componentType) {
        return baseClassifyFragmentComponent;
    }
    protected abstract void inject(BaseClassifyFragmentComponent component);
}
