package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.Welcome.testws.VaSplPassengerdto;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class Data implements Serializable {
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
    private final ArrayList<VaSplPassengerdto> vaSplPassengerdto;
    private final String validFrom;
    private final String validUpto;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList<VaSplPassengerdto> arrayList, String str16, String str17) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.goodsDetails = str3;
        this.goodsToCarry = str4;
        this.goodsType = str5;
        this.ipAddress = str6;
        this.issueDt = str7;
        this.offCd = i10;
        this.others = str8;
        this.period = i11;
        this.periodMode = str9;
        this.purCd = i12;
        this.purposeOfJourny = str10;
        this.regnNo = str11;
        this.routeDescription = str12;
        this.stateCd = str13;
        this.travelFrom = str14;
        this.travelUpto = str15;
        this.vaSplPassengerdto = arrayList;
        this.validFrom = str16;
        this.validUpto = str17;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList arrayList, String str16, String str17, int i13, Object obj) {
        Data data2 = data;
        int i14 = i13;
        return data.copy((i14 & 1) != 0 ? data2.allotmentOffice : str, (i14 & 2) != 0 ? data2.applNo : str2, (i14 & 4) != 0 ? data2.goodsDetails : str3, (i14 & 8) != 0 ? data2.goodsToCarry : str4, (i14 & 16) != 0 ? data2.goodsType : str5, (i14 & 32) != 0 ? data2.ipAddress : str6, (i14 & 64) != 0 ? data2.issueDt : str7, (i14 & 128) != 0 ? data2.offCd : i10, (i14 & 256) != 0 ? data2.others : str8, (i14 & 512) != 0 ? data2.period : i11, (i14 & 1024) != 0 ? data2.periodMode : str9, (i14 & 2048) != 0 ? data2.purCd : i12, (i14 & 4096) != 0 ? data2.purposeOfJourny : str10, (i14 & 8192) != 0 ? data2.regnNo : str11, (i14 & 16384) != 0 ? data2.routeDescription : str12, (i14 & 32768) != 0 ? data2.stateCd : str13, (i14 & 65536) != 0 ? data2.travelFrom : str14, (i14 & 131072) != 0 ? data2.travelUpto : str15, (i14 & 262144) != 0 ? data2.vaSplPassengerdto : arrayList, (i14 & 524288) != 0 ? data2.validFrom : str16, (i14 & 1048576) != 0 ? data2.validUpto : str17);
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

    public final int component8() {
        return this.offCd;
    }

    public final String component9() {
        return this.others;
    }

    public final Data copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, String str9, int i12, String str10, String str11, String str12, String str13, String str14, String str15, ArrayList<VaSplPassengerdto> arrayList, String str16, String str17) {
        return new Data(str, str2, str3, str4, str5, str6, str7, i10, str8, i11, str9, i12, str10, str11, str12, str13, str14, str15, arrayList, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.applNo, data.applNo) && l.a(this.goodsDetails, data.goodsDetails) && l.a(this.goodsToCarry, data.goodsToCarry) && l.a(this.goodsType, data.goodsType) && l.a(this.ipAddress, data.ipAddress) && l.a(this.issueDt, data.issueDt) && this.offCd == data.offCd && l.a(this.others, data.others) && this.period == data.period && l.a(this.periodMode, data.periodMode) && this.purCd == data.purCd && l.a(this.purposeOfJourny, data.purposeOfJourny) && l.a(this.regnNo, data.regnNo) && l.a(this.routeDescription, data.routeDescription) && l.a(this.stateCd, data.stateCd) && l.a(this.travelFrom, data.travelFrom) && l.a(this.travelUpto, data.travelUpto) && l.a(this.vaSplPassengerdto, data.vaSplPassengerdto) && l.a(this.validFrom, data.validFrom) && l.a(this.validUpto, data.validUpto);
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
        String str = this.allotmentOffice;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goodsDetails;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.goodsToCarry;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.goodsType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ipAddress;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.issueDt;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.offCd)) * 31;
        String str8 = this.others;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        String str9 = this.periodMode;
        int hashCode9 = (((hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str10 = this.purposeOfJourny;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regnNo;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.routeDescription;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.stateCd;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.travelFrom;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.travelUpto;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        ArrayList<VaSplPassengerdto> arrayList = this.vaSplPassengerdto;
        int hashCode16 = (hashCode15 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str16 = this.validFrom;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validUpto;
        if (str17 != null) {
            i10 = str17.hashCode();
        }
        return hashCode17 + i10;
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", goodsDetails=" + this.goodsDetails + ", goodsToCarry=" + this.goodsToCarry + ", goodsType=" + this.goodsType + ", ipAddress=" + this.ipAddress + ", issueDt=" + this.issueDt + ", offCd=" + this.offCd + ", others=" + this.others + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purCd=" + this.purCd + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", routeDescription=" + this.routeDescription + ", stateCd=" + this.stateCd + ", travelFrom=" + this.travelFrom + ", travelUpto=" + this.travelUpto + ", vaSplPassengerdto=" + this.vaSplPassengerdto + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ')';
    }
}
