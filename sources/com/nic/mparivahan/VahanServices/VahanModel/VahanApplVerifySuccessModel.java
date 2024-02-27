package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class VahanApplVerifySuccessModel extends ArrayList<ListOfDisposeApplModel> {
    public /* bridge */ boolean contains(ListOfDisposeApplModel listOfDisposeApplModel) {
        return super.contains(listOfDisposeApplModel);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ListOfDisposeApplModel listOfDisposeApplModel) {
        return super.indexOf(listOfDisposeApplModel);
    }

    public /* bridge */ int lastIndexOf(ListOfDisposeApplModel listOfDisposeApplModel) {
        return super.lastIndexOf(listOfDisposeApplModel);
    }

    public final /* bridge */ ListOfDisposeApplModel remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ ListOfDisposeApplModel removeAt(int i10) {
        return (ListOfDisposeApplModel) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ListOfDisposeApplModel)) {
            return false;
        }
        return contains((ListOfDisposeApplModel) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ListOfDisposeApplModel)) {
            return -1;
        }
        return indexOf((ListOfDisposeApplModel) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ListOfDisposeApplModel)) {
            return -1;
        }
        return lastIndexOf((ListOfDisposeApplModel) obj);
    }

    public /* bridge */ boolean remove(ListOfDisposeApplModel listOfDisposeApplModel) {
        return super.remove(listOfDisposeApplModel);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof ListOfDisposeApplModel)) {
            return false;
        }
        return remove((ListOfDisposeApplModel) obj);
    }
}
