package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.v;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.core.app.h;
import androidx.core.app.s;
import androidx.core.os.i;
import androidx.fragment.app.j;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import b1.d;
import b1.g;

public abstract class d extends j implements e, s.a {
    private g E;
    private Resources F;

    class a implements d.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.P0().C(bundle);
            return bundle;
        }
    }

    class b implements c.b {
        b() {
        }

        public void a(Context context) {
            g P0 = d.this.P0();
            P0.t();
            P0.y(d.this.l().b("androidx:appcompat"));
        }
    }

    public d() {
        S0();
    }

    private void S0() {
        l().h("androidx:appcompat", new a());
        o0(new b());
    }

    private void T0() {
        y0.a(getWindow().getDecorView(), this);
        z0.a(getWindow().getDecorView(), this);
        g.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a1(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.d.a1(android.view.KeyEvent):boolean");
    }

    public void B(androidx.appcompat.view.b bVar) {
    }

    public g P0() {
        if (this.E == null) {
            this.E = g.h(this, this);
        }
        return this.E;
    }

    public b Q0() {
        return P0().n();
    }

    public a R0() {
        return P0().s();
    }

    public Intent T() {
        return h.a(this);
    }

    public void U0(s sVar) {
        sVar.o(this);
    }

    /* access modifiers changed from: protected */
    public void V0(i iVar) {
    }

    /* access modifiers changed from: protected */
    public void W0(int i10) {
    }

    public void X0(s sVar) {
    }

    public void Y0() {
    }

    public boolean Z0() {
        Intent T = T();
        if (T == null) {
            return false;
        }
        if (e1(T)) {
            s s10 = s.s(this);
            U0(s10);
            X0(s10);
            s10.B();
            try {
                androidx.core.app.b.p(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            d1(T);
            return true;
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        T0();
        P0().e(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(P0().g(context));
    }

    public void b1(Toolbar toolbar) {
        P0().N(toolbar);
    }

    public void c1() {
        P0().u();
    }

    public void closeOptionsMenu() {
        a R0 = R0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (R0 == null || !R0.g()) {
            super.closeOptionsMenu();
        }
    }

    public void d1(Intent intent) {
        h.e(this, intent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a R0 = R0();
        if (keyCode != 82 || R0 == null || !R0.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public androidx.appcompat.view.b e0(b.a aVar) {
        return null;
    }

    public boolean e1(Intent intent) {
        return h.f(this, intent);
    }

    public View findViewById(int i10) {
        return P0().j(i10);
    }

    public MenuInflater getMenuInflater() {
        return P0().q();
    }

    public Resources getResources() {
        if (this.F == null && f1.d()) {
            this.F = new f1(this, super.getResources());
        }
        Resources resources = this.F;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        P0().u();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P0().x(configuration);
        if (this.F != null) {
            this.F.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        Y0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        P0().z();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (a1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a R0 = R0();
        if (menuItem.getItemId() != 16908332 || R0 == null || (R0.j() & 4) == 0) {
            return false;
        }
        return Z0();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        P0().A(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        P0().B();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        P0().D();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        P0().E();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        P0().P(charSequence);
    }

    public void openOptionsMenu() {
        a R0 = R0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (R0 == null || !R0.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i10) {
        T0();
        P0().J(i10);
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        P0().O(i10);
    }

    public void v(androidx.appcompat.view.b bVar) {
    }

    public void setContentView(View view) {
        T0();
        P0().K(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        T0();
        P0().L(view, layoutParams);
    }
}
