package um;

import cm.g;
import cm.l;
import in.e;
import in.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import km.d;
import um.x;

public abstract class e0 implements Closeable {
    public static final b Companion = new b((g) null);
    private Reader reader;

    public static final class a extends Reader {

        /* renamed from: e  reason: collision with root package name */
        private boolean f31973e;

        /* renamed from: f  reason: collision with root package name */
        private Reader f31974f;

        /* renamed from: g  reason: collision with root package name */
        private final in.g f31975g;

        /* renamed from: h  reason: collision with root package name */
        private final Charset f31976h;

        public a(in.g gVar, Charset charset) {
            l.f(gVar, "source");
            l.f(charset, "charset");
            this.f31975g = gVar;
            this.f31976h = charset;
        }

        public void close() {
            this.f31973e = true;
            Reader reader = this.f31974f;
            if (reader != null) {
                reader.close();
            } else {
                this.f31975g.close();
            }
        }

        public int read(char[] cArr, int i10, int i11) {
            l.f(cArr, "cbuf");
            if (!this.f31973e) {
                Reader reader = this.f31974f;
                if (reader == null) {
                    reader = new InputStreamReader(this.f31975g.z0(), vm.b.F(this.f31975g, this.f31976h));
                    this.f31974f = reader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class b {

        public static final class a extends e0 {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ in.g f31977e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ x f31978f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f31979g;

            a(in.g gVar, x xVar, long j10) {
                this.f31977e = gVar;
                this.f31978f = xVar;
                this.f31979g = j10;
            }

            public long contentLength() {
                return this.f31979g;
            }

            public x contentType() {
                return this.f31978f;
            }

            public in.g source() {
                return this.f31977e;
            }
        }

        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public static /* synthetic */ e0 i(b bVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.h(bArr, xVar);
        }

        public final e0 a(in.g gVar, x xVar, long j10) {
            l.f(gVar, "$this$asResponseBody");
            return new a(gVar, xVar, j10);
        }

        public final e0 b(h hVar, x xVar) {
            l.f(hVar, "$this$toResponseBody");
            return a(new e().N(hVar), xVar, (long) hVar.q());
        }

        public final e0 c(String str, x xVar) {
            l.f(str, "$this$toResponseBody");
            Charset charset = d.f24740b;
            if (xVar != null) {
                Charset d10 = x.d(xVar, (Charset) null, 1, (Object) null);
                if (d10 == null) {
                    x.a aVar = x.f32156g;
                    xVar = aVar.b(xVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            e U0 = new e().U0(str, charset);
            return a(U0, xVar, U0.H0());
        }

        public final e0 d(x xVar, long j10, in.g gVar) {
            l.f(gVar, "content");
            return a(gVar, xVar, j10);
        }

        public final e0 e(x xVar, h hVar) {
            l.f(hVar, "content");
            return b(hVar, xVar);
        }

        public final e0 f(x xVar, String str) {
            l.f(str, "content");
            return c(str, xVar);
        }

        public final e0 g(x xVar, byte[] bArr) {
            l.f(bArr, "content");
            return h(bArr, xVar);
        }

        public final e0 h(byte[] bArr, x xVar) {
            l.f(bArr, "$this$toResponseBody");
            return a(new e().W(bArr), xVar, (long) bArr.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c(km.d.f24740b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset c() {
        /*
            r2 = this;
            um.x r0 = r2.contentType()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = km.d.f24740b
            java.nio.charset.Charset r0 = r0.c(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = km.d.f24740b
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um.e0.c():java.nio.charset.Charset");
    }

    public static final e0 create(in.g gVar, x xVar, long j10) {
        return Companion.a(gVar, xVar, j10);
    }

    public final InputStream byteStream() {
        return source().z0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        zl.b.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final in.h byteString() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0054
            in.g r2 = r6.source()
            in.h r3 = r2.u()     // Catch:{ all -> 0x004d }
            r4 = 0
            zl.b.a(r2, r4)
            int r2 = r3.q()
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x004c
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004c:
            return r3
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            zl.b.a(r2, r0)
            throw r1
        L_0x0054:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: um.e0.byteString():in.h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        zl.b.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0051
            in.g r2 = r6.source()
            byte[] r3 = r2.M()     // Catch:{ all -> 0x004a }
            r4 = 0
            zl.b.a(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0049
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r3
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            zl.b.a(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: um.e0.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        a aVar = new a(source(), c());
        this.reader = aVar;
        return aVar;
    }

    public void close() {
        vm.b.j(source());
    }

    public abstract long contentLength();

    public abstract x contentType();

    public abstract in.g source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        zl.b.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            in.g r0 = r3.source()
            java.nio.charset.Charset r1 = r3.c()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = vm.b.F(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.y0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            zl.b.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            zl.b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: um.e0.string():java.lang.String");
    }

    public static final e0 create(h hVar, x xVar) {
        return Companion.b(hVar, xVar);
    }

    public static final e0 create(String str, x xVar) {
        return Companion.c(str, xVar);
    }

    public static final e0 create(x xVar, long j10, in.g gVar) {
        return Companion.d(xVar, j10, gVar);
    }

    public static final e0 create(x xVar, h hVar) {
        return Companion.e(xVar, hVar);
    }

    public static final e0 create(x xVar, String str) {
        return Companion.f(xVar, str);
    }

    public static final e0 create(x xVar, byte[] bArr) {
        return Companion.g(xVar, bArr);
    }

    public static final e0 create(byte[] bArr, x xVar) {
        return Companion.h(bArr, xVar);
    }
}
