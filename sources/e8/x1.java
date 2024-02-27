package e8;

import a8.e;
import a8.f;
import a8.j;
import b8.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class x1 extends l0 {

    /* renamed from: v  reason: collision with root package name */
    static final byte[] f11065v;

    /* renamed from: w  reason: collision with root package name */
    static final byte[] f11066w;

    /* renamed from: x  reason: collision with root package name */
    static final int f11067x;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f11068n = false;

    /* renamed from: o  reason: collision with root package name */
    protected int f11069o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected ByteArrayOutputStream f11070p = null;

    /* renamed from: q  reason: collision with root package name */
    protected InputStream f11071q;

    /* renamed from: r  reason: collision with root package name */
    protected x0 f11072r;

    /* renamed from: s  reason: collision with root package name */
    protected int f11073s = -1;

    /* renamed from: t  reason: collision with root package name */
    protected c2 f11074t;

    /* renamed from: u  reason: collision with root package name */
    protected int f11075u;

    static {
        byte[] f10 = e.f("stream\n");
        f11065v = f10;
        byte[] f11 = e.f("\nendstream");
        f11066w = f11;
        f11067x = f10.length + f11.length;
    }

    protected x1() {
        this.f10820f = 7;
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
            byte[] r8 = f11065v
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
            byte[] r8 = f11066w
            r9.write(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.x1.k(e8.c2, java.io.OutputStream):void");
    }

    public String toString() {
        c1 c1Var = c1.f10454ta;
        if (m(c1Var) == null) {
            return "Stream";
        }
        return "Stream of type: " + m(c1Var);
    }

    public void v(int i10) {
        i1 i1Var;
        if (f.f265p && !this.f11068n) {
            this.f11069o = i10;
            if (this.f11071q != null) {
                this.f11068n = true;
                return;
            }
            c1 c1Var = c1.f10242d3;
            i1 a10 = s1.a(m(c1Var));
            if (a10 != null) {
                if (a10.g()) {
                    if (c1.f10447t3.equals(a10)) {
                        return;
                    }
                } else if (!a10.d()) {
                    throw new RuntimeException(a.b("stream.could.not.be.compressed.filter.is.not.a.name.or.array", new Object[0]));
                } else if (((b0) a10).q(c1.f10447t3)) {
                    return;
                }
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Deflater deflater = new Deflater(i10);
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                ByteArrayOutputStream byteArrayOutputStream2 = this.f11070p;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.writeTo(deflaterOutputStream);
                } else {
                    deflaterOutputStream.write(this.f10819e);
                }
                deflaterOutputStream.close();
                deflater.end();
                this.f11070p = byteArrayOutputStream;
                this.f10819e = null;
                r(c1.f10358m5, new f1(byteArrayOutputStream.size()));
                if (a10 == null) {
                    i1Var = c1.f10447t3;
                } else {
                    b0 b0Var = new b0(a10);
                    b0Var.m(c1.f10447t3);
                    i1Var = b0Var;
                }
                r(c1Var, i1Var);
                this.f11068n = true;
            } catch (IOException e10) {
                throw new j(e10);
            }
        }
    }

    public int w() {
        return this.f11075u;
    }

    /* access modifiers changed from: protected */
    public void x(c2 c2Var, OutputStream outputStream) {
        super.k(c2Var, outputStream);
    }

    public void y() {
        if (this.f11071q != null) {
            int i10 = this.f11073s;
            if (i10 != -1) {
                this.f11074t.p(new f1(i10), this.f11072r, false);
                return;
            }
            throw new IOException(a.b("writelength.can.only.be.called.after.output.of.the.stream.body", new Object[0]));
        }
        throw new UnsupportedOperationException(a.b("writelength.can.only.be.called.in.a.contructed.pdfstream.inputstream.pdfwriter", new Object[0]));
    }

    public x1(InputStream inputStream, c2 c2Var) {
        this.f10820f = 7;
        this.f11071q = inputStream;
        this.f11074t = c2Var;
        x0 K = c2Var.K();
        this.f11072r = K;
        r(c1.f10358m5, K);
    }

    public x1(byte[] bArr) {
        this.f10820f = 7;
        this.f10819e = bArr;
        this.f11075u = bArr.length;
        r(c1.f10358m5, new f1(bArr.length));
    }
}
