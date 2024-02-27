package pl;

import cm.g;
import cm.l;
import hm.c;

public final class f implements Comparable {

    /* renamed from: i  reason: collision with root package name */
    public static final a f30411i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    public static final f f30412j = g.a();

    /* renamed from: e  reason: collision with root package name */
    private final int f30413e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30414f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30415g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30416h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public f(int i10, int i11, int i12) {
        this.f30413e = i10;
        this.f30414f = i11;
        this.f30415g = i12;
        this.f30416h = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (new c(0, 255).v(i10) && new c(0, 255).v(i11) && new c(0, 255).v(i12)) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(f fVar) {
        l.f(fVar, "other");
        return this.f30416h - fVar.f30416h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        if (fVar == null) {
            return false;
        }
        return this.f30416h == fVar.f30416h;
    }

    public int hashCode() {
        return this.f30416h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30413e);
        sb2.append('.');
        sb2.append(this.f30414f);
        sb2.append('.');
        sb2.append(this.f30415g);
        return sb2.toString();
    }
}
