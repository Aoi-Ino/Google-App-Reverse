package b7;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f4476d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f4477e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f4478a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f4479b;

    /* renamed from: c  reason: collision with root package name */
    private int f4480c;

    e() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f4476d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f4480c) + ((double) this.f4478a.e()), (double) f4477e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f4480c = 0;
    }

    public synchronized boolean b() {
        return this.f4480c == 0 || this.f4478a.a() > this.f4479b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f4480c++;
        this.f4479b = this.f4478a.a() + a(i10);
    }
}
