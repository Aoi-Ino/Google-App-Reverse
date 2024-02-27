package i1;

import android.view.View;

abstract class i0 extends g0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f12156f = true;

    i0() {
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f12156f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f12156f = false;
            }
        }
    }
}
