package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.g;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final n f3105a;

    private l(n nVar) {
        this.f3105a = nVar;
    }

    public static l b(n nVar) {
        return new l((n) g.h(nVar, "callbacks == null"));
    }

    public void a(i iVar) {
        n nVar = this.f3105a;
        nVar.f3111i.l(nVar, nVar, iVar);
    }

    public void c() {
        this.f3105a.f3111i.w();
    }

    public boolean d(MenuItem menuItem) {
        return this.f3105a.f3111i.z(menuItem);
    }

    public void e() {
        this.f3105a.f3111i.A();
    }

    public void f() {
        this.f3105a.f3111i.C();
    }

    public void g() {
        this.f3105a.f3111i.L();
    }

    public void h() {
        this.f3105a.f3111i.P();
    }

    public void i() {
        this.f3105a.f3111i.Q();
    }

    public void j() {
        this.f3105a.f3111i.S();
    }

    public boolean k() {
        return this.f3105a.f3111i.Z(true);
    }

    public q l() {
        return this.f3105a.f3111i;
    }

    public void m() {
        this.f3105a.f3111i.Z0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3105a.f3111i.x0().onCreateView(view, str, context, attributeSet);
    }
}
