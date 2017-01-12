package fun.plz.mytoy.jiandan;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import fun.plz.mytoy.R;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragment;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragmentAdapter;
import fun.plz.mytoy.base.baseFragment.BaseClassifyFragmentComponent;


/**
 * Created by PLZ on 2017/1/12.
 */

public class JianDanFragment extends BaseClassifyFragment {

    @BindView(R.id.viewpager) ViewPager viewPager;
    @Inject
    BaseClassifyFragmentAdapter adapter;

    public JianDanFragment() {
        setRetainInstance(true);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter.getCount();
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
//            setupViewPager(viewPager);
            viewPager.setOffscreenPageLimit(2);
        }
        return super.onCreateView(inflater, container, savedInstanceState);

    }

//    private void setupViewPager(ViewPager viewPager) {
//        Adapter adapter = new Adapter(getChildFragmentManager());
//        recommendFragment = new RecommendFragment();
//        recommendFragment.setChanger(this);
//        adapter.addFragment(recommendFragment, "新曲");
//        adapter.addFragment(new AllPlaylistFragment(), "歌单");
//        //  adapter.addFragment(new NetFragment(), "主播电台");
//        adapter.addFragment(new RankingFragment(), "排行榜");
//
//        viewPager.setAdapter(adapter);
//    }
}
