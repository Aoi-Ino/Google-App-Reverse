package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DrivingSchoolDetRequestModal implements Parcelable {
    public static final Parcelable.Creator<DrivingSchoolDetRequestModal> CREATOR = new a();
    private final String certDate;
    private final String certNo;
    private final String covcd;
    private final String drivingSchoolName;
    private final String dschoolCode;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;
    private final String vehicleClassName;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final DrivingSchoolDetRequestModal createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DrivingSchoolDetRequestModal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DrivingSchoolDetRequestModal[] newArray(int i10) {
            return new DrivingSchoolDetRequestModal[i10];
        }
    }

    public DrivingSchoolDetRequestModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        l.f(str, "enrollDate");
        l.f(str2, "covcd");
        l.f(str3, "trainTo");
        l.f(str4, "certDate");
        l.f(str5, "certNo");
        l.f(str6, "enrollNo");
        l.f(str7, "dschoolCode");
        l.f(str8, "trainFrom");
        l.f(str9, "vehicleClassName");
        l.f(str10, "drivingSchoolName");
        this.enrollDate = str;
        this.covcd = str2;
        this.trainTo = str3;
        this.certDate = str4;
        this.certNo = str5;
        this.enrollNo = str6;
        this.dschoolCode = str7;
        this.trainFrom = str8;
        this.vehicleClassName = str9;
        this.drivingSchoolName = str10;
    }

    public static /* synthetic */ DrivingSchoolDetRequestModal copy$default(DrivingSchoolDetRequestModal drivingSchoolDetRequestModal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal2 = drivingSchoolDetRequestModal;
        int i11 = i10;
        return drivingSchoolDetRequestModal.copy((i11 & 1) != 0 ? drivingSchoolDetRequestModal2.enrollDate : str, (i11 & 2) != 0 ? drivingSchoolDetRequestModal2.covcd : str2, (i11 & 4) != 0 ? drivingSchoolDetRequestModal2.trainTo : str3, (i11 & 8) != 0 ? drivingSchoolDetRequestModal2.certDate : str4, (i11 & 16) != 0 ? drivingSchoolDetRequestModal2.certNo : str5, (i11 & 32) != 0 ? drivingSchoolDetRequestModal2.enrollNo : str6, (i11 & 64) != 0 ? drivingSchoolDetRequestModal2.dschoolCode : str7, (i11 & 128) != 0 ? drivingSchoolDetRequestModal2.trainFrom : str8, (i11 & 256) != 0 ? drivingSchoolDetRequestModal2.vehicleClassName : str9, (i11 & 512) != 0 ? drivingSchoolDetRequestModal2.drivingSchoolName : str10);
    }

    public final String component1() {
        return this.enrollDate;
    }

    public final String component10() {
        return this.drivingSchoolName;
    }

    public final String component2() {
        return this.covcd;
    }

    public final String component3() {
        return this.trainTo;
    }

    public final String component4() {
        return this.certDate;
    }

    public final String component5() {
        return this.certNo;
    }

    public final String component6() {
        return this.enrollNo;
    }

    public final String component7() {
        return this.dschoolCode;
    }

    public final String component8() {
        return this.trainFrom;
    }

    public final String component9() {
        return this.vehicleClassName;
    }

    public final DrivingSchoolDetRequestModal copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        l.f(str, "enrollDate");
        l.f(str2, "covcd");
        l.f(str3, "trainTo");
        String str11 = str4;
        l.f(str11, "certDate");
        String str12 = str5;
        l.f(str12, "certNo");
        String str13 = str6;
        l.f(str13, "enrollNo");
        String str14 = str7;
        l.f(str14, "dschoolCode");
        String str15 = str8;
        l.f(str15, "trainFrom");
        String str16 = str9;
        l.f(str16, "vehicleClassName");
        String str17 = str10;
        l.f(str17, "drivingSchoolName");
        return new DrivingSchoolDetRequestModal(str, str2, str3, str11, str12, str13, str14, str15, str16, str17);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingSchoolDetRequestModal)) {
            return false;
        }
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = (DrivingSchoolDetRequestModal) obj;
        return l.a(this.enrollDate, drivingSchoolDetRequestModal.enrollDate) && l.a(this.covcd, drivingSchoolDetRequestModal.covcd) && l.a(this.trainTo, drivingSchoolDetRequestModal.trainTo) && l.a(this.certDate, drivingSchoolDetRequestModal.certDate) && l.a(this.certNo, drivingSchoolDetRequestModal.certNo) && l.a(this.enrollNo, drivingSchoolDetRequestModal.enrollNo) && l.a(this.dschoolCode, drivingSchoolDetRequestModal.dschoolCode) && l.a(this.trainFrom, drivingSchoolDetRequestModal.trainFrom) && l.a(this.vehicleClassName, drivingSchoolDetRequestModal.vehicleClassName) && l.a(this.drivingSchoolName, drivingSchoolDetRequestModal.drivingSchoolName);
    }

    public final String getCertDate() {
        return this.certDate;
    }

    public final String getCertNo() {
        return this.certNo;
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
    }

    public final String getDschoolCode() {
        return this.dschoolCode;
    }

    public final String getEnrollDate() {
        return this.enrollDate;
    }

    public final String getEnrollNo() {
        return this.enrollNo;
    }

    public final String getTrainFrom() {
        return this.trainFrom;
    }

    public final String getTrainTo() {
        return this.trainTo;
    }

    public final String getVehicleClassName() {
        return this.vehicleClassName;
    }

    public int hashCode() {
        return (((((((((((((((((this.enrollDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.trainTo.hashCode()) * 31) + this.certDate.hashCode()) * 31) + this.certNo.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.dschoolCode.hashCode()) * 31) + this.trainFrom.hashCode()) * 31) + this.vehicleClassName.hashCode()) * 31) + this.drivingSchoolName.hashCode();
    }

    public String toString() {
        return "DrivingSchoolDetRequestModal(enrollDate=" + this.enrollDate + ", covcd=" + this.covcd + ", trainTo=" + this.trainTo + ", certDate=" + this.certDate + ", certNo=" + this.certNo + ", enrollNo=" + this.enrollNo + ", dschoolCode=" + this.dschoolCode + ", trainFrom=" + this.trainFrom + ", vehicleClassName=" + this.vehicleClassName + ", drivingSchoolName=" + this.drivingSchoolName + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.enrollDate);
        parcel.writeString(this.covcd);
        parcel.writeString(this.trainTo);
        parcel.writeString(this.certDate);
        parcel.writeString(this.certNo);
        parcel.writeString(this.enrollNo);
        parcel.writeString(this.dschoolCode);
        parcel.writeString(this.trainFrom);
        parcel.writeString(this.vehicleClassName);
        parcel.writeString(this.drivingSchoolName);
    }
}
