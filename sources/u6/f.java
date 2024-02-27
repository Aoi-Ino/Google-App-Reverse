package u6;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import r6.b;
import r6.c;
import r6.d;
import r6.e;

final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f16911f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final c f16912g = c.a("key").b(a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f16913h = c.a("value").b(a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final d f16914i = new e();

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f16915a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f16916b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f16917c;

    /* renamed from: d  reason: collision with root package name */
    private final d f16918d;

    /* renamed from: e  reason: collision with root package name */
    private final i f16919e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16920a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                u6.d$a[] r0 = u6.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16920a = r0
                u6.d$a r1 = u6.d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16920a     // Catch:{ NoSuchFieldError -> 0x001d }
                u6.d$a r1 = u6.d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16920a     // Catch:{ NoSuchFieldError -> 0x0028 }
                u6.d$a r1 = u6.d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.f.a.<clinit>():void");
        }
    }

    f(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.f16915a = outputStream;
        this.f16916b = map;
        this.f16917c = map2;
        this.f16918d = dVar;
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(d dVar, Object obj) {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f16915a;
            this.f16915a = bVar;
            dVar.a(obj, this);
            this.f16915a = outputStream;
            long c10 = bVar.c();
            bVar.close();
            return c10;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private f o(d dVar, c cVar, Object obj, boolean z10) {
        long n10 = n(dVar, obj);
        if (z10 && n10 == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(n10);
        dVar.a(obj, this);
        return this;
    }

    private f p(r6.f fVar, c cVar, Object obj, boolean z10) {
        this.f16919e.b(cVar, z10);
        fVar.a(obj, this.f16919e);
        return this;
    }

    private static d r(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int s(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, e eVar) {
        eVar.e(f16912g, entry.getKey());
        eVar.e(f16913h, entry.getValue());
    }

    private void u(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f16915a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f16915a.write(i10 & 127);
    }

    private void v(long j10) {
        while ((-128 & j10) != 0) {
            this.f16915a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f16915a.write(((int) j10) & 127);
    }

    /* access modifiers changed from: package-private */
    public e d(c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f16915a.write(m(8).putDouble(d10).array());
        return this;
    }

    public e e(c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    public e f(c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f16915a.write(m(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e g(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16911f);
            u(bytes.length);
            this.f16915a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g10 : (Collection) obj) {
                g(cVar, g10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o10 : ((Map) obj).entrySet()) {
                o(f16914i, cVar, o10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return d(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return f(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return k(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return l(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                u((s(cVar) << 3) | 2);
                u(bArr.length);
                this.f16915a.write(bArr);
                return this;
            }
            d dVar = (d) this.f16916b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z10);
            }
            r6.f fVar = (r6.f) this.f16917c.get(obj.getClass());
            if (fVar != null) {
                return p(fVar, cVar, obj, z10);
            }
            if (obj instanceof c) {
                return b(cVar, ((c) obj).a());
            }
            return obj instanceof Enum ? b(cVar, ((Enum) obj).ordinal()) : o(this.f16918d, cVar, obj, z10);
        }
    }

    /* renamed from: h */
    public f b(c cVar, int i10) {
        return i(cVar, i10, true);
    }

    /* access modifiers changed from: package-private */
    public f i(c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i11 = a.f16920a[r10.intEncoding().ordinal()];
        if (i11 == 1) {
            u(r10.tag() << 3);
            u(i10);
        } else if (i11 == 2) {
            u(r10.tag() << 3);
            u((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            u((r10.tag() << 3) | 5);
            this.f16915a.write(m(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: j */
    public f a(c cVar, long j10) {
        return k(cVar, j10, true);
    }

    /* access modifiers changed from: package-private */
    public f k(c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i10 = a.f16920a[r10.intEncoding().ordinal()];
        if (i10 == 1) {
            u(r10.tag() << 3);
            v(j10);
        } else if (i10 == 2) {
            u(r10.tag() << 3);
            v((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            u((r10.tag() << 3) | 1);
            this.f16915a.write(m(8).putLong(j10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public f l(c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    /* access modifiers changed from: package-private */
    public f q(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.f16916b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
