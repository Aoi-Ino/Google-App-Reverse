package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class RenPermitdto implements Serializable {
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
    private final int serviceType;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;

    public RenPermitdto(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List<Integer> list, String str12, String str13, String str14, String str15, String str16, int i14, String str17, String str18, String str19) {
        String str20 = str;
        String str21 = str2;
        String str22 = str3;
        String str23 = str4;
        String str24 = str5;
        String str25 = str6;
        String str26 = str7;
        String str27 = str8;
        String str28 = str9;
        String str29 = str10;
        String str30 = str11;
        List<Integer> list2 = list;
        String str31 = str12;
        String str32 = str13;
        String str33 = str15;
        l.f(str20, "applNo");
        l.f(str21, "authDateUpto");
        l.f(str22, "authDatefrom");
        l.f(str23, "authNo");
        l.f(str24, "chassisNo");
        l.f(str25, "goodsToCarry");
        l.f(str26, "ipAddress");
        l.f(str27, "jorneyPurpose");
        l.f(str28, "opDt");
        l.f(str29, "parking1");
        l.f(str30, "pmtNo");
        l.f(list2, "purCd");
        l.f(str31, "rcptNo");
        l.f(str32, "regionCovered");
        l.f(str14, "regnNo");
        l.f(str15, "remarks1");
        l.f(str16, "replaceDate");
        l.f(str17, "stateCd");
        l.f(str18, "validFrom");
        l.f(str19, "validUpto");
        this.applNo = str20;
        this.authDateUpto = str21;
        this.authDatefrom = str22;
        this.authNo = str23;
        this.chassisNo = str24;
        this.domainCd = i10;
        this.goodsToCarry = str25;
        this.ipAddress = str26;
        this.jorneyPurpose = str27;
        this.offCd = i11;
        this.opDt = str28;
        this.parking1 = str29;
        this.pmtCatg = i12;
        this.pmtNo = str30;
        this.pmtType = i13;
        this.purCd = list2;
        this.rcptNo = str31;
        this.regionCovered = str32;
        this.regnNo = str14;
        this.remarks1 = str15;
        this.replaceDate = str16;
        this.serviceType = i14;
        this.stateCd = str17;
        this.validFrom = str18;
        this.validUpto = str19;
    }

    public static /* synthetic */ RenPermitdto copy$default(RenPermitdto renPermitdto, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List list, String str12, String str13, String str14, String str15, String str16, int i14, String str17, String str18, String str19, int i15, Object obj) {
        RenPermitdto renPermitdto2 = renPermitdto;
        int i16 = i15;
        return renPermitdto.copy((i16 & 1) != 0 ? renPermitdto2.applNo : str, (i16 & 2) != 0 ? renPermitdto2.authDateUpto : str2, (i16 & 4) != 0 ? renPermitdto2.authDatefrom : str3, (i16 & 8) != 0 ? renPermitdto2.authNo : str4, (i16 & 16) != 0 ? renPermitdto2.chassisNo : str5, (i16 & 32) != 0 ? renPermitdto2.domainCd : i10, (i16 & 64) != 0 ? renPermitdto2.goodsToCarry : str6, (i16 & 128) != 0 ? renPermitdto2.ipAddress : str7, (i16 & 256) != 0 ? renPermitdto2.jorneyPurpose : str8, (i16 & 512) != 0 ? renPermitdto2.offCd : i11, (i16 & 1024) != 0 ? renPermitdto2.opDt : str9, (i16 & 2048) != 0 ? renPermitdto2.parking1 : str10, (i16 & 4096) != 0 ? renPermitdto2.pmtCatg : i12, (i16 & 8192) != 0 ? renPermitdto2.pmtNo : str11, (i16 & 16384) != 0 ? renPermitdto2.pmtType : i13, (i16 & 32768) != 0 ? renPermitdto2.purCd : list, (i16 & 65536) != 0 ? renPermitdto2.rcptNo : str12, (i16 & 131072) != 0 ? renPermitdto2.regionCovered : str13, (i16 & 262144) != 0 ? renPermitdto2.regnNo : str14, (i16 & 524288) != 0 ? renPermitdto2.remarks1 : str15, (i16 & 1048576) != 0 ? renPermitdto2.replaceDate : str16, (i16 & 2097152) != 0 ? renPermitdto2.serviceType : i14, (i16 & 4194304) != 0 ? renPermitdto2.stateCd : str17, (i16 & 8388608) != 0 ? renPermitdto2.validFrom : str18, (i16 & 16777216) != 0 ? renPermitdto2.validUpto : str19);
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

    public final RenPermitdto copy(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, int i12, String str11, int i13, List<Integer> list, String str12, String str13, String str14, String str15, String str16, int i14, String str17, String str18, String str19) {
        String str20 = str;
        l.f(str20, "applNo");
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
        l.f(str17, "stateCd");
        l.f(str18, "validFrom");
        l.f(str19, "validUpto");
        return new RenPermitdto(str20, str2, str3, str4, str5, i10, str6, str7, str8, i11, str9, str10, i12, str11, i13, list, str12, str13, str14, str15, str16, i14, str17, str18, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenPermitdto)) {
            return false;
        }
        RenPermitdto renPermitdto = (RenPermitdto) obj;
        return l.a(this.applNo, renPermitdto.applNo) && l.a(this.authDateUpto, renPermitdto.authDateUpto) && l.a(this.authDatefrom, renPermitdto.authDatefrom) && l.a(this.authNo, renPermitdto.authNo) && l.a(this.chassisNo, renPermitdto.chassisNo) && this.domainCd == renPermitdto.domainCd && l.a(this.goodsToCarry, renPermitdto.goodsToCarry) && l.a(this.ipAddress, renPermitdto.ipAddress) && l.a(this.jorneyPurpose, renPermitdto.jorneyPurpose) && this.offCd == renPermitdto.offCd && l.a(this.opDt, renPermitdto.opDt) && l.a(this.parking1, renPermitdto.parking1) && this.pmtCatg == renPermitdto.pmtCatg && l.a(this.pmtNo, renPermitdto.pmtNo) && this.pmtType == renPermitdto.pmtType && l.a(this.purCd, renPermitdto.purCd) && l.a(this.rcptNo, renPermitdto.rcptNo) && l.a(this.regionCovered, renPermitdto.regionCovered) && l.a(this.regnNo, renPermitdto.regnNo) && l.a(this.remarks1, renPermitdto.remarks1) && l.a(this.replaceDate, renPermitdto.replaceDate) && this.serviceType == renPermitdto.serviceType && l.a(this.stateCd, renPermitdto.stateCd) && l.a(this.validFrom, renPermitdto.validFrom) && l.a(this.validUpto, renPermitdto.validUpto);
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
        return "RenPermitdto(applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", chassisNo=" + this.chassisNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", ipAddress=" + this.ipAddress + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", replaceDate=" + this.replaceDate + ", serviceType=" + this.serviceType + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
