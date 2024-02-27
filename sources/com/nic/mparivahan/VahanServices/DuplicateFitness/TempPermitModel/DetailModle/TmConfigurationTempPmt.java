package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class TmConfigurationTempPmt implements Serializable {
    private final String allowedVehicleCondition;
    private final String fitLgnChk;
    private final String insLgnChk;
    private final boolean interIntraStateSelection;
    private final int maxDaysTemp;
    private final String maxDaysTempConditionally;
    private final int maxMonthsTemp;
    private final String maxMonthsTempConditionally;
    private final Object maxValidUptoConsider;
    private final int maxWeeksTemp;
    private final String maxWeeksTempConditionally;
    private final int minDaysTemp;
    private final String minDaysTempConditionally;
    private final int minWeeksTemp;
    private final String minWeeksTempConditionally;
    private final String passengerListTemp;
    private final boolean perDayRouteDescTemp;
    private final String permanentPermitValid;
    private final boolean pmtTypeSelectTemp;
    private final String renewTempPmt;
    private final boolean routeRegionListWithinstate;
    private final String skipFitLgnChk;
    private final String skipInsLgnChk;
    private final String skipTaxLgnChk;
    private final String stateCd;
    private final String taxLgnChk;
    private final String tempPeriodMode;
    private final String tempTaxOnRoute;
    private final boolean tempTaxOnRouteLen;

    public TmConfigurationTempPmt(String str, String str2, String str3, boolean z10, int i10, String str4, int i11, String str5, Object obj, int i12, String str6, int i13, String str7, int i14, String str8, String str9, boolean z11, String str10, boolean z12, String str11, boolean z13, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z14) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        Object obj2 = obj;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str15;
        l.f(str19, "allowedVehicleCondition");
        l.f(str20, "fitLgnChk");
        l.f(str21, "insLgnChk");
        l.f(str22, "maxDaysTempConditionally");
        l.f(str23, "maxMonthsTempConditionally");
        l.f(obj2, "maxValidUptoConsider");
        l.f(str24, "maxWeeksTempConditionally");
        l.f(str25, "minDaysTempConditionally");
        l.f(str26, "minWeeksTempConditionally");
        l.f(str27, "passengerListTemp");
        l.f(str28, "permanentPermitValid");
        l.f(str29, "renewTempPmt");
        l.f(str30, "skipFitLgnChk");
        l.f(str31, "skipInsLgnChk");
        l.f(str14, "skipTaxLgnChk");
        l.f(str15, "stateCd");
        l.f(str16, "taxLgnChk");
        l.f(str17, "tempPeriodMode");
        l.f(str18, "tempTaxOnRoute");
        this.allowedVehicleCondition = str19;
        this.fitLgnChk = str20;
        this.insLgnChk = str21;
        this.interIntraStateSelection = z10;
        this.maxDaysTemp = i10;
        this.maxDaysTempConditionally = str22;
        this.maxMonthsTemp = i11;
        this.maxMonthsTempConditionally = str23;
        this.maxValidUptoConsider = obj2;
        this.maxWeeksTemp = i12;
        this.maxWeeksTempConditionally = str24;
        this.minDaysTemp = i13;
        this.minDaysTempConditionally = str25;
        this.minWeeksTemp = i14;
        this.minWeeksTempConditionally = str26;
        this.passengerListTemp = str27;
        this.perDayRouteDescTemp = z11;
        this.permanentPermitValid = str28;
        this.pmtTypeSelectTemp = z12;
        this.renewTempPmt = str29;
        this.routeRegionListWithinstate = z13;
        this.skipFitLgnChk = str30;
        this.skipInsLgnChk = str31;
        this.skipTaxLgnChk = str14;
        this.stateCd = str15;
        this.taxLgnChk = str16;
        this.tempPeriodMode = str17;
        this.tempTaxOnRoute = str18;
        this.tempTaxOnRouteLen = z14;
    }

    public static /* synthetic */ TmConfigurationTempPmt copy$default(TmConfigurationTempPmt tmConfigurationTempPmt, String str, String str2, String str3, boolean z10, int i10, String str4, int i11, String str5, Object obj, int i12, String str6, int i13, String str7, int i14, String str8, String str9, boolean z11, String str10, boolean z12, String str11, boolean z13, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z14, int i15, Object obj2) {
        TmConfigurationTempPmt tmConfigurationTempPmt2 = tmConfigurationTempPmt;
        int i16 = i15;
        return tmConfigurationTempPmt.copy((i16 & 1) != 0 ? tmConfigurationTempPmt2.allowedVehicleCondition : str, (i16 & 2) != 0 ? tmConfigurationTempPmt2.fitLgnChk : str2, (i16 & 4) != 0 ? tmConfigurationTempPmt2.insLgnChk : str3, (i16 & 8) != 0 ? tmConfigurationTempPmt2.interIntraStateSelection : z10, (i16 & 16) != 0 ? tmConfigurationTempPmt2.maxDaysTemp : i10, (i16 & 32) != 0 ? tmConfigurationTempPmt2.maxDaysTempConditionally : str4, (i16 & 64) != 0 ? tmConfigurationTempPmt2.maxMonthsTemp : i11, (i16 & 128) != 0 ? tmConfigurationTempPmt2.maxMonthsTempConditionally : str5, (i16 & 256) != 0 ? tmConfigurationTempPmt2.maxValidUptoConsider : obj, (i16 & 512) != 0 ? tmConfigurationTempPmt2.maxWeeksTemp : i12, (i16 & 1024) != 0 ? tmConfigurationTempPmt2.maxWeeksTempConditionally : str6, (i16 & 2048) != 0 ? tmConfigurationTempPmt2.minDaysTemp : i13, (i16 & 4096) != 0 ? tmConfigurationTempPmt2.minDaysTempConditionally : str7, (i16 & 8192) != 0 ? tmConfigurationTempPmt2.minWeeksTemp : i14, (i16 & 16384) != 0 ? tmConfigurationTempPmt2.minWeeksTempConditionally : str8, (i16 & 32768) != 0 ? tmConfigurationTempPmt2.passengerListTemp : str9, (i16 & 65536) != 0 ? tmConfigurationTempPmt2.perDayRouteDescTemp : z11, (i16 & 131072) != 0 ? tmConfigurationTempPmt2.permanentPermitValid : str10, (i16 & 262144) != 0 ? tmConfigurationTempPmt2.pmtTypeSelectTemp : z12, (i16 & 524288) != 0 ? tmConfigurationTempPmt2.renewTempPmt : str11, (i16 & 1048576) != 0 ? tmConfigurationTempPmt2.routeRegionListWithinstate : z13, (i16 & 2097152) != 0 ? tmConfigurationTempPmt2.skipFitLgnChk : str12, (i16 & 4194304) != 0 ? tmConfigurationTempPmt2.skipInsLgnChk : str13, (i16 & 8388608) != 0 ? tmConfigurationTempPmt2.skipTaxLgnChk : str14, (i16 & 16777216) != 0 ? tmConfigurationTempPmt2.stateCd : str15, (i16 & 33554432) != 0 ? tmConfigurationTempPmt2.taxLgnChk : str16, (i16 & 67108864) != 0 ? tmConfigurationTempPmt2.tempPeriodMode : str17, (i16 & 134217728) != 0 ? tmConfigurationTempPmt2.tempTaxOnRoute : str18, (i16 & 268435456) != 0 ? tmConfigurationTempPmt2.tempTaxOnRouteLen : z14);
    }

    public final String component1() {
        return this.allowedVehicleCondition;
    }

    public final int component10() {
        return this.maxWeeksTemp;
    }

    public final String component11() {
        return this.maxWeeksTempConditionally;
    }

    public final int component12() {
        return this.minDaysTemp;
    }

    public final String component13() {
        return this.minDaysTempConditionally;
    }

    public final int component14() {
        return this.minWeeksTemp;
    }

    public final String component15() {
        return this.minWeeksTempConditionally;
    }

    public final String component16() {
        return this.passengerListTemp;
    }

    public final boolean component17() {
        return this.perDayRouteDescTemp;
    }

    public final String component18() {
        return this.permanentPermitValid;
    }

    public final boolean component19() {
        return this.pmtTypeSelectTemp;
    }

    public final String component2() {
        return this.fitLgnChk;
    }

    public final String component20() {
        return this.renewTempPmt;
    }

    public final boolean component21() {
        return this.routeRegionListWithinstate;
    }

    public final String component22() {
        return this.skipFitLgnChk;
    }

    public final String component23() {
        return this.skipInsLgnChk;
    }

    public final String component24() {
        return this.skipTaxLgnChk;
    }

    public final String component25() {
        return this.stateCd;
    }

    public final String component26() {
        return this.taxLgnChk;
    }

    public final String component27() {
        return this.tempPeriodMode;
    }

    public final String component28() {
        return this.tempTaxOnRoute;
    }

    public final boolean component29() {
        return this.tempTaxOnRouteLen;
    }

    public final String component3() {
        return this.insLgnChk;
    }

    public final boolean component4() {
        return this.interIntraStateSelection;
    }

    public final int component5() {
        return this.maxDaysTemp;
    }

    public final String component6() {
        return this.maxDaysTempConditionally;
    }

    public final int component7() {
        return this.maxMonthsTemp;
    }

    public final String component8() {
        return this.maxMonthsTempConditionally;
    }

    public final Object component9() {
        return this.maxValidUptoConsider;
    }

    public final TmConfigurationTempPmt copy(String str, String str2, String str3, boolean z10, int i10, String str4, int i11, String str5, Object obj, int i12, String str6, int i13, String str7, int i14, String str8, String str9, boolean z11, String str10, boolean z12, String str11, boolean z13, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z14) {
        String str19 = str;
        l.f(str19, "allowedVehicleCondition");
        l.f(str2, "fitLgnChk");
        l.f(str3, "insLgnChk");
        l.f(str4, "maxDaysTempConditionally");
        l.f(str5, "maxMonthsTempConditionally");
        l.f(obj, "maxValidUptoConsider");
        l.f(str6, "maxWeeksTempConditionally");
        l.f(str7, "minDaysTempConditionally");
        l.f(str8, "minWeeksTempConditionally");
        l.f(str9, "passengerListTemp");
        l.f(str10, "permanentPermitValid");
        l.f(str11, "renewTempPmt");
        l.f(str12, "skipFitLgnChk");
        l.f(str13, "skipInsLgnChk");
        l.f(str14, "skipTaxLgnChk");
        l.f(str15, "stateCd");
        l.f(str16, "taxLgnChk");
        l.f(str17, "tempPeriodMode");
        l.f(str18, "tempTaxOnRoute");
        return new TmConfigurationTempPmt(str19, str2, str3, z10, i10, str4, i11, str5, obj, i12, str6, i13, str7, i14, str8, str9, z11, str10, z12, str11, z13, str12, str13, str14, str15, str16, str17, str18, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmConfigurationTempPmt)) {
            return false;
        }
        TmConfigurationTempPmt tmConfigurationTempPmt = (TmConfigurationTempPmt) obj;
        return l.a(this.allowedVehicleCondition, tmConfigurationTempPmt.allowedVehicleCondition) && l.a(this.fitLgnChk, tmConfigurationTempPmt.fitLgnChk) && l.a(this.insLgnChk, tmConfigurationTempPmt.insLgnChk) && this.interIntraStateSelection == tmConfigurationTempPmt.interIntraStateSelection && this.maxDaysTemp == tmConfigurationTempPmt.maxDaysTemp && l.a(this.maxDaysTempConditionally, tmConfigurationTempPmt.maxDaysTempConditionally) && this.maxMonthsTemp == tmConfigurationTempPmt.maxMonthsTemp && l.a(this.maxMonthsTempConditionally, tmConfigurationTempPmt.maxMonthsTempConditionally) && l.a(this.maxValidUptoConsider, tmConfigurationTempPmt.maxValidUptoConsider) && this.maxWeeksTemp == tmConfigurationTempPmt.maxWeeksTemp && l.a(this.maxWeeksTempConditionally, tmConfigurationTempPmt.maxWeeksTempConditionally) && this.minDaysTemp == tmConfigurationTempPmt.minDaysTemp && l.a(this.minDaysTempConditionally, tmConfigurationTempPmt.minDaysTempConditionally) && this.minWeeksTemp == tmConfigurationTempPmt.minWeeksTemp && l.a(this.minWeeksTempConditionally, tmConfigurationTempPmt.minWeeksTempConditionally) && l.a(this.passengerListTemp, tmConfigurationTempPmt.passengerListTemp) && this.perDayRouteDescTemp == tmConfigurationTempPmt.perDayRouteDescTemp && l.a(this.permanentPermitValid, tmConfigurationTempPmt.permanentPermitValid) && this.pmtTypeSelectTemp == tmConfigurationTempPmt.pmtTypeSelectTemp && l.a(this.renewTempPmt, tmConfigurationTempPmt.renewTempPmt) && this.routeRegionListWithinstate == tmConfigurationTempPmt.routeRegionListWithinstate && l.a(this.skipFitLgnChk, tmConfigurationTempPmt.skipFitLgnChk) && l.a(this.skipInsLgnChk, tmConfigurationTempPmt.skipInsLgnChk) && l.a(this.skipTaxLgnChk, tmConfigurationTempPmt.skipTaxLgnChk) && l.a(this.stateCd, tmConfigurationTempPmt.stateCd) && l.a(this.taxLgnChk, tmConfigurationTempPmt.taxLgnChk) && l.a(this.tempPeriodMode, tmConfigurationTempPmt.tempPeriodMode) && l.a(this.tempTaxOnRoute, tmConfigurationTempPmt.tempTaxOnRoute) && this.tempTaxOnRouteLen == tmConfigurationTempPmt.tempTaxOnRouteLen;
    }

    public final String getAllowedVehicleCondition() {
        return this.allowedVehicleCondition;
    }

    public final String getFitLgnChk() {
        return this.fitLgnChk;
    }

    public final String getInsLgnChk() {
        return this.insLgnChk;
    }

    public final boolean getInterIntraStateSelection() {
        return this.interIntraStateSelection;
    }

    public final int getMaxDaysTemp() {
        return this.maxDaysTemp;
    }

    public final String getMaxDaysTempConditionally() {
        return this.maxDaysTempConditionally;
    }

    public final int getMaxMonthsTemp() {
        return this.maxMonthsTemp;
    }

    public final String getMaxMonthsTempConditionally() {
        return this.maxMonthsTempConditionally;
    }

    public final Object getMaxValidUptoConsider() {
        return this.maxValidUptoConsider;
    }

    public final int getMaxWeeksTemp() {
        return this.maxWeeksTemp;
    }

    public final String getMaxWeeksTempConditionally() {
        return this.maxWeeksTempConditionally;
    }

    public final int getMinDaysTemp() {
        return this.minDaysTemp;
    }

    public final String getMinDaysTempConditionally() {
        return this.minDaysTempConditionally;
    }

    public final int getMinWeeksTemp() {
        return this.minWeeksTemp;
    }

    public final String getMinWeeksTempConditionally() {
        return this.minWeeksTempConditionally;
    }

    public final String getPassengerListTemp() {
        return this.passengerListTemp;
    }

    public final boolean getPerDayRouteDescTemp() {
        return this.perDayRouteDescTemp;
    }

    public final String getPermanentPermitValid() {
        return this.permanentPermitValid;
    }

    public final boolean getPmtTypeSelectTemp() {
        return this.pmtTypeSelectTemp;
    }

    public final String getRenewTempPmt() {
        return this.renewTempPmt;
    }

    public final boolean getRouteRegionListWithinstate() {
        return this.routeRegionListWithinstate;
    }

    public final String getSkipFitLgnChk() {
        return this.skipFitLgnChk;
    }

    public final String getSkipInsLgnChk() {
        return this.skipInsLgnChk;
    }

    public final String getSkipTaxLgnChk() {
        return this.skipTaxLgnChk;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTaxLgnChk() {
        return this.taxLgnChk;
    }

    public final String getTempPeriodMode() {
        return this.tempPeriodMode;
    }

    public final String getTempTaxOnRoute() {
        return this.tempTaxOnRoute;
    }

    public final boolean getTempTaxOnRouteLen() {
        return this.tempTaxOnRouteLen;
    }

    public int hashCode() {
        int hashCode = ((((this.allowedVehicleCondition.hashCode() * 31) + this.fitLgnChk.hashCode()) * 31) + this.insLgnChk.hashCode()) * 31;
        boolean z10 = this.interIntraStateSelection;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + Integer.hashCode(this.maxDaysTemp)) * 31) + this.maxDaysTempConditionally.hashCode()) * 31) + Integer.hashCode(this.maxMonthsTemp)) * 31) + this.maxMonthsTempConditionally.hashCode()) * 31) + this.maxValidUptoConsider.hashCode()) * 31) + Integer.hashCode(this.maxWeeksTemp)) * 31) + this.maxWeeksTempConditionally.hashCode()) * 31) + Integer.hashCode(this.minDaysTemp)) * 31) + this.minDaysTempConditionally.hashCode()) * 31) + Integer.hashCode(this.minWeeksTemp)) * 31) + this.minWeeksTempConditionally.hashCode()) * 31) + this.passengerListTemp.hashCode()) * 31;
        boolean z12 = this.perDayRouteDescTemp;
        if (z12) {
            z12 = true;
        }
        int hashCode3 = (((hashCode2 + (z12 ? 1 : 0)) * 31) + this.permanentPermitValid.hashCode()) * 31;
        boolean z13 = this.pmtTypeSelectTemp;
        if (z13) {
            z13 = true;
        }
        int hashCode4 = (((hashCode3 + (z13 ? 1 : 0)) * 31) + this.renewTempPmt.hashCode()) * 31;
        boolean z14 = this.routeRegionListWithinstate;
        if (z14) {
            z14 = true;
        }
        int hashCode5 = (((((((((((((((hashCode4 + (z14 ? 1 : 0)) * 31) + this.skipFitLgnChk.hashCode()) * 31) + this.skipInsLgnChk.hashCode()) * 31) + this.skipTaxLgnChk.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.taxLgnChk.hashCode()) * 31) + this.tempPeriodMode.hashCode()) * 31) + this.tempTaxOnRoute.hashCode()) * 31;
        boolean z15 = this.tempTaxOnRouteLen;
        if (!z15) {
            z11 = z15;
        }
        return hashCode5 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "TmConfigurationTempPmt(allowedVehicleCondition=" + this.allowedVehicleCondition + ", fitLgnChk=" + this.fitLgnChk + ", insLgnChk=" + this.insLgnChk + ", interIntraStateSelection=" + this.interIntraStateSelection + ", maxDaysTemp=" + this.maxDaysTemp + ", maxDaysTempConditionally=" + this.maxDaysTempConditionally + ", maxMonthsTemp=" + this.maxMonthsTemp + ", maxMonthsTempConditionally=" + this.maxMonthsTempConditionally + ", maxValidUptoConsider=" + this.maxValidUptoConsider + ", maxWeeksTemp=" + this.maxWeeksTemp + ", maxWeeksTempConditionally=" + this.maxWeeksTempConditionally + ", minDaysTemp=" + this.minDaysTemp + ", minDaysTempConditionally=" + this.minDaysTempConditionally + ", minWeeksTemp=" + this.minWeeksTemp + ", minWeeksTempConditionally=" + this.minWeeksTempConditionally + ", passengerListTemp=" + this.passengerListTemp + ", perDayRouteDescTemp=" + this.perDayRouteDescTemp + ", permanentPermitValid=" + this.permanentPermitValid + ", pmtTypeSelectTemp=" + this.pmtTypeSelectTemp + ", renewTempPmt=" + this.renewTempPmt + ", routeRegionListWithinstate=" + this.routeRegionListWithinstate + ", skipFitLgnChk=" + this.skipFitLgnChk + ", skipInsLgnChk=" + this.skipInsLgnChk + ", skipTaxLgnChk=" + this.skipTaxLgnChk + ", stateCd=" + this.stateCd + ", taxLgnChk=" + this.taxLgnChk + ", tempPeriodMode=" + this.tempPeriodMode + ", tempTaxOnRoute=" + this.tempTaxOnRoute + ", tempTaxOnRouteLen=" + this.tempTaxOnRouteLen + ')';
    }
}
