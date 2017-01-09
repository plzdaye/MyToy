package fun.plz.mytoy;

import javax.inject.Inject;

import fun.plz.mytoy.executor.PostExecutionThread;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by PLZ on 2017/1/6.
 */

public class UIThread implements PostExecutionThread {
    @Inject
    public UIThread() {
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
