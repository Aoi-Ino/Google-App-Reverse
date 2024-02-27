package com.kizitonwose.calendarview.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import com.kizitonwose.calendarview.CalendarView;

public final class CalendarLayoutManager extends LinearLayoutManager {
    private final CalendarView I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarLayoutManager(CalendarView calendarView, int i10) {
        super(calendarView.getContext(), i10, false);
        l.f(calendarView, "calView");
        this.I = calendarView;
    }
}
