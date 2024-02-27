package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import androidx.core.view.m0;
import f.d;
import f.g;

final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: z  reason: collision with root package name */
    private static final int f1057z = g.abc_popup_menu_item_layout;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1058f;

    /* renamed from: g  reason: collision with root package name */
    private final g f1059g;

    /* renamed from: h  reason: collision with root package name */
    private final f f1060h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1061i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1062j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1063k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1064l;

    /* renamed from: m  reason: collision with root package name */
    final l0 f1065m;

    /* renamed from: n  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1066n = new a();

    /* renamed from: o  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1067o = new b();

    /* renamed from: p  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1068p;

    /* renamed from: q  reason: collision with root package name */
    private View f1069q;

    /* renamed from: r  reason: collision with root package name */
    View f1070r;

    /* renamed from: s  reason: collision with root package name */
    private m.a f1071s;

    /* renamed from: t  reason: collision with root package name */
    ViewTreeObserver f1072t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1073u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1074v;

    /* renamed from: w  reason: collision with root package name */
    private int f1075w;

    /* renamed from: x  reason: collision with root package name */
    private int f1076x = 0;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1077y;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.d() && !q.this.f1065m.B()) {
                View view = q.this.f1070r;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.f1065m.a();
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
            ViewTreeObserver viewTreeObserver = q.this.f1072t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f1072t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f1072t.removeGlobalOnLayoutListener(qVar.f1066n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f1058f = context;
        this.f1059g = gVar;
        this.f1061i = z10;
        this.f1060h = new f(gVar, LayoutInflater.from(context), z10, f1057z);
        this.f1063k = i10;
        this.f1064l = i11;
        Resources resources = context.getResources();
        this.f1062j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.f1069q = view;
        this.f1065m = new l0(context, (AttributeSet) null, i10, i11);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (d()) {
            return true;
        }
        if (this.f1073u || (view = this.f1069q) == null) {
            return false;
        }
        this.f1070r = view;
        this.f1065m.K(this);
        this.f1065m.L(this);
        this.f1065m.J(true);
        View view2 = this.f1070r;
        boolean z10 = this.f1072t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1072t = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1066n);
        }
        view2.addOnAttachStateChangeListener(this.f1067o);
        this.f1065m.D(view2);
        this.f1065m.G(this.f1076x);
        if (!this.f1074v) {
            this.f1075w = k.r(this.f1060h, (ViewGroup) null, this.f1058f, this.f1062j);
            this.f1074v = true;
        }
        this.f1065m.F(this.f1075w);
        this.f1065m.I(2);
        this.f1065m.H(q());
        this.f1065m.a();
        ListView h10 = this.f1065m.h();
        h10.setOnKeyListener(this);
        if (this.f1077y && this.f1059g.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1058f).inflate(g.abc_popup_menu_header_item_layout, h10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1059g.z());
            }
            frameLayout.setEnabled(false);
            h10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1065m.p(this.f1060h);
        this.f1065m.a();
        return true;
    }

    public void a() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void b(g gVar, boolean z10) {
        if (gVar == this.f1059g) {
            dismiss();
            m.a aVar = this.f1071s;
            if (aVar != null) {
                aVar.b(gVar, z10);
            }
        }
    }

    public boolean d() {
        return !this.f1073u && this.f1065m.d();
    }

    public void dismiss() {
        if (d()) {
            this.f1065m.dismiss();
        }
    }

    public void f(Parcelable parcelable) {
    }

    public boolean g(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f1058f, rVar, this.f1070r, this.f1061i, this.f1063k, this.f1064l);
            lVar.j(this.f1071s);
            lVar.g(k.A(rVar));
            lVar.i(this.f1068p);
            this.f1068p = null;
            this.f1059g.e(false);
            int c10 = this.f1065m.c();
            int n10 = this.f1065m.n();
            if ((Gravity.getAbsoluteGravity(this.f1076x, m0.B(this.f1069q)) & 7) == 5) {
                c10 += this.f1069q.getWidth();
            }
            if (lVar.n(c10, n10)) {
                m.a aVar = this.f1071s;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    public ListView h() {
        return this.f1065m.h();
    }

    public void i(boolean z10) {
        this.f1074v = false;
        f fVar = this.f1060h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public Parcelable k() {
        return null;
    }

    public void n(m.a aVar) {
        this.f1071s = aVar;
    }

    public void o(g gVar) {
    }

    public void onDismiss() {
        this.f1073u = true;
        this.f1059g.close();
        ViewTreeObserver viewTreeObserver = this.f1072t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1072t = this.f1070r.getViewTreeObserver();
            }
            this.f1072t.removeGlobalOnLayoutListener(this.f1066n);
            this.f1072t = null;
        }
        this.f1070r.removeOnAttachStateChangeListener(this.f1067o);
        PopupWindow.OnDismissListener onDismissListener = this.f1068p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void s(View view) {
        this.f1069q = view;
    }

    public void u(boolean z10) {
        this.f1060h.d(z10);
    }

    public void v(int i10) {
        this.f1076x = i10;
    }

    public void w(int i10) {
        this.f1065m.l(i10);
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1068p = onDismissListener;
    }

    public void y(boolean z10) {
        this.f1077y = z10;
    }

    public void z(int i10) {
        this.f1065m.j(i10);
    }
}
