package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class FeeRequest {
    private final ArrayList<Integer> purposeCode;
    private final String regn_no;
    private final String state_cd;

    public FeeRequest(ArrayList<Integer> arrayList, String str, String str2) {
        l.f(arrayList, "purposeCode");
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        this.purposeCode = arrayList;
        this.regn_no = str;
        this.state_cd = str2;
    }

    public static /* synthetic */ FeeRequest copy$default(FeeRequest feeRequest, ArrayList<Integer> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = feeRequest.purposeCode;
        }
        if ((i10 & 2) != 0) {
            str = feeRequest.regn_no;
        }
        if ((i10 & 4) != 0) {
            str2 = feeRequest.state_cd;
        }
        return feeRequest.copy(arrayList, str, str2);
    }

    public final ArrayList<Integer> component1() {
        return this.purposeCode;
    }

    public final String component2() {
        return this.regn_no;
    }

    public final String component3() {
        return this.state_cd;
    }

    public final FeeRequest copy(ArrayList<Integer> arrayList, String str, String str2) {
        l.f(arrayList, "purposeCode");
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        return new FeeRequest(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeeRequest)) {
            return false;
        }
        FeeRequest feeRequest = (FeeRequest) obj;
        return l.a(this.purposeCode, feeRequest.purposeCode) && l.a(this.regn_no, feeRequest.regn_no) && l.a(this.state_cd, feeRequest.state_cd);
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.purposeCode.hashCode() * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "FeeRequest(purposeCode=" + this.purposeCode + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
