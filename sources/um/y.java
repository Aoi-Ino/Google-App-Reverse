package um;

import cm.g;
import cm.l;
import in.f;
import in.h;
import java.util.ArrayList;
import java.util.List;
import um.x;

public final class y extends c0 {

    /* renamed from: f  reason: collision with root package name */
    public static final x f32161f;

    /* renamed from: g  reason: collision with root package name */
    public static final x f32162g;

    /* renamed from: h  reason: collision with root package name */
    public static final x f32163h;

    /* renamed from: i  reason: collision with root package name */
    public static final x f32164i;

    /* renamed from: j  reason: collision with root package name */
    public static final x f32165j;

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f32166k = {(byte) 58, (byte) 32};

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f32167l = {(byte) 13, (byte) 10};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f32168m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f32169n = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final x f32170a;

    /* renamed from: b  reason: collision with root package name */
    private long f32171b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final h f32172c;

    /* renamed from: d  reason: collision with root package name */
    private final x f32173d;

    /* renamed from: e  reason: collision with root package name */
    private final List f32174e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final h f32175a;

        /* renamed from: b  reason: collision with root package name */
        private x f32176b;

        /* renamed from: c  reason: collision with root package name */
        private final List f32177c;

        public a() {
            this((String) null, 1, (g) null);
        }

        public final a a(u uVar, c0 c0Var) {
            l.f(c0Var, "body");
            b(c.f32178c.a(uVar, c0Var));
            return this;
        }

        public final a b(c cVar) {
            l.f(cVar, "part");
            this.f32177c.add(cVar);
            return this;
        }

        public final y c() {
            if (!this.f32177c.isEmpty()) {
                return new y(this.f32175a, this.f32176b, vm.b.O(this.f32177c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(x xVar) {
            l.f(xVar, "type");
            if (l.a(xVar.h(), "multipart")) {
                this.f32176b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        public a(String str) {
            l.f(str, "boundary");
            this.f32175a = h.f24468i.c(str);
            this.f32176b = y.f32161f;
            this.f32177c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r1, int r2, cm.g r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                cm.l.e(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: um.y.a.<init>(java.lang.String, int, cm.g):void");
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f32178c = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        private final u f32179a;

        /* renamed from: b  reason: collision with root package name */
        private final c0 f32180b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final c a(u uVar, c0 c0Var) {
                l.f(c0Var, "body");
                boolean z10 = false;
                if ((uVar != null ? uVar.l("Content-Type") : null) == null) {
                    if ((uVar != null ? uVar.l("Content-Length") : null) == null) {
                        z10 = true;
                    }
                    if (z10) {
                        return new c(uVar, c0Var, (g) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
        }

        private c(u uVar, c0 c0Var) {
            this.f32179a = uVar;
            this.f32180b = c0Var;
        }

        public final c0 a() {
            return this.f32180b;
        }

        public final u b() {
            return this.f32179a;
        }

        public /* synthetic */ c(u uVar, c0 c0Var, g gVar) {
            this(uVar, c0Var);
        }
    }

    static {
        x.a aVar = x.f32156g;
        f32161f = aVar.a("multipart/mixed");
        f32162g = aVar.a("multipart/alternative");
        f32163h = aVar.a("multipart/digest");
        f32164i = aVar.a("multipart/parallel");
        f32165j = aVar.a("multipart/form-data");
        byte b10 = (byte) 45;
        f32168m = new byte[]{b10, b10};
    }

    public y(h hVar, x xVar, List list) {
        l.f(hVar, "boundaryByteString");
        l.f(xVar, "type");
        l.f(list, "parts");
        this.f32172c = hVar;
        this.f32173d = xVar;
        this.f32174e = list;
        x.a aVar = x.f32156g;
        this.f32170a = aVar.a(xVar + "; boundary=" + a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: in.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: in.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: in.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: in.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: in.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long b(in.f r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            in.e r13 = new in.e
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List r1 = r12.f32174e
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List r6 = r12.f32174e
            java.lang.Object r6 = r6.get(r5)
            um.y$c r6 = (um.y.c) r6
            um.u r7 = r6.b()
            um.c0 r6 = r6.a()
            cm.l.c(r13)
            byte[] r8 = f32168m
            r13.W(r8)
            in.h r8 = r12.f32172c
            r13.N(r8)
            byte[] r8 = f32167l
            r13.W(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = r2
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.n(r9)
            in.f r10 = r13.r0(r10)
            byte[] r11 = f32166k
            in.f r10 = r10.W(r11)
            java.lang.String r11 = r7.s(r9)
            in.f r10 = r10.r0(r11)
            byte[] r11 = f32167l
            r10.W(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            um.x r7 = r6.contentType()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            in.f r8 = r13.r0(r8)
            java.lang.String r7 = r7.toString()
            in.f r7 = r8.r0(r7)
            byte[] r8 = f32167l
            r7.W(r8)
        L_0x0078:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            in.f r9 = r13.r0(r9)
            in.f r9 = r9.t0(r7)
            byte[] r10 = f32167l
            r9.W(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            cm.l.c(r0)
            r0.c()
            return r9
        L_0x009b:
            byte[] r9 = f32167l
            r13.W(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.writeTo(r13)
        L_0x00a7:
            r13.W(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            cm.l.c(r13)
            byte[] r1 = f32168m
            r13.W(r1)
            in.h r2 = r12.f32172c
            r13.N(r2)
            r13.W(r1)
            byte[] r1 = f32167l
            r13.W(r1)
            if (r14 == 0) goto L_0x00d0
            cm.l.c(r0)
            long r13 = r0.H0()
            long r3 = r3 + r13
            r0.c()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: um.y.b(in.f, boolean):long");
    }

    public final String a() {
        return this.f32172c.t();
    }

    public long contentLength() {
        long j10 = this.f32171b;
        if (j10 != -1) {
            return j10;
        }
        long b10 = b((f) null, true);
        this.f32171b = b10;
        return b10;
    }

    public x contentType() {
        return this.f32170a;
    }

    public void writeTo(f fVar) {
        l.f(fVar, "sink");
        b(fVar, false);
    }
}
