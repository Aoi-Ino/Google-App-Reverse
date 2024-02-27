package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ContestedDataModel {
    private final String challan_no;

    public ContestedDataModel(String str) {
        l.f(str, "challan_no");
        this.challan_no = str;
    }

    public static /* synthetic */ ContestedDataModel copy$default(ContestedDataModel contestedDataModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contestedDataModel.challan_no;
        }
        return contestedDataModel.copy(str);
    }

    public final String component1() {
        return this.challan_no;
    }

    public final ContestedDataModel copy(String str) {
        l.f(str, "challan_no");
        return new ContestedDataModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContestedDataModel) && l.a(this.challan_no, ((ContestedDataModel) obj).challan_no);
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public int hashCode() {
        return this.challan_no.hashCode();
    }

    public String toString() {
        return "ContestedDataModel(challan_no=" + this.challan_no + ')';
    }
}
