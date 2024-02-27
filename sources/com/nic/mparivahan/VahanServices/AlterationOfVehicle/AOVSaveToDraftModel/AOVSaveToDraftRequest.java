package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AOVSaveToDraftRequest {
    private final String acFitted;
    private final String applNo;
    private final String audioFitted;
    private final String bodyType;
    private final String chasiNo;
    private final String color;
    private final double cubicCap;
    private final String engNo;
    private final String fitUpto;
    private final double floorArea;
    private final double fuel;
    private final double gcw;
    private final double height;
    private final double horsePower;
    private final double ldWt;
    private final double length;
    private final double noCyl;
    private final int offCd;
    private final String opDt;
    private final String regnNo;
    private final double seatCap;
    private final double sleeperCap;
    private final double standCap;
    private final String stateCd;
    private final int unldWt;
    private final String vchCatg;
    private final int vhClass;
    private final String videoFitted;
    private final double wheelbase;
    private final double width;

    public AOVSaveToDraftRequest(String str, String str2, String str3, String str4, String str5, String str6, double d10, String str7, String str8, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, int i10, String str9, String str10, double d19, double d20, double d21, String str11, int i11, String str12, int i12, String str13, double d22, double d23) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        l.f(str14, "acFitted");
        l.f(str15, "applNo");
        l.f(str16, "audioFitted");
        l.f(str17, "bodyType");
        l.f(str18, "chasiNo");
        l.f(str19, "color");
        l.f(str20, "engNo");
        l.f(str21, "fitUpto");
        l.f(str22, "opDt");
        l.f(str23, "regnNo");
        l.f(str24, "stateCd");
        l.f(str25, "vchCatg");
        l.f(str26, "videoFitted");
        this.acFitted = str14;
        this.applNo = str15;
        this.audioFitted = str16;
        this.bodyType = str17;
        this.chasiNo = str18;
        this.color = str19;
        this.cubicCap = d10;
        this.engNo = str20;
        this.fitUpto = str21;
        this.floorArea = d11;
        this.fuel = d12;
        this.gcw = d13;
        this.height = d14;
        this.horsePower = d15;
        this.ldWt = d16;
        this.length = d17;
        this.noCyl = d18;
        this.offCd = i10;
        this.opDt = str22;
        this.regnNo = str23;
        this.seatCap = d19;
        this.sleeperCap = d20;
        this.standCap = d21;
        this.stateCd = str24;
        this.unldWt = i11;
        this.vchCatg = str25;
        this.vhClass = i12;
        this.videoFitted = str26;
        this.wheelbase = d22;
        this.width = d23;
    }

    public static /* synthetic */ AOVSaveToDraftRequest copy$default(AOVSaveToDraftRequest aOVSaveToDraftRequest, String str, String str2, String str3, String str4, String str5, String str6, double d10, String str7, String str8, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, int i10, String str9, String str10, double d19, double d20, double d21, String str11, int i11, String str12, int i12, String str13, double d22, double d23, int i13, Object obj) {
        AOVSaveToDraftRequest aOVSaveToDraftRequest2 = aOVSaveToDraftRequest;
        int i14 = i13;
        String str14 = (i14 & 1) != 0 ? aOVSaveToDraftRequest2.acFitted : str;
        String str15 = (i14 & 2) != 0 ? aOVSaveToDraftRequest2.applNo : str2;
        String str16 = (i14 & 4) != 0 ? aOVSaveToDraftRequest2.audioFitted : str3;
        String str17 = (i14 & 8) != 0 ? aOVSaveToDraftRequest2.bodyType : str4;
        String str18 = (i14 & 16) != 0 ? aOVSaveToDraftRequest2.chasiNo : str5;
        String str19 = (i14 & 32) != 0 ? aOVSaveToDraftRequest2.color : str6;
        double d24 = (i14 & 64) != 0 ? aOVSaveToDraftRequest2.cubicCap : d10;
        String str20 = (i14 & 128) != 0 ? aOVSaveToDraftRequest2.engNo : str7;
        String str21 = (i14 & 256) != 0 ? aOVSaveToDraftRequest2.fitUpto : str8;
        double d25 = (i14 & 512) != 0 ? aOVSaveToDraftRequest2.floorArea : d11;
        double d26 = (i14 & 1024) != 0 ? aOVSaveToDraftRequest2.fuel : d12;
        double d27 = (i14 & 2048) != 0 ? aOVSaveToDraftRequest2.gcw : d13;
        double d28 = (i14 & 4096) != 0 ? aOVSaveToDraftRequest2.height : d14;
        double d29 = (i14 & 8192) != 0 ? aOVSaveToDraftRequest2.horsePower : d15;
        double d30 = (i14 & 16384) != 0 ? aOVSaveToDraftRequest2.ldWt : d16;
        double d31 = (i14 & 32768) != 0 ? aOVSaveToDraftRequest2.length : d17;
        double d32 = (i14 & 65536) != 0 ? aOVSaveToDraftRequest2.noCyl : d18;
        int i15 = (i14 & 131072) != 0 ? aOVSaveToDraftRequest2.offCd : i10;
        return aOVSaveToDraftRequest.copy(str14, str15, str16, str17, str18, str19, d24, str20, str21, d25, d26, d27, d28, d29, d30, d31, d32, i15, (262144 & i14) != 0 ? aOVSaveToDraftRequest2.opDt : str9, (i14 & 524288) != 0 ? aOVSaveToDraftRequest2.regnNo : str10, (i14 & 1048576) != 0 ? aOVSaveToDraftRequest2.seatCap : d19, (i14 & 2097152) != 0 ? aOVSaveToDraftRequest2.sleeperCap : d20, (i14 & 4194304) != 0 ? aOVSaveToDraftRequest2.standCap : d21, (i14 & 8388608) != 0 ? aOVSaveToDraftRequest2.stateCd : str11, (16777216 & i14) != 0 ? aOVSaveToDraftRequest2.unldWt : i11, (i14 & 33554432) != 0 ? aOVSaveToDraftRequest2.vchCatg : str12, (i14 & 67108864) != 0 ? aOVSaveToDraftRequest2.vhClass : i12, (i14 & 134217728) != 0 ? aOVSaveToDraftRequest2.videoFitted : str13, (i14 & 268435456) != 0 ? aOVSaveToDraftRequest2.wheelbase : d22, (i14 & 536870912) != 0 ? aOVSaveToDraftRequest2.width : d23);
    }

    public final String component1() {
        return this.acFitted;
    }

    public final double component10() {
        return this.floorArea;
    }

    public final double component11() {
        return this.fuel;
    }

    public final double component12() {
        return this.gcw;
    }

    public final double component13() {
        return this.height;
    }

    public final double component14() {
        return this.horsePower;
    }

    public final double component15() {
        return this.ldWt;
    }

    public final double component16() {
        return this.length;
    }

    public final double component17() {
        return this.noCyl;
    }

    public final int component18() {
        return this.offCd;
    }

    public final String component19() {
        return this.opDt;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component20() {
        return this.regnNo;
    }

    public final double component21() {
        return this.seatCap;
    }

    public final double component22() {
        return this.sleeperCap;
    }

    public final double component23() {
        return this.standCap;
    }

    public final String component24() {
        return this.stateCd;
    }

    public final int component25() {
        return this.unldWt;
    }

    public final String component26() {
        return this.vchCatg;
    }

    public final int component27() {
        return this.vhClass;
    }

    public final String component28() {
        return this.videoFitted;
    }

    public final double component29() {
        return this.wheelbase;
    }

    public final String component3() {
        return this.audioFitted;
    }

    public final double component30() {
        return this.width;
    }

    public final String component4() {
        return this.bodyType;
    }

    public final String component5() {
        return this.chasiNo;
    }

    public final String component6() {
        return this.color;
    }

    public final double component7() {
        return this.cubicCap;
    }

    public final String component8() {
        return this.engNo;
    }

    public final String component9() {
        return this.fitUpto;
    }

    public final AOVSaveToDraftRequest copy(String str, String str2, String str3, String str4, String str5, String str6, double d10, String str7, String str8, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, int i10, String str9, String str10, double d19, double d20, double d21, String str11, int i11, String str12, int i12, String str13, double d22, double d23) {
        String str14 = str;
        l.f(str14, "acFitted");
        l.f(str2, "applNo");
        l.f(str3, "audioFitted");
        l.f(str4, "bodyType");
        l.f(str5, "chasiNo");
        l.f(str6, "color");
        l.f(str7, "engNo");
        l.f(str8, "fitUpto");
        l.f(str9, "opDt");
        l.f(str10, "regnNo");
        l.f(str11, "stateCd");
        l.f(str12, "vchCatg");
        l.f(str13, "videoFitted");
        return new AOVSaveToDraftRequest(str14, str2, str3, str4, str5, str6, d10, str7, str8, d11, d12, d13, d14, d15, d16, d17, d18, i10, str9, str10, d19, d20, d21, str11, i11, str12, i12, str13, d22, d23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AOVSaveToDraftRequest)) {
            return false;
        }
        AOVSaveToDraftRequest aOVSaveToDraftRequest = (AOVSaveToDraftRequest) obj;
        return l.a(this.acFitted, aOVSaveToDraftRequest.acFitted) && l.a(this.applNo, aOVSaveToDraftRequest.applNo) && l.a(this.audioFitted, aOVSaveToDraftRequest.audioFitted) && l.a(this.bodyType, aOVSaveToDraftRequest.bodyType) && l.a(this.chasiNo, aOVSaveToDraftRequest.chasiNo) && l.a(this.color, aOVSaveToDraftRequest.color) && Double.compare(this.cubicCap, aOVSaveToDraftRequest.cubicCap) == 0 && l.a(this.engNo, aOVSaveToDraftRequest.engNo) && l.a(this.fitUpto, aOVSaveToDraftRequest.fitUpto) && Double.compare(this.floorArea, aOVSaveToDraftRequest.floorArea) == 0 && Double.compare(this.fuel, aOVSaveToDraftRequest.fuel) == 0 && Double.compare(this.gcw, aOVSaveToDraftRequest.gcw) == 0 && Double.compare(this.height, aOVSaveToDraftRequest.height) == 0 && Double.compare(this.horsePower, aOVSaveToDraftRequest.horsePower) == 0 && Double.compare(this.ldWt, aOVSaveToDraftRequest.ldWt) == 0 && Double.compare(this.length, aOVSaveToDraftRequest.length) == 0 && Double.compare(this.noCyl, aOVSaveToDraftRequest.noCyl) == 0 && this.offCd == aOVSaveToDraftRequest.offCd && l.a(this.opDt, aOVSaveToDraftRequest.opDt) && l.a(this.regnNo, aOVSaveToDraftRequest.regnNo) && Double.compare(this.seatCap, aOVSaveToDraftRequest.seatCap) == 0 && Double.compare(this.sleeperCap, aOVSaveToDraftRequest.sleeperCap) == 0 && Double.compare(this.standCap, aOVSaveToDraftRequest.standCap) == 0 && l.a(this.stateCd, aOVSaveToDraftRequest.stateCd) && this.unldWt == aOVSaveToDraftRequest.unldWt && l.a(this.vchCatg, aOVSaveToDraftRequest.vchCatg) && this.vhClass == aOVSaveToDraftRequest.vhClass && l.a(this.videoFitted, aOVSaveToDraftRequest.videoFitted) && Double.compare(this.wheelbase, aOVSaveToDraftRequest.wheelbase) == 0 && Double.compare(this.width, aOVSaveToDraftRequest.width) == 0;
    }

    public final String getAcFitted() {
        return this.acFitted;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAudioFitted() {
        return this.audioFitted;
    }

    public final String getBodyType() {
        return this.bodyType;
    }

    public final String getChasiNo() {
        return this.chasiNo;
    }

    public final String getColor() {
        return this.color;
    }

    public final double getCubicCap() {
        return this.cubicCap;
    }

    public final String getEngNo() {
        return this.engNo;
    }

    public final String getFitUpto() {
        return this.fitUpto;
    }

    public final double getFloorArea() {
        return this.floorArea;
    }

    public final double getFuel() {
        return this.fuel;
    }

    public final double getGcw() {
        return this.gcw;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getHorsePower() {
        return this.horsePower;
    }

    public final double getLdWt() {
        return this.ldWt;
    }

    public final double getLength() {
        return this.length;
    }

    public final double getNoCyl() {
        return this.noCyl;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final double getSeatCap() {
        return this.seatCap;
    }

    public final double getSleeperCap() {
        return this.sleeperCap;
    }

    public final double getStandCap() {
        return this.standCap;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final int getUnldWt() {
        return this.unldWt;
    }

    public final String getVchCatg() {
        return this.vchCatg;
    }

    public final int getVhClass() {
        return this.vhClass;
    }

    public final String getVideoFitted() {
        return this.videoFitted;
    }

    public final double getWheelbase() {
        return this.wheelbase;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.acFitted.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.audioFitted.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.chasiNo.hashCode()) * 31) + this.color.hashCode()) * 31) + Double.hashCode(this.cubicCap)) * 31) + this.engNo.hashCode()) * 31) + this.fitUpto.hashCode()) * 31) + Double.hashCode(this.floorArea)) * 31) + Double.hashCode(this.fuel)) * 31) + Double.hashCode(this.gcw)) * 31) + Double.hashCode(this.height)) * 31) + Double.hashCode(this.horsePower)) * 31) + Double.hashCode(this.ldWt)) * 31) + Double.hashCode(this.length)) * 31) + Double.hashCode(this.noCyl)) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Double.hashCode(this.seatCap)) * 31) + Double.hashCode(this.sleeperCap)) * 31) + Double.hashCode(this.standCap)) * 31) + this.stateCd.hashCode()) * 31) + Integer.hashCode(this.unldWt)) * 31) + this.vchCatg.hashCode()) * 31) + Integer.hashCode(this.vhClass)) * 31) + this.videoFitted.hashCode()) * 31) + Double.hashCode(this.wheelbase)) * 31) + Double.hashCode(this.width);
    }

    public String toString() {
        return "AOVSaveToDraftRequest(acFitted=" + this.acFitted + ", applNo=" + this.applNo + ", audioFitted=" + this.audioFitted + ", bodyType=" + this.bodyType + ", chasiNo=" + this.chasiNo + ", color=" + this.color + ", cubicCap=" + this.cubicCap + ", engNo=" + this.engNo + ", fitUpto=" + this.fitUpto + ", floorArea=" + this.floorArea + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", height=" + this.height + ", horsePower=" + this.horsePower + ", ldWt=" + this.ldWt + ", length=" + this.length + ", noCyl=" + this.noCyl + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", regnNo=" + this.regnNo + ", seatCap=" + this.seatCap + ", sleeperCap=" + this.sleeperCap + ", standCap=" + this.standCap + ", stateCd=" + this.stateCd + ", unldWt=" + this.unldWt + ", vchCatg=" + this.vchCatg + ", vhClass=" + this.vhClass + ", videoFitted=" + this.videoFitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
