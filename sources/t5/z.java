package t5;

public final class z implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private c0 f16557a;

    public static void b(c0 c0Var, c0 c0Var2) {
        z zVar = (z) c0Var;
        if (zVar.f16557a == null) {
            zVar.f16557a = c0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object a() {
        c0 c0Var = this.f16557a;
        if (c0Var != null) {
            return c0Var.a();
        }
        throw new IllegalStateException();
    }
}
