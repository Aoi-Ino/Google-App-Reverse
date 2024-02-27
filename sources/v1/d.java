package v1;

import android.content.Context;
import android.net.Uri;
import bm.p;
import cm.u;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.g;

public final class d implements d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final d f17291f = new d();

    /* renamed from: g  reason: collision with root package name */
    private static k1 f17292g;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ d0 f17293e = e0.b();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17294a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                x1.c[] r0 = x1.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                x1.c r1 = x1.c.downloads     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                x1.c r1 = x1.c.pictures     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f17294a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.d.a.<clinit>():void");
        }
    }

    static final class b extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        Object f17295f;

        /* renamed from: g  reason: collision with root package name */
        Object f17296g;

        /* renamed from: h  reason: collision with root package name */
        Object f17297h;

        /* renamed from: i  reason: collision with root package name */
        Object f17298i;

        /* renamed from: j  reason: collision with root package name */
        int f17299j;

        /* renamed from: k  reason: collision with root package name */
        boolean f17300k;

        /* renamed from: l  reason: collision with root package name */
        int f17301l;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f17302m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Context f17303n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ x1.d f17304o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f17305p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ x1.b f17306q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f17307r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ u f17308s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ List f17309t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ a f17310u;

        static final class a extends l implements p {

            /* renamed from: f  reason: collision with root package name */
            int f17311f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Context f17312g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f17313h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f17314i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, List list, int i10, tl.d dVar) {
                super(2, dVar);
                this.f17312g = context;
                this.f17313h = list;
                this.f17314i = i10;
            }

            /* renamed from: b */
            public final Object h(d0 d0Var, tl.d dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
            }

            public final tl.d create(Object obj, tl.d dVar) {
                return new a(this.f17312g, this.f17313h, this.f17314i, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.f17311f == 0) {
                    q.b(obj);
                    return d.f17291f.e(this.f17312g, (Uri) this.f17313h.get(this.f17314i));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, x1.d dVar, x1.a aVar, boolean z10, x1.b bVar, int i10, u uVar, List list, a aVar2, tl.d dVar2) {
            super(2, dVar2);
            this.f17303n = context;
            this.f17304o = dVar;
            this.f17305p = z10;
            this.f17306q = bVar;
            this.f17307r = i10;
            this.f17308s = uVar;
            this.f17309t = list;
            this.f17310u = aVar2;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            b bVar = new b(this.f17303n, this.f17304o, (x1.a) null, this.f17305p, this.f17306q, this.f17307r, this.f17308s, this.f17309t, this.f17310u, dVar);
            bVar.f17302m = obj;
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x012e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0157  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r9 = r25
                java.lang.Object r10 = ul.d.c()
                int r0 = r9.f17301l
                r1 = 2
                r2 = 0
                r11 = 1
                if (r0 == 0) goto L_0x0045
                if (r0 == r11) goto L_0x003f
                if (r0 != r1) goto L_0x0037
                boolean r0 = r9.f17300k
                int r1 = r9.f17299j
                java.lang.Object r2 = r9.f17298i
                android.support.v4.media.session.b.a(r2)
                java.lang.Object r2 = r9.f17297h
                x1.d r2 = (x1.d) r2
                java.lang.Object r3 = r9.f17296g
                x1.b r3 = (x1.b) r3
                java.lang.Object r4 = r9.f17295f
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Object r5 = r9.f17302m
                v1.a r5 = (v1.a) r5
                pl.q.b(r26)
                r16 = r0
                r20 = r2
                r18 = r4
                r0 = r26
                goto L_0x0124
            L_0x0037:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x003f:
                pl.q.b(r26)
                r0 = r26
                goto L_0x0069
            L_0x0045:
                pl.q.b(r26)
                java.lang.Object r0 = r9.f17302m
                r3 = r0
                lm.d0 r3 = (lm.d0) r3
                r4 = 0
                r5 = 0
                v1.d$b$a r6 = new v1.d$b$a
                android.content.Context r0 = r9.f17303n
                java.util.List r7 = r9.f17309t
                int r8 = r9.f17307r
                r6.<init>(r0, r7, r8, r2)
                r7 = 3
                r8 = 0
                lm.k0 r0 = lm.g.b(r3, r4, r5, r6, r7, r8)
                r9.f17301l = r11
                java.lang.Object r0 = r0.y(r9)
                if (r0 != r10) goto L_0x0069
                return r10
            L_0x0069:
                java.lang.String r0 = (java.lang.String) r0
                v1.d r3 = v1.d.f17291f
                android.content.Context r13 = r9.f17303n
                x1.d r15 = r9.f17304o
                r16 = 0
                boolean r4 = r9.f17305p
                java.lang.Boolean r17 = kotlin.coroutines.jvm.internal.b.a(r4)
                x1.b r4 = r9.f17306q
                java.util.List r4 = r4.f()
                int r5 = r9.f17307r
                java.lang.Object r4 = r4.get(r5)
                r18 = r4
                java.lang.String r18 = (java.lang.String) r18
                r4 = 0
                java.lang.Boolean r19 = kotlin.coroutines.jvm.internal.b.a(r4)
                r12 = r3
                r14 = r0
                java.io.File r5 = r12.f(r13, r14, r15, r16, r17, r18, r19)
                boolean r6 = r9.f17305p
                if (r6 == 0) goto L_0x00be
                cm.u r6 = r9.f17308s
                android.content.Context r13 = r9.f17303n
                x1.d r15 = r9.f17304o
                r16 = 0
                r17 = 0
                x1.b r7 = r9.f17306q
                java.util.List r7 = r7.f()
                int r8 = r9.f17307r
                java.lang.Object r7 = r7.get(r8)
                r18 = r7
                java.lang.String r18 = (java.lang.String) r18
                java.lang.Boolean r19 = kotlin.coroutines.jvm.internal.b.a(r4)
                r12 = r3
                r14 = r0
                java.io.File r0 = r12.f(r13, r14, r15, r16, r17, r18, r19)
                r6.f20234e = r0
            L_0x00be:
                if (r5 == 0) goto L_0x0162
                v1.a r12 = r9.f17310u
                int r13 = r9.f17307r
                android.content.Context r14 = r9.f17303n
                java.util.List r0 = r9.f17309t
                cm.u r4 = r9.f17308s
                x1.b r15 = r9.f17306q
                x1.d r8 = r9.f17304o
                boolean r7 = r9.f17305p
                w1.b r6 = w1.b.f17826a
                r6.g(r11)
                r12.d(r13)
                java.lang.Object r0 = r0.get(r13)
                r6 = r0
                android.net.Uri r6 = (android.net.Uri) r6
                java.lang.String r5 = r5.getPath()
                java.lang.String r0 = "desFile.path"
                cm.l.e(r5, r0)
                java.lang.Object r0 = r4.f20234e
                java.io.File r0 = (java.io.File) r0
                if (r0 == 0) goto L_0x00f5
                java.lang.String r0 = r0.getPath()
                r16 = r0
                goto L_0x00f7
            L_0x00f5:
                r16 = r2
            L_0x00f7:
                r9.f17302m = r12
                r9.f17295f = r14
                r9.f17296g = r15
                r9.f17297h = r8
                r9.f17298i = r2
                r9.f17299j = r13
                r9.f17300k = r7
                r9.f17301l = r1
                r0 = r3
                r1 = r13
                r2 = r14
                r3 = r6
                r4 = r5
                r5 = r16
                r6 = r15
                r16 = r7
                r7 = r12
                r17 = r8
                r8 = r25
                java.lang.Object r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r0 != r10) goto L_0x011d
                return r10
            L_0x011d:
                r5 = r12
                r1 = r13
                r18 = r14
                r3 = r15
                r20 = r17
            L_0x0124:
                r21 = 0
                a2.f r0 = (a2.f) r0
                boolean r2 = r0.d()
                if (r2 == 0) goto L_0x0157
                v1.d r17 = v1.d.f17291f
                java.lang.String r19 = r0.b()
                java.lang.Boolean r22 = kotlin.coroutines.jvm.internal.b.a(r16)
                java.util.List r2 = r3.f()
                java.lang.Object r2 = r2.get(r1)
                r23 = r2
                java.lang.String r23 = (java.lang.String) r23
                java.lang.Boolean r24 = kotlin.coroutines.jvm.internal.b.a(r11)
                java.io.File unused = r17.f(r18, r19, r20, r21, r22, r23, r24)
                long r2 = r0.c()
                java.lang.String r0 = r0.b()
                r5.c(r1, r2, r0)
                goto L_0x0162
            L_0x0157:
                java.lang.String r0 = r0.a()
                if (r0 != 0) goto L_0x015f
                java.lang.String r0 = "An error has occurred!"
            L_0x015f:
                r5.e(r1, r0)
            L_0x0162:
                pl.x r0 = pl.x.f30437a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f17315f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f17316g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f17317h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Uri f17318i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f17319j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f17320k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ x1.b f17321l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f17322m;

        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f17323a;

            a(a aVar) {
                this.f17323a = aVar;
            }

            public void a(int i10) {
                this.f17323a.a(i10);
            }

            public void b(int i10, float f10) {
                this.f17323a.b(i10, f10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i10, Context context, Uri uri, String str, String str2, x1.b bVar, a aVar, tl.d dVar) {
            super(2, dVar);
            this.f17316g = i10;
            this.f17317h = context;
            this.f17318i = uri;
            this.f17319j = str;
            this.f17320k = str2;
            this.f17321l = bVar;
            this.f17322m = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new c(this.f17316g, this.f17317h, this.f17318i, this.f17319j, this.f17320k, this.f17321l, this.f17322m, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f17315f;
            if (i10 == 0) {
                q.b(obj);
                w1.b bVar = w1.b.f17826a;
                int i11 = this.f17316g;
                Context context = this.f17317h;
                Uri uri = this.f17318i;
                String str = this.f17319j;
                String str2 = this.f17320k;
                x1.b bVar2 = this.f17321l;
                a aVar = new a(this.f17322m);
                this.f17315f = 1;
                obj = bVar.b(i11, context, uri, str, str2, bVar2, aVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    private d() {
    }

    private final void d(Context context, List list, boolean z10, x1.d dVar, x1.a aVar, x1.b bVar, a aVar2) {
        u uVar = new u();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f17292g = g.d(this, (g) null, (f0) null, new b(context, dVar, aVar, z10, bVar, i10, uVar, list, aVar2, (tl.d) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(3:1|2|(4:4|5|6|7)(3:10|11|12))|16|17|(11:19|20|21|22|23|(2:24|(1:26)(1:54))|29|30|31|32|33)|47|(1:49)|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        zl.b.a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            android.content.ContentResolver r6 = r10.getContentResolver()
            java.lang.String r7 = "_data"
            java.lang.String[] r2 = new java.lang.String[]{r7}
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r0 = r6
            r1 = r11
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r0 == 0) goto L_0x002e
            int r1 = r0.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x0037 }
            r0.moveToFirst()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "{\n                val co…lumnIndex)\n\n            }"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r0.close()
            return r1
        L_0x002a:
            r10 = move-exception
            r8 = r0
            goto L_0x009c
        L_0x002e:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x0037 }
            r1.<init>()     // Catch:{ Exception -> 0x0037 }
            throw r1     // Catch:{ Exception -> 0x0037 }
        L_0x0034:
            r10 = move-exception
            goto L_0x009c
        L_0x0036:
            r0 = r8
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch:{ all -> 0x002a }
            java.lang.String r10 = r10.dataDir     // Catch:{ all -> 0x002a }
            r1.append(r10)     // Catch:{ all -> 0x002a }
            java.lang.String r10 = java.io.File.separator     // Catch:{ all -> 0x002a }
            r1.append(r10)     // Catch:{ all -> 0x002a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002a }
            r1.append(r2)     // Catch:{ all -> 0x002a }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x002a }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x002a }
            r1.<init>(r10)     // Catch:{ all -> 0x002a }
            java.io.InputStream r10 = r6.openInputStream(r11)     // Catch:{ all -> 0x002a }
            if (r10 == 0) goto L_0x008d
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x007f }
            r11.<init>(r1)     // Catch:{ all -> 0x007f }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0074 }
        L_0x0069:
            int r3 = r10.read(r2)     // Catch:{ all -> 0x0074 }
            if (r3 <= 0) goto L_0x0076
            r4 = 0
            r11.write(r2, r4, r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0069
        L_0x0074:
            r1 = move-exception
            goto L_0x0081
        L_0x0076:
            pl.x r2 = pl.x.f30437a     // Catch:{ all -> 0x0074 }
            zl.b.a(r11, r8)     // Catch:{ all -> 0x007f }
            zl.b.a(r10, r8)     // Catch:{ all -> 0x002a }
            goto L_0x008d
        L_0x007f:
            r11 = move-exception
            goto L_0x0087
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r2 = move-exception
            zl.b.a(r11, r1)     // Catch:{ all -> 0x007f }
            throw r2     // Catch:{ all -> 0x007f }
        L_0x0087:
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            zl.b.a(r10, r11)     // Catch:{ all -> 0x002a }
            throw r1     // Catch:{ all -> 0x002a }
        L_0x008d:
            java.lang.String r10 = r1.getAbsolutePath()     // Catch:{ all -> 0x002a }
            java.lang.String r11 = "file.absolutePath"
            cm.l.e(r10, r11)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x009b
            r0.close()
        L_0x009b:
            return r10
        L_0x009c:
            if (r8 == 0) goto L_0x00a1
            r8.close()
        L_0x00a1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.e(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00df, code lost:
        zl.b.a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e2, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File f(android.content.Context r5, java.lang.String r6, x1.d r7, x1.a r8, java.lang.Boolean r9, java.lang.String r10, java.lang.Boolean r11) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00ed
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            if (r7 == 0) goto L_0x00e4
            v1.d r6 = f17291f
            java.lang.String r8 = r6.l(r10, r9)
            x1.c r9 = r7.a()
            if (r9 != 0) goto L_0x0018
            r9 = -1
            goto L_0x0020
        L_0x0018:
            int[] r10 = v1.d.a.f17294a
            int r9 = r9.ordinal()
            r9 = r10[r9]
        L_0x0020:
            r10 = 1
            if (r9 == r10) goto L_0x002c
            r10 = 2
            if (r9 == r10) goto L_0x0029
            java.lang.String r9 = android.os.Environment.DIRECTORY_MOVIES
            goto L_0x002e
        L_0x0029:
            java.lang.String r9 = android.os.Environment.DIRECTORY_PICTURES
            goto L_0x002e
        L_0x002c:
            java.lang.String r9 = android.os.Environment.DIRECTORY_DOWNLOADS
        L_0x002e:
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 47
            if (r10 < r2) goto L_0x006c
            java.lang.String r10 = r7.b()
            if (r10 == 0) goto L_0x0052
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r3)
            java.lang.String r7 = r7.b()
            r10.append(r7)
            java.lang.String r9 = r10.toString()
        L_0x0052:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r7 = cm.l.a(r11, r7)
            if (r7 == 0) goto L_0x0062
            java.lang.String r7 = "fullPath"
            cm.l.e(r9, r7)
            r6.g(r5, r8, r9, r1)
        L_0x0062:
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getFilesDir()
            r6.<init>(r5, r8)
            return r6
        L_0x006c:
            java.io.File r6 = android.os.Environment.getExternalStoragePublicDirectory(r9)
            java.lang.String r9 = r7.b()
            if (r9 == 0) goto L_0x008d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r3)
            java.lang.String r6 = r7.b()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0091
        L_0x008d:
            java.lang.String r6 = r6.getPath()
        L_0x0091:
            java.io.File r7 = new java.io.File
            r7.<init>(r6, r8)
            boolean r6 = r7.exists()
            if (r6 != 0) goto L_0x00aa
            java.io.File r6 = r7.getParentFile()     // Catch:{ IOException -> 0x00a6 }
            if (r6 == 0) goto L_0x00aa
            r6.mkdirs()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00aa:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = cm.l.a(r11, r6)
            if (r6 == 0) goto L_0x00e3
            r6 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r8, r6)
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x00d5 }
            r8.<init>(r1)     // Catch:{ all -> 0x00d5 }
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x00ca }
        L_0x00c0:
            int r10 = r8.read(r9)     // Catch:{ all -> 0x00ca }
            if (r10 <= 0) goto L_0x00cc
            r5.write(r9, r6, r10)     // Catch:{ all -> 0x00ca }
            goto L_0x00c0
        L_0x00ca:
            r6 = move-exception
            goto L_0x00d7
        L_0x00cc:
            pl.x r6 = pl.x.f30437a     // Catch:{ all -> 0x00ca }
            zl.b.a(r8, r0)     // Catch:{ all -> 0x00d5 }
            zl.b.a(r5, r0)
            goto L_0x00e3
        L_0x00d5:
            r6 = move-exception
            goto L_0x00dd
        L_0x00d7:
            throw r6     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r7 = move-exception
            zl.b.a(r8, r6)     // Catch:{ all -> 0x00d5 }
            throw r7     // Catch:{ all -> 0x00d5 }
        L_0x00dd:
            throw r6     // Catch:{ all -> 0x00de }
        L_0x00de:
            r7 = move-exception
            zl.b.a(r5, r6)
            throw r7
        L_0x00e3:
            return r7
        L_0x00e4:
            v1.d r5 = f17291f
            r5.l(r10, r9)
            cm.l.c(r8)
            throw r0
        L_0x00ed:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.f(android.content.Context, java.lang.String, x1.d, x1.a, java.lang.Boolean, java.lang.String, java.lang.Boolean):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        zl.b.a(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        zl.b.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.io.File r11) {
        /*
            r7 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "_display_name"
            r0.put(r1, r9)
            java.lang.String r9 = "mime_type"
            java.lang.String r1 = "video/mp4"
            r0.put(r9, r1)
            java.lang.String r9 = "relative_path"
            r0.put(r9, r10)
            r9 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = "is_pending"
            r0.put(r1, r9)
            java.lang.String r9 = "external_primary"
            android.net.Uri r9 = android.provider.MediaStore.Video.Media.getContentUri(r9)
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS
            boolean r10 = cm.l.a(r10, r2)
            if (r10 == 0) goto L_0x0032
            android.net.Uri r9 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
        L_0x0032:
            android.content.ContentResolver r10 = r8.getContentResolver()
            android.net.Uri r9 = r10.insert(r9, r0)
            if (r9 == 0) goto L_0x009b
            android.content.ContentResolver r10 = r8.getContentResolver()
            java.lang.String r2 = "rw"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r9, r2)
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L_0x0087
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0071 }
            java.io.FileDescriptor r5 = r10.getFileDescriptor()     // Catch:{ all -> 0x0071 }
            r4.<init>(r5)     // Catch:{ all -> 0x0071 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0073 }
            r5.<init>(r11)     // Catch:{ all -> 0x0073 }
            r11 = 4096(0x1000, float:5.74E-42)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0066 }
        L_0x005c:
            int r6 = r5.read(r11)     // Catch:{ all -> 0x0066 }
            if (r6 <= 0) goto L_0x0068
            r4.write(r11, r2, r6)     // Catch:{ all -> 0x0066 }
            goto L_0x005c
        L_0x0066:
            r8 = move-exception
            goto L_0x0075
        L_0x0068:
            pl.x r11 = pl.x.f30437a     // Catch:{ all -> 0x0066 }
            zl.b.a(r5, r3)     // Catch:{ all -> 0x0073 }
            zl.b.a(r4, r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0087
        L_0x0071:
            r8 = move-exception
            goto L_0x0081
        L_0x0073:
            r8 = move-exception
            goto L_0x007b
        L_0x0075:
            throw r8     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r9 = move-exception
            zl.b.a(r5, r8)     // Catch:{ all -> 0x0073 }
            throw r9     // Catch:{ all -> 0x0073 }
        L_0x007b:
            throw r8     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            zl.b.a(r4, r8)     // Catch:{ all -> 0x0071 }
            throw r9     // Catch:{ all -> 0x0071 }
        L_0x0081:
            throw r8     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r9 = move-exception
            zl.b.a(r10, r8)
            throw r9
        L_0x0087:
            zl.b.a(r10, r3)
            r0.clear()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r10)
            android.content.ContentResolver r8 = r8.getContentResolver()
            r8.update(r9, r0, r3, r3)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.g(android.content.Context, java.lang.String, java.lang.String, java.io.File):void");
    }

    public static final void i(Context context, List list, boolean z10, x1.d dVar, x1.a aVar, x1.b bVar, a aVar2) {
        cm.l.f(context, "context");
        cm.l.f(list, "uris");
        cm.l.f(bVar, "configureWith");
        cm.l.f(aVar2, "listener");
        bVar.f().size();
        list.size();
        f17291f.d(context, list, z10, dVar, aVar, bVar, aVar2);
    }

    public static /* synthetic */ void j(Context context, List list, boolean z10, x1.d dVar, x1.a aVar, x1.b bVar, a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        i(context, list, z10, (i10 & 8) != 0 ? null : dVar, (i10 & 16) != 0 ? null : aVar, bVar, aVar2);
    }

    /* access modifiers changed from: private */
    public final Object k(int i10, Context context, Uri uri, String str, String str2, x1.b bVar, a aVar, tl.d dVar) {
        return f.e(q0.a(), new c(i10, context, uri, str, str2, bVar, aVar, (tl.d) null), dVar);
    }

    private final String l(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = str + "_temp";
        }
        if (q.F(str, "mp4", false, 2, (Object) null)) {
            return str;
        }
        return str + ".mp4";
    }

    public g h() {
        return this.f17293e.h();
    }
}
