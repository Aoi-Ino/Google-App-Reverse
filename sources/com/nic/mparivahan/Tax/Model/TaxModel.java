package com.nic.mparivahan.Tax.Model;

import android.support.v4.media.session.b;
import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class TaxModel extends ArrayList<a> {

    public static final class a {
    }

    public /* bridge */ boolean contains(a aVar) {
        return super.contains(aVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(a aVar) {
        return super.indexOf(aVar);
    }

    public /* bridge */ int lastIndexOf(a aVar) {
        return super.lastIndexOf(aVar);
    }

    public final /* bridge */ a remove(int i10) {
        removeAt(i10);
        return null;
    }

    public /* bridge */ a removeAt(int i10) {
        b.a(super.remove(i10));
        return null;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    public /* bridge */ boolean remove(a aVar) {
        return super.remove(aVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        return false;
    }
}
