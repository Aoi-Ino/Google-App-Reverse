package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f17658e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17659f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f17660g;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList2.add(g.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new f(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, ArrayList arrayList) {
        l.f(str, "bioId");
        l.f(str2, "allClassOfVehicles");
        this.f17658e = str;
        this.f17659f = str2;
        this.f17660g = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f17658e, fVar.f17658e) && l.a(this.f17659f, fVar.f17659f) && l.a(this.f17660g, fVar.f17660g);
    }

    public int hashCode() {
        int hashCode = ((this.f17658e.hashCode() * 31) + this.f17659f.hashCode()) * 31;
        ArrayList arrayList = this.f17660g;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "LLDetailsModal(bioId=" + this.f17658e + ", allClassOfVehicles=" + this.f17659f + ", LLRefDetails=" + this.f17660g + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.f17658e);
        parcel.writeString(this.f17659f);
        ArrayList arrayList = this.f17660g;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).writeToParcel(parcel, i10);
        }
    }
}
