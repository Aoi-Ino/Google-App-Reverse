package r5;

import w5.q;

public class a extends q {

    /* renamed from: e  reason: collision with root package name */
    private final int f15602e;

    public a(int i10) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i10), s5.a.a(i10)}));
        if (i10 != 0) {
            this.f15602e = i10;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
