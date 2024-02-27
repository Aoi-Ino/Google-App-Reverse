package um;

import cm.g;
import cm.l;
import in.f;
import in.h;
import java.io.File;
import java.nio.charset.Charset;
import km.d;
import um.x;

public abstract class c0 {
    public static final a Companion = new a((g) null);

    public static final class a {

        /* renamed from: um.c0$a$a  reason: collision with other inner class name */
        public static final class C0364a extends c0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ File f31914a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ x f31915b;

            C0364a(File file, x xVar) {
                this.f31914a = file;
                this.f31915b = xVar;
            }

            public long contentLength() {
                return this.f31914a.length();
            }

            public x contentType() {
                return this.f31915b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                zl.b.a(r0, r3);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void writeTo(in.f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    cm.l.f(r3, r0)
                    java.io.File r0 = r2.f31914a
                    in.a0 r0 = in.o.f(r0)
                    r3.q0(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    zl.b.a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    zl.b.a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: um.c0.a.C0364a.writeTo(in.f):void");
            }
        }

        public static final class b extends c0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f31916a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ x f31917b;

            b(h hVar, x xVar) {
                this.f31916a = hVar;
                this.f31917b = xVar;
            }

            public long contentLength() {
                return (long) this.f31916a.q();
            }

            public x contentType() {
                return this.f31917b;
            }

            public void writeTo(f fVar) {
                l.f(fVar, "sink");
                fVar.N(this.f31916a);
            }
        }

        public static final class c extends c0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ byte[] f31918a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ x f31919b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f31920c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f31921d;

            c(byte[] bArr, x xVar, int i10, int i11) {
                this.f31918a = bArr;
                this.f31919b = xVar;
                this.f31920c = i10;
                this.f31921d = i11;
            }

            public long contentLength() {
                return (long) this.f31920c;
            }

            public x contentType() {
                return this.f31919b;
            }

            public void writeTo(f fVar) {
                l.f(fVar, "sink");
                fVar.a(this.f31918a, this.f31921d, this.f31920c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ c0 i(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.g(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ c0 j(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        public final c0 a(h hVar, x xVar) {
            l.f(hVar, "$this$toRequestBody");
            return new b(hVar, xVar);
        }

        public final c0 b(File file, x xVar) {
            l.f(file, "$this$asRequestBody");
            return new C0364a(file, xVar);
        }

        public final c0 c(String str, x xVar) {
            l.f(str, "$this$toRequestBody");
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
            byte[] bytes = str.getBytes(charset);
            l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final c0 d(x xVar, h hVar) {
            l.f(hVar, "content");
            return a(hVar, xVar);
        }

        public final c0 e(x xVar, File file) {
            l.f(file, "file");
            return b(file, xVar);
        }

        public final c0 f(x xVar, String str) {
            l.f(str, "content");
            return c(str, xVar);
        }

        public final c0 g(x xVar, byte[] bArr, int i10, int i11) {
            l.f(bArr, "content");
            return h(bArr, xVar, i10, i11);
        }

        public final c0 h(byte[] bArr, x xVar, int i10, int i11) {
            l.f(bArr, "$this$toRequestBody");
            vm.b.i((long) bArr.length, (long) i10, (long) i11);
            return new c(bArr, xVar, i11, i10);
        }
    }

    public static final c0 create(h hVar, x xVar) {
        return Companion.a(hVar, xVar);
    }

    public abstract long contentLength();

    public abstract x contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(f fVar);

    public static final c0 create(File file, x xVar) {
        return Companion.b(file, xVar);
    }

    public static final c0 create(String str, x xVar) {
        return Companion.c(str, xVar);
    }

    public static final c0 create(x xVar, h hVar) {
        return Companion.d(xVar, hVar);
    }

    public static final c0 create(x xVar, File file) {
        return Companion.e(xVar, file);
    }

    public static final c0 create(x xVar, String str) {
        return Companion.f(xVar, str);
    }

    public static final c0 create(x xVar, byte[] bArr) {
        return a.i(Companion, xVar, bArr, 0, 0, 12, (Object) null);
    }

    public static final c0 create(x xVar, byte[] bArr, int i10) {
        return a.i(Companion, xVar, bArr, i10, 0, 8, (Object) null);
    }

    public static final c0 create(x xVar, byte[] bArr, int i10, int i11) {
        return Companion.g(xVar, bArr, i10, i11);
    }

    public static final c0 create(byte[] bArr) {
        return a.j(Companion, bArr, (x) null, 0, 0, 7, (Object) null);
    }

    public static final c0 create(byte[] bArr, x xVar) {
        return a.j(Companion, bArr, xVar, 0, 0, 6, (Object) null);
    }

    public static final c0 create(byte[] bArr, x xVar, int i10) {
        return a.j(Companion, bArr, xVar, i10, 0, 4, (Object) null);
    }

    public static final c0 create(byte[] bArr, x xVar, int i10, int i11) {
        return Companion.h(bArr, xVar, i10, i11);
    }
}
