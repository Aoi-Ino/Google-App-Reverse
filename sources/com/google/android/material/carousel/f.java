package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f5781a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5782b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5783c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5784d;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f5785a;

        /* renamed from: b  reason: collision with root package name */
        private final float f5786b;

        /* renamed from: c  reason: collision with root package name */
        private final List f5787c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private c f5788d;

        /* renamed from: e  reason: collision with root package name */
        private c f5789e;

        /* renamed from: f  reason: collision with root package name */
        private int f5790f = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f5791g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f5792h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f5793i = -1;

        b(float f10, float f11) {
            this.f5785a = f10;
            this.f5786b = f11;
        }

        private static float i(float f10, float f11, int i10, int i11) {
            return (f10 - (((float) i10) * f11)) + (((float) i11) * f11);
        }

        /* access modifiers changed from: package-private */
        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        /* access modifiers changed from: package-private */
        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        /* access modifiers changed from: package-private */
        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        /* access modifiers changed from: package-private */
        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            float f17 = this.f5786b;
            if (f16 > f17) {
                f13 = Math.abs(f16 - Math.max(f16 - f12, f17));
            } else {
                f13 = 0.0f;
                if (f15 < 0.0f) {
                    f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, f13);
        }

        /* access modifiers changed from: package-private */
        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (!z10) {
                    int i10 = this.f5793i;
                    if (i10 == -1 || i10 == 0) {
                        this.f5793i = this.f5787c.size();
                    } else {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13);
            c cVar2 = this.f5788d;
            if (z10) {
                if (cVar2 == null) {
                    this.f5788d = cVar;
                    this.f5790f = this.f5787c.size();
                }
                if (this.f5791g != -1 && this.f5787c.size() - this.f5791g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                } else if (f12 == this.f5788d.f5797d) {
                    this.f5789e = cVar;
                    this.f5791g = this.f5787c.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (cVar2 == null && cVar.f5797d < this.f5792h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else if (this.f5789e != null && cVar.f5797d > this.f5792h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
            this.f5792h = cVar.f5797d;
            this.f5787c.add(cVar);
            return this;
        }

        /* access modifiers changed from: package-private */
        public b f(float f10, float f11, float f12, int i10) {
            return g(f10, f11, f12, i10, false);
        }

        /* access modifiers changed from: package-private */
        public b g(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((((float) i11) * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public f h() {
            if (this.f5788d != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f5787c.size(); i10++) {
                    c cVar = (c) this.f5787c.get(i10);
                    arrayList.add(new c(i(this.f5788d.f5795b, this.f5785a, this.f5790f, i10), cVar.f5795b, cVar.f5796c, cVar.f5797d, cVar.f5798e, cVar.f5799f));
                }
                return new f(this.f5785a, arrayList, this.f5790f, this.f5791g);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        final float f5794a;

        /* renamed from: b  reason: collision with root package name */
        final float f5795b;

        /* renamed from: c  reason: collision with root package name */
        final float f5796c;

        /* renamed from: d  reason: collision with root package name */
        final float f5797d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f5798e;

        /* renamed from: f  reason: collision with root package name */
        final float f5799f;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(r4.a.a(cVar.f5794a, cVar2.f5794a, f10), r4.a.a(cVar.f5795b, cVar2.f5795b, f10), r4.a.a(cVar.f5796c, cVar2.f5796c, f10), r4.a.a(cVar.f5797d, cVar2.f5797d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14) {
            this.f5794a = f10;
            this.f5795b = f11;
            this.f5796c = f12;
            this.f5797d = f13;
            this.f5798e = z10;
            this.f5799f = f14;
        }
    }

    private f(float f10, List list, int i10, int i11) {
        this.f5781a = f10;
        this.f5782b = Collections.unmodifiableList(list);
        this.f5783c = i10;
        this.f5784d = i11;
    }

    static f l(f fVar, f fVar2, float f10) {
        if (fVar.f() == fVar2.f()) {
            List g10 = fVar.g();
            List g11 = fVar2.g();
            if (g10.size() == g11.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < fVar.g().size(); i10++) {
                    arrayList.add(c.a((c) g10.get(i10), (c) g11.get(i10), f10));
                }
                return new f(fVar.f(), arrayList, r4.a.c(fVar.b(), fVar2.b(), f10), r4.a.c(fVar.i(), fVar2.i(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static f m(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f5795b) - (fVar.j().f5797d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d(f11 + (cVar.f5797d / 2.0f), cVar.f5796c, cVar.f5797d, size >= fVar.b() && size <= fVar.i(), cVar.f5798e);
            f11 += cVar.f5797d;
            size--;
        }
        return bVar.h();
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return (c) this.f5782b.get(this.f5783c);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f5783c;
    }

    /* access modifiers changed from: package-private */
    public c c() {
        return (c) this.f5782b.get(0);
    }

    /* access modifiers changed from: package-private */
    public c d() {
        for (int i10 = 0; i10 < this.f5782b.size(); i10++) {
            c cVar = (c) this.f5782b.get(i10);
            if (!cVar.f5798e) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List e() {
        return this.f5782b.subList(this.f5783c, this.f5784d + 1);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f5781a;
    }

    /* access modifiers changed from: package-private */
    public List g() {
        return this.f5782b;
    }

    /* access modifiers changed from: package-private */
    public c h() {
        return (c) this.f5782b.get(this.f5784d);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f5784d;
    }

    /* access modifiers changed from: package-private */
    public c j() {
        List list = this.f5782b;
        return (c) list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public c k() {
        for (int size = this.f5782b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f5782b.get(size);
            if (!cVar.f5798e) {
                return cVar;
            }
        }
        return null;
    }
}
