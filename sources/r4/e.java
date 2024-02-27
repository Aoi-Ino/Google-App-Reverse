package r4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public abstract class e implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f15589a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f15590b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f15591c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f15589a);
        matrix2.getValues(this.f15590b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f15590b;
            float f11 = fArr[i10];
            float f12 = this.f15589a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f15591c.setValues(this.f15590b);
        return this.f15591c;
    }
}
