package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class DistictModle extends ArrayList<DistictModleItem> {
    public /* bridge */ boolean contains(DistictModleItem distictModleItem) {
        return super.contains(distictModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(DistictModleItem distictModleItem) {
        return super.indexOf(distictModleItem);
    }

    public /* bridge */ int lastIndexOf(DistictModleItem distictModleItem) {
        return super.lastIndexOf(distictModleItem);
    }

    public final /* bridge */ DistictModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ DistictModleItem removeAt(int i10) {
        return (DistictModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof DistictModleItem)) {
            return false;
        }
        return contains((DistictModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof DistictModleItem)) {
            return -1;
        }
        return indexOf((DistictModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof DistictModleItem)) {
            return -1;
        }
        return lastIndexOf((DistictModleItem) obj);
    }

    public /* bridge */ boolean remove(DistictModleItem distictModleItem) {
        return super.remove(distictModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof DistictModleItem)) {
            return false;
        }
        return remove((DistictModleItem) obj);
    }
}
