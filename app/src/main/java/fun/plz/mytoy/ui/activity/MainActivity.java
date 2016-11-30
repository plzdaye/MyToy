package fun.plz.mytoy.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;


import fun.plz.mytoy.base.BaseActivity;
import fun.plz.mytoy.model.MeizhiData;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by PLZ on 2016/11/18.
 */

public class MainActivity extends BaseActivity {
    private int mPage = -1;

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
        result.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MeizhiData>() {
                    @Override
                    public final void onCompleted() {
                        // do nothing
                    }

                    @Override
                    public final void onError(Throwable e) {
                        Log.e("GithubDemo", e.getMessage());
                    }

                    @Override
                    public void onNext(MeizhiData meizhiData) {
                        Log.e("---%s", meizhiData.results.get(0).toString());
                    }

                });
//        result.cache();

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Call<MeizhiData> call = sGankIO.getMeizhiData(1);
//                try{
//                    MeizhiData meizhiData = call.execute().body();
//                    meizhiData.results.get(0);
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        });
//        thread.start();



    }


}
