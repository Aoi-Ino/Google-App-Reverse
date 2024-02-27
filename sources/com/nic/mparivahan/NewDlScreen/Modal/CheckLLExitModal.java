package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;
import java.util.Iterator;

@Keep
public final class CheckLLExitModal implements Parcelable {
    public static final Parcelable.Creator<CheckLLExitModal> CREATOR = new a();
    @c("LLDetails")
    private final ArrayList<LLDetailsResultModal> LLDetails;
    @c("status_code")
    private final String statusCd;
    @c("status_desc")
    private final String statusDesc;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckLLExitModal createFromParcel(Parcel parcel) {
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
                    arrayList2.add(LLDetailsResultModal.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CheckLLExitModal(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final CheckLLExitModal[] newArray(int i10) {
            return new CheckLLExitModal[i10];
        }
    }

    public CheckLLExitModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ CheckLLExitModal copy$default(CheckLLExitModal checkLLExitModal, String str, String str2, ArrayList<LLDetailsResultModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkLLExitModal.statusCd;
        }
        if ((i10 & 2) != 0) {
            str2 = checkLLExitModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = checkLLExitModal.LLDetails;
        }
        return checkLLExitModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCd;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<LLDetailsResultModal> component3() {
        return this.LLDetails;
    }

    public final CheckLLExitModal copy(String str, String str2, ArrayList<LLDetailsResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        return new CheckLLExitModal(str, str2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckLLExitModal)) {
            return false;
        }
        CheckLLExitModal checkLLExitModal = (CheckLLExitModal) obj;
        return l.a(this.statusCd, checkLLExitModal.statusCd) && l.a(this.statusDesc, checkLLExitModal.statusDesc) && l.a(this.LLDetails, checkLLExitModal.LLDetails);
    }

    public final ArrayList<LLDetailsResultModal> getLLDetails() {
        return this.LLDetails;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<LLDetailsResultModal> arrayList = this.LLDetails;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "CheckLLExitModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", LLDetails=" + this.LLDetails + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.statusCd);
        parcel.writeString(this.statusDesc);
        ArrayList<LLDetailsResultModal> arrayList = this.LLDetails;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<LLDetailsResultModal> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    public CheckLLExitModal(String str, String str2, ArrayList<LLDetailsResultModal> arrayList) {
        l.f(str, "statusCd");
        l.f(str2, "statusDesc");
        this.statusCd = str;
        this.statusDesc = str2;
        this.LLDetails = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckLLExitModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
