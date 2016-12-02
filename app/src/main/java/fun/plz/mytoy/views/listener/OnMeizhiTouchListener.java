package fun.plz.mytoy.views.listener;

import android.view.View;

import fun.plz.mytoy.model.entity.Meizhi;

/**
 * Created by PLZ on 2016/12/2.
 */

public interface OnMeizhiTouchListener {
    void onTouch(View v, View meizhiView, View card, Meizhi meizhi);
}
