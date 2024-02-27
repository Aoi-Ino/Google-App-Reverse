package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class SubmitForTempPermit implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final String goodsDetails;
    private final String goodsToCarry;
    private final String goodsType;
    private final String ipAddress;
    private final String issueDt;
    private final Integer offCd;
    private final String others;
    private final int period;
    private final String periodMode;
    private final int purCd;
    private final String purposeOfJourny;
    private final String regnNo;
    private final String routeDescription;
    private final String stateCd;
    private final String travelFrom;
    private final String travelUpto;
    private final ArrayList<VaSplPassengerdto> vaSplPassengerdto;
    private final String validFrom;
    private final String validUpto;

    public SubmitForTempPermit(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, int i10, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList<VaSplPassengerdto> arrayList, String str16, String str17) {
        String str18 = str;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        l.f(str18, "allotmentOffice");
        l.f(str19, "goodsDetails");
        l.f(str20, "goodsToCarry");
        l.f(str21, "goodsType");
        l.f(str22, "ipAddress");
        l.f(str23, "issueDt");
        l.f(str24, "others");
        l.f(str25, "periodMode");
        l.f(str26, "purposeOfJourny");
        l.f(str27, "regnNo");
        l.f(str28, "routeDescription");
        l.f(str29, "stateCd");
        l.f(str30, "travelFrom");
        l.f(str31, "travelUpto");
        l.f(str16, "validFrom");
        String str32 = str17;
        l.f(str32, "validUpto");
        this.allotmentOffice = str18;
        this.applNo = str2;
        this.goodsDetails = str19;
        this.goodsToCarry = str20;
        this.goodsType = str21;
        this.ipAddress = str22;
        this.issueDt = str23;
        this.offCd = num;
        this.others = str24;
        this.period = i10;
        this.periodMode = str25;
        this.purCd = i11;
        this.purposeOfJourny = str26;
        this.regnNo = str27;
        this.routeDescription = str28;
        this.stateCd = str29;
        this.travelFrom = str30;
        this.travelUpto = str31;
        this.vaSplPassengerdto = arrayList;
        this.validFrom = str16;
        this.validUpto = str32;
    }

    public static /* synthetic */ SubmitForTempPermit copy$default(SubmitForTempPermit submitForTempPermit, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, int i10, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList arrayList, String str16, String str17, int i12, Object obj) {
        SubmitForTempPermit submitForTempPermit2 = submitForTempPermit;
        int i13 = i12;
        return submitForTempPermit.copy((i13 & 1) != 0 ? submitForTempPermit2.allotmentOffice : str, (i13 & 2) != 0 ? submitForTempPermit2.applNo : str2, (i13 & 4) != 0 ? submitForTempPermit2.goodsDetails : str3, (i13 & 8) != 0 ? submitForTempPermit2.goodsToCarry : str4, (i13 & 16) != 0 ? submitForTempPermit2.goodsType : str5, (i13 & 32) != 0 ? submitForTempPermit2.ipAddress : str6, (i13 & 64) != 0 ? submitForTempPermit2.issueDt : str7, (i13 & 128) != 0 ? submitForTempPermit2.offCd : num, (i13 & 256) != 0 ? submitForTempPermit2.others : str8, (i13 & 512) != 0 ? submitForTempPermit2.period : i10, (i13 & 1024) != 0 ? submitForTempPermit2.periodMode : str9, (i13 & 2048) != 0 ? submitForTempPermit2.purCd : i11, (i13 & 4096) != 0 ? submitForTempPermit2.purposeOfJourny : str10, (i13 & 8192) != 0 ? submitForTempPermit2.regnNo : str11, (i13 & 16384) != 0 ? submitForTempPermit2.routeDescription : str12, (i13 & 32768) != 0 ? submitForTempPermit2.stateCd : str13, (i13 & 65536) != 0 ? submitForTempPermit2.travelFrom : str14, (i13 & 131072) != 0 ? submitForTempPermit2.travelUpto : str15, (i13 & 262144) != 0 ? submitForTempPermit2.vaSplPassengerdto : arrayList, (i13 & 524288) != 0 ? submitForTempPermit2.validFrom : str16, (i13 & 1048576) != 0 ? submitForTempPermit2.validUpto : str17);
    }

    public final String component1() {
        return this.allotmentOffice;
    }

    public final int component10() {
        return this.period;
    }

    public final String component11() {
        return this.periodMode;
    }

    public final int component12() {
        return this.purCd;
    }

    public final String component13() {
        return this.purposeOfJourny;
    }

    public final String component14() {
        return this.regnNo;
    }

    public final String component15() {
        return this.routeDescription;
    }

    public final String component16() {
        return this.stateCd;
    }

    public final String component17() {
        return this.travelFrom;
    }

    public final String component18() {
        return this.travelUpto;
    }

    public final ArrayList<VaSplPassengerdto> component19() {
        return this.vaSplPassengerdto;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component20() {
        return this.validFrom;
    }

    public final String component21() {
        return this.validUpto;
    }

    public final String component3() {
        return this.goodsDetails;
    }

    public final String component4() {
        return this.goodsToCarry;
    }

    public final String component5() {
        return this.goodsType;
    }

    public final String component6() {
        return this.ipAddress;
    }

    public final String component7() {
        return this.issueDt;
    }

    public final Integer component8() {
        return this.offCd;
    }

    public final String component9() {
        return this.others;
    }

    public final SubmitForTempPermit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, int i10, String str9, int i11, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList<VaSplPassengerdto> arrayList, String str16, String str17) {
        String str18 = str;
        l.f(str18, "allotmentOffice");
        l.f(str3, "goodsDetails");
        l.f(str4, "goodsToCarry");
        l.f(str5, "goodsType");
        l.f(str6, "ipAddress");
        l.f(str7, "issueDt");
        l.f(str8, "others");
        l.f(str9, "periodMode");
        l.f(str10, "purposeOfJourny");
        l.f(str11, "regnNo");
        l.f(str12, "routeDescription");
        l.f(str13, "stateCd");
        l.f(str14, "travelFrom");
        l.f(str15, "travelUpto");
        l.f(str16, "validFrom");
        l.f(str17, "validUpto");
        return new SubmitForTempPermit(str18, str2, str3, str4, str5, str6, str7, num, str8, i10, str9, i11, str10, str11, str12, str13, str14, str15, arrayList, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitForTempPermit)) {
            return false;
        }
        SubmitForTempPermit submitForTempPermit = (SubmitForTempPermit) obj;
        return l.a(this.allotmentOffice, submitForTempPermit.allotmentOffice) && l.a(this.applNo, submitForTempPermit.applNo) && l.a(this.goodsDetails, submitForTempPermit.goodsDetails) && l.a(this.goodsToCarry, submitForTempPermit.goodsToCarry) && l.a(this.goodsType, submitForTempPermit.goodsType) && l.a(this.ipAddress, submitForTempPermit.ipAddress) && l.a(this.issueDt, submitForTempPermit.issueDt) && l.a(this.offCd, submitForTempPermit.offCd) && l.a(this.others, submitForTempPermit.others) && this.period == submitForTempPermit.period && l.a(this.periodMode, submitForTempPermit.periodMode) && this.purCd == submitForTempPermit.purCd && l.a(this.purposeOfJourny, submitForTempPermit.purposeOfJourny) && l.a(this.regnNo, submitForTempPermit.regnNo) && l.a(this.routeDescription, submitForTempPermit.routeDescription) && l.a(this.stateCd, submitForTempPermit.stateCd) && l.a(this.travelFrom, submitForTempPermit.travelFrom) && l.a(this.travelUpto, submitForTempPermit.travelUpto) && l.a(this.vaSplPassengerdto, submitForTempPermit.vaSplPassengerdto) && l.a(this.validFrom, submitForTempPermit.validFrom) && l.a(this.validUpto, submitForTempPermit.validUpto);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getGoodsDetails() {
        return this.goodsDetails;
    }

    public final String getGoodsToCarry() {
        return this.goodsToCarry;
    }

    public final String getGoodsType() {
        return this.goodsType;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getIssueDt() {
        return this.issueDt;
    }

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final String getOthers() {
        return this.others;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final String getPeriodMode() {
        return this.periodMode;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRouteDescription() {
        return this.routeDescription;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTravelFrom() {
        return this.travelFrom;
    }

    public final String getTravelUpto() {
        return this.travelUpto;
    }

    public final ArrayList<VaSplPassengerdto> getVaSplPassengerdto() {
        return this.vaSplPassengerdto;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        int hashCode = this.allotmentOffice.hashCode() * 31;
        String str = this.applNo;
        int i10 = 0;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.goodsDetails.hashCode()) * 31) + this.goodsToCarry.hashCode()) * 31) + this.goodsType.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.issueDt.hashCode()) * 31;
        Integer num = this.offCd;
        int hashCode3 = (((((((((((((((((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.others.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + this.periodMode.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purposeOfJourny.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.routeDescription.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.travelFrom.hashCode()) * 31) + this.travelUpto.hashCode()) * 31;
        ArrayList<VaSplPassengerdto> arrayList = this.vaSplPassengerdto;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return ((((hashCode3 + i10) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "SubmitForTempPermit(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", goodsDetails=" + this.goodsDetails + ", goodsToCarry=" + this.goodsToCarry + ", goodsType=" + this.goodsType + ", ipAddress=" + this.ipAddress + ", issueDt=" + this.issueDt + ", offCd=" + this.offCd + ", others=" + this.others + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purCd=" + this.purCd + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", routeDescription=" + this.routeDescription + ", stateCd=" + this.stateCd + ", travelFrom=" + this.travelFrom + ", travelUpto=" + this.travelUpto + ", vaSplPassengerdto=" + this.vaSplPassengerdto + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
