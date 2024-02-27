package androidx.work.impl;

import android.content.Context;
import cm.l;
import d1.g;
import z0.b;

public final class v extends b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f4366c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10, int i11) {
        super(i10, i11);
        l.f(context, "mContext");
        this.f4366c = context;
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        if (this.f18711b >= 10) {
            gVar.k0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f4366c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
