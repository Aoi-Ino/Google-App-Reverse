package cn;

import cm.t;
import cm.u;
import cn.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import pl.x;

public final class f implements Closeable {
    /* access modifiers changed from: private */
    public static final m G;
    public static final c H = new c((cm.g) null);
    private long A;
    /* access modifiers changed from: private */
    public long B;
    private final Socket C;
    private final j D;
    private final e E;
    /* access modifiers changed from: private */
    public final Set F;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f20291e;

    /* renamed from: f  reason: collision with root package name */
    private final d f20292f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f20293g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    private final String f20294h;

    /* renamed from: i  reason: collision with root package name */
    private int f20295i;

    /* renamed from: j  reason: collision with root package name */
    private int f20296j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f20297k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final ym.e f20298l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final ym.d f20299m;

    /* renamed from: n  reason: collision with root package name */
    private final ym.d f20300n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ym.d f20301o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final l f20302p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f20303q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public long f20304r;

    /* renamed from: s  reason: collision with root package name */
    private long f20305s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public long f20306t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public long f20307u;

    /* renamed from: v  reason: collision with root package name */
    private long f20308v;

    /* renamed from: w  reason: collision with root package name */
    private final m f20309w;

    /* renamed from: x  reason: collision with root package name */
    private m f20310x;

    /* renamed from: y  reason: collision with root package name */
    private long f20311y;

    /* renamed from: z  reason: collision with root package name */
    private long f20312z;

