package i1;

import android.graphics.Matrix;
import android.view.View;

class l0 extends k0 {
    l0() {
    }

    public float b(View view) {
        return view.getTransitionAlpha();
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
