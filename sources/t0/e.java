package t0;

import android.os.Bundle;
import cm.g;
import cm.l;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f16262a;

    /* renamed from: b  reason: collision with root package name */
    private v f16263b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f16264c;

    public e(int i10, v vVar, Bundle bundle) {
        this.f16262a = i10;
        this.f16263b = vVar;
        this.f16264c = bundle;
    }

    public final Bundle a() {
        return this.f16264c;
    }

    public final int b() {
        return this.f16262a;
    }

    public final v c() {
        return this.f16263b;
    }

    public final void d(Bundle bundle) {
        this.f16264c = bundle;
    }

    public final void e(v vVar) {
        this.f16263b = vVar;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f16262a == eVar.f16262a && l.a(this.f16263b, eVar.f16263b)) {
            if (l.a(this.f16264c, eVar.f16264c)) {
                return true;
            }
            Bundle bundle = this.f16264c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                if (keySet.isEmpty()) {
                    return true;
                }
                for (String str : keySet) {
                    Bundle bundle2 = this.f16264c;
                    Object obj2 = null;
                    Object obj3 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = eVar.f16264c;
                    if (bundle3 != null) {
                        obj2 = bundle3.get(str);
                    }
                    if (!l.a(obj3, obj2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f16262a) * 31;
        v vVar = this.f16263b;
        int hashCode2 = hashCode + (vVar != null ? vVar.hashCode() : 0);
        Bundle bundle = this.f16264c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i10 = hashCode2 * 31;
                Bundle bundle2 = this.f16264c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f16262a));
        sb2.append(")");
        if (this.f16263b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f16263b);
        }
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, v vVar, Bundle bundle, int i11, g gVar) {
        this(i10, (i11 & 2) != 0 ? null : vVar, (i11 & 4) != 0 ? null : bundle);
    }
}
