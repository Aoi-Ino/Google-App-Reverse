package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class a implements c {
    a() {
    }

    private d p(b bVar) {
        return (d) bVar.f();
    }

    public float a(b bVar) {
        return p(bVar).c();
    }

    public ColorStateList b(b bVar) {
        return p(bVar).b();
    }

    public void c(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.c(new d(colorStateList, f10));
        View b10 = bVar.b();
        b10.setClipToOutline(true);
        b10.setElevation(f11);
        o(bVar, f12);
    }

    public void d(b bVar, float f10) {
        p(bVar).h(f10);
    }

    public float e(b bVar) {
        return bVar.b().getElevation();
    }

    public void f(b bVar) {
        if (!bVar.e()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float a10 = a(bVar);
        float h10 = h(bVar);
        int ceil = (int) Math.ceil((double) e.a(a10, h10, bVar.d()));
        int ceil2 = (int) Math.ceil((double) e.b(a10, h10, bVar.d()));
        bVar.a(ceil, ceil2, ceil, ceil2);
    }

    public void g() {
    }

    public float h(b bVar) {
        return p(bVar).d();
    }

    public float i(b bVar) {
        return h(bVar) * 2.0f;
    }

    public float j(b bVar) {
        return h(bVar) * 2.0f;
    }

    public void k(b bVar) {
        o(bVar, a(bVar));
    }

    public void l(b bVar, float f10) {
        bVar.b().setElevation(f10);
    }

    public void m(b bVar) {
        o(bVar, a(bVar));
    }

    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    public void o(b bVar, float f10) {
        p(bVar).g(f10, bVar.e(), bVar.d());
        f(bVar);
    }
}
