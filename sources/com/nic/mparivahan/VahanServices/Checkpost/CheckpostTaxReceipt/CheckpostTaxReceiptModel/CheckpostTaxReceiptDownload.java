package com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class CheckpostTaxReceiptDownload extends ArrayList<CheckpostTaxReceiptDownloadItem> {
    public /* bridge */ boolean contains(CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem) {
        return super.contains(checkpostTaxReceiptDownloadItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem) {
        return super.indexOf(checkpostTaxReceiptDownloadItem);
    }

    public /* bridge */ int lastIndexOf(CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem) {
        return super.lastIndexOf(checkpostTaxReceiptDownloadItem);
    }

    public final /* bridge */ CheckpostTaxReceiptDownloadItem remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ CheckpostTaxReceiptDownloadItem removeAt(int i10) {
        return (CheckpostTaxReceiptDownloadItem) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof CheckpostTaxReceiptDownloadItem)) {
            return false;
        }
        return contains((CheckpostTaxReceiptDownloadItem) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof CheckpostTaxReceiptDownloadItem)) {
            return -1;
        }
        return indexOf((CheckpostTaxReceiptDownloadItem) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof CheckpostTaxReceiptDownloadItem)) {
            return -1;
        }
        return lastIndexOf((CheckpostTaxReceiptDownloadItem) obj);
    }

    public /* bridge */ boolean remove(CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem) {
        return super.remove(checkpostTaxReceiptDownloadItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof CheckpostTaxReceiptDownloadItem)) {
            return false;
        }
        return remove((CheckpostTaxReceiptDownloadItem) obj);
    }
}
