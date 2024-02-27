package w0;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.a;
import androidx.appcompat.app.d;
import cm.l;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    private final d f17814f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.appcompat.app.d r3, w0.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            cm.l.f(r3, r0)
            java.lang.String r0 = "configuration"
            cm.l.f(r4, r0)
            androidx.appcompat.app.b r0 = r3.Q0()
            if (r0 == 0) goto L_0x001f
            android.content.Context r0 = r0.b()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            cm.l.e(r0, r1)
            r2.<init>(r0, r4)
            r2.f17814f = r3
            return
        L_0x001f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Activity "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.b.<init>(androidx.appcompat.app.d, w0.d):void");
    }

    /* access modifiers changed from: protected */
    public void c(Drawable drawable, int i10) {
        a R0 = this.f17814f.R0();
        if (R0 != null) {
            l.e(R0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            R0.s(drawable != null);
            androidx.appcompat.app.b Q0 = this.f17814f.Q0();
            if (Q0 != null) {
                l.e(Q0, "checkNotNull(activity.dr…leDelegate set\"\n        }");
                Q0.a(drawable, i10);
                return;
            }
            throw new IllegalStateException(("Activity " + this.f17814f + " does not have an DrawerToggleDelegate set").toString());
        }
        throw new IllegalStateException(("Activity " + this.f17814f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }

    /* access modifiers changed from: protected */
    public void d(CharSequence charSequence) {
        a R0 = this.f17814f.R0();
        if (R0 != null) {
            l.e(R0, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            R0.x(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f17814f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
