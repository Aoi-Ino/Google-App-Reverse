package androidx.fragment.app;

import android.view.View;
import cm.l;
import i1.e;
import java.util.Iterator;
import java.util.List;
import o.a;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f3233a;

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f3234b = new z();

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f3235c;

    static {
        y yVar = new y();
        f3233a = yVar;
        f3235c = yVar.b();
    }

    private y() {
    }

    public static final void a(i iVar, i iVar2, boolean z10, a aVar, boolean z11) {
        l.f(iVar, "inFragment");
        l.f(iVar2, "outFragment");
        l.f(aVar, "sharedElements");
        if (z10) {
            iVar2.A();
        } else {
            iVar.A();
        }
    }

    private final a0 b() {
        Class<e> cls = e.class;
        try {
            l.d(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(a aVar, a aVar2) {
        l.f(aVar, "<this>");
        l.f(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    public static final void d(List list, int i10) {
        l.f(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
