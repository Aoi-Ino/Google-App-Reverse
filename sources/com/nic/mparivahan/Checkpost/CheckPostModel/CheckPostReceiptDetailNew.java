package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class CheckPostReceiptDetailNew extends ArrayList<CheckPostReceiptDetailNewItem> {
    public /* bridge */ boolean contains(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.contains(checkPostReceiptDetailNewItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.indexOf(checkPostReceiptDetailNewItem);
    }

    public /* bridge */ int lastIndexOf(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.lastIndexOf(checkPostReceiptDetailNewItem);
    }

    public final /* bridge */ CheckPostReceiptDetailNewItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ CheckPostReceiptDetailNewItem removeAt(int i10) {
        return (CheckPostReceiptDetailNewItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof CheckPostReceiptDetailNewItem)) {
            return false;
        }
        return contains((CheckPostReceiptDetailNewItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof CheckPostReceiptDetailNewItem)) {
            return -1;
        }
        return indexOf((CheckPostReceiptDetailNewItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof CheckPostReceiptDetailNewItem)) {
            return -1;
        }
        return lastIndexOf((CheckPostReceiptDetailNewItem) obj);
    }

    public /* bridge */ boolean remove(CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem) {
        return super.remove(checkPostReceiptDetailNewItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof CheckPostReceiptDetailNewItem)) {
            return false;
        }
        return remove((CheckPostReceiptDetailNewItem) obj);
    }
}
