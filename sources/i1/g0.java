package i1;

import android.graphics.Matrix;
import android.view.View;

abstract class g0 extends d0 {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f12154d = true;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f12155e = true;

    g0() {
    }

    public void g(View view, Matrix matrix) {
        if (f12154d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f12154d = false;
            }
        }
    }

    public void h(View view, Matrix matrix) {
        if (f12155e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f12155e = false;
            }
        }
    }
}
