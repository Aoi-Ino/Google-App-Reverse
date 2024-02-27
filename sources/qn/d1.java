package qn;

import java.io.IOException;
import java.io.InputStream;

class d1 extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    private final e0 f30896e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f30897f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30898g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f30899h = 0;

    /* renamed from: i  reason: collision with root package name */
    private d f30900i;

    /* renamed from: j  reason: collision with root package name */
    private InputStream f30901j;

    d1(e0 e0Var, boolean z10) {
        this.f30896e = e0Var;
        this.f30897f = z10;
    }

    private d c() {
        f g10 = this.f30896e.g();
        if (g10 == null) {
            if (!this.f30897f || this.f30899h == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f30899h);
        } else if (!(g10 instanceof d)) {
            throw new IOException("unknown object encountered: " + g10.getClass());
        } else if (this.f30899h == 0) {
            return (d) g10;
        } else {
            throw new IOException("only the last nested bitstring can have padding");
        }
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f30899h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f30901j
            r1 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.f30898g
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            qn.d r0 = r3.c()
            r3.f30900i = r0
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            r2 = 0
            r3.f30898g = r2
        L_0x0016:
            java.io.InputStream r0 = r0.s()
            r3.f30901j = r0
        L_0x001c:
            java.io.InputStream r0 = r3.f30901j
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0025
            return r0
        L_0x0025:
            qn.d r0 = r3.f30900i
            int r0 = r0.o()
            r3.f30899h = r0
            qn.d r0 = r3.c()
            r3.f30900i = r0
            if (r0 != 0) goto L_0x0016
            r0 = 0
            r3.f30901j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.d1.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A[EDGE_INSN: B:20:0x002c->B:15:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC] */
    public int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f30901j
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r5.f30898g
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            qn.d r0 = r5.c()
            r5.f30900i = r0
            if (r0 != 0) goto L_0x0014
            return r2
        L_0x0014:
            r5.f30898g = r1
        L_0x0016:
            java.io.InputStream r0 = r0.s()
            r5.f30901j = r0
        L_0x001c:
            java.io.InputStream r0 = r5.f30901j
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002c
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001c
            return r1
        L_0x002c:
            qn.d r0 = r5.f30900i
            int r0 = r0.o()
            r5.f30899h = r0
            qn.d r0 = r5.c()
            r5.f30900i = r0
            if (r0 != 0) goto L_0x0016
            r6 = 0
            r5.f30901j = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.d1.read(byte[], int, int):int");
    }
}
