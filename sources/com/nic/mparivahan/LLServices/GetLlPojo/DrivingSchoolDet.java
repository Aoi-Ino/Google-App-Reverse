package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DrivingSchoolDet implements Serializable {
    private final String certDate;
    private final String certNo;
    private final List<Covcd> covcd;
    private final List<DsName> dsName;
    private final String enrollDate;
    private final String enrollNo;
    private final String trainFrom;
    private final String trainTo;

    public DrivingSchoolDet(String str, String str2, List<Covcd> list, List<DsName> list2, String str3, String str4, String str5, String str6) {
        l.f(str, "certDate");
        l.f(str2, "certNo");
        l.f(list, "covcd");
        l.f(list2, "dsName");
        l.f(str3, "enrollDate");
        l.f(str4, "enrollNo");
        l.f(str5, "trainFrom");
        l.f(str6, "trainTo");
        this.certDate = str;
        this.certNo = str2;
        this.covcd = list;
        this.dsName = list2;
        this.enrollDate = str3;
        this.enrollNo = str4;
        this.trainFrom = str5;
        this.trainTo = str6;
    }

    public static /* synthetic */ DrivingSchoolDet copy$default(DrivingSchoolDet drivingSchoolDet, String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        DrivingSchoolDet drivingSchoolDet2 = drivingSchoolDet;
        int i11 = i10;
        return drivingSchoolDet.copy((i11 & 1) != 0 ? drivingSchoolDet2.certDate : str, (i11 & 2) != 0 ? drivingSchoolDet2.certNo : str2, (i11 & 4) != 0 ? drivingSchoolDet2.covcd : list, (i11 & 8) != 0 ? drivingSchoolDet2.dsName : list2, (i11 & 16) != 0 ? drivingSchoolDet2.enrollDate : str3, (i11 & 32) != 0 ? drivingSchoolDet2.enrollNo : str4, (i11 & 64) != 0 ? drivingSchoolDet2.trainFrom : str5, (i11 & 128) != 0 ? drivingSchoolDet2.trainTo : str6);
    }

    public final String component1() {
        return this.certDate;
    }

    public final String component2() {
        return this.certNo;
    }

    public final List<Covcd> component3() {
        return this.covcd;
    }

    public final List<DsName> component4() {
        return this.dsName;
    }

    public final String component5() {
        return this.enrollDate;
    }

    public final String component6() {
        return this.enrollNo;
    }

    public final String component7() {
        return this.trainFrom;
    }

    public final String component8() {
        return this.trainTo;
    }

    public final DrivingSchoolDet copy(String str, String str2, List<Covcd> list, List<DsName> list2, String str3, String str4, String str5, String str6) {
        l.f(str, "certDate");
        l.f(str2, "certNo");
        l.f(list, "covcd");
        l.f(list2, "dsName");
        l.f(str3, "enrollDate");
        String str7 = str4;
        l.f(str7, "enrollNo");
        String str8 = str5;
        l.f(str8, "trainFrom");
        String str9 = str6;
        l.f(str9, "trainTo");
        return new DrivingSchoolDet(str, str2, list, list2, str3, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingSchoolDet)) {
            return false;
        }
        DrivingSchoolDet drivingSchoolDet = (DrivingSchoolDet) obj;
        return l.a(this.certDate, drivingSchoolDet.certDate) && l.a(this.certNo, drivingSchoolDet.certNo) && l.a(this.covcd, drivingSchoolDet.covcd) && l.a(this.dsName, drivingSchoolDet.dsName) && l.a(this.enrollDate, drivingSchoolDet.enrollDate) && l.a(this.enrollNo, drivingSchoolDet.enrollNo) && l.a(this.trainFrom, drivingSchoolDet.trainFrom) && l.a(this.trainTo, drivingSchoolDet.trainTo);
    }

    public final String getCertDate() {
        return this.certDate;
    }

    public final String getCertNo() {
        return this.certNo;
    }

    public final List<Covcd> getCovcd() {
        return this.covcd;
    }

    public final List<DsName> getDsName() {
        return this.dsName;
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
        return (((((((((((((this.certDate.hashCode() * 31) + this.certNo.hashCode()) * 31) + this.covcd.hashCode()) * 31) + this.dsName.hashCode()) * 31) + this.enrollDate.hashCode()) * 31) + this.enrollNo.hashCode()) * 31) + this.trainFrom.hashCode()) * 31) + this.trainTo.hashCode();
    }

    public String toString() {
        return "DrivingSchoolDet(certDate=" + this.certDate + ", certNo=" + this.certNo + ", covcd=" + this.covcd + ", dsName=" + this.dsName + ", enrollDate=" + this.enrollDate + ", enrollNo=" + this.enrollNo + ", trainFrom=" + this.trainFrom + ", trainTo=" + this.trainTo + ')';
    }
}
