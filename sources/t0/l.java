package t0;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import cm.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class l extends t0 implements z {

    /* renamed from: e  reason: collision with root package name */
    public static final b f16367e = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final u0.b f16368f = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Map f16369d = new LinkedHashMap();

    public static final class a implements u0.b {
        a() {
        }

        public t0 a(Class cls) {
            cm.l.f(cls, "modelClass");
            return new l();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final l a(w0 w0Var) {
            cm.l.f(w0Var, "viewModelStore");
            return (l) new u0(w0Var, l.f16368f, (r0.a) null, 4, (g) null).a(l.class);
        }
    }

    public w0 a(String str) {
        cm.l.f(str, "backStackEntryId");
        w0 w0Var = (w0) this.f16369d.get(str);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        this.f16369d.put(str, w0Var2);
        return w0Var2;
    }

    /* access modifiers changed from: protected */
    public void e() {
        for (w0 a10 : this.f16369d.values()) {
            a10.a();
        }
        this.f16369d.clear();
    }

    public final void h(String str) {
        cm.l.f(str, "backStackEntryId");
        w0 w0Var = (w0) this.f16369d.remove(str);
        if (w0Var != null) {
            w0Var.a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f16369d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        cm.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
