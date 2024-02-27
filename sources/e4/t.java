package e4;

import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import i4.n;

final class t extends n {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p f10084b;

    t(p pVar) {
        this.f10084b = pVar;
    }

    public final void g() {
        this.f10084b.a().c(new s(this));
    }

    public final void j0(LocationResult locationResult) {
        this.f10084b.a().c(new q(this, locationResult));
    }

    /* access modifiers changed from: package-private */
    public final t l0(c cVar) {
        this.f10084b.i(cVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void m0() {
        this.f10084b.a().a();
    }

    public final void z(LocationAvailability locationAvailability) {
        this.f10084b.a().c(new r(this, locationAvailability));
    }
}
