package androidx.activity;

import bm.a;
import cm.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import pl.x;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f507a;

    /* renamed from: b  reason: collision with root package name */
    private final a f508b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f509c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f510d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f511e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f512f;

    /* renamed from: g  reason: collision with root package name */
    private final List f513g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f514h = new m(this);

    public n(Executor executor, a aVar) {
        l.f(executor, "executor");
        l.f(aVar, "reportFullyDrawn");
        this.f507a = executor;
        this.f508b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(n nVar) {
        l.f(nVar, "this$0");
        synchronized (nVar.f509c) {
            try {
                nVar.f511e = false;
                if (nVar.f510d == 0 && !nVar.f512f) {
                    nVar.f508b.a();
                    nVar.b();
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f509c) {
            try {
                this.f512f = true;
                for (a a10 : this.f513g) {
                    a10.a();
                }
                this.f513g.clear();
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f509c) {
            z10 = this.f512f;
        }
        return z10;
    }
}
