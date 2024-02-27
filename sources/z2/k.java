package z2;

import z2.e;

public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f18818e;

        private b(int i10) {
            this.f18818e = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a b();

    public abstract b c();
}
