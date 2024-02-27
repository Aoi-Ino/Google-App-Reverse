package androidx.lifecycle;

import android.app.Application;
import cm.g;
import cm.l;
import java.lang.reflect.InvocationTargetException;
import r0.a;

public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final w0 f3353a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3354b;

    /* renamed from: c  reason: collision with root package name */
    private final r0.a f3355c;

    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final C0057a f3356f = new C0057a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f3357g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b f3358h = C0057a.C0058a.f3360a;

        /* renamed from: e  reason: collision with root package name */
        private final Application f3359e;

        /* renamed from: androidx.lifecycle.u0$a$a  reason: collision with other inner class name */
        public static final class C0057a {

            /* renamed from: androidx.lifecycle.u0$a$a$a  reason: collision with other inner class name */
            private static final class C0058a implements a.b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0058a f3360a = new C0058a();

                private C0058a() {
                }
            }

            private C0057a() {
            }

            public /* synthetic */ C0057a(g gVar) {
                this();
            }

            public final b a(x0 x0Var) {
                l.f(x0Var, "owner");
                return x0Var instanceof i ? ((i) x0Var).I() : c.f3363b.a();
            }

            public final a b(Application application) {
                l.f(application, "application");
                if (a.f3357g == null) {
                    a.f3357g = new a(application);
                }
                a e10 = a.f3357g;
                l.c(e10);
                return e10;
            }
        }

        public a() {
            this((Application) null, 0);
        }

        private final t0 g(Class cls, Application application) {
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                t0 t0Var = (t0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                l.e(t0Var, "{\n                try {\n…          }\n            }");
                return t0Var;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public t0 a(Class cls) {
            l.f(cls, "modelClass");
            Application application = this.f3359e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public t0 b(Class cls, r0.a aVar) {
            l.f(cls, "modelClass");
            l.f(aVar, "extras");
            if (this.f3359e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f3358h);
            if (application != null) {
                return g(cls, application);
            }
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            l.f(application, "application");
        }

        private a(Application application, int i10) {
            this.f3359e = application;
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3361a = a.f3362a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f3362a = new a();

            private a() {
            }
        }

        t0 a(Class cls) {
            l.f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        t0 b(Class cls, r0.a aVar) {
            l.f(cls, "modelClass");
            l.f(aVar, "extras");
            return a(cls);
        }
    }

    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3363b = new a((g) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static c f3364c;

        /* renamed from: d  reason: collision with root package name */
        public static final a.b f3365d = a.C0059a.f3366a;

        public static final class a {

            /* renamed from: androidx.lifecycle.u0$c$a$a  reason: collision with other inner class name */
            private static final class C0059a implements a.b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0059a f3366a = new C0059a();

                private C0059a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final c a() {
                if (c.f3364c == null) {
                    c.f3364c = new c();
                }
                c c10 = c.f3364c;
                l.c(c10);
                return c10;
            }
        }

        public t0 a(Class cls) {
            l.f(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                l.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (t0) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    public static class d {
        public abstract void c(t0 t0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, b bVar) {
        this(w0Var, bVar, (r0.a) null, 4, (g) null);
        l.f(w0Var, "store");
        l.f(bVar, "factory");
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public t0 b(String str, Class cls) {
        t0 t0Var;
        l.f(str, "key");
        l.f(cls, "modelClass");
        t0 b10 = this.f3353a.b(str);
        if (cls.isInstance(b10)) {
            b bVar = this.f3354b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                l.c(b10);
                dVar.c(b10);
            }
            l.d(b10, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b10;
        }
        r0.d dVar2 = new r0.d(this.f3355c);
        dVar2.c(c.f3365d, str);
        try {
            t0Var = this.f3354b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t0Var = this.f3354b.a(cls);
        }
        this.f3353a.d(str, t0Var);
        return t0Var;
    }

    public u0(w0 w0Var, b bVar, r0.a aVar) {
        l.f(w0Var, "store");
        l.f(bVar, "factory");
        l.f(aVar, "defaultCreationExtras");
        this.f3353a = w0Var;
        this.f3354b = bVar;
        this.f3355c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(w0 w0Var, b bVar, r0.a aVar, int i10, g gVar) {
        this(w0Var, bVar, (i10 & 4) != 0 ? a.C0208a.f15425b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var) {
        this(x0Var.X(), a.f3356f.a(x0Var), v0.a(x0Var));
        l.f(x0Var, "owner");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, b bVar) {
        this(x0Var.X(), bVar, v0.a(x0Var));
        l.f(x0Var, "owner");
        l.f(bVar, "factory");
    }
}
