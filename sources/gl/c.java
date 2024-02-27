package gl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import gl.j;
import gl.r;
import gl.t;
import gl.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

class c implements Runnable {
    private static final y A = new b();

    /* renamed from: x  reason: collision with root package name */
    private static final Object f23798x = new Object();

    /* renamed from: y  reason: collision with root package name */
    private static final ThreadLocal f23799y = new a();

    /* renamed from: z  reason: collision with root package name */
    private static final AtomicInteger f23800z = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    final int f23801e = f23800z.incrementAndGet();

    /* renamed from: f  reason: collision with root package name */
    final t f23802f;

    /* renamed from: g  reason: collision with root package name */
    final i f23803g;

    /* renamed from: h  reason: collision with root package name */
    final d f23804h;

    /* renamed from: i  reason: collision with root package name */
    final a0 f23805i;

    /* renamed from: j  reason: collision with root package name */
    final String f23806j;

    /* renamed from: k  reason: collision with root package name */
    final w f23807k;

    /* renamed from: l  reason: collision with root package name */
    final int f23808l;

    /* renamed from: m  reason: collision with root package name */
    int f23809m;

    /* renamed from: n  reason: collision with root package name */
    final y f23810n;

    /* renamed from: o  reason: collision with root package name */
    a f23811o;

    /* renamed from: p  reason: collision with root package name */
    List f23812p;

    /* renamed from: q  reason: collision with root package name */
    Bitmap f23813q;

    /* renamed from: r  reason: collision with root package name */
    Future f23814r;

    /* renamed from: s  reason: collision with root package name */
    t.e f23815s;

    /* renamed from: t  reason: collision with root package name */
    Exception f23816t;

    /* renamed from: u  reason: collision with root package name */
    int f23817u;

    /* renamed from: v  reason: collision with root package name */
    int f23818v;

    /* renamed from: w  reason: collision with root package name */
    t.f f23819w;

    static class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends y {
        b() {
        }

        public boolean c(w wVar) {
            return true;
        }

        public y.a f(w wVar, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: gl.c$c  reason: collision with other inner class name */
    static class C0296c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0 f23820e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RuntimeException f23821f;

        C0296c(c0 c0Var, RuntimeException runtimeException) {
            this.f23820e = c0Var;
            this.f23821f = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f23820e.b() + " crashed with exception.", this.f23821f);
        }
    }

    static class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ StringBuilder f23822e;

        d(StringBuilder sb2) {
            this.f23822e = sb2;
        }

