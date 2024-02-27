package j8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.j;
import cm.l;

public final class b extends j {

    /* renamed from: f  reason: collision with root package name */
    private i f12754f;

    /* renamed from: g  reason: collision with root package name */
    private i f12755g;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((!cm.l.a(r0.k(), r3)) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.recyclerview.widget.i m(androidx.recyclerview.widget.RecyclerView.p r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.i r0 = r2.f12755g
            java.lang.String r1 = "horizontalHelper"
            if (r0 == 0) goto L_0x0017
            if (r0 != 0) goto L_0x000b
            cm.l.v(r1)
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.k()
            boolean r0 = cm.l.a(r0, r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
        L_0x0017:
            androidx.recyclerview.widget.i r3 = androidx.recyclerview.widget.i.a(r3)
            java.lang.String r0 = "OrientationHelper.create…ntalHelper(layoutManager)"
            cm.l.e(r3, r0)
            r2.f12755g = r3
        L_0x0022:
            androidx.recyclerview.widget.i r3 = r2.f12755g
            if (r3 != 0) goto L_0x0029
            cm.l.v(r1)
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.b.m(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((!cm.l.a(r0.k(), r3)) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.recyclerview.widget.i o(androidx.recyclerview.widget.RecyclerView.p r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.i r0 = r2.f12754f
            java.lang.String r1 = "verticalHelper"
            if (r0 == 0) goto L_0x0017
            if (r0 != 0) goto L_0x000b
            cm.l.v(r1)
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.k()
            boolean r0 = cm.l.a(r0, r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
        L_0x0017:
            androidx.recyclerview.widget.i r3 = androidx.recyclerview.widget.i.c(r3)
            java.lang.String r0 = "OrientationHelper.create…icalHelper(layoutManager)"
            cm.l.e(r3, r0)
            r2.f12754f = r3
        L_0x0022:
            androidx.recyclerview.widget.i r3 = r2.f12754f
            if (r3 != 0) goto L_0x0029
            cm.l.v(r1)
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.b.o(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.i");
    }

    private final int r(View view, i iVar) {
        return iVar.g(view) - iVar.n();
    }

    public int[] c(RecyclerView.p pVar, View view) {
        l.f(pVar, "layoutManager");
        l.f(view, "targetView");
        int[] iArr = new int[2];
        int i10 = 0;
        iArr[0] = pVar.p() ? r(view, m(pVar)) : 0;
        if (pVar.q()) {
            i10 = r(view, o(pVar));
        }
        iArr[1] = i10;
        return iArr;
    }
}
