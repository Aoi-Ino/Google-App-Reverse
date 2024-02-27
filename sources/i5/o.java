package i5;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import t4.a;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    boolean f12477a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f12478b = false;

    /* renamed from: c  reason: collision with root package name */
    k f12479c;

    /* renamed from: d  reason: collision with root package name */
    RectF f12480d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    final Path f12481e = new Path();

    public static o a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new q(view) : new p(view);
    }

    private boolean c() {
        RectF rectF = this.f12480d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void j() {
        if (c() && this.f12479c != null) {
            l.k().d(this.f12479c, 1.0f, this.f12480d, this.f12481e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void b(View view);

    public void d(Canvas canvas, a.C0225a aVar) {
        if (!i() || this.f12481e.isEmpty()) {
            aVar.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f12481e);
        aVar.a(canvas);
        canvas.restore();
    }

    public void e(View view, RectF rectF) {
        this.f12480d = rectF;
        j();
        b(view);
    }

    public void f(View view, k kVar) {
        this.f12479c = kVar;
        j();
        b(view);
    }

    public void g(View view, boolean z10) {
        if (z10 != this.f12477a) {
            this.f12477a = z10;
            b(view);
        }
    }

    public void h(View view, boolean z10) {
        this.f12478b = z10;
        b(view);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();
}
