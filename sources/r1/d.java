package r1;

import cm.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f15445a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f15446b;

    public d(String str, Long l10) {
        l.f(str, "key");
        this.f15445a = str;
        this.f15446b = l10;
    }

    public final String a() {
        return this.f15445a;
    }

    public final Long b() {
        return this.f15446b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f15445a, dVar.f15445a) && l.a(this.f15446b, dVar.f15446b);
    }

    public int hashCode() {
        int hashCode = this.f15445a.hashCode() * 31;
        Long l10 = this.f15446b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f15445a + ", value=" + this.f15446b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, Long.valueOf(z10 ? 1 : 0));
        l.f(str, "key");
    }
}
