package e8;

import java.io.OutputStream;
import java.util.HashMap;

public class l0 extends i1 {

    /* renamed from: i  reason: collision with root package name */
    public static final c1 f10894i = c1.f10473v3;

    /* renamed from: j  reason: collision with root package name */
    public static final c1 f10895j = c1.O6;

    /* renamed from: k  reason: collision with root package name */
    public static final c1 f10896k = c1.U6;

    /* renamed from: l  reason: collision with root package name */
    public static final c1 f10897l = c1.Z6;

    /* renamed from: m  reason: collision with root package name */
    public static final c1 f10898m = c1.G0;

    /* renamed from: g  reason: collision with root package name */
    private c1 f10899g;

    /* renamed from: h  reason: collision with root package name */
    protected HashMap f10900h;

    public l0() {
        super(6);
        this.f10899g = null;
        this.f10900h = new HashMap();
    }

    public void k(c2 c2Var, OutputStream outputStream) {
        outputStream.write(60);
        outputStream.write(60);
        for (c1 c1Var : this.f10900h.keySet()) {
            i1 i1Var = (i1) this.f10900h.get(c1Var);
            c1Var.k(c2Var, outputStream);
            int l10 = i1Var.l();
            if (!(l10 == 5 || l10 == 6 || l10 == 4 || l10 == 3)) {
                outputStream.write(32);
            }
            i1Var.k(c2Var, outputStream);
        }
        outputStream.write(62);
        outputStream.write(62);
    }

    public i1 m(c1 c1Var) {
        return (i1) this.f10900h.get(c1Var);
    }

    public l0 n(c1 c1Var) {
        i1 o10 = o(c1Var);
        if (o10 == null || !o10.e()) {
            return null;
        }
        return (l0) o10;
    }

    public i1 o(c1 c1Var) {
        return s1.a(m(c1Var));
    }

    public void p(l0 l0Var) {
        this.f10900h.putAll(l0Var.f10900h);
    }

    public void q(l0 l0Var) {
        for (c1 c1Var : l0Var.f10900h.keySet()) {
            if (!this.f10900h.containsKey(c1Var)) {
                this.f10900h.put(c1Var, l0Var.f10900h.get(c1Var));
            }
        }
    }

    public void r(c1 c1Var, i1 i1Var) {
        if (i1Var == null || i1Var.h()) {
            this.f10900h.remove(c1Var);
        } else {
            this.f10900h.put(c1Var, i1Var);
        }
    }

    public void s(l0 l0Var) {
        this.f10900h.putAll(l0Var.f10900h);
    }

    public void t(c1 c1Var) {
        this.f10900h.remove(c1Var);
    }

    public String toString() {
        c1 c1Var = c1.f10454ta;
        if (m(c1Var) == null) {
            return "Dictionary";
        }
        return "Dictionary of type: " + m(c1Var);
    }

    public int u() {
        return this.f10900h.size();
    }

    public l0(c1 c1Var) {
        this();
        this.f10899g = c1Var;
        r(c1.f10454ta, c1Var);
    }
}
