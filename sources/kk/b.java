package kk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PopupWindow f24707e;

    public /* synthetic */ b(PopupWindow popupWindow) {
        this.f24707e = popupWindow;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return c.e(this.f24707e, view, motionEvent);
    }
}
