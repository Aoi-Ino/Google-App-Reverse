package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

class c extends androidx.appcompat.view.menu.b implements b.a {
    private int A;
    private final SparseBooleanArray B = new SparseBooleanArray();
    e C;
    a D;
    C0017c E;
    private b F;
    final f G = new f();
    int H;

    /* renamed from: o  reason: collision with root package name */
    d f1318o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f1319p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1320q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1321r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1322s;

    /* renamed from: t  reason: collision with root package name */
    private int f1323t;

    /* renamed from: u  reason: collision with root package name */
    private int f1324u;

    /* renamed from: v  reason: collision with root package name */
    private int f1325v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1326w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1327x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1328y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1329z;

    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, f.a.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.f1318o;
                f(view2 == null ? (View) c.this.f920m : view2);
            }
            j(c.this.G);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.D = null;
            cVar.H = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = c.this.D;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0017c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private e f1332e;

        public C0017c(e eVar) {
            this.f1332e = eVar;
        }

        public void run() {
            if (c.this.f914g != null) {
                c.this.f914g.d();
            }
            View view = (View) c.this.f920m;
            if (!(view == null || view.getWindowToken() == null || !this.f1332e.m())) {
                c.this.C = this.f1332e;
            }
            c.this.E = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends i0 {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ c f1335n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1335n = cVar;
            }

            public p b() {
                e eVar = c.this.C;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.N();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.E != null) {
                    return false;
                }
                cVar.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, f.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            a1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, f.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.G);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f914g != null) {
                c.this.f914g.close();
            }
            c.this.C = null;
            super.e();
        }
    }

    private class f implements m.a {
        f() {
        }

        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof r) {
                gVar.F().e(false);
            }
            m.a p10 = c.this.p();
            if (p10 != null) {
                p10.b(gVar, z10);
            }
        }

        public boolean c(androidx.appcompat.view.menu.g gVar) {
            if (gVar == c.this.f914g) {
                return false;
            }
            c.this.H = ((r) gVar).getItem().getItemId();
            m.a p10 = c.this.p();
            if (p10 != null) {
                return p10.c(gVar);
            }
            return false;
        }
    }

    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f1339e;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g() {
        }

        g(Parcel parcel) {
            this.f1339e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1339e);
        }
    }

    public c(Context context) {
        super(context, f.g.abc_action_menu_layout, f.g.abc_action_menu_item_layout);
    }

    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f920m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.f1318o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1320q) {
            return this.f1319p;
        }
        return null;
    }

    public boolean E() {
        n nVar;
        C0017c cVar = this.E;
        if (cVar == null || (nVar = this.f920m) == null) {
            e eVar = this.C;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.E = null;
        return true;
    }

    public boolean F() {
        a aVar = this.D;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean G() {
        return this.E != null || H();
    }

    public boolean H() {
        e eVar = this.C;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.f1326w) {
            this.f1325v = androidx.appcompat.view.a.b(this.f913f).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f914g;
        if (gVar != null) {
            gVar.M(true);
        }
    }

    public void J(boolean z10) {
        this.f1329z = z10;
    }

    public void K(ActionMenuView actionMenuView) {
        this.f920m = actionMenuView;
        actionMenuView.b(this.f914g);
    }

    public void L(Drawable drawable) {
        d dVar = this.f1318o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1320q = true;
        this.f1319p = drawable;
    }

    public void M(boolean z10) {
        this.f1321r = z10;
        this.f1322s = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1321r || H() || (gVar = this.f914g) == null || this.f920m == null || this.E != null || gVar.B().isEmpty()) {
            return false;
        }
        C0017c cVar = new C0017c(new e(this.f913f, this.f914g, this.f1318o, true));
        this.E = cVar;
        ((View) this.f920m).post(cVar);
        return true;
    }

    public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        B();
        super.b(gVar, z10);
    }

    public void d(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f920m);
        if (this.F == null) {
            this.F = new b();
        }
        actionMenuItemView.setPopupCallback(this.F);
    }

    public void e(Context context, androidx.appcompat.view.menu.g gVar) {
        super.e(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f1322s) {
            this.f1321r = b10.f();
        }
        if (!this.f1328y) {
            this.f1323t = b10.c();
        }
        if (!this.f1326w) {
            this.f1325v = b10.d();
        }
        int i10 = this.f1323t;
        if (this.f1321r) {
            if (this.f1318o == null) {
                d dVar = new d(this.f912e);
                this.f1318o = dVar;
                if (this.f1320q) {
                    dVar.setImageDrawable(this.f1319p);
                    this.f1319p = null;
                    this.f1320q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1318o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1318o.getMeasuredWidth();
        } else {
            this.f1318o = null;
        }
        this.f1324u = i10;
        this.A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void f(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f1339e) > 0 && (findItem = this.f914g.findItem(i10)) != null) {
            g((r) findItem.getSubMenu());
        }
    }

    public boolean g(r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.i0() != this.f914g) {
            rVar2 = (r) rVar2.i0();
        }
        View C2 = C(rVar2.getItem());
        if (C2 == null) {
            return false;
        }
        this.H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f913f, rVar, C2);
        this.D = aVar;
        aVar.g(z10);
        this.D.k();
        super.g(rVar);
        return true;
    }

    public void i(boolean z10) {
        n nVar;
        int size;
        super.i(z10);
        ((View) this.f920m).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f914g;
        if (gVar != null) {
            ArrayList u10 = gVar.u();
            int size2 = u10.size();
            for (int i10 = 0; i10 < size2; i10++) {
                androidx.core.view.b b10 = ((i) u10.get(i10)).b();
                if (b10 != null) {
                    b10.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f914g;
        ArrayList B2 = gVar2 != null ? gVar2.B() : null;
        if (!this.f1321r || B2 == null || ((size = B2.size()) != 1 ? size <= 0 : !(!((i) B2.get(0)).isActionViewExpanded()))) {
            d dVar = this.f1318o;
            if (dVar != null && dVar.getParent() == (nVar = this.f920m)) {
                ((ViewGroup) nVar).removeView(this.f1318o);
            }
        } else {
            if (this.f1318o == null) {
                this.f1318o = new d(this.f912e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1318o.getParent();
            if (viewGroup != this.f920m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1318o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f920m;
                actionMenuView.addView(this.f1318o, actionMenuView.F());
            }
        }
        ((ActionMenuView) this.f920m).setOverflowReserved(this.f1321r);
    }

    public boolean j() {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        boolean z10;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f914g;
        View view = null;
        boolean z11 = false;
        if (gVar != null) {
            arrayList = gVar.G();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = cVar.f1325v;
        int i15 = cVar.f1324u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f920m;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            i iVar = (i) arrayList.get(i18);
            if (iVar.o()) {
                i16++;
            } else if (iVar.n()) {
                i17++;
            } else {
                z12 = true;
            }
            if (cVar.f1329z && iVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (cVar.f1321r && (z12 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = cVar.B;
        sparseBooleanArray.clear();
        if (cVar.f1327x) {
            int i20 = cVar.A;
            i11 = i15 / i20;
            i12 = i20 + ((i15 % i20) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            i iVar2 = (i) arrayList.get(i21);
            if (iVar2.o()) {
                View q10 = cVar.q(iVar2, view, viewGroup);
                if (cVar.f1327x) {
                    i11 -= ActionMenuView.L(q10, i12, i11, makeMeasureSpec, z11 ? 1 : 0);
                } else {
                    q10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                z10 = z11;
                i13 = i10;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                boolean z14 = (i19 > 0 || z13) && i15 > 0 && (!cVar.f1327x || i11 > 0);
                boolean z15 = z14;
                i13 = i10;
                if (z14) {
                    View q11 = cVar.q(iVar2, (View) null, viewGroup);
                    if (cVar.f1327x) {
                        int L = ActionMenuView.L(q11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L;
                        if (L == 0) {
                            z15 = false;
                        }
                    } else {
                        q11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = q11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z14 = z16 & (!cVar.f1327x ? i15 + i22 > 0 : i15 >= 0);
                }
                if (z14 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    int i23 = 0;
                    while (i23 < i21) {
                        i iVar3 = (i) arrayList.get(i23);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i19++;
                            }
                            iVar3.u(false);
                        }
                        i23++;
                    }
                }
                if (z14) {
                    i19--;
                }
                iVar2.u(z14);
                z10 = false;
            } else {
                z10 = z11;
                i13 = i10;
                iVar2.u(z10);
            }
            i21++;
            z11 = z10;
            i10 = i13;
            view = null;
            cVar = this;
        }
        return true;
    }

    public Parcelable k() {
        g gVar = new g();
        gVar.f1339e = this.H;
        return gVar;
    }

    public boolean o(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1318o) {
            return false;
        }
        return super.o(viewGroup, i10);
    }

    public View q(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.q(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public n r(ViewGroup viewGroup) {
        n nVar = this.f920m;
        n r10 = super.r(viewGroup);
        if (nVar != r10) {
            ((ActionMenuView) r10).setPresenter(this);
        }
        return r10;
    }

    public boolean t(int i10, i iVar) {
        return iVar.l();
    }
}
