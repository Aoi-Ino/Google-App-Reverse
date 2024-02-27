package e7;

import com.google.firebase.messaging.h0;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f10152b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final a f10153a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f10154a = null;

        a() {
        }

        public b a() {
            return new b(this.f10154a);
        }

        public a b(a aVar) {
            this.f10154a = aVar;
            return this;
        }
    }

    b(a aVar) {
        this.f10153a = aVar;
    }

    public static a b() {
        return new a();
    }

    public a a() {
        return this.f10153a;
    }

    public byte[] c() {
        return h0.a(this);
    }
}
