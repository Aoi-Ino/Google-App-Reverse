package n5;

import android.os.Bundle;
import t5.a;
import w5.p;

final class t extends r {

    /* renamed from: e  reason: collision with root package name */
    private final String f14176e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u f14177f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(u uVar, p pVar, String str) {
        super(uVar, new a("OnRequestInstallCallback"), pVar);
        this.f14177f = uVar;
        this.f14176e = str;
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f14174c.d(new r5.a(bundle.getInt("error.code", -2)));
        } else {
            this.f14174c.e(u.d(this.f14177f, bundle, this.f14176e));
        }
    }
}
