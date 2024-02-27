package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class ApplicationStatusSuccessModel implements Serializable {
    private final ArrayList<ApplStatusTransListModel> transList;

    public ApplicationStatusSuccessModel(ArrayList<ApplStatusTransListModel> arrayList) {
        l.f(arrayList, "transList");
        this.transList = arrayList;
    }

    public static /* synthetic */ ApplicationStatusSuccessModel copy$default(ApplicationStatusSuccessModel applicationStatusSuccessModel, ArrayList<ApplStatusTransListModel> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = applicationStatusSuccessModel.transList;
        }
        return applicationStatusSuccessModel.copy(arrayList);
    }

    public final ArrayList<ApplStatusTransListModel> component1() {
        return this.transList;
    }

    public final ApplicationStatusSuccessModel copy(ArrayList<ApplStatusTransListModel> arrayList) {
        l.f(arrayList, "transList");
        return new ApplicationStatusSuccessModel(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationStatusSuccessModel) && l.a(this.transList, ((ApplicationStatusSuccessModel) obj).transList);
    }

    public final ArrayList<ApplStatusTransListModel> getTransList() {
        return this.transList;
    }

    public int hashCode() {
        return this.transList.hashCode();
    }

    public String toString() {
        return "ApplicationStatusSuccessModel(transList=" + this.transList + ')';
    }
}
