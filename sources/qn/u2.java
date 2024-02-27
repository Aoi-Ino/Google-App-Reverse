package qn;

public class u2 {

    /* renamed from: a  reason: collision with root package name */
    private String f31005a;

    /* renamed from: b  reason: collision with root package name */
    private int f31006b = 0;

    public u2(String str) {
        this.f31005a = str;
    }

    public boolean a() {
        return this.f31006b != -1;
    }

    public String b() {
        int i10 = this.f31006b;
        if (i10 == -1) {
            return null;
        }
        int indexOf = this.f31005a.indexOf(46, i10);
        if (indexOf == -1) {
            String substring = this.f31005a.substring(this.f31006b);
            this.f31006b = -1;
            return substring;
        }
        String substring2 = this.f31005a.substring(this.f31006b, indexOf);
        this.f31006b = indexOf + 1;
        return substring2;
    }
}
