package d1;

import android.database.Cursor;
import android.os.Bundle;
import cm.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9667a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        l.f(cursor, "cursor");
        l.f(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
