package gl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

class a0 {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f23765a;

    /* renamed from: b  reason: collision with root package name */
    final d f23766b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f23767c;

    /* renamed from: d  reason: collision with root package name */
    long f23768d;

    /* renamed from: e  reason: collision with root package name */
    long f23769e;

    /* renamed from: f  reason: collision with root package name */
    long f23770f;

    /* renamed from: g  reason: collision with root package name */
    long f23771g;

    /* renamed from: h  reason: collision with root package name */
    long f23772h;

    /* renamed from: i  reason: collision with root package name */
    long f23773i;

    /* renamed from: j  reason: collision with root package name */
    long f23774j;

    /* renamed from: k  reason: collision with root package name */
    long f23775k;

    /* renamed from: l  reason: collision with root package name */
    int f23776l;

    /* renamed from: m  reason: collision with root package name */
    int f23777m;

    /* renamed from: n  reason: collision with root package name */
    int f23778n;

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f23779a;

        /* renamed from: gl.a0$a$a  reason: collision with other inner class name */
        class C0295a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Message f23780e;

            C0295a(Message message) {
                this.f23780e = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f23780e.what);
            }
        }

        public a(Looper looper, a0 a0Var) {
            super(looper);
            this.f23779a = a0Var;
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f23779a.j();
            } else if (i10 == 1) {
                this.f23779a.k();
            } else if (i10 == 2) {
                this.f23779a.h((long) message.arg1);
            } else if (i10 == 3) {
                this.f23779a.i((long) message.arg1);
            } else if (i10 != 4) {
                t.f23893o.post(new C0295a(message));
            } else {
                this.f23779a.l((Long) message.obj);
            }
        }
    }

    a0(d dVar) {
        this.f23766b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f23765a = handlerThread;
        handlerThread.start();
        e0.j(handlerThread.getLooper());
        this.f23767c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i10, long j10) {
        return j10 / ((long) i10);
    }

    private void m(Bitmap bitmap, int i10) {
        int k10 = e0.k(bitmap);
        Handler handler = this.f23767c;
        handler.sendMessage(handler.obtainMessage(i10, k10, 0));
    }

    /* access modifiers changed from: package-private */
    public b0 a() {
        return new b0(this.f23766b.a(), this.f23766b.size(), this.f23768d, this.f23769e, this.f23770f, this.f23771g, this.f23772h, this.f23773i, this.f23774j, this.f23775k, this.f23776l, this.f23777m, this.f23778n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f23767c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f23767c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    public void f(long j10) {
        Handler handler = this.f23767c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    /* access modifiers changed from: package-private */
    public void h(long j10) {
        int i10 = this.f23777m + 1;
        this.f23777m = i10;
        long j11 = this.f23771g + j10;
        this.f23771g = j11;
        this.f23774j = g(i10, j11);
    }

    /* access modifiers changed from: package-private */
    public void i(long j10) {
        this.f23778n++;
        long j11 = this.f23772h + j10;
        this.f23772h = j11;
        this.f23775k = g(this.f23777m, j11);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f23768d++;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f23769e++;
    }

    /* access modifiers changed from: package-private */
    public void l(Long l10) {
        this.f23776l++;
        long longValue = this.f23770f + l10.longValue();
        this.f23770f = longValue;
        this.f23773i = g(this.f23776l, longValue);
    }
}
