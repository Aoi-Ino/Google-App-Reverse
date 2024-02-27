package lm;

import bm.l;
import cm.g;

final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25015a;

    /* renamed from: b  reason: collision with root package name */
    public final h f25016b;

    /* renamed from: c  reason: collision with root package name */
    public final l f25017c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f25018d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f25019e;

    public t(Object obj, h hVar, l lVar, Object obj2, Throwable th2) {
        this.f25015a = obj;
        this.f25016b = hVar;
        this.f25017c = lVar;
        this.f25018d = obj2;
        this.f25019e = th2;
    }

    public static /* synthetic */ t b(t tVar, Object obj, h hVar, l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = tVar.f25015a;
        }
        if ((i10 & 2) != 0) {
            hVar = tVar.f25016b;
        }
        h hVar2 = hVar;
        if ((i10 & 4) != 0) {
            lVar = tVar.f25017c;
        }
        l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = tVar.f25018d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = tVar.f25019e;
        }
        return tVar.a(obj, hVar2, lVar2, obj4, th2);
    }

    public final t a(Object obj, h hVar, l lVar, Object obj2, Throwable th2) {
        return new t(obj, hVar, lVar, obj2, th2);
    }

    public final boolean c() {
        return this.f25019e != null;
    }

    public final void d(k kVar, Throwable th2) {
        h hVar = this.f25016b;
        if (hVar != null) {
            kVar.j(hVar, th2);
        }
        l lVar = this.f25017c;
        if (lVar != null) {
            kVar.k(lVar, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return cm.l.a(this.f25015a, tVar.f25015a) && cm.l.a(this.f25016b, tVar.f25016b) && cm.l.a(this.f25017c, tVar.f25017c) && cm.l.a(this.f25018d, tVar.f25018d) && cm.l.a(this.f25019e, tVar.f25019e);
    }

    public int hashCode() {
        Object obj = this.f25015a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f25016b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        l lVar = this.f25017c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f25018d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f25019e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f25015a + ", cancelHandler=" + this.f25016b + ", onCancellation=" + this.f25017c + ", idempotentResume=" + this.f25018d + ", cancelCause=" + this.f25019e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, h hVar, l lVar, Object obj2, Throwable th2, int i10, g gVar) {
        this(obj, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
