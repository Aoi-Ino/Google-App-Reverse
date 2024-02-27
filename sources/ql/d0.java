package ql;

import cm.l;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f30763a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f30764b;

    public d0(int i10, Object obj) {
        this.f30763a = i10;
        this.f30764b = obj;
    }

    public final int a() {
        return this.f30763a;
    }

    public final Object b() {
        return this.f30764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f30763a == d0Var.f30763a && l.a(this.f30764b, d0Var.f30764b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f30763a) * 31;
        Object obj = this.f30764b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f30763a + ", value=" + this.f30764b + ')';
    }
}
