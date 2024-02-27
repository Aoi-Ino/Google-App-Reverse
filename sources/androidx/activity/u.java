package androidx.activity;

import android.view.View;
import cm.l;

public abstract class u {
    public static final void a(View view, o oVar) {
        l.f(view, "<this>");
        l.f(oVar, "fullyDrawnReporterOwner");
        view.setTag(t.report_drawn, oVar);
    }
}
