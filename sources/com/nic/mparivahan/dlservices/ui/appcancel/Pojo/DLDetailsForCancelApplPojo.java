package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;

@Keep
public final class DLDetailsForCancelApplPojo implements Parcelable {
    public static final Parcelable.Creator<DLDetailsForCancelApplPojo> CREATOR = new a();
    private final ArrayList<CancelApplSlotDetailsPojo> Slot_Details;
    private final String status_code;
    private final String status_desc;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final DLDetailsForCancelApplPojo createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(CancelApplSlotDetailsPojo.CREATOR.createFromParcel(parcel));
            }
            return new DLDetailsForCancelApplPojo(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final DLDetailsForCancelApplPojo[] newArray(int i10) {
            return new DLDetailsForCancelApplPojo[i10];
        }
    }

    public DLDetailsForCancelApplPojo(String str, String str2, ArrayList<CancelApplSlotDetailsPojo> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(arrayList, "Slot_Details");
        this.status_code = str;
        this.status_desc = str2;
        this.Slot_Details = arrayList;
    }

    public static /* synthetic */ DLDetailsForCancelApplPojo copy$default(DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo, String str, String str2, ArrayList<CancelApplSlotDetailsPojo> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dLDetailsForCancelApplPojo.status_code;
        }
        if ((i10 & 2) != 0) {
            str2 = dLDetailsForCancelApplPojo.status_desc;
        }
        if ((i10 & 4) != 0) {
            arrayList = dLDetailsForCancelApplPojo.Slot_Details;
        }
        return dLDetailsForCancelApplPojo.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_desc;
    }

    public final ArrayList<CancelApplSlotDetailsPojo> component3() {
        return this.Slot_Details;
    }

    public final DLDetailsForCancelApplPojo copy(String str, String str2, ArrayList<CancelApplSlotDetailsPojo> arrayList) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(arrayList, "Slot_Details");
        return new DLDetailsForCancelApplPojo(str, str2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLDetailsForCancelApplPojo)) {
            return false;
        }
        DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo = (DLDetailsForCancelApplPojo) obj;
        return l.a(this.status_code, dLDetailsForCancelApplPojo.status_code) && l.a(this.status_desc, dLDetailsForCancelApplPojo.status_desc) && l.a(this.Slot_Details, dLDetailsForCancelApplPojo.Slot_Details);
    }

    public final ArrayList<CancelApplSlotDetailsPojo> getSlot_Details() {
        return this.Slot_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.Slot_Details.hashCode();
    }

    public String toString() {
        return "DLDetailsForCancelApplPojo(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", Slot_Details=" + this.Slot_Details + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.status_code);
        parcel.writeString(this.status_desc);
        ArrayList<CancelApplSlotDetailsPojo> arrayList = this.Slot_Details;
        parcel.writeInt(arrayList.size());
        Iterator<CancelApplSlotDetailsPojo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DLDetailsForCancelApplPojo(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, arrayList);
    }
}
