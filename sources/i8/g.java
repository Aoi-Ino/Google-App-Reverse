package i8;

import bm.l;
import cm.m;
import cm.u;
import hm.c;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.temporal.TemporalField;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lm.k1;
import lm.s;
import ql.e0;

public final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final s f12584j = p1.b((k1) null, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    public static final a f12585k = new a((cm.g) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f12586a;

    /* renamed from: b  reason: collision with root package name */
    private final i f12587b;

    /* renamed from: c  reason: collision with root package name */
    private final e f12588c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12589d;

    /* renamed from: e  reason: collision with root package name */
    private final YearMonth f12590e;

    /* renamed from: f  reason: collision with root package name */
    private final YearMonth f12591f;

    /* renamed from: g  reason: collision with root package name */
    private final DayOfWeek f12592g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12593h;

    /* renamed from: i  reason: collision with root package name */
    private final k1 f12594i;

    public static final class a {

        /* renamed from: i8.g$a$a  reason: collision with other inner class name */
        static final class C0163a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ u f12595e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ cm.s f12596f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f12597g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0163a(u uVar, cm.s sVar, int i10) {
                super(1);
                this.f12595e = uVar;
                this.f12596f = sVar;
                this.f12597g = i10;
            }

            /* renamed from: b */
            public final c invoke(List list) {
                cm.l.f(list, "monthDays");
                List t02 = y.t0(list);
                cm.s sVar = this.f12596f;
                int i10 = sVar.f20232e;
                sVar.f20232e = i10 + 1;
                return new c((YearMonth) this.f12595e.f20234e, t02, i10, this.f12597g);
            }
        }

        static final class b extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ i f12598e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f12599f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List f12600g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ YearMonth f12601h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f12602i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(i iVar, int i10, List list, YearMonth yearMonth, int i11) {
                super(1);
                this.f12598e = iVar;
                this.f12599f = i10;
                this.f12600g = list;
                this.f12601h = yearMonth;
                this.f12602i = i11;
            }

            public final boolean b(List list) {
                cm.l.f(list, "ephemeralMonthWeeks");
                List v02 = y.v0(list);
                if ((((List) y.e0(v02)).size() < 7 && this.f12598e == i.END_OF_ROW) || this.f12598e == i.END_OF_GRID) {
                    List list2 = (List) y.e0(v02);
                    b bVar = (b) y.e0(list2);
                    c cVar = new c(1, 7 - list2.size());
                    ArrayList arrayList = new ArrayList(r.s(cVar, 10));
                    Iterator it = cVar.iterator();
                    while (it.hasNext()) {
                        LocalDate plusDays = bVar.b().plusDays((long) ((e0) it).a());
                        cm.l.e(plusDays, "lastDay.date.plusDays(it.toLong())");
                        arrayList.add(new b(plusDays, d.NEXT_MONTH));
                    }
                    v02.set(q.k(v02), y.i0(list2, arrayList));
                }
                while (true) {
                    if ((v02.size() >= this.f12599f || this.f12598e != i.END_OF_GRID) && !(v02.size() == this.f12599f && ((List) y.e0(v02)).size() < 7 && this.f12598e == i.END_OF_GRID)) {
                        List list3 = this.f12600g;
                    } else {
                        b bVar2 = (b) y.e0((List) y.e0(v02));
                        c cVar2 = new c(1, 7);
                        ArrayList arrayList2 = new ArrayList(r.s(cVar2, 10));
                        Iterator it2 = cVar2.iterator();
                        while (it2.hasNext()) {
                            LocalDate plusDays2 = bVar2.b().plusDays((long) ((e0) it2).a());
                            cm.l.e(plusDays2, "lastDay.date.plusDays(it.toLong())");
                            arrayList2.add(new b(plusDays2, d.NEXT_MONTH));
                        }
                        if (((List) y.e0(v02)).size() < 7) {
                            v02.set(q.k(v02), y.p0(y.i0((Collection) y.e0(v02), arrayList2), 7));
                        } else {
                            v02.add(arrayList2);
                        }
                    }
                }
                List list32 = this.f12600g;
                return list32.add(new c(this.f12601h, v02, list32.size(), this.f12602i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(b((List) obj));
            }
        }

        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }

        public final List a(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek, int i10, e eVar, i iVar, k1 k1Var) {
            boolean z10;
            cm.l.f(yearMonth, "startMonth");
            cm.l.f(yearMonth2, "endMonth");
            cm.l.f(dayOfWeek, "firstDayOfWeek");
            cm.l.f(eVar, "inDateStyle");
            cm.l.f(iVar, "outDateStyle");
            cm.l.f(k1Var, "job");
            ArrayList arrayList = new ArrayList();
            u uVar = new u();
            uVar.f20234e = yearMonth;
            while (((YearMonth) uVar.f20234e).compareTo(yearMonth2) <= 0 && k1Var.c()) {
                int i11 = f.f12582a[eVar.ordinal()];
                if (i11 == 1) {
                    z10 = true;
                } else if (i11 == 2) {
                    z10 = cm.l.a((YearMonth) uVar.f20234e, yearMonth);
                } else if (i11 == 3) {
                    z10 = false;
                } else {
                    throw new pl.m();
                }
                List c10 = c((YearMonth) uVar.f20234e, dayOfWeek, z10, iVar);
                ArrayList arrayList2 = new ArrayList();
                int a10 = h.b(c10.size(), i10);
                cm.s sVar = new cm.s();
                sVar.f20232e = 0;
                arrayList2.addAll(y.Q(c10, i10, new C0163a(uVar, sVar, a10)));
                arrayList.addAll(arrayList2);
                if (!(!cm.l.a((YearMonth) uVar.f20234e, yearMonth2))) {
                    break;
                }
                uVar.f20234e = k8.a.a((YearMonth) uVar.f20234e);
            }
            return arrayList;
        }

        public final List b(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek, int i10, e eVar, i iVar, k1 k1Var) {
            boolean z10;
            cm.l.f(yearMonth, "startMonth");
            cm.l.f(yearMonth2, "endMonth");
            cm.l.f(dayOfWeek, "firstDayOfWeek");
            cm.l.f(eVar, "inDateStyle");
            cm.l.f(iVar, "outDateStyle");
            cm.l.f(k1Var, "job");
            ArrayList arrayList = new ArrayList();
            for (YearMonth yearMonth3 = yearMonth; yearMonth3.compareTo(yearMonth2) <= 0 && k1Var.c(); yearMonth3 = k8.a.a(yearMonth3)) {
                int i11 = f.f12583b[eVar.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    z10 = cm.l.a(yearMonth3, yearMonth);
                } else if (i11 == 3) {
                    z10 = false;
                } else {
                    throw new pl.m();
                }
                arrayList.addAll(r.t(c(yearMonth3, dayOfWeek, z10, i.NONE)));
                if (!(!cm.l.a(yearMonth3, yearMonth2))) {
                    break;
                }
            }
            List t02 = y.t0(y.P(arrayList, 7));
            ArrayList arrayList2 = new ArrayList();
            List unused = y.Q(t02, i10, new b(iVar, i10, arrayList2, yearMonth, h.b(t02.size(), i10)));
            return arrayList2;
        }

        public final List c(YearMonth yearMonth, DayOfWeek dayOfWeek, boolean z10, i iVar) {
            List list;
            cm.l.f(yearMonth, "yearMonth");
            cm.l.f(dayOfWeek, "firstDayOfWeek");
            cm.l.f(iVar, "outDateStyle");
            int year = yearMonth.getYear();
            int monthValue = yearMonth.getMonthValue();
            c cVar = new c(1, yearMonth.lengthOfMonth());
            ArrayList arrayList = new ArrayList(r.s(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                LocalDate of2 = LocalDate.of(year, monthValue, ((e0) it).a());
                cm.l.e(of2, "LocalDate.of(year, month, it)");
                arrayList.add(new b(of2, d.THIS_MONTH));
            }
            if (z10) {
                TemporalField weekOfMonth = WeekFields.of(dayOfWeek, 1).weekOfMonth();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : arrayList) {
                    Integer valueOf = Integer.valueOf(((b) next).b().get(weekOfMonth));
                    Object obj = linkedHashMap.get(valueOf);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(valueOf, obj);
                    }
                    ((List) obj).add(next);
                }
                list = y.v0(linkedHashMap.values());
                List list2 = (List) y.U(list);
                if (list2.size() < 7) {
                    YearMonth minusMonths = yearMonth.minusMonths(1);
                    Iterable<Number> q02 = y.q0(y.t0(new c(1, minusMonths.lengthOfMonth())), 7 - list2.size());
                    ArrayList arrayList2 = new ArrayList(r.s(q02, 10));
                    for (Number intValue : q02) {
                        int intValue2 = intValue.intValue();
                        cm.l.e(minusMonths, "previousMonth");
                        LocalDate of3 = LocalDate.of(minusMonths.getYear(), minusMonths.getMonth(), intValue2);
                        cm.l.e(of3, "LocalDate.of(previousMon… previousMonth.month, it)");
                        arrayList2.add(new b(of3, d.PREVIOUS_MONTH));
                    }
                    list.set(0, y.i0(arrayList2, list2));
                }
            } else {
                list = y.v0(y.P(arrayList, 7));
            }
            if (iVar == i.END_OF_ROW || iVar == i.END_OF_GRID) {
                if (((List) y.e0(list)).size() < 7) {
                    List list3 = (List) y.e0(list);
                    b bVar = (b) y.e0(list3);
                    c cVar2 = new c(1, 7 - list3.size());
                    ArrayList arrayList3 = new ArrayList(r.s(cVar2, 10));
                    Iterator it2 = cVar2.iterator();
                    while (it2.hasNext()) {
                        LocalDate plusDays = bVar.b().plusDays((long) ((e0) it2).a());
                        cm.l.e(plusDays, "lastDay.date.plusDays(it.toLong())");
                        arrayList3.add(new b(plusDays, d.NEXT_MONTH));
                    }
                    list.set(q.k(list), y.i0(list3, arrayList3));
                }
                if (iVar == i.END_OF_GRID) {
                    while (list.size() < 6) {
                        b bVar2 = (b) y.e0((List) y.e0(list));
                        c cVar3 = new c(1, 7);
                        ArrayList arrayList4 = new ArrayList(r.s(cVar3, 10));
                        Iterator it3 = cVar3.iterator();
                        while (it3.hasNext()) {
                            LocalDate plusDays2 = bVar2.b().plusDays((long) ((e0) it3).a());
                            cm.l.e(plusDays2, "lastDay.date.plusDays(it.toLong())");
                            arrayList4.add(new b(plusDays2, d.NEXT_MONTH));
                        }
                        list.add(arrayList4);
                    }
                }
            }
            return list;
        }
    }

    public g(i iVar, e eVar, int i10, YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek, boolean z10, k1 k1Var) {
        boolean z11 = z10;
        k1 k1Var2 = k1Var;
        cm.l.f(iVar, "outDateStyle");
        cm.l.f(eVar, "inDateStyle");
        cm.l.f(yearMonth, "startMonth");
        cm.l.f(yearMonth2, "endMonth");
        cm.l.f(dayOfWeek, "firstDayOfWeek");
        cm.l.f(k1Var2, "job");
        this.f12587b = iVar;
        this.f12588c = eVar;
        this.f12589d = i10;
        this.f12590e = yearMonth;
        this.f12591f = yearMonth2;
        this.f12592g = dayOfWeek;
        this.f12593h = z11;
        this.f12594i = k1Var2;
        this.f12586a = z11 ? f12585k.a(yearMonth, yearMonth2, dayOfWeek, i10, eVar, iVar, k1Var) : f12585k.b(yearMonth, yearMonth2, dayOfWeek, i10, eVar, iVar, k1Var);
    }

    public final boolean a() {
        return this.f12593h;
    }

    public final List b() {
        return this.f12586a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return cm.l.a(this.f12587b, gVar.f12587b) && cm.l.a(this.f12588c, gVar.f12588c) && this.f12589d == gVar.f12589d && cm.l.a(this.f12590e, gVar.f12590e) && cm.l.a(this.f12591f, gVar.f12591f) && cm.l.a(this.f12592g, gVar.f12592g) && this.f12593h == gVar.f12593h && cm.l.a(this.f12594i, gVar.f12594i);
    }

    public int hashCode() {
        i iVar = this.f12587b;
        int i10 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        e eVar = this.f12588c;
        int hashCode2 = (((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + Integer.hashCode(this.f12589d)) * 31;
        YearMonth yearMonth = this.f12590e;
        int hashCode3 = (hashCode2 + (yearMonth != null ? yearMonth.hashCode() : 0)) * 31;
        YearMonth yearMonth2 = this.f12591f;
        int hashCode4 = (hashCode3 + (yearMonth2 != null ? yearMonth2.hashCode() : 0)) * 31;
        DayOfWeek dayOfWeek = this.f12592g;
        int hashCode5 = (hashCode4 + (dayOfWeek != null ? dayOfWeek.hashCode() : 0)) * 31;
        boolean z10 = this.f12593h;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode5 + (z10 ? 1 : 0)) * 31;
        k1 k1Var = this.f12594i;
        if (k1Var != null) {
            i10 = k1Var.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "MonthConfig(outDateStyle=" + this.f12587b + ", inDateStyle=" + this.f12588c + ", maxRowCount=" + this.f12589d + ", startMonth=" + this.f12590e + ", endMonth=" + this.f12591f + ", firstDayOfWeek=" + this.f12592g + ", hasBoundaries=" + this.f12593h + ", job=" + this.f12594i + ")";
    }
}
