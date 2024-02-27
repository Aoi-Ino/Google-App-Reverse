package j8;

import cm.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f12756a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12757b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12758c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12759d;

    public f(int i10, int i11, int i12, String str) {
        this.f12756a = i10;
        this.f12757b = i11;
        this.f12758c = i12;
        this.f12759d = str;
    }

    public final int a() {
        return this.f12756a;
    }

    public final int b() {
        return this.f12757b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12756a == fVar.f12756a && this.f12757b == fVar.f12757b && this.f12758c == fVar.f12758c && l.a(this.f12759d, fVar.f12759d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f12756a) * 31) + Integer.hashCode(this.f12757b)) * 31) + Integer.hashCode(this.f12758c)) * 31;
        String str = this.f12759d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ViewConfig(dayViewRes=" + this.f12756a + ", monthHeaderRes=" + this.f12757b + ", monthFooterRes=" + this.f12758c + ", monthViewClass=" + this.f12759d + ")";
    }
}
