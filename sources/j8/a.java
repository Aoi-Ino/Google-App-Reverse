package j8;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.m0;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.kizitonwose.calendarview.CalendarView;
import com.kizitonwose.calendarview.ui.CalendarLayoutManager;
import i8.g;
import i8.j;
import j$.time.YearMonth;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pl.x;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private int f12741d = m0.k();

    /* renamed from: e  reason: collision with root package name */
    private int f12742e = m0.k();

    /* renamed from: f  reason: collision with root package name */
    private i8.c f12743f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f12744g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f12745h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final CalendarView f12746i;

    /* renamed from: j  reason: collision with root package name */
    private f f12747j;

    /* renamed from: k  reason: collision with root package name */
    private g f12748k;

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    public static final class C0164a extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12749a;

        C0164a(a aVar) {
            this.f12749a = aVar;
        }

        public void a() {
            this.f12749a.f12745h = true;
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12751b;

        b(a aVar, e eVar) {
            this.f12750a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CalendarView A = this.f12750a.f12746i;
            ViewGroup.LayoutParams layoutParams = A.getLayoutParams();
            if (layoutParams != null) {
                l.e(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.height = ((Integer) animatedValue).intValue();
                    A.setLayoutParams(layoutParams);
                    this.f12751b.f3622e.requestLayout();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    static final class c implements RecyclerView.m.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12752a;

        c(a aVar) {
            this.f12752a = aVar;
        }

        public final void a() {
            this.f12752a.K();
        }
    }

    static final class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f12753e;

        d(a aVar) {
            this.f12753e = aVar;
        }

        public final void run() {
            this.f12753e.K();
        }
    }

    public a(CalendarView calendarView, f fVar, g gVar) {
        l.f(calendarView, "calView");
        l.f(fVar, "viewConfig");
        l.f(gVar, "monthConfig");
        this.f12746i = calendarView;
        this.f12747j = fVar;
        this.f12748k = gVar;
        y(true);
        x(new C0164a(this));
        this.f12745h = true;
    }

    private final int C() {
        return D(true);
    }

    private final int D(boolean z10) {
        int i10;
        int i11;
        CalendarLayoutManager H = H();
        int e22 = z10 ? H.e2() : H.g2();
        if (e22 != -1) {
            Rect rect = new Rect();
            View H2 = H().H(e22);
            if (H2 == null) {
                return -1;
            }
            l.e(H2, "layoutManager.findViewBy…emPos) ?: return NO_INDEX");
            H2.getGlobalVisibleRect(rect);
            if (this.f12746i.D1()) {
                i10 = rect.bottom;
                i11 = rect.top;
            } else {
                i10 = rect.right;
                i11 = rect.left;
            }
            if (i10 - i11 <= 7) {
                int i12 = z10 ? e22 + 1 : e22 - 1;
                return q.j(I()).v(i12) ? i12 : e22;
            }
        }
        return e22;
    }

    private final i8.c G(int i10) {
        return (i8.c) I().get(i10);
    }

    private final CalendarLayoutManager H() {
        RecyclerView.p layoutManager = this.f12746i.getLayoutManager();
        if (layoutManager != null) {
            return (CalendarLayoutManager) layoutManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarLayoutManager");
    }

    private final List I() {
        return this.f12748k.b();
    }

    private final boolean J() {
        return this.f12746i.getAdapter() == this;
    }

    public final int E(i8.b bVar) {
        l.f(bVar, "day");
        int i10 = 0;
        if (this.f12748k.a()) {
            int F = F(bVar.c());
            if (F == -1) {
                return -1;
            }
            Iterator it = y.n0(I(), f.i(F, ((i8.c) I().get(F)).b() + F)).iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                Iterable<Iterable> c10 = ((i8.c) it.next()).c();
                if (!(c10 instanceof Collection) || !((Collection) c10).isEmpty()) {
                    for (Iterable<i8.b> iterable : c10) {
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            for (i8.b a10 : iterable) {
                                if (l.a(a10, bVar)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
                i10++;
            }
            if (i10 == -1) {
                return -1;
            }
            return F + i10;
        }
        for (i8.c c11 : I()) {
            Iterable<Iterable> c12 = c11.c();
            if (!(c12 instanceof Collection) || !((Collection) c12).isEmpty()) {
                for (Iterable<i8.b> iterable2 : c12) {
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (i8.b a11 : iterable2) {
                            if (l.a(a11, bVar)) {
                                return i10;
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
            i10++;
        }
        return -1;
    }

    public final int F(YearMonth yearMonth) {
        l.f(yearMonth, "month");
        int i10 = 0;
        for (i8.c d10 : I()) {
            if (l.a(d10.d(), yearMonth)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void K() {
        boolean z10;
        if (J()) {
            if (this.f12746i.u0()) {
                RecyclerView.m itemAnimator = this.f12746i.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.q(new c(this));
                    return;
                }
                return;
            }
            int C = C();
            if (C != -1) {
                i8.c cVar = (i8.c) I().get(C);
                boolean z11 = true;
                if (!l.a(cVar, this.f12743f)) {
                    this.f12743f = cVar;
                    bm.l monthScrollListener = this.f12746i.getMonthScrollListener();
                    if (monthScrollListener != null) {
                        x xVar = (x) monthScrollListener.invoke(cVar);
                    }
                    if (this.f12746i.getScrollMode() == j.PAGED) {
                        Boolean bool = this.f12744g;
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        } else {
                            if (this.f12746i.getLayoutParams().height != -2) {
                                z11 = false;
                            }
                            this.f12744g = Boolean.valueOf(z11);
                            z10 = z11;
                        }
                        if (z10) {
                            RecyclerView.d0 X = this.f12746i.X(C);
                            if (!(X instanceof e)) {
                                X = null;
                            }
                            e eVar = (e) X;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public void p(e eVar, int i10) {
        l.f(eVar, "holder");
        eVar.O(G(i10));
    }

    /* renamed from: M */
    public void q(e eVar, int i10, List list) {
        l.f(eVar, "holder");
        l.f(list, "payloads");
        if (list.isEmpty()) {
            super.q(eVar, i10, list);
            return;
        }
        for (Object next : list) {
            if (next != null) {
                eVar.R((i8.b) next);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarDay");
            }
        }
    }

    /* renamed from: N */
    public e r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        if (this.f12747j.b() != 0) {
            View f10 = k8.a.f(linearLayout, this.f12747j.b(), false, 2, (Object) null);
            if (f10.getId() == -1) {
                f10.setId(this.f12741d);
            } else {
                this.f12741d = f10.getId();
            }
            linearLayout.addView(f10);
        }
        this.f12746i.getDaySize();
        this.f12747j.a();
        this.f12746i.getDayBinder();
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.DayBinder<com.kizitonwose.calendarview.ui.ViewContainer>");
    }

    public final void O(i8.b bVar) {
        l.f(bVar, "day");
        int E = E(bVar);
        if (E != -1) {
            l(E, bVar);
        }
    }

    public final void P(g gVar) {
        l.f(gVar, "<set-?>");
        this.f12748k = gVar;
    }

    public final void Q(f fVar) {
        l.f(fVar, "<set-?>");
        this.f12747j = fVar;
    }

    public int e() {
        return I().size();
    }

    public long f(int i10) {
        return (long) G(i10).hashCode();
    }

    public void o(RecyclerView recyclerView) {
        l.f(recyclerView, "recyclerView");
        this.f12746i.post(new d(this));
    }
}
