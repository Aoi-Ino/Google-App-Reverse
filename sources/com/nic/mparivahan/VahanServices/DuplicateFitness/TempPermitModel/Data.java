package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle.TmConfigurationTempPmt;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class Data implements Serializable {
    private final String allotmentOffice;
    private final Object goodsType;
    private final ArrayList<String> natureOfGoods;
    private final int period;
    private final ArrayList<String> periodMode;
    private final ArrayList<String> purposeOfJourny;
    private final Object regnNo;
    private final Object stateCode;
    private final TmConfigurationTempPmt tmConfigurationTempPmt;
    private final Object validFrom;
    private final Object validUpto;
    private final ArrayList<String> vmServiceType;

    public Data(String str, Object obj, ArrayList<String> arrayList, int i10, ArrayList<String> arrayList2, ArrayList<String> arrayList3, Object obj2, Object obj3, Object obj4, Object obj5, ArrayList<String> arrayList4, TmConfigurationTempPmt tmConfigurationTempPmt2) {
        l.f(str, "allotmentOffice");
        l.f(obj, "goodsType");
        l.f(obj2, "regnNo");
        l.f(obj3, "stateCode");
        l.f(obj4, "validFrom");
        l.f(obj5, "validUpto");
        this.allotmentOffice = str;
        this.goodsType = obj;
        this.natureOfGoods = arrayList;
        this.period = i10;
        this.periodMode = arrayList2;
        this.purposeOfJourny = arrayList3;
        this.regnNo = obj2;
        this.stateCode = obj3;
        this.validFrom = obj4;
        this.validUpto = obj5;
        this.vmServiceType = arrayList4;
        this.tmConfigurationTempPmt = tmConfigurationTempPmt2;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, Object obj, ArrayList arrayList, int i10, ArrayList arrayList2, ArrayList arrayList3, Object obj2, Object obj3, Object obj4, Object obj5, ArrayList arrayList4, TmConfigurationTempPmt tmConfigurationTempPmt2, int i11, Object obj6) {
        Data data2 = data;
        int i12 = i11;
        return data.copy((i12 & 1) != 0 ? data2.allotmentOffice : str, (i12 & 2) != 0 ? data2.goodsType : obj, (i12 & 4) != 0 ? data2.natureOfGoods : arrayList, (i12 & 8) != 0 ? data2.period : i10, (i12 & 16) != 0 ? data2.periodMode : arrayList2, (i12 & 32) != 0 ? data2.purposeOfJourny : arrayList3, (i12 & 64) != 0 ? data2.regnNo : obj2, (i12 & 128) != 0 ? data2.stateCode : obj3, (i12 & 256) != 0 ? data2.validFrom : obj4, (i12 & 512) != 0 ? data2.validUpto : obj5, (i12 & 1024) != 0 ? data2.vmServiceType : arrayList4, (i12 & 2048) != 0 ? data2.tmConfigurationTempPmt : tmConfigurationTempPmt2);
    }

    public final String component1() {
        return this.allotmentOffice;
    }

    public final Object component10() {
        return this.validUpto;
    }

    public final ArrayList<String> component11() {
        return this.vmServiceType;
    }

    public final TmConfigurationTempPmt component12() {
        return this.tmConfigurationTempPmt;
    }

    public final Object component2() {
        return this.goodsType;
    }

    public final ArrayList<String> component3() {
        return this.natureOfGoods;
    }

    public final int component4() {
        return this.period;
    }

    public final ArrayList<String> component5() {
        return this.periodMode;
    }

    public final ArrayList<String> component6() {
        return this.purposeOfJourny;
    }

    public final Object component7() {
        return this.regnNo;
    }

    public final Object component8() {
        return this.stateCode;
    }

    public final Object component9() {
        return this.validFrom;
    }

    public final Data copy(String str, Object obj, ArrayList<String> arrayList, int i10, ArrayList<String> arrayList2, ArrayList<String> arrayList3, Object obj2, Object obj3, Object obj4, Object obj5, ArrayList<String> arrayList4, TmConfigurationTempPmt tmConfigurationTempPmt2) {
        l.f(str, "allotmentOffice");
        Object obj6 = obj;
        l.f(obj6, "goodsType");
        Object obj7 = obj2;
        l.f(obj7, "regnNo");
        Object obj8 = obj3;
        l.f(obj8, "stateCode");
        Object obj9 = obj4;
        l.f(obj9, "validFrom");
        Object obj10 = obj5;
        l.f(obj10, "validUpto");
        return new Data(str, obj6, arrayList, i10, arrayList2, arrayList3, obj7, obj8, obj9, obj10, arrayList4, tmConfigurationTempPmt2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.goodsType, data.goodsType) && l.a(this.natureOfGoods, data.natureOfGoods) && this.period == data.period && l.a(this.periodMode, data.periodMode) && l.a(this.purposeOfJourny, data.purposeOfJourny) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode) && l.a(this.validFrom, data.validFrom) && l.a(this.validUpto, data.validUpto) && l.a(this.vmServiceType, data.vmServiceType) && l.a(this.tmConfigurationTempPmt, data.tmConfigurationTempPmt);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final Object getGoodsType() {
        return this.goodsType;
    }

    public final ArrayList<String> getNatureOfGoods() {
        return this.natureOfGoods;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final ArrayList<String> getPeriodMode() {
        return this.periodMode;
    }

    public final ArrayList<String> getPurposeOfJourny() {
        return this.purposeOfJourny;
    }

    public final Object getRegnNo() {
        return this.regnNo;
    }

    public final Object getStateCode() {
        return this.stateCode;
    }

    public final TmConfigurationTempPmt getTmConfigurationTempPmt() {
        return this.tmConfigurationTempPmt;
    }

    public final Object getValidFrom() {
        return this.validFrom;
    }

    public final Object getValidUpto() {
        return this.validUpto;
    }

    public final ArrayList<String> getVmServiceType() {
        return this.vmServiceType;
    }

    public int hashCode() {
        int hashCode = ((this.allotmentOffice.hashCode() * 31) + this.goodsType.hashCode()) * 31;
        ArrayList<String> arrayList = this.natureOfGoods;
        int i10 = 0;
        int hashCode2 = (((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Integer.hashCode(this.period)) * 31;
        ArrayList<String> arrayList2 = this.periodMode;
        int hashCode3 = (hashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<String> arrayList3 = this.purposeOfJourny;
        int hashCode4 = (((((((((hashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUpto.hashCode()) * 31;
        ArrayList<String> arrayList4 = this.vmServiceType;
        int hashCode5 = (hashCode4 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        TmConfigurationTempPmt tmConfigurationTempPmt2 = this.tmConfigurationTempPmt;
        if (tmConfigurationTempPmt2 != null) {
            i10 = tmConfigurationTempPmt2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", goodsType=" + this.goodsType + ", natureOfGoods=" + this.natureOfGoods + ", period=" + this.period + ", periodMode=" + this.periodMode + ", purposeOfJourny=" + this.purposeOfJourny + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", validFrom=" + this.validFrom + ", validUpto=" + this.validUpto + ", vmServiceType=" + this.vmServiceType + ", tmConfigurationTempPmt=" + this.tmConfigurationTempPmt + ')';
    }
}
