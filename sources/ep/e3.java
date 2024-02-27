package ep;

class e3 {

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal f23159a = new ThreadLocal();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private d3 f23160a;

        /* renamed from: b  reason: collision with root package name */
        private int f23161b;

        public a(boolean z10) {
            this.f23160a = new d3(z10);
        }

        public int a() {
            int i10 = this.f23161b - 1;
            this.f23161b = i10;
            return i10;
        }

        public d3 b() {
            int i10 = this.f23161b;
            if (i10 >= 0) {
                this.f23161b = i10 + 1;
            }
            return this.f23160a;
        }
    }

    private d3 b(boolean z10) {
        a aVar = new a(z10);
        this.f23159a.set(aVar);
        return aVar.b();
    }

    public void a() {
        a aVar = (a) this.f23159a.get();
        if (aVar == null) {
            throw new n2("Session does not exist", new Object[0]);
        } else if (aVar.a() == 0) {
            this.f23159a.remove();
        }
    }

    public d3 c() {
        return d(true);
    }

    public d3 d(boolean z10) {
        a aVar = (a) this.f23159a.get();
        return aVar != null ? aVar.b() : b(z10);
    }
}
