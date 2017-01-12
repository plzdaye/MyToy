package fun.plz.mytoy.base.baseFragment;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import fun.plz.mytoy.base.HasComponent;
import fun.plz.mytoy.base.baseActivity.BaseActivity;

/**
 * Created by PLZ on 2017/1/12.
 */

public class BaseNetRequestFragment extends Fragment {
    protected void showToastMessage(String message) {
        if(getActivity() instanceof BaseActivity){
            ((BaseActivity) getActivity()).showToastMessage(message);
        }else{
            Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Gets a component for dependency injection by its type.
     */
    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
