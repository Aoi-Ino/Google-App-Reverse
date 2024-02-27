package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.v0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.h;
import com.google.android.material.internal.i;
import com.google.android.material.internal.l;
import com.google.android.material.internal.w;
import d5.g;
import i5.k;
import i5.o;
import java.util.Objects;
import q4.j;
import q4.k;

public class NavigationView extends l implements d5.b {
    private static final int[] A = {-16842910};
    private static final int B = j.Widget_Design_NavigationView;

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f6218z = {16842912};

    /* renamed from: l  reason: collision with root package name */
    private final h f6219l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final i f6220m;

    /* renamed from: n  reason: collision with root package name */
    d f6221n;

    /* renamed from: o  reason: collision with root package name */
    private final int f6222o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final int[] f6223p;

    /* renamed from: q  reason: collision with root package name */
    private MenuInflater f6224q;

    /* renamed from: r  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f6225r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6226s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6227t;

    /* renamed from: u  reason: collision with root package name */
    private int f6228u;

    /* renamed from: v  reason: collision with root package name */
    private final o f6229v;

    /* renamed from: w  reason: collision with root package name */
    private final g f6230w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final d5.c f6231x;

    /* renamed from: y  reason: collision with root package name */
    private final DrawerLayout.e f6232y;

    class a extends DrawerLayout.h {
        a() {
        }

        public void c(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                d5.c g10 = navigationView.f6231x;
                Objects.requireNonNull(g10);
                view.post(new d(g10));
            }
        }

