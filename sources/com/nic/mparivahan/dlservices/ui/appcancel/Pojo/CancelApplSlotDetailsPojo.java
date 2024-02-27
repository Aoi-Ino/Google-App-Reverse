package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;

@Keep
public final class CancelApplSlotDetailsPojo implements Parcelable {
    public static final Parcelable.Creator<CancelApplSlotDetailsPojo> CREATOR = new a();
    private final String age;
    private final String applName;
    private final String applno;
    private final String dob;
    private final String gender;
    private final String relation;
    private final ArrayList<CancelApplReqObjList> reqObjlst;
    private final String rtoCd;
    private final String rtoName;
    private final String slotDate;
    private final String slotTimings;
    private final String swdName;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final CancelApplSlotDetailsPojo createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            l.f(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(CancelApplReqObjList.CREATOR.createFromParcel(parcel2));
            }
            return new CancelApplSlotDetailsPojo(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, arrayList);
        }

        /* renamed from: b */
        public final CancelApplSlotDetailsPojo[] newArray(int i10) {
            return new CancelApplSlotDetailsPojo[i10];
        }
    }

    public CancelApplSlotDetailsPojo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList<CancelApplReqObjList> arrayList) {
        l.f(str, "rtoName");
        l.f(str2, "rtoCd");
        l.f(str3, "gender");
        l.f(str4, "dob");
        l.f(str5, "applName");
        l.f(str6, "applno");
        l.f(str7, "swdName");
        l.f(str8, "slotDate");
        l.f(str9, "slotTimings");
        l.f(str10, "age");
        l.f(str11, "relation");
        l.f(arrayList, "reqObjlst");
        this.rtoName = str;
        this.rtoCd = str2;
        this.gender = str3;
        this.dob = str4;
        this.applName = str5;
        this.applno = str6;
        this.swdName = str7;
        this.slotDate = str8;
        this.slotTimings = str9;
        this.age = str10;
        this.relation = str11;
        this.reqObjlst = arrayList;
    }

    public static /* synthetic */ CancelApplSlotDetailsPojo copy$default(CancelApplSlotDetailsPojo cancelApplSlotDetailsPojo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, int i10, Object obj) {
        CancelApplSlotDetailsPojo cancelApplSlotDetailsPojo2 = cancelApplSlotDetailsPojo;
        int i11 = i10;
        return cancelApplSlotDetailsPojo.copy((i11 & 1) != 0 ? cancelApplSlotDetailsPojo2.rtoName : str, (i11 & 2) != 0 ? cancelApplSlotDetailsPojo2.rtoCd : str2, (i11 & 4) != 0 ? cancelApplSlotDetailsPojo2.gender : str3, (i11 & 8) != 0 ? cancelApplSlotDetailsPojo2.dob : str4, (i11 & 16) != 0 ? cancelApplSlotDetailsPojo2.applName : str5, (i11 & 32) != 0 ? cancelApplSlotDetailsPojo2.applno : str6, (i11 & 64) != 0 ? cancelApplSlotDetailsPojo2.swdName : str7, (i11 & 128) != 0 ? cancelApplSlotDetailsPojo2.slotDate : str8, (i11 & 256) != 0 ? cancelApplSlotDetailsPojo2.slotTimings : str9, (i11 & 512) != 0 ? cancelApplSlotDetailsPojo2.age : str10, (i11 & 1024) != 0 ? cancelApplSlotDetailsPojo2.relation : str11, (i11 & 2048) != 0 ? cancelApplSlotDetailsPojo2.reqObjlst : arrayList);
    }

    public final String component1() {
        return this.rtoName;
    }

    public final String component10() {
        return this.age;
    }

    public final String component11() {
        return this.relation;
    }

    public final ArrayList<CancelApplReqObjList> component12() {
        return this.reqObjlst;
    }

    public final String component2() {
        return this.rtoCd;
    }

    public final String component3() {
        return this.gender;
    }

    public final String component4() {
        return this.dob;
    }

    public final String component5() {
        return this.applName;
    }

    public final String component6() {
        return this.applno;
    }

    public final String component7() {
        return this.swdName;
    }

    public final String component8() {
        return this.slotDate;
    }

    public final String component9() {
        return this.slotTimings;
    }

    public final CancelApplSlotDetailsPojo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList<CancelApplReqObjList> arrayList) {
        l.f(str, "rtoName");
        String str12 = str2;
        l.f(str12, "rtoCd");
        String str13 = str3;
        l.f(str13, "gender");
        String str14 = str4;
        l.f(str14, "dob");
        String str15 = str5;
        l.f(str15, "applName");
        String str16 = str6;
        l.f(str16, "applno");
        String str17 = str7;
        l.f(str17, "swdName");
        String str18 = str8;
        l.f(str18, "slotDate");
        String str19 = str9;
        l.f(str19, "slotTimings");
        String str20 = str10;
        l.f(str20, "age");
        String str21 = str11;
        l.f(str21, "relation");
        ArrayList<CancelApplReqObjList> arrayList2 = arrayList;
        l.f(arrayList2, "reqObjlst");
        return new CancelApplSlotDetailsPojo(str, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, arrayList2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplSlotDetailsPojo)) {
            return false;
        }
        CancelApplSlotDetailsPojo cancelApplSlotDetailsPojo = (CancelApplSlotDetailsPojo) obj;
        return l.a(this.rtoName, cancelApplSlotDetailsPojo.rtoName) && l.a(this.rtoCd, cancelApplSlotDetailsPojo.rtoCd) && l.a(this.gender, cancelApplSlotDetailsPojo.gender) && l.a(this.dob, cancelApplSlotDetailsPojo.dob) && l.a(this.applName, cancelApplSlotDetailsPojo.applName) && l.a(this.applno, cancelApplSlotDetailsPojo.applno) && l.a(this.swdName, cancelApplSlotDetailsPojo.swdName) && l.a(this.slotDate, cancelApplSlotDetailsPojo.slotDate) && l.a(this.slotTimings, cancelApplSlotDetailsPojo.slotTimings) && l.a(this.age, cancelApplSlotDetailsPojo.age) && l.a(this.relation, cancelApplSlotDetailsPojo.relation) && l.a(this.reqObjlst, cancelApplSlotDetailsPojo.reqObjlst);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final ArrayList<CancelApplReqObjList> getReqObjlst() {
        return this.reqObjlst;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public final String getSlotDate() {
        return this.slotDate;
    }

    public final String getSlotTimings() {
        return this.slotTimings;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.rtoName.hashCode() * 31) + this.rtoCd.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.slotDate.hashCode()) * 31) + this.slotTimings.hashCode()) * 31) + this.age.hashCode()) * 31) + this.relation.hashCode()) * 31) + this.reqObjlst.hashCode();
    }

    public String toString() {
        return "CancelApplSlotDetailsPojo(rtoName=" + this.rtoName + ", rtoCd=" + this.rtoCd + ", gender=" + this.gender + ", dob=" + this.dob + ", applName=" + this.applName + ", applno=" + this.applno + ", swdName=" + this.swdName + ", slotDate=" + this.slotDate + ", slotTimings=" + this.slotTimings + ", age=" + this.age + ", relation=" + this.relation + ", reqObjlst=" + this.reqObjlst + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.rtoName);
        parcel.writeString(this.rtoCd);
        parcel.writeString(this.gender);
        parcel.writeString(this.dob);
        parcel.writeString(this.applName);
        parcel.writeString(this.applno);
        parcel.writeString(this.swdName);
        parcel.writeString(this.slotDate);
        parcel.writeString(this.slotTimings);
        parcel.writeString(this.age);
        parcel.writeString(this.relation);
        ArrayList<CancelApplReqObjList> arrayList = this.reqObjlst;
        parcel.writeInt(arrayList.size());
        Iterator<CancelApplReqObjList> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CancelApplSlotDetailsPojo(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.ArrayList r28, int r29, cm.g r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r17
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r18
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001c
        L_0x001a:
            r6 = r19
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0022
            r7 = r2
            goto L_0x0024
        L_0x0022:
            r7 = r20
        L_0x0024:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002a
            r8 = r2
            goto L_0x002c
        L_0x002a:
            r8 = r21
        L_0x002c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0032
            r9 = r2
            goto L_0x0034
        L_0x0032:
            r9 = r22
        L_0x0034:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003a
            r10 = r2
            goto L_0x003c
        L_0x003a:
            r10 = r23
        L_0x003c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0042
            r11 = r2
            goto L_0x0044
        L_0x0042:
            r11 = r24
        L_0x0044:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004a
            r12 = r2
            goto L_0x004c
        L_0x004a:
            r12 = r25
        L_0x004c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0052
            r13 = r2
            goto L_0x0054
        L_0x0052:
            r13 = r26
        L_0x0054:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x005a
            r14 = r2
            goto L_0x005c
        L_0x005a:
            r14 = r27
        L_0x005c:
            r3 = r16
            r15 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelApplSlotDetailsPojo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, int, cm.g):void");
    }
}
