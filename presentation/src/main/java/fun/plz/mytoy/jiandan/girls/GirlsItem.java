package fun.plz.mytoy.jiandan.girls;

import com.mikepenz.fastadapter.items.AbstractItem;

/**
 * Created by PLZ on 2017/1/14.
 */

public class GirlsItem extends AbstractItem {
    public String mImageUrl;
    public String mName;
    public String mDescription;
    public boolean mStarred = false;

    public GirlsItem withImage(String imageUrl) {
        this.mImageUrl = imageUrl;
        return this;
    }

    public GirlsItem withName(String name) {
        this.mName = name;
        return this;
    }

    public GirlsItem withDescription(String description) {
        this.mDescription = description;
        return this;
    }

    public GirlsItem withStarred(boolean starred) {
        this.mStarred = starred;
        return this;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getLayoutRes() {
        return 0;
    }
}
