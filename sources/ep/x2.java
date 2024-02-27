package ep;

class x2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23421a = true;

    public boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj2 != null) {
            equals = obj2.equals(obj);
        } else {
            if (obj != null) {
                equals = obj.equals(Double.valueOf(1.0d));
            }
            return this.f23421a;
        }
        this.f23421a = equals;
        return this.f23421a;
    }

    public double b() {
        return 1.0d;
    }

    public boolean c() {
        return this.f23421a;
    }
}
