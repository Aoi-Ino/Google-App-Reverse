package e4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import s3.d;
import s3.n;
import t3.a;
import t3.c;
import w3.m;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: e  reason: collision with root package name */
    LocationRequest f10099e;

    y(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    m.a(workSource, dVar.f15925e, dVar.f15926f);
                }
            }
            aVar.h(workSource);
        }
        if (z10) {
            aVar.b(1);
        }
        if (z11) {
            aVar.g(2);
        }
        if (str != null) {
            aVar.f(str);
        } else if (str2 != null) {
            aVar.f(str2);
        }
        if (z12) {
            aVar.e(true);
        }
        if (z13) {
            aVar.d(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.c(j10);
        }
        this.f10099e = aVar.a();
    }

    public static y c(String str, LocationRequest locationRequest) {
        return new y(locationRequest, (List) null, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return n.a(this.f10099e, ((y) obj).f10099e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10099e.hashCode();
    }

    public final String toString() {
        return this.f10099e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f10099e, i10, false);
        c.b(parcel, a10);
    }
}
