package n5;

import android.os.Bundle;
import t5.a;
import t5.j0;
import w5.p;

abstract class r extends j0 {

    /* renamed from: b  reason: collision with root package name */
    final a f14173b;

    /* renamed from: c  reason: collision with root package name */
    final p f14174c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ u f14175d;

    r(u uVar, a aVar, p pVar) {
        this.f14175d = uVar;
        this.f14173b = aVar;
        this.f14174c = pVar;
    }

    public void a(Bundle bundle) {
        this.f14175d.f14180a.s(this.f14174c);
        this.f14173b.d("onRequestInfo", new Object[0]);
    }

    public void y(Bundle bundle) {
        this.f14175d.f14180a.s(this.f14174c);
        this.f14173b.d("onCompleteUpdate", new Object[0]);
    }
}
