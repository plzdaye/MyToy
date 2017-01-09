package fun.plz.mytoy.data.executor;

import android.support.annotation.NonNull;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

import fun.plz.mytoy.executor.ThreadExecutor;

/**
 * Created by PLZ on 2017/1/6.
 */
@Singleton
public class JobExecutor implements ThreadExecutor{
    private final ThreadPoolExecutor threadPoolExecutor;

    @Inject
    public JobExecutor() {
        this.threadPoolExecutor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(), new JobThreadFactory());
    }

    @Override
    public void execute(@NonNull Runnable command) {
        this.threadPoolExecutor.execute(command);
    }

    public static class JobThreadFactory implements ThreadFactory{
        private int count = 0;
        @Override
        public Thread newThread(@NonNull Runnable r) {
            return new Thread(r,"android_"+count);
        }
    }
}
