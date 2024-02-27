package lm;

import bm.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25028a;

    /* renamed from: b  reason: collision with root package name */
    public final l f25029b;

    public v(Object obj, l lVar) {
        this.f25028a = obj;
        this.f25029b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return cm.l.a(this.f25028a, vVar.f25028a) && cm.l.a(this.f25029b, vVar.f25029b);
    }

    public int hashCode() {
        Object obj = this.f25028a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f25029b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f25028a + ", onCancellation=" + this.f25029b + ')';
    }
}
