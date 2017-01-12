package fun.plz.mytoy.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;



import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fun.plz.mytoy.R;
import fun.plz.mytoy.base.baseActivity.BaseActivity;
import fun.plz.mytoy.model.MeizhiData;
import fun.plz.mytoy.model.entity.Meizhi;
import fun.plz.mytoy.views.adapter.MeizhiListAdapter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by PLZ on 2016/11/18.
 */

public class MainActivity extends BaseActivity {
    @BindView(R.id.rv_meizhi) RecyclerView mRecyclerView;
    private MeizhiListAdapter mMeizhiListAdapter;
    private List<Meizhi> mMeizhiList;
    private int mPage = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMeizhiList = new ArrayList<>();
        loadDate();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        final StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mMeizhiListAdapter = new MeizhiListAdapter(this, mMeizhiList);
        mRecyclerView.setAdapter(mMeizhiListAdapter);
    }

    private void loadDate() {
        Observable<MeizhiData> result = sGankIO.getMeizhiData(mPage);
        result.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MeizhiData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MeizhiData value) {
                        mMeizhiList.addAll(value.results);
                        mMeizhiListAdapter.notifyDataSetChanged();
                        Log.e("---%s", value.results.get(0).toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("GithubDemo", e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }




}
