package o1;

import cm.g;

public abstract class b {

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14340a = new a();

        private a() {
            super((g) null);
        }
    }

    /* renamed from: o1.b$b  reason: collision with other inner class name */
    public static final class C0193b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final int f14341a;

        public C0193b(int i10) {
            super((g) null);
            this.f14341a = i10;
        }

        public final int a() {
            return this.f14341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0193b) && this.f14341a == ((C0193b) obj).f14341a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f14341a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f14341a + ')';
        }
    }

    private b() {
    }

    public /* synthetic */ b(g gVar) {
        this();
    }
}
