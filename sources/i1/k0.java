package i1;

import android.os.Build;
import android.view.View;

class k0 extends i0 {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f12158g = true;

    k0() {
    }

    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f12158g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f12158g = false;
            }
        }
    }
}
