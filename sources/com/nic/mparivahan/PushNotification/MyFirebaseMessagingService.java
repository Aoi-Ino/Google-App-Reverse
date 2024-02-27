package com.nic.mparivahan.PushNotification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.j;
import cm.g;
import cm.l;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.n0;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.R;
import fm.c;
import ld.b;
import p3.h;
import v9.d;

public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: l  reason: collision with root package name */
    public static final a f9437l = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public void r(n0 n0Var) {
        l.f(n0Var, "remoteMessage");
        try {
            String valueOf = String.valueOf(c.f23593e.e(0, 1000));
            n0.b c10 = n0Var.c();
            String str = null;
            String c11 = c10 != null ? c10.c() : null;
            n0.b c12 = n0Var.c();
            if (c12 != null) {
                str = c12.a();
            }
            x(c11, str, valueOf);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void t(String str) {
        l.f(str, "p0");
        super.t(str);
        new b(this).d(str);
    }

    public final RemoteViews w(String str, String str2) {
        RemoteViews remoteViews = new RemoteViews(getApplicationContext().getPackageName(), R.layout.notification);
        remoteViews.setTextViewText(R.id.title, str);
        remoteViews.setTextViewText(R.id.message, str2);
        remoteViews.setImageViewResource(R.id.icon, R.drawable.app_icon);
        return remoteViews;
    }

    public final void x(String str, String str2, String str3) {
        Intent intent;
        String o10;
        int p10;
        l.f(str3, "channel_id");
        d.a aVar = d.f17494a;
        Class<SignInScreen> cls = SignInScreen.class;
        if (p.o(str, aVar.l(), true)) {
            intent = new Intent(this, cls);
            o10 = aVar.o();
            p10 = aVar.n();
        } else {
            intent = new Intent(this, cls);
            o10 = aVar.o();
            p10 = aVar.p();
        }
        intent.putExtra(o10, p10);
        intent.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1073741824);
        l.e(activity, "getActivity(...)");
        j.e i10 = new j.e(getApplicationContext(), str3).v(R.drawable.app_icon).e(false).z(new long[]{1000, 1000, 1000, 1000, 1000}).s(true).i(activity);
        l.e(i10, "setContentIntent(...)");
        int i11 = Build.VERSION.SDK_INT;
        j.e h10 = i10.h(w(str, str2));
        l.c(h10);
        Object systemService = getSystemService("notification");
        l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (i11 >= 26) {
            o5.c.a();
            notificationManager.createNotificationChannel(h.a(str3, "mParivahan", 4));
        }
        notificationManager.notify(Integer.parseInt(str3), h10.b());
    }
}
