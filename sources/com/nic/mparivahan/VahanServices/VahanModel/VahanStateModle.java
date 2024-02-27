package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class VahanStateModle extends ArrayList<VahanStateModleSubList> {
    public /* bridge */ boolean contains(VahanStateModleSubList vahanStateModleSubList) {
        return super.contains(vahanStateModleSubList);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(VahanStateModleSubList vahanStateModleSubList) {
        return super.indexOf(vahanStateModleSubList);
    }

    public /* bridge */ int lastIndexOf(VahanStateModleSubList vahanStateModleSubList) {
        return super.lastIndexOf(vahanStateModleSubList);
    }

    public final /* bridge */ VahanStateModleSubList remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ VahanStateModleSubList removeAt(int i10) {
        return (VahanStateModleSubList) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof VahanStateModleSubList)) {
            return false;
        }
        return contains((VahanStateModleSubList) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof VahanStateModleSubList)) {
            return -1;
        }
        return indexOf((VahanStateModleSubList) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof VahanStateModleSubList)) {
            return -1;
        }
        return lastIndexOf((VahanStateModleSubList) obj);
    }

    public /* bridge */ boolean remove(VahanStateModleSubList vahanStateModleSubList) {
        return super.remove(vahanStateModleSubList);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof VahanStateModleSubList)) {
            return false;
        }
        return remove((VahanStateModleSubList) obj);
    }
}
