package com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DuplicateFitessDraft implements Serializable {
    private final String appl_no;
    private final String fir_dt;
    private final String fir_no;
    private final int off_cd;
    private final String op_dt;
    private final String police_station;
    private final int pur_cd;
    private final String reason;
    private final String regn_no;
    private final String state_cd;

    public DuplicateFitessDraft(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8) {
        l.f(str, "appl_no");
        l.f(str2, "fir_dt");
        l.f(str3, "fir_no");
        l.f(str4, "op_dt");
        l.f(str5, "police_station");
        l.f(str6, "reason");
        l.f(str7, "regn_no");
        l.f(str8, "state_cd");
        this.appl_no = str;
        this.fir_dt = str2;
        this.fir_no = str3;
        this.off_cd = i10;
        this.op_dt = str4;
        this.police_station = str5;
        this.pur_cd = i11;
        this.reason = str6;
        this.regn_no = str7;
        this.state_cd = str8;
    }

    public static /* synthetic */ DuplicateFitessDraft copy$default(DuplicateFitessDraft duplicateFitessDraft, String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8, int i12, Object obj) {
        DuplicateFitessDraft duplicateFitessDraft2 = duplicateFitessDraft;
        int i13 = i12;
        return duplicateFitessDraft.copy((i13 & 1) != 0 ? duplicateFitessDraft2.appl_no : str, (i13 & 2) != 0 ? duplicateFitessDraft2.fir_dt : str2, (i13 & 4) != 0 ? duplicateFitessDraft2.fir_no : str3, (i13 & 8) != 0 ? duplicateFitessDraft2.off_cd : i10, (i13 & 16) != 0 ? duplicateFitessDraft2.op_dt : str4, (i13 & 32) != 0 ? duplicateFitessDraft2.police_station : str5, (i13 & 64) != 0 ? duplicateFitessDraft2.pur_cd : i11, (i13 & 128) != 0 ? duplicateFitessDraft2.reason : str6, (i13 & 256) != 0 ? duplicateFitessDraft2.regn_no : str7, (i13 & 512) != 0 ? duplicateFitessDraft2.state_cd : str8);
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

    public final String component3() {
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

    public final DuplicateFitessDraft copy(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, String str7, String str8) {
        l.f(str, "appl_no");
        l.f(str2, "fir_dt");
        l.f(str3, "fir_no");
        String str9 = str4;
        l.f(str9, "op_dt");
        String str10 = str5;
        l.f(str10, "police_station");
        String str11 = str6;
        l.f(str11, "reason");
        String str12 = str7;
        l.f(str12, "regn_no");
        String str13 = str8;
        l.f(str13, "state_cd");
        return new DuplicateFitessDraft(str, str2, str3, i10, str9, str10, i11, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicateFitessDraft)) {
            return false;
        }
        DuplicateFitessDraft duplicateFitessDraft = (DuplicateFitessDraft) obj;
        return l.a(this.appl_no, duplicateFitessDraft.appl_no) && l.a(this.fir_dt, duplicateFitessDraft.fir_dt) && l.a(this.fir_no, duplicateFitessDraft.fir_no) && this.off_cd == duplicateFitessDraft.off_cd && l.a(this.op_dt, duplicateFitessDraft.op_dt) && l.a(this.police_station, duplicateFitessDraft.police_station) && this.pur_cd == duplicateFitessDraft.pur_cd && l.a(this.reason, duplicateFitessDraft.reason) && l.a(this.regn_no, duplicateFitessDraft.regn_no) && l.a(this.state_cd, duplicateFitessDraft.state_cd);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
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
        return (((((((((((((((((this.appl_no.hashCode() * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "DuplicateFitessDraft(appl_no=" + this.appl_no + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", pur_cd=" + this.pur_cd + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
