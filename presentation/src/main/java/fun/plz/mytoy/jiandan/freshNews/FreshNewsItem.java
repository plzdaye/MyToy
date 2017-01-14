package fun.plz.mytoy.jiandan.freshNews;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

import fun.plz.mytoy.R;

/**
 * Created by PLZ on 2017/1/13.
 */

public class FreshNewsItem extends AbstractItem<FreshNewsItem, FreshNewsItem.ViewHolder> {
    public String name;
    public String description;

    public FreshNewsItem withName(String name) {
        this.name = name;
        return this;
    }

    public FreshNewsItem withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fresh_news_item;
    }

    @Override
    public void bindView(ViewHolder holder, List<Object> payloads) {
        super.bindView(holder, payloads);
        holder.name.setText(name);
        holder.description.setText(description);
    }

    @Override
    public void unbindView(ViewHolder holder) {
        super.unbindView(holder);
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        protected TextView name;
        protected TextView description;
        public ViewHolder(View itemView) {
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.textView2);
            this.description = (TextView) itemView.findViewById(R.id.textView6);
        }
    }
}
