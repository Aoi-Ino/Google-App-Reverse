package com.nic.mparivahan.dlservices.newlearner.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;

@Keep
public final class LlDrivingSchoolDetRequestModal implements Parcelable {
    public static final Parcelable.Creator<LlDrivingSchoolDetRequestModal> CREATOR = new a();
    private final String certificateDate;
    private final String certificateNo;
    private final String covcd;
    private final String dsName;
    private final String dsTrainedFromDate;
    private final String dsTrainedToDate;
    private final String enrolmentDate;
    private final String enrolmentNo;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final LlDrivingSchoolDetRequestModal createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new LlDrivingSchoolDetRequestModal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LlDrivingSchoolDetRequestModal[] newArray(int i10) {
            return new LlDrivingSchoolDetRequestModal[i10];
        }
    }

    public LlDrivingSchoolDetRequestModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "enrolmentDate");
        l.f(str2, "covcd");
        l.f(str3, "dsTrainedToDate");
        l.f(str4, "certificateDate");
        l.f(str5, "certificateNo");
        l.f(str6, "enrolmentNo");
        l.f(str7, "dsTrainedFromDate");
        l.f(str8, "dsName");
        this.enrolmentDate = str;
        this.covcd = str2;
        this.dsTrainedToDate = str3;
        this.certificateDate = str4;
        this.certificateNo = str5;
        this.enrolmentNo = str6;
        this.dsTrainedFromDate = str7;
        this.dsName = str8;
    }

    public static /* synthetic */ LlDrivingSchoolDetRequestModal copy$default(LlDrivingSchoolDetRequestModal llDrivingSchoolDetRequestModal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        LlDrivingSchoolDetRequestModal llDrivingSchoolDetRequestModal2 = llDrivingSchoolDetRequestModal;
        int i11 = i10;
        return llDrivingSchoolDetRequestModal.copy((i11 & 1) != 0 ? llDrivingSchoolDetRequestModal2.enrolmentDate : str, (i11 & 2) != 0 ? llDrivingSchoolDetRequestModal2.covcd : str2, (i11 & 4) != 0 ? llDrivingSchoolDetRequestModal2.dsTrainedToDate : str3, (i11 & 8) != 0 ? llDrivingSchoolDetRequestModal2.certificateDate : str4, (i11 & 16) != 0 ? llDrivingSchoolDetRequestModal2.certificateNo : str5, (i11 & 32) != 0 ? llDrivingSchoolDetRequestModal2.enrolmentNo : str6, (i11 & 64) != 0 ? llDrivingSchoolDetRequestModal2.dsTrainedFromDate : str7, (i11 & 128) != 0 ? llDrivingSchoolDetRequestModal2.dsName : str8);
    }

    public final String component1() {
        return this.enrolmentDate;
    }

    public final String component2() {
        return this.covcd;
    }

    public final String component3() {
        return this.dsTrainedToDate;
    }

    public final String component4() {
        return this.certificateDate;
    }

    public final String component5() {
        return this.certificateNo;
    }

    public final String component6() {
        return this.enrolmentNo;
    }

    public final String component7() {
        return this.dsTrainedFromDate;
    }

    public final String component8() {
        return this.dsName;
    }

    public final LlDrivingSchoolDetRequestModal copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "enrolmentDate");
        l.f(str2, "covcd");
        l.f(str3, "dsTrainedToDate");
        l.f(str4, "certificateDate");
        l.f(str5, "certificateNo");
        String str9 = str6;
        l.f(str9, "enrolmentNo");
        String str10 = str7;
        l.f(str10, "dsTrainedFromDate");
        String str11 = str8;
        l.f(str11, "dsName");
        return new LlDrivingSchoolDetRequestModal(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LlDrivingSchoolDetRequestModal)) {
            return false;
        }
        LlDrivingSchoolDetRequestModal llDrivingSchoolDetRequestModal = (LlDrivingSchoolDetRequestModal) obj;
        return l.a(this.enrolmentDate, llDrivingSchoolDetRequestModal.enrolmentDate) && l.a(this.covcd, llDrivingSchoolDetRequestModal.covcd) && l.a(this.dsTrainedToDate, llDrivingSchoolDetRequestModal.dsTrainedToDate) && l.a(this.certificateDate, llDrivingSchoolDetRequestModal.certificateDate) && l.a(this.certificateNo, llDrivingSchoolDetRequestModal.certificateNo) && l.a(this.enrolmentNo, llDrivingSchoolDetRequestModal.enrolmentNo) && l.a(this.dsTrainedFromDate, llDrivingSchoolDetRequestModal.dsTrainedFromDate) && l.a(this.dsName, llDrivingSchoolDetRequestModal.dsName);
    }

    public final String getCertificateDate() {
        return this.certificateDate;
    }

    public final String getCertificateNo() {
        return this.certificateNo;
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getDsName() {
        return this.dsName;
    }

    public final String getDsTrainedFromDate() {
        return this.dsTrainedFromDate;
    }

    public final String getDsTrainedToDate() {
        return this.dsTrainedToDate;
    }

    public final String getEnrolmentDate() {
        return this.enrolmentDate;
    }

    public final String getEnrolmentNo() {
        return this.enrolmentNo;
    }

    public int hashCode() {
        return (((((((((((((this.enrolmentDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.dsTrainedToDate.hashCode()) * 31) + this.certificateDate.hashCode()) * 31) + this.certificateNo.hashCode()) * 31) + this.enrolmentNo.hashCode()) * 31) + this.dsTrainedFromDate.hashCode()) * 31) + this.dsName.hashCode();
    }

    public String toString() {
        return "LlDrivingSchoolDetRequestModal(enrolmentDate=" + this.enrolmentDate + ", covcd=" + this.covcd + ", dsTrainedToDate=" + this.dsTrainedToDate + ", certificateDate=" + this.certificateDate + ", certificateNo=" + this.certificateNo + ", enrolmentNo=" + this.enrolmentNo + ", dsTrainedFromDate=" + this.dsTrainedFromDate + ", dsName=" + this.dsName + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.enrolmentDate);
        parcel.writeString(this.covcd);
        parcel.writeString(this.dsTrainedToDate);
        parcel.writeString(this.certificateDate);
        parcel.writeString(this.certificateNo);
        parcel.writeString(this.enrolmentNo);
        parcel.writeString(this.dsTrainedFromDate);
        parcel.writeString(this.dsName);
    }
}
