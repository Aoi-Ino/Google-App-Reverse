package com.smarteist.autoimageslider;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

public abstract class d extends l1.a {

    /* renamed from: c  reason: collision with root package name */
    private a f22634c;

    /* renamed from: d  reason: collision with root package name */
    private Queue f22635d = new LinkedList();

    interface a {
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f22636a;

        public b(View view) {
            this.f22636a = view;
        }
    }

    public final void a(ViewGroup viewGroup, int i10, Object obj) {
        b bVar = (b) obj;
        viewGroup.removeView(bVar.f22636a);
        this.f22635d.add(bVar);
    }

    public int e(Object obj) {
        return -2;
    }

    public Object g(ViewGroup viewGroup, int i10) {
        b bVar = (b) this.f22635d.poll();
        if (bVar == null) {
            bVar = t(viewGroup);
        }
        viewGroup.addView(bVar.f22636a);
        s(bVar, i10);
        return bVar;
    }

    public final boolean h(View view, Object obj) {
        return ((b) obj).f22636a == view;
    }

    /* access modifiers changed from: package-private */
    public void r(a aVar) {
        this.f22634c = aVar;
    }

    public abstract void s(b bVar, int i10);

    public abstract b t(ViewGroup viewGroup);
}
