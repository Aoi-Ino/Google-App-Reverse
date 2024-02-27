package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DOAadhaarResponse implements Parcelable {
    public static final Parcelable.Creator<DOAadhaarResponse> CREATOR = new a();
    private final String biodeviceinfo;
    private final DOAuthOTP dOAuthOTP;
    private final DOEkyc dOEkyc;
    private final String finalxml;
    private final int pur_cd;
    private final String reason;
    private final String regn_no;
    private final String status;
    private final String txnNo;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final DOAadhaarResponse createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DOAadhaarResponse(parcel.readString(), DOAuthOTP.CREATOR.createFromParcel(parcel), DOEkyc.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DOAadhaarResponse[] newArray(int i10) {
            return new DOAadhaarResponse[i10];
        }
    }

    public DOAadhaarResponse(String str, DOAuthOTP dOAuthOTP2, DOEkyc dOEkyc2, String str2, int i10, String str3, String str4, String str5, String str6) {
        l.f(str, "biodeviceinfo");
        l.f(dOAuthOTP2, "dOAuthOTP");
        l.f(dOEkyc2, "dOEkyc");
        l.f(str2, "finalxml");
        l.f(str3, "reason");
        l.f(str4, "regn_no");
        l.f(str5, "status");
        l.f(str6, "txnNo");
        this.biodeviceinfo = str;
        this.dOAuthOTP = dOAuthOTP2;
        this.dOEkyc = dOEkyc2;
        this.finalxml = str2;
        this.pur_cd = i10;
        this.reason = str3;
        this.regn_no = str4;
        this.status = str5;
        this.txnNo = str6;
    }

    public static /* synthetic */ DOAadhaarResponse copy$default(DOAadhaarResponse dOAadhaarResponse, String str, DOAuthOTP dOAuthOTP2, DOEkyc dOEkyc2, String str2, int i10, String str3, String str4, String str5, String str6, int i11, Object obj) {
        DOAadhaarResponse dOAadhaarResponse2 = dOAadhaarResponse;
        int i12 = i11;
        return dOAadhaarResponse.copy((i12 & 1) != 0 ? dOAadhaarResponse2.biodeviceinfo : str, (i12 & 2) != 0 ? dOAadhaarResponse2.dOAuthOTP : dOAuthOTP2, (i12 & 4) != 0 ? dOAadhaarResponse2.dOEkyc : dOEkyc2, (i12 & 8) != 0 ? dOAadhaarResponse2.finalxml : str2, (i12 & 16) != 0 ? dOAadhaarResponse2.pur_cd : i10, (i12 & 32) != 0 ? dOAadhaarResponse2.reason : str3, (i12 & 64) != 0 ? dOAadhaarResponse2.regn_no : str4, (i12 & 128) != 0 ? dOAadhaarResponse2.status : str5, (i12 & 256) != 0 ? dOAadhaarResponse2.txnNo : str6);
    }

    public final String component1() {
        return this.biodeviceinfo;
    }

    public final DOAuthOTP component2() {
        return this.dOAuthOTP;
    }

    public final DOEkyc component3() {
        return this.dOEkyc;
    }

    public final String component4() {
        return this.finalxml;
    }

    public final int component5() {
        return this.pur_cd;
    }

    public final String component6() {
        return this.reason;
    }

    public final String component7() {
        return this.regn_no;
    }

    public final String component8() {
        return this.status;
    }

    public final String component9() {
        return this.txnNo;
    }

    public final DOAadhaarResponse copy(String str, DOAuthOTP dOAuthOTP2, DOEkyc dOEkyc2, String str2, int i10, String str3, String str4, String str5, String str6) {
        l.f(str, "biodeviceinfo");
        l.f(dOAuthOTP2, "dOAuthOTP");
        l.f(dOEkyc2, "dOEkyc");
        l.f(str2, "finalxml");
        String str7 = str3;
        l.f(str7, "reason");
        String str8 = str4;
        l.f(str8, "regn_no");
        String str9 = str5;
        l.f(str9, "status");
        String str10 = str6;
        l.f(str10, "txnNo");
        return new DOAadhaarResponse(str, dOAuthOTP2, dOEkyc2, str2, i10, str7, str8, str9, str10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DOAadhaarResponse)) {
            return false;
        }
        DOAadhaarResponse dOAadhaarResponse = (DOAadhaarResponse) obj;
        return l.a(this.biodeviceinfo, dOAadhaarResponse.biodeviceinfo) && l.a(this.dOAuthOTP, dOAadhaarResponse.dOAuthOTP) && l.a(this.dOEkyc, dOAadhaarResponse.dOEkyc) && l.a(this.finalxml, dOAadhaarResponse.finalxml) && this.pur_cd == dOAadhaarResponse.pur_cd && l.a(this.reason, dOAadhaarResponse.reason) && l.a(this.regn_no, dOAadhaarResponse.regn_no) && l.a(this.status, dOAadhaarResponse.status) && l.a(this.txnNo, dOAadhaarResponse.txnNo);
    }

    public final String getBiodeviceinfo() {
        return this.biodeviceinfo;
    }

    public final DOAuthOTP getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    public final DOEkyc getDOEkyc() {
        return this.dOEkyc;
    }

    public final String getFinalxml() {
        return this.finalxml;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxnNo() {
        return this.txnNo;
    }

    public int hashCode() {
        return (((((((((((((((this.biodeviceinfo.hashCode() * 31) + this.dOAuthOTP.hashCode()) * 31) + this.dOEkyc.hashCode()) * 31) + this.finalxml.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.status.hashCode()) * 31) + this.txnNo.hashCode();
    }

    public String toString() {
        return "DOAadhaarResponse(biodeviceinfo=" + this.biodeviceinfo + ", dOAuthOTP=" + this.dOAuthOTP + ", dOEkyc=" + this.dOEkyc + ", finalxml=" + this.finalxml + ", pur_cd=" + this.pur_cd + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", status=" + this.status + ", txnNo=" + this.txnNo + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.biodeviceinfo);
        this.dOAuthOTP.writeToParcel(parcel, i10);
        this.dOEkyc.writeToParcel(parcel, i10);
        parcel.writeString(this.finalxml);
        parcel.writeInt(this.pur_cd);
        parcel.writeString(this.reason);
        parcel.writeString(this.regn_no);
        parcel.writeString(this.status);
        parcel.writeString(this.txnNo);
    }
}
