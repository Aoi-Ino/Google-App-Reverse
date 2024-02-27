package hm;

import cm.g;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f24179i = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final c f24180j = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f24180j;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public Integer B() {
        return Integer.valueOf(l());
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(l() == cVar.l() && n() == cVar.n())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + n();
    }

    public boolean isEmpty() {
        return l() > n();
    }

    public String toString() {
        return l() + ".." + n();
    }

    public boolean v(int i10) {
        return l() <= i10 && i10 <= n();
    }

    public Integer y() {
        return Integer.valueOf(n());
    }
}
