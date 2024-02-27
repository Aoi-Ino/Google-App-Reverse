package r3;

import q3.a;
import s3.n;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f15548a;

    /* renamed from: b  reason: collision with root package name */
    private final a f15549b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f15550c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15551d;

    private b(a aVar, a.d dVar, String str) {
        this.f15549b = aVar;
        this.f15550c = dVar;
        this.f15551d = str;
        this.f15548a = n.b(aVar, dVar, str);
    }

    public static b a(a aVar, a.d dVar, String str) {
        return new b(aVar, dVar, str);
    }

    public final String b() {
        return this.f15549b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f15549b, bVar.f15549b) && n.a(this.f15550c, bVar.f15550c) && n.a(this.f15551d, bVar.f15551d);
    }

    public final int hashCode() {
        return this.f15548a;
    }
}
