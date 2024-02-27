package vl;

import cm.l;
import java.io.Serializable;

final class c extends ql.c implements a, Serializable {

    /* renamed from: f  reason: collision with root package name */
    private final Enum[] f32396f;

    public c(Enum[] enumArr) {
        l.f(enumArr, "entries");
        this.f32396f = enumArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return n((Enum) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return r((Enum) obj);
    }

    public int l() {
        return this.f32396f.length;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return s((Enum) obj);
    }

    public boolean n(Enum enumR) {
        l.f(enumR, "element");
        return ((Enum) m.y(this.f32396f, enumR.ordinal())) == enumR;
    }

    /* renamed from: o */
    public Enum get(int i10) {
        ql.c.f30755e.a(i10, this.f32396f.length);
        return this.f32396f[i10];
    }

    public int r(Enum enumR) {
        l.f(enumR, "element");
        int ordinal = enumR.ordinal();
        if (((Enum) m.y(this.f32396f, ordinal)) == enumR) {
            return ordinal;
        }
        return -1;
    }

    public int s(Enum enumR) {
        l.f(enumR, "element");
        return indexOf(enumR);
    }
}
