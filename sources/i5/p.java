package i5;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

class p extends o {

    /* renamed from: f  reason: collision with root package name */
    private boolean f12482f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f12483g = 0.0f;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            p pVar = p.this;
            if (pVar.f12479c != null && !pVar.f12480d.isEmpty()) {
                p pVar2 = p.this;
                RectF rectF = pVar2.f12480d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, pVar2.f12483g);
            }
        }
    }

    p(View view) {
        m(view);
    }

    private float l() {
        RectF rectF;
        k kVar = this.f12479c;
        if (kVar == null || (rectF = this.f12480d) == null) {
            return 0.0f;
        }
        return kVar.f12412f.a(rectF);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean n() {
        k kVar;
        if (this.f12480d.isEmpty() || (kVar = this.f12479c) == null) {
            return false;
        }
        return kVar.u(this.f12480d);
    }

    private boolean o() {
        k kVar;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float f13;
        if (!this.f12480d.isEmpty() && (kVar = this.f12479c) != null && this.f12478b && !kVar.u(this.f12480d) && p(this.f12479c)) {
            float a10 = this.f12479c.r().a(this.f12480d);
            float a11 = this.f12479c.t().a(this.f12480d);
            float a12 = this.f12479c.j().a(this.f12480d);
            float a13 = this.f12479c.l().a(this.f12480d);
            int i10 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i10 == 0 && a12 == 0.0f && a11 == a13) {
                RectF rectF2 = this.f12480d;
                rectF2.set(rectF2.left - a11, rectF2.top, rectF2.right, rectF2.bottom);
                this.f12483g = a11;
                return true;
            } else if (i10 == 0 && a11 == 0.0f && a12 == a13) {
                RectF rectF3 = this.f12480d;
                rectF3.set(rectF3.left, rectF3.top - a12, rectF3.right, rectF3.bottom);
                this.f12483g = a12;
                return true;
            } else {
                if (a11 == 0.0f && a13 == 0.0f && a10 == a12) {
                    rectF = this.f12480d;
                    f10 = rectF.left;
                    f11 = rectF.top;
                    f12 = rectF.right + a10;
                    f13 = rectF.bottom;
                } else if (a12 == 0.0f && a13 == 0.0f && a10 == a11) {
                    rectF = this.f12480d;
                    f10 = rectF.left;
                    f11 = rectF.top;
                    f12 = rectF.right;
                    f13 = rectF.bottom + a10;
                }
                rectF.set(f10, f11, f12, f13);
                this.f12483g = a10;
                return true;
            }
        }
        return false;
    }

    private static boolean p(k kVar) {
        return (kVar.q() instanceof j) && (kVar.s() instanceof j) && (kVar.i() instanceof j) && (kVar.k() instanceof j);
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        this.f12483g = l();
        this.f12482f = n() || o();
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return !this.f12482f || this.f12477a;
    }
}
