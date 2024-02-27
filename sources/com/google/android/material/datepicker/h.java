package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

class h extends BaseAdapter {

    /* renamed from: h  reason: collision with root package name */
    private static final int f5889h = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: e  reason: collision with root package name */
    private final Calendar f5890e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5891f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5892g;

    public h() {
        Calendar i10 = t.i();
        this.f5890e = i10;
        this.f5891f = i10.getMaximum(7);
        this.f5892g = i10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f5892g;
        int i12 = this.f5891f;
        return i11 > i12 ? i11 - i12 : i11;
    }

    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f5891f) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public int getCount() {
        return this.f5891f;
    }

    public long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L_0x0017
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = q4.h.mtrl_calendar_day_of_week
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r5 = r3.f5890e
            int r4 = r3.b(r4)
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.util.Calendar r5 = r3.f5890e
            int r2 = f5889h
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r5 = q4.i.mtrl_picker_day_of_week_column_header
            java.lang.String r4 = r4.getString(r5)
            java.util.Calendar r5 = r3.f5890e
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public h(int i10) {
        Calendar i11 = t.i();
        this.f5890e = i11;
        this.f5891f = i11.getMaximum(7);
        this.f5892g = i10;
    }
}
