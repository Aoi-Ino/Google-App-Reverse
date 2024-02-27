package t0;

import android.os.Bundle;
import cm.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final y f16267a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16268b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16269c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f16270d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private y f16271a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16272b;

        /* renamed from: c  reason: collision with root package name */
        private Object f16273c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f16274d;

        public final f a() {
            y yVar = this.f16271a;
            if (yVar == null) {
                yVar = y.f16481c.c(this.f16273c);
                l.d(yVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new f(yVar, this.f16272b, this.f16273c, this.f16274d);
        }

        public final a b(Object obj) {
            this.f16273c = obj;
            this.f16274d = true;
            return this;
        }

        public final a c(boolean z10) {
            this.f16272b = z10;
            return this;
        }

        public final a d(y yVar) {
            l.f(yVar, "type");
            this.f16271a = yVar;
            return this;
        }
    }

    public f(y yVar, boolean z10, Object obj, boolean z11) {
        l.f(yVar, "type");
        if (!yVar.c() && z10) {
            throw new IllegalArgumentException((yVar.b() + " does not allow nullable values").toString());
        } else if (z10 || !z11 || obj != null) {
            this.f16267a = yVar;
            this.f16268b = z10;
            this.f16270d = obj;
            this.f16269c = z11;
        } else {
            throw new IllegalArgumentException(("Argument with type " + yVar.b() + " has null value but is not nullable.").toString());
        }
    }

    public final y a() {
        return this.f16267a;
    }

    public final boolean b() {
        return this.f16269c;
    }

    public final boolean c() {
        return this.f16268b;
    }

    public final void d(String str, Bundle bundle) {
        l.f(str, "name");
        l.f(bundle, "bundle");
        if (this.f16269c) {
            this.f16267a.h(bundle, str, this.f16270d);
        }
    }

    public final boolean e(String str, Bundle bundle) {
        l.f(str, "name");
        l.f(bundle, "bundle");
        if (!this.f16268b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f16267a.a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (l.a(f.class, obj.getClass())) {
                f fVar = (f) obj;
                if (this.f16268b != fVar.f16268b || this.f16269c != fVar.f16269c || !l.a(this.f16267a, fVar.f16267a)) {
                    return false;
                }
                Object obj2 = this.f16270d;
                Object obj3 = fVar.f16270d;
                if (obj2 != null) {
                    return l.a(obj2, obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f16267a.hashCode() * 31) + (this.f16268b ? 1 : 0)) * 31) + (this.f16269c ? 1 : 0)) * 31;
        Object obj = this.f16270d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append(" Type: " + this.f16267a);
        sb2.append(" Nullable: " + this.f16268b);
        if (this.f16269c) {
            sb2.append(" DefaultValue: " + this.f16270d);
        }
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }
}
