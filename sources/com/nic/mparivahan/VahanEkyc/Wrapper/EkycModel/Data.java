package com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class Data implements Serializable {
    private final String aadharNo;
    private final String aadharType;
    private final String chasiNo;
    private final Object dOAadhaarResponse;
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

    public Data(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, boolean z10, List<String> list, String str9, String str10, String str11, String str12) {
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        List<String> list2 = list;
        String str16 = str9;
        String str17 = str10;
        l.f(obj, "dOAadhaarResponse");
        l.f(str4, "eKYC");
        l.f(str13, "lastFourMobileNumber");
        l.f(str14, "mobileNo");
        l.f(str15, "otp");
        l.f(list2, "purCd");
        l.f(str16, "regNo");
        l.f(str17, "stateCd");
        this.aadharNo = str;
        this.aadharType = str2;
        this.chasiNo = str3;
        this.dOAadhaarResponse = obj;
        this.eKYC = str4;
        this.ipaddress = str5;
        this.lastFourMobileNumber = str13;
        this.mobileNo = str14;
        this.otp = str15;
        this.otpGenerated = z10;
        this.purCd = list2;
        this.regNo = str16;
        this.stateCd = str17;
        this.txNo = str11;
        this.userId = str12;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, boolean z10, List list, String str9, String str10, String str11, String str12, int i10, Object obj2) {
        Data data2 = data;
        int i11 = i10;
        return data.copy((i11 & 1) != 0 ? data2.aadharNo : str, (i11 & 2) != 0 ? data2.aadharType : str2, (i11 & 4) != 0 ? data2.chasiNo : str3, (i11 & 8) != 0 ? data2.dOAadhaarResponse : obj, (i11 & 16) != 0 ? data2.eKYC : str4, (i11 & 32) != 0 ? data2.ipaddress : str5, (i11 & 64) != 0 ? data2.lastFourMobileNumber : str6, (i11 & 128) != 0 ? data2.mobileNo : str7, (i11 & 256) != 0 ? data2.otp : str8, (i11 & 512) != 0 ? data2.otpGenerated : z10, (i11 & 1024) != 0 ? data2.purCd : list, (i11 & 2048) != 0 ? data2.regNo : str9, (i11 & 4096) != 0 ? data2.stateCd : str10, (i11 & 8192) != 0 ? data2.txNo : str11, (i11 & 16384) != 0 ? data2.userId : str12);
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

    public final Object component4() {
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

    public final Data copy(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, boolean z10, List<String> list, String str9, String str10, String str11, String str12) {
        Object obj2 = obj;
        l.f(obj2, "dOAadhaarResponse");
        String str13 = str4;
        l.f(str13, "eKYC");
        String str14 = str6;
        l.f(str14, "lastFourMobileNumber");
        String str15 = str7;
        l.f(str15, "mobileNo");
        String str16 = str8;
        l.f(str16, "otp");
        List<String> list2 = list;
        l.f(list2, "purCd");
        String str17 = str9;
        l.f(str17, "regNo");
        String str18 = str10;
        l.f(str18, "stateCd");
        return new Data(str, str2, str3, obj2, str13, str5, str14, str15, str16, z10, list2, str17, str18, str11, str12);
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

    public final Object getDOAadhaarResponse() {
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
        String str = this.aadharNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aadharType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chasiNo;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.dOAadhaarResponse.hashCode()) * 31) + this.eKYC.hashCode()) * 31;
        String str4 = this.ipaddress;
        int hashCode4 = (((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.lastFourMobileNumber.hashCode()) * 31) + this.mobileNo.hashCode()) * 31) + this.otp.hashCode()) * 31;
        boolean z10 = this.otpGenerated;
        if (z10) {
            z10 = true;
        }
        int hashCode5 = (((((((hashCode4 + (z10 ? 1 : 0)) * 31) + this.purCd.hashCode()) * 31) + this.regNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31;
        String str5 = this.txNo;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userId;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "Data(aadharNo=" + this.aadharNo + ", aadharType=" + this.aadharType + ", chasiNo=" + this.chasiNo + ", dOAadhaarResponse=" + this.dOAadhaarResponse + ", eKYC=" + this.eKYC + ", ipaddress=" + this.ipaddress + ", lastFourMobileNumber=" + this.lastFourMobileNumber + ", mobileNo=" + this.mobileNo + ", otp=" + this.otp + ", otpGenerated=" + this.otpGenerated + ", purCd=" + this.purCd + ", regNo=" + this.regNo + ", stateCd=" + this.stateCd + ", txNo=" + this.txNo + ", userId=" + this.userId + ')';
    }
}
