package b1;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import b1.d;
import cm.g;
import cm.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b implements o {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4392f = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final f f4393e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: b1.b$b  reason: collision with other inner class name */
    public static final class C0081b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set f4394a = new LinkedHashSet();

        public C0081b(d dVar) {
            l.f(dVar, "registry");
            dVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4394a));
            return bundle;
        }

        public final void b(String str) {
            l.f(str, "className");
            this.f4394a.add(str);
        }
    }

    public b(f fVar) {
        l.f(fVar, "owner");
        this.f4393e = fVar;
    }

    private final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            l.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) newInstance).a(this.f4393e);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void d(s sVar, k.a aVar) {
        l.f(sVar, "source");
        l.f(aVar, "event");
        if (aVar == k.a.ON_CREATE) {
            sVar.d0().d(this);
            Bundle b10 = this.f4393e.l().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String h10 : stringArrayList) {
                        h(h10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
