package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c extends AbstractList implements z.d {

    /* renamed from: e  reason: collision with root package name */
    private boolean f7058e = true;

    c() {
    }

    public boolean add(Object obj) {
        l();
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection collection) {
        l();
        return super.addAll(i10, collection);
    }

    public boolean c0() {
        return this.f7058e;
    }

    public void clear() {
        l();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void l() {
        if (!this.f7058e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean remove(Object obj) {
        l();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        l();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        l();
        return super.retainAll(collection);
    }

    public final void u() {
        this.f7058e = false;
    }

    public boolean addAll(Collection collection) {
        l();
        return super.addAll(collection);
    }
}
