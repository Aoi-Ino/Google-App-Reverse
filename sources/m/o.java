package m;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import m.q;

public class o extends i {

    /* renamed from: h0  reason: collision with root package name */
    private r f13576h0;

    /* renamed from: i0  reason: collision with root package name */
    private Handler f13577i0 = new Handler(Looper.getMainLooper());

    private static class a {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    private static class b {
        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    private static class d {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    private static class e implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final Handler f13578e = new Handler(Looper.getMainLooper());

        e() {
        }

        public void execute(Runnable runnable) {
            this.f13578e.post(runnable);
        }
    }

    private static class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f13579e;

        f(o oVar) {
            this.f13579e = new WeakReference(oVar);
        }

        public void run() {
            if (this.f13579e.get() != null) {
                ((o) this.f13579e.get()).c3();
            }
        }
    }

    private static class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f13580e;

        g(r rVar) {
            this.f13580e = new WeakReference(rVar);
        }

        public void run() {
            if (this.f13580e.get() != null) {
                ((r) this.f13580e.get()).V(false);
            }
        }
    }

    private static class h implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f13581e;

        h(r rVar) {
            this.f13581e = new WeakReference(rVar);
        }

        public void run() {
            if (this.f13581e.get() != null) {
                ((r) this.f13581e.get()).b0(false);
            }
        }
    }

    private boolean A2() {
        return Build.VERSION.SDK_INT < 28 || u2() || v2();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B2(q.b bVar) {
        if (bVar != null) {
            R2(bVar);
            this.f13576h0.N((q.b) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C2(c cVar) {
        if (cVar != null) {
            O2(cVar.b(), cVar.c());
            this.f13576h0.K((c) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D2(CharSequence charSequence) {
        if (charSequence != null) {
            Q2(charSequence);
            this.f13576h0.K((c) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E2(Boolean bool) {
        if (bool.booleanValue()) {
            P2();
            this.f13576h0.L(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F2(Boolean bool) {
        if (bool.booleanValue()) {
            if (z2()) {
                T2();
            } else {
                S2();
            }
            this.f13576h0.c0(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G2(Boolean bool) {
        if (bool.booleanValue()) {
            j2(1);
            m2();
            this.f13576h0.W(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I2(int i10, CharSequence charSequence) {
        this.f13576h0.n().a(i10, charSequence);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J2() {
        this.f13576h0.n().b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K2(q.b bVar) {
        this.f13576h0.n().c(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L2() {
        this.f13576h0.X(false);
    }

    private void M2() {
        Context w10 = w();
        KeyguardManager a10 = w10 != null ? x.a(w10) : null;
        if (a10 == null) {
            H2(12, e0(e0.generic_error_no_keyguard));
            return;
        }
        CharSequence y10 = this.f13576h0.y();
        CharSequence x10 = this.f13576h0.x();
        CharSequence q10 = this.f13576h0.q();
        if (x10 == null) {
            x10 = q10;
        }
        Intent a11 = a.a(a10, y10, x10);
        if (a11 == null) {
            H2(14, e0(e0.generic_error_no_device_credential));
            return;
        }
        this.f13576h0.T(true);
        if (A2()) {
            n2();
        }
        a11.setFlags(134742016);
        startActivityForResult(a11, 1);
    }

    static o N2(boolean z10) {
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z10);
        oVar.K1(bundle);
        return oVar;
    }

    private void V2(int i10, CharSequence charSequence) {
        if (this.f13576h0.C()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f13576h0.A()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f13576h0.O(false);
            this.f13576h0.o().execute(new f(this, i10, charSequence));
        }
    }

    private void W2() {
        if (!this.f13576h0.A()) {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        } else {
            this.f13576h0.o().execute(new e(this));
        }
    }

    private void X2(q.b bVar) {
        Y2(bVar);
        m2();
    }

    private void Y2(q.b bVar) {
        if (!this.f13576h0.A()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
            return;
        }
        this.f13576h0.O(false);
        this.f13576h0.o().execute(new g(this, bVar));
    }

    private void Z2() {
        BiometricPrompt.Builder d10 = b.d(E1().getApplicationContext());
        CharSequence y10 = this.f13576h0.y();
        CharSequence x10 = this.f13576h0.x();
        CharSequence q10 = this.f13576h0.q();
        if (y10 != null) {
            b.h(d10, y10);
        }
        if (x10 != null) {
            b.g(d10, x10);
        }
        if (q10 != null) {
            b.e(d10, q10);
        }
        CharSequence w10 = this.f13576h0.w();
        if (!TextUtils.isEmpty(w10)) {
            b.f(d10, w10, this.f13576h0.o(), this.f13576h0.v());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            c.a(d10, this.f13576h0.B());
        }
        int g10 = this.f13576h0.g();
        if (i10 >= 30) {
            d.a(d10, g10);
        } else if (i10 >= 29) {
            c.b(d10, b.d(g10));
        }
        h2(b.c(d10), w());
    }

    private void a3() {
        Context applicationContext = E1().getApplicationContext();
        androidx.core.hardware.fingerprint.a b10 = androidx.core.hardware.fingerprint.a.b(applicationContext);
        int k22 = k2(b10);
        if (k22 != 0) {
            H2(k22, v.a(applicationContext, k22));
        } else if (n0()) {
            this.f13576h0.X(true);
            if (!u.f(applicationContext, Build.MODEL)) {
                this.f13577i0.postDelayed(new d(this), 500);
                w.p2(w2()).k2(O(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f13576h0.P(0);
            i2(b10, applicationContext);
        }
    }

    private void b3(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = e0(e0.default_error_msg);
        }
        this.f13576h0.a0(2);
        this.f13576h0.Y(charSequence);
    }

    private static int k2(androidx.core.hardware.fingerprint.a aVar) {
        if (!aVar.e()) {
            return 12;
        }
        return !aVar.d() ? 11 : 0;
    }

    private void l2() {
        this.f13576h0.Q(q());
        this.f13576h0.k().g(this, new h(this));
        this.f13576h0.i().g(this, new i(this));
        this.f13576h0.j().g(this, new j(this));
        this.f13576h0.z().g(this, new k(this));
        this.f13576h0.H().g(this, new l(this));
        this.f13576h0.E().g(this, new m(this));
    }

    private void n2() {
        this.f13576h0.f0(false);
        if (n0()) {
            androidx.fragment.app.q O = O();
            w wVar = (w) O.h0("androidx.biometric.FingerprintDialogFragment");
            if (wVar == null) {
                return;
            }
            if (wVar.n0()) {
                wVar.Z1();
            } else {
                O.n().n(wVar).i();
            }
        }
    }

    private int o2() {
        Context w10 = w();
        return (w10 == null || !u.f(w10, Build.MODEL)) ? 2000 : 0;
    }

    private void p2(int i10) {
        int i11 = -1;
        if (i10 == -1) {
            if (this.f13576h0.J()) {
                this.f13576h0.g0(false);
            } else {
                i11 = 1;
            }
            X2(new q.b((q.c) null, i11));
            return;
        }
        H2(10, e0(e0.generic_error_user_canceled));
    }

    private boolean q2() {
        return u().getBoolean("has_face", y.a(w()));
    }

    private boolean r2() {
        return u().getBoolean("has_fingerprint", y.b(w()));
    }

    private boolean s2() {
        return u().getBoolean("has_iris", y.c(w()));
    }

    private boolean t2() {
        j q10 = q();
        return q10 != null && q10.isChangingConfigurations();
    }

    private boolean u2() {
        Context w10 = w();
        return (w10 == null || this.f13576h0.p() == null || !u.g(w10, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean v2() {
        return Build.VERSION.SDK_INT == 28 && !r2();
    }

    private boolean w2() {
        return u().getBoolean("host_activity", true);
    }

    private boolean x2() {
        Context w10 = w();
        if (w10 == null || !u.h(w10, Build.MANUFACTURER)) {
            return false;
        }
        int g10 = this.f13576h0.g();
        if (!b.g(g10) || !b.d(g10)) {
            return false;
        }
        this.f13576h0.g0(true);
        return true;
    }

    private boolean y2() {
        Context w10 = w();
        if (Build.VERSION.SDK_INT != 29 || r2() || q2() || s2()) {
            return z2() && p.g(w10).a(255) != 0;
        }
        return true;
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (this.f13576h0 == null) {
            this.f13576h0 = q.e(this, w2());
        }
        l2();
    }

    /* access modifiers changed from: package-private */
    public void O2(int i10, CharSequence charSequence) {
        if (!v.b(i10)) {
            i10 = 8;
        }
        Context w10 = w();
        if (Build.VERSION.SDK_INT < 29 && v.c(i10) && w10 != null && x.b(w10) && b.d(this.f13576h0.g())) {
            M2();
        } else if (A2()) {
            if (charSequence == null) {
                charSequence = v.a(w(), i10);
            }
            if (i10 == 5) {
                int l10 = this.f13576h0.l();
                if (l10 == 0 || l10 == 3) {
                    V2(i10, charSequence);
                }
                m2();
                return;
            }
            if (this.f13576h0.F()) {
                H2(i10, charSequence);
            } else {
                b3(charSequence);
                this.f13577i0.postDelayed(new n(this, i10, charSequence), (long) o2());
            }
            this.f13576h0.X(true);
        } else {
            if (charSequence == null) {
                charSequence = e0(e0.default_error_msg) + " " + i10;
            }
            H2(i10, charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void P2() {
        if (A2()) {
            b3(e0(e0.fingerprint_not_recognized));
        }
        W2();
    }

    /* access modifiers changed from: package-private */
    public void Q2(CharSequence charSequence) {
        if (A2()) {
            b3(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R2(q.b bVar) {
        X2(bVar);
    }

    /* access modifiers changed from: package-private */
    public void S2() {
        CharSequence w10 = this.f13576h0.w();
        if (w10 == null) {
            w10 = e0(e0.default_error_msg);
        }
        H2(13, w10);
        j2(2);
    }

    /* access modifiers changed from: package-private */
    public void T2() {
        M2();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U2 */
    public void H2(int i10, CharSequence charSequence) {
        V2(i10, charSequence);
        m2();
    }

    public void Z0() {
        super.Z0();
        if (Build.VERSION.SDK_INT == 29 && b.d(this.f13576h0.g())) {
            this.f13576h0.b0(true);
            this.f13577i0.postDelayed(new h(this.f13576h0), 250);
        }
    }

    public void a1() {
        super.a1();
        if (Build.VERSION.SDK_INT < 29 && !this.f13576h0.C() && !t2()) {
            j2(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void c3() {
        if (this.f13576h0.I()) {
            return;
        }
        if (w() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f13576h0.f0(true);
        this.f13576h0.O(true);
        if (x2()) {
            M2();
        } else if (A2()) {
            a3();
        } else {
            Z2();
        }
    }

    /* access modifiers changed from: package-private */
    public void g2(q.d dVar, q.c cVar) {
        r rVar;
        r rVar2;
        String str;
        this.f13576h0.e0(dVar);
        int c10 = b.c(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && c10 == 15 && cVar == null) {
            rVar = this.f13576h0;
            cVar = t.a();
        } else {
            rVar = this.f13576h0;
        }
        rVar.U(cVar);
        if (z2()) {
            rVar2 = this.f13576h0;
            str = e0(e0.confirm_device_credential_password);
        } else {
            rVar2 = this.f13576h0;
            str = null;
        }
        rVar2.d0(str);
        if (y2()) {
            this.f13576h0.O(true);
            M2();
        } else if (this.f13576h0.D()) {
            this.f13577i0.postDelayed(new f(this), 600);
        } else {
            c3();
        }
    }

    /* access modifiers changed from: package-private */
    public void h2(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject d10 = t.d(this.f13576h0.p());
        CancellationSignal b10 = this.f13576h0.m().b();
        e eVar = new e();
        BiometricPrompt$AuthenticationCallback a10 = this.f13576h0.h().a();
        if (d10 == null) {
            try {
                b.b(biometricPrompt, b10, eVar, a10);
            } catch (NullPointerException e10) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
                H2(1, context != null ? context.getString(e0.default_error_msg) : "");
            }
        } else {
            b.a(biometricPrompt, d10, b10, eVar, a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void i2(androidx.core.hardware.fingerprint.a aVar, Context context) {
        try {
            aVar.a(t.e(this.f13576h0.p()), 0, this.f13576h0.m().c(), this.f13576h0.h().b(), (Handler) null);
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            H2(1, v.a(context, 1));
        }
    }

    /* access modifiers changed from: package-private */
    public void j2(int i10) {
        if (i10 == 3 || !this.f13576h0.G()) {
            if (A2()) {
                this.f13576h0.P(i10);
                if (i10 == 1) {
                    V2(10, v.a(w(), 10));
                }
            }
            this.f13576h0.m().a();
        }
    }

    /* access modifiers changed from: package-private */
    public void m2() {
        n2();
        this.f13576h0.f0(false);
        if (!this.f13576h0.C() && n0()) {
            O().n().n(this).i();
        }
        Context w10 = w();
        if (w10 != null && u.e(w10, Build.MODEL)) {
            this.f13576h0.V(true);
            this.f13577i0.postDelayed(new g(this.f13576h0), 600);
        }
    }

    public void x0(int i10, int i11, Intent intent) {
        super.x0(i10, i11, intent);
        if (i10 == 1) {
            this.f13576h0.T(false);
            p2(i11);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean z2() {
        return Build.VERSION.SDK_INT <= 28 && b.d(this.f13576h0.g());
    }
}
