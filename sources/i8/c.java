package i8;

import cm.l;
import j$.time.YearMonth;
import java.io.Serializable;
import java.util.List;

public final class c implements Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f12568e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12569f;

    /* renamed from: g  reason: collision with root package name */
    private final YearMonth f12570g;

    /* renamed from: h  reason: collision with root package name */
    private final List f12571h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12572i;

    /* renamed from: j  reason: collision with root package name */
    private final int f12573j;

    public c(YearMonth yearMonth, List list, int i10, int i11) {
        l.f(yearMonth, "yearMonth");
        l.f(list, "weekDays");
        this.f12570g = yearMonth;
        this.f12571h = list;
        this.f12572i = i10;
        this.f12573j = i11;
        this.f12568e = yearMonth.getYear();
        this.f12569f = yearMonth.getMonthValue();
    }

    /* renamed from: a */
    public int compareTo(c cVar) {
        l.f(cVar, "other");
        int compareTo = this.f12570g.compareTo(cVar.f12570g);
        return compareTo == 0 ? l.h(this.f12572i, cVar.f12572i) : compareTo;
    }

    public final int b() {
        return this.f12573j;
    }

    public final List c() {
        return this.f12571h;
    }

    public final YearMonth d() {
        return this.f12570g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            c cVar = (c) obj;
            return l.a(this.f12570g, cVar.f12570g) && l.a((b) y.U((List) y.U(this.f12571h)), (b) y.U((List) y.U(cVar.f12571h))) && l.a((b) y.e0((List) y.e0(this.f12571h)), (b) y.e0((List) y.e0(cVar.f12571h)));
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarMonth");
    }

    public int hashCode() {
        return (this.f12570g.hashCode() * 31) + ((b) y.U((List) y.U(this.f12571h))).hashCode() + ((b) y.e0((List) y.e0(this.f12571h))).hashCode();
    }

    public String toString() {
        return "CalendarMonth { first = " + ((b) y.U((List) y.U(this.f12571h))) + ", last = " + ((b) y.e0((List) y.e0(this.f12571h))) + "} " + "indexInSameMonth = " + this.f12572i + ", numberOfSameMonth = " + this.f12573j;
    }
}
