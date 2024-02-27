package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final Object allotmentOffice;
    private final Object goodsType;
    private final Object natureOfGoods;
    private final Integer period;
    private final Object periodMode;
    private final Object purposeOfJourny;
    private final Object regnNo;
    private final Object stateCode;
    private final Object tmConfigurationTempPmt;
    private final Object validFrom;
    private final String validUpto;
    private final Object vmServiceType;

    public Data(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10) {
        this.allotmentOffice = obj;
        this.goodsType = obj2;
        this.natureOfGoods = obj3;
        this.period = num;
        this.periodMode = obj4;
        this.purposeOfJourny = obj5;
        this.regnNo = obj6;
        this.stateCode = obj7;
        this.tmConfigurationTempPmt = obj8;
        this.validFrom = obj9;
        this.validUpto = str;
        this.vmServiceType = obj10;
    }

    public static /* synthetic */ Data copy$default(Data data, Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10, int i10, Object obj11) {
        Data data2 = data;
        int i11 = i10;
        return data.copy((i11 & 1) != 0 ? data2.allotmentOffice : obj, (i11 & 2) != 0 ? data2.goodsType : obj2, (i11 & 4) != 0 ? data2.natureOfGoods : obj3, (i11 & 8) != 0 ? data2.period : num, (i11 & 16) != 0 ? data2.periodMode : obj4, (i11 & 32) != 0 ? data2.purposeOfJourny : obj5, (i11 & 64) != 0 ? data2.regnNo : obj6, (i11 & 128) != 0 ? data2.stateCode : obj7, (i11 & 256) != 0 ? data2.tmConfigurationTempPmt : obj8, (i11 & 512) != 0 ? data2.validFrom : obj9, (i11 & 1024) != 0 ? data2.validUpto : str, (i11 & 2048) != 0 ? data2.vmServiceType : obj10);
    }

    public final Object component1() {
        return this.allotmentOffice;
    }

    public final Object component10() {
        return this.validFrom;
    }

    public final String component11() {
        return this.validUpto;
    }

    public final Object component12() {
        return this.vmServiceType;
    }

    public final Object component2() {
        return this.goodsType;
    }

    public final Object component3() {
        return this.natureOfGoods;
    }

    public final Integer component4() {
        return this.period;
    }

    public final Object component5() {
        return this.periodMode;
    }

    public final Object component6() {
        return this.purposeOfJourny;
    }

    public final Object component7() {
        return this.regnNo;
    }

    public final Object component8() {
        return this.stateCode;
    }

    public final Object component9() {
        return this.tmConfigurationTempPmt;
    }

    public final Data copy(Object obj, Object obj2, Object obj3, Integer num, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10) {
        return new Data(obj, obj2, obj3, num, obj4, obj5, obj6, obj7, obj8, obj9, str, obj10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.goodsType, data.goodsType) && l.a(this.natureOfGoods, data.natureOfGoods) && l.a(this.period, data.period) && l.a(this.periodMode, data.periodMode) && l.a(this.purposeOfJourny, data.purposeOfJourny) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode) && l.a(this.tmConfigurationTempPmt, data.tmConfigurationTempPmt) && l.a(this.validFrom, data.validFrom) && l.a(this.validUpto, data.validUpto) && l.a(this.vmServiceType, data.vmServiceType);
    }

    public final Object getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final Object getGoodsType() {
        return this.goodsType;
    }

    public final Object getNatureOfGoods() {
        return this.natureOfGoods;
    }

    public final Integer getPeriod() {
        return this.period;
    }

    public final Object getPeriodMode() {
        return this.periodMode;
    }

    public final Object getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final Object getStateCode() {
        return this.stateCode;
    }

    public final Object getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    public final Object getValidFrom() {
        return this.validFrom;
    }

    public final String getValidUpto() {
        return this.validUpto;
    }

    public final Object getVmServiceType() {
        return this.vmServiceType;
    }

    public int hashCode() {
        Object obj = this.allotmentOffice;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.goodsType;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.natureOfGoods;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num = this.period;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj4 = this.periodMode;
        int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.purposeOfJourny;
        int hashCode6 = (hashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.regnNo;
        int hashCode7 = (hashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.stateCode;
        int hashCode8 = (hashCode7 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.tmConfigurationTempPmt;
        int hashCode9 = (hashCode8 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.validFrom;
        int hashCode10 = (hashCode9 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str = this.validUpto;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj10 = this.vmServiceType;
        if (obj10 != null) {
            i10 = obj10.hashCode();
        }
        return hashCode11 + i10;
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", goodsType=" + this.goodsType + ", natureOfGoods=" + this.natureOfGoods + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", tmConfigurationTempPmt=" + this.tmConfigurationTempPmt + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmServiceType=" + this.vmServiceType + ')';
    }
}
