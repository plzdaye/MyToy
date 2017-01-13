package fun.plz.mytoy.jiandan.girls;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fun.plz.mytoy.R;
import fun.plz.mytoy.base.baseFragment.BaseNetRequestFragment;

/**
 * Created by PLZ on 2017/1/13.
 */

public class GirlsFragment extends BaseNetRequestFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_girls_jd, container, false);
        return rootView;
    }
}
