package s3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import t3.a;
import t3.c;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new x();

    /* renamed from: e  reason: collision with root package name */
    private final int f16032e;

    /* renamed from: f  reason: collision with root package name */
    private List f16033f;

    public s(int i10, List list) {
        this.f16032e = i10;
        this.f16033f = list;
    }

    public final int c() {
        return this.f16032e;
    }

    public final List d() {
        return this.f16033f;
    }

    public final void e(m mVar) {
        if (this.f16033f == null) {
            this.f16033f = new ArrayList();
        }
        this.f16033f.add(mVar);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f16032e);
        c.r(parcel, 2, this.f16033f, false);
        c.b(parcel, a10);
    }
}
