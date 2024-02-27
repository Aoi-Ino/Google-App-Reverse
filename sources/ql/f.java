package ql;

import dm.b;
import java.util.AbstractSet;
import java.util.Set;

public abstract class f extends AbstractSet implements Set, b {
    protected f() {
    }

    public abstract int l();

    public final /* bridge */ int size() {
        return l();
    }
}
