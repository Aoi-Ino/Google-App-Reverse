package y3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f18488a;

    public c(Context context) {
        this.f18488a = context;
    }

    public int a(String str, String str2) {
        return this.f18488a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo b(String str, int i10) {
        return this.f18488a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence c(String str) {
        return this.f18488a.getPackageManager().getApplicationLabel(this.f18488a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i10) {
        return this.f18488a.getPackageManager().getPackageInfo(str, i10);
    }
}
