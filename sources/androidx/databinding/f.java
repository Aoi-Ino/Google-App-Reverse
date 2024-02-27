package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static d f2769a = new DataBinderMapperImpl();

    static h a(e eVar, View view, int i10) {
        return f2769a.b(eVar, view, i10);
    }

    static h b(e eVar, View[] viewArr, int i10) {
        return f2769a.c(eVar, viewArr, i10);
    }

    private static h c(e eVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return b(eVar, viewArr, i11);
    }

    public static e d() {
        return null;
    }

    public static h e(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, e eVar) {
        int i11 = 0;
        boolean z11 = viewGroup != null && z10;
        if (z11) {
            i11 = viewGroup.getChildCount();
        }
        return z11 ? c(eVar, viewGroup, i11, i10) : a(eVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static h f(Activity activity, int i10) {
        return g(activity, i10, (e) null);
    }

    public static h g(Activity activity, int i10, e eVar) {
        activity.setContentView(i10);
        return c(eVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i10);
    }
}
