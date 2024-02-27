package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final f f2372e = new f(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2373a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2374b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2375c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2376d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private f(int i10, int i11, int i12, int i13) {
        this.f2373a = i10;
        this.f2374b = i11;
        this.f2375c = i12;
        this.f2376d = i13;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f2373a, fVar2.f2373a), Math.max(fVar.f2374b, fVar2.f2374b), Math.max(fVar.f2375c, fVar2.f2375c), Math.max(fVar.f2376d, fVar2.f2376d));
    }

    public static f b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f2372e : new f(i10, i11, i12, i13);
    }

    public static f c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2373a, this.f2374b, this.f2375c, this.f2376d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2376d == fVar.f2376d && this.f2373a == fVar.f2373a && this.f2375c == fVar.f2375c && this.f2374b == fVar.f2374b;
    }

    public int hashCode() {
        return (((((this.f2373a * 31) + this.f2374b) * 31) + this.f2375c) * 31) + this.f2376d;
    }

    public String toString() {
        return "Insets{left=" + this.f2373a + ", top=" + this.f2374b + ", right=" + this.f2375c + ", bottom=" + this.f2376d + '}';
    }
}
