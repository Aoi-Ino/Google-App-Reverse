package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.h;
import androidx.activity.s;
import androidx.core.app.b;
import androidx.core.app.n;
import androidx.core.app.o;
import androidx.core.content.c;
import androidx.core.view.v;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b1.f;
import d.d;
import d.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n0.g;
import n0.i;
import n0.q;

public abstract class j extends h implements b.f {
    final u A = new u(this);
    boolean B;
    boolean C;
    boolean D = true;

    /* renamed from: z  reason: collision with root package name */
    final l f3096z = l.b(new a());

    class a extends n implements androidx.core.content.b, c, n, o, x0, s, e, f, q, androidx.core.view.s {
        public a() {
            super(j.this);
        }

        public void C(androidx.core.util.a aVar) {
            j.this.C(aVar);
        }

        public void E(androidx.core.util.a aVar) {
            j.this.E(aVar);
        }

        public void F(androidx.core.util.a aVar) {
            j.this.F(aVar);
        }

        public void L(androidx.core.util.a aVar) {
            j.this.L(aVar);
        }

        public void M(v vVar) {
            j.this.M(vVar);
        }

        public d O() {
            return j.this.O();
        }

        public void R(androidx.core.util.a aVar) {
            j.this.R(aVar);
        }

        public w0 X() {
            return j.this.X();
        }

        public void a(q qVar, i iVar) {
            j.this.N0(iVar);
        }

        public View c(int i10) {
            return j.this.findViewById(i10);
        }

        public void c0(androidx.core.util.a aVar) {
            j.this.c0(aVar);
        }

        public boolean d() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public k d0() {
            return j.this.A;
        }

        public void g0(androidx.core.util.a aVar) {
            j.this.g0(aVar);
        }

        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater j() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }

        public androidx.activity.q k() {
            return j.this.k();
        }

        public b1.d l() {
            return j.this.l();
        }

        public boolean n(String str) {
            return b.u(j.this, str);
        }

        public void o(v vVar) {
            j.this.o(vVar);
        }

        public void q() {
            r();
        }

        public void r() {
            j.this.t0();
        }

        /* renamed from: s */
        public j i() {
            return j.this;
        }

        public void t(androidx.core.util.a aVar) {
            j.this.t(aVar);
        }
    }

    public j() {
        G0();
    }

    private void G0() {
        l().h("android:support:lifecycle", new g(this));
        t(new n0.h(this));
        p0(new i(this));
        o0(new n0.j(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle H0() {
        L0();
        this.A.i(k.a.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I0(Configuration configuration) {
        this.f3096z.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J0(Intent intent) {
        this.f3096z.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K0(Context context) {
        this.f3096z.a((i) null);
    }

    private static boolean M0(q qVar, k.b bVar) {
        boolean z10 = false;
        for (i iVar : qVar.v0()) {
            if (iVar != null) {
                if (iVar.F() != null) {
                    z10 |= M0(iVar.v(), bVar);
                }
                b0 b0Var = iVar.Y;
                if (b0Var != null && b0Var.d0().b().b(k.b.STARTED)) {
                    iVar.Y.f(bVar);
                    z10 = true;
                }
                if (iVar.X.b().b(k.b.STARTED)) {
                    iVar.X.o(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final View E0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3096z.n(view, str, context, attributeSet);
    }

    public q F0() {
        return this.f3096z.l();
    }

    /* access modifiers changed from: package-private */
    public void L0() {
        do {
        } while (M0(F0(), k.b.CREATED));
    }

    public void N0(i iVar) {
    }

    /* access modifiers changed from: protected */
    public void O0() {
        this.A.i(k.a.ON_RESUME);
        this.f3096z.h();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (h0(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.B);
            printWriter.print(" mResumed=");
            printWriter.print(this.C);
            printWriter.print(" mStopped=");
            printWriter.print(this.D);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f3096z.l().V(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void j(int i10) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f3096z.m();
        super.onActivityResult(i10, i11, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.i(k.a.ON_CREATE);
        this.f3096z.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View E0 = E0(view, str, context, attributeSet);
        return E0 == null ? super.onCreateView(view, str, context, attributeSet) : E0;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3096z.f();
        this.A.i(k.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f3096z.d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.C = false;
        this.f3096z.g();
        this.A.i(k.a.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        O0();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f3096z.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f3096z.m();
        super.onResume();
        this.C = true;
        this.f3096z.k();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f3096z.m();
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            this.f3096z.c();
        }
        this.f3096z.k();
        this.A.i(k.a.ON_START);
        this.f3096z.i();
    }

    public void onStateNotSaved() {
        this.f3096z.m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.D = true;
        L0();
        this.f3096z.j();
        this.A.i(k.a.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View E0 = E0((View) null, str, context, attributeSet);
        return E0 == null ? super.onCreateView(str, context, attributeSet) : E0;
    }
}
