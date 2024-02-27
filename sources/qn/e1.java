package qn;

import java.io.IOException;
import java.io.InputStream;

class e1 extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    private final e0 f30909e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30910f = true;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f30911g;

    e1(e0 e0Var) {
        this.f30909e = e0Var;
    }

    private w c() {
        f g10 = this.f30909e.g();
        if (g10 == null) {
            return null;
        }
        if (g10 instanceof w) {
            return (w) g10;
        }
        throw new IOException("unknown object encountered: " + g10.getClass());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f30911g
            r1 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r3.f30910f
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            qn.w r0 = r3.c()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            r2 = 0
            r3.f30910f = r2
        L_0x0014:
            java.io.InputStream r0 = r0.l()
            r3.f30911g = r0
        L_0x001a:
            java.io.InputStream r0 = r3.f30911g
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0023
            return r0
        L_0x0023:
            qn.w r0 = r3.c()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            r3.f30911g = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.e1.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[EDGE_INSN: B:20:0x002a->B:15:0x002a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC] */
    public int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f30911g
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.f30910f
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            qn.w r0 = r5.c()
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r5.f30910f = r1
        L_0x0014:
            java.io.InputStream r0 = r0.l()
            r5.f30911g = r0
        L_0x001a:
            java.io.InputStream r0 = r5.f30911g
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002a
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001a
            return r1
        L_0x002a:
            qn.w r0 = r5.c()
            if (r0 != 0) goto L_0x0014
            r6 = 0
            r5.f30911g = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.e1.read(byte[], int, int):int");
    }
}
