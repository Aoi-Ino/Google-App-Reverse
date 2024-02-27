package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.m0;
import androidx.core.view.o;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.core.view.v;
import f.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements s {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList H;
    private final ArrayList I;
    private final int[] J;
    final t K;
    private ArrayList L;
    h M;
    private final ActionMenuView.e N;
    private z0 O;
    private c P;
    private f Q;
    private m.a R;
    g.a S;
    private boolean T;
    private OnBackInvokedCallback U;
    private OnBackInvokedDispatcher V;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private final Runnable f1268a0;

    /* renamed from: e  reason: collision with root package name */
    ActionMenuView f1269e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1270f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f1271g;

    /* renamed from: h  reason: collision with root package name */
    private ImageButton f1272h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f1273i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1274j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1275k;

    /* renamed from: l  reason: collision with root package name */
    ImageButton f1276l;

    /* renamed from: m  reason: collision with root package name */
    View f1277m;

    /* renamed from: n  reason: collision with root package name */
    private Context f1278n;

    /* renamed from: o  reason: collision with root package name */
    private int f1279o;

    /* renamed from: p  reason: collision with root package name */
    private int f1280p;

    /* renamed from: q  reason: collision with root package name */
    private int f1281q;

    /* renamed from: r  reason: collision with root package name */
    int f1282r;

    /* renamed from: s  reason: collision with root package name */
    private int f1283s;

    /* renamed from: t  reason: collision with root package name */
    private int f1284t;

    /* renamed from: u  reason: collision with root package name */
    private int f1285u;

    /* renamed from: v  reason: collision with root package name */
    private int f1286v;

    /* renamed from: w  reason: collision with root package name */
    private int f1287w;

    /* renamed from: x  reason: collision with root package name */
    private o0 f1288x;

    /* renamed from: y  reason: collision with root package name */
    private int f1289y;

    /* renamed from: z  reason: collision with root package name */
    private int f1290z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.K.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.M;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.S();
        }
    }

    class c implements g.a {
        c() {
        }

        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.S;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f1269e.J()) {
                Toolbar.this.K.e(gVar);
            }
            g.a aVar = Toolbar.this.S;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new y0(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements m {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1295e;

        /* renamed from: f  reason: collision with root package name */
        androidx.appcompat.view.menu.i f1296f;

        f() {
        }

        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        public int c() {
            return 0;
        }

        public void e(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1295e;
            if (!(gVar2 == null || (iVar = this.f1296f) == null)) {
                gVar2.f(iVar);
            }
            this.f1295e = gVar;
        }

        public void f(Parcelable parcelable) {
        }

        public boolean g(r rVar) {
            return false;
        }

        public void i(boolean z10) {
            if (this.f1296f != null) {
                androidx.appcompat.view.menu.g gVar = this.f1295e;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (i10 < size) {
                        if (this.f1295e.getItem(i10) != this.f1296f) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                l(this.f1295e, this.f1296f);
            }
        }

        public boolean j() {
            return false;
        }

        public Parcelable k() {
            return null;
        }

        public boolean l(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            View view = Toolbar.this.f1277m;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1277m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1276l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1277m = null;
            toolbar3.a();
            this.f1296f = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.T();
            return true;
        }

        public boolean m(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1276l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1276l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1276l);
            }
            Toolbar.this.f1277m = iVar.getActionView();
            this.f1296f = iVar;
            ViewParent parent2 = Toolbar.this.f1277m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1277m);
                }
                g m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f612a = (toolbar4.f1282r & 112) | 8388611;
                m10.f1298b = 2;
                toolbar4.f1277m.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1277m);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.f1277m;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).c();
            }
            Toolbar.this.T();
            return true;
        }
    }

    public static class g extends a.C0013a {

        /* renamed from: b  reason: collision with root package name */
        int f1298b = 0;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f612a = 8388627;
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public g(a.C0013a aVar) {
            super(aVar);
        }

        public g(g gVar) {
            super((a.C0013a) gVar);
            this.f1298b = gVar.f1298b;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends b0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f1299g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1300h;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1299g = parcel.readInt();
            this.f1300h = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1299g);
            parcel.writeInt(this.f1300h ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.N);
    }

    private boolean A(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int r10 = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r10, max + measuredWidth, view.getMeasuredHeight() + r10);
        return max + measuredWidth + gVar.rightMargin;
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int r10 = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r10, max, view.getMeasuredHeight() + r10);
        return max - (measuredWidth + gVar.leftMargin);
    }

    private int F(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void G(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.K.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
    }

    private void I() {
        removeCallbacks(this.f1268a0);
        post(this.f1268a0);
    }

    private boolean Q() {
        if (!this.T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = m0.B(this) == 1;
        int childCount = getChildCount();
        int b10 = o.b(i10, m0.B(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1298b == 0 && R(childAt) && q(gVar.f612a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1298b == 0 && R(childAt2) && q(gVar2.f612a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g m10 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        m10.f1298b = 1;
        if (!z10 || this.f1277m == null) {
            addView(view, m10);
            return;
        }
        view.setLayoutParams(m10);
        this.I.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f1288x == null) {
            this.f1288x = new o0();
        }
    }

    private void i() {
        if (this.f1273i == null) {
            this.f1273i = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1269e.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1269e.getMenu();
            if (this.Q == null) {
                this.Q = new f();
            }
            this.f1269e.setExpandedActionViewsExclusive(true);
            gVar.c(this.Q, this.f1278n);
            T();
        }
    }

    private void k() {
        if (this.f1269e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1269e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1279o);
            this.f1269e.setOnMenuItemClickListener(this.N);
            this.f1269e.O(this.R, new c());
            g m10 = generateDefaultLayoutParams();
            m10.f612a = (this.f1282r & 112) | 8388613;
            this.f1269e.setLayoutParams(m10);
            c(this.f1269e, false);
        }
    }

    private void l() {
        if (this.f1272h == null) {
            this.f1272h = new n(getContext(), (AttributeSet) null, f.a.toolbarNavigationButtonStyle);
            g m10 = generateDefaultLayoutParams();
            m10.f612a = (this.f1282r & 112) | 8388611;
            this.f1272h.setLayoutParams(m10);
        }
    }

    private int q(int i10) {
        int B2 = m0.B(this);
        int b10 = o.b(i10, B2) & 7;
        if (b10 == 1 || b10 == 3 || b10 == 5) {
            return b10;
        }
        return B2 == 1 ? 5 : 3;
    }

    private int r(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int s10 = s(gVar.f612a);
        if (s10 == 48) {
            return getPaddingTop() - i11;
        }
        if (s10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = gVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = gVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.A & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r.b(marginLayoutParams) + androidx.core.view.r.a(marginLayoutParams);
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = gVar.leftMargin - i10;
            int i15 = gVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1269e;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f1269e;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((g) childAt.getLayoutParams()).f1298b == 2 || childAt == this.f1269e)) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void K(int i10, int i11) {
        h();
        this.f1288x.g(i10, i11);
    }

    public void L(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f1269e != null) {
            k();
            androidx.appcompat.view.menu.g N2 = this.f1269e.N();
            if (N2 != gVar) {
                if (N2 != null) {
                    N2.Q(this.P);
                    N2.Q(this.Q);
                }
                if (this.Q == null) {
                    this.Q = new f();
                }
                cVar.J(true);
                if (gVar != null) {
                    gVar.c(cVar, this.f1278n);
                    gVar.c(this.Q, this.f1278n);
                } else {
                    cVar.e(this.f1278n, (androidx.appcompat.view.menu.g) null);
                    this.Q.e(this.f1278n, (androidx.appcompat.view.menu.g) null);
                    cVar.i(true);
                    this.Q.i(true);
                }
                this.f1269e.setPopupTheme(this.f1279o);
                this.f1269e.setPresenter(cVar);
                this.P = cVar;
                T();
            }
        }
    }

    public void M(v vVar) {
        this.K.a(vVar);
    }

    public void N(m.a aVar, g.a aVar2) {
        this.R = aVar;
        this.S = aVar2;
        ActionMenuView actionMenuView = this.f1269e;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i10) {
        this.f1281q = i10;
        TextView textView = this.f1271g;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void P(Context context, int i10) {
        this.f1280p = i10;
        TextView textView = this.f1270f;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f1269e;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = w() && a10 != null && m0.T(this) && this.W;
            if (z10 && this.V == null) {
                if (this.U == null) {
                    this.U = e.b(new x0(this));
                }
                e.c(a10, this.U);
            } else if (!z10 && (onBackInvokedDispatcher = this.V) != null) {
                e.d(onBackInvokedDispatcher, this.U);
                a10 = null;
            } else {
                return;
            }
            this.V = a10;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView((View) this.I.get(size));
        }
        this.I.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1269e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1269e
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        f fVar = this.Q;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f1296f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1269e;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f1276l == null) {
            n nVar = new n(getContext(), (AttributeSet) null, f.a.toolbarNavigationButtonStyle);
            this.f1276l = nVar;
            nVar.setImageDrawable(this.f1274j);
            this.f1276l.setContentDescription(this.f1275k);
            g m10 = generateDefaultLayoutParams();
            m10.f612a = (this.f1282r & 112) | 8388611;
            m10.f1298b = 2;
            this.f1276l.setLayoutParams(m10);
            this.f1276l.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1276l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1276l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.f1288x;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1290z;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.f1288x;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.f1288x;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.f1288x;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1289y;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1269e
            if (r0 == 0) goto L_0x0020
            androidx.appcompat.view.menu.g r0 = r0.N()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0020
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.f1290z
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0024
        L_0x0020:
            int r0 = r3.getContentInsetEnd()
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return m0.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return m0.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1289y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1273i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1273i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1269e.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1272h;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1272h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1272h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1269e.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1278n;
    }

    public int getPopupTheme() {
        return this.f1279o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1271g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.f1287w;
    }

    public int getTitleMarginEnd() {
        return this.f1285u;
    }

    public int getTitleMarginStart() {
        return this.f1284t;
    }

    public int getTitleMarginTop() {
        return this.f1286v;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1270f;
    }

    public e0 getWrapper() {
        if (this.O == null) {
            this.O = new z0(this, true);
        }
        return this.O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void o(v vVar) {
        this.K.f(vVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1268a0);
        T();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0297 A[LOOP:0: B:108:0x0295->B:109:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b9 A[LOOP:1: B:111:0x02b7->B:112:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f2 A[LOOP:2: B:119:0x02f0->B:120:0x02f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.m0.B(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.J
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.m0.C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1272h
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x0054
            android.widget.ImageButton r13 = r0.f1272h
            if (r1 == 0) goto L_0x004e
            int r13 = r0.E(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0056
        L_0x004e:
            int r13 = r0.D(r13, r6, r11, r12)
        L_0x0052:
            r14 = r10
            goto L_0x0056
        L_0x0054:
            r13 = r6
            goto L_0x0052
        L_0x0056:
            android.widget.ImageButton r15 = r0.f1276l
            boolean r15 = r0.R(r15)
            if (r15 == 0) goto L_0x006b
            android.widget.ImageButton r15 = r0.f1276l
            if (r1 == 0) goto L_0x0067
            int r14 = r0.E(r15, r14, r11, r12)
            goto L_0x006b
        L_0x0067:
            int r13 = r0.D(r15, r13, r11, r12)
        L_0x006b:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1269e
            boolean r15 = r0.R(r15)
            if (r15 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1269e
            if (r1 == 0) goto L_0x007c
            int r13 = r0.D(r15, r13, r11, r12)
            goto L_0x0080
        L_0x007c:
            int r14 = r0.E(r15, r14, r11, r12)
        L_0x0080:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1277m
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x00bb
            android.view.View r13 = r0.f1277m
            if (r1 == 0) goto L_0x00b7
            int r10 = r0.E(r13, r10, r11, r12)
            goto L_0x00bb
        L_0x00b7:
            int r3 = r0.D(r13, r3, r11, r12)
        L_0x00bb:
            android.widget.ImageView r13 = r0.f1273i
            boolean r13 = r0.R(r13)
            if (r13 == 0) goto L_0x00d0
            android.widget.ImageView r13 = r0.f1273i
            if (r1 == 0) goto L_0x00cc
            int r10 = r0.E(r13, r10, r11, r12)
            goto L_0x00d0
        L_0x00cc:
            int r3 = r0.D(r13, r3, r11, r12)
        L_0x00d0:
            android.widget.TextView r13 = r0.f1270f
            boolean r13 = r0.R(r13)
            android.widget.TextView r14 = r0.f1271g
            boolean r14 = r0.R(r14)
            if (r13 == 0) goto L_0x00f5
            android.widget.TextView r15 = r0.f1270f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1270f
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x00f8
        L_0x00f5:
            r23 = r7
            r2 = 0
        L_0x00f8:
            if (r14 == 0) goto L_0x0112
            android.widget.TextView r7 = r0.f1271g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1271g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x0114
        L_0x0112:
            r16 = r4
        L_0x0114:
            if (r13 != 0) goto L_0x0120
            if (r14 == 0) goto L_0x0119
            goto L_0x0120
        L_0x0119:
            r18 = r6
            r22 = r12
        L_0x011d:
            r2 = 0
            goto L_0x0287
        L_0x0120:
            if (r13 == 0) goto L_0x0125
            android.widget.TextView r4 = r0.f1270f
            goto L_0x0127
        L_0x0125:
            android.widget.TextView r4 = r0.f1271g
        L_0x0127:
            if (r14 == 0) goto L_0x012c
            android.widget.TextView r7 = r0.f1271g
            goto L_0x012e
        L_0x012c:
            android.widget.TextView r7 = r0.f1270f
        L_0x012e:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            if (r13 == 0) goto L_0x0144
            android.widget.TextView r15 = r0.f1270f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014e
        L_0x0144:
            if (r14 == 0) goto L_0x0151
            android.widget.TextView r15 = r0.f1271g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0151
        L_0x014e:
            r17 = 1
            goto L_0x0153
        L_0x0151:
            r17 = 0
        L_0x0153:
            int r15 = r0.A
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019b
            r6 = 80
            if (r15 == r6) goto L_0x018d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1286v
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0176
            int r6 = r15 + r12
            goto L_0x018b
        L_0x0176:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1287w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018b
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018b:
            int r8 = r8 + r6
            goto L_0x01aa
        L_0x018d:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1287w
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01aa
        L_0x019b:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1286v
            int r8 = r2 + r3
        L_0x01aa:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1284t
        L_0x01b0:
            r2 = 1
            goto L_0x01b4
        L_0x01b2:
            r1 = 0
            goto L_0x01b0
        L_0x01b4:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1270f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r2 = r0.f1270f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1270f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1270f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1285u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f1271g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1271g
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1271g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1271g
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1285u
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r3 = r24
            goto L_0x011d
        L_0x021d:
            if (r17 == 0) goto L_0x0224
            int r2 = r0.f1284t
            r1 = r2
        L_0x0222:
            r2 = 0
            goto L_0x0226
        L_0x0224:
            r1 = 0
            goto L_0x0222
        L_0x0226:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025b
            android.widget.TextView r1 = r0.f1270f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r4 = r0.f1270f
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f1270f
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1270f
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f1285u
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x025c
        L_0x025b:
            r4 = r3
        L_0x025c:
            if (r14 == 0) goto L_0x0280
            android.widget.TextView r1 = r0.f1271g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1271g
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.f1271g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1271g
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.f1285u
            int r1 = r1 + r5
            goto L_0x0281
        L_0x0280:
            r1 = r3
        L_0x0281:
            if (r17 == 0) goto L_0x0287
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0287:
            java.util.ArrayList r1 = r0.H
            r4 = 3
            r0.b(r1, r4)
            java.util.ArrayList r1 = r0.H
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x0295:
            if (r3 >= r1) goto L_0x02a8
            java.util.ArrayList r5 = r0.H
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.D(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x0295
        L_0x02a8:
            r12 = r22
            java.util.ArrayList r1 = r0.H
            r3 = 5
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.H
            int r1 = r1.size()
            r3 = r2
        L_0x02b7:
            if (r3 >= r1) goto L_0x02c8
            java.util.ArrayList r5 = r0.H
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.E(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02b7
        L_0x02c8:
            java.util.ArrayList r1 = r0.H
            r3 = 1
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.H
            int r1 = r0.v(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02e3
            goto L_0x02ea
        L_0x02e3:
            if (r1 <= r10) goto L_0x02e9
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02ea
        L_0x02e9:
            r4 = r6
        L_0x02ea:
            java.util.ArrayList r1 = r0.H
            int r1 = r1.size()
        L_0x02f0:
            if (r2 >= r1) goto L_0x0301
            java.util.ArrayList r3 = r0.H
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.D(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02f0
        L_0x0301:
            java.util.ArrayList r1 = r0.H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.J;
        char b10 = g1.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (R(this.f1272h)) {
            G(this.f1272h, i10, 0, i11, 0, this.f1283s);
            i14 = this.f1272h.getMeasuredWidth() + t(this.f1272h);
            i13 = Math.max(0, this.f1272h.getMeasuredHeight() + u(this.f1272h));
            i12 = View.combineMeasuredStates(0, this.f1272h.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (R(this.f1276l)) {
            G(this.f1276l, i10, 0, i11, 0, this.f1283s);
            i14 = this.f1276l.getMeasuredWidth() + t(this.f1276l);
            i13 = Math.max(i13, this.f1276l.getMeasuredHeight() + u(this.f1276l));
            i12 = View.combineMeasuredStates(i12, this.f1276l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (R(this.f1269e)) {
            G(this.f1269e, i10, max, i11, 0, this.f1283s);
            i15 = this.f1269e.getMeasuredWidth() + t(this.f1269e);
            i13 = Math.max(i13, this.f1269e.getMeasuredHeight() + u(this.f1269e));
            i12 = View.combineMeasuredStates(i12, this.f1269e.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (R(this.f1277m)) {
            max2 += F(this.f1277m, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1277m.getMeasuredHeight() + u(this.f1277m));
            i12 = View.combineMeasuredStates(i12, this.f1277m.getMeasuredState());
        }
        if (R(this.f1273i)) {
            max2 += F(this.f1273i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1273i.getMeasuredHeight() + u(this.f1273i));
            i12 = View.combineMeasuredStates(i12, this.f1273i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f1298b == 0 && R(childAt)) {
                max2 += F(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + u(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1286v + this.f1287w;
        int i22 = this.f1284t + this.f1285u;
        if (R(this.f1270f)) {
            F(this.f1270f, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1270f.getMeasuredWidth() + t(this.f1270f);
            i16 = this.f1270f.getMeasuredHeight() + u(this.f1270f);
            i18 = View.combineMeasuredStates(i12, this.f1270f.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (R(this.f1271g)) {
            i17 = Math.max(i17, F(this.f1271g, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f1271g.getMeasuredHeight() + u(this.f1271g);
            i18 = View.combineMeasuredStates(i18, this.f1271g.getMeasuredState());
        } else {
            int i23 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!Q()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.c());
        ActionMenuView actionMenuView = this.f1269e;
        androidx.appcompat.view.menu.g N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f1299g;
        if (!(i10 == 0 || this.Q == null || N2 == null || (findItem = N2.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f1300h) {
            I();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        o0 o0Var = this.f1288x;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        o0Var.f(z10);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.Q;
        if (!(fVar == null || (iVar = fVar.f1296f) == null)) {
            iVar2.f1299g = iVar.getItemId();
        }
        iVar2.f1300h = C();
        return iVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0013a) {
            return new g((a.C0013a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            T();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.T = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1290z) {
            this.f1290z = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1289y) {
            this.f1289y = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1272h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.M = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1269e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1279o != i10) {
            this.f1279o = i10;
            if (i10 == 0) {
                this.f1278n = getContext();
            } else {
                this.f1278n = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1287w = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1285u = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1284t = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1286v = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean w() {
        f fVar = this.Q;
        return (fVar == null || fVar.f1296f == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f1269e;
        return actionMenuView != null && actionMenuView.H();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        H();
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = 8388627;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new int[2];
        this.K = new t(new w0(this));
        this.L = new ArrayList();
        this.N = new a();
        this.f1268a0 = new b();
        Context context2 = getContext();
        int[] iArr = j.W2;
        v0 v10 = v0.v(context2, attributeSet, iArr, i10, 0);
        m0.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1280p = v10.n(j.f11302y3, 0);
        this.f1281q = v10.n(j.f11257p3, 0);
        this.A = v10.l(j.X2, this.A);
        this.f1282r = v10.l(j.Y2, 48);
        int e10 = v10.e(j.f11272s3, 0);
        int i11 = j.f11297x3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.f1287w = e10;
        this.f1286v = e10;
        this.f1285u = e10;
        this.f1284t = e10;
        int e11 = v10.e(j.f11287v3, -1);
        if (e11 >= 0) {
            this.f1284t = e11;
        }
        int e12 = v10.e(j.f11282u3, -1);
        if (e12 >= 0) {
            this.f1285u = e12;
        }
        int e13 = v10.e(j.f11292w3, -1);
        if (e13 >= 0) {
            this.f1286v = e13;
        }
        int e14 = v10.e(j.f11277t3, -1);
        if (e14 >= 0) {
            this.f1287w = e14;
        }
        this.f1283s = v10.f(j.f11227j3, -1);
        int e15 = v10.e(j.f11207f3, Integer.MIN_VALUE);
        int e16 = v10.e(j.f11187b3, Integer.MIN_VALUE);
        int f10 = v10.f(j.f11197d3, 0);
        int f11 = v10.f(j.f11202e3, 0);
        h();
        this.f1288x.e(f10, f11);
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            this.f1288x.g(e15, e16);
        }
        this.f1289y = v10.e(j.f11212g3, Integer.MIN_VALUE);
        this.f1290z = v10.e(j.f11192c3, Integer.MIN_VALUE);
        this.f1274j = v10.g(j.f11182a3);
        this.f1275k = v10.p(j.Z2);
        CharSequence p10 = v10.p(j.f11267r3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(j.f11252o3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1278n = getContext();
        setPopupTheme(v10.n(j.f11247n3, 0));
        Drawable g10 = v10.g(j.f11242m3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(j.f11237l3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(j.f11217h3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(j.f11222i3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = j.f11307z3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = j.f11262q3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = j.f11232k3;
        if (v10.s(i14)) {
            y(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1276l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1276l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1276l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1274j);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f1273i)) {
                c(this.f1273i, true);
            }
        } else {
            ImageView imageView = this.f1273i;
            if (imageView != null && A(imageView)) {
                removeView(this.f1273i);
                this.I.remove(this.f1273i);
            }
        }
        ImageView imageView2 = this.f1273i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1273i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1272h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            a1.a(this.f1272h, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.f1272h)) {
                c(this.f1272h, true);
            }
        } else {
            ImageButton imageButton = this.f1272h;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f1272h);
                this.I.remove(this.f1272h);
            }
        }
        ImageButton imageButton2 = this.f1272h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1271g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1271g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1271g.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1281q;
                if (i10 != 0) {
                    this.f1271g.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f1271g.setTextColor(colorStateList);
                }
            }
            if (!A(this.f1271g)) {
                c(this.f1271g, true);
            }
        } else {
            TextView textView = this.f1271g;
            if (textView != null && A(textView)) {
                removeView(this.f1271g);
                this.I.remove(this.f1271g);
            }
        }
        TextView textView2 = this.f1271g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f1271g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1270f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1270f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1270f.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1280p;
                if (i10 != 0) {
                    this.f1270f.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f1270f.setTextColor(colorStateList);
                }
            }
            if (!A(this.f1270f)) {
                c(this.f1270f, true);
            }
        } else {
            TextView textView = this.f1270f;
            if (textView != null && A(textView)) {
                removeView(this.f1270f);
                this.I.remove(this.f1270f);
            }
        }
        TextView textView2 = this.f1270f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f1270f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
