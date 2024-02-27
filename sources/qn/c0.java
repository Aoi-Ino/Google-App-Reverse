package qn;

import ap.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c0 extends z implements Iterable {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30886f = new a(c0.class, 16);

    /* renamed from: e  reason: collision with root package name */
    f[] f30887e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return c0Var;
        }
    }

    class b implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        private int f30888a = 0;

        b() {
        }

        public boolean hasMoreElements() {
            return this.f30888a < c0.this.f30887e.length;
        }

        public Object nextElement() {
            int i10 = this.f30888a;
            f[] fVarArr = c0.this.f30887e;
            if (i10 < fVarArr.length) {
                this.f30888a = i10 + 1;
                return fVarArr[i10];
            }
            throw new NoSuchElementException();
        }
    }

    protected c0() {
        this.f30887e = g.f30916d;
    }

    public static c0 k0(Object obj) {
        if (obj == null || (obj instanceof c0)) {
            return (c0) obj;
        }
        if (obj instanceof f) {
            z n10 = ((f) obj).n();
            if (n10 instanceof c0) {
                return (c0) n10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (c0) f30886f.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new u1(this.f30887e, false);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new i2(this.f30887e, false);
    }

    public int hashCode() {
        int length = this.f30887e.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ this.f30887e[length].n().hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    public c[] i0() {
        int size = size();
        c[] cVarArr = new c[size];
        for (int i10 = 0; i10 < size; i10++) {
            cVarArr[i10] = c.k0(this.f30887e[i10]);
        }
        return cVarArr;
    }

    public Iterator iterator() {
        return new a.C0259a(this.f30887e);
    }

    /* access modifiers changed from: package-private */
    public v[] j0() {
        int size = size();
        v[] vVarArr = new v[size];
        for (int i10 = 0; i10 < size; i10++) {
            vVarArr[i10] = v.j0(this.f30887e[i10]);
        }
        return vVarArr;
    }

    public f l0(int i10) {
        return this.f30887e[i10];
    }

    public Enumeration m0() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract c n0();

    /* access modifiers changed from: package-private */
    public abstract j o0();

    /* access modifiers changed from: package-private */
    public abstract v p0();

    /* access modifiers changed from: package-private */
    public abstract d0 q0();

    /* access modifiers changed from: package-private */
    public f[] r0() {
        return this.f30887e;
    }

    public int size() {
        return this.f30887e.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f30887e[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) zVar;
        int size = size();
        if (c0Var.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            z n10 = this.f30887e[i10].n();
            z n11 = c0Var.f30887e[i10].n();
            if (n10 != n11 && !n10.y(n11)) {
                return false;
            }
        }
        return true;
    }

    protected c0(f fVar) {
        if (fVar != null) {
            this.f30887e = new f[]{fVar};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    protected c0(g gVar) {
        if (gVar != null) {
            this.f30887e = gVar.g();
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    c0(f[] fVarArr, boolean z10) {
        this.f30887e = z10 ? g.b(fVarArr) : fVarArr;
    }
}
