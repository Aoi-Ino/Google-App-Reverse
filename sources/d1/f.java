package d1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import cm.l;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9668a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        l.f(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        l.c(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        l.f(cursor, "cursor");
        l.f(contentResolver, "cr");
        l.f(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
