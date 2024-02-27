package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList f850a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f851b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f852c;

    /* renamed from: d  reason: collision with root package name */
    t0 f853d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f854e;

    /* renamed from: f  reason: collision with root package name */
    private final u0 f855f = new a();

    class a extends u0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f856a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f857b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f857b + 1;
            this.f857b = i10;
            if (i10 == h.this.f850a.size()) {
                t0 t0Var = h.this.f853d;
                if (t0Var != null) {
                    t0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f856a) {
                this.f856a = true;
                t0 t0Var = h.this.f853d;
                if (t0Var != null) {
                    t0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f857b = 0;
            this.f856a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f854e) {
            Iterator it = this.f850a.iterator();
            while (it.hasNext()) {
                ((s0) it.next()).c();
            }
            this.f854e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f854e = false;
    }

    public h c(s0 s0Var) {
        if (!this.f854e) {
            this.f850a.add(s0Var);
        }
        return this;
    }

    public h d(s0 s0Var, s0 s0Var2) {
        this.f850a.add(s0Var);
        s0Var2.j(s0Var.d());
        this.f850a.add(s0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f854e) {
            this.f851b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f854e) {
            this.f852c = interpolator;
        }
        return this;
    }

    public h g(t0 t0Var) {
        if (!this.f854e) {
            this.f853d = t0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f854e) {
            Iterator it = this.f850a.iterator();
            while (it.hasNext()) {
                s0 s0Var = (s0) it.next();
                long j10 = this.f851b;
                if (j10 >= 0) {
                    s0Var.f(j10);
                }
                Interpolator interpolator = this.f852c;
                if (interpolator != null) {
                    s0Var.g(interpolator);
                }
                if (this.f853d != null) {
                    s0Var.h(this.f855f);
                }
                s0Var.l();
            }
            this.f854e = true;
        }
    }
}
