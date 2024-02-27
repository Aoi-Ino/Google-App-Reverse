package cn;

import cm.g;
import cm.l;
import in.h;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final h f20255d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f20256e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f20257f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f20258g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f20259h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f20260i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f20261j = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f20262a;

    /* renamed from: b  reason: collision with root package name */
    public final h f20263b;

    /* renamed from: c  reason: collision with root package name */
    public final h f20264c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        h.a aVar = h.f24468i;
        f20255d = aVar.c(":");
        f20256e = aVar.c(":status");
        f20257f = aVar.c(":method");
        f20258g = aVar.c(":path");
        f20259h = aVar.c(":scheme");
        f20260i = aVar.c(":authority");
    }

    public c(h hVar, h hVar2) {
        l.f(hVar, "name");
        l.f(hVar2, "value");
        this.f20263b = hVar;
        this.f20264c = hVar2;
        this.f20262a = hVar.q() + 32 + hVar2.q();
    }

    public final h a() {
        return this.f20263b;
    }

    public final h b() {
        return this.f20264c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f20263b, cVar.f20263b) && l.a(this.f20264c, cVar.f20264c);
    }

    public int hashCode() {
        h hVar = this.f20263b;
        int i10 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        h hVar2 = this.f20264c;
        if (hVar2 != null) {
            i10 = hVar2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f20263b.t() + ": " + this.f20264c.t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(h hVar, String str) {
        this(hVar, h.f24468i.c(str));
        l.f(hVar, "name");
        l.f(str, "value");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            cm.l.f(r2, r0)
            java.lang.String r0 = "value"
            cm.l.f(r3, r0)
            in.h$a r0 = in.h.f24468i
            in.h r2 = r0.c(r2)
            in.h r3 = r0.c(r3)
            r1.<init>((in.h) r2, (in.h) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.c.<init>(java.lang.String, java.lang.String):void");
    }
}
