package d1;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import cm.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9665a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        l.f(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        l.e(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        l.f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
