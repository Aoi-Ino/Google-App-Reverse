package b5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final View f4443a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4444b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f4445c = 0;

    public b(a aVar) {
        this.f4443a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f4443a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f4443a);
        }
    }

    public int b() {
        return this.f4445c;
    }

    public boolean c() {
        return this.f4444b;
    }

    public void d(Bundle bundle) {
        this.f4444b = bundle.getBoolean("expanded", false);
        this.f4445c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f4444b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f4444b);
        bundle.putInt("expandedComponentIdHint", this.f4445c);
        return bundle;
    }

    public void f(int i10) {
        this.f4445c = i10;
    }
}
