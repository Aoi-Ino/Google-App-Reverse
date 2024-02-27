package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DupfitDto implements Serializable {
    private final String appl_no;
    private final String fir_dt;
    private final int fir_no;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final int pur_cd;
    private final String reason;
    private final String regn_no;
    private final String state_cd;

    public DupfitDto(String str, String str2, int i10, int i11, String str3, String str4, int i12, String str5, String str6, String str7) {
        l.f(str, "appl_no");
        l.f(str2, "fir_dt");
        l.f(str3, "op_dt");
        l.f(str4, "police_station");
        l.f(str5, "reason");
        l.f(str6, "regn_no");
        l.f(str7, "state_cd");
        this.appl_no = str;
        this.fir_dt = str2;
        this.fir_no = i10;
        this.off_cd = i11;
        this.op_dt = str3;
        this.police_station = str4;
        this.pur_cd = i12;
        this.reason = str5;
        this.regn_no = str6;
        this.state_cd = str7;
    }

    public static /* synthetic */ DupfitDto copy$default(DupfitDto dupfitDto, String str, String str2, int i10, int i11, String str3, String str4, int i12, String str5, String str6, String str7, int i13, Object obj) {
        DupfitDto dupfitDto2 = dupfitDto;
        int i14 = i13;
        return dupfitDto.copy((i14 & 1) != 0 ? dupfitDto2.appl_no : str, (i14 & 2) != 0 ? dupfitDto2.fir_dt : str2, (i14 & 4) != 0 ? dupfitDto2.fir_no : i10, (i14 & 8) != 0 ? dupfitDto2.off_cd : i11, (i14 & 16) != 0 ? dupfitDto2.op_dt : str3, (i14 & 32) != 0 ? dupfitDto2.police_station : str4, (i14 & 64) != 0 ? dupfitDto2.pur_cd : i12, (i14 & 128) != 0 ? dupfitDto2.reason : str5, (i14 & 256) != 0 ? dupfitDto2.regn_no : str6, (i14 & 512) != 0 ? dupfitDto2.state_cd : str7);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.state_cd;
    }

    public final String component2() {
        return this.fir_dt;
    }

    public final int component3() {
        return this.fir_no;
    }

    public final int component4() {
        return this.off_cd;
    }

    public final String component5() {
        return this.op_dt;
    }

    public final String component6() {
        return this.police_station;
    }

    public final int component7() {
        return this.pur_cd;
    }

    public final String component8() {
        return this.reason;
    }

    public final String component9() {
        return this.regn_no;
    }

    public final DupfitDto copy(String str, String str2, int i10, int i11, String str3, String str4, int i12, String str5, String str6, String str7) {
        l.f(str, "appl_no");
        l.f(str2, "fir_dt");
        String str8 = str3;
        l.f(str8, "op_dt");
        String str9 = str4;
        l.f(str9, "police_station");
        String str10 = str5;
        l.f(str10, "reason");
        String str11 = str6;
        l.f(str11, "regn_no");
        String str12 = str7;
        l.f(str12, "state_cd");
        return new DupfitDto(str, str2, i10, i11, str8, str9, i12, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DupfitDto)) {
            return false;
        }
        DupfitDto dupfitDto = (DupfitDto) obj;
        return l.a(this.appl_no, dupfitDto.appl_no) && l.a(this.fir_dt, dupfitDto.fir_dt) && this.fir_no == dupfitDto.fir_no && this.off_cd == dupfitDto.off_cd && l.a(this.op_dt, dupfitDto.op_dt) && l.a(this.police_station, dupfitDto.police_station) && this.pur_cd == dupfitDto.pur_cd && l.a(this.reason, dupfitDto.reason) && l.a(this.regn_no, dupfitDto.regn_no) && l.a(this.state_cd, dupfitDto.state_cd);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final int getFir_no() {
        return this.fir_no;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((((((((((((((this.appl_no.hashCode() * 31) + this.fir_dt.hashCode()) * 31) + Integer.hashCode(this.fir_no)) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "DupfitDto(appl_no=" + this.appl_no + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", pur_cd=" + this.pur_cd + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