        public void d(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f6231x.e();
            }
        }
    }

    class b implements g.a {
        b() {
        }

        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            d dVar = NavigationView.this.f6221n;
            return dVar != null && dVar.a(menuItem);
        }

        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f6223p);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f6223p[1] == 0;
            NavigationView.this.f6220m.F(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.r());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f6223p[0] == 0 || NavigationView.this.f6223p[0] + NavigationView.this.getWidth() == 0);
            Activity a10 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
            if (a10 != null) {
                Rect a11 = w.a(a10);
                boolean z12 = a11.height() - NavigationView.this.getHeight() == NavigationView.this.f6223p[1];
                boolean z13 = Color.alpha(a10.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.q());
                if (!(a11.width() == NavigationView.this.f6223p[0] || a11.width() - NavigationView.this.getWidth() == NavigationView.this.f6223p[0])) {
                    z10 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    public static class e extends b0.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public Bundle f6236g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            /* renamed from: c */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6236g = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f6236g);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.navigationViewStyle);
    }

    private MenuInflater getMenuInflater() {
        if (this.f6224q == null) {
            this.f6224q = new androidx.appcompat.view.g(getContext());
        }
        return this.f6224q;
    }

    private ColorStateList j(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList a10 = g.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(f.a.f11177w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = a10.getDefaultColor();
        int[] iArr = A;
        return new ColorStateList(new int[][]{iArr, f6218z, FrameLayout.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable k(v0 v0Var) {
        return l(v0Var, f5.c.b(getContext(), v0Var, k.W4));
    }

    private Drawable l(v0 v0Var, ColorStateList colorStateList) {
        i5.g gVar = new i5.g(i5.k.b(getContext(), v0Var.n(k.U4, 0), v0Var.n(k.V4, 0)).m());
        gVar.W(colorStateList);
        return new InsetDrawable(gVar, v0Var.f(k.Z4, 0), v0Var.f(k.f14973a5, 0), v0Var.f(k.Y4, 0), v0Var.f(k.X4, 0));
    }

    private boolean n(v0 v0Var) {
        return v0Var.s(k.U4) || v0Var.s(k.V4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private void t(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f) && this.f6228u > 0 && (getBackground() instanceof i5.g)) {
            boolean z10 = androidx.core.view.o.b(((DrawerLayout.f) getLayoutParams()).f2822a, m0.B(this)) == 3;
            i5.g gVar = (i5.g) getBackground();
            k.b o10 = gVar.D().v().o((float) this.f6228u);
            if (z10) {
                o10.A(0.0f);
                o10.s(0.0f);
            } else {
                o10.E(0.0f);
                o10.w(0.0f);
            }
            i5.k m10 = o10.m();
            gVar.setShapeAppearanceModel(m10);
            this.f6229v.f(this, m10);
            this.f6229v.e(this, new RectF(0.0f, 0.0f, (float) i10, (float) i11));
            this.f6229v.h(this, true);
        }
    }

    private Pair u() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void v() {
        this.f6225r = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6225r);
    }

    public void a() {
        Pair u10 = u();
        DrawerLayout drawerLayout = (DrawerLayout) u10.first;
        androidx.activity.b c10 = this.f6230w.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.g(this);
            return;
        }
        this.f6230w.h(c10, ((DrawerLayout.f) u10.second).f2822a, b.b(drawerLayout, this), b.c(drawerLayout));
    }

    public void b(androidx.activity.b bVar) {
        u();
        this.f6230w.j(bVar);
    }

    public void c(androidx.activity.b bVar) {
        this.f6230w.l(bVar, ((DrawerLayout.f) u().second).f2822a);
    }

    public void d() {
        u();
        this.f6230w.f();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f6229v.d(canvas, new c(this));
    }

    /* access modifiers changed from: protected */
    public void e(k1 k1Var) {
        this.f6220m.h(k1Var);
    }

    /* access modifiers changed from: package-private */
    public d5.g getBackHelper() {
        return this.f6230w;
    }

    public MenuItem getCheckedItem() {
        return this.f6220m.o();
    }

    public int getDividerInsetEnd() {
        return this.f6220m.p();
    }

    public int getDividerInsetStart() {
        return this.f6220m.q();
    }

    public int getHeaderCount() {
        return this.f6220m.r();
    }

    public Drawable getItemBackground() {
        return this.f6220m.t();
    }

    public int getItemHorizontalPadding() {
        return this.f6220m.u();
    }

    public int getItemIconPadding() {
        return this.f6220m.v();
    }

    public ColorStateList getItemIconTintList() {
        return this.f6220m.y();
    }

    public int getItemMaxLines() {
        return this.f6220m.w();
    }

    public ColorStateList getItemTextColor() {
        return this.f6220m.x();
    }

    public int getItemVerticalPadding() {
        return this.f6220m.z();
    }

    public Menu getMenu() {
        return this.f6219l;
    }

    public int getSubheaderInsetEnd() {
        return this.f6220m.B();
    }

    public int getSubheaderInsetStart() {
        return this.f6220m.C();
    }

    public View m(int i10) {
        return this.f6220m.s(i10);
    }

    public View o(int i10) {
        return this.f6220m.E(i10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i5.h.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f6231x.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.N(this.f6232y);
            drawerLayout.b(this.f6232y);
            if (drawerLayout.D(this)) {
                this.f6231x.d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f6225r);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).N(this.f6232y);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                min = this.f6222o;
            }
            super.onMeasure(i10, i11);
        }
        min = Math.min(View.MeasureSpec.getSize(i10), this.f6222o);
        i10 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.c());
        this.f6219l.S(eVar.f6236g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f6236g = bundle;
        this.f6219l.U(bundle);
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        t(i10, i11);
    }

    public void p(int i10) {
        this.f6220m.a0(true);
        getMenuInflater().inflate(i10, this.f6219l);
        this.f6220m.a0(false);
        this.f6220m.i(false);
    }

    public boolean q() {
        return this.f6227t;
    }

    public boolean r() {
        return this.f6226s;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f6227t = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f6219l.findItem(i10);
        if (findItem != null) {
            this.f6220m.G((androidx.appcompat.view.menu.i) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        this.f6220m.H(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.f6220m.I(i10);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        i5.h.d(this, f10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        this.f6229v.g(this, z10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f6220m.K(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(androidx.core.content.a.e(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        this.f6220m.M(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.f6220m.M(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.f6220m.N(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f6220m.N(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.f6220m.O(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f6220m.P(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f6220m.Q(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.f6220m.R(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f6220m.S(z10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f6220m.T(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.f6220m.U(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.f6220m.U(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(d dVar) {
        this.f6221n = dVar;
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        i iVar = this.f6220m;
        if (iVar != null) {
            iVar.V(i10);
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        this.f6220m.X(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.f6220m.Y(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f6226s = z10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = B
            r1 = r17
            android.content.Context r1 = m5.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.i r10 = new com.google.android.material.internal.i
            r10.<init>()
            r0.f6220m = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.f6223p = r1
            r11 = 1
            r0.f6226s = r11
            r0.f6227t = r11
            r12 = 0
            r0.f6228u = r12
            i5.o r1 = i5.o.a(r16)
            r0.f6229v = r1
            d5.g r1 = new d5.g
            r1.<init>(r0)
            r0.f6230w = r1
            d5.c r1 = new d5.c
            r1.<init>(r0)
            r0.f6231x = r1
            com.google.android.material.navigation.NavigationView$a r1 = new com.google.android.material.navigation.NavigationView$a
            r1.<init>()
            r0.f6232y = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.h r14 = new com.google.android.material.internal.h
            r14.<init>(r13)
            r0.f6219l = r14
            int[] r3 = q4.k.D4
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.v0 r1 = com.google.android.material.internal.r.j(r1, r2, r3, r4, r5, r6)
            int r2 = q4.k.E4
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            androidx.core.view.m0.u0(r0, r2)
        L_0x0068:
            int r2 = q4.k.K4
            int r2 = r1.f(r2, r12)
            r0.f6228u = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            android.content.res.ColorStateList r3 = z4.e.f(r2)
            if (r2 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x0094
        L_0x007c:
            i5.k$b r2 = i5.k.e(r13, r7, r8, r9)
            i5.k r2 = r2.m()
            i5.g r4 = new i5.g
            r4.<init>((i5.k) r2)
            if (r3 == 0) goto L_0x008e
            r4.W(r3)
        L_0x008e:
            r4.M(r13)
            androidx.core.view.m0.u0(r0, r4)
        L_0x0094:
            int r2 = q4.k.L4
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x00a4
            int r2 = r1.f(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00a4:
            int r2 = q4.k.F4
            boolean r2 = r1.a(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = q4.k.G4
            int r2 = r1.f(r2, r12)
            r0.f6222o = r2
            int r2 = q4.k.f15033g5
            boolean r3 = r1.s(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00c3
            android.content.res.ColorStateList r2 = r1.c(r2)
            goto L_0x00c4
        L_0x00c3:
            r2 = r4
        L_0x00c4:
            int r3 = q4.k.f15063j5
            boolean r5 = r1.s(r3)
            if (r5 == 0) goto L_0x00d1
            int r3 = r1.n(r3, r12)
            goto L_0x00d2
        L_0x00d1:
            r3 = r12
        L_0x00d2:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00dd
            if (r2 != 0) goto L_0x00dd
            android.content.res.ColorStateList r2 = r0.j(r5)
        L_0x00dd:
            int r6 = q4.k.R4
            boolean r7 = r1.s(r6)
            if (r7 == 0) goto L_0x00ea
            android.content.res.ColorStateList r5 = r1.c(r6)
            goto L_0x00ee
        L_0x00ea:
            android.content.res.ColorStateList r5 = r0.j(r5)
        L_0x00ee:
            int r6 = q4.k.f14983b5
            boolean r7 = r1.s(r6)
            if (r7 == 0) goto L_0x00fb
            int r6 = r1.n(r6, r12)
            goto L_0x00fc
        L_0x00fb:
            r6 = r12
        L_0x00fc:
            int r7 = q4.k.f14993c5
            boolean r7 = r1.a(r7, r11)
            int r8 = q4.k.Q4
            boolean r9 = r1.s(r8)
            if (r9 == 0) goto L_0x0111
            int r8 = r1.f(r8, r12)
            r0.setItemIconSize(r8)
        L_0x0111:
            int r8 = q4.k.f15003d5
            boolean r9 = r1.s(r8)
            if (r9 == 0) goto L_0x011e
            android.content.res.ColorStateList r8 = r1.c(r8)
            goto L_0x011f
        L_0x011e:
            r8 = r4
        L_0x011f:
            if (r6 != 0) goto L_0x012a
            if (r8 != 0) goto L_0x012a
            r8 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r8 = r0.j(r8)
        L_0x012a:
            int r9 = q4.k.N4
            android.graphics.drawable.Drawable r9 = r1.g(r9)
            if (r9 != 0) goto L_0x0154
            boolean r15 = r0.n(r1)
            if (r15 == 0) goto L_0x0154
            android.graphics.drawable.Drawable r9 = r0.k(r1)
            int r15 = q4.k.T4
            android.content.res.ColorStateList r15 = f5.c.b(r13, r1, r15)
            if (r15 == 0) goto L_0x0154
            android.graphics.drawable.Drawable r11 = r0.l(r1, r4)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r15 = g5.b.a(r15)
            r12.<init>(r15, r4, r11)
            r10.L(r12)
        L_0x0154:
            int r4 = q4.k.O4
            boolean r11 = r1.s(r4)
            if (r11 == 0) goto L_0x0165
            r11 = 0
            int r4 = r1.f(r4, r11)
            r0.setItemHorizontalPadding(r4)
            goto L_0x0166
        L_0x0165:
            r11 = 0
        L_0x0166:
            int r4 = q4.k.f15013e5
            boolean r12 = r1.s(r4)
            if (r12 == 0) goto L_0x0175
            int r4 = r1.f(r4, r11)
            r0.setItemVerticalPadding(r4)
        L_0x0175:
            int r4 = q4.k.J4
            int r4 = r1.f(r4, r11)
            r0.setDividerInsetStart(r4)
            int r4 = q4.k.I4
            int r4 = r1.f(r4, r11)
            r0.setDividerInsetEnd(r4)
            int r4 = q4.k.f15053i5
            int r4 = r1.f(r4, r11)
            r0.setSubheaderInsetStart(r4)
            int r4 = q4.k.f15043h5
            int r4 = r1.f(r4, r11)
            r0.setSubheaderInsetEnd(r4)
            int r4 = q4.k.f15073k5
            boolean r12 = r0.f6226s
            boolean r4 = r1.a(r4, r12)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = q4.k.H4
            boolean r12 = r0.f6227t
            boolean r4 = r1.a(r4, r12)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = q4.k.P4
            int r4 = r1.f(r4, r11)
            int r11 = q4.k.S4
            r12 = 1
            int r11 = r1.k(r11, r12)
            r0.setItemMaxLines(r11)
            com.google.android.material.navigation.NavigationView$b r11 = new com.google.android.material.navigation.NavigationView$b
            r11.<init>()
            r14.V(r11)
            r10.J(r12)
            r10.e(r13, r14)
            if (r3 == 0) goto L_0x01d2
            r10.Z(r3)
        L_0x01d2:
            r10.W(r2)
            r10.P(r5)
            int r2 = r16.getOverScrollMode()
            r10.V(r2)
            if (r6 == 0) goto L_0x01e4
            r10.R(r6)
        L_0x01e4:
            r10.S(r7)
            r10.T(r8)
            r10.K(r9)
            r10.N(r4)
            r14.b(r10)
            androidx.appcompat.view.menu.n r2 = r10.A(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = q4.k.f15023f5
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x020d
            r3 = 0
            int r2 = r1.n(r2, r3)
            r0.p(r2)
            goto L_0x020e
        L_0x020d:
            r3 = 0
        L_0x020e:
            int r2 = q4.k.M4
            boolean r4 = r1.s(r2)
            if (r4 == 0) goto L_0x021d
            int r2 = r1.n(r2, r3)
            r0.o(r2)
        L_0x021d:
            r1.w()
            r16.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f6219l.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f6220m.G((androidx.appcompat.view.menu.i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
