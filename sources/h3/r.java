package h3;

import a3.h;
import a3.i;
import a3.o;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b3.e;
import b3.f;
import b3.g;
import b3.m;
import d3.c;
import i3.c;
import i3.d;
import i3.k;
import j3.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.a;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11984a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11985b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11986c;

    /* renamed from: d  reason: collision with root package name */
    private final x f11987d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11988e;

    /* renamed from: f  reason: collision with root package name */
    private final b f11989f;

    /* renamed from: g  reason: collision with root package name */
    private final a f11990g;

    /* renamed from: h  reason: collision with root package name */
    private final a f11991h;

    /* renamed from: i  reason: collision with root package name */
    private final c f11992i;

    public r(Context context, e eVar, d dVar, x xVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f11984a = context;
        this.f11985b = eVar;
        this.f11986c = dVar;
        this.f11987d = xVar;
        this.f11988e = executor;
        this.f11989f = bVar;
        this.f11990g = aVar;
        this.f11991h = aVar2;
        this.f11992i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(o oVar) {
        return Boolean.valueOf(this.f11986c.t(oVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(o oVar) {
        return this.f11986c.p(oVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, o oVar, long j10) {
        this.f11986c.o0(iterable);
        this.f11986c.F(oVar, this.f11990g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f11986c.m(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f11992i.f();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f11992i.c((long) ((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(o oVar, long j10) {
        this.f11986c.F(oVar, this.f11990g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(o oVar, int i10) {
        this.f11987d.a(oVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.f11987d.a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(a3.o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            j3.b r0 = r3.f11989f     // Catch:{ a -> 0x0029 }
            i3.d r1 = r3.f11986c     // Catch:{ a -> 0x0029 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0029 }
            h3.i r2 = new h3.i     // Catch:{ a -> 0x0029 }
            r2.<init>(r1)     // Catch:{ a -> 0x0029 }
            r0.g(r2)     // Catch:{ a -> 0x0029 }
            boolean r0 = r3.k()     // Catch:{ a -> 0x0029 }
            if (r0 != 0) goto L_0x0022
            j3.b r0 = r3.f11989f     // Catch:{ a -> 0x0029 }
            h3.j r1 = new h3.j     // Catch:{ a -> 0x0029 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0029 }
            r0.g(r1)     // Catch:{ a -> 0x0029 }
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x0032
        L_0x0022:
            r3.u(r4, r5)     // Catch:{ a -> 0x0029 }
        L_0x0025:
            r6.run()
            goto L_0x0031
        L_0x0029:
            h3.x r0 = r3.f11987d     // Catch:{ all -> 0x0020 }
            int r5 = r5 + 1
            r0.a(r4, r5)     // Catch:{ all -> 0x0020 }
            goto L_0x0025
        L_0x0031:
            return
        L_0x0032:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.r.t(a3.o, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        b bVar = this.f11989f;
        i3.c cVar = this.f11992i;
        Objects.requireNonNull(cVar);
        return mVar.b(i.a().i(this.f11990g.a()).k(this.f11991h.a()).j("GDT_CLIENT_METRICS").h(new h(y2.c.b("proto"), ((d3.a) bVar.g(new h(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11984a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g u(o oVar, int i10) {
        g a10;
        m i11 = this.f11985b.i(oVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f11989f.g(new k(this, oVar))).booleanValue()) {
                Iterable<k> iterable = (Iterable) this.f11989f.g(new l(this, oVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (i11 == null) {
                    e3.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    a10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (k b10 : iterable) {
                        arrayList.add(b10.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(i11));
                    }
                    a10 = i11.a(f.a().b(arrayList).c(oVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f11989f.g(new m(this, iterable, oVar, j11));
                    this.f11987d.b(oVar, i10 + 1, true);
                    return e10;
                }
                this.f11989f.g(new n(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (oVar.e()) {
                        this.f11989f.g(new o(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (k b11 : iterable) {
                        String j12 = b11.b().j();
                        hashMap.put(j12, !hashMap.containsKey(j12) ? 1 : Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                    }
                    this.f11989f.g(new p(this, hashMap));
                }
            }
            this.f11989f.g(new q(this, oVar, j11));
            return e10;
        }
    }

    public void v(o oVar, int i10, Runnable runnable) {
        this.f11988e.execute(new g(this, oVar, i10, runnable));
    }
}
