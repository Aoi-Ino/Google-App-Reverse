package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2285c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static Set f2286d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2287e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2288a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f2289b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private m(Context context) {
        this.f2288a = context;
        this.f2289b = (NotificationManager) context.getSystemService("notification");
    }

    public static m b(Context context) {
        return new m(context);
    }

    public boolean a() {
        return a.a(this.f2289b);
    }
}
