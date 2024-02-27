package y4;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {

    /* renamed from: e  reason: collision with root package name */
    private final Dialog f18491e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18492f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18493g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18494h;

    public a(Dialog dialog, Rect rect) {
        this.f18491e = dialog;
        this.f18492f = rect.left;
        this.f18493g = rect.top;
        this.f18494h = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f18492f + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f18493g + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f18494h;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f18491e.onTouchEvent(obtain);
    }
}
