package fun.plz.mytoy.network;

/**
 * Created by PLZ on 2016/11/18.
 */

public class PLZFactory {
    protected static final Object monitor = new Object();
    private static GankApi sGankIOSingleton = null;
    public static final int newsSize = 10;

    public static GankApi getGankIOSingleton(){
        synchronized (monitor){
            if(null == sGankIOSingleton){
                sGankIOSingleton = new PLZRetrofit().getGankService();
            }
            return sGankIOSingleton;
        }
    }
}
