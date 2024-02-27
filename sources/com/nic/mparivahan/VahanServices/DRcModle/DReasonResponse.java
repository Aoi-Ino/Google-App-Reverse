package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class DReasonResponse extends ArrayList<DReasonResponseItem> {
    public /* bridge */ boolean contains(DReasonResponseItem dReasonResponseItem) {
        return super.contains(dReasonResponseItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(DReasonResponseItem dReasonResponseItem) {
        return super.indexOf(dReasonResponseItem);
    }

    public /* bridge */ int lastIndexOf(DReasonResponseItem dReasonResponseItem) {
        return super.lastIndexOf(dReasonResponseItem);
    }

    public final /* bridge */ DReasonResponseItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ DReasonResponseItem removeAt(int i10) {
        return (DReasonResponseItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof DReasonResponseItem)) {
            return false;
        }
        return contains((DReasonResponseItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof DReasonResponseItem)) {
            return -1;
        }
        return indexOf((DReasonResponseItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof DReasonResponseItem)) {
            return -1;
        }
        return lastIndexOf((DReasonResponseItem) obj);
    }

    public /* bridge */ boolean remove(DReasonResponseItem dReasonResponseItem) {
        return super.remove(dReasonResponseItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof DReasonResponseItem)) {
            return false;
        }
        return remove((DReasonResponseItem) obj);
    }
}
