package com.google.firebase.installations;

import a7.d;
import android.text.TextUtils;
import c7.a;
import c7.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f7390b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f7391c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f7392d;

    /* renamed from: a  reason: collision with root package name */
    private final a f7393a;

    private i(a aVar) {
        this.f7393a = aVar;
    }

    public static i c() {
        return d(b.b());
    }

    public static i d(a aVar) {
        if (f7392d == null) {
            f7392d = new i(aVar);
        }
        return f7392d;
    }

    static boolean g(String str) {
        return f7391c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f7393a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f7390b;
    }
}
