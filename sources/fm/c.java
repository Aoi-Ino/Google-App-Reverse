package fm;

import cm.g;
import java.io.Serializable;
import wl.b;

public abstract class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23593e = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final c f23594f = b.f32650a.b();

    public static final class a extends c implements Serializable {
        private a() {
        }

        public int b(int i10) {
            return c.f23594f.b(i10);
        }

        public int c() {
            return c.f23594f.c();
        }

        public int d(int i10) {
            return c.f23594f.d(i10);
        }

        public int e(int i10, int i11) {
            return c.f23594f.e(i10, i11);
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public int e(int i10, int i11) {
        int i12;
        int c10;
        int i13;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(d.c(i14));
            } else {
                do {
                    c10 = c() >>> 1;
                    i13 = c10 % i14;
                } while ((c10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        while (true) {
            int c11 = c();
            if (i10 <= c11 && c11 < i11) {
                return c11;
            }
        }
    }
}
