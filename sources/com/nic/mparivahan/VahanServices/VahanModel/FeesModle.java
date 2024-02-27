package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class FeesModle extends ArrayList<FeesModleItem> {
    public /* bridge */ boolean contains(FeesModleItem feesModleItem) {
        return super.contains(feesModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(FeesModleItem feesModleItem) {
        return super.indexOf(feesModleItem);
    }

    public /* bridge */ int lastIndexOf(FeesModleItem feesModleItem) {
        return super.lastIndexOf(feesModleItem);
    }

    public final /* bridge */ FeesModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ FeesModleItem removeAt(int i10) {
        return (FeesModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof FeesModleItem)) {
            return false;
        }
        return contains((FeesModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof FeesModleItem)) {
            return -1;
        }
        return indexOf((FeesModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof FeesModleItem)) {
            return -1;
        }
        return lastIndexOf((FeesModleItem) obj);
    }

    public /* bridge */ boolean remove(FeesModleItem feesModleItem) {
        return super.remove(feesModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof FeesModleItem)) {
            return false;
        }
        return remove((FeesModleItem) obj);
    }
}
