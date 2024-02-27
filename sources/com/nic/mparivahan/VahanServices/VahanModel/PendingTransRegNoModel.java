package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class PendingTransRegNoModel extends ArrayList<PendingTransRegNoDataModel> {
    public /* bridge */ boolean contains(PendingTransRegNoDataModel pendingTransRegNoDataModel) {
        return super.contains(pendingTransRegNoDataModel);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(PendingTransRegNoDataModel pendingTransRegNoDataModel) {
        return super.indexOf(pendingTransRegNoDataModel);
    }

    public /* bridge */ int lastIndexOf(PendingTransRegNoDataModel pendingTransRegNoDataModel) {
        return super.lastIndexOf(pendingTransRegNoDataModel);
    }

    public final /* bridge */ PendingTransRegNoDataModel remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ PendingTransRegNoDataModel removeAt(int i10) {
        return (PendingTransRegNoDataModel) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof PendingTransRegNoDataModel)) {
            return false;
        }
        return contains((PendingTransRegNoDataModel) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof PendingTransRegNoDataModel)) {
            return -1;
        }
        return indexOf((PendingTransRegNoDataModel) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof PendingTransRegNoDataModel)) {
            return -1;
        }
        return lastIndexOf((PendingTransRegNoDataModel) obj);
    }

    public /* bridge */ boolean remove(PendingTransRegNoDataModel pendingTransRegNoDataModel) {
        return super.remove(pendingTransRegNoDataModel);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof PendingTransRegNoDataModel)) {
            return false;
        }
        return remove((PendingTransRegNoDataModel) obj);
    }
}
