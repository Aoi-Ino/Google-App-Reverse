package t0;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import bm.l;
import cm.m;
import java.lang.ref.WeakReference;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f16235a = new a0();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final a f16236e = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final View invoke(View view) {
            cm.l.f(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f16237e = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final k invoke(View view) {
            cm.l.f(view, "it");
            return a0.f16235a.e(view);
        }
    }

    private a0() {
    }

    public static final k b(Activity activity, int i10) {
        cm.l.f(activity, "activity");
        View t10 = androidx.core.app.b.t(activity, i10);
        cm.l.e(t10, "requireViewById<View>(activity, viewId)");
        k d10 = f16235a.d(t10);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    public static final k c(View view) {
        cm.l.f(view, "view");
        k d10 = f16235a.d(view);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final k d(View view) {
        return (k) o.j(o.q(m.d(view, a.f16236e), b.f16237e));
    }

    /* access modifiers changed from: private */
    public final k e(View view) {
        Object tag = view.getTag(f0.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof k)) {
            return null;
        }
        return (k) tag;
    }

    public static final void f(View view, k kVar) {
        cm.l.f(view, "view");
        view.setTag(f0.nav_controller_view_tag, kVar);
    }
}
