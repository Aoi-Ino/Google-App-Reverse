package o4;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import g4.b;
import g4.c;
import g4.h;
import g4.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import s3.o;
import w3.d;
import w3.f;
import w3.l;
import w3.m;

public class a {

    /* renamed from: r  reason: collision with root package name */
    private static final long f14417r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f14418s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f14419t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile e f14420u = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f14421a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f14422b;

    /* renamed from: c  reason: collision with root package name */
    private int f14423c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Future f14424d;

    /* renamed from: e  reason: collision with root package name */
    private long f14425e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f14426f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f14427g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f14428h;

    /* renamed from: i  reason: collision with root package name */
    b f14429i;

    /* renamed from: j  reason: collision with root package name */
    private d f14430j = f.b();

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f14431k;

    /* renamed from: l  reason: collision with root package name */
    private final String f14432l;

    /* renamed from: m  reason: collision with root package name */
    private final String f14433m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f14434n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f14435o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f14436p = new AtomicInteger(0);

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f14437q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        o.j(context, "WakeLock: context must not be null");
        o.f(str, "WakeLock: wakeLockName must not be empty");
        this.f14434n = context.getApplicationContext();
        this.f14433m = str;
        this.f14429i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f14432l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f14432l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f14422b = newWakeLock;
            if (m.c(context)) {
                WorkSource b10 = m.b(context, l.a(packageName) ? context.getPackageName() : packageName);
                this.f14431k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f14418s;
            if (scheduledExecutorService == null) {
                synchronized (f14419t) {
                    try {
                        scheduledExecutorService = f14418s;
                        if (scheduledExecutorService == null) {
                            h.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f14418s = scheduledExecutorService;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f14437q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new i(sb2.toString());
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f14421a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f14432l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f14423c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f14427g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    private final void g() {
        if (!this.f14426f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f14426f);
            this.f14426f.clear();
            if (arrayList.size() > 0) {
                android.support.v4.media.session.b.a(arrayList.get(0));
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (r5.f14429i != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r5.f14429i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r5.f14429i != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f14421a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r0 = move-exception
            goto L_0x00a5
        L_0x000e:
            boolean r0 = r5.f14427g     // Catch:{ all -> 0x000b }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r5.f14423c     // Catch:{ all -> 0x000b }
            int r0 = r0 + -1
            r5.f14423c = r0     // Catch:{ all -> 0x000b }
            if (r0 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r5.f14423c = r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            r5.g()     // Catch:{ all -> 0x000b }
            java.util.Map r0 = r5.f14435o     // Catch:{ all -> 0x000b }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x000b }
            o4.d r2 = (o4.d) r2     // Catch:{ all -> 0x000b }
            r2.f14439a = r1     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.Map r0 = r5.f14435o     // Catch:{ all -> 0x000b }
            r0.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.Future r0 = r5.f14424d     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r0.cancel(r1)     // Catch:{ all -> 0x000b }
            r5.f14424d = r2     // Catch:{ all -> 0x000b }
            r3 = 0
            r5.f14425e = r3     // Catch:{ all -> 0x000b }
        L_0x004f:
            r5.f14428h = r1     // Catch:{ all -> 0x000b }
            android.os.PowerManager$WakeLock r0 = r5.f14422b     // Catch:{ all -> 0x000b }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0092
            android.os.PowerManager$WakeLock r0 = r5.f14422b     // Catch:{ RuntimeException -> 0x0067 }
            r0.release()     // Catch:{ RuntimeException -> 0x0067 }
            g4.b r0 = r5.f14429i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a3
        L_0x0062:
            r5.f14429i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a3
        L_0x0065:
            r0 = move-exception
            goto L_0x008b
        L_0x0067:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0065 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f14432l     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0065 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0065 }
            g4.b r0 = r5.f14429i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a3
            goto L_0x0062
        L_0x008a:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x008b:
            g4.b r1 = r5.f14429i     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0091
            r5.f14429i = r2     // Catch:{ all -> 0x000b }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x0092:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f14432l     // Catch:{ all -> 0x000b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x000b }
        L_0x00a3:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f14436p.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f14417r), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f14421a) {
            try {
                if (!b()) {
                    this.f14429i = b.c(false, (c) null);
                    this.f14422b.acquire();
                    this.f14430j.a();
                }
                this.f14423c++;
                this.f14428h++;
                f((String) null);
                d dVar = (d) this.f14435o.get((Object) null);
                if (dVar == null) {
                    dVar = new d((c) null);
                    this.f14435o.put((Object) null, dVar);
                }
                dVar.f14439a++;
                long a10 = this.f14430j.a();
                if (Long.MAX_VALUE - a10 > max) {
                    j11 = a10 + max;
                }
                if (j11 > this.f14425e) {
                    this.f14425e = j11;
                    Future future = this.f14424d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f14424d = this.f14437q.schedule(new b(this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f14421a) {
            z10 = this.f14423c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f14436p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f14432l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f14421a) {
            try {
                f((String) null);
                if (this.f14435o.containsKey((Object) null)) {
                    d dVar = (d) this.f14435o.get((Object) null);
                    if (dVar != null) {
                        int i10 = dVar.f14439a - 1;
                        dVar.f14439a = i10;
                        if (i10 == 0) {
                            this.f14435o.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f14432l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f14421a) {
            this.f14427g = z10;
        }
    }
}
