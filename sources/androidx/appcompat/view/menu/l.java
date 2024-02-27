package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.m0;
import androidx.core.view.o;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1043a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1044b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1045c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1046d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1047e;

    /* renamed from: f  reason: collision with root package name */
    private View f1048f;

    /* renamed from: g  reason: collision with root package name */
    private int f1049g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1050h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f1051i;

    /* renamed from: j  reason: collision with root package name */
    private k f1052j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1053k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1054l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            l.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.k a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f1043a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.l.b.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f1043a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = f.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r3 = r15.f1043a
            android.view.View r4 = r15.f1048f
            int r5 = r15.f1046d
            int r6 = r15.f1047e
            boolean r7 = r15.f1045c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r9 = r15.f1043a
            androidx.appcompat.view.menu.g r10 = r15.f1044b
            android.view.View r11 = r15.f1048f
            int r12 = r15.f1046d
            int r13 = r15.f1047e
            boolean r14 = r15.f1045c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.g r1 = r15.f1044b
            r0.o(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f1054l
            r0.x(r1)
            android.view.View r1 = r15.f1048f
            r0.s(r1)
            androidx.appcompat.view.menu.m$a r1 = r15.f1051i
            r0.n(r1)
            boolean r1 = r15.f1050h
            r0.u(r1)
            int r1 = r15.f1049g
            r0.v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.a():androidx.appcompat.view.menu.k");
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k c10 = c();
        c10.y(z11);
        if (z10) {
            if ((o.b(this.f1049g, m0.B(this.f1048f)) & 7) == 5) {
                i10 -= this.f1048f.getWidth();
            }
            c10.w(i10);
            c10.z(i11);
            int i12 = (int) ((this.f1043a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.t(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f1052j.dismiss();
        }
    }

    public k c() {
        if (this.f1052j == null) {
            this.f1052j = a();
        }
        return this.f1052j;
    }

    public boolean d() {
        k kVar = this.f1052j;
        return kVar != null && kVar.d();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f1052j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1053k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1048f = view;
    }

    public void g(boolean z10) {
        this.f1050h = z10;
        k kVar = this.f1052j;
        if (kVar != null) {
            kVar.u(z10);
        }
    }

    public void h(int i10) {
        this.f1049g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1053k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f1051i = aVar;
        k kVar = this.f1052j;
        if (kVar != null) {
            kVar.n(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1048f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1048f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f1049g = 8388611;
        this.f1054l = new a();
        this.f1043a = context;
        this.f1044b = gVar;
        this.f1048f = view;
        this.f1045c = z10;
        this.f1046d = i10;
        this.f1047e = i11;
    }
}
