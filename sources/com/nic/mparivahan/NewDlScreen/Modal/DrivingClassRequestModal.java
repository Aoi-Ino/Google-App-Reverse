package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DrivingClassRequestModal {
    private final String certDate;
    private final String certNo;
    private final String covcd;
    private final String dschoolCode;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;

    public DrivingClassRequestModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "enrollDate");
        l.f(str2, "covcd");
        l.f(str3, "trainTo");
        l.f(str4, "certDate");
        l.f(str5, "certNo");
        l.f(str6, "enrollNo");
        l.f(str7, "dschoolCode");
        l.f(str8, "trainFrom");
        this.enrollDate = str;
        this.covcd = str2;
        this.trainTo = str3;
        this.certDate = str4;
        this.certNo = str5;
        this.enrollNo = str6;
        this.dschoolCode = str7;
        this.trainFrom = str8;
    }

    public static /* synthetic */ DrivingClassRequestModal copy$default(DrivingClassRequestModal drivingClassRequestModal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        DrivingClassRequestModal drivingClassRequestModal2 = drivingClassRequestModal;
        int i11 = i10;
        return drivingClassRequestModal.copy((i11 & 1) != 0 ? drivingClassRequestModal2.enrollDate : str, (i11 & 2) != 0 ? drivingClassRequestModal2.covcd : str2, (i11 & 4) != 0 ? drivingClassRequestModal2.trainTo : str3, (i11 & 8) != 0 ? drivingClassRequestModal2.certDate : str4, (i11 & 16) != 0 ? drivingClassRequestModal2.certNo : str5, (i11 & 32) != 0 ? drivingClassRequestModal2.enrollNo : str6, (i11 & 64) != 0 ? drivingClassRequestModal2.dschoolCode : str7, (i11 & 128) != 0 ? drivingClassRequestModal2.trainFrom : str8);
    }

    public final String component1() {
        return this.enrollDate;
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

    public final DrivingClassRequestModal copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "enrollDate");
        l.f(str2, "covcd");
        l.f(str3, "trainTo");
        l.f(str4, "certDate");
        l.f(str5, "certNo");
        String str9 = str6;
        l.f(str9, "enrollNo");
        String str10 = str7;
        l.f(str10, "dschoolCode");
        String str11 = str8;
        l.f(str11, "trainFrom");
        return new DrivingClassRequestModal(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingClassRequestModal)) {
            return false;
        }
        DrivingClassRequestModal drivingClassRequestModal = (DrivingClassRequestModal) obj;
        return l.a(this.enrollDate, drivingClassRequestModal.enrollDate) && l.a(this.covcd, drivingClassRequestModal.covcd) && l.a(this.trainTo, drivingClassRequestModal.trainTo) && l.a(this.certDate, drivingClassRequestModal.certDate) && l.a(this.certNo, drivingClassRequestModal.certNo) && l.a(this.enrollNo, drivingClassRequestModal.enrollNo) && l.a(this.dschoolCode, drivingClassRequestModal.dschoolCode) && l.a(this.trainFrom, drivingClassRequestModal.trainFrom);
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

    public int hashCode() {
        return (((((((((((((this.enrollDate.hashCode() * 31) + this.covcd.hashCode()) * 31) + this.trainTo.hashCode()) * 31) + this.certDate.hashCode()) * 31) + this.certNo.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.dschoolCode.hashCode()) * 31) + this.trainFrom.hashCode();
    }

    public String toString() {
        return "DrivingClassRequestModal(enrollDate=" + this.enrollDate + ", covcd=" + this.covcd + ", trainTo=" + this.trainTo + ", certDate=" + this.certDate + ", certNo=" + this.certNo + ", enrollNo=" + this.enrollNo + ", dschoolCode=" + this.dschoolCode + ", trainFrom=" + this.trainFrom + ')';
    }
}
