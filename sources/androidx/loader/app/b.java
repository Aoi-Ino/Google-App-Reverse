package androidx.loader.app;

import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.h;

class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final s f3396a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3397b;

    static class a extends t0 {

        /* renamed from: f  reason: collision with root package name */
        private static final u0.b f3398f = new C0060a();

        /* renamed from: d  reason: collision with root package name */
        private h f3399d = new h();

        /* renamed from: e  reason: collision with root package name */
        private boolean f3400e = false;

        /* renamed from: androidx.loader.app.b$a$a  reason: collision with other inner class name */
        static class C0060a implements u0.b {
            C0060a() {
            }

            public t0 a(Class cls) {
                return new a();
            }
        }

        a() {
        }

        static a h(w0 w0Var) {
            return (a) new u0(w0Var, f3398f).a(a.class);
        }

        /* access modifiers changed from: protected */
        public void e() {
            super.e();
            if (this.f3399d.q() <= 0) {
                this.f3399d.b();
            } else {
                android.support.v4.media.session.b.a(this.f3399d.r(0));
                throw null;
            }
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3399d.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("    ");
                if (this.f3399d.q() > 0) {
                    android.support.v4.media.session.b.a(this.f3399d.r(0));
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3399d.j(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            if (this.f3399d.q() > 0) {
                android.support.v4.media.session.b.a(this.f3399d.r(0));
                throw null;
            }
        }
    }

    b(s sVar, w0 w0Var) {
        this.f3396a = sVar;
        this.f3397b = a.h(w0Var);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3397b.g(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f3397b.i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f3396a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
