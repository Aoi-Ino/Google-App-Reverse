package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.z0;
import androidx.core.view.m0;
import java.util.ArrayList;

class z extends a {

    /* renamed from: a  reason: collision with root package name */
    final e0 f778a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f779b;

    /* renamed from: c  reason: collision with root package name */
    final h.g f780c;

    /* renamed from: d  reason: collision with root package name */
    boolean f781d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f782e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f783f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f784g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f785h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f786i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            z.this.B();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return z.this.f779b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f789e;

        c() {
        }

        public void b(g gVar, boolean z10) {
            if (!this.f789e) {
                this.f789e = true;
                z.this.f778a.h();
                z.this.f779b.onPanelClosed(108, gVar);
                this.f789e = false;
            }
        }

        public boolean c(g gVar) {
            z.this.f779b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            if (z.this.f778a.b()) {
                z.this.f779b.onPanelClosed(108, gVar);
            } else if (z.this.f779b.onPreparePanel(0, (View) null, gVar)) {
                z.this.f779b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements h.g {
        e() {
        }

        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            z zVar = z.this;
            if (zVar.f781d) {
                return false;
            }
            zVar.f778a.c();
            z.this.f781d = true;
            return false;
        }

        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(z.this.f778a.getContext());
            }
            return null;
        }
    }

    z(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f786i = bVar;
        androidx.core.util.g.g(toolbar);
        z0 z0Var = new z0(toolbar, false);
        this.f778a = z0Var;
        this.f779b = (Window.Callback) androidx.core.util.g.g(callback);
        z0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        z0Var.setWindowTitle(charSequence);
        this.f780c = new e();
    }

    private Menu A() {
        if (!this.f782e) {
            this.f778a.i(new c(), new d());
            this.f782e = true;
        }
        return this.f778a.q();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.A()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.g
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.g) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.h0()
        L_0x0013:
            r0.clear()     // Catch:{ all -> 0x0028 }
            android.view.Window$Callback r3 = r5.f779b     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            android.view.Window$Callback r3 = r5.f779b     // Catch:{ all -> 0x0028 }
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002d
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0.clear()     // Catch:{ all -> 0x0028 }
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.g0()
        L_0x0032:
            return
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.g0()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.B():void");
    }

    public void C(int i10, int i11) {
        this.f778a.o((i10 & i11) | ((~i11) & this.f778a.p()));
    }

    public boolean g() {
        return this.f778a.e();
    }

    public boolean h() {
        if (!this.f778a.n()) {
            return false;
        }
        this.f778a.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f783f) {
            this.f783f = z10;
            if (this.f784g.size() > 0) {
                android.support.v4.media.session.b.a(this.f784g.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f778a.p();
    }

    public Context k() {
        return this.f778a.getContext();
    }

    public boolean l() {
        this.f778a.l().removeCallbacks(this.f785h);
        m0.i0(this.f778a.l(), this.f785h);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f778a.l().removeCallbacks(this.f785h);
    }

    public boolean o(int i10, KeyEvent keyEvent) {
        Menu A = A();
        if (A == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        A.setQwertyMode(z10);
        return A.performShortcut(i10, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.f778a.f();
    }

    public void r(boolean z10) {
    }

    public void s(boolean z10) {
        C(z10 ? 4 : 0, 4);
    }

    public void t(boolean z10) {
        C(z10 ? 8 : 0, 8);
    }

    public void u(int i10) {
        this.f778a.s(i10);
    }

    public void v(Drawable drawable) {
        this.f778a.x(drawable);
    }

    public void w(boolean z10) {
    }

    public void x(CharSequence charSequence) {
        this.f778a.setTitle(charSequence);
    }

    public void y(CharSequence charSequence) {
        this.f778a.setWindowTitle(charSequence);
    }
}
