package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import f.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f793a;

    private a(Context context) {
        this.f793a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f793a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f793a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f793a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f793a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
    }

    public boolean f() {
        return true;
    }
}
