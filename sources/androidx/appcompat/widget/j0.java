package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.view.m0;
import f.j;
import java.lang.reflect.Method;

public class j0 implements p {
    private static Method K;
    private static Method L;
    final i A;
    private final h B;
    private final g C;
    private final e D;
    private Runnable E;
    final Handler F;
    private final Rect G;
    private Rect H;
    private boolean I;
    PopupWindow J;

    /* renamed from: e  reason: collision with root package name */
    private Context f1440e;

    /* renamed from: f  reason: collision with root package name */
    private ListAdapter f1441f;

    /* renamed from: g  reason: collision with root package name */
    g0 f1442g;

    /* renamed from: h  reason: collision with root package name */
    private int f1443h;

    /* renamed from: i  reason: collision with root package name */
    private int f1444i;

    /* renamed from: j  reason: collision with root package name */
    private int f1445j;

    /* renamed from: k  reason: collision with root package name */
    private int f1446k;

    /* renamed from: l  reason: collision with root package name */
    private int f1447l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1448m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1449n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1450o;

    /* renamed from: p  reason: collision with root package name */
    private int f1451p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1452q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1453r;

    /* renamed from: s  reason: collision with root package name */
    int f1454s;

    /* renamed from: t  reason: collision with root package name */
    private View f1455t;

    /* renamed from: u  reason: collision with root package name */
    private int f1456u;

    /* renamed from: v  reason: collision with root package name */
    private DataSetObserver f1457v;

    /* renamed from: w  reason: collision with root package name */
    private View f1458w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f1459x;

