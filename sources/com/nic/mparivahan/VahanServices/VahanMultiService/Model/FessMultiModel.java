package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.Fees;
import java.util.ArrayList;

@Keep
public final class FessMultiModel {
    private final ArrayList<Fees> arrayList;
    private final String service_name;

    public FessMultiModel(String str, ArrayList<Fees> arrayList2) {
        l.f(str, "service_name");
        l.f(arrayList2, "arrayList");
        this.service_name = str;
        this.arrayList = arrayList2;
    }

    public static /* synthetic */ FessMultiModel copy$default(FessMultiModel fessMultiModel, String str, ArrayList<Fees> arrayList2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fessMultiModel.service_name;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = fessMultiModel.arrayList;
        }
        return fessMultiModel.copy(str, arrayList2);
    }

    public final String component1() {
        return this.service_name;
    }

    public final ArrayList<Fees> component2() {
        return this.arrayList;
    }

    public final FessMultiModel copy(String str, ArrayList<Fees> arrayList2) {
        l.f(str, "service_name");
        l.f(arrayList2, "arrayList");
        return new FessMultiModel(str, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FessMultiModel)) {
            return false;
        }
        FessMultiModel fessMultiModel = (FessMultiModel) obj;
        return l.a(this.service_name, fessMultiModel.service_name) && l.a(this.arrayList, fessMultiModel.arrayList);
    }

    public final ArrayList<Fees> getArrayList() {
        return this.arrayList;
    }

    public final String getService_name() {
        return this.service_name;
    }

    public int hashCode() {
        return (this.service_name.hashCode() * 31) + this.arrayList.hashCode();
    }

    public String toString() {
        return "FessMultiModel(service_name=" + this.service_name + ", arrayList=" + this.arrayList + ')';
    }
}
