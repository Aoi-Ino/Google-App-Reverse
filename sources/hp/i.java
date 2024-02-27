package hp;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f24248a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24249b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f24250c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24251d;

    public i() {
        this(3);
    }

    public int a() {
        return this.f24251d;
    }

    public String b() {
        return this.f24249b;
    }

    public r0 c() {
        return this.f24250c;
    }

    public s0 d() {
        return this.f24248a;
    }

    public i(int i10) {
        this(i10, (String) null, new k());
    }

    public i(int i10, String str, r0 r0Var) {
        this(i10, str, r0Var, s0.HIGH);
    }

    public i(int i10, String str, r0 r0Var, s0 s0Var) {
        this.f24248a = s0Var;
        this.f24249b = str;
        this.f24251d = i10;
        this.f24250c = r0Var;
    }
}
