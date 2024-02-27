package i8;

import cm.l;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.io.Serializable;
import k8.a;
import pl.m;

public final class b implements Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f12565e;

    /* renamed from: f  reason: collision with root package name */
    private final LocalDate f12566f;

    /* renamed from: g  reason: collision with root package name */
    private final d f12567g;

    public b(LocalDate localDate, d dVar) {
        l.f(localDate, "date");
        l.f(dVar, "owner");
        this.f12566f = localDate;
        this.f12567g = dVar;
        this.f12565e = localDate.getDayOfMonth();
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        l.f(bVar, "other");
        throw new UnsupportedOperationException("Compare using the `date` parameter instead. Out and In dates can have the same date values as CalendarDay in another month.");
    }

    public final LocalDate b() {
        return this.f12566f;
    }

    public final YearMonth c() {
        int i10 = a.f12564a[this.f12567g.ordinal()];
        if (i10 == 1) {
            return a.d(this.f12566f);
        }
        if (i10 == 2) {
            return a.a(a.d(this.f12566f));
        }
        if (i10 == 3) {
            return a.b(a.d(this.f12566f));
        }
        throw new m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            b bVar = (b) obj;
            return l.a(this.f12566f, bVar.f12566f) && this.f12567g == bVar.f12567g;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.model.CalendarDay");
    }

    public int hashCode() {
        return (this.f12566f.hashCode() + this.f12567g.hashCode()) * 31;
    }

    public String toString() {
        return "CalendarDay { date =  " + this.f12566f + ", owner = " + this.f12567g + '}';
    }
}
