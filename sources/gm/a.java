package gm;

import cm.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends fm.a {
    public int e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.e(current, "current()");
        return current;
    }
}
