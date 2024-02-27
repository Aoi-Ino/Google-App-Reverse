package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.b;
import com.google.crypto.tink.shaded.protobuf.e;
import java.util.Iterator;
import java.util.Map;

final class s0 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f7229a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f7230b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7231c;

    /* renamed from: d  reason: collision with root package name */
    private final q f7232d;

    private s0(j1 j1Var, q qVar, o0 o0Var) {
        this.f7230b = j1Var;
        this.f7231c = qVar.e(o0Var);
        this.f7232d = qVar;
        this.f7229a = o0Var;
    }

    private int k(j1 j1Var, Object obj) {
        return j1Var.i(j1Var.g(obj));
    }

    private void l(j1 j1Var, q qVar, Object obj, c1 c1Var, p pVar) {
        Object f10 = j1Var.f(obj);
        t d10 = qVar.d(obj);
        do {
            try {
                if (c1Var.r() == Integer.MAX_VALUE) {
                    j1Var.o(obj, f10);
                    return;
                }
            } finally {
                j1Var.o(obj, f10);
            }
        } while (n(c1Var, pVar, qVar, d10, j1Var, f10));
    }

    static s0 m(j1 j1Var, q qVar, o0 o0Var) {
        return new s0(j1Var, qVar, o0Var);
    }

    private boolean n(c1 c1Var, p pVar, q qVar, t tVar, j1 j1Var, Object obj) {
        int e10 = c1Var.e();
        if (e10 == p1.f7169a) {
            Object obj2 = null;
            int i10 = 0;
            h hVar = null;
            while (c1Var.r() != Integer.MAX_VALUE) {
                int e11 = c1Var.e();
                if (e11 == p1.f7171c) {
                    i10 = c1Var.y();
                    obj2 = qVar.b(pVar, this.f7229a, i10);
                } else if (e11 == p1.f7172d) {
                    if (obj2 != null) {
                        qVar.h(c1Var, obj2, pVar, tVar);
                    } else {
                        hVar = c1Var.w();
                    }
                } else if (!c1Var.A()) {
                    break;
                }
            }
            if (c1Var.e() == p1.f7170b) {
                if (hVar != null) {
                    if (obj2 != null) {
                        qVar.i(hVar, obj2, pVar, tVar);
                    } else {
                        j1Var.d(obj, i10, hVar);
                    }
                }
                return true;
            }
            throw a0.a();
        } else if (p1.b(e10) != 2) {
            return c1Var.A();
        } else {
            Object b10 = qVar.b(pVar, this.f7229a, p1.a(e10));
            if (b10 == null) {
                return j1Var.m(obj, c1Var);
            }
            qVar.h(c1Var, b10, pVar, tVar);
            return true;
        }
    }

    private void o(j1 j1Var, Object obj, q1 q1Var) {
        j1Var.s(j1Var.g(obj), q1Var);
    }

    public void a(Object obj, Object obj2) {
        f1.F(this.f7230b, obj, obj2);
        if (this.f7231c) {
            f1.D(this.f7232d, obj, obj2);
        }
    }

    public void b(Object obj, byte[] bArr, int i10, int i11, e.a aVar) {
        x xVar = (x) obj;
        if (xVar.unknownFields == k1.e()) {
            xVar.unknownFields = k1.l();
        }
        b.a(obj);
        throw null;
    }

    public void c(Object obj, q1 q1Var) {
        Iterator f10 = this.f7232d.c(obj).f();
        if (!f10.hasNext()) {
            o(this.f7230b, obj, q1Var);
        } else {
            b.a(((Map.Entry) f10.next()).getKey());
            throw null;
        }
    }

    public void d(Object obj, c1 c1Var, p pVar) {
        l(this.f7230b, this.f7232d, obj, c1Var, pVar);
    }

    public void e(Object obj) {
        this.f7230b.j(obj);
        this.f7232d.f(obj);
    }

    public final boolean f(Object obj) {
        return this.f7232d.c(obj).e();
    }

    public boolean g(Object obj, Object obj2) {
        if (!this.f7230b.g(obj).equals(this.f7230b.g(obj2))) {
            return false;
        }
        if (this.f7231c) {
            return this.f7232d.c(obj).equals(this.f7232d.c(obj2));
        }
        return true;
    }

    public int h(Object obj) {
        int k10 = k(this.f7230b, obj);
        return this.f7231c ? k10 + this.f7232d.c(obj).b() : k10;
    }

    public Object i() {
        return this.f7229a.f().H();
    }

    public int j(Object obj) {
        int hashCode = this.f7230b.g(obj).hashCode();
        return this.f7231c ? (hashCode * 53) + this.f7232d.c(obj).hashCode() : hashCode;
    }
}