    /* renamed from: y  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1460y;

    /* renamed from: z  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1461z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            View t10 = j0.this.t();
            if (t10 != null && t10.getWindowToken() != null) {
                j0.this.a();
            }
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            g0 g0Var;
            if (i10 != -1 && (g0Var = j0.this.f1442g) != null) {
                g0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void run() {
            j0.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        public void onChanged() {
            if (j0.this.d()) {
                j0.this.a();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !j0.this.A() && j0.this.J.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.F.removeCallbacks(j0Var.A);
                j0.this.A.run();
            }
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.J) != null && popupWindow.isShowing() && x10 >= 0 && x10 < j0.this.J.getWidth() && y10 >= 0 && y10 < j0.this.J.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.F.postDelayed(j0Var.A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.F.removeCallbacks(j0Var2.A);
                return false;
            }
        }
    }

    private class i implements Runnable {
        i() {
        }

        public void run() {
            g0 g0Var = j0.this.f1442g;
            if (g0Var != null && m0.T(g0Var) && j0.this.f1442g.getCount() > j0.this.f1442g.getChildCount()) {
                int childCount = j0.this.f1442g.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.f1454s) {
                    j0Var.J.setInputMethodMode(2);
                    j0.this.a();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                L = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context) {
        this(context, (AttributeSet) null, f.a.listPopupWindowStyle);
    }

    private void C() {
        View view = this.f1455t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1455t);
            }
        }
    }

    private void O(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.J, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            d.b(this.J, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.g0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.g0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.g0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.g0 r0 = r12.f1442g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f1440e
            androidx.appcompat.widget.j0$a r5 = new androidx.appcompat.widget.j0$a
            r5.<init>()
            r12.E = r5
            boolean r5 = r12.I
            r5 = r5 ^ r3
            androidx.appcompat.widget.g0 r5 = r12.s(r0, r5)
            r12.f1442g = r5
            android.graphics.drawable.Drawable r6 = r12.f1459x
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            android.widget.ListAdapter r6 = r12.f1441f
            r5.setAdapter(r6)
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1460y
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            r5.setFocusable(r3)
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            androidx.appcompat.widget.j0$b r6 = new androidx.appcompat.widget.j0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            androidx.appcompat.widget.j0$g r6 = r12.C
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1461z
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.g0 r6 = r12.f1442g
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.g0 r5 = r12.f1442g
            android.view.View r6 = r12.f1455t
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1456u
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1456u
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1444i
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.J
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1455t
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1448m
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f1446k = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.G
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.f1446k
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f1452q
            if (r4 != 0) goto L_0x0162
            int r4 = r12.f1443h
            if (r4 != r2) goto L_0x011c
            goto L_0x0162
        L_0x011c:
            int r4 = r12.f1444i
            r6 = -2
            if (r4 == r6) goto L_0x012b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x0144
        L_0x012b:
            android.content.Context r2 = r12.f1440e
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            androidx.appcompat.widget.g0 r6 = r12.f1442g
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0160
            androidx.appcompat.widget.g0 r2 = r12.f1442g
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.g0 r3 = r12.f1442g
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0160:
            int r1 = r1 + r0
            return r1
        L_0x0162:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.J, view, i10, z10);
    }

    public boolean A() {
        return this.J.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.I;
    }

    public void D(View view) {
        this.f1458w = view;
    }

    public void E(int i10) {
        this.J.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            this.f1444i = rect.left + rect.right + i10;
            return;
        }
        R(i10);
    }

    public void G(int i10) {
        this.f1451p = i10;
    }

    public void H(Rect rect) {
        this.H = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.J.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.I = z10;
        this.J.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1460y = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1461z = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f1450o = true;
        this.f1449n = z10;
    }

    public void P(int i10) {
        this.f1456u = i10;
    }

    public void Q(int i10) {
        g0 g0Var = this.f1442g;
        if (d() && g0Var != null) {
            g0Var.setListSelectionHidden(false);
            g0Var.setSelection(i10);
            if (g0Var.getChoiceMode() != 0) {
                g0Var.setItemChecked(i10, true);
            }
        }
    }

    public void R(int i10) {
        this.f1444i = i10;
    }

    public void a() {
        int q10 = q();
        boolean A2 = A();
        androidx.core.widget.h.b(this.J, this.f1447l);
        boolean z10 = true;
        if (!this.J.isShowing()) {
            int i10 = this.f1444i;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = t().getWidth();
            }
            int i11 = this.f1443h;
            if (i11 == -1) {
                q10 = -1;
            } else if (i11 != -2) {
                q10 = i11;
            }
            this.J.setWidth(i10);
            this.J.setHeight(q10);
            O(true);
            this.J.setOutsideTouchable(!this.f1453r && !this.f1452q);
            this.J.setTouchInterceptor(this.B);
            if (this.f1450o) {
                androidx.core.widget.h.a(this.J, this.f1449n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = L;
                if (method != null) {
                    try {
                        method.invoke(this.J, new Object[]{this.H});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                d.a(this.J, this.H);
            }
            androidx.core.widget.h.c(this.J, t(), this.f1445j, this.f1446k, this.f1451p);
            this.f1442g.setSelection(-1);
            if (!this.I || this.f1442g.isInTouchMode()) {
                r();
            }
            if (!this.I) {
                this.F.post(this.D);
            }
        } else if (m0.T(t())) {
            int i12 = this.f1444i;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = t().getWidth();
            }
            int i13 = this.f1443h;
            if (i13 == -1) {
                if (!A2) {
                    q10 = -1;
                }
                if (A2) {
                    this.J.setWidth(this.f1444i == -1 ? -1 : 0);
                    this.J.setHeight(0);
                } else {
                    this.J.setWidth(this.f1444i == -1 ? -1 : 0);
                    this.J.setHeight(-1);
                }
            } else if (i13 != -2) {
                q10 = i13;
            }
            PopupWindow popupWindow = this.J;
            if (this.f1453r || this.f1452q) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.J.update(t(), this.f1445j, this.f1446k, i12 < 0 ? -1 : i12, q10 < 0 ? -1 : q10);
        }
    }

    public void b(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f1445j;
    }

    public boolean d() {
        return this.J.isShowing();
    }

    public void dismiss() {
        this.J.dismiss();
        C();
        this.J.setContentView((View) null);
        this.f1442g = null;
        this.F.removeCallbacks(this.A);
    }

    public Drawable g() {
        return this.J.getBackground();
    }

    public ListView h() {
        return this.f1442g;
    }

    public void j(int i10) {
        this.f1446k = i10;
        this.f1448m = true;
    }

    public void l(int i10) {
        this.f1445j = i10;
    }

    public int n() {
        if (!this.f1448m) {
            return 0;
        }
        return this.f1446k;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1457v;
        if (dataSetObserver == null) {
            this.f1457v = new f();
        } else {
            ListAdapter listAdapter2 = this.f1441f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1441f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1457v);
        }
        g0 g0Var = this.f1442g;
        if (g0Var != null) {
            g0Var.setAdapter(this.f1441f);
        }
    }

    public void r() {
        g0 g0Var = this.f1442g;
        if (g0Var != null) {
            g0Var.setListSelectionHidden(true);
            g0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public g0 s(Context context, boolean z10) {
        return new g0(context, z10);
    }

    public View t() {
        return this.f1458w;
    }

    public Object v() {
        if (!d()) {
            return null;
        }
        return this.f1442g.getSelectedItem();
    }

    public long w() {
        if (!d()) {
            return Long.MIN_VALUE;
        }
        return this.f1442g.getSelectedItemId();
    }

    public int x() {
        if (!d()) {
            return -1;
        }
        return this.f1442g.getSelectedItemPosition();
    }

    public View y() {
        if (!d()) {
            return null;
        }
        return this.f1442g.getSelectedView();
    }

    public int z() {
        return this.f1444i;
    }

    public j0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1443h = -2;
        this.f1444i = -2;
        this.f1447l = 1002;
        this.f1451p = 0;
        this.f1452q = false;
        this.f1453r = false;
        this.f1454s = Integer.MAX_VALUE;
        this.f1456u = 0;
        this.A = new i();
        this.B = new h();
        this.C = new g();
        this.D = new e();
        this.G = new Rect();
        this.f1440e = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11275t1, i10, i11);
        this.f1445j = obtainStyledAttributes.getDimensionPixelOffset(j.f11280u1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f11285v1, 0);
        this.f1446k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1448m = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i10, i11);
        this.J = qVar;
        qVar.setInputMethodMode(1);
    }
}
