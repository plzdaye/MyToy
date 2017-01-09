package fun.plz.mytoy.executor;

import io.reactivex.Scheduler;

/**
 * Created by PLZ on 2017/1/6.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}
