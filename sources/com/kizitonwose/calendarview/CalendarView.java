package com.kizitonwose.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.g;
import com.kizitonwose.calendarview.ui.CalendarLayoutManager;
import i8.d;
import i8.e;
import i8.i;
import i8.j;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j8.f;
import java.util.concurrent.CancellationException;
import lm.k1;

public class CalendarView extends RecyclerView {

    /* renamed from: s1  reason: collision with root package name */
    private static final k8.b f7614s1 = new k8.b(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: t1  reason: collision with root package name */
    public static final a f7615t1 = new a((g) null);
    private l N0;
    private int O0;
    private int P0;
    private int Q0;
    private String R0;
    private int S0 = 1;
    private j T0 = j.CONTINUOUS;
    private e U0 = e.ALL_MONTHS;
    private i V0 = i.END_OF_ROW;
    private int W0 = 6;
    private boolean X0 = true;
    private int Y0 = 200;
    private final j8.b Z0 = new j8.b();

    /* renamed from: a1  reason: collision with root package name */
    private YearMonth f7616a1;

    /* renamed from: b1  reason: collision with root package name */
    private YearMonth f7617b1;

    /* renamed from: c1  reason: collision with root package name */
    private DayOfWeek f7618c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f7619d1 = true;

    /* renamed from: e1  reason: collision with root package name */
    private int f7620e1 = Integer.MIN_VALUE;

    /* renamed from: f1  reason: collision with root package name */
    private boolean f7621f1;

    /* renamed from: g1  reason: collision with root package name */
    private k1 f7622g1;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f7623h1;

    /* renamed from: i1  reason: collision with root package name */
    private k8.b f7624i1 = f7614s1;

    /* renamed from: j1  reason: collision with root package name */
    private int f7625j1;

    /* renamed from: k1  reason: collision with root package name */
    private int f7626k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f7627l1;

    /* renamed from: m1  reason: collision with root package name */
    private int f7628m1;

    /* renamed from: n1  reason: collision with root package name */
    private int f7629n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f7630o1;

    /* renamed from: p1  reason: collision with root package name */
    private int f7631p1;

    /* renamed from: q1  reason: collision with root package name */
    private int f7632q1;

    /* renamed from: r1  reason: collision with root package name */
    private final a f7633r1 = new a(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CalendarView f7634e;

        b(CalendarView calendarView) {
            this.f7634e = calendarView;
        }

        public final void run() {
            this.f7634e.getCalendarAdapter().K();
        }
    }

    static final class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CalendarView f7635e;

        c(CalendarView calendarView) {
            this.f7635e = calendarView;
        }

        public final void run() {
            this.f7635e.getCalendarAdapter().K();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cm.l.f(context, "context");
        cm.l.f(attributeSet, "attrs");
        B1(attributeSet, 0, 0);
    }

    private final void A1(i8.g gVar) {
        a1(this.f7633r1);
        k(this.f7633r1);
        setLayoutManager(new CalendarLayoutManager(this, this.S0));
        setAdapter(new j8.a(this, new f(this.O0, this.P0, this.Q0, this.R0), gVar));
    }

    private final void B1(AttributeSet attributeSet, int i10, int i11) {
        if (!isInEditMode()) {
            boolean z10 = true;
            setHasFixedSize(true);
            Context context = getContext();
            cm.l.e(context, "context");
            int[] iArr = h8.a.f12054a;
            cm.l.e(iArr, "R.styleable.CalendarView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            cm.l.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
            setDayViewResource(obtainStyledAttributes.getResourceId(h8.a.f12055b, this.O0));
            setMonthHeaderResource(obtainStyledAttributes.getResourceId(h8.a.f12060g, this.P0));
            setMonthFooterResource(obtainStyledAttributes.getResourceId(h8.a.f12059f, this.Q0));
            setOrientation(obtainStyledAttributes.getInt(h8.a.f12062i, this.S0));
            setScrollMode(j.values()[obtainStyledAttributes.getInt(h8.a.f12064k, this.T0.ordinal())]);
            setOutDateStyle(i.values()[obtainStyledAttributes.getInt(h8.a.f12063j, this.V0.ordinal())]);
            setInDateStyle(e.values()[obtainStyledAttributes.getInt(h8.a.f12057d, this.U0.ordinal())]);
            setMaxRowCount(obtainStyledAttributes.getInt(h8.a.f12058e, this.W0));
            setMonthViewClass(obtainStyledAttributes.getString(h8.a.f12061h));
            setHasBoundaries(obtainStyledAttributes.getBoolean(h8.a.f12056c, this.X0));
            this.Y0 = obtainStyledAttributes.getInt(h8.a.f12065l, this.Y0);
            obtainStyledAttributes.recycle();
            if (this.O0 == 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
            }
        }
    }

    private final void C1() {
        if (!this.f7623h1 && getAdapter() != null && getLayoutManager() != null) {
            RecyclerView.p layoutManager = getLayoutManager();
            Parcelable j12 = layoutManager != null ? layoutManager.j1() : null;
            setAdapter(getAdapter());
            RecyclerView.p layoutManager2 = getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.i1(j12);
            }
            post(new b(this));
        }
    }

    public static /* synthetic */ void F1(CalendarView calendarView, LocalDate localDate, d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                dVar = d.THIS_MONTH;
            }
            calendarView.E1(localDate, dVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyDateChanged");
    }

    private final void I1(i8.g gVar) {
        YearMonth yearMonth;
        DayOfWeek dayOfWeek;
        if (!this.f7623h1 && getAdapter() != null) {
            j8.a calendarAdapter = getCalendarAdapter();
            if (gVar == null) {
                i iVar = this.V0;
                e eVar = this.U0;
                int i10 = this.W0;
                YearMonth yearMonth2 = this.f7616a1;
                if (yearMonth2 != null && (yearMonth = this.f7617b1) != null && (dayOfWeek = this.f7618c1) != null) {
                    gVar = new i8.g(iVar, eVar, i10, yearMonth2, yearMonth, dayOfWeek, this.X0, p1.b((k1) null, 1, (Object) null));
                } else {
                    return;
                }
            }
            calendarAdapter.P(gVar);
            getCalendarAdapter().j();
            post(new c(this));
        }
    }

    static /* synthetic */ void J1(CalendarView calendarView, i8.g gVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                gVar = null;
            }
            calendarView.I1(gVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAdapterMonthConfig");
    }

    private final void K1() {
        if (getAdapter() != null) {
            getCalendarAdapter().Q(new f(this.O0, this.P0, this.Q0, this.R0));
            C1();
        }
    }

    /* access modifiers changed from: private */
    public final j8.a getCalendarAdapter() {
        RecyclerView.h adapter = getAdapter();
        if (adapter != null) {
            return (j8.a) adapter;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarAdapter");
    }

    private final CalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager != null) {
            return (CalendarLayoutManager) layoutManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarLayoutManager");
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public final boolean D1() {
        return this.S0 == 1;
    }

    public final void E1(LocalDate localDate, d dVar) {
        cm.l.f(localDate, "date");
        cm.l.f(dVar, "owner");
        G1(new i8.b(localDate, dVar));
    }

    public final void G1(i8.b bVar) {
        cm.l.f(bVar, "day");
        getCalendarAdapter().O(bVar);
    }

    public final void H1(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek) {
        cm.l.f(yearMonth, "startMonth");
        cm.l.f(yearMonth2, "endMonth");
        cm.l.f(dayOfWeek, "firstDayOfWeek");
        k1 k1Var = this.f7622g1;
        if (k1Var != null) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f7616a1 = yearMonth;
        this.f7617b1 = yearMonth2;
        this.f7618c1 = dayOfWeek;
        A1(new i8.g(this.V0, this.U0, this.W0, yearMonth, yearMonth2, dayOfWeek, this.X0, p1.b((k1) null, 1, (Object) null)));
    }

    public final j8.c getDayBinder() {
        return null;
    }

    public final k8.b getDaySize() {
        return this.f7624i1;
    }

    public final int getDayViewResource() {
        return this.O0;
    }

    public final boolean getHasBoundaries() {
        return this.X0;
    }

    public final e getInDateStyle() {
        return this.U0;
    }

    public final int getMaxRowCount() {
        return this.W0;
    }

    public final j8.d getMonthFooterBinder() {
        return null;
    }

    public final int getMonthFooterResource() {
        return this.Q0;
    }

    public final j8.d getMonthHeaderBinder() {
        return null;
    }

    public final int getMonthHeaderResource() {
        return this.P0;
    }

    public final int getMonthMarginBottom() {
        return this.f7632q1;
    }

    public final int getMonthMarginEnd() {
        return this.f7630o1;
    }

    public final int getMonthMarginStart() {
        return this.f7629n1;
    }

    public final int getMonthMarginTop() {
        return this.f7631p1;
    }

    public final int getMonthPaddingBottom() {
        return this.f7628m1;
    }

    public final int getMonthPaddingEnd() {
        return this.f7626k1;
    }

    public final int getMonthPaddingStart() {
        return this.f7625j1;
    }

    public final int getMonthPaddingTop() {
        return this.f7627l1;
    }

    public final l getMonthScrollListener() {
        return this.N0;
    }

    public final String getMonthViewClass() {
        return this.R0;
    }

    public final int getOrientation() {
        return this.S0;
    }

    public final i getOutDateStyle() {
        return this.V0;
    }

    public final j getScrollMode() {
        return this.T0;
    }

    public final int getWrappedPageHeightAnimationDuration() {
        return this.Y0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k1 k1Var = this.f7622g1;
        if (k1Var != null) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f7619d1 && !isInEditMode()) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode == 0 && mode2 == 0) {
                throw new UnsupportedOperationException("Cannot calculate the values for day Width/Height with the current configuration.");
            }
            int i12 = (int) (((double) (((float) (size - (this.f7625j1 + this.f7626k1))) / 7.0f)) + 0.5d);
            int i13 = this.f7620e1;
            if (i13 == Integer.MIN_VALUE) {
                i13 = i12;
            }
            k8.b a10 = this.f7624i1.a(i12, i13);
            if (!cm.l.a(this.f7624i1, a10)) {
                this.f7621f1 = true;
                setDaySize(a10);
                this.f7621f1 = false;
                C1();
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void setDayBinder(j8.c cVar) {
        C1();
    }

    public final void setDaySize(k8.b bVar) {
        cm.l.f(bVar, "value");
        this.f7624i1 = bVar;
        if (!this.f7621f1) {
            this.f7619d1 = cm.l.a(bVar, f7614s1) || bVar.c() == Integer.MIN_VALUE;
            this.f7620e1 = bVar.b();
            C1();
        }
    }

    public final void setDayViewResource(int i10) {
        if (this.O0 == i10) {
            return;
        }
        if (i10 != 0) {
            this.O0 = i10;
            K1();
            return;
        }
        throw new IllegalArgumentException("'dayViewResource' attribute not provided.");
    }

    public final void setHasBoundaries(boolean z10) {
        if (this.X0 != z10) {
            this.X0 = z10;
            J1(this, (i8.g) null, 1, (Object) null);
        }
    }

    public final void setInDateStyle(e eVar) {
        cm.l.f(eVar, "value");
        if (this.U0 != eVar) {
            this.U0 = eVar;
            J1(this, (i8.g) null, 1, (Object) null);
        }
    }

    public final void setMaxRowCount(int i10) {
        if (!new hm.c(1, 6).v(i10)) {
            throw new IllegalArgumentException("'maxRowCount' should be between 1 to 6");
        } else if (this.W0 != i10) {
            this.W0 = i10;
            J1(this, (i8.g) null, 1, (Object) null);
        }
    }

    public final void setMonthFooterBinder(j8.d dVar) {
        C1();
    }

    public final void setMonthFooterResource(int i10) {
        if (this.Q0 != i10) {
            this.Q0 = i10;
            K1();
        }
    }

    public final void setMonthHeaderBinder(j8.d dVar) {
        C1();
    }

    public final void setMonthHeaderResource(int i10) {
        if (this.P0 != i10) {
            this.P0 = i10;
            K1();
        }
    }

    public final void setMonthScrollListener(l lVar) {
        this.N0 = lVar;
    }

    public final void setMonthViewClass(String str) {
        if (!cm.l.a(this.R0, str)) {
            this.R0 = str;
            K1();
        }
    }

    public final void setOrientation(int i10) {
        YearMonth yearMonth;
        DayOfWeek dayOfWeek;
        if (this.S0 != i10) {
            this.S0 = i10;
            YearMonth yearMonth2 = this.f7616a1;
            if (yearMonth2 != null && (yearMonth = this.f7617b1) != null && (dayOfWeek = this.f7618c1) != null) {
                H1(yearMonth2, yearMonth, dayOfWeek);
            }
        }
    }

    public final void setOutDateStyle(i iVar) {
        cm.l.f(iVar, "value");
        if (this.V0 != iVar) {
            this.V0 = iVar;
            J1(this, (i8.g) null, 1, (Object) null);
        }
    }

    public final void setScrollMode(j jVar) {
        cm.l.f(jVar, "value");
        if (this.T0 != jVar) {
            this.T0 = jVar;
            this.Z0.b(jVar == j.PAGED ? this : null);
        }
    }

    public final void setWrappedPageHeightAnimationDuration(int i10) {
        this.Y0 = i10;
    }
}
