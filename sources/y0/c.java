package y0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import cm.g;
import cm.l;
import d1.h;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import pl.x;

public final class c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18267m = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public h f18268a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f18269b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private Runnable f18270c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f18271d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f18272e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f18273f;

    /* renamed from: g  reason: collision with root package name */
    private int f18274g;

    /* renamed from: h  reason: collision with root package name */
    private long f18275h;

    /* renamed from: i  reason: collision with root package name */
    private d1.g f18276i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18277j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f18278k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f18279l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public c(long j10, TimeUnit timeUnit, Executor executor) {
        l.f(timeUnit, "autoCloseTimeUnit");
        l.f(executor, "autoCloseExecutor");
        this.f18272e = timeUnit.toMillis(j10);
        this.f18273f = executor;
        this.f18275h = SystemClock.uptimeMillis();
        this.f18278k = new a(this);
        this.f18279l = new b(this);
    }

    /* access modifiers changed from: private */
    public static final void c(c cVar) {
        x xVar;
        l.f(cVar, "this$0");
        synchronized (cVar.f18271d) {
            try {
                if (SystemClock.uptimeMillis() - cVar.f18275h >= cVar.f18272e) {
                    if (cVar.f18274g == 0) {
                        Runnable runnable = cVar.f18270c;
                        if (runnable != null) {
                            runnable.run();
                            xVar = x.f30437a;
                        } else {
                            xVar = null;
                        }
                        if (xVar != null) {
                            d1.g gVar = cVar.f18276i;
                            if (gVar != null && gVar.isOpen()) {
                                gVar.close();
                            }
                            cVar.f18276i = null;
                            x xVar2 = x.f30437a;
                            return;
                        }
                        throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(c cVar) {
        l.f(cVar, "this$0");
        cVar.f18273f.execute(cVar.f18279l);
    }

    public final void d() {
        synchronized (this.f18271d) {
            try {
                this.f18277j = true;
                d1.g gVar = this.f18276i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f18276i = null;
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f18271d) {
            try {
                int i10 = this.f18274g;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f18274g = i11;
                    if (i11 == 0) {
                        if (this.f18276i != null) {
                            this.f18269b.postDelayed(this.f18278k, this.f18272e);
                        } else {
                            return;
                        }
                    }
                    x xVar = x.f30437a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object g(bm.l lVar) {
        l.f(lVar, "block");
        try {
            return lVar.invoke(j());
        } finally {
            e();
        }
    }

    public final d1.g h() {
        return this.f18276i;
    }

    public final h i() {
        h hVar = this.f18268a;
        if (hVar != null) {
            return hVar;
        }
        l.v("delegateOpenHelper");
        return null;
    }

    public final d1.g j() {
        synchronized (this.f18271d) {
            this.f18269b.removeCallbacks(this.f18278k);
            this.f18274g++;
            if (!this.f18277j) {
                d1.g gVar = this.f18276i;
                if (gVar != null && gVar.isOpen()) {
                    return gVar;
                }
                d1.g u02 = i().u0();
                this.f18276i = u02;
                return u02;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void k(h hVar) {
        l.f(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f18277j;
    }

    public final void m(Runnable runnable) {
        l.f(runnable, "onAutoClose");
        this.f18270c = runnable;
    }

    public final void n(h hVar) {
        l.f(hVar, "<set-?>");
        this.f18268a = hVar;
    }
}
