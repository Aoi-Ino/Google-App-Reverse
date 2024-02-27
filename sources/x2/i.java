package x2;

import android.content.Context;
import androidx.core.content.a;
import cm.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f18198a = new i();

    private i() {
    }

    public final boolean a(Context context, String str) {
        l.f(context, "context");
        l.f(str, "permission");
        return a.a(context, str) == 0;
    }

    public final boolean b(Context context, String str) {
        l.f(context, "context");
        l.f(str, "permission");
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (!(strArr == null || strArr.length == 0)) {
            for (String a10 : strArr) {
                if (l.a(a10, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
