package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String acFitted;
    private final String applNo;
    private final String audioFitted;
    private final String bodyType;
    private final String chasiNo;
    private final String color;
    private final int cubicCap;
    private final String engNo;
    private final long fitUpto;
    private final int floorArea;
    private final int fuel;
    private final int gcw;
    private final int height;
    private final int horsePower;
    private final int ldWt;
    private final int length;
    private final int noCyl;
    private final int offCd;
    private final long opDt;
    private final String regnNo;
    private final int seatCap;
    private final int sleeperCap;
    private final int standCap;
    private final String stateCd;
    private final int unldWt;
    private final String vchCatg;
    private final int vhClass;
    private final String videoFitted;
    private final int wheelbase;
    private final int width;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, String str8, int i20, int i21, int i22, String str9, int i23, String str10, int i24, String str11, int i25, int i26) {
        this.acFitted = str;
        this.applNo = str2;
        this.audioFitted = str3;
        this.bodyType = str4;
        this.chasiNo = str5;
        this.color = str6;
        this.cubicCap = i10;
        this.engNo = str7;
        this.fitUpto = j10;
        this.floorArea = i11;
        this.fuel = i12;
        this.gcw = i13;
        this.height = i14;
        this.horsePower = i15;
        this.ldWt = i16;
        this.length = i17;
        this.noCyl = i18;
        this.offCd = i19;
        this.opDt = j11;
        this.regnNo = str8;
        this.seatCap = i20;
        this.sleeperCap = i21;
        this.standCap = i22;
        this.stateCd = str9;
        this.unldWt = i23;
        this.vchCatg = str10;
        this.vhClass = i24;
        this.videoFitted = str11;
        this.wheelbase = i25;
        this.width = i26;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, String str8, int i20, int i21, int i22, String str9, int i23, String str10, int i24, String str11, int i25, int i26, int i27, Object obj) {
        Data data2 = data;
        int i28 = i27;
        return data.copy((i28 & 1) != 0 ? data2.acFitted : str, (i28 & 2) != 0 ? data2.applNo : str2, (i28 & 4) != 0 ? data2.audioFitted : str3, (i28 & 8) != 0 ? data2.bodyType : str4, (i28 & 16) != 0 ? data2.chasiNo : str5, (i28 & 32) != 0 ? data2.color : str6, (i28 & 64) != 0 ? data2.cubicCap : i10, (i28 & 128) != 0 ? data2.engNo : str7, (i28 & 256) != 0 ? data2.fitUpto : j10, (i28 & 512) != 0 ? data2.floorArea : i11, (i28 & 1024) != 0 ? data2.fuel : i12, (i28 & 2048) != 0 ? data2.gcw : i13, (i28 & 4096) != 0 ? data2.height : i14, (i28 & 8192) != 0 ? data2.horsePower : i15, (i28 & 16384) != 0 ? data2.ldWt : i16, (i28 & 32768) != 0 ? data2.length : i17, (i28 & 65536) != 0 ? data2.noCyl : i18, (i28 & 131072) != 0 ? data2.offCd : i19, (i28 & 262144) != 0 ? data2.opDt : j11, (i28 & 524288) != 0 ? data2.regnNo : str8, (1048576 & i28) != 0 ? data2.seatCap : i20, (i28 & 2097152) != 0 ? data2.sleeperCap : i21, (i28 & 4194304) != 0 ? data2.standCap : i22, (i28 & 8388608) != 0 ? data2.stateCd : str9, (i28 & 16777216) != 0 ? data2.unldWt : i23, (i28 & 33554432) != 0 ? data2.vchCatg : str10, (i28 & 67108864) != 0 ? data2.vhClass : i24, (i28 & 134217728) != 0 ? data2.videoFitted : str11, (i28 & 268435456) != 0 ? data2.wheelbase : i25, (i28 & 536870912) != 0 ? data2.width : i26);
    }

    public final String component1() {
        return this.acFitted;
    }

    public final int component10() {
        return this.floorArea;
    }

    public final int component11() {
        return this.fuel;
    }

    public final int component12() {
        return this.gcw;
    }

    public final int component13() {
        return this.height;
    }

    public final int component14() {
        return this.horsePower;
    }

    public final int component15() {
        return this.ldWt;
    }

    public final int component16() {
        return this.length;
    }

    public final int component17() {
        return this.noCyl;
    }

    public final int component18() {
        return this.offCd;
    }

    public final long component19() {
        return this.opDt;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component20() {
        return this.regnNo;
    }

    public final int component21() {
        return this.seatCap;
    }

    public final int component22() {
        return this.sleeperCap;
    }

    public final int component23() {
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

    public final int component29() {
        return this.wheelbase;
    }

    public final String component3() {
        return this.audioFitted;
    }

    public final int component30() {
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

    public final int component7() {
        return this.cubicCap;
    }

    public final String component8() {
        return this.engNo;
    }

    public final long component9() {
        return this.fitUpto;
    }

    public final Data copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, String str8, int i20, int i21, int i22, String str9, int i23, String str10, int i24, String str11, int i25, int i26) {
        return new Data(str, str2, str3, str4, str5, str6, i10, str7, j10, i11, i12, i13, i14, i15, i16, i17, i18, i19, j11, str8, i20, i21, i22, str9, i23, str10, i24, str11, i25, i26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.acFitted, data.acFitted) && l.a(this.applNo, data.applNo) && l.a(this.audioFitted, data.audioFitted) && l.a(this.bodyType, data.bodyType) && l.a(this.chasiNo, data.chasiNo) && l.a(this.color, data.color) && this.cubicCap == data.cubicCap && l.a(this.engNo, data.engNo) && this.fitUpto == data.fitUpto && this.floorArea == data.floorArea && this.fuel == data.fuel && this.gcw == data.gcw && this.height == data.height && this.horsePower == data.horsePower && this.ldWt == data.ldWt && this.length == data.length && this.noCyl == data.noCyl && this.offCd == data.offCd && this.opDt == data.opDt && l.a(this.regnNo, data.regnNo) && this.seatCap == data.seatCap && this.sleeperCap == data.sleeperCap && this.standCap == data.standCap && l.a(this.stateCd, data.stateCd) && this.unldWt == data.unldWt && l.a(this.vchCatg, data.vchCatg) && this.vhClass == data.vhClass && l.a(this.videoFitted, data.videoFitted) && this.wheelbase == data.wheelbase && this.width == data.width;
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

    public final int getCubicCap() {
        return this.cubicCap;
    }

    public final String getEngNo() {
        return this.engNo;
    }

    public final long getFitUpto() {
        return this.fitUpto;
    }

    public final int getFloorArea() {
        return this.floorArea;
    }

    public final int getFuel() {
        return this.fuel;
    }

    public final int getGcw() {
        return this.gcw;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHorsePower() {
        return this.horsePower;
    }

    public final int getLdWt() {
        return this.ldWt;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getNoCyl() {
        return this.noCyl;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final long getOpDt() {
        return this.opDt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final int getSeatCap() {
        return this.seatCap;
    }

    public final int getSleeperCap() {
        return this.sleeperCap;
    }

    public final int getStandCap() {
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

    public final int getWheelbase() {
        return this.wheelbase;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.acFitted;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audioFitted;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bodyType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chasiNo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.color;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.cubicCap)) * 31;
        String str7 = this.engNo;
        int hashCode7 = (((((((((((((((((((((((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.fitUpto)) * 31) + Integer.hashCode(this.floorArea)) * 31) + Integer.hashCode(this.fuel)) * 31) + Integer.hashCode(this.gcw)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.horsePower)) * 31) + Integer.hashCode(this.ldWt)) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.noCyl)) * 31) + Integer.hashCode(this.offCd)) * 31) + Long.hashCode(this.opDt)) * 31;
        String str8 = this.regnNo;
        int hashCode8 = (((((((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.seatCap)) * 31) + Integer.hashCode(this.sleeperCap)) * 31) + Integer.hashCode(this.standCap)) * 31;
        String str9 = this.stateCd;
        int hashCode9 = (((hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.unldWt)) * 31;
        String str10 = this.vchCatg;
        int hashCode10 = (((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.vhClass)) * 31;
        String str11 = this.videoFitted;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return ((((hashCode10 + i10) * 31) + Integer.hashCode(this.wheelbase)) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "Data(acFitted=" + this.acFitted + ", applNo=" + this.applNo + ", audioFitted=" + this.audioFitted + ", bodyType=" + this.bodyType + ", chasiNo=" + this.chasiNo + ", color=" + this.color + ", cubicCap=" + this.cubicCap + ", engNo=" + this.engNo + ", fitUpto=" + this.fitUpto + ", floorArea=" + this.floorArea + ", fuel=" + this.fuel + ", gcw=" + this.gcw + ", height=" + this.height + ", horsePower=" + this.horsePower + ", ldWt=" + this.ldWt + ", length=" + this.length + ", noCyl=" + this.noCyl + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", regnNo=" + this.regnNo + ", seatCap=" + this.seatCap + ", sleeperCap=" + this.sleeperCap + ", standCap=" + this.standCap + ", stateCd=" + this.stateCd + ", unldWt=" + this.unldWt + ", vchCatg=" + this.vchCatg + ", vhClass=" + this.vhClass + ", videoFitted=" + this.videoFitted + ", wheelbase=" + this.wheelbase + ", width=" + this.width + ')';
    }
}
