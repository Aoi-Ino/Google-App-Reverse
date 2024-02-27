package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class AddNomineeDto implements Serializable {
    private final String applNo;
    private final String nominationDt;
    private final String nomineeName;
    private final int offCd;
    private final String opdt;
    private final String regnNo;
    private final int relation;
    private final String stateCd;

    public AddNomineeDto(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6) {
        l.f(str, "applNo");
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
        this.regnNo = str5;
        this.relation = i11;
        this.stateCd = str6;
    }

    public static /* synthetic */ AddNomineeDto copy$default(AddNomineeDto addNomineeDto, String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6, int i12, Object obj) {
        AddNomineeDto addNomineeDto2 = addNomineeDto;
        int i13 = i12;
        return addNomineeDto.copy((i13 & 1) != 0 ? addNomineeDto2.applNo : str, (i13 & 2) != 0 ? addNomineeDto2.nominationDt : str2, (i13 & 4) != 0 ? addNomineeDto2.nomineeName : str3, (i13 & 8) != 0 ? addNomineeDto2.offCd : i10, (i13 & 16) != 0 ? addNomineeDto2.opdt : str4, (i13 & 32) != 0 ? addNomineeDto2.regnNo : str5, (i13 & 64) != 0 ? addNomineeDto2.relation : i11, (i13 & 128) != 0 ? addNomineeDto2.stateCd : str6);
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

    public final String component6() {
        return this.regnNo;
    }

    public final int component7() {
        return this.relation;
    }

    public final String component8() {
        return this.stateCd;
    }

    public final AddNomineeDto copy(String str, String str2, String str3, int i10, String str4, String str5, int i11, String str6) {
        l.f(str, "applNo");
        l.f(str2, "nominationDt");
        l.f(str3, "nomineeName");
        l.f(str4, "opdt");
        String str7 = str5;
        l.f(str7, "regnNo");
        String str8 = str6;
        l.f(str8, "stateCd");
        return new AddNomineeDto(str, str2, str3, i10, str4, str7, i11, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddNomineeDto)) {
            return false;
        }
        AddNomineeDto addNomineeDto = (AddNomineeDto) obj;
        return l.a(this.applNo, addNomineeDto.applNo) && l.a(this.nominationDt, addNomineeDto.nominationDt) && l.a(this.nomineeName, addNomineeDto.nomineeName) && this.offCd == addNomineeDto.offCd && l.a(this.opdt, addNomineeDto.opdt) && l.a(this.regnNo, addNomineeDto.regnNo) && this.relation == addNomineeDto.relation && l.a(this.stateCd, addNomineeDto.stateCd);
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
        return (((((((((((((this.applNo.hashCode() * 31) + this.nominationDt.hashCode()) * 31) + this.nomineeName.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opdt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Integer.hashCode(this.relation)) * 31) + this.stateCd.hashCode();
    }

    public String toString() {
        return "AddNomineeDto(applNo=" + this.applNo + ", nominationDt=" + this.nominationDt + ", nomineeName=" + this.nomineeName + ", offCd=" + this.offCd + ", opdt=" + this.opdt + ", regnNo=" + this.regnNo + ", relation=" + this.relation + ", stateCd=" + this.stateCd + ')';
    }
}
