package hm;

import cm.g;
import ql.e0;
import wl.c;

public class a implements Iterable, dm.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0301a f24171h = new C0301a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final int f24172e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24173f;

    /* renamed from: g  reason: collision with root package name */
    private final int f24174g;

    /* renamed from: hm.a$a  reason: collision with other inner class name */
    public static final class C0301a {
        private C0301a() {
        }

        public /* synthetic */ C0301a(g gVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f24172e = i10;
            this.f24173f = c.b(i10, i11, i12);
            this.f24174g = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f24172e == aVar.f24172e && this.f24173f == aVar.f24173f && this.f24174g == aVar.f24174g)) {
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
        return (((this.f24172e * 31) + this.f24173f) * 31) + this.f24174g;
    }

    public boolean isEmpty() {
        if (this.f24174g > 0) {
            if (this.f24172e <= this.f24173f) {
                return false;
            }
        } else if (this.f24172e >= this.f24173f) {
            return false;
        }
        return true;
    }

    public final int l() {
        return this.f24172e;
    }

    public final int n() {
        return this.f24173f;
    }

    public final int o() {
        return this.f24174g;
    }

    /* renamed from: r */
    public e0 iterator() {
        return new b(this.f24172e, this.f24173f, this.f24174g);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f24174g > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f24172e);
            sb2.append("..");
            sb2.append(this.f24173f);
            sb2.append(" step ");
            i10 = this.f24174g;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f24172e);
            sb2.append(" downTo ");
            sb2.append(this.f24173f);
            sb2.append(" step ");
            i10 = -this.f24174g;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
