package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.m;
import i7.p;
import i7.q;
import i7.r;
import i7.s;
import p7.c;

public final class h extends r {

    /* renamed from: b  reason: collision with root package name */
    private static final s f13335b = f(p.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    private final q f13336a;

    class a implements s {
        a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Number.class) {
                return h.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13338a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                p7.b[] r0 = p7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13338a = r0
                p7.b r1 = p7.b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13338a     // Catch:{ NoSuchFieldError -> 0x001d }
                p7.b r1 = p7.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13338a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p7.b r1 = p7.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.h.b.<clinit>():void");
        }
    }

    private h(q qVar) {
        this.f13336a = qVar;
    }

    public static s e(q qVar) {
        return qVar == p.LAZILY_PARSED_NUMBER ? f13335b : f(qVar);
    }

    private static s f(q qVar) {
        return new a();
    }

    /* renamed from: g */
    public Number b(p7.a aVar) {
        p7.b D0 = aVar.D0();
        int i10 = b.f13338a[D0.ordinal()];
        if (i10 == 1) {
            aVar.s0();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f13336a.a(aVar);
        } else {
            throw new m("Expecting number, got: " + D0 + "; at path " + aVar.b());
        }
    }

    /* renamed from: h */
    public void d(c cVar, Number number) {
        cVar.F0(number);
    }
}
