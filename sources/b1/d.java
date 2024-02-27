package b1;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import b1.b;
import cm.g;
import cm.l;
import java.util.Iterator;
import java.util.Map;
import k.b;

public final class d {

    /* renamed from: g  reason: collision with root package name */
    private static final b f4396g = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final k.b f4397a = new k.b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4398b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4399c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4400d;

    /* renamed from: e  reason: collision with root package name */
    private b.C0081b f4401e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4402f = true;

    public interface a {
        void a(f fVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(d dVar, s sVar, k.a aVar) {
        boolean z10;
        l.f(dVar, "this$0");
        l.f(sVar, "<anonymous parameter 0>");
        l.f(aVar, "event");
        if (aVar == k.a.ON_START) {
            z10 = true;
        } else if (aVar == k.a.ON_STOP) {
            z10 = false;
        } else {
            return;
        }
        dVar.f4402f = z10;
    }

    public final Bundle b(String str) {
        l.f(str, "key");
        if (this.f4400d) {
            Bundle bundle = this.f4399c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f4399c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f4399c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f4399c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        l.f(str, "key");
        Iterator it = this.f4397a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l.e(entry, "components");
            c cVar = (c) entry.getValue();
            if (l.a((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(k kVar) {
        l.f(kVar, "lifecycle");
        if (!this.f4398b) {
            kVar.a(new c(this));
            this.f4398b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (!this.f4398b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f4400d) {
            this.f4399c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f4400d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    public final void g(Bundle bundle) {
        l.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4399c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d o10 = this.f4397a.o();
        l.e(o10, "this.components.iteratorWithAdditions()");
        while (o10.hasNext()) {
            Map.Entry entry = (Map.Entry) o10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        l.f(str, "key");
        l.f(cVar, "provider");
        if (((c) this.f4397a.v(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class cls) {
        l.f(cls, "clazz");
        if (this.f4402f) {
            b.C0081b bVar = this.f4401e;
            if (bVar == null) {
                bVar = new b.C0081b(this);
            }
            this.f4401e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                b.C0081b bVar2 = this.f4401e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    l.e(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
