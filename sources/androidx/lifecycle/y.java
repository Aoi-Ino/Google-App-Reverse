package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import k.b;

public class y extends a0 {

    /* renamed from: l  reason: collision with root package name */
    private b f3391l = new b();

    private static class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        final x f3392a;

        /* renamed from: b  reason: collision with root package name */
        final b0 f3393b;

        /* renamed from: c  reason: collision with root package name */
        int f3394c = -1;

        a(x xVar, b0 b0Var) {
            this.f3392a = xVar;
            this.f3393b = b0Var;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3392a.h(this);
        }

        public void b(Object obj) {
            if (this.f3394c != this.f3392a.e()) {
                this.f3394c = this.f3392a.e();
                this.f3393b.b(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3392a.l(this);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        Iterator it = this.f3391l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
        Iterator it = this.f3391l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void n(x xVar, b0 b0Var) {
        if (xVar != null) {
            a aVar = new a(xVar, b0Var);
            a aVar2 = (a) this.f3391l.v(xVar, aVar);
            if (aVar2 != null && aVar2.f3393b != b0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (aVar2 == null && f()) {
                aVar.a();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
