package p2;

import android.graphics.Bitmap;
import android.graphics.RectF;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f14615a;

    /* renamed from: b  reason: collision with root package name */
    private int f14616b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f14617c;

    /* renamed from: d  reason: collision with root package name */
    private float f14618d;

    /* renamed from: e  reason: collision with root package name */
    private float f14619e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f14620f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14621g;

    /* renamed from: h  reason: collision with root package name */
    private int f14622h;

    public a(int i10, int i11, Bitmap bitmap, float f10, float f11, RectF rectF, boolean z10, int i12) {
        this.f14615a = i10;
        this.f14616b = i11;
        this.f14617c = bitmap;
        this.f14620f = rectF;
        this.f14621g = z10;
        this.f14622h = i12;
    }

    public int a() {
        return this.f14622h;
    }

    public float b() {
        return this.f14619e;
    }

    public int c() {
        return this.f14616b;
    }

    public RectF d() {
        return this.f14620f;
    }

    public Bitmap e() {
        return this.f14617c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.c() == this.f14616b && aVar.f() == this.f14615a && aVar.g() == this.f14618d && aVar.b() == this.f14619e && aVar.d().left == this.f14620f.left && aVar.d().right == this.f14620f.right && aVar.d().top == this.f14620f.top && aVar.d().bottom == this.f14620f.bottom;
    }

    public int f() {
        return this.f14615a;
    }

    public float g() {
        return this.f14618d;
    }

    public boolean h() {
        return this.f14621g;
    }

    public void i(int i10) {
        this.f14622h = i10;
    }
}
