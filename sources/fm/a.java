package fm;

import java.util.Random;

public abstract class a extends c {
    public int b(int i10) {
        return d.d(f().nextInt(), i10);
    }

    public int c() {
        return f().nextInt();
    }

    public int d(int i10) {
        return f().nextInt(i10);
    }

    public abstract Random f();
}
