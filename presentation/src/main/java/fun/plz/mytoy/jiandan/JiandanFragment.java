package fun.plz.mytoy.jiandan;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import fun.plz.mytoy.R;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragment;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragmentAdapter;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragmentComponent;
import fun.plz.mytoy.jiandan.boringPicture.BoringPictureFragment;
import fun.plz.mytoy.jiandan.freshNews.FreshNewsFragment;
import fun.plz.mytoy.jiandan.girls.GirlsFragment;
import fun.plz.mytoy.jiandan.joke.JokeFragment;


/**
 * Created by PLZ on 2017/1/12.
 */

public class JianDanFragment extends BaseClassifyFragment implements BaseJiandanView{

    @BindView(R.id.viewpager) ViewPager viewPager;
    @BindView(R.id.tabs) TabLayout tabLayout;
    @BindView(R.id.toolbar) Toolbar toolbar;
    @Inject
    BaseClassifyFragmentAdapter adapter;
    FreshNewsFragment freshNewsFragment;
    BoringPictureFragment boringPictureFragment;

    public JianDanFragment() {
        setRetainInstance(true);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void inject(BaseClassifyFragmentComponent component) {
        component.inject(this);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_jiandan,container,false);
        ButterKnife.bind(this,rootView);

        if (viewPager != null) {
            setupViewPager(viewPager);
            viewPager.setOffscreenPageLimit(2);
        }
        tabLayout.setTabTextColors(Color.BLACK, Color.RED);
        tabLayout.setSelectedTabIndicatorColor( Color.RED);
        tabLayout.setupWithViewPager(viewPager);
        return rootView;
    }

    private void setupViewPager(ViewPager viewPager) {
        freshNewsFragment = new FreshNewsFragment();
        boringPictureFragment = new BoringPictureFragment();
//        freshNewsFragment.setChanger(this);
        adapter.addFragment(freshNewsFragment, "新鲜事");
        adapter.addFragment(boringPictureFragment, "无聊图");
          adapter.addFragment(new GirlsFragment(), "妹子图");
        adapter.addFragment(new JokeFragment(), "段子");

        viewPager.setAdapter(adapter);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public Context context() {
        return null;
    }
}
