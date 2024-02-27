package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class VahanDisposeAppSuccessModel extends ArrayList<String> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return contains((String) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return indexOf((String) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return lastIndexOf((String) obj);
    }

    public final /* bridge */ String remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ String removeAt(int i10) {
        return (String) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains(str);
    }

    public /* bridge */ int indexOf(String str) {
        return super.indexOf(str);
    }

    public /* bridge */ int lastIndexOf(String str) {
        return super.lastIndexOf(str);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean remove(String str) {
        return super.remove(str);
    }
}
