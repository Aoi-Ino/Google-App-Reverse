package com.nic.mparivahan.DPTNotice.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;
import j7.c;

@Keep
public final class DPTNoticeDataModel implements Parcelable {
    public static final Parcelable.Creator<DPTNoticeDataModel> CREATOR = new a();
    @c("amount")
    private final int amount;
    @c("area_name")
    private final String area_name;
    @c("challan_no")
    private final int challan_no;
    @c("date_time")
    private final String date_time;
    @c("doc_no")
    private final String doc_no;
    @c("offence_name")
    private final String offence_name;
    @c("owner_name")
    private final String owner_name;
    @c("payment_eligible")
    private final int payment_eligible;
    @c("pdf_url")
    private final String pdf_url;
    @c("rto_cd")
    private final int rto_cd;
    @c("state_cd")
    private final String state_cd;
    @c("status")
    private final String status;
    @c("status_txt")
    private final String status_txt;
    @c("vcourt_eligible")
    private final int vcourt_eligible;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final DPTNoticeDataModel createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DPTNoticeDataModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DPTNoticeDataModel[] newArray(int i10) {
            return new DPTNoticeDataModel[i10];
        }
    }

    public DPTNoticeDataModel(String str, int i10, int i11, String str2, String str3, String str4, String str5, int i12, int i13, String str6, int i14, String str7, String str8, String str9) {
        l.f(str, "offence_name");
        l.f(str2, "status");
        l.f(str3, "date_time");
        l.f(str4, "doc_no");
        l.f(str5, "state_cd");
        l.f(str6, "area_name");
        l.f(str7, "status_txt");
        l.f(str8, "pdf_url");
        l.f(str9, "owner_name");
        this.offence_name = str;
        this.amount = i10;
        this.challan_no = i11;
        this.status = str2;
        this.date_time = str3;
        this.doc_no = str4;
        this.state_cd = str5;
        this.rto_cd = i12;
        this.vcourt_eligible = i13;
        this.area_name = str6;
        this.payment_eligible = i14;
        this.status_txt = str7;
        this.pdf_url = str8;
        this.owner_name = str9;
    }

    public static /* synthetic */ DPTNoticeDataModel copy$default(DPTNoticeDataModel dPTNoticeDataModel, String str, int i10, int i11, String str2, String str3, String str4, String str5, int i12, int i13, String str6, int i14, String str7, String str8, String str9, int i15, Object obj) {
        DPTNoticeDataModel dPTNoticeDataModel2 = dPTNoticeDataModel;
        int i16 = i15;
        return dPTNoticeDataModel.copy((i16 & 1) != 0 ? dPTNoticeDataModel2.offence_name : str, (i16 & 2) != 0 ? dPTNoticeDataModel2.amount : i10, (i16 & 4) != 0 ? dPTNoticeDataModel2.challan_no : i11, (i16 & 8) != 0 ? dPTNoticeDataModel2.status : str2, (i16 & 16) != 0 ? dPTNoticeDataModel2.date_time : str3, (i16 & 32) != 0 ? dPTNoticeDataModel2.doc_no : str4, (i16 & 64) != 0 ? dPTNoticeDataModel2.state_cd : str5, (i16 & 128) != 0 ? dPTNoticeDataModel2.rto_cd : i12, (i16 & 256) != 0 ? dPTNoticeDataModel2.vcourt_eligible : i13, (i16 & 512) != 0 ? dPTNoticeDataModel2.area_name : str6, (i16 & 1024) != 0 ? dPTNoticeDataModel2.payment_eligible : i14, (i16 & 2048) != 0 ? dPTNoticeDataModel2.status_txt : str7, (i16 & 4096) != 0 ? dPTNoticeDataModel2.pdf_url : str8, (i16 & 8192) != 0 ? dPTNoticeDataModel2.owner_name : str9);
    }

    public final String component1() {
        return this.offence_name;
    }

    public final String component10() {
        return this.area_name;
    }

    public final int component11() {
        return this.payment_eligible;
    }

    public final String component12() {
        return this.status_txt;
    }

    public final String component13() {
        return this.pdf_url;
    }

    public final String component14() {
        return this.owner_name;
    }

    public final int component2() {
        return this.amount;
    }

    public final int component3() {
        return this.challan_no;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.date_time;
    }

    public final String component6() {
        return this.doc_no;
    }

    public final String component7() {
        return this.state_cd;
    }

    public final int component8() {
        return this.rto_cd;
    }

    public final int component9() {
        return this.vcourt_eligible;
    }

    public final DPTNoticeDataModel copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, int i12, int i13, String str6, int i14, String str7, String str8, String str9) {
        String str10 = str;
        l.f(str10, "offence_name");
        String str11 = str2;
        l.f(str11, "status");
        String str12 = str3;
        l.f(str12, "date_time");
        String str13 = str4;
        l.f(str13, "doc_no");
        String str14 = str5;
        l.f(str14, "state_cd");
        String str15 = str6;
        l.f(str15, "area_name");
        String str16 = str7;
        l.f(str16, "status_txt");
        String str17 = str8;
        l.f(str17, "pdf_url");
        String str18 = str9;
        l.f(str18, "owner_name");
        return new DPTNoticeDataModel(str10, i10, i11, str11, str12, str13, str14, i12, i13, str15, i14, str16, str17, str18);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DPTNoticeDataModel)) {
            return false;
        }
        DPTNoticeDataModel dPTNoticeDataModel = (DPTNoticeDataModel) obj;
        return l.a(this.offence_name, dPTNoticeDataModel.offence_name) && this.amount == dPTNoticeDataModel.amount && this.challan_no == dPTNoticeDataModel.challan_no && l.a(this.status, dPTNoticeDataModel.status) && l.a(this.date_time, dPTNoticeDataModel.date_time) && l.a(this.doc_no, dPTNoticeDataModel.doc_no) && l.a(this.state_cd, dPTNoticeDataModel.state_cd) && this.rto_cd == dPTNoticeDataModel.rto_cd && this.vcourt_eligible == dPTNoticeDataModel.vcourt_eligible && l.a(this.area_name, dPTNoticeDataModel.area_name) && this.payment_eligible == dPTNoticeDataModel.payment_eligible && l.a(this.status_txt, dPTNoticeDataModel.status_txt) && l.a(this.pdf_url, dPTNoticeDataModel.pdf_url) && l.a(this.owner_name, dPTNoticeDataModel.owner_name);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getArea_name() {
        return this.area_name;
    }

    public final int getChallan_no() {
        return this.challan_no;
    }

    public final String getDate_time() {
        return this.date_time;
    }

    public final String getDoc_no() {
        return this.doc_no;
    }

    public final String getOffence_name() {
        return this.offence_name;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final int getPayment_eligible() {
        return this.payment_eligible;
    }

    public final String getPdf_url() {
        return this.pdf_url;
    }

    public final int getRto_cd() {
        return this.rto_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatus_txt() {
        return this.status_txt;
    }

    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.offence_name.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + Integer.hashCode(this.challan_no)) * 31) + this.status.hashCode()) * 31) + this.date_time.hashCode()) * 31) + this.doc_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.rto_cd)) * 31) + Integer.hashCode(this.vcourt_eligible)) * 31) + this.area_name.hashCode()) * 31) + Integer.hashCode(this.payment_eligible)) * 31) + this.status_txt.hashCode()) * 31) + this.pdf_url.hashCode()) * 31) + this.owner_name.hashCode();
    }

    public String toString() {
        return "DPTNoticeDataModel(offence_name=" + this.offence_name + ", amount=" + this.amount + ", challan_no=" + this.challan_no + ", status=" + this.status + ", date_time=" + this.date_time + ", doc_no=" + this.doc_no + ", state_cd=" + this.state_cd + ", rto_cd=" + this.rto_cd + ", vcourt_eligible=" + this.vcourt_eligible + ", area_name=" + this.area_name + ", payment_eligible=" + this.payment_eligible + ", status_txt=" + this.status_txt + ", pdf_url=" + this.pdf_url + ", owner_name=" + this.owner_name + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.offence_name);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.challan_no);
        parcel.writeString(this.status);
        parcel.writeString(this.date_time);
        parcel.writeString(this.doc_no);
        parcel.writeString(this.state_cd);
        parcel.writeInt(this.rto_cd);
        parcel.writeInt(this.vcourt_eligible);
        parcel.writeString(this.area_name);
        parcel.writeInt(this.payment_eligible);
        parcel.writeString(this.status_txt);
        parcel.writeString(this.pdf_url);
        parcel.writeString(this.owner_name);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DPTNoticeDataModel(java.lang.String r19, int r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, java.lang.String r28, int r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, cm.g r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r19
        L_0x000c:
            r1 = r0 & 2
            r3 = 0
            if (r1 == 0) goto L_0x0013
            r5 = r3
            goto L_0x0015
        L_0x0013:
            r5 = r20
        L_0x0015:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            r6 = r3
            goto L_0x001d
        L_0x001b:
            r6 = r21
        L_0x001d:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0023
            r7 = r2
            goto L_0x0025
        L_0x0023:
            r7 = r22
        L_0x0025:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002b
            r8 = r2
            goto L_0x002d
        L_0x002b:
            r8 = r23
        L_0x002d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0033
            r9 = r2
            goto L_0x0035
        L_0x0033:
            r9 = r24
        L_0x0035:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003b
            r10 = r2
            goto L_0x003d
        L_0x003b:
            r10 = r25
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r13 = r2
            goto L_0x0045
        L_0x0043:
            r13 = r28
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004b
            r14 = r3
            goto L_0x004d
        L_0x004b:
            r14 = r29
        L_0x004d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0053
            r15 = r2
            goto L_0x0055
        L_0x0053:
            r15 = r30
        L_0x0055:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005c
            r16 = r2
            goto L_0x005e
        L_0x005c:
            r16 = r31
        L_0x005e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0065
            r17 = r2
            goto L_0x0067
        L_0x0065:
            r17 = r32
        L_0x0067:
            r3 = r18
            r11 = r26
            r12 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
