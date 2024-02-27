package com.nic.mparivahan.VahanServices.HTPModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import java.util.ArrayList;

@Keep
public final class HtpTypeModle extends ArrayList<HTPModleItem> {
    public /* bridge */ boolean contains(HTPModleItem hTPModleItem) {
        return super.contains(hTPModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(HTPModleItem hTPModleItem) {
        return super.indexOf(hTPModleItem);
    }

    public /* bridge */ int lastIndexOf(HTPModleItem hTPModleItem) {
        return super.lastIndexOf(hTPModleItem);
    }

    public final /* bridge */ HTPModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ HTPModleItem removeAt(int i10) {
        return (HTPModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof HTPModleItem)) {
            return false;
        }
        return contains((HTPModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof HTPModleItem)) {
            return -1;
        }
        return indexOf((HTPModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof HTPModleItem)) {
            return -1;
        }
        return lastIndexOf((HTPModleItem) obj);
    }

    public /* bridge */ boolean remove(HTPModleItem hTPModleItem) {
        return super.remove(hTPModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof HTPModleItem)) {
            return false;
        }
        return remove((HTPModleItem) obj);
    }
}
