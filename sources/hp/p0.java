package hp;

import java.util.ArrayList;

abstract class p0 extends ArrayList {
    public p0(int i10) {
        super(i10);
    }

    public Object pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public Object r(Object obj) {
        add(obj);
        return obj;
    }

    public Object v() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
