package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import q4.i;

abstract class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String d10 = d(j10);
        if (z10) {
            d10 = String.format(context.getString(i.mtrl_picker_today_description), new Object[]{d10});
        }
        if (z11) {
            return String.format(context.getString(i.mtrl_picker_start_date_description), new Object[]{d10});
        }
        return z12 ? String.format(context.getString(i.mtrl_picker_end_date_description), new Object[]{d10}) : d10;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return t.d(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        return t.g().get(1) == i10 ? String.format(context.getString(i.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i10)}) : String.format(context.getString(i.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i10)});
    }

    static String f(long j10) {
        return t.k(Locale.getDefault()).format(new Date(j10));
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return t.l(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar g10 = t.g();
        Calendar i10 = t.i();
        i10.setTimeInMillis(j10);
        return g10.get(1) == i10.get(1);
    }
}
