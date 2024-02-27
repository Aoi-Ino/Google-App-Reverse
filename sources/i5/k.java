package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final c f12406m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    d f12407a;

    /* renamed from: b  reason: collision with root package name */
    d f12408b;

    /* renamed from: c  reason: collision with root package name */
    d f12409c;

    /* renamed from: d  reason: collision with root package name */
    d f12410d;

    /* renamed from: e  reason: collision with root package name */
    c f12411e;

    /* renamed from: f  reason: collision with root package name */
    c f12412f;

    /* renamed from: g  reason: collision with root package name */
    c f12413g;

    /* renamed from: h  reason: collision with root package name */
    c f12414h;

    /* renamed from: i  reason: collision with root package name */
    f f12415i;

    /* renamed from: j  reason: collision with root package name */
    f f12416j;

    /* renamed from: k  reason: collision with root package name */
    f f12417k;

    /* renamed from: l  reason: collision with root package name */
    f f12418l;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f12419a = h.b();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public d f12420b = h.b();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public d f12421c = h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public d f12422d = h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f12423e = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f12424f = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f12425g = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f12426h = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public f f12427i = h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public f f12428j = h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public f f12429k = h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public f f12430l = h.c();

        public b() {
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f12405a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f12356a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f12423e = new a(f10);
            return this;
        }

        public b B(c cVar) {
            this.f12423e = cVar;
            return this;
        }

        public b C(int i10, c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f12420b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f12424f = new a(f10);
            return this;
        }

        public b F(c cVar) {
            this.f12424f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f12422d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f12426h = new a(f10);
            return this;
        }

        public b t(c cVar) {
            this.f12426h = cVar;
            return this;
        }

        public b u(int i10, c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f12421c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f12425g = new a(f10);
            return this;
        }

        public b x(c cVar) {
            this.f12425g = cVar;
            return this;
        }

        public b y(int i10, c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f12419a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }

        public b(k kVar) {
            this.f12419a = kVar.f12407a;
            this.f12420b = kVar.f12408b;
            this.f12421c = kVar.f12409c;
            this.f12422d = kVar.f12410d;
            this.f12423e = kVar.f12411e;
            this.f12424f = kVar.f12412f;
            this.f12425g = kVar.f12413g;
            this.f12426h = kVar.f12414h;
            this.f12427i = kVar.f12415i;
            this.f12428j = kVar.f12416j;
            this.f12429k = kVar.f12417k;
            this.f12430l = kVar.f12418l;
        }
    }

    public interface c {
        c a(c cVar);
    }

    public k() {
        this.f12407a = h.b();
        this.f12408b = h.b();
        this.f12409c = h.b();
        this.f12410d = h.b();
        this.f12411e = new a(0.0f);
        this.f12412f = new a(0.0f);
        this.f12413g = new a(0.0f);
        this.f12414h = new a(0.0f);
        this.f12415i = h.c();
        this.f12416j = h.c();
        this.f12417k = h.c();
        this.f12418l = h.c();
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new a((float) i12));
    }

    private static b d(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(q4.k.C5);
        try {
            int i12 = obtainStyledAttributes.getInt(q4.k.D5, 0);
            int i13 = obtainStyledAttributes.getInt(q4.k.G5, i12);
            int i14 = obtainStyledAttributes.getInt(q4.k.H5, i12);
            int i15 = obtainStyledAttributes.getInt(q4.k.F5, i12);
            int i16 = obtainStyledAttributes.getInt(q4.k.E5, i12);
            c m10 = m(obtainStyledAttributes, q4.k.I5, cVar);
            c m11 = m(obtainStyledAttributes, q4.k.L5, m10);
            c m12 = m(obtainStyledAttributes, q4.k.M5, m10);
            c m13 = m(obtainStyledAttributes, q4.k.K5, m10);
            return new b().y(i13, m11).C(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, q4.k.J5, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new a((float) i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q4.k.Y3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(q4.k.Z3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(q4.k.f14972a4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c m(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f12417k;
    }

    public d i() {
        return this.f12410d;
    }

    public c j() {
        return this.f12414h;
    }

    public d k() {
        return this.f12409c;
    }

    public c l() {
        return this.f12413g;
    }

    public f n() {
        return this.f12418l;
    }

    public f o() {
        return this.f12416j;
    }

    public f p() {
        return this.f12415i;
    }

    public d q() {
        return this.f12407a;
    }

    public c r() {
        return this.f12411e;
    }

    public d s() {
        return this.f12408b;
    }

    public c t() {
        return this.f12412f;
    }

    public boolean u(RectF rectF) {
        Class<f> cls = f.class;
        boolean z10 = this.f12418l.getClass().equals(cls) && this.f12416j.getClass().equals(cls) && this.f12415i.getClass().equals(cls) && this.f12417k.getClass().equals(cls);
        float a10 = this.f12411e.a(rectF);
        return z10 && ((this.f12412f.a(rectF) > a10 ? 1 : (this.f12412f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f12414h.a(rectF) > a10 ? 1 : (this.f12414h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f12413g.a(rectF) > a10 ? 1 : (this.f12413g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f12408b instanceof j) && (this.f12407a instanceof j) && (this.f12409c instanceof j) && (this.f12410d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f12407a = bVar.f12419a;
        this.f12408b = bVar.f12420b;
        this.f12409c = bVar.f12421c;
        this.f12410d = bVar.f12422d;
        this.f12411e = bVar.f12423e;
        this.f12412f = bVar.f12424f;
        this.f12413g = bVar.f12425g;
        this.f12414h = bVar.f12426h;
        this.f12415i = bVar.f12427i;
        this.f12416j = bVar.f12428j;
        this.f12417k = bVar.f12429k;
        this.f12418l = bVar.f12430l;
    }
}
