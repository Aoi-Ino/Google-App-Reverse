package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

public final class i<S> extends q {

    /* renamed from: t0  reason: collision with root package name */
    static final Object f5893t0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: u0  reason: collision with root package name */
    static final Object f5894u0 = "NAVIGATION_PREV_TAG";

    /* renamed from: v0  reason: collision with root package name */
    static final Object f5895v0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: w0  reason: collision with root package name */
    static final Object f5896w0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: i0  reason: collision with root package name */
    private int f5897i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public a f5898j0;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public m f5899k0;

    /* renamed from: l0  reason: collision with root package name */
    private l f5900l0;

    /* renamed from: m0  reason: collision with root package name */
    private c f5901m0;

    /* renamed from: n0  reason: collision with root package name */
    private RecyclerView f5902n0;
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public RecyclerView f5903o0;

    /* renamed from: p0  reason: collision with root package name */
    private View f5904p0;

    /* renamed from: q0  reason: collision with root package name */
    private View f5905q0;

    /* renamed from: r0  reason: collision with root package name */
    private View f5906r0;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public View f5907s0;

    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f5908e;

        a(o oVar) {
            this.f5908e = oVar;
        }

        public void onClick(View view) {
            int g22 = i.this.k2().g2() - 1;
            if (g22 >= 0) {
                i.this.n2(this.f5908e.B(g22));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5910e;

        b(int i10) {
            this.f5910e = i10;
        }

        public void run() {
            i.this.f5903o0.r1(this.f5910e);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.o0((Object) null);
        }
    }

    class d extends r {
        final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        /* access modifiers changed from: protected */
        public void S1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = i.this.f5903o0.getWidth();
                iArr[1] = i.this.f5903o0.getWidth();
                return;
            }
            iArr[0] = i.this.f5903o0.getHeight();
            iArr[1] = i.this.f5903o0.getHeight();
        }
    }

    class e implements m {
        e() {
        }

        public void a(long j10) {
            if (i.this.f5898j0.h().a(j10)) {
                d unused = i.this.getClass();
                throw null;
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.F0(false);
        }
    }

    class g extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f5915a = t.i();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f5916b = t.i();

        g() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                u uVar = (u) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                d unused = i.this.getClass();
                throw null;
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        public void g(View view, y yVar) {
            i iVar;
            int i10;
            super.g(view, yVar);
            if (i.this.f5907s0.getVisibility() == 0) {
                iVar = i.this;
                i10 = q4.i.mtrl_picker_toggle_to_year_selection;
            } else {
                iVar = i.this;
                i10 = q4.i.mtrl_picker_toggle_to_day_selection;
            }
            yVar.x0(iVar.e0(i10));
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$i  reason: collision with other inner class name */
    class C0100i extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f5919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f5920b;

        C0100i(o oVar, MaterialButton materialButton) {
            this.f5919a = oVar;
            this.f5920b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f5920b.getText());
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager k22 = i.this.k2();
            int e22 = i10 < 0 ? k22.e2() : k22.g2();
            m unused = i.this.f5899k0 = this.f5919a.B(e22);
            this.f5920b.setText(this.f5919a.C(e22));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            i.this.q2();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f5923e;

        k(o oVar) {
            this.f5923e = oVar;
        }

        public void onClick(View view) {
            int e22 = i.this.k2().e2() + 1;
            if (e22 < i.this.f5903o0.getAdapter().e()) {
                i.this.n2(this.f5923e.B(e22));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    private void c2(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(q4.f.month_navigation_fragment_toggle);
        materialButton.setTag(f5896w0);
        m0.q0(materialButton, new h());
        View findViewById = view.findViewById(q4.f.month_navigation_previous);
        this.f5904p0 = findViewById;
        findViewById.setTag(f5894u0);
        View findViewById2 = view.findViewById(q4.f.month_navigation_next);
        this.f5905q0 = findViewById2;
        findViewById2.setTag(f5895v0);
        this.f5906r0 = view.findViewById(q4.f.mtrl_calendar_year_selector_frame);
        this.f5907s0 = view.findViewById(q4.f.mtrl_calendar_day_selector_frame);
        o2(l.DAY);
        materialButton.setText(this.f5899k0.j());
        this.f5903o0.k(new C0100i(oVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f5905q0.setOnClickListener(new k(oVar));
        this.f5904p0.setOnClickListener(new a(oVar));
    }

    private RecyclerView.o d2() {
        return new g();
    }

    static int i2(Context context) {
        return context.getResources().getDimensionPixelSize(q4.d.mtrl_calendar_day_height);
    }

    private static int j2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(q4.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(q4.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(q4.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(q4.d.mtrl_calendar_days_of_week_height);
        int i10 = n.f5949i;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(q4.d.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(q4.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(q4.d.mtrl_calendar_bottom_padding);
    }

    public static i l2(d dVar, int i10, a aVar, g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        iVar.K1(bundle);
        return iVar;
    }

    private void m2(int i10) {
        this.f5903o0.post(new b(i10));
    }

    private void p2() {
        m0.q0(this.f5903o0, new f());
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = u();
        }
        this.f5897i0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f5898j0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f5899k0 = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        h hVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(w(), this.f5897i0);
        this.f5901m0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m m10 = this.f5898j0.m();
        if (k.v2(contextThemeWrapper)) {
            i11 = q4.h.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = q4.h.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(j2(E1()));
        GridView gridView = (GridView) inflate.findViewById(q4.f.mtrl_calendar_days_of_week);
        m0.q0(gridView, new c());
        int j10 = this.f5898j0.j();
        if (j10 <= 0) {
            hVar = new h();
        }
        gridView.setAdapter(hVar);
        gridView.setNumColumns(m10.f5945h);
        gridView.setEnabled(false);
        this.f5903o0 = (RecyclerView) inflate.findViewById(q4.f.mtrl_calendar_months);
        this.f5903o0.setLayoutManager(new d(w(), i10, false, i10));
        this.f5903o0.setTag(f5893t0);
        o oVar = new o(contextThemeWrapper, (d) null, this.f5898j0, (g) null, new e());
        this.f5903o0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(q4.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(q4.f.mtrl_calendar_year_selector_frame);
        this.f5902n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5902n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f5902n0.setAdapter(new u(this));
            this.f5902n0.h(d2());
        }
        if (inflate.findViewById(q4.f.month_navigation_fragment_toggle) != null) {
            c2(inflate, oVar);
        }
        if (!k.v2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f5903o0);
        }
        this.f5903o0.j1(oVar.D(this.f5899k0));
        p2();
        return inflate;
    }

    public boolean V1(p pVar) {
        return super.V1(pVar);
    }

    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5897i0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5898j0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5899k0);
    }

    /* access modifiers changed from: package-private */
    public a e2() {
        return this.f5898j0;
    }

    /* access modifiers changed from: package-private */
    public c f2() {
        return this.f5901m0;
    }

    /* access modifiers changed from: package-private */
    public m g2() {
        return this.f5899k0;
    }

    public d h2() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager k2() {
        return (LinearLayoutManager) this.f5903o0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void n2(m mVar) {
        RecyclerView recyclerView;
        int i10;
        o oVar = (o) this.f5903o0.getAdapter();
        int D = oVar.D(mVar);
        int D2 = D - oVar.D(this.f5899k0);
        boolean z10 = false;
        boolean z11 = Math.abs(D2) > 3;
        if (D2 > 0) {
            z10 = true;
        }
        this.f5899k0 = mVar;
        if (!z11 || !z10) {
            if (z11) {
                recyclerView = this.f5903o0;
                i10 = D + 3;
            }
            m2(D);
        }
        recyclerView = this.f5903o0;
        i10 = D - 3;
        recyclerView.j1(i10);
        m2(D);
    }

    /* access modifiers changed from: package-private */
    public void o2(l lVar) {
        this.f5900l0 = lVar;
        if (lVar == l.YEAR) {
            this.f5902n0.getLayoutManager().D1(((u) this.f5902n0.getAdapter()).A(this.f5899k0.f5944g));
            this.f5906r0.setVisibility(0);
            this.f5907s0.setVisibility(8);
            this.f5904p0.setVisibility(8);
            this.f5905q0.setVisibility(8);
        } else if (lVar == l.DAY) {
            this.f5906r0.setVisibility(8);
            this.f5907s0.setVisibility(0);
            this.f5904p0.setVisibility(0);
            this.f5905q0.setVisibility(0);
            n2(this.f5899k0);
        }
    }

    /* access modifiers changed from: package-private */
    public void q2() {
        l lVar = this.f5900l0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            o2(l.DAY);
        } else if (lVar == l.DAY) {
            o2(lVar2);
        }
    }
}
