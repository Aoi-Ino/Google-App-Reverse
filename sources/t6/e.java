package t6;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import r6.b;
import r6.c;
import r6.d;
import r6.f;
import r6.g;

final class e implements r6.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f16568a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16569b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f16570c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f16571d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f16572e;

    /* renamed from: f  reason: collision with root package name */
    private final d f16573f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16574g;

    e(Writer writer, Map map, Map map2, d dVar, boolean z10) {
        this.f16570c = new JsonWriter(writer);
        this.f16571d = map;
        this.f16572e = map2;
        this.f16573f = dVar;
        this.f16574g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) {
        t();
        this.f16570c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f16570c.nullValue();
        return this;
    }

    private e s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.f16570c.name(str);
        return h(obj, false);
    }

    private void t() {
        if (this.f16569b) {
            e eVar = this.f16568a;
            if (eVar != null) {
                eVar.t();
                this.f16568a.f16569b = false;
                this.f16568a = null;
                this.f16570c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public r6.e a(c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    public r6.e b(c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    public r6.e e(c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    public e f(int i10) {
        t();
        this.f16570c.value((long) i10);
        return this;
    }

    public e g(long j10) {
        t();
        this.f16570c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e h(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f16570c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f16570c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return n((byte[]) obj);
            }
            this.f16570c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    this.f16570c.value((long) iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    g(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f16570c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f16570c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number h10 : (Number[]) obj) {
                    h(h10, false);
                }
            } else {
                for (Object h11 : (Object[]) obj) {
                    h(h11, false);
                }
            }
            this.f16570c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f16570c.beginArray();
            for (Object h12 : (Collection) obj) {
                h(h12, false);
            }
            this.f16570c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f16570c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    l((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                }
            }
            this.f16570c.endObject();
            return this;
        } else {
            d dVar = (d) this.f16571d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f16572e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return q(this.f16573f, obj, z10);
            } else {
                c(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: i */
    public e c(String str) {
        t();
        this.f16570c.value(str);
        return this;
    }

    public e j(String str, int i10) {
        t();
        this.f16570c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) {
        t();
        this.f16570c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        return this.f16574g ? s(str, obj) : r(str, obj);
    }

    /* renamed from: m */
    public e d(boolean z10) {
        t();
        this.f16570c.value(z10);
        return this;
    }

    public e n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.f16570c.nullValue();
        } else {
            this.f16570c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        t();
        this.f16570c.flush();
    }

    /* access modifiers changed from: package-private */
    public e q(d dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f16570c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f16570c.endObject();
        }
        return this;
    }
}
