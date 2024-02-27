package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.e;
import androidx.core.view.f0;
import androidx.core.view.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class a0 {

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2930e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f2931f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f2932g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f2933h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f2934i;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2930e = i10;
            this.f2931f = arrayList;
            this.f2932g = arrayList2;
            this.f2933h = arrayList3;
            this.f2934i = arrayList4;
        }

        public void run() {
            for (int i10 = 0; i10 < this.f2930e; i10++) {
                m0.J0((View) this.f2931f.get(i10), (String) this.f2932g.get(i10));
                m0.J0((View) this.f2933h.get(i10), (String) this.f2934i.get(i10));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (!g(list, view, size)) {
            if (m0.K(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!g(list, childAt, size) && m0.K(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean g(List list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    /* access modifiers changed from: protected */
    public void h(View view, Rect rect) {
        if (m0.T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            arrayList2.add(m0.K(view));
            m0.J0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public abstract void q(i iVar, Object obj, e eVar, Runnable runnable);

    /* access modifiers changed from: package-private */
    public void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList.get(i10);
            String K = m0.K(view2);
            arrayList4.add(K);
            if (K != null) {
                m0.J0(view2, (String) null);
                String str = (String) map.get(K);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        m0.J0((View) arrayList2.get(i11), K);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        f0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
