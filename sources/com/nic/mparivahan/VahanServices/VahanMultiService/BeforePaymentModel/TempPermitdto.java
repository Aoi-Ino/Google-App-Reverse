package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class TempPermitdto implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final String goodsDetails;
    private final String goodsToCarry;
    private final String goodsType;
    private final String ipAddress;
    private final String issueDt;
    private final int offCd;
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
    private final List<VaSplPassengerdto> vaSplPassengerdto;
    private final String validFrom;
    private final String validUpto;

    public TempPermitdto(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, List<VaSplPassengerdto> list, String str16, String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        String str31 = str14;
        List<VaSplPassengerdto> list2 = list;
        l.f(str18, "allotmentOffice");
        l.f(str19, "applNo");
        l.f(str20, "goodsDetails");
        l.f(str21, "goodsToCarry");
        l.f(str22, "goodsType");
        l.f(str23, "ipAddress");
        l.f(str24, "issueDt");
        l.f(str25, "others");
        l.f(str26, "periodMode");
        l.f(str27, "purposeOfJourny");
        l.f(str28, "regnNo");
        l.f(str29, "routeDescription");
        l.f(str30, "stateCd");
        l.f(str31, "travelFrom");
        l.f(str15, "travelUpto");
        l.f(list, "vaSplPassengerdto");
        l.f(str16, "validFrom");
        l.f(str17, "validUpto");
        this.allotmentOffice = str18;
        this.applNo = str19;
        this.goodsDetails = str20;
        this.goodsToCarry = str21;
        this.goodsType = str22;
        this.ipAddress = str23;
        this.issueDt = str24;
        this.offCd = i10;
        this.others = str25;
        this.period = i11;
        this.periodMode = str26;
        this.purCd = i12;
        this.purposeOfJourny = str27;
        this.regnNo = str28;
        this.routeDescription = str29;
        this.stateCd = str30;
        this.travelFrom = str31;
        this.travelUpto = str15;
        this.vaSplPassengerdto = list;
        this.validFrom = str16;
        this.validUpto = str17;
    }

    public static /* synthetic */ TempPermitdto copy$default(TempPermitdto tempPermitdto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, int i13, Object obj) {
        TempPermitdto tempPermitdto2 = tempPermitdto;
        int i14 = i13;
        return tempPermitdto.copy((i14 & 1) != 0 ? tempPermitdto2.allotmentOffice : str, (i14 & 2) != 0 ? tempPermitdto2.applNo : str2, (i14 & 4) != 0 ? tempPermitdto2.goodsDetails : str3, (i14 & 8) != 0 ? tempPermitdto2.goodsToCarry : str4, (i14 & 16) != 0 ? tempPermitdto2.goodsType : str5, (i14 & 32) != 0 ? tempPermitdto2.ipAddress : str6, (i14 & 64) != 0 ? tempPermitdto2.issueDt : str7, (i14 & 128) != 0 ? tempPermitdto2.offCd : i10, (i14 & 256) != 0 ? tempPermitdto2.others : str8, (i14 & 512) != 0 ? tempPermitdto2.period : i11, (i14 & 1024) != 0 ? tempPermitdto2.periodMode : str9, (i14 & 2048) != 0 ? tempPermitdto2.purCd : i12, (i14 & 4096) != 0 ? tempPermitdto2.purposeOfJourny : str10, (i14 & 8192) != 0 ? tempPermitdto2.regnNo : str11, (i14 & 16384) != 0 ? tempPermitdto2.routeDescription : str12, (i14 & 32768) != 0 ? tempPermitdto2.stateCd : str13, (i14 & 65536) != 0 ? tempPermitdto2.travelFrom : str14, (i14 & 131072) != 0 ? tempPermitdto2.travelUpto : str15, (i14 & 262144) != 0 ? tempPermitdto2.vaSplPassengerdto : list, (i14 & 524288) != 0 ? tempPermitdto2.validFrom : str16, (i14 & 1048576) != 0 ? tempPermitdto2.validUpto : str17);
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

    public final List<VaSplPassengerdto> component19() {
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

    public final int component8() {
        return this.offCd;
    }

    public final String component9() {
        return this.others;
    }

    public final TempPermitdto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, List<VaSplPassengerdto> list, String str16, String str17) {
        String str18 = str;
        l.f(str18, "allotmentOffice");
        l.f(str2, "applNo");
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
        l.f(list, "vaSplPassengerdto");
        l.f(str16, "validFrom");
        l.f(str17, "validUpto");
        return new TempPermitdto(str18, str2, str3, str4, str5, str6, str7, i10, str8, i11, str9, i12, str10, str11, str12, str13, str14, str15, list, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TempPermitdto)) {
            return false;
        }
        TempPermitdto tempPermitdto = (TempPermitdto) obj;
        return l.a(this.allotmentOffice, tempPermitdto.allotmentOffice) && l.a(this.applNo, tempPermitdto.applNo) && l.a(this.goodsDetails, tempPermitdto.goodsDetails) && l.a(this.goodsToCarry, tempPermitdto.goodsToCarry) && l.a(this.goodsType, tempPermitdto.goodsType) && l.a(this.ipAddress, tempPermitdto.ipAddress) && l.a(this.issueDt, tempPermitdto.issueDt) && this.offCd == tempPermitdto.offCd && l.a(this.others, tempPermitdto.others) && this.period == tempPermitdto.period && l.a(this.periodMode, tempPermitdto.periodMode) && this.purCd == tempPermitdto.purCd && l.a(this.purposeOfJourny, tempPermitdto.purposeOfJourny) && l.a(this.regnNo, tempPermitdto.regnNo) && l.a(this.routeDescription, tempPermitdto.routeDescription) && l.a(this.stateCd, tempPermitdto.stateCd) && l.a(this.travelFrom, tempPermitdto.travelFrom) && l.a(this.travelUpto, tempPermitdto.travelUpto) && l.a(this.vaSplPassengerdto, tempPermitdto.vaSplPassengerdto) && l.a(this.validFrom, tempPermitdto.validFrom) && l.a(this.validUpto, tempPermitdto.validUpto);
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

    public final int getOffCd() {
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

    public final List<VaSplPassengerdto> getVaSplPassengerdto() {
        return this.vaSplPassengerdto;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.allotmentOffice.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.goodsDetails.hashCode()) * 31) + this.goodsToCarry.hashCode()) * 31) + this.goodsType.hashCode()) * 31) + this.ipAddress.hashCode()) * 31) + this.issueDt.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.others.hashCode()) * 31) + Integer.hashCode(this.period)) * 31) + this.periodMode.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.purposeOfJourny.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.routeDescription.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.travelFrom.hashCode()) * 31) + this.travelUpto.hashCode()) * 31) + this.vaSplPassengerdto.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode();
    }

    public String toString() {
        return "TempPermitdto(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", goodsDetails=" + this.goodsDetails + ", goodsToCarry=" + this.goodsToCarry + ", goodsType=" + this.goodsType + ", ipAddress=" + this.ipAddress + ", issueDt=" + this.issueDt + ", offCd=" + this.offCd + ", others=" + this.others + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purCd=" + this.purCd + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", routeDescription=" + this.routeDescription + ", stateCd=" + this.stateCd + ", travelFrom=" + this.travelFrom + ", travelUpto=" + this.travelUpto + ", vaSplPassengerdto=" + this.vaSplPassengerdto + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
