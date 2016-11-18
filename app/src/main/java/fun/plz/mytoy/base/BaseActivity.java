package fun.plz.mytoy.base;

import android.support.v7.app.AppCompatActivity;

import fun.plz.mytoy.network.GankApi;
import fun.plz.mytoy.network.PLZFactory;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by PLZ on 2016/11/18.
 */

public class BaseActivity extends AppCompatActivity {
    private CompositeSubscription mCompositeSubscription;
    public static final GankApi sGankIO = PLZFactory.getGankIOSingleton();
    public CompositeSubscription getCompositeSubscription() {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }

        return this.mCompositeSubscription;
    }


    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }

        this.mCompositeSubscription.add(s);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
    }

}
