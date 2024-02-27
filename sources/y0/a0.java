package y0;

import cm.l;
import cm.m;
import d1.k;
import java.util.concurrent.atomic.AtomicBoolean;
import pl.h;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f18260a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f18261b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private final h f18262c = j.a(new a(this));

    static final class a extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a0 f18263e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(0);
            this.f18263e = a0Var;
        }

        /* renamed from: b */
        public final k a() {
            return this.f18263e.d();
        }
    }

    public a0(u uVar) {
        l.f(uVar, "database");
        this.f18260a = uVar;
    }

    /* access modifiers changed from: private */
    public final k d() {
        return this.f18260a.f(e());
    }

    private final k f() {
        return (k) this.f18262c.getValue();
    }

    private final k g(boolean z10) {
        return z10 ? f() : d();
    }

    public k b() {
        c();
        return g(this.f18261b.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f18260a.c();
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public void h(k kVar) {
        l.f(kVar, "statement");
        if (kVar == f()) {
            this.f18261b.set(false);
        }
    }
}
