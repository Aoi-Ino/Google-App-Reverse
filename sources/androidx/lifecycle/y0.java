package androidx.lifecycle;

import android.view.View;
import cm.l;
import q0.a;

public abstract class y0 {
    public static final void a(View view, s sVar) {
        l.f(view, "<this>");
        view.setTag(a.view_tree_lifecycle_owner, sVar);
    }
}
