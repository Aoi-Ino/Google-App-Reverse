package com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Data implements Serializable {
    private final String aadharNo;
    private final String aadharType;
    private final String chasiNo;
    private final DOAadhaarResponse dOAadhaarResponse;
    private final String eKYC;
    private final String ipaddress;
    private final String lastFourMobileNumber;
    private final String mobileNo;
    private final String otp;
    private final boolean otpGenerated;
    private final List<String> purCd;
    private final String regNo;
    private final String stateCd;
    private final String txNo;
    private final String userId;

    public Data(String str, String str2, String str3, DOAadhaarResponse dOAadhaarResponse2, String str4, String str5, String str6, String str7, String str8, boolean z10, List<String> list, String str9, String str10, String str11, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        DOAadhaarResponse dOAadhaarResponse3 = dOAadhaarResponse2;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        List<String> list2 = list;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        l.f(str13, "aadharNo");
        l.f(str14, "aadharType");
        l.f(str15, "chasiNo");
        l.f(dOAadhaarResponse3, "dOAadhaarResponse");
        l.f(str16, "eKYC");
        l.f(str17, "ipaddress");
        l.f(str18, "lastFourMobileNumber");
        l.f(str19, "mobileNo");
        l.f(str20, "otp");
        l.f(list2, "purCd");
        l.f(str21, "stateCd");
        l.f(str22, "txNo");
        l.f(str23, "userId");
        this.aadharNo = str13;
        this.aadharType = str14;
        this.chasiNo = str15;
        this.dOAadhaarResponse = dOAadhaarResponse3;
        this.eKYC = str16;
        this.ipaddress = str17;
        this.lastFourMobileNumber = str18;
        this.mobileNo = str19;
        this.otp = str20;
        this.otpGenerated = z10;
        this.purCd = list2;
        this.regNo = str9;
        this.stateCd = str21;
        this.txNo = str22;
        this.userId = str23;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, DOAadhaarResponse dOAadhaarResponse2, String str4, String str5, String str6, String str7, String str8, boolean z10, List list, String str9, String str10, String str11, String str12, int i10, Object obj) {
        Data data2 = data;
        int i11 = i10;
        return data.copy((i11 & 1) != 0 ? data2.aadharNo : str, (i11 & 2) != 0 ? data2.aadharType : str2, (i11 & 4) != 0 ? data2.chasiNo : str3, (i11 & 8) != 0 ? data2.dOAadhaarResponse : dOAadhaarResponse2, (i11 & 16) != 0 ? data2.eKYC : str4, (i11 & 32) != 0 ? data2.ipaddress : str5, (i11 & 64) != 0 ? data2.lastFourMobileNumber : str6, (i11 & 128) != 0 ? data2.mobileNo : str7, (i11 & 256) != 0 ? data2.otp : str8, (i11 & 512) != 0 ? data2.otpGenerated : z10, (i11 & 1024) != 0 ? data2.purCd : list, (i11 & 2048) != 0 ? data2.regNo : str9, (i11 & 4096) != 0 ? data2.stateCd : str10, (i11 & 8192) != 0 ? data2.txNo : str11, (i11 & 16384) != 0 ? data2.userId : str12);
    }

    public final String component1() {
        return this.aadharNo;
    }

    public final boolean component10() {
        return this.otpGenerated;
    }

    public final List<String> component11() {
        return this.purCd;
    }

    public final String component12() {
        return this.regNo;
    }

    public final String component13() {
        return this.stateCd;
    }

    public final String component14() {
        return this.txNo;
    }

    public final String component15() {
        return this.userId;
    }

    public final String component2() {
        return this.aadharType;
    }

    public final String component3() {
        return this.chasiNo;
    }

    public final DOAadhaarResponse component4() {
        return this.dOAadhaarResponse;
    }

    public final String component5() {
        return this.eKYC;
    }

    public final String component6() {
        return this.ipaddress;
    }

    public final String component7() {
        return this.lastFourMobileNumber;
    }

    public final String component8() {
        return this.mobileNo;
    }

    public final String component9() {
        return this.otp;
    }

    public final Data copy(String str, String str2, String str3, DOAadhaarResponse dOAadhaarResponse2, String str4, String str5, String str6, String str7, String str8, boolean z10, List<String> list, String str9, String str10, String str11, String str12) {
        String str13 = str;
        l.f(str13, "aadharNo");
        String str14 = str2;
        l.f(str14, "aadharType");
        String str15 = str3;
        l.f(str15, "chasiNo");
        DOAadhaarResponse dOAadhaarResponse3 = dOAadhaarResponse2;
        l.f(dOAadhaarResponse3, "dOAadhaarResponse");
        String str16 = str4;
        l.f(str16, "eKYC");
        String str17 = str5;
        l.f(str17, "ipaddress");
        String str18 = str6;
        l.f(str18, "lastFourMobileNumber");
        String str19 = str7;
        l.f(str19, "mobileNo");
        String str20 = str8;
        l.f(str20, "otp");
        List<String> list2 = list;
        l.f(list2, "purCd");
        String str21 = str10;
        l.f(str21, "stateCd");
        String str22 = str11;
        l.f(str22, "txNo");
        l.f(str12, "userId");
        return new Data(str13, str14, str15, dOAadhaarResponse3, str16, str17, str18, str19, str20, z10, list2, str9, str21, str22, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.aadharNo, data.aadharNo) && l.a(this.aadharType, data.aadharType) && l.a(this.chasiNo, data.chasiNo) && l.a(this.dOAadhaarResponse, data.dOAadhaarResponse) && l.a(this.eKYC, data.eKYC) && l.a(this.ipaddress, data.ipaddress) && l.a(this.lastFourMobileNumber, data.lastFourMobileNumber) && l.a(this.mobileNo, data.mobileNo) && l.a(this.otp, data.otp) && this.otpGenerated == data.otpGenerated && l.a(this.purCd, data.purCd) && l.a(this.regNo, data.regNo) && l.a(this.stateCd, data.stateCd) && l.a(this.txNo, data.txNo) && l.a(this.userId, data.userId);
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

    public final DOAadhaarResponse getDOAadhaarResponse() {
        return this.dOAadhaarResponse;
    }

    public final String getEKYC() {
        return this.eKYC;
    }

    public final String getIpaddress() {
        return this.ipaddress;
    }

    public final String getLastFourMobileNumber() {
        return this.lastFourMobileNumber;
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

    public int hashCode() {
        int hashCode = ((((((((((((((((this.aadharNo.hashCode() * 31) + this.aadharType.hashCode()) * 31) + this.chasiNo.hashCode()) * 31) + this.dOAadhaarResponse.hashCode()) * 31) + this.eKYC.hashCode()) * 31) + this.ipaddress.hashCode()) * 31) + this.lastFourMobileNumber.hashCode()) * 31) + this.mobileNo.hashCode()) * 31) + this.otp.hashCode()) * 31;
        boolean z10 = this.otpGenerated;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((hashCode + (z10 ? 1 : 0)) * 31) + this.purCd.hashCode()) * 31;
        String str = this.regNo;
        return ((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.stateCd.hashCode()) * 31) + this.txNo.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "Data(aadharNo=" + this.aadharNo + ", aadharType=" + this.aadharType + ", chasiNo=" + this.chasiNo + ", dOAadhaarResponse=" + this.dOAadhaarResponse + ", eKYC=" + this.eKYC + ", ipaddress=" + this.ipaddress + ", lastFourMobileNumber=" + this.lastFourMobileNumber + ", mobileNo=" + this.mobileNo + ", otp=" + this.otp + ", otpGenerated=" + this.otpGenerated + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", stateCd=" + this.stateCd + ", txNo=" + this.txNo + ", userId=" + this.userId + ')';
    }
}
