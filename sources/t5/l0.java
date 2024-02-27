package t5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class l0 extends d0 implements n0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    public final void F(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.b(c10, bundle2);
        f0.c(c10, p0Var);
        d(6, c10);
    }

    public final void K(String str, List list, Bundle bundle, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        c10.writeTypedList(list);
        f0.b(c10, bundle);
        f0.c(c10, p0Var);
        d(14, c10);
    }

    public final void f0(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.b(c10, bundle2);
        f0.c(c10, p0Var);
        d(9, c10);
    }

    public final void l(String str, Bundle bundle, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.c(c10, p0Var);
        d(5, c10);
    }

    public final void n(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.b(c10, bundle2);
        f0.c(c10, p0Var);
        d(11, c10);
    }

    public final void v(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.b(c10, bundle2);
        f0.c(c10, p0Var);
        d(7, c10);
    }

    public final void x(String str, Bundle bundle, p0 p0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.c(c10, p0Var);
        d(10, c10);
    }
}
