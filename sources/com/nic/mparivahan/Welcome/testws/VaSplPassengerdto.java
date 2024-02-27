package com.nic.mparivahan.Welcome.testws;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class VaSplPassengerdto implements Serializable {
    private final String passengerAddress;
    private final int passengerAge;
    private final String passengerGender;
    private final String passengerName;
    private final int serialNo;

    public VaSplPassengerdto(String str, int i10, String str2, String str3, int i11) {
        this.passengerAddress = str;
        this.passengerAge = i10;
        this.passengerGender = str2;
        this.passengerName = str3;
        this.serialNo = i11;
    }

    public static /* synthetic */ VaSplPassengerdto copy$default(VaSplPassengerdto vaSplPassengerdto, String str, int i10, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = vaSplPassengerdto.passengerAddress;
        }
        if ((i12 & 2) != 0) {
            i10 = vaSplPassengerdto.passengerAge;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            str2 = vaSplPassengerdto.passengerGender;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            str3 = vaSplPassengerdto.passengerName;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            i11 = vaSplPassengerdto.serialNo;
        }
        return vaSplPassengerdto.copy(str, i13, str4, str5, i11);
    }

    public final String component1() {
        return this.passengerAddress;
    }

    public final int component2() {
        return this.passengerAge;
    }

    public final String component3() {
        return this.passengerGender;
    }

    public final String component4() {
        return this.passengerName;
    }

    public final int component5() {
        return this.serialNo;
    }

    public final VaSplPassengerdto copy(String str, int i10, String str2, String str3, int i11) {
        return new VaSplPassengerdto(str, i10, str2, str3, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaSplPassengerdto)) {
            return false;
        }
        VaSplPassengerdto vaSplPassengerdto = (VaSplPassengerdto) obj;
        return l.a(this.passengerAddress, vaSplPassengerdto.passengerAddress) && this.passengerAge == vaSplPassengerdto.passengerAge && l.a(this.passengerGender, vaSplPassengerdto.passengerGender) && l.a(this.passengerName, vaSplPassengerdto.passengerName) && this.serialNo == vaSplPassengerdto.serialNo;
    }

    public final String getPassengerAddress() {
        return this.passengerAddress;
    }

    public final int getPassengerAge() {
        return this.passengerAge;
    }

    public final String getPassengerGender() {
        return this.passengerGender;
    }

    public final String getPassengerName() {
        return this.passengerName;
    }

    public final int getSerialNo() {
        return this.serialNo;
    }

    public int hashCode() {
        String str = this.passengerAddress;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.passengerAge)) * 31;
        String str2 = this.passengerGender;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.passengerName;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Integer.hashCode(this.serialNo);
    }

    public String toString() {
        return "VaSplPassengerdto(passengerAddress=" + this.passengerAddress + ", passengerAge=" + this.passengerAge + ", passengerGender=" + this.passengerGender + ", passengerName=" + this.passengerName + ", serialNo=" + this.serialNo + ')';
    }
}
