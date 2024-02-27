package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class NocReasonModle extends ArrayList<NocReasonModleItem> {
    public /* bridge */ boolean contains(NocReasonModleItem nocReasonModleItem) {
        return super.contains(nocReasonModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(NocReasonModleItem nocReasonModleItem) {
        return super.indexOf(nocReasonModleItem);
    }

    public /* bridge */ int lastIndexOf(NocReasonModleItem nocReasonModleItem) {
        return super.lastIndexOf(nocReasonModleItem);
    }

    public final /* bridge */ NocReasonModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ NocReasonModleItem removeAt(int i10) {
        return (NocReasonModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof NocReasonModleItem)) {
            return false;
        }
        return contains((NocReasonModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof NocReasonModleItem)) {
            return -1;
        }
        return indexOf((NocReasonModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof NocReasonModleItem)) {
            return -1;
        }
        return lastIndexOf((NocReasonModleItem) obj);
    }

    public /* bridge */ boolean remove(NocReasonModleItem nocReasonModleItem) {
        return super.remove(nocReasonModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof NocReasonModleItem)) {
            return false;
        }
        return remove((NocReasonModleItem) obj);
    }
}
