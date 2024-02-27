package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class RtoNameModle extends ArrayList<RtoNameModleItem> {
    public /* bridge */ boolean contains(RtoNameModleItem rtoNameModleItem) {
        return super.contains(rtoNameModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(RtoNameModleItem rtoNameModleItem) {
        return super.indexOf(rtoNameModleItem);
    }

    public /* bridge */ int lastIndexOf(RtoNameModleItem rtoNameModleItem) {
        return super.lastIndexOf(rtoNameModleItem);
    }

    public final /* bridge */ RtoNameModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ RtoNameModleItem removeAt(int i10) {
        return (RtoNameModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof RtoNameModleItem)) {
            return false;
        }
        return contains((RtoNameModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof RtoNameModleItem)) {
            return -1;
        }
        return indexOf((RtoNameModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof RtoNameModleItem)) {
            return -1;
        }
        return lastIndexOf((RtoNameModleItem) obj);
    }

    public /* bridge */ boolean remove(RtoNameModleItem rtoNameModleItem) {
        return super.remove(rtoNameModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof RtoNameModleItem)) {
            return false;
        }
        return remove((RtoNameModleItem) obj);
    }
}
