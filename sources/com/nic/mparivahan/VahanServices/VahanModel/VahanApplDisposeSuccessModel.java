package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class VahanApplDisposeSuccessModel {
    private final String chasi_no;
    private final String developerMessage;
    private final String eng_no;
    private final String mobile_no;
    private final String off_cd;
    private final String owner_name;
    private final String regn_no;
    private final String state_cd;
    private final String state_name;

    public VahanApplDisposeSuccessModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "state_cd");
        l.f(str2, "off_cd");
        l.f(str4, "mobile_no");
        l.f(str5, "chasi_no");
        l.f(str6, "eng_no");
        l.f(str7, "state_name");
        l.f(str8, "owner_name");
        l.f(str9, "developerMessage");
        this.state_cd = str;
        this.off_cd = str2;
        this.regn_no = str3;
        this.mobile_no = str4;
        this.chasi_no = str5;
        this.eng_no = str6;
        this.state_name = str7;
        this.owner_name = str8;
        this.developerMessage = str9;
    }

    public static /* synthetic */ VahanApplDisposeSuccessModel copy$default(VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel2 = vahanApplDisposeSuccessModel;
        int i11 = i10;
        return vahanApplDisposeSuccessModel.copy((i11 & 1) != 0 ? vahanApplDisposeSuccessModel2.state_cd : str, (i11 & 2) != 0 ? vahanApplDisposeSuccessModel2.off_cd : str2, (i11 & 4) != 0 ? vahanApplDisposeSuccessModel2.regn_no : str3, (i11 & 8) != 0 ? vahanApplDisposeSuccessModel2.mobile_no : str4, (i11 & 16) != 0 ? vahanApplDisposeSuccessModel2.chasi_no : str5, (i11 & 32) != 0 ? vahanApplDisposeSuccessModel2.eng_no : str6, (i11 & 64) != 0 ? vahanApplDisposeSuccessModel2.state_name : str7, (i11 & 128) != 0 ? vahanApplDisposeSuccessModel2.owner_name : str8, (i11 & 256) != 0 ? vahanApplDisposeSuccessModel2.developerMessage : str9);
    }

    public final String component1() {
        return this.state_cd;
    }

    public final String component2() {
        return this.off_cd;
    }

    public final String component3() {
        return this.regn_no;
    }

    public final String component4() {
        return this.mobile_no;
    }

    public final String component5() {
        return this.chasi_no;
    }

    public final String component6() {
        return this.eng_no;
    }

    public final String component7() {
        return this.state_name;
    }

    public final String component8() {
        return this.owner_name;
    }

    public final String component9() {
        return this.developerMessage;
    }

    public final VahanApplDisposeSuccessModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        l.f(str, "state_cd");
        l.f(str2, "off_cd");
        l.f(str4, "mobile_no");
        String str10 = str5;
        l.f(str10, "chasi_no");
        String str11 = str6;
        l.f(str11, "eng_no");
        String str12 = str7;
        l.f(str12, "state_name");
        String str13 = str8;
        l.f(str13, "owner_name");
        String str14 = str9;
        l.f(str14, "developerMessage");
        return new VahanApplDisposeSuccessModel(str, str2, str3, str4, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VahanApplDisposeSuccessModel)) {
            return false;
        }
        VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel = (VahanApplDisposeSuccessModel) obj;
        return l.a(this.state_cd, vahanApplDisposeSuccessModel.state_cd) && l.a(this.off_cd, vahanApplDisposeSuccessModel.off_cd) && l.a(this.regn_no, vahanApplDisposeSuccessModel.regn_no) && l.a(this.mobile_no, vahanApplDisposeSuccessModel.mobile_no) && l.a(this.chasi_no, vahanApplDisposeSuccessModel.chasi_no) && l.a(this.eng_no, vahanApplDisposeSuccessModel.eng_no) && l.a(this.state_name, vahanApplDisposeSuccessModel.state_name) && l.a(this.owner_name, vahanApplDisposeSuccessModel.owner_name) && l.a(this.developerMessage, vahanApplDisposeSuccessModel.developerMessage);
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getEng_no() {
        return this.eng_no;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public int hashCode() {
        int hashCode = ((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31;
        String str = this.regn_no;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mobile_no.hashCode()) * 31) + this.chasi_no.hashCode()) * 31) + this.eng_no.hashCode()) * 31) + this.state_name.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.developerMessage.hashCode();
    }

    public String toString() {
        return "VahanApplDisposeSuccessModel(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", mobile_no=" + this.mobile_no + ", chasi_no=" + this.chasi_no + ", eng_no=" + this.eng_no + ", state_name=" + this.state_name + ", owner_name=" + this.owner_name + ", developerMessage=" + this.developerMessage + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VahanApplDisposeSuccessModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, g gVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i10 & 256) != 0 ? "" : str9);
    }
}
