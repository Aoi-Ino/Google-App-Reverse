package l7;

import i7.g;
import i7.i;
import i7.j;
import i7.l;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p7.c;

public final class f extends c {

    /* renamed from: t  reason: collision with root package name */
    private static final Writer f13324t = new a();

    /* renamed from: u  reason: collision with root package name */
    private static final l f13325u = new l("closed");

    /* renamed from: q  reason: collision with root package name */
    private final List f13326q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private String f13327r;

    /* renamed from: s  reason: collision with root package name */
    private g f13328s = i.f12547e;

    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f13324t);
    }

    private g K0() {
        List list = this.f13326q;
        return (g) list.get(list.size() - 1);
    }

    private void L0(g gVar) {
        if (this.f13327r != null) {
            if (!gVar.s() || o()) {
                ((j) K0()).B(this.f13327r, gVar);
            }
            this.f13327r = null;
        } else if (this.f13326q.isEmpty()) {
            this.f13328s = gVar;
        } else {
            g K0 = K0();
            if (K0 instanceof i7.f) {
                ((i7.f) K0).B(gVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c C0(double d10) {
        if (y() || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            L0(new l((Number) Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    public c D0(long j10) {
        L0(new l((Number) Long.valueOf(j10)));
        return this;
    }

    public c E(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f13326q.isEmpty() || this.f13327r != null) {
            throw new IllegalStateException();
        } else if (K0() instanceof j) {
            this.f13327r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c E0(Boolean bool) {
        if (bool == null) {
            return R();
        }
        L0(new l(bool));
        return this;
    }

    public c F0(Number number) {
        if (number == null) {
            return R();
        }
        if (!y()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        L0(new l(number));
        return this;
    }

    public c G0(String str) {
        if (str == null) {
            return R();
        }
        L0(new l(str));
        return this;
    }

    public c H0(boolean z10) {
        L0(new l(Boolean.valueOf(z10)));
        return this;
    }

    public g J0() {
        if (this.f13326q.isEmpty()) {
            return this.f13328s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f13326q);
    }

    public c R() {
        L0(i.f12547e);
        return this;
    }

    public void close() {
        if (this.f13326q.isEmpty()) {
            this.f13326q.add(f13325u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c f() {
        i7.f fVar = new i7.f();
        L0(fVar);
        this.f13326q.add(fVar);
        return this;
    }

    public void flush() {
    }

    public c g() {
        j jVar = new j();
        L0(jVar);
        this.f13326q.add(jVar);
        return this;
    }

    public c l() {
        if (this.f13326q.isEmpty() || this.f13327r != null) {
            throw new IllegalStateException();
        } else if (K0() instanceof i7.f) {
            List list = this.f13326q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c n() {
        if (this.f13326q.isEmpty() || this.f13327r != null) {
            throw new IllegalStateException();
        } else if (K0() instanceof j) {
            List list = this.f13326q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
