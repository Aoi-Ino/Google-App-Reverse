package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class FeesResponse {
    private final ArrayList<ArrayList<Fees>> feesList;
    private final String regn_no;
    private final String state_cd;
    private final int totalAmount;

    public FeesResponse(ArrayList<ArrayList<Fees>> arrayList, String str, String str2, int i10) {
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        this.feesList = arrayList;
        this.regn_no = str;
        this.state_cd = str2;
        this.totalAmount = i10;
    }

    public static /* synthetic */ FeesResponse copy$default(FeesResponse feesResponse, ArrayList<ArrayList<Fees>> arrayList, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = feesResponse.feesList;
        }
        if ((i11 & 2) != 0) {
            str = feesResponse.regn_no;
        }
        if ((i11 & 4) != 0) {
            str2 = feesResponse.state_cd;
        }
        if ((i11 & 8) != 0) {
            i10 = feesResponse.totalAmount;
        }
        return feesResponse.copy(arrayList, str, str2, i10);
    }

    public final ArrayList<ArrayList<Fees>> component1() {
        return this.feesList;
    }

    public final String component2() {
        return this.regn_no;
    }

    public final String component3() {
        return this.state_cd;
    }

    public final int component4() {
        return this.totalAmount;
    }

    public final FeesResponse copy(ArrayList<ArrayList<Fees>> arrayList, String str, String str2, int i10) {
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        return new FeesResponse(arrayList, str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesResponse)) {
            return false;
        }
        FeesResponse feesResponse = (FeesResponse) obj;
        return l.a(this.feesList, feesResponse.feesList) && l.a(this.regn_no, feesResponse.regn_no) && l.a(this.state_cd, feesResponse.state_cd) && this.totalAmount == feesResponse.totalAmount;
    }

    public final ArrayList<ArrayList<Fees>> getFeesList() {
        return this.feesList;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        ArrayList<ArrayList<Fees>> arrayList = this.feesList;
        return ((((((arrayList == null ? 0 : arrayList.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "FeesResponse(feesList=" + this.feesList + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", totalAmount=" + this.totalAmount + ')';
    }
}
