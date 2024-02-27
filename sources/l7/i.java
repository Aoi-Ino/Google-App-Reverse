package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.p;
import i7.q;
import i7.r;
import i7.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k7.h;
import p7.c;

public final class i extends r {

    /* renamed from: c  reason: collision with root package name */
    private static final s f13339c = f(p.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    private final d f13340a;

    /* renamed from: b  reason: collision with root package name */
    private final q f13341b;

    class a implements s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f13342e;

        a(q qVar) {
            this.f13342e = qVar;
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new i(dVar, this.f13342e, (a) null);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13343a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p7.b[] r0 = p7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13343a = r0
                p7.b r1 = p7.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13343a     // Catch:{ NoSuchFieldError -> 0x001d }
                p7.b r1 = p7.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13343a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p7.b r1 = p7.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13343a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p7.b r1 = p7.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13343a     // Catch:{ NoSuchFieldError -> 0x003e }
                p7.b r1 = p7.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13343a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p7.b r1 = p7.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.i.b.<clinit>():void");
        }
    }

    private i(d dVar, q qVar) {
        this.f13340a = dVar;
        this.f13341b = qVar;
    }

    public static s e(q qVar) {
        return qVar == p.DOUBLE ? f13339c : f(qVar);
    }

    private static s f(q qVar) {
        return new a(qVar);
    }

    private Object g(p7.a aVar, p7.b bVar) {
        int i10 = b.f13343a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.B0();
        }
        if (i10 == 4) {
            return this.f13341b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.X());
        }
        if (i10 == 6) {
            aVar.s0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(p7.a aVar, p7.b bVar) {
        int i10 = b.f13343a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.c();
            return new ArrayList();
        } else if (i10 != 2) {
            return null;
        } else {
            aVar.e();
            return new h();
        }
    }

    public Object b(p7.a aVar) {
        p7.b D0 = aVar.D0();
        Object h10 = h(aVar, D0);
        if (h10 == null) {
            return g(aVar, D0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.B()) {
                String i02 = h10 instanceof Map ? aVar.i0() : null;
                p7.b D02 = aVar.D0();
                Object h11 = h(aVar, D02);
                boolean z10 = h11 != null;
                if (h11 == null) {
                    h11 = g(aVar, D02);
                }
                if (h10 instanceof List) {
                    ((List) h10).add(h11);
                } else {
                    ((Map) h10).put(i02, h11);
                }
                if (z10) {
                    arrayDeque.addLast(h10);
                    h10 = h11;
                }
            } else {
                if (h10 instanceof List) {
                    aVar.l();
                } else {
                    aVar.n();
                }
                if (arrayDeque.isEmpty()) {
                    return h10;
                }
                h10 = arrayDeque.removeLast();
            }
        }
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.R();
            return;
        }
        r n10 = this.f13340a.n(obj.getClass());
        if (n10 instanceof i) {
            cVar.g();
            cVar.n();
            return;
        }
        n10.d(cVar, obj);
    }

    /* synthetic */ i(d dVar, q qVar, a aVar) {
        this(dVar, qVar);
    }
}
