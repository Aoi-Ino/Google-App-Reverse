package uc;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.j;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import fm.c;
import p3.h;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0228a f17255a = new C0228a((g) null);

    /* renamed from: uc.a$a  reason: collision with other inner class name */
    public static final class C0228a {
        private C0228a() {
        }

        public /* synthetic */ C0228a(g gVar) {
            this();
        }

        public final RemoteViews a(String str, String str2, Context context) {
            l.f(context, "context");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_application_submit);
            remoteViews.setTextViewText(R.id.title, str);
            remoteViews.setTextViewText(R.id.message, str2);
            return remoteViews;
        }

        public final void b(String str, String str2, Context context) {
            l.f(context, "context");
            String valueOf = String.valueOf(c.f23593e.e(0, 1000));
            j.e s10 = new j.e(context, valueOf).v(R.mipmap.ic_launcher).e(false).z(new long[]{1000, 1000, 1000, 1000, 1000}).s(true);
            l.e(s10, "setOnlyAlertOnce(...)");
            int i10 = Build.VERSION.SDK_INT;
            j.e h10 = s10.h(a(str, str2, context));
            l.c(h10);
            Object systemService = context.getSystemService("notification");
            l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i10 >= 26) {
                o5.c.a();
                notificationManager.createNotificationChannel(h.a(valueOf, "mParivahan", 4));
            }
            notificationManager.notify(Integer.parseInt(valueOf), h10.b());
        }
    }
}
