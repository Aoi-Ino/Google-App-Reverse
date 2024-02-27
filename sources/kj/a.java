package kj;

import cm.g;
import cm.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f24679a;

    public a(String str) {
        this.f24679a = str;
    }

    public final void a(String str) {
        this.f24679a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.a(this.f24679a, ((a) obj).f24679a);
    }

    public int hashCode() {
        String str = this.f24679a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "COASerList(jsonMember515=" + this.f24679a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
