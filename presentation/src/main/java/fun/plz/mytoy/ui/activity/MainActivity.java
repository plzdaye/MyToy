package fun.plz.mytoy.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;

import fun.plz.mytoy.base.BaseActivity;
import fun.plz.mytoy.model.MeizhiData;
import rx.Observable;
import rx.Subscription;

/**
 * Created by PLZ on 2016/11/18.
 */

public class MainActivity extends BaseActivity {
    private int mPage = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadDate();
    }

    private void loadDate() {
//        Subscription s = Observable
//                .zip(sGankIO.getMeizhiData(mPage),
//                        sGankIO.get休息视频Data(mPage),
//                        this::createMeizhiDataWith休息视频Desc)
//                .map(meizhiData -> meizhiData.results)
//                .flatMap(Observable::from)
//                .toSortedList((meizhi1, meizhi2) ->
//                        meizhi2.publishedAt.compareTo(meizhi1.publishedAt))
//                .doOnNext(this::saveMeizhis)
//                .observeOn(AndroidSchedulers.mainThread())
//                .finallyDo(() -> setRefresh(false))
//                .subscribe(meizhis -> {
//                    if (clean) mMeizhiList.clear();
//                    mMeizhiList.addAll(meizhis);
//                    mMeizhiListAdapter.notifyDataSetChanged();
//                    setRefresh(false);
//                }, throwable -> loadError(throwable));
        // @formatter:on
        Observable result = sGankIO.getMeizhiData(mPage);
        result.cache();
    }


}
