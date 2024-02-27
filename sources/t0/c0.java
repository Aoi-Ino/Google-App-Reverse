package t0;

import cm.g;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import t0.b0;

public class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16253b = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map f16254c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f16255a = new LinkedHashMap();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class cls) {
            l.f(cls, "navigatorClass");
            String str = (String) c0.f16254c.get(cls);
            if (str == null) {
                b0.b bVar = (b0.b) cls.getAnnotation(b0.b.class);
                str = bVar != null ? bVar.value() : null;
                if (b(str)) {
                    c0.f16254c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            l.c(str);
            return str;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }
    }

    public b0 b(String str, b0 b0Var) {
        l.f(str, "name");
        l.f(b0Var, "navigator");
        if (f16253b.b(str)) {
            b0 b0Var2 = (b0) this.f16255a.get(str);
            if (l.a(b0Var2, b0Var)) {
                return b0Var;
            }
            boolean z10 = false;
            if (b0Var2 != null && b0Var2.c()) {
                z10 = true;
            }
            if (!(!z10)) {
                throw new IllegalStateException(("Navigator " + b0Var + " is replacing an already attached " + b0Var2).toString());
            } else if (!b0Var.c()) {
                return (b0) this.f16255a.put(str, b0Var);
            } else {
                throw new IllegalStateException(("Navigator " + b0Var + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    public final b0 c(b0 b0Var) {
        l.f(b0Var, "navigator");
        return b(f16253b.a(b0Var.getClass()), b0Var);
    }

    public b0 d(String str) {
        l.f(str, "name");
        if (f16253b.b(str)) {
            b0 b0Var = (b0) this.f16255a.get(str);
            if (b0Var != null) {
                return b0Var;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final Map e() {
        return i0.p(this.f16255a);
    }
}
