package androidx.activity;

import bm.a;
import cm.l;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private boolean f515a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f516b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private a f517c;

    public p(boolean z10) {
        this.f515a = z10;
    }

    public final void a(c cVar) {
        l.f(cVar, "cancellable");
        this.f516b.add(cVar);
    }

    public final a b() {
        return this.f517c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b bVar) {
        l.f(bVar, "backEvent");
    }

    public void f(b bVar) {
        l.f(bVar, "backEvent");
    }

    public final boolean g() {
        return this.f515a;
    }

    public final void h() {
        for (c cancel : this.f516b) {
            cancel.cancel();
        }
    }

    public final void i(c cVar) {
        l.f(cVar, "cancellable");
        this.f516b.remove(cVar);
    }

    public final void j(boolean z10) {
        this.f515a = z10;
        a aVar = this.f517c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void k(a aVar) {
        this.f517c = aVar;
    }
}
