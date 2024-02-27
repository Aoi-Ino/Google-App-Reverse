package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class Data {
    private final ArrayList<FeeDobj> feeDobj;
    private final String sumOfFee;
    private final String sumOfFine;
    private final String sumOfTotal;

    public Data(ArrayList<FeeDobj> arrayList, String str, String str2, String str3) {
        this.feeDobj = arrayList;
        this.sumOfFee = str;
        this.sumOfFine = str2;
        this.sumOfTotal = str3;
    }

    public static /* synthetic */ Data copy$default(Data data, ArrayList<FeeDobj> arrayList, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = data.feeDobj;
        }
        if ((i10 & 2) != 0) {
            str = data.sumOfFee;
        }
        if ((i10 & 4) != 0) {
            str2 = data.sumOfFine;
        }
        if ((i10 & 8) != 0) {
            str3 = data.sumOfTotal;
        }
        return data.copy(arrayList, str, str2, str3);
    }

    public final ArrayList<FeeDobj> component1() {
        return this.feeDobj;
    }

    public final String component2() {
        return this.sumOfFee;
    }

    public final String component3() {
        return this.sumOfFine;
    }

    public final String component4() {
        return this.sumOfTotal;
    }

    public final Data copy(ArrayList<FeeDobj> arrayList, String str, String str2, String str3) {
        return new Data(arrayList, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.feeDobj, data.feeDobj) && l.a(this.sumOfFee, data.sumOfFee) && l.a(this.sumOfFine, data.sumOfFine) && l.a(this.sumOfTotal, data.sumOfTotal);
    }

    public final ArrayList<FeeDobj> getFeeDobj() {
        return this.feeDobj;
    }

    public final String getSumOfFee() {
        return this.sumOfFee;
    }

    public final String getSumOfFine() {
        return this.sumOfFine;
    }

    public final String getSumOfTotal() {
        return this.sumOfTotal;
    }

    public int hashCode() {
        ArrayList<FeeDobj> arrayList = this.feeDobj;
        int i10 = 0;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.sumOfFee;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sumOfFine;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sumOfTotal;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "Data(feeDobj=" + this.feeDobj + ", sumOfFee=" + this.sumOfFee + ", sumOfFine=" + this.sumOfFine + ", sumOfTotal=" + this.sumOfTotal + ')';
    }
}
