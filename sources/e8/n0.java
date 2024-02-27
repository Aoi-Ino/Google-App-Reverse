package e8;

import java.io.InputStream;

public class n0 extends x1 {
    public n0(InputStream inputStream, c2 c2Var) {
        super(inputStream, c2Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.zip.DeflaterOutputStream} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(e8.c2 r8, java.io.OutputStream r9) {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f11071q
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.f11068n
            if (r0 == 0) goto L_0x000f
            e8.c1 r0 = e8.c1.f10242d3
            e8.c1 r1 = e8.c1.f10447t3
            r7.r(r0, r1)
        L_0x000f:
            if (r8 == 0) goto L_0x0014
            r8.A()
        L_0x0014:
            e8.c1 r0 = e8.c1.f10358m5
            r7.m(r0)
            r7.x(r8, r9)
            byte[] r8 = e8.x1.f11065v
            r9.write(r8)
            java.io.InputStream r8 = r7.f11071q
            if (r8 == 0) goto L_0x0069
            r8 = 0
            r7.f11075u = r8
            e8.u r0 = new e8.u
            r0.<init>(r9)
            boolean r1 = r7.f11068n
            if (r1 == 0) goto L_0x0042
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            int r2 = r7.f11069o
            r1.<init>(r2)
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream
            r3 = 32768(0x8000, float:4.5918E-41)
            r2.<init>(r0, r1, r3)
            r3 = r2
            goto L_0x0045
        L_0x0042:
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0045:
            r4 = 4192(0x1060, float:5.874E-42)
            byte[] r4 = new byte[r4]
        L_0x0049:
            java.io.InputStream r5 = r7.f11071q
            int r5 = r5.read(r4)
            if (r5 > 0) goto L_0x0060
            if (r3 == 0) goto L_0x0059
            r3.finish()
            r1.end()
        L_0x0059:
            int r8 = r0.c()
            r7.f11073s = r8
            goto L_0x0076
        L_0x0060:
            r2.write(r4, r8, r5)
            int r6 = r7.f11075u
            int r6 = r6 + r5
            r7.f11075u = r6
            goto L_0x0049
        L_0x0069:
            java.io.ByteArrayOutputStream r8 = r7.f11070p
            if (r8 == 0) goto L_0x0071
            r8.writeTo(r9)
            goto L_0x0076
        L_0x0071:
            byte[] r8 = r7.f10819e
            r9.write(r8)
        L_0x0076:
            byte[] r8 = e8.x1.f11066w
            r9.write(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.n0.k(e8.c2, java.io.OutputStream):void");
    }

    public n0(byte[] bArr) {
        super(bArr);
    }
}
