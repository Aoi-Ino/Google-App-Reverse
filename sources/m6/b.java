package m6;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f13754a;

    class a extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f13755b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, String str) {
            super(bVar, (a) null);
            this.f13755b = str;
        }

        public b b(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    private b(String str) {
        this.f13754a = (String) c.b(str);
    }

    public static b a(String str) {
        return new b(str);
    }

    public b b(String str) {
        c.b(str);
        return new a(this, str);
    }

    private b(b bVar) {
        this.f13754a = bVar.f13754a;
    }

    /* synthetic */ b(b bVar, a aVar) {
        this(bVar);
    }
}
