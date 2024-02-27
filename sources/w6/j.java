package w6;

public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f17926e;

        private a(int i10) {
            this.f17926e = i10;
        }

        public int a() {
            return this.f17926e;
        }
    }

    a b(String str);
}
