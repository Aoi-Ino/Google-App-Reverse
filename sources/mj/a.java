package mj;

import cm.g;
import cm.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f25101a;

    public a(String str) {
        this.f25101a = str;
    }

    public final void a(String str) {
        this.f25101a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.a(this.f25101a, ((a) obj).f25101a);
    }

    public int hashCode() {
        String str = this.f25101a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SelectedDLList(jsonMember523=" + this.f25101a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
