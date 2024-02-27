package r1;

import cm.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f15460a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15461b;

    public m(String str, int i10) {
        l.f(str, "workSpecId");
        this.f15460a = str;
        this.f15461b = i10;
    }

    public final int a() {
        return this.f15461b;
    }

    public final String b() {
        return this.f15460a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f15460a, mVar.f15460a) && this.f15461b == mVar.f15461b;
    }

    public int hashCode() {
        return (this.f15460a.hashCode() * 31) + Integer.hashCode(this.f15461b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f15460a + ", generation=" + this.f15461b + ')';
    }
}
