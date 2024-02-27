package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class MultiServiceDto implements Serializable {
    private final ArrayList<ArrayList<Fees>> feesList;
    private final ArrayList<Integer> purposeCode;
    private final String regn_no;
    private final String state_cd;
    private final int totalAmount;

    public MultiServiceDto(ArrayList<ArrayList<Fees>> arrayList, ArrayList<Integer> arrayList2, String str, String str2, int i10) {
        this.feesList = arrayList;
        this.purposeCode = arrayList2;
        this.regn_no = str;
        this.state_cd = str2;
        this.totalAmount = i10;
    }

    public static /* synthetic */ MultiServiceDto copy$default(MultiServiceDto multiServiceDto, ArrayList<ArrayList<Fees>> arrayList, ArrayList<Integer> arrayList2, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = multiServiceDto.feesList;
        }
        if ((i11 & 2) != 0) {
            arrayList2 = multiServiceDto.purposeCode;
        }
        ArrayList<Integer> arrayList3 = arrayList2;
        if ((i11 & 4) != 0) {
            str = multiServiceDto.regn_no;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = multiServiceDto.state_cd;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            i10 = multiServiceDto.totalAmount;
        }
        return multiServiceDto.copy(arrayList, arrayList3, str3, str4, i10);
    }

    public final ArrayList<ArrayList<Fees>> component1() {
        return this.feesList;
    }

    public final ArrayList<Integer> component2() {
        return this.purposeCode;
    }

    public final String component3() {
        return this.regn_no;
    }

    public final String component4() {
        return this.state_cd;
    }

    public final int component5() {
        return this.totalAmount;
    }

    public final MultiServiceDto copy(ArrayList<ArrayList<Fees>> arrayList, ArrayList<Integer> arrayList2, String str, String str2, int i10) {
        return new MultiServiceDto(arrayList, arrayList2, str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiServiceDto)) {
            return false;
        }
        MultiServiceDto multiServiceDto = (MultiServiceDto) obj;
        return l.a(this.feesList, multiServiceDto.feesList) && l.a(this.purposeCode, multiServiceDto.purposeCode) && l.a(this.regn_no, multiServiceDto.regn_no) && l.a(this.state_cd, multiServiceDto.state_cd) && this.totalAmount == multiServiceDto.totalAmount;
    }

    public final ArrayList<ArrayList<Fees>> getFeesList() {
        return this.feesList;
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

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        ArrayList<ArrayList<Fees>> arrayList = this.feesList;
        int i10 = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<Integer> arrayList2 = this.purposeCode;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str = this.regn_no;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state_cd;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode3 + i10) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "MultiServiceDto(feesList=" + this.feesList + ", purposeCode=" + this.purposeCode + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", totalAmount=" + this.totalAmount + ')';
    }
}
