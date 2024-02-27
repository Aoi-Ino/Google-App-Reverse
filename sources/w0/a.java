package w0;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import c0.c;
import cm.l;
import h.b;
import java.lang.ref.WeakReference;
import pl.o;
import pl.t;
import t0.d;
import t0.k;
import t0.p;

public abstract class a implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17809a;

    /* renamed from: b  reason: collision with root package name */
    private final d f17810b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f17811c;

    /* renamed from: d  reason: collision with root package name */
    private b f17812d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f17813e;

    public a(Context context, d dVar) {
        l.f(context, "context");
        l.f(dVar, "configuration");
        this.f17809a = context;
        this.f17810b = dVar;
        c b10 = dVar.b();
        this.f17811c = b10 != null ? new WeakReference(b10) : null;
    }

    private final void b(boolean z10) {
        o oVar;
        b bVar = this.f17812d;
        if (bVar == null || (oVar = t.a(bVar, Boolean.TRUE)) == null) {
            b bVar2 = new b(this.f17809a);
            this.f17812d = bVar2;
            oVar = t.a(bVar2, Boolean.FALSE);
        }
        b bVar3 = (b) oVar.a();
        boolean booleanValue = ((Boolean) oVar.b()).booleanValue();
        c(bVar3, z10 ? k.nav_app_bar_open_drawer_description : k.nav_app_bar_navigate_up_description);
        float f10 = z10 ? 0.0f : 1.0f;
        if (booleanValue) {
            float a10 = bVar3.a();
            ValueAnimator valueAnimator = this.f17813e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar3, "progress", new float[]{a10, f10});
            this.f17813e = ofFloat;
            l.d(ofFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            ofFloat.start();
            return;
        }
        bVar3.setProgress(f10);
    }

    public void a(k kVar, p pVar, Bundle bundle) {
        l.f(kVar, "controller");
        l.f(pVar, "destination");
        if (!(pVar instanceof d)) {
            WeakReference weakReference = this.f17811c;
            c cVar = weakReference != null ? (c) weakReference.get() : null;
            if (this.f17811c == null || cVar != null) {
                String B = pVar.B(this.f17809a, bundle);
                if (B != null) {
                    d(B);
                }
                boolean c10 = this.f17810b.c(pVar);
                boolean z10 = false;
                if (cVar != null || !c10) {
                    if (cVar != null && c10) {
                        z10 = true;
                    }
                    b(z10);
                    return;
                }
                c((Drawable) null, 0);
                return;
            }
            kVar.h0(this);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(Drawable drawable, int i10);

    /* access modifiers changed from: protected */
    public abstract void d(CharSequence charSequence);
}
