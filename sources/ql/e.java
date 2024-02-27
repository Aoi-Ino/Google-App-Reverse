package ql;

import dm.b;
import java.util.AbstractList;
import java.util.List;

public abstract class e extends AbstractList implements List, b {
    protected e() {
    }

    public abstract int l();

    public abstract Object n(int i10);

    public final /* bridge */ Object remove(int i10) {
        return n(i10);
    }

    public final /* bridge */ int size() {
        return l();
    }
}
