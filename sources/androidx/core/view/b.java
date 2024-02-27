package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2562a;

    /* renamed from: b  reason: collision with root package name */
    private a f2563b;

    /* renamed from: c  reason: collision with root package name */
    private C0040b f2564c;

    public interface a {
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    public interface C0040b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f2562a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f2564c = null;
        this.f2563b = null;
    }

    public void h(a aVar) {
        this.f2563b = aVar;
    }

    public abstract void i(C0040b bVar);
}
