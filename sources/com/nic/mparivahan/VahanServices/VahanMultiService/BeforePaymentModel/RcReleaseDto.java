package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RcReleaseDto implements Serializable {
    private final String applNo;
    private final int offCd;
    private final int purCd;
    private final String regnNo;
    private final String relApprovedBy;
    private final String relFileRefNo;
    private final String relOpDt;
    private final String releaseDt;
    private final String stateCd;

    public RcReleaseDto(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "applNo");
        l.f(str2, "regnNo");
        l.f(str3, "relApprovedBy");
        l.f(str4, "relFileRefNo");
        l.f(str5, "relOpDt");
        l.f(str6, "releaseDt");
        l.f(str7, "stateCd");
        this.applNo = str;
        this.offCd = i10;
        this.purCd = i11;
        this.regnNo = str2;
        this.relApprovedBy = str3;
        this.relFileRefNo = str4;
        this.relOpDt = str5;
        this.releaseDt = str6;
        this.stateCd = str7;
    }

    public static /* synthetic */ RcReleaseDto copy$default(RcReleaseDto rcReleaseDto, String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, int i12, Object obj) {
        RcReleaseDto rcReleaseDto2 = rcReleaseDto;
        int i13 = i12;
        return rcReleaseDto.copy((i13 & 1) != 0 ? rcReleaseDto2.applNo : str, (i13 & 2) != 0 ? rcReleaseDto2.offCd : i10, (i13 & 4) != 0 ? rcReleaseDto2.purCd : i11, (i13 & 8) != 0 ? rcReleaseDto2.regnNo : str2, (i13 & 16) != 0 ? rcReleaseDto2.relApprovedBy : str3, (i13 & 32) != 0 ? rcReleaseDto2.relFileRefNo : str4, (i13 & 64) != 0 ? rcReleaseDto2.relOpDt : str5, (i13 & 128) != 0 ? rcReleaseDto2.releaseDt : str6, (i13 & 256) != 0 ? rcReleaseDto2.stateCd : str7);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component2() {
        return this.offCd;
    }

    public final int component3() {
        return this.purCd;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final String component5() {
        return this.relApprovedBy;
    }

    public final String component6() {
        return this.relFileRefNo;
    }

    public final String component7() {
        return this.relOpDt;
    }

    public final String component8() {
        return this.releaseDt;
    }

    public final String component9() {
        return this.stateCd;
    }

    public final RcReleaseDto copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(str, "applNo");
        l.f(str2, "regnNo");
        String str8 = str3;
        l.f(str8, "relApprovedBy");
        String str9 = str4;
        l.f(str9, "relFileRefNo");
        String str10 = str5;
        l.f(str10, "relOpDt");
        String str11 = str6;
        l.f(str11, "releaseDt");
        String str12 = str7;
        l.f(str12, "stateCd");
        return new RcReleaseDto(str, i10, i11, str2, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcReleaseDto)) {
            return false;
        }
        RcReleaseDto rcReleaseDto = (RcReleaseDto) obj;
        return l.a(this.applNo, rcReleaseDto.applNo) && this.offCd == rcReleaseDto.offCd && this.purCd == rcReleaseDto.purCd && l.a(this.regnNo, rcReleaseDto.regnNo) && l.a(this.relApprovedBy, rcReleaseDto.relApprovedBy) && l.a(this.relFileRefNo, rcReleaseDto.relFileRefNo) && l.a(this.relOpDt, rcReleaseDto.relOpDt) && l.a(this.releaseDt, rcReleaseDto.releaseDt) && l.a(this.stateCd, rcReleaseDto.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    public final String getRelOpDt() {
        return this.relOpDt;
    }

    public final String getReleaseDt() {
        return this.releaseDt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return (((((((((((((((this.applNo.hashCode() * 31) + Integer.hashCode(this.offCd)) * 31) + Integer.hashCode(this.purCd)) * 31) + this.regnNo.hashCode()) * 31) + this.relApprovedBy.hashCode()) * 31) + this.relFileRefNo.hashCode()) * 31) + this.relOpDt.hashCode()) * 31) + this.releaseDt.hashCode()) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "RcReleaseDto(applNo=" + this.applNo + ", offCd=" + this.offCd + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", relApprovedBy=" + this.relApprovedBy + ", relFileRefNo=" + this.relFileRefNo + ", relOpDt=" + this.relOpDt + ", releaseDt=" + this.releaseDt + ", stateCd=" + this.stateCd + ')';
    }
}
