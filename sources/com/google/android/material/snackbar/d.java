package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class d {

    /* renamed from: e  reason: collision with root package name */
    private static d f6342e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f6343a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f6344b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f6345c;

    /* renamed from: d  reason: collision with root package name */
    private c f6346d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d.this.d((c) message.obj);
            return true;
        }
    }

    interface b {
        void a();

        void b(int i10);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference f6348a;

        /* renamed from: b  reason: collision with root package name */
        int f6349b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6350c;

        c(int i10, b bVar) {
            this.f6348a = new WeakReference(bVar);
            this.f6349b = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f6348a.get() == bVar;
        }
    }

    private d() {
    }

    private boolean a(c cVar, int i10) {
        b bVar = (b) cVar.f6348a.get();
        if (bVar == null) {
            return false;
        }
        this.f6344b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    static d c() {
        if (f6342e == null) {
            f6342e = new d();
        }
        return f6342e;
    }

    private boolean f(b bVar) {
        c cVar = this.f6345c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.f6346d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i10 = cVar.f6349b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            this.f6344b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f6344b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }

    private void n() {
        c cVar = this.f6346d;
        if (cVar != null) {
            this.f6345c = cVar;
            this.f6346d = null;
            b bVar = (b) cVar.f6348a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f6345c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        c cVar;
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    cVar = this.f6345c;
                } else if (g(bVar)) {
                    cVar = this.f6346d;
                }
                a(cVar, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        synchronized (this.f6343a) {
            try {
                if (this.f6345c != cVar) {
                    if (this.f6346d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f6343a) {
            try {
                if (!f(bVar)) {
                    if (!g(bVar)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    this.f6345c = null;
                    if (this.f6346d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    l(this.f6345c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f6345c;
                    if (!cVar.f6350c) {
                        cVar.f6350c = true;
                        this.f6344b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f6345c;
                    if (cVar.f6350c) {
                        cVar.f6350c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f6343a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f6345c;
                    cVar.f6349b = i10;
                    this.f6344b.removeCallbacksAndMessages(cVar);
                    l(this.f6345c);
                    return;
                }
                if (g(bVar)) {
                    this.f6346d.f6349b = i10;
                } else {
                    this.f6346d = new c(i10, bVar);
                }
                c cVar2 = this.f6345c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f6345c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
