package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.l;
import androidx.lifecycle.b0;
import androidx.lifecycle.s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import b1.g;
import n0.k;

public class h extends i implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: h0  reason: collision with root package name */
    private Handler f3018h0;

    /* renamed from: i0  reason: collision with root package name */
    private Runnable f3019i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f3020j0 = new b();
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f3021k0 = new c();

    /* renamed from: l0  reason: collision with root package name */
    private int f3022l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    private int f3023m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f3024n0 = true;
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3025o0 = true;

    /* renamed from: p0  reason: collision with root package name */
    private int f3026p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f3027q0;

    /* renamed from: r0  reason: collision with root package name */
    private b0 f3028r0 = new d();
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public Dialog f3029s0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f3030t0;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f3031u0;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f3032v0;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f3033w0 = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            h.this.f3021k0.onDismiss(h.this.f3029s0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (h.this.f3029s0 != null) {
                h hVar = h.this;
                hVar.onCancel(hVar.f3029s0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (h.this.f3029s0 != null) {
                h hVar = h.this;
                hVar.onDismiss(hVar.f3029s0);
            }
        }
    }

    class d implements b0 {
        d() {
        }

        /* renamed from: a */
        public void b(s sVar) {
            if (sVar != null && h.this.f3025o0) {
                View F1 = h.this.F1();
                if (F1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (h.this.f3029s0 != null) {
                    if (q.J0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + h.this.f3029s0);
                    }
                    h.this.f3029s0.setContentView(F1);
                }
            }
        }
    }

    class e extends k {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3038e;

        e(k kVar) {
            this.f3038e = kVar;
        }

        public View c(int i10) {
            return this.f3038e.d() ? this.f3038e.c(i10) : h.this.e2(i10);
        }

        public boolean d() {
            return this.f3038e.d() || h.this.f2();
        }
    }

    private void a2(boolean z10, boolean z11, boolean z12) {
        if (!this.f3031u0) {
            this.f3031u0 = true;
            this.f3032v0 = false;
            Dialog dialog = this.f3029s0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3029s0.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f3018h0.getLooper()) {
                        onDismiss(this.f3029s0);
                    } else {
                        this.f3018h0.post(this.f3019i0);
                    }
                }
            }
            this.f3030t0 = true;
            if (this.f3026p0 >= 0) {
                if (z12) {
                    O().f1(this.f3026p0, 1);
                } else {
                    O().c1(this.f3026p0, 1, z10);
                }
                this.f3026p0 = -1;
                return;
            }
            x n10 = O().n();
            n10.s(true);
            n10.n(this);
            if (z12) {
                n10.j();
            } else if (z10) {
                n10.i();
            } else {
                n10.h();
            }
        }
    }

    private void g2(Bundle bundle) {
        if (this.f3025o0 && !this.f3033w0) {
            try {
                this.f3027q0 = true;
                Dialog d22 = d2(bundle);
                this.f3029s0 = d22;
                if (this.f3025o0) {
                    j2(d22, this.f3022l0);
                    Context w10 = w();
                    if (w10 instanceof Activity) {
                        this.f3029s0.setOwnerActivity((Activity) w10);
                    }
                    this.f3029s0.setCancelable(this.f3024n0);
                    this.f3029s0.setOnCancelListener(this.f3020j0);
                    this.f3029s0.setOnDismissListener(this.f3021k0);
                    this.f3033w0 = true;
                } else {
                    this.f3029s0 = null;
                }
            } finally {
                this.f3027q0 = false;
            }
        }
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        this.f3018h0 = new Handler();
        this.f3025o0 = this.C == 0;
        if (bundle != null) {
            this.f3022l0 = bundle.getInt("android:style", 0);
            this.f3023m0 = bundle.getInt("android:theme", 0);
            this.f3024n0 = bundle.getBoolean("android:cancelable", true);
            this.f3025o0 = bundle.getBoolean("android:showsDialog", this.f3025o0);
            this.f3026p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void J0() {
        super.J0();
        Dialog dialog = this.f3029s0;
        if (dialog != null) {
            this.f3030t0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3029s0.dismiss();
            if (!this.f3031u0) {
                onDismiss(this.f3029s0);
            }
            this.f3029s0 = null;
            this.f3033w0 = false;
        }
    }

    public void K0() {
        super.K0();
        if (!this.f3032v0 && !this.f3031u0) {
            this.f3031u0 = true;
        }
        j0().l(this.f3028r0);
    }

    public LayoutInflater L0(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater L0 = super.L0(bundle);
        if (!this.f3025o0 || this.f3027q0) {
            if (q.J0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f3025o0) {
                    sb2 = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb2 = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb2.append(str);
                sb2.append(str2);
                Log.d("FragmentManager", sb2.toString());
            }
            return L0;
        }
        g2(bundle);
        if (q.J0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f3029s0;
        return dialog != null ? L0.cloneInContext(dialog.getContext()) : L0;
    }

    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        Dialog dialog = this.f3029s0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f3022l0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f3023m0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f3024n0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f3025o0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f3026p0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void Y1() {
        a2(false, false, false);
    }

    public void Z0() {
        super.Z0();
        Dialog dialog = this.f3029s0;
        if (dialog != null) {
            this.f3030t0 = false;
            dialog.show();
            View decorView = this.f3029s0.getWindow().getDecorView();
            y0.a(decorView, this);
            z0.a(decorView, this);
            g.a(decorView, this);
        }
    }

    public void Z1() {
        a2(true, false, false);
    }

    public void a1() {
        super.a1();
        Dialog dialog = this.f3029s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog b2() {
        return this.f3029s0;
    }

    public void c1(Bundle bundle) {
        Bundle bundle2;
        super.c1(bundle);
        if (this.f3029s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3029s0.onRestoreInstanceState(bundle2);
        }
    }

    public int c2() {
        return this.f3023m0;
    }

    public Dialog d2(Bundle bundle) {
        if (q.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new l(E1(), c2());
    }

    /* access modifiers changed from: package-private */
    public View e2(int i10) {
        Dialog dialog = this.f3029s0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f2() {
        return this.f3033w0;
    }

    public final Dialog h2() {
        Dialog b22 = b2();
        if (b22 != null) {
            return b22;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return new e(super.i());
    }

    public void i2(boolean z10) {
        this.f3025o0 = z10;
    }

    /* access modifiers changed from: package-private */
    public void j1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.j1(layoutInflater, viewGroup, bundle);
        if (this.M == null && this.f3029s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3029s0.onRestoreInstanceState(bundle2);
        }
    }

    public void j2(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void k2(q qVar, String str) {
        this.f3031u0 = false;
        this.f3032v0 = true;
        x n10 = qVar.n();
        n10.s(true);
        n10.e(this, str);
        n10.h();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3030t0) {
            if (q.J0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            a2(true, true, false);
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
    }

    public void z0(Context context) {
        super.z0(context);
        j0().h(this.f3028r0);
        if (!this.f3032v0) {
            this.f3031u0 = false;
        }
    }
}
