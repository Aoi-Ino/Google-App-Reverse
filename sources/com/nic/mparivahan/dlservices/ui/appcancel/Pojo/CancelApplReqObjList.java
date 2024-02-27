package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class CancelApplReqObjList implements Parcelable {
    public static final Parcelable.Creator<CancelApplReqObjList> CREATOR = new a();
    private final String covcd;
    private final String covs;
    private final String slno;
    private final String trans;
    private final String transaction;
    private final int trtrcd;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final CancelApplReqObjList createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new CancelApplReqObjList(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CancelApplReqObjList[] newArray(int i10) {
            return new CancelApplReqObjList[i10];
        }
    }

    public CancelApplReqObjList() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (g) null);
    }

    public static /* synthetic */ CancelApplReqObjList copy$default(CancelApplReqObjList cancelApplReqObjList, int i10, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cancelApplReqObjList.trtrcd;
        }
        if ((i11 & 2) != 0) {
            str = cancelApplReqObjList.covs;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = cancelApplReqObjList.covcd;
        }
        String str7 = str2;
        if ((i11 & 8) != 0) {
            str3 = cancelApplReqObjList.transaction;
        }
        String str8 = str3;
        if ((i11 & 16) != 0) {
            str4 = cancelApplReqObjList.trans;
        }
        String str9 = str4;
        if ((i11 & 32) != 0) {
            str5 = cancelApplReqObjList.slno;
        }
        return cancelApplReqObjList.copy(i10, str6, str7, str8, str9, str5);
    }

    public final int component1() {
        return this.trtrcd;
    }

    public final String component2() {
        return this.covs;
    }

    public final String component3() {
        return this.covcd;
    }

    public final String component4() {
        return this.transaction;
    }

    public final String component5() {
        return this.trans;
    }

    public final String component6() {
        return this.slno;
    }

    public final CancelApplReqObjList copy(int i10, String str, String str2, String str3, String str4, String str5) {
        l.f(str, "covs");
        l.f(str2, "covcd");
        l.f(str3, "transaction");
        l.f(str4, "trans");
        l.f(str5, "slno");
        return new CancelApplReqObjList(i10, str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplReqObjList)) {
            return false;
        }
        CancelApplReqObjList cancelApplReqObjList = (CancelApplReqObjList) obj;
        return this.trtrcd == cancelApplReqObjList.trtrcd && l.a(this.covs, cancelApplReqObjList.covs) && l.a(this.covcd, cancelApplReqObjList.covcd) && l.a(this.transaction, cancelApplReqObjList.transaction) && l.a(this.trans, cancelApplReqObjList.trans) && l.a(this.slno, cancelApplReqObjList.slno);
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getCovs() {
        return this.covs;
    }

    public final String getSlno() {
        return this.slno;
    }

    public final String getTrans() {
        return this.trans;
    }

    public final String getTransaction() {
        return this.transaction;
    }

    public final int getTrtrcd() {
        return this.trtrcd;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.trtrcd) * 31) + this.covs.hashCode()) * 31) + this.covcd.hashCode()) * 31) + this.transaction.hashCode()) * 31) + this.trans.hashCode()) * 31) + this.slno.hashCode();
    }

    public String toString() {
        return "CancelApplReqObjList(trtrcd=" + this.trtrcd + ", covs=" + this.covs + ", covcd=" + this.covcd + ", transaction=" + this.transaction + ", trans=" + this.trans + ", slno=" + this.slno + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeInt(this.trtrcd);
        parcel.writeString(this.covs);
        parcel.writeString(this.covcd);
        parcel.writeString(this.transaction);
        parcel.writeString(this.trans);
        parcel.writeString(this.slno);
    }

    public CancelApplReqObjList(int i10, String str, String str2, String str3, String str4, String str5) {
        l.f(str, "covs");
        l.f(str2, "covcd");
        l.f(str3, "transaction");
        l.f(str4, "trans");
        l.f(str5, "slno");
        this.trtrcd = i10;
        this.covs = str;
        this.covcd = str2;
        this.transaction = str3;
        this.trans = str4;
        this.slno = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CancelApplReqObjList(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, cm.g r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0022
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r9
        L_0x0023:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r10
        L_0x0029:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelApplReqObjList.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