        public void run() {
            throw new NullPointerException(this.f23822e.toString());
        }
    }

    static class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0 f23823e;

        e(c0 c0Var) {
            this.f23823e = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f23823e.b() + " returned input Bitmap but recycled it.");
        }
    }

    static class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0 f23824e;

        f(c0 c0Var) {
            this.f23824e = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f23824e.b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(t tVar, i iVar, d dVar, a0 a0Var, a aVar, y yVar) {
        this.f23802f = tVar;
        this.f23803g = iVar;
        this.f23804h = dVar;
        this.f23805i = a0Var;
        this.f23811o = aVar;
        this.f23806j = aVar.d();
        this.f23807k = aVar.i();
        this.f23819w = aVar.h();
        this.f23808l = aVar.e();
        this.f23809m = aVar.f();
        this.f23810n = yVar;
        this.f23818v = yVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c0 c0Var = (c0) list.get(i10);
            try {
                Bitmap a10 = c0Var.a(bitmap);
                if (a10 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(c0Var.b());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(((c0) it.next()).b());
                        sb2.append(10);
                    }
                    t.f23893o.post(new d(sb2));
                    return null;
                } else if (a10 == bitmap && bitmap.isRecycled()) {
                    t.f23893o.post(new e(c0Var));
                    return null;
                } else if (a10 == bitmap || bitmap.isRecycled()) {
                    i10++;
                    bitmap = a10;
                } else {
                    t.f23893o.post(new f(c0Var));
                    return null;
                }
            } catch (RuntimeException e10) {
                t.f23893o.post(new C0296c(c0Var, e10));
                return null;
            }
        }
        return bitmap;
    }

    private t.f d() {
        t.f fVar = t.f.LOW;
        List list = this.f23812p;
        boolean z10 = list != null && !list.isEmpty();
        a aVar = this.f23811o;
        if (aVar == null && !z10) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z10) {
            int size = this.f23812p.size();
            for (int i10 = 0; i10 < size; i10++) {
                t.f h10 = ((a) this.f23812p.get(i10)).h();
                if (h10.ordinal() > fVar.ordinal()) {
                    fVar = h10;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(InputStream inputStream, w wVar) {
        n nVar = new n(inputStream);
        long e10 = nVar.e(65536);
        BitmapFactory.Options d10 = y.d(wVar);
        boolean g10 = y.g(d10);
        boolean t10 = e0.t(nVar);
        nVar.c(e10);
        if (t10) {
            byte[] x10 = e0.x(nVar);
            if (g10) {
                BitmapFactory.decodeByteArray(x10, 0, x10.length, d10);
                y.b(wVar.f23949h, wVar.f23950i, d10, wVar);
            }
            return BitmapFactory.decodeByteArray(x10, 0, x10.length, d10);
        }
        if (g10) {
            BitmapFactory.decodeStream(nVar, (Rect) null, d10);
            y.b(wVar.f23949h, wVar.f23950i, d10, wVar);
            nVar.c(e10);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(nVar, (Rect) null, d10);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c g(t tVar, i iVar, d dVar, a0 a0Var, a aVar) {
        w i10 = aVar.i();
        List h10 = tVar.h();
        int size = h10.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = (y) h10.get(i11);
            if (yVar.c(i10)) {
                return new c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, a0Var, aVar, A);
    }

    private static boolean t(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || i10 > i12 || i11 > i13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap w(gl.w r16, android.graphics.Bitmap r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r17.getWidth()
            int r3 = r17.getHeight()
            boolean r4 = r0.f23953l
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r16.e()
            r6 = 0
            if (r5 == 0) goto L_0x00b4
            int r5 = r0.f23949h
            int r7 = r0.f23950i
            float r8 = r0.f23954m
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0034
            boolean r9 = r0.f23957p
            if (r9 == 0) goto L_0x0031
            float r9 = r0.f23955n
            float r11 = r0.f23956o
            r10.setRotate(r8, r9, r11)
            goto L_0x0034
        L_0x0031:
            r10.setRotate(r8)
        L_0x0034:
            boolean r8 = r0.f23951j
            if (r8 == 0) goto L_0x0077
            float r0 = (float) r5
            float r8 = (float) r2
            float r9 = r0 / r8
            float r11 = (float) r7
            float r12 = (float) r3
            float r13 = r11 / r12
            int r14 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r14 <= 0) goto L_0x0056
            float r13 = r13 / r9
            float r12 = r12 * r13
            double r12 = (double) r12
            double r12 = java.lang.Math.ceil(r12)
            int r0 = (int) r12
            int r8 = r3 - r0
            int r8 = r8 / 2
            float r12 = (float) r0
            float r13 = r11 / r12
            r11 = r9
            r9 = r2
            goto L_0x006a
        L_0x0056:
            float r9 = r9 / r13
            float r8 = r8 * r9
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            int r9 = r2 - r8
            int r9 = r9 / 2
            float r11 = (float) r8
            float r0 = r0 / r11
            r11 = r0
            r0 = r3
            r15 = r8
            r8 = r6
            r6 = r9
            r9 = r15
        L_0x006a:
            boolean r2 = t(r4, r2, r3, r5, r7)
            if (r2 == 0) goto L_0x0073
            r10.preScale(r11, r13)
        L_0x0073:
            r7 = r8
            r8 = r9
            r9 = r0
            goto L_0x00b7
        L_0x0077:
            boolean r0 = r0.f23952k
            if (r0 == 0) goto L_0x0091
            float r0 = (float) r5
            float r8 = (float) r2
            float r0 = r0 / r8
            float r8 = (float) r7
            float r9 = (float) r3
            float r8 = r8 / r9
            int r9 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r9 >= 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = r8
        L_0x0087:
            boolean r4 = t(r4, r2, r3, r5, r7)
            if (r4 == 0) goto L_0x00b4
            r10.preScale(r0, r0)
            goto L_0x00b4
        L_0x0091:
            if (r5 != 0) goto L_0x0095
            if (r7 == 0) goto L_0x00b4
        L_0x0095:
            if (r5 != r2) goto L_0x0099
            if (r7 == r3) goto L_0x00b4
        L_0x0099:
            if (r5 == 0) goto L_0x009f
            float r0 = (float) r5
            float r8 = (float) r2
        L_0x009d:
            float r0 = r0 / r8
            goto L_0x00a2
        L_0x009f:
            float r0 = (float) r7
            float r8 = (float) r3
            goto L_0x009d
        L_0x00a2:
            if (r7 == 0) goto L_0x00a8
            float r8 = (float) r7
            float r9 = (float) r3
        L_0x00a6:
            float r8 = r8 / r9
            goto L_0x00ab
        L_0x00a8:
            float r8 = (float) r5
            float r9 = (float) r2
            goto L_0x00a6
        L_0x00ab:
            boolean r4 = t(r4, r2, r3, r5, r7)
            if (r4 == 0) goto L_0x00b4
            r10.preScale(r0, r8)
        L_0x00b4:
            r8 = r2
            r9 = r3
            r7 = r6
        L_0x00b7:
            if (r1 == 0) goto L_0x00bd
            float r0 = (float) r1
            r10.preRotate(r0)
        L_0x00bd:
            r11 = 1
            r5 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r17
            if (r0 == r1) goto L_0x00cc
            r17.recycle()
            goto L_0x00cd
        L_0x00cc:
            r0 = r1
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.c.w(gl.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void x(w wVar) {
        String a10 = wVar.a();
        StringBuilder sb2 = (StringBuilder) f23799y.get();
        sb2.ensureCapacity(a10.length() + 8);
        sb2.replace(8, sb2.length(), a10);
        Thread.currentThread().setName(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        String d10;
        String str;
        boolean z10 = this.f23802f.f23907m;
        w wVar = aVar.f23753b;
        if (this.f23811o == null) {
            this.f23811o = aVar;
            if (z10) {
                List list = this.f23812p;
                if (list == null || list.isEmpty()) {
                    d10 = wVar.d();
                    str = "to empty hunter";
                } else {
                    d10 = wVar.d();
                    str = e0.m(this, "to ");
                }
                e0.v("Hunter", "joined", d10, str);
                return;
            }
            return;
        }
        if (this.f23812p == null) {
            this.f23812p = new ArrayList(3);
        }
        this.f23812p.add(aVar);
        if (z10) {
            e0.v("Hunter", "joined", wVar.d(), e0.m(this, "to "));
        }
        t.f h10 = aVar.h();
        if (h10.ordinal() > this.f23819w.ordinal()) {
            this.f23819w = h10;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f23814r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r2 = this;
            gl.a r0 = r2.f23811o
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List r0 = r2.f23812p
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future r0 = r2.f23814r
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.c.c():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0.remove(r4) != false) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(gl.a r4) {
        /*
            r3 = this;
            gl.a r0 = r3.f23811o
            if (r0 != r4) goto L_0x0008
            r0 = 0
            r3.f23811o = r0
            goto L_0x0012
        L_0x0008:
            java.util.List r0 = r3.f23812p
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L_0x0020
        L_0x0012:
            gl.t$f r0 = r4.h()
            gl.t$f r1 = r3.f23819w
            if (r0 != r1) goto L_0x0020
            gl.t$f r0 = r3.d()
            r3.f23819w = r0
        L_0x0020:
            gl.t r0 = r3.f23802f
            boolean r0 = r0.f23907m
            if (r0 == 0) goto L_0x0039
            gl.w r4 = r4.f23753b
            java.lang.String r4 = r4.d()
            java.lang.String r0 = "from "
            java.lang.String r0 = gl.e0.m(r3, r0)
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "removed"
            gl.e0.v(r1, r2, r4, r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.c.f(gl.a):void");
    }

    /* access modifiers changed from: package-private */
    public a h() {
        return this.f23811o;
    }

    /* access modifiers changed from: package-private */
    public List i() {
        return this.f23812p;
    }

    /* access modifiers changed from: package-private */
    public w j() {
        return this.f23807k;
    }

    /* access modifiers changed from: package-private */
    public Exception k() {
        return this.f23816t;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f23806j;
    }

    /* access modifiers changed from: package-private */
    public t.e m() {
        return this.f23815s;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f23808l;
    }

    /* access modifiers changed from: package-private */
    public t o() {
        return this.f23802f;
    }

    /* access modifiers changed from: package-private */
    public t.f p() {
        return this.f23819w;
    }

    /* access modifiers changed from: package-private */
    public Bitmap q() {
        return this.f23813q;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc A[Catch:{ all -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap r() {
        /*
            r6 = this;
            int r0 = r6.f23808l
            boolean r0 = gl.p.a(r0)
            if (r0 == 0) goto L_0x0031
            gl.d r0 = r6.f23804h
            java.lang.String r1 = r6.f23806j
            android.graphics.Bitmap r0 = r0.i(r1)
            if (r0 == 0) goto L_0x0032
            gl.a0 r1 = r6.f23805i
            r1.d()
            gl.t$e r1 = gl.t.e.MEMORY
            r6.f23815s = r1
            gl.t r1 = r6.f23802f
            boolean r1 = r1.f23907m
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            gl.w r3 = r6.f23807k
            java.lang.String r3 = r3.d()
            java.lang.String r4 = "from cache"
            gl.e0.v(r1, r2, r3, r4)
        L_0x0030:
            return r0
        L_0x0031:
            r0 = 0
        L_0x0032:
            gl.w r1 = r6.f23807k
            int r2 = r6.f23818v
            if (r2 != 0) goto L_0x003d
            gl.q r2 = gl.q.OFFLINE
            int r2 = r2.f23889e
            goto L_0x003f
        L_0x003d:
            int r2 = r6.f23809m
        L_0x003f:
            r1.f23944c = r2
            gl.y r2 = r6.f23810n
            int r3 = r6.f23809m
            gl.y$a r1 = r2.f(r1, r3)
            if (r1 == 0) goto L_0x0071
            gl.t$e r0 = r1.c()
            r6.f23815s = r0
            int r0 = r1.b()
            r6.f23817u = r0
            android.graphics.Bitmap r0 = r1.a()
            if (r0 != 0) goto L_0x0071
            java.io.InputStream r0 = r1.d()
            gl.w r1 = r6.f23807k     // Catch:{ all -> 0x006c }
            android.graphics.Bitmap r1 = e(r0, r1)     // Catch:{ all -> 0x006c }
            gl.e0.e(r0)
            r0 = r1
            goto L_0x0071
        L_0x006c:
            r1 = move-exception
            gl.e0.e(r0)
            throw r1
        L_0x0071:
            if (r0 == 0) goto L_0x00f4
            gl.t r1 = r6.f23802f
            boolean r1 = r1.f23907m
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            gl.w r3 = r6.f23807k
            java.lang.String r3 = r3.d()
            gl.e0.u(r1, r2, r3)
        L_0x0086:
            gl.a0 r1 = r6.f23805i
            r1.b(r0)
            gl.w r1 = r6.f23807k
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x0097
            int r1 = r6.f23817u
            if (r1 == 0) goto L_0x00f4
        L_0x0097:
            java.lang.Object r1 = f23798x
            monitor-enter(r1)
            gl.w r2 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x00a9
            int r2 = r6.f23817u     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00c4
            goto L_0x00a9
        L_0x00a7:
            r0 = move-exception
            goto L_0x00f2
        L_0x00a9:
            gl.w r2 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            int r3 = r6.f23817u     // Catch:{ all -> 0x00a7 }
            android.graphics.Bitmap r0 = w(r2, r0, r3)     // Catch:{ all -> 0x00a7 }
            gl.t r2 = r6.f23802f     // Catch:{ all -> 0x00a7 }
            boolean r2 = r2.f23907m     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00c4
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            gl.w r4 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x00a7 }
            gl.e0.u(r2, r3, r4)     // Catch:{ all -> 0x00a7 }
        L_0x00c4:
            gl.w r2 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00e9
            gl.w r2 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            java.util.List r2 = r2.f23948g     // Catch:{ all -> 0x00a7 }
            android.graphics.Bitmap r0 = a(r2, r0)     // Catch:{ all -> 0x00a7 }
            gl.t r2 = r6.f23802f     // Catch:{ all -> 0x00a7 }
            boolean r2 = r2.f23907m     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00e9
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            gl.w r4 = r6.f23807k     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = "from custom transformations"
            gl.e0.v(r2, r3, r4, r5)     // Catch:{ all -> 0x00a7 }
        L_0x00e9:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00f4
            gl.a0 r1 = r6.f23805i
            r1.c(r0)
            goto L_0x00f4
        L_0x00f2:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r0
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.c.r():android.graphics.Bitmap");
    }

    public void run() {
        i iVar;
        i iVar2;
        try {
            x(this.f23807k);
            if (this.f23802f.f23907m) {
                e0.u("Hunter", "executing", e0.l(this));
            }
            Bitmap r10 = r();
            this.f23813q = r10;
            if (r10 == null) {
                this.f23803g.e(this);
            } else {
                this.f23803g.d(this);
            }
        } catch (j.b e10) {
            if (!e10.f23859e || e10.f23860f != 504) {
                this.f23816t = e10;
            }
            iVar2 = this.f23803g;
        } catch (r.a e11) {
            this.f23816t = e11;
            iVar = this.f23803g;
            iVar.g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (IOException e12) {
            this.f23816t = e12;
            iVar = this.f23803g;
            iVar.g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (OutOfMemoryError e13) {
            StringWriter stringWriter = new StringWriter();
            this.f23805i.a().a(new PrintWriter(stringWriter));
            this.f23816t = new RuntimeException(stringWriter.toString(), e13);
            iVar2 = this.f23803g;
        } catch (Exception e14) {
            this.f23816t = e14;
            iVar2 = this.f23803g;
        } catch (Throwable th2) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th2;
        }
        Thread.currentThread().setName("Picasso-Idle");
        iVar2.e(this);
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        Future future = this.f23814r;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    public boolean u(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f23818v;
        if (i10 <= 0) {
            return false;
        }
        this.f23818v = i10 - 1;
        return this.f23810n.h(z10, networkInfo);
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.f23810n.i();
    }
}
