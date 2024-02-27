package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class s {

    /* renamed from: c  reason: collision with root package name */
    private static final s f5964c = new s((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f5965a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f5966b;

    private s(Long l10, TimeZone timeZone) {
        this.f5965a = l10;
        this.f5966b = timeZone;
    }

    static s c() {
        return f5964c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f5966b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f5965a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        return instance;
    }
}
