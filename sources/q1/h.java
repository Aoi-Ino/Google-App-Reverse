package q1;

import android.content.Context;
import cm.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m1.m;
import o1.a;
import pl.x;
import t1.b;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f14921a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14922b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14923c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet f14924d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private Object f14925e;

    protected h(Context context, b bVar) {
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
        this.f14921a = bVar;
        Context applicationContext = context.getApplicationContext();
        l.e(applicationContext, "context.applicationContext");
        this.f14922b = applicationContext;
    }

    /* access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        l.f(list, "$listenersList");
        l.f(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(hVar.f14925e);
        }
    }

    public final void c(a aVar) {
        l.f(aVar, "listener");
        synchronized (this.f14923c) {
            try {
                if (this.f14924d.add(aVar)) {
                    if (this.f14924d.size() == 1) {
                        this.f14925e = e();
                        m e10 = m.e();
                        String a10 = i.f14926a;
                        e10.a(a10, getClass().getSimpleName() + ": initial state = " + this.f14925e);
                        h();
                    }
                    aVar.a(this.f14925e);
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Context d() {
        return this.f14922b;
    }

    public abstract Object e();

    public final void f(a aVar) {
        l.f(aVar, "listener");
        synchronized (this.f14923c) {
            try {
                if (this.f14924d.remove(aVar) && this.f14924d.isEmpty()) {
                    i();
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f14923c) {
            Object obj2 = this.f14925e;
            if (obj2 == null || !l.a(obj2, obj)) {
                this.f14925e = obj;
                this.f14921a.a().execute(new g(y.t0(this.f14924d), this));
                x xVar = x.f30437a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
