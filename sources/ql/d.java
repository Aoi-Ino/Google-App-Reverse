package ql;

import dm.b;
import java.util.AbstractCollection;
import java.util.Collection;

public abstract class d extends AbstractCollection implements Collection, b {
    protected d() {
    }

    public abstract int l();

    public final /* bridge */ int size() {
        return l();
    }
}
