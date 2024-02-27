package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Data implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final Object authDateUpto;
    private final Object authDatefrom;
    private final Object authNo;
    private final Integer domainCd;
    private final List<String> goodsToCarry;
    private final String jorneyPurpose;
    private final int offCd;
    private final String opDt;
    private final String parking1;
    private final int period;
    private final String periodMode;
    private final String permitCatgDescr;
    private final String permitTypeDescr;
    private final int pmtCatg;
    private final String pmtNo;
    private final int pmtType;
    private final int purCd;
    private final String rcptNo;
    private final String regionCovered;
    private final String regnNo;
    private final String remarks1;
    private final int serviceType;
    private final String serviceTypeDescr;
    private final String stateCd;
    private final String validFrom;
    private final String validUpto;
    private final VmRegionDetailsDto vmRegionDetailsDto;

    public Data(String str, String str2, Object obj, Object obj2, Object obj3, Integer num, List<String> list, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, int i12, String str9, int i13, int i14, String str10, String str11, String str12, String str13, int i15, String str14, String str15, String str16, String str17, VmRegionDetailsDto vmRegionDetailsDto2) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.authDateUpto = obj;
        this.authDatefrom = obj2;
        this.authNo = obj3;
        this.domainCd = num;
        this.goodsToCarry = list;
        this.jorneyPurpose = str3;
        this.offCd = i10;
        this.opDt = str4;
        this.parking1 = str5;
        this.period = i11;
        this.periodMode = str6;
        this.permitCatgDescr = str7;
        this.permitTypeDescr = str8;
        this.pmtCatg = i12;
        this.pmtNo = str9;
        this.pmtType = i13;
        this.purCd = i14;
        this.rcptNo = str10;
        this.regionCovered = str11;
        this.regnNo = str12;
        this.remarks1 = str13;
        this.serviceType = i15;
        this.serviceTypeDescr = str14;
        this.stateCd = str15;
        this.validFrom = str16;
        this.validUpto = str17;
        this.vmRegionDetailsDto = vmRegionDetailsDto2;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, Object obj, Object obj2, Object obj3, Integer num, List list, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, int i12, String str9, int i13, int i14, String str10, String str11, String str12, String str13, int i15, String str14, String str15, String str16, String str17, VmRegionDetailsDto vmRegionDetailsDto2, int i16, Object obj4) {
        Data data2 = data;
        int i17 = i16;
        return data.copy((i17 & 1) != 0 ? data2.allotmentOffice : str, (i17 & 2) != 0 ? data2.applNo : str2, (i17 & 4) != 0 ? data2.authDateUpto : obj, (i17 & 8) != 0 ? data2.authDatefrom : obj2, (i17 & 16) != 0 ? data2.authNo : obj3, (i17 & 32) != 0 ? data2.domainCd : num, (i17 & 64) != 0 ? data2.goodsToCarry : list, (i17 & 128) != 0 ? data2.jorneyPurpose : str3, (i17 & 256) != 0 ? data2.offCd : i10, (i17 & 512) != 0 ? data2.opDt : str4, (i17 & 1024) != 0 ? data2.parking1 : str5, (i17 & 2048) != 0 ? data2.period : i11, (i17 & 4096) != 0 ? data2.periodMode : str6, (i17 & 8192) != 0 ? data2.permitCatgDescr : str7, (i17 & 16384) != 0 ? data2.permitTypeDescr : str8, (i17 & 32768) != 0 ? data2.pmtCatg : i12, (i17 & 65536) != 0 ? data2.pmtNo : str9, (i17 & 131072) != 0 ? data2.pmtType : i13, (i17 & 262144) != 0 ? data2.purCd : i14, (i17 & 524288) != 0 ? data2.rcptNo : str10, (i17 & 1048576) != 0 ? data2.regionCovered : str11, (i17 & 2097152) != 0 ? data2.regnNo : str12, (i17 & 4194304) != 0 ? data2.remarks1 : str13, (i17 & 8388608) != 0 ? data2.serviceType : i15, (i17 & 16777216) != 0 ? data2.serviceTypeDescr : str14, (i17 & 33554432) != 0 ? data2.stateCd : str15, (i17 & 67108864) != 0 ? data2.validFrom : str16, (i17 & 134217728) != 0 ? data2.validUpto : str17, (i17 & 268435456) != 0 ? data2.vmRegionDetailsDto : vmRegionDetailsDto2);
    }

    public final String component1() {
        return this.allotmentOffice;
    }

    public final String component10() {
        return this.opDt;
    }

    public final String component11() {
        return this.parking1;
    }

    public final int component12() {
        return this.period;
    }

    public final String component13() {
        return this.periodMode;
    }

    public final String component14() {
        return this.permitCatgDescr;
    }

    public final String component15() {
        return this.permitTypeDescr;
    }

    public final int component16() {
        return this.pmtCatg;
    }

    public final String component17() {
        return this.pmtNo;
    }

    public final int component18() {
        return this.pmtType;
    }

    public final int component19() {
        return this.purCd;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component20() {
        return this.rcptNo;
    }

    public final String component21() {
        return this.regionCovered;
    }

    public final String component22() {
        return this.regnNo;
    }

    public final String component23() {
        return this.remarks1;
    }

    public final int component24() {
        return this.serviceType;
    }

    public final String component25() {
        return this.serviceTypeDescr;
    }

    public final String component26() {
        return this.stateCd;
    }

    public final String component27() {
        return this.validFrom;
    }

    public final String component28() {
        return this.validUpto;
    }

    public final VmRegionDetailsDto component29() {
        return this.vmRegionDetailsDto;
    }

    public final Object component3() {
        return this.authDateUpto;
    }

    public final Object component4() {
        return this.authDatefrom;
    }

    public final Object component5() {
        return this.authNo;
    }

    public final Integer component6() {
        return this.domainCd;
    }

    public final List<String> component7() {
        return this.goodsToCarry;
    }

    public final String component8() {
        return this.jorneyPurpose;
    }

    public final int component9() {
        return this.offCd;
    }

    public final Data copy(String str, String str2, Object obj, Object obj2, Object obj3, Integer num, List<String> list, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, int i12, String str9, int i13, int i14, String str10, String str11, String str12, String str13, int i15, String str14, String str15, String str16, String str17, VmRegionDetailsDto vmRegionDetailsDto2) {
        return new Data(str, str2, obj, obj2, obj3, num, list, str3, i10, str4, str5, i11, str6, str7, str8, i12, str9, i13, i14, str10, str11, str12, str13, i15, str14, str15, str16, str17, vmRegionDetailsDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.applNo, data.applNo) && l.a(this.authDateUpto, data.authDateUpto) && l.a(this.authDatefrom, data.authDatefrom) && l.a(this.authNo, data.authNo) && l.a(this.domainCd, data.domainCd) && l.a(this.goodsToCarry, data.goodsToCarry) && l.a(this.jorneyPurpose, data.jorneyPurpose) && this.offCd == data.offCd && l.a(this.opDt, data.opDt) && l.a(this.parking1, data.parking1) && this.period == data.period && l.a(this.periodMode, data.periodMode) && l.a(this.permitCatgDescr, data.permitCatgDescr) && l.a(this.permitTypeDescr, data.permitTypeDescr) && this.pmtCatg == data.pmtCatg && l.a(this.pmtNo, data.pmtNo) && this.pmtType == data.pmtType && this.purCd == data.purCd && l.a(this.rcptNo, data.rcptNo) && l.a(this.regionCovered, data.regionCovered) && l.a(this.regnNo, data.regnNo) && l.a(this.remarks1, data.remarks1) && this.serviceType == data.serviceType && l.a(this.serviceTypeDescr, data.serviceTypeDescr) && l.a(this.stateCd, data.stateCd) && l.a(this.validFrom, data.validFrom) && l.a(this.validUpto, data.validUpto) && l.a(this.vmRegionDetailsDto, data.vmRegionDetailsDto);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Object getAuthDateUpto() {
        return this.authDateUpto;
    }

    public final Object getAuthDatefrom() {
        return this.authDatefrom;
    }

    public final Object getAuthNo() {
        return this.authNo;
    }

    public final Integer getDomainCd() {
        return this.domainCd;
    }

    public final List<String> getGoodsToCarry() {
        return this.goodsToCarry;
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

    public final int getPeriod() {
        return this.period;
    }

    public final String getPeriodMode() {
        return this.periodMode;
    }

    public final String getPermitCatgDescr() {
        return this.permitCatgDescr;
    }

    public final String getPermitTypeDescr() {
        return this.permitTypeDescr;
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

    public final int getPurCd() {
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

    public final int getServiceType() {
        return this.serviceType;
    }

    public final String getServiceTypeDescr() {
        return this.serviceTypeDescr;
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

    public final VmRegionDetailsDto getVmRegionDetailsDto() {
        return this.vmRegionDetailsDto;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.authDateUpto;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.authDatefrom;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.authNo;
        int hashCode5 = (hashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.domainCd;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.goodsToCarry;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.jorneyPurpose;
        int hashCode8 = (((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str4 = this.opDt;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parking1;
        int hashCode10 = (((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        String str6 = this.periodMode;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.permitCatgDescr;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.permitTypeDescr;
        int hashCode13 = (((hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.pmtCatg)) * 31;
        String str9 = this.pmtNo;
        int hashCode14 = (((((hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.pmtType)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str10 = this.rcptNo;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regionCovered;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.regnNo;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.remarks1;
        int hashCode18 = (((hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.serviceType)) * 31;
        String str14 = this.serviceTypeDescr;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.stateCd;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.validFrom;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validUpto;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        VmRegionDetailsDto vmRegionDetailsDto2 = this.vmRegionDetailsDto;
        if (vmRegionDetailsDto2 != null) {
            i10 = vmRegionDetailsDto2.hashCode();
        }
        return hashCode22 + i10;
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authDateUpto=" + this.authDateUpto + ", authDatefrom=" + this.authDatefrom + ", authNo=" + this.authNo + ", domainCd=" + this.domainCd + ", goodsToCarry=" + this.goodsToCarry + ", jorneyPurpose=" + this.jorneyPurpose + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", parking1=" + this.parking1 + ", period=" + this.period + ", periodMode=" + this.periodMode + ", permitCatgDescr=" + this.permitCatgDescr + ", permitTypeDescr=" + this.permitTypeDescr + ", pmtCatg=" + this.pmtCatg + ", pmtNo=" + this.pmtNo + ", pmtType=" + this.pmtType + ", purCd=" + this.purCd + ", rcptNo=" + this.rcptNo + ", regionCovered=" + this.regionCovered + ", regnNo=" + this.regnNo + ", remarks1=" + this.remarks1 + ", serviceType=" + this.serviceType + ", serviceTypeDescr=" + this.serviceTypeDescr + ", stateCd=" + this.stateCd + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmRegionDetailsDto=" + this.vmRegionDetailsDto + ')';
    }
}
