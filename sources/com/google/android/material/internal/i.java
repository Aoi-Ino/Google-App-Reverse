package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.r;
import androidx.core.view.accessibility.y;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class i implements m {
    int A;
    boolean B;
    boolean C = true;
    /* access modifiers changed from: private */
    public int D;
    private int E;
    int F;
    private int G = -1;
    final View.OnClickListener H = new a();

    /* renamed from: e  reason: collision with root package name */
    private NavigationMenuView f6134e;

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f6135f;

    /* renamed from: g  reason: collision with root package name */
    private m.a f6136g;

    /* renamed from: h  reason: collision with root package name */
    androidx.appcompat.view.menu.g f6137h;

    /* renamed from: i  reason: collision with root package name */
    private int f6138i;

    /* renamed from: j  reason: collision with root package name */
    c f6139j;

    /* renamed from: k  reason: collision with root package name */
    LayoutInflater f6140k;

    /* renamed from: l  reason: collision with root package name */
    int f6141l = 0;

    /* renamed from: m  reason: collision with root package name */
    ColorStateList f6142m;

    /* renamed from: n  reason: collision with root package name */
    int f6143n = 0;

    /* renamed from: o  reason: collision with root package name */
    boolean f6144o = true;

    /* renamed from: p  reason: collision with root package name */
    ColorStateList f6145p;

    /* renamed from: q  reason: collision with root package name */
    ColorStateList f6146q;

    /* renamed from: r  reason: collision with root package name */
    Drawable f6147r;

    /* renamed from: s  reason: collision with root package name */
    RippleDrawable f6148s;

    /* renamed from: t  reason: collision with root package name */
    int f6149t;

    /* renamed from: u  reason: collision with root package name */
    int f6150u;

    /* renamed from: v  reason: collision with root package name */
    int f6151v;

    /* renamed from: w  reason: collision with root package name */
    int f6152w;

    /* renamed from: x  reason: collision with root package name */
    int f6153x;

    /* renamed from: y  reason: collision with root package name */
    int f6154y;

    /* renamed from: z  reason: collision with root package name */
    int f6155z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            boolean z10 = true;
            i.this.a0(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            i iVar = i.this;
            boolean O = iVar.f6137h.O(itemData, iVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z10 = false;
            } else {
                i.this.f6139j.M(itemData);
            }
            i.this.a0(false);
            if (z10) {
                i.this.i(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList f6157d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private androidx.appcompat.view.menu.i f6158e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6159f;

        class a extends androidx.core.view.a {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f6161d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f6162e;

            a(int i10, boolean z10) {
                this.f6161d = i10;
                this.f6162e = z10;
            }

            public void g(View view, y yVar) {
                super.g(view, yVar);
                yVar.p0(y.g.a(c.this.B(this.f6161d), 1, 1, 1, this.f6162e, view.isSelected()));
            }
        }

        c() {
            J();
        }

        /* access modifiers changed from: private */
        public int B(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (i.this.f6139j.g(i12) == 2 || i.this.f6139j.g(i12) == 3) {
                    i11--;
                }
            }
            return i11;
        }

        private void C(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f6157d.get(i10)).f6167b = true;
                i10++;
            }
        }

        private void J() {
            if (!this.f6159f) {
                boolean z10 = true;
                this.f6159f = true;
                this.f6157d.clear();
                this.f6157d.add(new d());
                int size = i.this.f6137h.G().size();
                int i10 = -1;
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) i.this.f6137h.G().get(i11);
                    if (iVar.isChecked()) {
                        M(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.t(false);
                    }
                    if (iVar.hasSubMenu()) {
                        SubMenu subMenu = iVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f6157d.add(new f(i.this.F, 0));
                            }
                            this.f6157d.add(new g(iVar));
                            int size2 = this.f6157d.size();
                            int size3 = subMenu.size();
                            int i13 = 0;
                            boolean z12 = false;
                            while (i13 < size3) {
                                androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) subMenu.getItem(i13);
                                if (iVar2.isVisible()) {
                                    if (!z12 && iVar2.getIcon() != null) {
                                        z12 = z10;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.t(false);
                                    }
                                    if (iVar.isChecked()) {
                                        M(iVar);
                                    }
                                    this.f6157d.add(new g(iVar2));
                                }
                                i13++;
                                z10 = true;
                            }
                            if (z12) {
                                C(size2, this.f6157d.size());
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i10) {
                            i12 = this.f6157d.size();
                            z11 = iVar.getIcon() != null;
                            if (i11 != 0) {
                                i12++;
                                ArrayList arrayList = this.f6157d;
                                int i14 = i.this.F;
                                arrayList.add(new f(i14, i14));
                            }
                        } else if (!z11 && iVar.getIcon() != null) {
                            C(i12, this.f6157d.size());
                            z11 = true;
                        }
                        g gVar = new g(iVar);
                        gVar.f6167b = z11;
                        this.f6157d.add(gVar);
                        i10 = groupId;
                    }
                    i11++;
                    z10 = true;
                }
                this.f6159f = false;
            }
        }

        private void L(View view, int i10, boolean z10) {
            m0.q0(view, new a(i10, z10));
        }

        public Bundle D() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.f6158e;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f6157d.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) this.f6157d.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i a10 = ((g) eVar).a();
                    View actionView = a10 != null ? a10.getActionView() : null;
                    if (actionView != null) {
                        k kVar = new k();
                        actionView.saveHierarchyState(kVar);
                        sparseArray.put(a10.getItemId(), kVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.i E() {
            return this.f6158e;
        }

        /* access modifiers changed from: package-private */
        public int F() {
            int i10 = 0;
            for (int i11 = 0; i11 < i.this.f6139j.e(); i11++) {
                int g10 = i.this.f6139j.g(i11);
                if (g10 == 0 || g10 == 1) {
                    i10++;
                }
            }
            return i10;
        }

        /* renamed from: G */
        public void p(l lVar, int i10) {
            int g10 = g(i10);
            if (g10 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3622e;
                navigationMenuItemView.setIconTintList(i.this.f6146q);
                navigationMenuItemView.setTextAppearance(i.this.f6143n);
                ColorStateList colorStateList = i.this.f6145p;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = i.this.f6147r;
                m0.u0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                RippleDrawable rippleDrawable = i.this.f6148s;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) this.f6157d.get(i10);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f6167b);
                i iVar = i.this;
                int i11 = iVar.f6149t;
                int i12 = iVar.f6150u;
                navigationMenuItemView.setPadding(i11, i12, i11, i12);
                navigationMenuItemView.setIconPadding(i.this.f6151v);
                i iVar2 = i.this;
                if (iVar2.B) {
                    navigationMenuItemView.setIconSize(iVar2.f6152w);
                }
                navigationMenuItemView.setMaxLines(i.this.D);
                navigationMenuItemView.D(gVar.a(), i.this.f6144o);
                L(navigationMenuItemView, i10, false);
            } else if (g10 == 1) {
                TextView textView = (TextView) lVar.f3622e;
                textView.setText(((g) this.f6157d.get(i10)).a().getTitle());
                androidx.core.widget.i.n(textView, i.this.f6141l);
                textView.setPadding(i.this.f6155z, textView.getPaddingTop(), i.this.A, textView.getPaddingBottom());
                ColorStateList colorStateList2 = i.this.f6142m;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                L(textView, i10, true);
            } else if (g10 == 2) {
                f fVar = (f) this.f6157d.get(i10);
                lVar.f3622e.setPadding(i.this.f6153x, fVar.b(), i.this.f6154y, fVar.a());
            }
        }

        /* renamed from: H */
        public l r(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                i iVar = i.this;
                return new C0104i(iVar.f6140k, viewGroup, iVar.H);
            } else if (i10 == 1) {
                return new k(i.this.f6140k, viewGroup);
            } else {
                if (i10 == 2) {
                    return new j(i.this.f6140k, viewGroup);
                }
                if (i10 != 3) {
                    return null;
                }
                return new b(i.this.f6135f);
            }
        }

        /* renamed from: I */
        public void w(l lVar) {
            if (lVar instanceof C0104i) {
                ((NavigationMenuItemView) lVar.f3622e).E();
            }
        }

        public void K(Bundle bundle) {
            androidx.appcompat.view.menu.i a10;
            View actionView;
            k kVar;
            androidx.appcompat.view.menu.i a11;
            int i10 = bundle.getInt("android:menu:checked", 0);
            if (i10 != 0) {
                this.f6159f = true;
                int size = this.f6157d.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    e eVar = (e) this.f6157d.get(i11);
                    if ((eVar instanceof g) && (a11 = ((g) eVar).a()) != null && a11.getItemId() == i10) {
                        M(a11);
                        break;
                    }
                    i11++;
                }
                this.f6159f = false;
                J();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f6157d.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = (e) this.f6157d.get(i12);
                    if (!(!(eVar2 instanceof g) || (a10 = ((g) eVar2).a()) == null || (actionView = a10.getActionView()) == null || (kVar = (k) sparseParcelableArray.get(a10.getItemId())) == null)) {
                        actionView.restoreHierarchyState(kVar);
                    }
                }
            }
        }

        public void M(androidx.appcompat.view.menu.i iVar) {
            if (this.f6158e != iVar && iVar.isCheckable()) {
                androidx.appcompat.view.menu.i iVar2 = this.f6158e;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.f6158e = iVar;
                iVar.setChecked(true);
            }
        }

        public void N(boolean z10) {
            this.f6159f = z10;
        }

        public void O() {
            J();
            j();
        }

        public int e() {
            return this.f6157d.size();
        }

        public long f(int i10) {
            return (long) i10;
        }

        public int g(int i10) {
            e eVar = (e) this.f6157d.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final int f6164a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6165b;

        public f(int i10, int i11) {
            this.f6164a = i10;
            this.f6165b = i11;
        }

        public int a() {
            return this.f6165b;
        }

        public int b() {
            return this.f6164a;
        }
    }

    private static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.appcompat.view.menu.i f6166a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6167b;

        g(androidx.appcompat.view.menu.i iVar) {
            this.f6166a = iVar;
        }

        public androidx.appcompat.view.menu.i a() {
            return this.f6166a;
        }
    }

    private class h extends androidx.recyclerview.widget.k {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.o0(y.f.a(i.this.f6139j.F(), 1, false));
        }
    }

    /* renamed from: com.google.android.material.internal.i$i  reason: collision with other inner class name */
    private static class C0104i extends l {
        public C0104i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(q4.h.design_navigation_item, viewGroup, false));
            this.f3622e.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(q4.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(q4.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    private boolean D() {
        return r() > 0;
    }

    private void b0() {
        int i10 = (D() || !this.C) ? 0 : this.E;
        NavigationMenuView navigationMenuView = this.f6134e;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public n A(ViewGroup viewGroup) {
        if (this.f6134e == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f6140k.inflate(q4.h.design_navigation_menu, viewGroup, false);
            this.f6134e = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f6134e));
            if (this.f6139j == null) {
                this.f6139j = new c();
            }
            int i10 = this.G;
            if (i10 != -1) {
                this.f6134e.setOverScrollMode(i10);
            }
            LinearLayout linearLayout = (LinearLayout) this.f6140k.inflate(q4.h.design_navigation_item_header, this.f6134e, false);
            this.f6135f = linearLayout;
            m0.B0(linearLayout, 2);
            this.f6134e.setAdapter(this.f6139j);
        }
        return this.f6134e;
    }

    public int B() {
        return this.A;
    }

    public int C() {
        return this.f6155z;
    }

    public View E(int i10) {
        View inflate = this.f6140k.inflate(i10, this.f6135f, false);
        d(inflate);
        return inflate;
    }

    public void F(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            b0();
        }
    }

    public void G(androidx.appcompat.view.menu.i iVar) {
        this.f6139j.M(iVar);
    }

    public void H(int i10) {
        this.f6154y = i10;
        i(false);
    }

    public void I(int i10) {
        this.f6153x = i10;
        i(false);
    }

    public void J(int i10) {
        this.f6138i = i10;
    }

    public void K(Drawable drawable) {
        this.f6147r = drawable;
        i(false);
    }

    public void L(RippleDrawable rippleDrawable) {
        this.f6148s = rippleDrawable;
        i(false);
    }

    public void M(int i10) {
        this.f6149t = i10;
        i(false);
    }

    public void N(int i10) {
        this.f6151v = i10;
        i(false);
    }

    public void O(int i10) {
        if (this.f6152w != i10) {
            this.f6152w = i10;
            this.B = true;
            i(false);
        }
    }

    public void P(ColorStateList colorStateList) {
        this.f6146q = colorStateList;
        i(false);
    }

    public void Q(int i10) {
        this.D = i10;
        i(false);
    }

    public void R(int i10) {
        this.f6143n = i10;
        i(false);
    }

    public void S(boolean z10) {
        this.f6144o = z10;
        i(false);
    }

    public void T(ColorStateList colorStateList) {
        this.f6145p = colorStateList;
        i(false);
    }

    public void U(int i10) {
        this.f6150u = i10;
        i(false);
    }

    public void V(int i10) {
        this.G = i10;
        NavigationMenuView navigationMenuView = this.f6134e;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void W(ColorStateList colorStateList) {
        this.f6142m = colorStateList;
        i(false);
    }

    public void X(int i10) {
        this.A = i10;
        i(false);
    }

    public void Y(int i10) {
        this.f6155z = i10;
        i(false);
    }

    public void Z(int i10) {
        this.f6141l = i10;
        i(false);
    }

    public void a0(boolean z10) {
        c cVar = this.f6139j;
        if (cVar != null) {
            cVar.N(z10);
        }
    }

    public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        m.a aVar = this.f6136g;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    public int c() {
        return this.f6138i;
    }

    public void d(View view) {
        this.f6135f.addView(view);
        NavigationMenuView navigationMenuView = this.f6134e;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void e(Context context, androidx.appcompat.view.menu.g gVar) {
        this.f6140k = LayoutInflater.from(context);
        this.f6137h = gVar;
        this.F = context.getResources().getDimensionPixelOffset(q4.d.design_navigation_separator_vertical_padding);
    }

    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f6134e.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f6139j.K(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f6135f.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public boolean g(r rVar) {
        return false;
    }

    public void h(k1 k1Var) {
        int l10 = k1Var.l();
        if (this.E != l10) {
            this.E = l10;
            b0();
        }
        NavigationMenuView navigationMenuView = this.f6134e;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, k1Var.i());
        m0.g(this.f6135f, k1Var);
    }

    public void i(boolean z10) {
        c cVar = this.f6139j;
        if (cVar != null) {
            cVar.O();
        }
    }

    public boolean j() {
        return false;
    }

    public Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.f6134e != null) {
            SparseArray sparseArray = new SparseArray();
            this.f6134e.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f6139j;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.D());
        }
        if (this.f6135f != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f6135f.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public boolean l(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public boolean m(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public androidx.appcompat.view.menu.i o() {
        return this.f6139j.E();
    }

    public int p() {
        return this.f6154y;
    }

    public int q() {
        return this.f6153x;
    }

    public int r() {
        return this.f6135f.getChildCount();
    }

    public View s(int i10) {
        return this.f6135f.getChildAt(i10);
    }

    public Drawable t() {
        return this.f6147r;
    }

    public int u() {
        return this.f6149t;
    }

    public int v() {
        return this.f6151v;
    }

    public int w() {
        return this.D;
    }

    public ColorStateList x() {
        return this.f6145p;
    }

    public ColorStateList y() {
        return this.f6146q;
    }

    public int z() {
        return this.f6150u;
    }
}
