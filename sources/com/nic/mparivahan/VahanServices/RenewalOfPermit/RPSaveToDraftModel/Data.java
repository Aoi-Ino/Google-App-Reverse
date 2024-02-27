package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final String authDateUpto;
    private final String authDatefrom;
    private final Object authNo;
    private final String chassisNo;
    private final int domainCd;
    private final String goodsToCarry;
    private final String ipAddress;
    private final String jorneyPurpose;
    private final int offCd;
    private final String opDt;
    private final String parking1;
    private final int pmtCatg;
    private final String pmtNo;
    private final int pmtType;
    private final List<Integer> purCd;
    private final Object rcptNo;
    private final String regionCovered;
    private final String regnNo;
    private final String remarks1;
    private final String replaceDate;
    private final int serviceType;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;

    public Data(String str, String str2, String str3, Object obj, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, int i12, String str10, int i13, List<Integer> list, Object obj2, String str11, String str12, String str13, String str14, int i14, String str15, String str16, String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        Object obj3 = obj;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        List<Integer> list2 = list;
        Object obj4 = obj2;
        String str28 = str11;
        String str29 = str13;
        l.f(str18, "applNo");
        l.f(str19, "authDateUpto");
        l.f(str20, "authDatefrom");
        l.f(obj3, "authNo");
        l.f(str21, "chassisNo");
        l.f(str22, "goodsToCarry");
        l.f(str23, "ipAddress");
        l.f(str24, "jorneyPurpose");
        l.f(str25, "opDt");
        l.f(str26, "parking1");
        l.f(str27, "pmtNo");
        l.f(list2, "purCd");
        l.f(obj4, "rcptNo");
        l.f(str28, "regionCovered");
        l.f(str12, "regnNo");
        l.f(str13, "remarks1");
        l.f(str14, "replaceDate");
        l.f(str15, "stateCd");
        l.f(str16, "validFrom");
        l.f(str17, "validUpto");
        this.applNo = str18;
        this.authDateUpto = str19;
        this.authDatefrom = str20;
        this.authNo = obj3;
        this.chassisNo = str21;
        this.domainCd = i10;
        this.goodsToCarry = str22;
        this.ipAddress = str23;
        this.jorneyPurpose = str24;
        this.offCd = i11;
        this.opDt = str25;
        this.parking1 = str26;
        this.pmtCatg = i12;
        this.pmtNo = str27;
        this.pmtType = i13;
        this.purCd = list2;
        this.rcptNo = obj4;
        this.regionCovered = str28;
        this.regnNo = str12;
        this.remarks1 = str13;
        this.replaceDate = str14;
        this.serviceType = i14;
        this.stateCd = str15;
        this.validFrom = str16;
        this.validUpto = str17;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, Object obj, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, int i12, String str10, int i13, List list, Object obj2, String str11, String str12, String str13, String str14, int i14, String str15, String str16, String str17, int i15, Object obj3) {
        Data data2 = data;
        int i16 = i15;
        return data.copy((i16 & 1) != 0 ? data2.applNo : str, (i16 & 2) != 0 ? data2.authDateUpto : str2, (i16 & 4) != 0 ? data2.authDatefrom : str3, (i16 & 8) != 0 ? data2.authNo : obj, (i16 & 16) != 0 ? data2.chassisNo : str4, (i16 & 32) != 0 ? data2.domainCd : i10, (i16 & 64) != 0 ? data2.goodsToCarry : str5, (i16 & 128) != 0 ? data2.ipAddress : str6, (i16 & 256) != 0 ? data2.jorneyPurpose : str7, (i16 & 512) != 0 ? data2.offCd : i11, (i16 & 1024) != 0 ? data2.opDt : str8, (i16 & 2048) != 0 ? data2.parking1 : str9, (i16 & 4096) != 0 ? data2.pmtCatg : i12, (i16 & 8192) != 0 ? data2.pmtNo : str10, (i16 & 16384) != 0 ? data2.pmtType : i13, (i16 & 32768) != 0 ? data2.purCd : list, (i16 & 65536) != 0 ? data2.rcptNo : obj2, (i16 & 131072) != 0 ? data2.regionCovered : str11, (i16 & 262144) != 0 ? data2.regnNo : str12, (i16 & 524288) != 0 ? data2.remarks1 : str13, (i16 & 1048576) != 0 ? data2.replaceDate : str14, (i16 & 2097152) != 0 ? data2.serviceType : i14, (i16 & 4194304) != 0 ? data2.stateCd : str15, (i16 & 8388608) != 0 ? data2.validFrom : str16, (i16 & 16777216) != 0 ? data2.validUpto : str17);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component10() {
        return this.offCd;
    }

    public final String component11() {
        return this.opDt;
    }

    public final String component12() {
        return this.parking1;
    }

    public final int component13() {
        return this.pmtCatg;
    }

    public final String component14() {
        return this.pmtNo;
    }

    public final int component15() {
        return this.pmtType;
    }

    public final List<Integer> component16() {
        return this.purCd;
    }

    public final Object component17() {
        return this.rcptNo;
    }

    public final String component18() {
        return this.regionCovered;
    }

    public final String component19() {
        return this.regnNo;
    }

    public final String component2() {
        return this.authDateUpto;
    }

    public final String component20() {
        return this.remarks1;
    }

    public final String component21() {
        return this.replaceDate;
    }

    public final int component22() {
        return this.serviceType;
    }

    public final String component23() {
        return this.stateCd;
    }

    public final String component24() {
        return this.validFrom;
    }

    public final String component25() {
        return this.validUpto;
    }

    public final String component3() {
        return this.authDatefrom;
    }

    public final Object component4() {
        return this.authNo;
    }

    public final String component5() {
        return this.chassisNo;
    }

    public final int component6() {
        return this.domainCd;
    }

    public final String component7() {
        return this.goodsToCarry;
    }

    public final String component8() {
        return this.ipAddress;
    }

    public final String component9() {
        return this.jorneyPurpose;
    }

    public final Data copy(String str, String str2, String str3, Object obj, String str4, int i10, String str5, String str6, String str7, int i11, String str8, String str9, int i12, String str10, int i13, List<Integer> list, Object obj2, String str11, String str12, String str13, String str14, int i14, String str15, String str16, String str17) {
        String str18 = str;
        l.f(str18, "applNo");
        l.f(str2, "authDateUpto");
        l.f(str3, "authDatefrom");
        l.f(obj, "authNo");
        l.f(str4, "chassisNo");
        l.f(str5, "goodsToCarry");
        l.f(str6, "ipAddress");
        l.f(str7, "jorneyPurpose");
        l.f(str8, "opDt");
        l.f(str9, "parking1");
        l.f(str10, "pmtNo");
        l.f(list, "purCd");
        l.f(obj2, "rcptNo");
        l.f(str11, "regionCovered");
        l.f(str12, "regnNo");
        l.f(str13, "remarks1");
        l.f(str14, "replaceDate");
        l.f(str15, "stateCd");
        l.f(str16, "validFrom");
        l.f(str17, "validUpto");
        return new Data(str18, str2, str3, obj, str4, i10, str5, str6, str7, i11, str8, str9, i12, str10, i13, list, obj2, str11, str12, str13, str14, i14, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.authDateUpto, data.authDateUpto) && l.a(this.authDatefrom, data.authDatefrom) && l.a(this.authNo, data.authNo) && l.a(this.chassisNo, data.chassisNo) && this.domainCd == data.domainCd && l.a(this.goodsToCarry, data.goodsToCarry) && l.a(this.ipAddress, data.ipAddress) && l.a(this.jorneyPurpose, data.jorneyPurpose) && this.offCd == data.offCd && l.a(this.opDt, data.opDt) && l.a(this.parking1, data.parking1) && this.pmtCatg == data.pmtCatg && l.a(this.pmtNo, data.pmtNo) && this.pmtType == data.pmtType && l.a(this.purCd, data.purCd) && l.a(this.rcptNo, data.rcptNo) && l.a(this.regionCovered, data.regionCovered) && l.a(this.regnNo, data.regnNo) && l.a(this.remarks1, data.remarks1) && l.a(this.replaceDate, data.replaceDate) && this.serviceType == data.serviceType && l.a(this.stateCd, data.stateCd) && l.a(this.validFrom, data.validFrom) && l.a(this.validUpto, data.validUpto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthDateUpto() {
        return this.authDateUpto;
    }

    public final String getAuthDatefrom() {
        return this.authDatefrom;
    }

    public final Object getAuthNo() {
        return this.authNo;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final int getDomainCd() {
        return this.domainCd;
    }

    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getJorneyPurpose() {
        return this.jorneyPurpose;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final String getParking1() {
        return this.parking1;
    }

    public final int getPmtCatg() {
        return this.pmtCatg;
    }

    public final String getPmtNo() {
        return this.pmtNo;
    }

    public final int getPmtType() {
        return this.pmtType;
    }

    public final List<Integer> getPurCd() {
        return this.purCd;
    }

    public final Object getRcptNo() {
        return this.rcptNo;
    }

    public final String getRegionCovered() {
        return this.regionCovered;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRemarks1() {
        return this.remarks1;
    }

    public final String getReplaceDate() {
        return this.replaceDate;
    }

    public final int getServiceType() {
        return this.serviceType;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.authDateUpto.hashCode()) * 31) + this.authDatefrom.hashCode()) * 31) + this.authNo.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + Integer.hashCode(this.domainCd)) * 31) + this.goodsToCarry.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.jorneyPurpose.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.parking1.hashCode()) * 31) + Integer.hashCode(this.pmtCatg)) * 31) + this.pmtNo.hashCode()) * 31) + Integer.hashCode(this.pmtType)) * 31) + this.purCd.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.regionCovered.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.remarks1.hashCode()) * 31) + this.replaceDate.hashCode()) * 31) + Integer.hashCode(this.serviceType)) * 31) + this.stateCd.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", chassisNo=" + this.chassisNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", ipAddress=" + this.ipAddress + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", replaceDate=" + this.replaceDate + ", serviceType=" + this.serviceType + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
