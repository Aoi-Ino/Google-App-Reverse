package i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static l f12191a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal f12192b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList f12193c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        l f12194e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f12195f;

        /* renamed from: i1.n$a$a  reason: collision with other inner class name */
        class C0159a extends m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.a f12196a;

            C0159a(o.a aVar) {
                this.f12196a = aVar;
            }

            public void e(l lVar) {
                ((ArrayList) this.f12196a.get(a.this.f12195f)).remove(lVar);
                lVar.W(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f12194e = lVar;
            this.f12195f = viewGroup;
        }

        private void a() {
            this.f12195f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f12195f.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!n.f12193c.remove(this.f12195f)) {
                return true;
            }
            o.a b10 = n.b();
            ArrayList arrayList = (ArrayList) b10.get(this.f12195f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f12195f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f12194e);
            this.f12194e.a(new C0159a(b10));
            this.f12194e.j(this.f12195f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Y(this.f12195f);
                }
            }
            this.f12194e.V(this.f12195f);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            n.f12193c.remove(this.f12195f);
            ArrayList arrayList = (ArrayList) n.b().get(this.f12195f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Y(this.f12195f);
                }
            }
            this.f12194e.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (!f12193c.contains(viewGroup) && m0.U(viewGroup)) {
            f12193c.add(viewGroup);
            if (lVar == null) {
                lVar = f12191a;
            }
            l m10 = lVar.clone();
            d(viewGroup, m10);
            k.b(viewGroup, (k) null);
            c(viewGroup, m10);
        }
    }

    static o.a b() {
        o.a aVar;
        WeakReference weakReference = (WeakReference) f12192b.get();
        if (weakReference != null && (aVar = (o.a) weakReference.get()) != null) {
            return aVar;
        }
        o.a aVar2 = new o.a();
        f12192b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((l) it.next()).U(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.j(viewGroup, true);
        }
        k.a(viewGroup);
    }
}
