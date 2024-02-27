package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import o5.c;
import o5.d;
import o5.e;
import p3.h;
import t5.a;
import t5.q0;
import t5.r;
import t5.s0;

final class w extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final a f6922b = new a("AssetPackExtractionService");

    /* renamed from: c  reason: collision with root package name */
    private final Context f6923c;

    /* renamed from: d  reason: collision with root package name */
    private final e0 f6924d;

    /* renamed from: e  reason: collision with root package name */
    private final l3 f6925e;

    /* renamed from: f  reason: collision with root package name */
    private final b1 f6926f;

    /* renamed from: g  reason: collision with root package name */
    final NotificationManager f6927g;

    w(Context context, e0 e0Var, l3 l3Var, b1 b1Var) {
        this.f6923c = context;
        this.f6924d = e0Var;
        this.f6925e = l3Var;
        this.f6926f = b1Var;
        this.f6927g = (NotificationManager) context.getSystemService("notification");
    }

    private final synchronized void d(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        c.a();
        this.f6927g.createNotificationChannel(h.a("playcore-assetpacks-service-notification-channel", str, 2));
    }

    private final synchronized void j(Bundle bundle, s0 s0Var) {
        Notification.Builder builder;
        try {
            this.f6922b.a("updateServiceState AIDL call", new Object[0]);
            if (r.b(this.f6923c)) {
                if (r.a(this.f6923c)) {
                    int i10 = bundle.getInt("action_type");
                    this.f6926f.c(s0Var);
                    if (i10 == 1) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 26) {
                            d(bundle.getString("notification_channel_name"));
                        }
                        this.f6925e.c(true);
                        b1 b1Var = this.f6926f;
                        String string = bundle.getString("notification_title");
                        String string2 = bundle.getString("notification_subtext");
                        long j10 = bundle.getLong("notification_timeout", 600000);
                        Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                        if (i11 >= 26) {
                            e.a();
                            builder = d.a(this.f6923c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10);
                        } else {
                            builder = new Notification.Builder(this.f6923c).setPriority(-2);
                        }
                        if (parcelable instanceof PendingIntent) {
                            builder.setContentIntent((PendingIntent) parcelable);
                        }
                        Notification.Builder ongoing = builder.setSmallIcon(17301633).setOngoing(false);
                        if (string == null) {
                            string = "Downloading additional file";
                        }
                        Notification.Builder contentTitle = ongoing.setContentTitle(string);
                        if (string2 == null) {
                            string2 = "Transferring";
                        }
                        contentTitle.setSubText(string2);
                        int i12 = bundle.getInt("notification_color");
                        if (i12 != 0) {
                            builder.setColor(i12).setVisibility(-1);
                        }
                        b1Var.a(builder.build());
                        this.f6923c.bindService(new Intent(this.f6923c, ExtractionForegroundService.class), this.f6926f, 1);
                        return;
                    } else if (i10 == 2) {
                        this.f6925e.c(false);
                        this.f6926f.b();
                        return;
                    } else {
                        this.f6922b.b("Unknown action type received: %d", Integer.valueOf(i10));
                        s0Var.R(new Bundle());
                        return;
                    }
                }
            }
            s0Var.R(new Bundle());
        } finally {
        }
    }

    public final void P(Bundle bundle, s0 s0Var) {
        this.f6922b.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!r.b(this.f6923c) || !r.a(this.f6923c)) {
            s0Var.R(new Bundle());
            return;
        }
        this.f6924d.J();
        s0Var.a(new Bundle());
    }

    public final void o(Bundle bundle, s0 s0Var) {
        j(bundle, s0Var);
    }
}
