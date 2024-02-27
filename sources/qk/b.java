package qk;

import android.graphics.PointF;
import java.io.Serializable;

public class b implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final float f30646e;

    /* renamed from: f  reason: collision with root package name */
    private final float f30647f;

    /* renamed from: g  reason: collision with root package name */
    private final float f30648g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30649h;

    public b(float f10, PointF pointF, int i10) {
        this.f30646e = f10;
        this.f30647f = pointF.x;
        this.f30648g = pointF.y;
        this.f30649h = i10;
    }

    public PointF a() {
        return new PointF(this.f30647f, this.f30648g);
    }

    public int b() {
        return this.f30649h;
    }

    public float c() {
        return this.f30646e;
    }
}
