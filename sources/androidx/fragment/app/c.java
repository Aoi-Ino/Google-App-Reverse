package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final List f2956e;

    /* renamed from: f  reason: collision with root package name */
    final List f2957f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(Parcel parcel) {
        this.f2956e = parcel.createStringArrayList();
        this.f2957f = parcel.createTypedArrayList(b.CREATOR);
    }

    /* access modifiers changed from: package-private */
    public List c(q qVar, Map map) {
        HashMap hashMap = new HashMap(this.f2956e.size());
        for (String str : this.f2956e) {
            i iVar = (i) map.get(str);
            if (iVar != null) {
                hashMap.put(iVar.f3052j, iVar);
            } else {
                Bundle B = qVar.u0().B(str, (Bundle) null);
                if (B != null) {
                    ClassLoader classLoader = qVar.w0().f().getClassLoader();
                    i c10 = ((u) B.getParcelable("state")).c(qVar.t0(), classLoader);
                    c10.f3047f = B;
                    if (B.getBundle("savedInstanceState") == null) {
                        c10.f3047f.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = B.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    c10.K1(bundle);
                    hashMap.put(c10.f3052j, c10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (b e10 : this.f2957f) {
            arrayList.add(e10.e(qVar, hashMap));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2956e);
        parcel.writeTypedList(this.f2957f);
    }

    c(List list, List list2) {
        this.f2956e = list;
        this.f2957f = list2;
    }
}
