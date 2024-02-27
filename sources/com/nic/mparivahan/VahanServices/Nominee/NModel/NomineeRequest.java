package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NomineeRequest {
    private final String applNo;
    private final String nominationDt;
    private final String nomineeName;
    private final int offCd;
    private final String opdt;
    private final int purCd;
    private final String regnNo;
    private final int relation;
    private final String stateCd;

    public NomineeRequest(String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6) {
        l.f(str2, "nominationDt");
        l.f(str3, "nomineeName");
        l.f(str4, "opdt");
        l.f(str5, "regnNo");
        l.f(str6, "stateCd");
        this.applNo = str;
        this.nominationDt = str2;
        this.nomineeName = str3;
        this.offCd = i10;
        this.opdt = str4;
        this.purCd = i11;
        this.regnNo = str5;
        this.relation = i12;
        this.stateCd = str6;
    }

    public static /* synthetic */ NomineeRequest copy$default(NomineeRequest nomineeRequest, String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6, int i13, Object obj) {
        NomineeRequest nomineeRequest2 = nomineeRequest;
        int i14 = i13;
        return nomineeRequest.copy((i14 & 1) != 0 ? nomineeRequest2.applNo : str, (i14 & 2) != 0 ? nomineeRequest2.nominationDt : str2, (i14 & 4) != 0 ? nomineeRequest2.nomineeName : str3, (i14 & 8) != 0 ? nomineeRequest2.offCd : i10, (i14 & 16) != 0 ? nomineeRequest2.opdt : str4, (i14 & 32) != 0 ? nomineeRequest2.purCd : i11, (i14 & 64) != 0 ? nomineeRequest2.regnNo : str5, (i14 & 128) != 0 ? nomineeRequest2.relation : i12, (i14 & 256) != 0 ? nomineeRequest2.stateCd : str6);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.nominationDt;
    }

    public final String component3() {
        return this.nomineeName;
    }

    public final int component4() {
        return this.offCd;
    }

    public final String component5() {
        return this.opdt;
    }

    public final int component6() {
        return this.purCd;
    }

    public final String component7() {
        return this.regnNo;
    }

    public final int component8() {
        return this.relation;
    }

    public final String component9() {
        return this.stateCd;
    }

    public final NomineeRequest copy(String str, String str2, String str3, int i10, String str4, int i11, String str5, int i12, String str6) {
        l.f(str2, "nominationDt");
        l.f(str3, "nomineeName");
        String str7 = str4;
        l.f(str7, "opdt");
        String str8 = str5;
        l.f(str8, "regnNo");
        String str9 = str6;
        l.f(str9, "stateCd");
        return new NomineeRequest(str, str2, str3, i10, str7, i11, str8, i12, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NomineeRequest)) {
            return false;
        }
        NomineeRequest nomineeRequest = (NomineeRequest) obj;
        return l.a(this.applNo, nomineeRequest.applNo) && l.a(this.nominationDt, nomineeRequest.nominationDt) && l.a(this.nomineeName, nomineeRequest.nomineeName) && this.offCd == nomineeRequest.offCd && l.a(this.opdt, nomineeRequest.opdt) && this.purCd == nomineeRequest.purCd && l.a(this.regnNo, nomineeRequest.regnNo) && this.relation == nomineeRequest.relation && l.a(this.stateCd, nomineeRequest.stateCd);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getNominationDt() {
        return this.nominationDt;
    }

    public final String getNomineeName() {
        return this.nomineeName;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpdt() {
        return this.opdt;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final int getRelation() {
        return this.relation;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        String str = this.applNo;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.nominationDt.hashCode()) * 31) + this.nomineeName.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opdt.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.regnNo.hashCode()) * 31) + Integer.hashCode(this.relation)) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "NomineeRequest(applNo=" + this.applNo + ", nominationDt=" + this.nominationDt + ", nomineeName=" + this.nomineeName + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", relation=" + this.relation + ", stateCd=" + this.stateCd + ')';
    }
}
