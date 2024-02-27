package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class RPSaveToDraftModel {
    private final String applNo;
    private final String authDateUpto;
    private final String authDatefrom;
    private final String authNo;
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
    private final String rcptNo;
    private final String regionCovered;
    private final String regnNo;
    private final String remarks1;
    private final String replaceDate;
    private final String serviceType;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;

    public RPSaveToDraftModel(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List<Integer> list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        List<Integer> list2 = list;
        String str32 = str12;
        String str33 = str13;
        String str34 = str15;
        l.f(str21, "applNo");
        l.f(str22, "authDateUpto");
        l.f(str23, "authDatefrom");
        l.f(str24, "authNo");
        l.f(str25, "chassisNo");
        l.f(str26, "goodsToCarry");
        l.f(str27, "ipAddress");
        l.f(str28, "jorneyPurpose");
        l.f(str29, "opDt");
        l.f(str30, "parking1");
        l.f(str31, "pmtNo");
        l.f(list2, "purCd");
        l.f(str32, "rcptNo");
        l.f(str33, "regionCovered");
        l.f(str14, "regnNo");
        l.f(str15, "remarks1");
        l.f(str16, "replaceDate");
        l.f(str17, "serviceType");
        l.f(str18, "stateCd");
        l.f(str19, "validFrom");
        l.f(str20, "validUpto");
        this.applNo = str21;
        this.authDateUpto = str22;
        this.authDatefrom = str23;
        this.authNo = str24;
        this.chassisNo = str25;
        this.domainCd = i10;
        this.goodsToCarry = str26;
        this.ipAddress = str27;
        this.jorneyPurpose = str28;
        this.offCd = i11;
        this.opDt = str29;
        this.parking1 = str30;
        this.pmtCatg = i12;
        this.pmtNo = str31;
        this.pmtType = i13;
        this.purCd = list2;
        this.rcptNo = str32;
        this.regionCovered = str33;
        this.regnNo = str14;
        this.remarks1 = str15;
        this.replaceDate = str16;
        this.serviceType = str17;
        this.stateCd = str18;
        this.validFrom = str19;
        this.validUpto = str20;
    }

    public static /* synthetic */ RPSaveToDraftModel copy$default(RPSaveToDraftModel rPSaveToDraftModel, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i14, Object obj) {
        RPSaveToDraftModel rPSaveToDraftModel2 = rPSaveToDraftModel;
        int i15 = i14;
        return rPSaveToDraftModel.copy((i15 & 1) != 0 ? rPSaveToDraftModel2.applNo : str, (i15 & 2) != 0 ? rPSaveToDraftModel2.authDateUpto : str2, (i15 & 4) != 0 ? rPSaveToDraftModel2.authDatefrom : str3, (i15 & 8) != 0 ? rPSaveToDraftModel2.authNo : str4, (i15 & 16) != 0 ? rPSaveToDraftModel2.chassisNo : str5, (i15 & 32) != 0 ? rPSaveToDraftModel2.domainCd : i10, (i15 & 64) != 0 ? rPSaveToDraftModel2.goodsToCarry : str6, (i15 & 128) != 0 ? rPSaveToDraftModel2.ipAddress : str7, (i15 & 256) != 0 ? rPSaveToDraftModel2.jorneyPurpose : str8, (i15 & 512) != 0 ? rPSaveToDraftModel2.offCd : i11, (i15 & 1024) != 0 ? rPSaveToDraftModel2.opDt : str9, (i15 & 2048) != 0 ? rPSaveToDraftModel2.parking1 : str10, (i15 & 4096) != 0 ? rPSaveToDraftModel2.pmtCatg : i12, (i15 & 8192) != 0 ? rPSaveToDraftModel2.pmtNo : str11, (i15 & 16384) != 0 ? rPSaveToDraftModel2.pmtType : i13, (i15 & 32768) != 0 ? rPSaveToDraftModel2.purCd : list, (i15 & 65536) != 0 ? rPSaveToDraftModel2.rcptNo : str12, (i15 & 131072) != 0 ? rPSaveToDraftModel2.regionCovered : str13, (i15 & 262144) != 0 ? rPSaveToDraftModel2.regnNo : str14, (i15 & 524288) != 0 ? rPSaveToDraftModel2.remarks1 : str15, (i15 & 1048576) != 0 ? rPSaveToDraftModel2.replaceDate : str16, (i15 & 2097152) != 0 ? rPSaveToDraftModel2.serviceType : str17, (i15 & 4194304) != 0 ? rPSaveToDraftModel2.stateCd : str18, (i15 & 8388608) != 0 ? rPSaveToDraftModel2.validFrom : str19, (i15 & 16777216) != 0 ? rPSaveToDraftModel2.validUpto : str20);
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

    public final String component17() {
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

    public final String component22() {
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

    public final String component4() {
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

    public final RPSaveToDraftModel copy(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List<Integer> list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        l.f(str21, "applNo");
        l.f(str2, "authDateUpto");
        l.f(str3, "authDatefrom");
        l.f(str4, "authNo");
        l.f(str5, "chassisNo");
        l.f(str6, "goodsToCarry");
        l.f(str7, "ipAddress");
        l.f(str8, "jorneyPurpose");
        l.f(str9, "opDt");
        l.f(str10, "parking1");
        l.f(str11, "pmtNo");
        l.f(list, "purCd");
        l.f(str12, "rcptNo");
        l.f(str13, "regionCovered");
        l.f(str14, "regnNo");
        l.f(str15, "remarks1");
        l.f(str16, "replaceDate");
        l.f(str17, "serviceType");
        l.f(str18, "stateCd");
        l.f(str19, "validFrom");
        l.f(str20, "validUpto");
        return new RPSaveToDraftModel(str21, str2, str3, str4, str5, i10, str6, str7, str8, i11, str9, str10, i12, str11, i13, list, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RPSaveToDraftModel)) {
            return false;
        }
        RPSaveToDraftModel rPSaveToDraftModel = (RPSaveToDraftModel) obj;
        return l.a(this.applNo, rPSaveToDraftModel.applNo) && l.a(this.authDateUpto, rPSaveToDraftModel.authDateUpto) && l.a(this.authDatefrom, rPSaveToDraftModel.authDatefrom) && l.a(this.authNo, rPSaveToDraftModel.authNo) && l.a(this.chassisNo, rPSaveToDraftModel.chassisNo) && this.domainCd == rPSaveToDraftModel.domainCd && l.a(this.goodsToCarry, rPSaveToDraftModel.goodsToCarry) && l.a(this.ipAddress, rPSaveToDraftModel.ipAddress) && l.a(this.jorneyPurpose, rPSaveToDraftModel.jorneyPurpose) && this.offCd == rPSaveToDraftModel.offCd && l.a(this.opDt, rPSaveToDraftModel.opDt) && l.a(this.parking1, rPSaveToDraftModel.parking1) && this.pmtCatg == rPSaveToDraftModel.pmtCatg && l.a(this.pmtNo, rPSaveToDraftModel.pmtNo) && this.pmtType == rPSaveToDraftModel.pmtType && l.a(this.purCd, rPSaveToDraftModel.purCd) && l.a(this.rcptNo, rPSaveToDraftModel.rcptNo) && l.a(this.regionCovered, rPSaveToDraftModel.regionCovered) && l.a(this.regnNo, rPSaveToDraftModel.regnNo) && l.a(this.remarks1, rPSaveToDraftModel.remarks1) && l.a(this.replaceDate, rPSaveToDraftModel.replaceDate) && l.a(this.serviceType, rPSaveToDraftModel.serviceType) && l.a(this.stateCd, rPSaveToDraftModel.stateCd) && l.a(this.validFrom, rPSaveToDraftModel.validFrom) && l.a(this.validUpto, rPSaveToDraftModel.validUpto);
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

    public final String getAuthNo() {
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

    public final String getRcptNo() {
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

    public final String getServiceType() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.authDateUpto.hashCode()) * 31) + this.authDatefrom.hashCode()) * 31) + this.authNo.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + Integer.hashCode(this.domainCd)) * 31) + this.goodsToCarry.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.jorneyPurpose.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.parking1.hashCode()) * 31) + Integer.hashCode(this.pmtCatg)) * 31) + this.pmtNo.hashCode()) * 31) + Integer.hashCode(this.pmtType)) * 31) + this.purCd.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.regionCovered.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.remarks1.hashCode()) * 31) + this.replaceDate.hashCode()) * 31) + this.serviceType.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "RPSaveToDraftModel(applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", chassisNo=" + this.chassisNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", ipAddress=" + this.ipAddress + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", replaceDate=" + this.replaceDate + ", serviceType=" + this.serviceType + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
