package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.b0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import java.util.Map;
import java.util.WeakHashMap;

public class k extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f3899d;

    /* renamed from: e  reason: collision with root package name */
    private final a f3900e;

    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final k f3901d;

        /* renamed from: e  reason: collision with root package name */
        private Map f3902e = new WeakHashMap();

        public a(k kVar) {
            this.f3901d = kVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public b0 b(View view) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, y yVar) {
            if (!this.f3901d.o() && this.f3901d.f3899d.getLayoutManager() != null) {
                this.f3901d.f3899d.getLayoutManager().U0(view, yVar);
                androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
                if (aVar != null) {
                    aVar.g(view, yVar);
                    return;
                }
            }
            super.g(view, yVar);
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f3901d.o() || this.f3901d.f3899d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3901d.f3899d.getLayoutManager().o1(view, i10, bundle);
        }

        public void l(View view, int i10) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3902e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return (androidx.core.view.a) this.f3902e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a l10 = m0.l(view);
            if (l10 != null && l10 != this) {
                this.f3902e.put(view, l10);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.f3899d = recyclerView;
        androidx.core.view.a n10 = n();
        this.f3900e = (n10 == null || !(n10 instanceof a)) ? new a(this) : (a) n10;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Q0(accessibilityEvent);
            }
        }
    }

    public void g(View view, y yVar) {
        super.g(view, yVar);
        if (!o() && this.f3899d.getLayoutManager() != null) {
            this.f3899d.getLayoutManager().S0(yVar);
        }
    }

    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3899d.getLayoutManager() == null) {
            return false;
        }
        return this.f3899d.getLayoutManager().m1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3900e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f3899d.m0();
    }
}
