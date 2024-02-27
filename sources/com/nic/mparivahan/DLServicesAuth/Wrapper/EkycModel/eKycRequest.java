package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class eKycRequest {
    private final String aadharNo;
    private final String aadharType;
    private final String chasiNo;
    private final String eKYC;
    private final String ipaddress;
    private final String mobileNo;
    private final String otp;
    private final boolean otpGenerated;
    private final List<String> purCd;
    private final String regNo;
    private final String stateCd;
    private final String txNo;
    private final String userId;
    private final String vid;

    public eKycRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, List<String> list, String str8, String str9, String str10, String str11, String str12) {
        l.f(str, "aadharNo");
        l.f(str2, "aadharType");
        l.f(str3, "chasiNo");
        l.f(str4, "eKYC");
        l.f(str5, "ipaddress");
        l.f(str6, "mobileNo");
        l.f(str7, "otp");
        l.f(list, "purCd");
        l.f(str8, "regNo");
        l.f(str9, "stateCd");
        l.f(str10, "txNo");
        l.f(str11, "userId");
        l.f(str12, "vid");
        this.aadharNo = str;
        this.aadharType = str2;
        this.chasiNo = str3;
        this.eKYC = str4;
        this.ipaddress = str5;
        this.mobileNo = str6;
        this.otp = str7;
        this.otpGenerated = z10;
        this.purCd = list;
        this.regNo = str8;
        this.stateCd = str9;
        this.txNo = str10;
        this.userId = str11;
        this.vid = str12;
    }

    public static /* synthetic */ eKycRequest copy$default(eKycRequest ekycrequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, List list, String str8, String str9, String str10, String str11, String str12, int i10, Object obj) {
        eKycRequest ekycrequest2 = ekycrequest;
        int i11 = i10;
        return ekycrequest.copy((i11 & 1) != 0 ? ekycrequest2.aadharNo : str, (i11 & 2) != 0 ? ekycrequest2.aadharType : str2, (i11 & 4) != 0 ? ekycrequest2.chasiNo : str3, (i11 & 8) != 0 ? ekycrequest2.eKYC : str4, (i11 & 16) != 0 ? ekycrequest2.ipaddress : str5, (i11 & 32) != 0 ? ekycrequest2.mobileNo : str6, (i11 & 64) != 0 ? ekycrequest2.otp : str7, (i11 & 128) != 0 ? ekycrequest2.otpGenerated : z10, (i11 & 256) != 0 ? ekycrequest2.purCd : list, (i11 & 512) != 0 ? ekycrequest2.regNo : str8, (i11 & 1024) != 0 ? ekycrequest2.stateCd : str9, (i11 & 2048) != 0 ? ekycrequest2.txNo : str10, (i11 & 4096) != 0 ? ekycrequest2.userId : str11, (i11 & 8192) != 0 ? ekycrequest2.vid : str12);
    }

    public final String component1() {
        return this.aadharNo;
    }

    public final String component10() {
        return this.regNo;
    }

    public final String component11() {
        return this.stateCd;
    }

    public final String component12() {
        return this.txNo;
    }

    public final String component13() {
        return this.userId;
    }

    public final String component14() {
        return this.vid;
    }

    public final String component2() {
        return this.aadharType;
    }

    public final String component3() {
        return this.chasiNo;
    }

    public final String component4() {
        return this.eKYC;
    }

    public final String component5() {
        return this.ipaddress;
    }

    public final String component6() {
        return this.mobileNo;
    }

    public final String component7() {
        return this.otp;
    }

    public final boolean component8() {
        return this.otpGenerated;
    }

    public final List<String> component9() {
        return this.purCd;
    }

    public final eKycRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, List<String> list, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str;
        l.f(str13, "aadharNo");
        String str14 = str2;
        l.f(str14, "aadharType");
        String str15 = str3;
        l.f(str15, "chasiNo");
        String str16 = str4;
        l.f(str16, "eKYC");
        String str17 = str5;
        l.f(str17, "ipaddress");
        String str18 = str6;
        l.f(str18, "mobileNo");
        String str19 = str7;
        l.f(str19, "otp");
        List<String> list2 = list;
        l.f(list2, "purCd");
        String str20 = str8;
        l.f(str20, "regNo");
        String str21 = str9;
        l.f(str21, "stateCd");
        String str22 = str10;
        l.f(str22, "txNo");
        String str23 = str11;
        l.f(str23, "userId");
        String str24 = str12;
        l.f(str24, "vid");
        return new eKycRequest(str13, str14, str15, str16, str17, str18, str19, z10, list2, str20, str21, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eKycRequest)) {
            return false;
        }
        eKycRequest ekycrequest = (eKycRequest) obj;
        return l.a(this.aadharNo, ekycrequest.aadharNo) && l.a(this.aadharType, ekycrequest.aadharType) && l.a(this.chasiNo, ekycrequest.chasiNo) && l.a(this.eKYC, ekycrequest.eKYC) && l.a(this.ipaddress, ekycrequest.ipaddress) && l.a(this.mobileNo, ekycrequest.mobileNo) && l.a(this.otp, ekycrequest.otp) && this.otpGenerated == ekycrequest.otpGenerated && l.a(this.purCd, ekycrequest.purCd) && l.a(this.regNo, ekycrequest.regNo) && l.a(this.stateCd, ekycrequest.stateCd) && l.a(this.txNo, ekycrequest.txNo) && l.a(this.userId, ekycrequest.userId) && l.a(this.vid, ekycrequest.vid);
    }

    public final String getAadharNo() {
        return this.aadharNo;
    }

    public final String getAadharType() {
        return this.aadharType;
    }

    public final String getChasiNo() {
        return this.chasiNo;
    }

    public final String getEKYC() {
        return this.eKYC;
    }

    public final String getIpaddress() {
        return this.ipaddress;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final boolean getOtpGenerated() {
        return this.otpGenerated;
    }

    public final List<String> getPurCd() {
        return this.purCd;
    }

    public final String getRegNo() {
        return this.regNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getTxNo() {
        return this.txNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVid() {
        return this.vid;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.aadharNo.hashCode() * 31) + this.aadharType.hashCode()) * 31) + this.chasiNo.hashCode()) * 31) + this.eKYC.hashCode()) * 31) + this.ipaddress.hashCode()) * 31) + this.mobileNo.hashCode()) * 31) + this.otp.hashCode()) * 31;
        boolean z10 = this.otpGenerated;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.purCd.hashCode()) * 31) + this.regNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.txNo.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.vid.hashCode();
    }

    public String toString() {
        return "eKycRequest(aadharNo=" + this.aadharNo + ", aadharType=" + this.aadharType + ", chasiNo=" + this.chasiNo + ", eKYC=" + this.eKYC + ", ipaddress=" + this.ipaddress + ", mobileNo=" + this.mobileNo + ", otp=" + this.otp + ", otpGenerated=" + this.otpGenerated + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", stateCd=" + this.stateCd + ", txNo=" + this.txNo + ", userId=" + this.userId + ", vid=" + this.vid + ')';
    }
}
