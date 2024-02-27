package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class TransferredCourtDataModel {
    private final String challan_no;

    public TransferredCourtDataModel(String str) {
        l.f(str, "challan_no");
        this.challan_no = str;
    }

    public static /* synthetic */ TransferredCourtDataModel copy$default(TransferredCourtDataModel transferredCourtDataModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transferredCourtDataModel.challan_no;
        }
        return transferredCourtDataModel.copy(str);
    }

    public final String component1() {
        return this.challan_no;
    }

    public final TransferredCourtDataModel copy(String str) {
        l.f(str, "challan_no");
        return new TransferredCourtDataModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferredCourtDataModel) && l.a(this.challan_no, ((TransferredCourtDataModel) obj).challan_no);
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public int hashCode() {
        return this.challan_no.hashCode();
    }

    public String toString() {
        return "TransferredCourtDataModel(challan_no=" + this.challan_no + ')';
    }
}
