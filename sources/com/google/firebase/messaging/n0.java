package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class n0 extends t3.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: e  reason: collision with root package name */
    Bundle f7529e;

    /* renamed from: f  reason: collision with root package name */
    private b f7530f;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f7531a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7532b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f7533c;

        /* renamed from: d  reason: collision with root package name */
        private final String f7534d;

        /* renamed from: e  reason: collision with root package name */
        private final String f7535e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f7536f;

        /* renamed from: g  reason: collision with root package name */
        private final String f7537g;

        /* renamed from: h  reason: collision with root package name */
        private final String f7538h;

        /* renamed from: i  reason: collision with root package name */
        private final String f7539i;

        /* renamed from: j  reason: collision with root package name */
        private final String f7540j;

        /* renamed from: k  reason: collision with root package name */
        private final String f7541k;

        /* renamed from: l  reason: collision with root package name */
        private final String f7542l;

        /* renamed from: m  reason: collision with root package name */
        private final String f7543m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f7544n;

        /* renamed from: o  reason: collision with root package name */
        private final String f7545o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f7546p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f7547q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f7548r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f7549s;

        /* renamed from: t  reason: collision with root package name */
        private final Long f7550t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f7551u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f7552v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f7553w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f7554x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f7555y;

        /* renamed from: z  reason: collision with root package name */
        private final long[] f7556z;

        private b(g0 g0Var) {
            this.f7531a = g0Var.p("gcm.n.title");
            this.f7532b = g0Var.h("gcm.n.title");
            this.f7533c = b(g0Var, "gcm.n.title");
            this.f7534d = g0Var.p("gcm.n.body");
            this.f7535e = g0Var.h("gcm.n.body");
            this.f7536f = b(g0Var, "gcm.n.body");
            this.f7537g = g0Var.p("gcm.n.icon");
            this.f7539i = g0Var.o();
            this.f7540j = g0Var.p("gcm.n.tag");
            this.f7541k = g0Var.p("gcm.n.color");
            this.f7542l = g0Var.p("gcm.n.click_action");
            this.f7543m = g0Var.p("gcm.n.android_channel_id");
            this.f7544n = g0Var.f();
            this.f7538h = g0Var.p("gcm.n.image");
            this.f7545o = g0Var.p("gcm.n.ticker");
            this.f7546p = g0Var.b("gcm.n.notification_priority");
            this.f7547q = g0Var.b("gcm.n.visibility");
            this.f7548r = g0Var.b("gcm.n.notification_count");
            this.f7551u = g0Var.a("gcm.n.sticky");
            this.f7552v = g0Var.a("gcm.n.local_only");
            this.f7553w = g0Var.a("gcm.n.default_sound");
            this.f7554x = g0Var.a("gcm.n.default_vibrate_timings");
            this.f7555y = g0Var.a("gcm.n.default_light_settings");
            this.f7550t = g0Var.j("gcm.n.event_time");
            this.f7549s = g0Var.e();
            this.f7556z = g0Var.q();
        }

        private static String[] b(g0 g0Var, String str) {
            Object[] g10 = g0Var.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f7534d;
        }

        public String c() {
            return this.f7531a;
        }
    }

    public n0(Bundle bundle) {
        this.f7529e = bundle;
    }

    public b c() {
        if (this.f7530f == null && g0.t(this.f7529e)) {
            this.f7530f = new b(new g0(this.f7529e));
        }
        return this.f7530f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        o0.c(this, parcel, i10);
    }
}
