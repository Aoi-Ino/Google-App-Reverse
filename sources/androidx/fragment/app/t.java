package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class t extends t0 {

    /* renamed from: k  reason: collision with root package name */
    private static final u0.b f3171k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap f3172d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f3173e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f3174f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3175g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3176h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3177i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3178j = false;

    class a implements u0.b {
        a() {
        }

        public t0 a(Class cls) {
            return new t(true);
        }
    }

    t(boolean z10) {
        this.f3175g = z10;
    }

    private void j(String str, boolean z10) {
        t tVar = (t) this.f3173e.get(str);
        if (tVar != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(tVar.f3173e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tVar.i((String) it.next(), true);
                }
            }
            tVar.e();
            this.f3173e.remove(str);
        }
        w0 w0Var = (w0) this.f3174f.get(str);
        if (w0Var != null) {
            w0Var.a();
            this.f3174f.remove(str);
        }
    }

    static t m(w0 w0Var) {
        return (t) new u0(w0Var, f3171k).a(t.class);
    }

    /* access modifiers changed from: protected */
    public void e() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3176h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3172d.equals(tVar.f3172d) && this.f3173e.equals(tVar.f3173e) && this.f3174f.equals(tVar.f3174f);
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        if (this.f3178j) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3172d.containsKey(iVar.f3052j)) {
            this.f3172d.put(iVar.f3052j, iVar);
            if (q.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + iVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(i iVar, boolean z10) {
        if (q.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + iVar);
        }
        j(iVar.f3052j, z10);
    }

    public int hashCode() {
        return (((this.f3172d.hashCode() * 31) + this.f3173e.hashCode()) * 31) + this.f3174f.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void i(String str, boolean z10) {
        if (q.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        j(str, z10);
    }

    /* access modifiers changed from: package-private */
    public i k(String str) {
        return (i) this.f3172d.get(str);
    }

    /* access modifiers changed from: package-private */
    public t l(i iVar) {
        t tVar = (t) this.f3173e.get(iVar.f3052j);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f3175g);
        this.f3173e.put(iVar.f3052j, tVar2);
        return tVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection n() {
        return new ArrayList(this.f3172d.values());
    }

    /* access modifiers changed from: package-private */
    public w0 o(i iVar) {
        w0 w0Var = (w0) this.f3174f.get(iVar.f3052j);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        this.f3174f.put(iVar.f3052j, w0Var2);
        return w0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f3176h;
    }

    /* access modifiers changed from: package-private */
    public void q(i iVar) {
        if (this.f3178j) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f3172d.remove(iVar.f3052j) != null && q.J0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f3178j = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean s(i iVar) {
        if (!this.f3172d.containsKey(iVar.f3052j)) {
            return true;
        }
        return this.f3175g ? this.f3176h : !this.f3177i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f3172d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f3173e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f3174f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
