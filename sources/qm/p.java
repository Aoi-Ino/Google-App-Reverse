package qm;

public abstract class p {
    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
        }
    }
}
