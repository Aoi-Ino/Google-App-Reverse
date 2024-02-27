package com.kizitonwose.calendarview;

import androidx.recyclerview.widget.RecyclerView;
import cm.l;

public final class a extends RecyclerView.t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CalendarView f7636a;

    a(CalendarView calendarView) {
        this.f7636a = calendarView;
    }

    public void a(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "recyclerView");
        if (i10 == 0) {
            this.f7636a.getCalendarAdapter().K();
        }
    }

    public void b(RecyclerView recyclerView, int i10, int i11) {
        l.f(recyclerView, "recyclerView");
    }
}
