package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class ApplStatusTransListModel implements Serializable {
    private final ArrayList<ApplStatusCurrentListModel> currentlist;
    private final ArrayList<ApplStatusDetailsListModel> detaillist;

    public ApplStatusTransListModel(ArrayList<ApplStatusDetailsListModel> arrayList, ArrayList<ApplStatusCurrentListModel> arrayList2) {
        l.f(arrayList, "detaillist");
        l.f(arrayList2, "currentlist");
        this.detaillist = arrayList;
        this.currentlist = arrayList2;
    }

    public static /* synthetic */ ApplStatusTransListModel copy$default(ApplStatusTransListModel applStatusTransListModel, ArrayList<ApplStatusDetailsListModel> arrayList, ArrayList<ApplStatusCurrentListModel> arrayList2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = applStatusTransListModel.detaillist;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = applStatusTransListModel.currentlist;
        }
        return applStatusTransListModel.copy(arrayList, arrayList2);
    }

    public final ArrayList<ApplStatusDetailsListModel> component1() {
        return this.detaillist;
    }

    public final ArrayList<ApplStatusCurrentListModel> component2() {
        return this.currentlist;
    }

    public final ApplStatusTransListModel copy(ArrayList<ApplStatusDetailsListModel> arrayList, ArrayList<ApplStatusCurrentListModel> arrayList2) {
        l.f(arrayList, "detaillist");
        l.f(arrayList2, "currentlist");
        return new ApplStatusTransListModel(arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusTransListModel)) {
            return false;
        }
        ApplStatusTransListModel applStatusTransListModel = (ApplStatusTransListModel) obj;
        return l.a(this.detaillist, applStatusTransListModel.detaillist) && l.a(this.currentlist, applStatusTransListModel.currentlist);
    }

    public final ArrayList<ApplStatusCurrentListModel> getCurrentlist() {
        return this.currentlist;
    }

    public final ArrayList<ApplStatusDetailsListModel> getDetaillist() {
        return this.detaillist;
    }

    public int hashCode() {
        return (this.detaillist.hashCode() * 31) + this.currentlist.hashCode();
    }

    public String toString() {
        return "ApplStatusTransListModel(detaillist=" + this.detaillist + ", currentlist=" + this.currentlist + ')';
    }
}
