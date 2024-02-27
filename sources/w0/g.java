package w0;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c0.c;
import cm.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import t0.b;
import t0.d;
import t0.k;
import t0.p;
import t0.q;
import t0.v;
import w0.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f17823a = new g();

    public static final class a implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f17824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f17825b;

        a(WeakReference weakReference, k kVar) {
            this.f17824a = weakReference;
            this.f17825b = kVar;
        }

        public void a(k kVar, p pVar, Bundle bundle) {
            l.f(kVar, "controller");
            l.f(pVar, "destination");
            NavigationView navigationView = (NavigationView) this.f17824a.get();
            if (navigationView == null) {
                this.f17825b.h0(this);
            } else if (!(pVar instanceof d)) {
                Menu menu = navigationView.getMenu();
                l.e(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    l.b(item, "getItem(index)");
                    item.setChecked(g.c(pVar, item.getItemId()));
                }
            }
        }
    }

    private g() {
    }

    public static final BottomSheetBehavior b(View view) {
        l.f(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return b((View) parent);
            }
            return null;
        }
        CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
        if (!(f10 instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) f10;
    }

    public static final boolean c(p pVar, int i10) {
        l.f(pVar, "<this>");
        for (p H : p.f16420n.c(pVar)) {
            if (H.H() == i10) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(k kVar, d dVar) {
        l.f(kVar, "navController");
        l.f(dVar, "configuration");
        c b10 = dVar.b();
        p D = kVar.D();
        if (b10 != null && D != null && dVar.c(D)) {
            b10.a();
            return true;
        } else if (kVar.S()) {
            return true;
        } else {
            d.b a10 = dVar.a();
            if (a10 != null) {
                return a10.b();
            }
            return false;
        }
    }

    public static final boolean e(MenuItem menuItem, k kVar) {
        v.a e10;
        int i10;
        l.f(menuItem, "item");
        l.f(kVar, "navController");
        boolean z10 = true;
        v.a j10 = new v.a().d(true).j(true);
        p D = kVar.D();
        l.c(D);
        q Y = D.Y();
        l.c(Y);
        if (Y.r0(menuItem.getItemId()) instanceof b.C0216b) {
            e10 = j10.b(i.nav_default_enter_anim).c(i.nav_default_exit_anim).e(i.nav_default_pop_enter_anim);
            i10 = i.nav_default_pop_exit_anim;
        } else {
            e10 = j10.b(j.nav_default_enter_anim).c(j.nav_default_exit_anim).e(j.nav_default_pop_enter_anim);
            i10 = j.nav_default_pop_exit_anim;
        }
        e10.f(i10);
        if ((menuItem.getOrder() & 196608) == 0) {
            j10.g(q.f16440t.a(kVar.F()).H(), false, true);
        }
        try {
            kVar.O(menuItem.getItemId(), (Bundle) null, j10.a());
            p D2 = kVar.D();
            if (D2 == null || !c(D2, menuItem.getItemId())) {
                z10 = false;
            }
            return z10;
        } catch (IllegalArgumentException e11) {
            Log.i("NavigationUI", "Ignoring onNavDestinationSelected for MenuItem " + p.f16420n.b(kVar.B(), menuItem.getItemId()) + " as it cannot be found from the current destination " + kVar.D(), e11);
            return false;
        }
    }

    public static final void f(androidx.appcompat.app.d dVar, k kVar, d dVar2) {
        l.f(dVar, "activity");
        l.f(kVar, "navController");
        l.f(dVar2, "configuration");
        kVar.r(new b(dVar, dVar2));
    }

    public static final void g(NavigationView navigationView, k kVar) {
        l.f(navigationView, "navigationView");
        l.f(kVar, "navController");
        navigationView.setNavigationItemSelectedListener(new f(kVar, navigationView));
        kVar.r(new a(new WeakReference(navigationView), kVar));
    }

    /* access modifiers changed from: private */
    public static final boolean h(k kVar, NavigationView navigationView, MenuItem menuItem) {
        l.f(kVar, "$navController");
        l.f(navigationView, "$navigationView");
        l.f(menuItem, "item");
        boolean e10 = e(menuItem, kVar);
        if (e10) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof c) {
                ((c) parent).close();
            } else {
                BottomSheetBehavior b10 = b(navigationView);
                if (b10 != null) {
                    b10.U0(5);
                }
            }
        }
        return e10;
    }
}
