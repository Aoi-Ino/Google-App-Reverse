package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class TaxCalModle extends ArrayList<TaxCalModleItem> {
    public /* bridge */ boolean contains(TaxCalModleItem taxCalModleItem) {
        return super.contains(taxCalModleItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(TaxCalModleItem taxCalModleItem) {
        return super.indexOf(taxCalModleItem);
    }

    public /* bridge */ int lastIndexOf(TaxCalModleItem taxCalModleItem) {
        return super.lastIndexOf(taxCalModleItem);
    }

    public final /* bridge */ TaxCalModleItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ TaxCalModleItem removeAt(int i10) {
        return (TaxCalModleItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof TaxCalModleItem)) {
            return false;
        }
        return contains((TaxCalModleItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof TaxCalModleItem)) {
            return -1;
        }
        return indexOf((TaxCalModleItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof TaxCalModleItem)) {
            return -1;
        }
        return lastIndexOf((TaxCalModleItem) obj);
    }

    public /* bridge */ boolean remove(TaxCalModleItem taxCalModleItem) {
        return super.remove(taxCalModleItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof TaxCalModleItem)) {
            return false;
        }
        return remove((TaxCalModleItem) obj);
    }
}
