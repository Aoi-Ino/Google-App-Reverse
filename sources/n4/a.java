package n4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import m4.e;
import p3.m;
import q3.e;
import s3.c;
import s3.h;
import s3.i0;
import s3.k0;
import s3.o;

public class a extends h implements e {
    public static final /* synthetic */ int M = 0;
    private final boolean I = true;
    private final s3.e J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z10, s3.e eVar, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.J = eVar;
        this.K = bundle;
        this.L = eVar.g();
    }

    public static Bundle j0(s3.e eVar) {
        eVar.f();
        Integer g10 = eVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    public final int f() {
        return m.f14649a;
    }

    public final boolean n() {
        return this.I;
    }

    public final void o(f fVar) {
        o.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.J.b();
            ((g) C()).l0(new j(1, new i0(b10, ((Integer) o.i(this.L)).intValue(), "<<default account>>".equals(b10.name) ? m3.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.e0(new l(1, new p3.a(8, (PendingIntent) null), (k0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    public final void p() {
        c(new c.d());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        if (!x().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
