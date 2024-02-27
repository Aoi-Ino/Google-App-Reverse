package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import androidx.core.view.m0;
import androidx.core.view.o;
import f.g;
import java.util.ArrayList;
import java.util.List;

final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = g.abc_cascading_menu_item_layout;
    private boolean A;
    private m.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;

    /* renamed from: f  reason: collision with root package name */
    private final Context f925f;

    /* renamed from: g  reason: collision with root package name */
    private final int f926g;

    /* renamed from: h  reason: collision with root package name */
    private final int f927h;

    /* renamed from: i  reason: collision with root package name */
    private final int f928i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f929j;

    /* renamed from: k  reason: collision with root package name */
    final Handler f930k;

    /* renamed from: l  reason: collision with root package name */
    private final List f931l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    final List f932m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f933n = new a();

    /* renamed from: o  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f934o = new b();

    /* renamed from: p  reason: collision with root package name */
    private final k0 f935p = new c();

    /* renamed from: q  reason: collision with root package name */
    private int f936q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f937r = 0;

    /* renamed from: s  reason: collision with root package name */
    private View f938s;

    /* renamed from: t  reason: collision with root package name */
    View f939t;

    /* renamed from: u  reason: collision with root package name */
    private int f940u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f941v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f942w;

    /* renamed from: x  reason: collision with root package name */
    private int f943x;

    /* renamed from: y  reason: collision with root package name */
    private int f944y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f945z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.d() && d.this.f932m.size() > 0 && !((C0015d) d.this.f932m.get(0)).f953a.B()) {
                View view = d.this.f939t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0015d dVar : d.this.f932m) {
                    dVar.f953a.a();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.f933n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements k0 {

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0015d f949e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ MenuItem f950f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ g f951g;

            a(C0015d dVar, MenuItem menuItem, g gVar) {
                this.f949e = dVar;
                this.f950f = menuItem;
                this.f951g = gVar;
            }

            public void run() {
                C0015d dVar = this.f949e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.f954b.e(false);
                    d.this.E = false;
                }
                if (this.f950f.isEnabled() && this.f950f.hasSubMenu()) {
                    this.f951g.N(this.f950f, 4);
                }
            }
        }

        c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.d$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(androidx.appcompat.view.menu.g r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                android.os.Handler r0 = r0.f930k
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f932m
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.d r4 = androidx.appcompat.view.menu.d.this
                java.util.List r4 = r4.f932m
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.d$d r4 = (androidx.appcompat.view.menu.d.C0015d) r4
                androidx.appcompat.view.menu.g r4 = r4.f954b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f932m
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f932m
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.d$d r1 = (androidx.appcompat.view.menu.d.C0015d) r1
            L_0x0041:
                androidx.appcompat.view.menu.d$c$a r0 = new androidx.appcompat.view.menu.d$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.d r7 = androidx.appcompat.view.menu.d.this
                android.os.Handler r7 = r7.f930k
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.c.e(androidx.appcompat.view.menu.g, android.view.MenuItem):void");
        }

        public void f(g gVar, MenuItem menuItem) {
            d.this.f930k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    private static class C0015d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f953a;

        /* renamed from: b  reason: collision with root package name */
        public final g f954b;

        /* renamed from: c  reason: collision with root package name */
        public final int f955c;

        public C0015d(l0 l0Var, g gVar, int i10) {
            this.f953a = l0Var;
            this.f954b = gVar;
            this.f955c = i10;
        }

        public ListView a() {
            return this.f953a.h();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f925f = context;
        this.f938s = view;
        this.f927h = i10;
        this.f928i = i11;
        this.f929j = z10;
        this.f945z = false;
        this.f940u = G();
        Resources resources = context.getResources();
        this.f926g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.abc_config_prefDialogWidth));
        this.f930k = new Handler();
    }

    private l0 C() {
        l0 l0Var = new l0(this.f925f, (AttributeSet) null, this.f927h, this.f928i);
        l0Var.U(this.f935p);
        l0Var.L(this);
        l0Var.K(this);
        l0Var.D(this.f938s);
        l0Var.G(this.f937r);
        l0Var.J(true);
        l0Var.I(2);
        return l0Var;
    }

    private int D(g gVar) {
        int size = this.f932m.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == ((C0015d) this.f932m.get(i10)).f954b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem E(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View F(C0015d dVar, g gVar) {
        int i10;
        f fVar;
        int firstVisiblePosition;
        MenuItem E2 = E(dVar.f954b, gVar);
        if (E2 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i10 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (E2 == fVar.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return m0.B(this.f938s) == 1 ? 0 : 1;
    }

    private int H(int i10) {
        List list = this.f932m;
        ListView a10 = ((C0015d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f939t.getWindowVisibleDisplayFrame(rect);
        return this.f940u == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void I(g gVar) {
        View view;
        C0015d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f925f);
        f fVar = new f(gVar, from, this.f929j, F);
        if (!d() && this.f945z) {
            fVar.d(true);
        } else if (d()) {
            fVar.d(k.A(gVar));
        }
        int r10 = k.r(fVar, (ViewGroup) null, this.f925f, this.f926g);
        l0 C2 = C();
        C2.p(fVar);
        C2.F(r10);
        C2.G(this.f937r);
        if (this.f932m.size() > 0) {
            List list = this.f932m;
            dVar = (C0015d) list.get(list.size() - 1);
            view = F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C2.V(false);
            C2.S((Object) null);
            int H = H(r10);
            boolean z10 = H == 1;
            this.f940u = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C2.D(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f938s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f937r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f938s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f937r & 5) != 5) {
                if (z10) {
                    r10 = view.getWidth();
                }
                i12 = i10 - r10;
                C2.l(i12);
                C2.N(true);
                C2.j(i11);
            } else if (!z10) {
                r10 = view.getWidth();
                i12 = i10 - r10;
                C2.l(i12);
                C2.N(true);
                C2.j(i11);
            }
            i12 = i10 + r10;
            C2.l(i12);
            C2.N(true);
            C2.j(i11);
        } else {
            if (this.f941v) {
                C2.l(this.f943x);
            }
            if (this.f942w) {
                C2.j(this.f944y);
            }
            C2.H(q());
        }
        this.f932m.add(new C0015d(C2, gVar, this.f940u));
        C2.a();
        ListView h10 = C2.h();
        h10.setOnKeyListener(this);
        if (dVar == null && this.A && gVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, h10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.z());
            h10.addHeaderView(frameLayout, (Object) null, false);
            C2.a();
        }
    }

    public void a() {
        if (!d()) {
            for (g I : this.f931l) {
                I(I);
            }
            this.f931l.clear();
            View view = this.f938s;
            this.f939t = view;
            if (view != null) {
                boolean z10 = this.C == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f933n);
                }
                this.f939t.addOnAttachStateChangeListener(this.f934o);
            }
        }
    }

    public void b(g gVar, boolean z10) {
        int D2 = D(gVar);
        if (D2 >= 0) {
            int i10 = D2 + 1;
            if (i10 < this.f932m.size()) {
                ((C0015d) this.f932m.get(i10)).f954b.e(false);
            }
            C0015d dVar = (C0015d) this.f932m.remove(D2);
            dVar.f954b.Q(this);
            if (this.E) {
                dVar.f953a.T((Object) null);
                dVar.f953a.E(0);
            }
            dVar.f953a.dismiss();
            int size = this.f932m.size();
            this.f940u = size > 0 ? ((C0015d) this.f932m.get(size - 1)).f955c : G();
            if (size == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.f933n);
                    }
                    this.C = null;
                }
                this.f939t.removeOnAttachStateChangeListener(this.f934o);
                this.D.onDismiss();
            } else if (z10) {
                ((C0015d) this.f932m.get(0)).f954b.e(false);
            }
        }
    }

    public boolean d() {
        return this.f932m.size() > 0 && ((C0015d) this.f932m.get(0)).f953a.d();
    }

    public void dismiss() {
        int size = this.f932m.size();
        if (size > 0) {
            C0015d[] dVarArr = (C0015d[]) this.f932m.toArray(new C0015d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0015d dVar = dVarArr[i10];
                if (dVar.f953a.d()) {
                    dVar.f953a.dismiss();
                }
            }
        }
    }

    public void f(Parcelable parcelable) {
    }

    public boolean g(r rVar) {
        for (C0015d dVar : this.f932m) {
            if (rVar == dVar.f954b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        o(rVar);
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    public ListView h() {
        if (this.f932m.isEmpty()) {
            return null;
        }
        List list = this.f932m;
        return ((C0015d) list.get(list.size() - 1)).a();
    }

    public void i(boolean z10) {
        for (C0015d a10 : this.f932m) {
            k.B(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public Parcelable k() {
        return null;
    }

    public void n(m.a aVar) {
        this.B = aVar;
    }

    public void o(g gVar) {
        gVar.c(this, this.f925f);
        if (d()) {
            I(gVar);
        } else {
            this.f931l.add(gVar);
        }
    }

    public void onDismiss() {
        C0015d dVar;
        int size = this.f932m.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (C0015d) this.f932m.get(i10);
            if (!dVar.f953a.d()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f954b.e(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean p() {
        return false;
    }

    public void s(View view) {
        if (this.f938s != view) {
            this.f938s = view;
            this.f937r = o.b(this.f936q, m0.B(view));
        }
    }

    public void u(boolean z10) {
        this.f945z = z10;
    }

    public void v(int i10) {
        if (this.f936q != i10) {
            this.f936q = i10;
            this.f937r = o.b(i10, m0.B(this.f938s));
        }
    }

    public void w(int i10) {
        this.f941v = true;
        this.f943x = i10;
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    public void y(boolean z10) {
        this.A = z10;
    }

    public void z(int i10) {
        this.f942w = true;
        this.f944y = i10;
    }
}