    public static final class a extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20313e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f20314f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f20315g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j10) {
            super(str2, false, 2, (cm.g) null);
            this.f20313e = str;
            this.f20314f = fVar;
            this.f20315g = j10;
        }

        public long f() {
            boolean z10;
            synchronized (this.f20314f) {
                if (this.f20314f.f20304r < this.f20314f.f20303q) {
                    z10 = true;
                } else {
                    f fVar = this.f20314f;
                    fVar.f20303q = fVar.f20303q + 1;
                    z10 = false;
                }
            }
            f fVar2 = this.f20314f;
            if (z10) {
                fVar2.j0((IOException) null);
                return -1;
            }
            fVar2.c1(false, 1, 0);
            return this.f20315g;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f20316a;

        /* renamed from: b  reason: collision with root package name */
        public String f20317b;

        /* renamed from: c  reason: collision with root package name */
        public in.g f20318c;

        /* renamed from: d  reason: collision with root package name */
        public in.f f20319d;

        /* renamed from: e  reason: collision with root package name */
        private d f20320e = d.f20325a;

        /* renamed from: f  reason: collision with root package name */
        private l f20321f = l.f20455a;

        /* renamed from: g  reason: collision with root package name */
        private int f20322g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f20323h;

        /* renamed from: i  reason: collision with root package name */
        private final ym.e f20324i;

        public b(boolean z10, ym.e eVar) {
            cm.l.f(eVar, "taskRunner");
            this.f20323h = z10;
            this.f20324i = eVar;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f20323h;
        }

        public final String c() {
            String str = this.f20317b;
            if (str == null) {
                cm.l.v("connectionName");
            }
            return str;
        }

        public final d d() {
            return this.f20320e;
        }

        public final int e() {
            return this.f20322g;
        }

        public final l f() {
            return this.f20321f;
        }

        public final in.f g() {
            in.f fVar = this.f20319d;
            if (fVar == null) {
                cm.l.v("sink");
            }
            return fVar;
        }

        public final Socket h() {
            Socket socket = this.f20316a;
            if (socket == null) {
                cm.l.v("socket");
            }
            return socket;
        }

        public final in.g i() {
            in.g gVar = this.f20318c;
            if (gVar == null) {
                cm.l.v("source");
            }
            return gVar;
        }

        public final ym.e j() {
            return this.f20324i;
        }

        public final b k(d dVar) {
            cm.l.f(dVar, "listener");
            this.f20320e = dVar;
            return this;
        }

        public final b l(int i10) {
            this.f20322g = i10;
            return this;
        }

        public final b m(Socket socket, String str, in.g gVar, in.f fVar) {
            StringBuilder sb2;
            cm.l.f(socket, "socket");
            cm.l.f(str, "peerName");
            cm.l.f(gVar, "source");
            cm.l.f(fVar, "sink");
            this.f20316a = socket;
            if (this.f20323h) {
                sb2 = new StringBuilder();
                sb2.append(vm.b.f32405i);
                sb2.append(' ');
            } else {
                sb2 = new StringBuilder();
                sb2.append("MockWebServer ");
            }
            sb2.append(str);
            this.f20317b = sb2.toString();
            this.f20318c = gVar;
            this.f20319d = fVar;
            return this;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(cm.g gVar) {
            this();
        }

        public final m a() {
            return f.G;
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20325a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f20326b = new b((cm.g) null);

        public static final class a extends d {
            a() {
            }

            public void c(i iVar) {
                cm.l.f(iVar, "stream");
                iVar.d(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(cm.g gVar) {
                this();
            }
        }

        public void b(f fVar, m mVar) {
            cm.l.f(fVar, "connection");
            cm.l.f(mVar, "settings");
        }

        public abstract void c(i iVar);
    }

    public final class e implements h.c, bm.a {

        /* renamed from: e  reason: collision with root package name */
        private final h f20327e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f20328f;

        public static final class a extends ym.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f20329e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f20330f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ e f20331g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ u f20332h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f20333i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ m f20334j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ t f20335k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ u f20336l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, e eVar, u uVar, boolean z12, m mVar, t tVar, u uVar2) {
                super(str2, z11);
                this.f20329e = str;
                this.f20330f = z10;
                this.f20331g = eVar;
                this.f20332h = uVar;
                this.f20333i = z12;
                this.f20334j = mVar;
                this.f20335k = tVar;
                this.f20336l = uVar2;
            }

            public long f() {
                this.f20331g.f20328f.C0().b(this.f20331g.f20328f, (m) this.f20332h.f20234e);
                return -1;
            }
        }

        public static final class b extends ym.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f20337e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f20338f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ i f20339g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f20340h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ i f20341i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f20342j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ List f20343k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ boolean f20344l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, i iVar, e eVar, i iVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f20337e = str;
                this.f20338f = z10;
                this.f20339g = iVar;
                this.f20340h = eVar;
                this.f20341i = iVar2;
                this.f20342j = i10;
                this.f20343k = list;
                this.f20344l = z12;
            }

            public long f() {
                try {
                    this.f20340h.f20328f.C0().c(this.f20339g);
                    return -1;
                } catch (IOException e10) {
                    dn.j g10 = dn.j.f22941c.g();
                    g10.j("Http2Connection.Listener failure for " + this.f20340h.f20328f.A0(), 4, e10);
                    try {
                        this.f20339g.d(b.PROTOCOL_ERROR, e10);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        public static final class c extends ym.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f20345e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f20346f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ e f20347g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f20348h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f20349i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, e eVar, int i10, int i11) {
                super(str2, z11);
                this.f20345e = str;
                this.f20346f = z10;
                this.f20347g = eVar;
                this.f20348h = i10;
                this.f20349i = i11;
            }

            public long f() {
                this.f20347g.f20328f.c1(true, this.f20348h, this.f20349i);
                return -1;
            }
        }

        public static final class d extends ym.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f20350e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f20351f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ e f20352g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ boolean f20353h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ m f20354i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z10, String str2, boolean z11, e eVar, boolean z12, m mVar) {
                super(str2, z11);
                this.f20350e = str;
                this.f20351f = z10;
                this.f20352g = eVar;
                this.f20353h = z12;
                this.f20354i = mVar;
            }

            public long f() {
                this.f20352g.p(this.f20353h, this.f20354i);
                return -1;
            }
        }

        public e(f fVar, h hVar) {
            cm.l.f(hVar, "reader");
            this.f20328f = fVar;
            this.f20327e = hVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            q();
            return x.f30437a;
        }

        public void b() {
        }

        public void c(boolean z10, m mVar) {
            cm.l.f(mVar, "settings");
            String str = this.f20328f.A0() + " applyAndAckSettings";
            this.f20328f.f20299m.i(new d(str, true, str, true, this, z10, mVar), 0);
        }

        public void e(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (this.f20328f) {
                    if (i10 == 1) {
                        f fVar = this.f20328f;
                        fVar.f20304r = fVar.f20304r + 1;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            f fVar2 = this.f20328f;
                            fVar2.f20307u = fVar2.f20307u + 1;
                            f fVar3 = this.f20328f;
                            if (fVar3 != null) {
                                fVar3.notifyAll();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        try {
                            x xVar = x.f30437a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        f fVar4 = this.f20328f;
                        fVar4.f20306t = fVar4.f20306t + 1;
                    }
                }
                return;
            }
            String str = this.f20328f.A0() + " ping";
            this.f20328f.f20299m.i(new c(str, true, str, true, this, i10, i11), 0);
        }

        public void f(boolean z10, int i10, in.g gVar, int i11) {
            cm.l.f(gVar, "source");
            if (this.f20328f.R0(i10)) {
                this.f20328f.N0(i10, gVar, i11, z10);
                return;
            }
            i G0 = this.f20328f.G0(i10);
            if (G0 == null) {
                this.f20328f.e1(i10, b.PROTOCOL_ERROR);
                long j10 = (long) i11;
                this.f20328f.Z0(j10);
                gVar.skip(j10);
                return;
            }
            G0.w(gVar, i11);
            if (z10) {
                G0.x(vm.b.f32398b, true);
            }
        }

        public void i(int i10, int i11, int i12, boolean z10) {
        }

        public void j(boolean z10, int i10, int i11, List list) {
            boolean z11 = z10;
            int i12 = i10;
            List list2 = list;
            cm.l.f(list2, "headerBlock");
            if (this.f20328f.R0(i12)) {
                this.f20328f.O0(i12, list2, z11);
                return;
            }
            synchronized (this.f20328f) {
                i G0 = this.f20328f.G0(i12);
                if (G0 != null) {
                    x xVar = x.f30437a;
                    G0.x(vm.b.L(list), z11);
                } else if (!this.f20328f.f20297k) {
                    if (i12 > this.f20328f.B0()) {
                        if (i12 % 2 != this.f20328f.D0() % 2) {
                            i iVar = new i(i10, this.f20328f, false, z10, vm.b.L(list));
                            this.f20328f.U0(i12);
                            this.f20328f.H0().put(Integer.valueOf(i10), iVar);
                            String str = this.f20328f.A0() + '[' + i12 + "] onStream";
                            this.f20328f.f20298l.i().i(new b(str, true, str, true, iVar, this, G0, i10, list, z10), 0);
                        }
                    }
                }
            }
        }

        public void k(int i10, b bVar) {
            cm.l.f(bVar, "errorCode");
            if (this.f20328f.R0(i10)) {
                this.f20328f.Q0(i10, bVar);
                return;
            }
            i S0 = this.f20328f.S0(i10);
            if (S0 != null) {
                S0.y(bVar);
            }
        }

        public void l(int i10, b bVar, in.h hVar) {
            int i11;
            i[] iVarArr;
            cm.l.f(bVar, "errorCode");
            cm.l.f(hVar, "debugData");
            hVar.q();
            synchronized (this.f20328f) {
                Object[] array = this.f20328f.H0().values().toArray(new i[0]);
                if (array != null) {
                    iVarArr = (i[]) array;
                    this.f20328f.f20297k = true;
                    x xVar = x.f30437a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (i iVar : iVarArr) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(b.REFUSED_STREAM);
                    this.f20328f.S0(iVar.j());
                }
            }
        }

        public void m(int i10, long j10) {
            Object obj;
            if (i10 == 0) {
                Object obj2 = this.f20328f;
                synchronized (obj2) {
                    f fVar = this.f20328f;
                    fVar.B = fVar.I0() + j10;
                    f fVar2 = this.f20328f;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        x xVar = x.f30437a;
                        obj = obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
            } else {
                i G0 = this.f20328f.G0(i10);
                if (G0 != null) {
                    synchronized (G0) {
                        G0.a(j10);
                        x xVar2 = x.f30437a;
                        obj = G0;
                    }
                } else {
                    return;
                }
            }
        }

        public void n(int i10, int i11, List list) {
            cm.l.f(list, "requestHeaders");
            this.f20328f.P0(i11, list);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void p(boolean r22, cn.m r23) {
            /*
                r21 = this;
                r12 = r21
                r0 = r23
                java.lang.String r1 = "settings"
                cm.l.f(r0, r1)
                cm.t r13 = new cm.t
                r13.<init>()
                cm.u r14 = new cm.u
                r14.<init>()
                cm.u r15 = new cm.u
                r15.<init>()
                cn.f r1 = r12.f20328f
                cn.j r16 = r1.J0()
                monitor-enter(r16)
                cn.f r11 = r12.f20328f     // Catch:{ all -> 0x00db }
                monitor-enter(r11)     // Catch:{ all -> 0x00db }
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x0071 }
                cn.m r1 = r1.F0()     // Catch:{ all -> 0x0071 }
                if (r22 == 0) goto L_0x002c
                r2 = r0
                goto L_0x0039
            L_0x002c:
                cn.m r2 = new cn.m     // Catch:{ all -> 0x0071 }
                r2.<init>()     // Catch:{ all -> 0x0071 }
                r2.g(r1)     // Catch:{ all -> 0x0071 }
                r2.g(r0)     // Catch:{ all -> 0x0071 }
                pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x0071 }
            L_0x0039:
                r15.f20234e = r2     // Catch:{ all -> 0x0071 }
                int r2 = r2.c()     // Catch:{ all -> 0x0071 }
                long r2 = (long) r2     // Catch:{ all -> 0x0071 }
                int r1 = r1.c()     // Catch:{ all -> 0x0071 }
                long r4 = (long) r1     // Catch:{ all -> 0x0071 }
                long r2 = r2 - r4
                r13.f20233e = r2     // Catch:{ all -> 0x0071 }
                r9 = 0
                int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                r8 = 0
                if (r1 == 0) goto L_0x007e
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x0071 }
                java.util.Map r1 = r1.H0()     // Catch:{ all -> 0x0071 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
                if (r1 == 0) goto L_0x005c
                goto L_0x007e
            L_0x005c:
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x0071 }
                java.util.Map r1 = r1.H0()     // Catch:{ all -> 0x0071 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0071 }
                cn.i[] r2 = new cn.i[r8]     // Catch:{ all -> 0x0071 }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0071 }
                if (r1 == 0) goto L_0x0076
                cn.i[] r1 = (cn.i[]) r1     // Catch:{ all -> 0x0071 }
                goto L_0x007f
            L_0x0071:
                r0 = move-exception
                r20 = r11
                goto L_0x010a
            L_0x0076:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x0071 }
                throw r0     // Catch:{ all -> 0x0071 }
            L_0x007e:
                r1 = 0
            L_0x007f:
                r14.f20234e = r1     // Catch:{ all -> 0x0071 }
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x0071 }
                java.lang.Object r2 = r15.f20234e     // Catch:{ all -> 0x0071 }
                cn.m r2 = (cn.m) r2     // Catch:{ all -> 0x0071 }
                r1.V0(r2)     // Catch:{ all -> 0x0071 }
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x0071 }
                ym.d r7 = r1.f20301o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r1.<init>()     // Catch:{ all -> 0x0071 }
                cn.f r2 = r12.f20328f     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = r2.A0()     // Catch:{ all -> 0x0071 }
                r1.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x0071 }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0071 }
                r5 = 1
                cn.f$e$a r6 = new cn.f$e$a     // Catch:{ all -> 0x0071 }
                r1 = r6
                r2 = r4
                r3 = r5
                r17 = r6
                r6 = r21
                r18 = r7
                r7 = r15
                r19 = r8
                r8 = r22
                r9 = r23
                r10 = r13
                r20 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0109 }
                r3 = r17
                r2 = r18
                r0 = 0
                r2.i(r3, r0)     // Catch:{ all -> 0x0109 }
                pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0109 }
                monitor-exit(r20)     // Catch:{ all -> 0x00db }
                cn.f r0 = r12.f20328f     // Catch:{ IOException -> 0x00dd }
                cn.j r0 = r0.J0()     // Catch:{ IOException -> 0x00dd }
                java.lang.Object r1 = r15.f20234e     // Catch:{ IOException -> 0x00dd }
                cn.m r1 = (cn.m) r1     // Catch:{ IOException -> 0x00dd }
                r0.c(r1)     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e3
            L_0x00db:
                r0 = move-exception
                goto L_0x010c
            L_0x00dd:
                r0 = move-exception
                cn.f r1 = r12.f20328f     // Catch:{ all -> 0x00db }
                r1.j0(r0)     // Catch:{ all -> 0x00db }
            L_0x00e3:
                pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x00db }
                monitor-exit(r16)
                java.lang.Object r0 = r14.f20234e
                r1 = r0
                cn.i[] r1 = (cn.i[]) r1
                if (r1 == 0) goto L_0x0108
                cn.i[] r0 = (cn.i[]) r0
                cm.l.c(r0)
                int r1 = r0.length
                r8 = r19
            L_0x00f5:
                if (r8 >= r1) goto L_0x0108
                r2 = r0[r8]
                monitor-enter(r2)
                long r3 = r13.f20233e     // Catch:{ all -> 0x0105 }
                r2.a(r3)     // Catch:{ all -> 0x0105 }
                pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x0105 }
                monitor-exit(r2)
                int r8 = r8 + 1
                goto L_0x00f5
            L_0x0105:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0108:
                return
            L_0x0109:
                r0 = move-exception
            L_0x010a:
                monitor-exit(r20)     // Catch:{ all -> 0x00db }
                throw r0     // Catch:{ all -> 0x00db }
            L_0x010c:
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.f.e.p(boolean, cn.m):void");
        }

        public void q() {
            b bVar;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                this.f20327e.f(this);
                while (this.f20327e.e(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    this.f20328f.i0(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        this.f20328f.i0(bVar3, bVar3, e);
                        vm.b.j(this.f20327e);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f20328f.i0(bVar, bVar2, e);
                        vm.b.j(this.f20327e);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                this.f20328f.i0(bVar32, bVar32, e);
                vm.b.j(this.f20327e);
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f20328f.i0(bVar, bVar2, e);
                vm.b.j(this.f20327e);
                throw th;
            }
            vm.b.j(this.f20327e);
        }
    }

    /* renamed from: cn.f$f  reason: collision with other inner class name */
    public static final class C0268f extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20355e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20356f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20357g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20358h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ in.e f20359i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f20360j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f20361k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0268f(String str, boolean z10, String str2, boolean z11, f fVar, int i10, in.e eVar, int i11, boolean z12) {
            super(str2, z11);
            this.f20355e = str;
            this.f20356f = z10;
            this.f20357g = fVar;
            this.f20358h = i10;
            this.f20359i = eVar;
            this.f20360j = i11;
            this.f20361k = z12;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                cn.f r0 = r5.f20357g     // Catch:{ IOException -> 0x003e }
                cn.l r0 = r0.f20302p     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f20358h     // Catch:{ IOException -> 0x003e }
                in.e r2 = r5.f20359i     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f20360j     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f20361k     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.c(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                cn.f r1 = r5.f20357g     // Catch:{ IOException -> 0x003e }
                cn.j r1 = r1.J0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f20358h     // Catch:{ IOException -> 0x003e }
                cn.b r3 = cn.b.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.B(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f20361k     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                cn.f r0 = r5.f20357g     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                cn.f r1 = r5.f20357g     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.F     // Catch:{ all -> 0x003b }
                int r2 = r5.f20358h     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.f.C0268f.f():long");
        }
    }

    public static final class g extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20362e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20363f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20364g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20365h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f20366i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f20367j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list, boolean z12) {
            super(str2, z11);
            this.f20362e = str;
            this.f20363f = z10;
            this.f20364g = fVar;
            this.f20365h = i10;
            this.f20366i = list;
            this.f20367j = z12;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r4 = this;
                cn.f r0 = r4.f20364g
                cn.l r0 = r0.f20302p
                int r1 = r4.f20365h
                java.util.List r2 = r4.f20366i
                boolean r3 = r4.f20367j
                boolean r0 = r0.b(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                cn.f r1 = r4.f20364g     // Catch:{ IOException -> 0x003c }
                cn.j r1 = r1.J0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f20365h     // Catch:{ IOException -> 0x003c }
                cn.b r3 = cn.b.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.B(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f20367j     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                cn.f r0 = r4.f20364g     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                cn.f r1 = r4.f20364g     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.F     // Catch:{ all -> 0x0039 }
                int r2 = r4.f20365h     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.f.g.f():long");
        }
    }

    public static final class h extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20368e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20369f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20370g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20371h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f20372i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, String str2, boolean z11, f fVar, int i10, List list) {
            super(str2, z11);
            this.f20368e = str;
            this.f20369f = z10;
            this.f20370g = fVar;
            this.f20371h = i10;
            this.f20372i = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r3 = this;
                cn.f r0 = r3.f20370g
                cn.l r0 = r0.f20302p
                int r1 = r3.f20371h
                java.util.List r2 = r3.f20372i
                boolean r0 = r0.a(r1, r2)
                if (r0 == 0) goto L_0x0034
                cn.f r0 = r3.f20370g     // Catch:{ IOException -> 0x0034 }
                cn.j r0 = r0.J0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f20371h     // Catch:{ IOException -> 0x0034 }
                cn.b r2 = cn.b.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.B(r1, r2)     // Catch:{ IOException -> 0x0034 }
                cn.f r0 = r3.f20370g     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                cn.f r1 = r3.f20370g     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.F     // Catch:{ all -> 0x0031 }
                int r2 = r3.f20371h     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.f.h.f():long");
        }
    }

    public static final class i extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20373e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20374f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20375g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20376h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f20377i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, String str2, boolean z11, f fVar, int i10, b bVar) {
            super(str2, z11);
            this.f20373e = str;
            this.f20374f = z10;
            this.f20375g = fVar;
            this.f20376h = i10;
            this.f20377i = bVar;
        }

        public long f() {
            this.f20375g.f20302p.d(this.f20376h, this.f20377i);
            synchronized (this.f20375g) {
                this.f20375g.F.remove(Integer.valueOf(this.f20376h));
                x xVar = x.f30437a;
            }
            return -1;
        }
    }

    public static final class j extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20378e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20379f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20380g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z10, String str2, boolean z11, f fVar) {
            super(str2, z11);
            this.f20378e = str;
            this.f20379f = z10;
            this.f20380g = fVar;
        }

        public long f() {
            this.f20380g.c1(false, 2, 0);
            return -1;
        }
    }

    public static final class k extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20381e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20382f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20383g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20384h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f20385i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, String str2, boolean z11, f fVar, int i10, b bVar) {
            super(str2, z11);
            this.f20381e = str;
            this.f20382f = z10;
            this.f20383g = fVar;
            this.f20384h = i10;
            this.f20385i = bVar;
        }

        public long f() {
            try {
                this.f20383g.d1(this.f20384h, this.f20385i);
                return -1;
            } catch (IOException e10) {
                this.f20383g.j0(e10);
                return -1;
            }
        }
    }

    public static final class l extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f20386e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f20387f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f20388g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f20389h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f20390i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, String str2, boolean z11, f fVar, int i10, long j10) {
            super(str2, z11);
            this.f20386e = str;
            this.f20387f = z10;
            this.f20388g = fVar;
            this.f20389h = i10;
            this.f20390i = j10;
        }

        public long f() {
            try {
                this.f20388g.J0().H(this.f20389h, this.f20390i);
                return -1;
            } catch (IOException e10) {
                this.f20388g.j0(e10);
                return -1;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        G = mVar;
    }

    public f(b bVar) {
        cm.l.f(bVar, "builder");
        boolean b10 = bVar.b();
        this.f20291e = b10;
        this.f20292f = bVar.d();
        String c10 = bVar.c();
        this.f20294h = c10;
        this.f20296j = bVar.b() ? 3 : 2;
        ym.e j10 = bVar.j();
        this.f20298l = j10;
        ym.d i10 = j10.i();
        this.f20299m = i10;
        this.f20300n = j10.i();
        this.f20301o = j10.i();
        this.f20302p = bVar.f();
        m mVar = new m();
        if (bVar.b()) {
            mVar.h(7, 16777216);
        }
        x xVar = x.f30437a;
        this.f20309w = mVar;
        m mVar2 = G;
        this.f20310x = mVar2;
        this.B = (long) mVar2.c();
        this.C = bVar.h();
        this.D = new j(bVar.g(), b10);
        this.E = new e(this, new h(bVar.i(), b10));
        this.F = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.e());
            String str = c10 + " ping";
            i10.i(new a(str, str, this, nanos), nanos);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[Catch:{ all -> 0x0014, all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final cn.i L0(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            cn.j r7 = r10.D
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0060 }
            int r0 = r10.f20296j     // Catch:{ all -> 0x0014 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0017
            cn.b r0 = cn.b.REFUSED_STREAM     // Catch:{ all -> 0x0014 }
            r10.W0(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0017
        L_0x0014:
            r11 = move-exception
            goto L_0x0087
        L_0x0017:
            boolean r0 = r10.f20297k     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0081
            int r8 = r10.f20296j     // Catch:{ all -> 0x0014 }
            int r0 = r8 + 2
            r10.f20296j = r0     // Catch:{ all -> 0x0014 }
            cn.i r9 = new cn.i     // Catch:{ all -> 0x0014 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0014 }
            r0 = 1
            if (r13 == 0) goto L_0x0045
            long r1 = r10.A     // Catch:{ all -> 0x0014 }
            long r3 = r10.B     // Catch:{ all -> 0x0014 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0045
            long r1 = r9.r()     // Catch:{ all -> 0x0014 }
            long r3 = r9.q()     // Catch:{ all -> 0x0014 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r13 = 0
            goto L_0x0046
        L_0x0045:
            r13 = r0
        L_0x0046:
            boolean r1 = r9.u()     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x0055
            java.util.Map r1 = r10.f20293g     // Catch:{ all -> 0x0014 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0014 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0014 }
        L_0x0055:
            pl.x r1 = pl.x.f30437a     // Catch:{ all -> 0x0014 }
            monitor-exit(r10)     // Catch:{ all -> 0x0060 }
            if (r11 != 0) goto L_0x0062
            cn.j r11 = r10.D     // Catch:{ all -> 0x0060 }
            r11.n(r6, r8, r12)     // Catch:{ all -> 0x0060 }
            goto L_0x006c
        L_0x0060:
            r11 = move-exception
            goto L_0x0089
        L_0x0062:
            boolean r1 = r10.f20291e     // Catch:{ all -> 0x0060 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0075
            cn.j r0 = r10.D     // Catch:{ all -> 0x0060 }
            r0.y(r11, r8, r12)     // Catch:{ all -> 0x0060 }
        L_0x006c:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0074
            cn.j r11 = r10.D
            r11.flush()
        L_0x0074:
            return r9
        L_0x0075:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0060 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0060 }
            r12.<init>(r11)     // Catch:{ all -> 0x0060 }
            throw r12     // Catch:{ all -> 0x0060 }
        L_0x0081:
            cn.a r11 = new cn.a     // Catch:{ all -> 0x0014 }
            r11.<init>()     // Catch:{ all -> 0x0014 }
            throw r11     // Catch:{ all -> 0x0014 }
        L_0x0087:
            monitor-exit(r10)     // Catch:{ all -> 0x0060 }
            throw r11     // Catch:{ all -> 0x0060 }
        L_0x0089:
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.f.L0(int, java.util.List, boolean):cn.i");
    }

    public static /* synthetic */ void Y0(f fVar, boolean z10, ym.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = ym.e.f33073h;
        }
        fVar.X0(z10, eVar);
    }

    /* access modifiers changed from: private */
    public final void j0(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        i0(bVar, bVar, iOException);
    }

    public final String A0() {
        return this.f20294h;
    }

    public final int B0() {
        return this.f20295i;
    }

    public final d C0() {
        return this.f20292f;
    }

    public final int D0() {
        return this.f20296j;
    }

    public final m E0() {
        return this.f20309w;
    }

    public final m F0() {
        return this.f20310x;
    }

    public final synchronized i G0(int i10) {
        return (i) this.f20293g.get(Integer.valueOf(i10));
    }

    public final Map H0() {
        return this.f20293g;
    }

    public final long I0() {
        return this.B;
    }

    public final j J0() {
        return this.D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean K0(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f20297k     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f20306t     // Catch:{ all -> 0x0018 }
            long r4 = r6.f20305s     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.f20308v     // Catch:{ all -> 0x0018 }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.f.K0(long):boolean");
    }

    public final i M0(List list, boolean z10) {
        cm.l.f(list, "requestHeaders");
        return L0(0, list, z10);
    }

    public final void N0(int i10, in.g gVar, int i11, boolean z10) {
        cm.l.f(gVar, "source");
        in.e eVar = new in.e();
        long j10 = (long) i11;
        gVar.p0(j10);
        gVar.read(eVar, j10);
        String str = this.f20294h + '[' + i10 + "] onData";
        this.f20300n.i(new C0268f(str, true, str, true, this, i10, eVar, i11, z10), 0);
    }

    public final void O0(int i10, List list, boolean z10) {
        cm.l.f(list, "requestHeaders");
        String str = this.f20294h + '[' + i10 + "] onHeaders";
        this.f20300n.i(new g(str, true, str, true, this, i10, list, z10), 0);
    }

    public final void P0(int i10, List list) {
        cm.l.f(list, "requestHeaders");
        synchronized (this) {
            if (this.F.contains(Integer.valueOf(i10))) {
                e1(i10, b.PROTOCOL_ERROR);
                return;
            }
            this.F.add(Integer.valueOf(i10));
            String str = this.f20294h + '[' + i10 + "] onRequest";
            this.f20300n.i(new h(str, true, str, true, this, i10, list), 0);
        }
    }

    public final void Q0(int i10, b bVar) {
        cm.l.f(bVar, "errorCode");
        String str = this.f20294h + '[' + i10 + "] onReset";
        this.f20300n.i(new i(str, true, str, true, this, i10, bVar), 0);
    }

    public final boolean R0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized i S0(int i10) {
        i iVar;
        iVar = (i) this.f20293g.remove(Integer.valueOf(i10));
        notifyAll();
        return iVar;
    }

    public final void T0() {
        synchronized (this) {
            long j10 = this.f20306t;
            long j11 = this.f20305s;
            if (j10 >= j11) {
                this.f20305s = j11 + 1;
                this.f20308v = System.nanoTime() + ((long) 1000000000);
                x xVar = x.f30437a;
                String str = this.f20294h + " ping";
                this.f20299m.i(new j(str, true, str, true, this), 0);
            }
        }
    }

    public final void U0(int i10) {
        this.f20295i = i10;
    }

    public final void V0(m mVar) {
        cm.l.f(mVar, "<set-?>");
        this.f20310x = mVar;
    }

    public final void W0(b bVar) {
        cm.l.f(bVar, "statusCode");
        synchronized (this.D) {
            synchronized (this) {
                if (!this.f20297k) {
                    this.f20297k = true;
                    int i10 = this.f20295i;
                    x xVar = x.f30437a;
                    this.D.l(i10, bVar, vm.b.f32397a);
                }
            }
        }
    }

    public final void X0(boolean z10, ym.e eVar) {
        cm.l.f(eVar, "taskRunner");
        if (z10) {
            this.D.e();
            this.D.E(this.f20309w);
            int c10 = this.f20309w.c();
            if (c10 != 65535) {
                this.D.H(0, (long) (c10 - 65535));
            }
        }
        ym.d i10 = eVar.i();
        String str = this.f20294h;
        i10.i(new ym.c(this.E, str, true, str, true), 0);
    }

    public final synchronized void Z0(long j10) {
        long j11 = this.f20311y + j10;
        this.f20311y = j11;
        long j12 = j11 - this.f20312z;
        if (j12 >= ((long) (this.f20309w.c() / 2))) {
            f1(0, j12);
            this.f20312z += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.D.o());
        r6 = (long) r2;
        r8.A += r6;
        r4 = pl.x.f30437a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a1(int r9, boolean r10, in.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            cn.j r12 = r8.D
            r12.f(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.A     // Catch:{ InterruptedException -> 0x005d }
            long r6 = r8.B     // Catch:{ InterruptedException -> 0x005d }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0034
            java.util.Map r2 = r8.f20293g     // Catch:{ InterruptedException -> 0x005d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005d }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005d }
            if (r2 == 0) goto L_0x002c
            r8.wait()     // Catch:{ InterruptedException -> 0x005d }
            goto L_0x0012
        L_0x002a:
            r9 = move-exception
            goto L_0x006a
        L_0x002c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005d }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005d }
            throw r9     // Catch:{ InterruptedException -> 0x005d }
        L_0x0034:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002a }
            int r2 = (int) r4     // Catch:{ all -> 0x002a }
            cn.j r4 = r8.D     // Catch:{ all -> 0x002a }
            int r4 = r4.o()     // Catch:{ all -> 0x002a }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002a }
            long r4 = r8.A     // Catch:{ all -> 0x002a }
            long r6 = (long) r2     // Catch:{ all -> 0x002a }
            long r4 = r4 + r6
            r8.A = r4     // Catch:{ all -> 0x002a }
            pl.x r4 = pl.x.f30437a     // Catch:{ all -> 0x002a }
            monitor-exit(r8)
            long r12 = r12 - r6
            cn.j r4 = r8.D
            if (r10 == 0) goto L_0x0058
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0058:
            r5 = r3
        L_0x0059:
            r4.f(r5, r9, r11, r2)
            goto L_0x000d
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r9.interrupt()     // Catch:{ all -> 0x002a }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.f.a1(int, boolean, in.e, long):void");
    }

    public final void b1(int i10, boolean z10, List list) {
        cm.l.f(list, "alternating");
        this.D.n(z10, i10, list);
    }

    public final void c1(boolean z10, int i10, int i11) {
        try {
            this.D.s(z10, i10, i11);
        } catch (IOException e10) {
            j0(e10);
        }
    }

    public void close() {
        i0(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public final void d1(int i10, b bVar) {
        cm.l.f(bVar, "statusCode");
        this.D.B(i10, bVar);
    }

    public final void e1(int i10, b bVar) {
        cm.l.f(bVar, "errorCode");
        String str = this.f20294h + '[' + i10 + "] writeSynReset";
        this.f20299m.i(new k(str, true, str, true, this, i10, bVar), 0);
    }

    public final void f1(int i10, long j10) {
        String str = this.f20294h + '[' + i10 + "] windowUpdate";
        this.f20299m.i(new l(str, true, str, true, this, i10, j10), 0);
    }

    public final void flush() {
        this.D.flush();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:(2:6|7)|44|(2:24|(5:26|27|28|40|29))|31|32|33|34|35|37) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i0(cn.b r4, cn.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            cm.l.f(r4, r0)
            java.lang.String r0 = "streamCode"
            cm.l.f(r5, r0)
            boolean r0 = vm.b.f32404h
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            cm.l.e(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.W0(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            monitor-enter(r3)
            java.util.Map r4 = r3.f20293g     // Catch:{ all -> 0x0066 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0066 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x0070
            java.util.Map r4 = r3.f20293g     // Catch:{ all -> 0x0066 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0066 }
            cn.i[] r1 = new cn.i[r0]     // Catch:{ all -> 0x0066 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0068
            cn.i[] r4 = (cn.i[]) r4     // Catch:{ all -> 0x0066 }
            java.util.Map r1 = r3.f20293g     // Catch:{ all -> 0x0066 }
            r1.clear()     // Catch:{ all -> 0x0066 }
            goto L_0x0071
        L_0x0066:
            r4 = move-exception
            goto L_0x009b
        L_0x0068:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0066 }
            throw r4     // Catch:{ all -> 0x0066 }
        L_0x0070:
            r4 = 0
        L_0x0071:
            pl.x r1 = pl.x.f30437a     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0081
            int r1 = r4.length
        L_0x0077:
            if (r0 >= r1) goto L_0x0081
            r2 = r4[r0]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0081:
            cn.j r4 = r3.D     // Catch:{ IOException -> 0x0086 }
            r4.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            java.net.Socket r4 = r3.C     // Catch:{ IOException -> 0x008b }
            r4.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            ym.d r4 = r3.f20299m
            r4.n()
            ym.d r4 = r3.f20300n
            r4.n()
            ym.d r4 = r3.f20301o
            r4.n()
            return
        L_0x009b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.f.i0(cn.b, cn.b, java.io.IOException):void");
    }

    public final boolean s0() {
        return this.f20291e;
    }
}
