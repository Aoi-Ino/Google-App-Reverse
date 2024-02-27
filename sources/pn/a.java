package pn;

abstract class a extends d {

    /* renamed from: k  reason: collision with root package name */
    Class[] f30477k;

    /* renamed from: l  reason: collision with root package name */
    String[] f30478l;

    /* renamed from: m  reason: collision with root package name */
    Class[] f30479m;

    a(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, str, cls);
        this.f30477k = clsArr;
        this.f30478l = strArr;
        this.f30479m = clsArr2;
    }

    public Class[] l() {
        if (this.f30479m == null) {
            this.f30479m = e(5);
        }
        return this.f30479m;
    }

    public Class[] m() {
        if (this.f30477k == null) {
            this.f30477k = e(3);
        }
        return this.f30477k;
    }
}
