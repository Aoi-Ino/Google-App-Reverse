package a2;

import cm.g;
import cm.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f78a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f79b;

    /* renamed from: c  reason: collision with root package name */
    private final String f80c;

    /* renamed from: d  reason: collision with root package name */
    private final long f81d;

    /* renamed from: e  reason: collision with root package name */
    private final String f82e;

    public f(int i10, boolean z10, String str, long j10, String str2) {
        this.f78a = i10;
        this.f79b = z10;
        this.f80c = str;
        this.f81d = j10;
        this.f82e = str2;
    }

    public final String a() {
        return this.f80c;
    }

    public final String b() {
        return this.f82e;
    }

    public final long c() {
        return this.f81d;
    }

    public final boolean d() {
        return this.f79b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f78a == fVar.f78a && this.f79b == fVar.f79b && l.a(this.f80c, fVar.f80c) && this.f81d == fVar.f81d && l.a(this.f82e, fVar.f82e);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f78a) * 31;
        boolean z10 = this.f79b;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        String str = this.f80c;
        int i11 = 0;
        int hashCode2 = (((i10 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f81d)) * 31;
        String str2 = this.f82e;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "Result(index=" + this.f78a + ", success=" + this.f79b + ", failureMessage=" + this.f80c + ", size=" + this.f81d + ", path=" + this.f82e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, boolean z10, String str, long j10, String str2, int i11, g gVar) {
        this(i10, z10, str, (i11 & 8) != 0 ? 0 : j10, (i11 & 16) != 0 ? null : str2);
    }
}
