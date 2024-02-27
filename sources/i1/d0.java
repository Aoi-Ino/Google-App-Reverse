package i1;

import android.view.View;

abstract class d0 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12135c = true;

    d0() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f12135c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f12135c = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public void e(View view, float f10) {
        if (f12135c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f12135c = false;
            }
        }
        view.setAlpha(f10);
    }
}
