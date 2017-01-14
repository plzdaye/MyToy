package fun.plz.mytoy.jiandan.freshNews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fun.plz.mytoy.R;
import fun.plz.mytoy.base.baseFragment.BaseNetRequestFragment;

/**
 * Created by PLZ on 2017/1/13.
 */

public class FreshNewsFragment extends BaseNetRequestFragment {
    @BindView(R.id.recycle_view) RecyclerView recyclerView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fresh_news,container,false);
        ButterKnife.bind(this,rootView);
        initFragment();
        return rootView;
    }

    private void initFragment() {
        FastItemAdapter<FreshNewsItem> fastItemAdapter = new FastItemAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(fastItemAdapter);
        List<FreshNewsItem> items = new ArrayList<>();
        for(int i = 0; i<24;i++){
            items.add(new FreshNewsItem().withName("name"+i).withDescription("description"+i));
        }
        fastItemAdapter.add(items);
    }
}
