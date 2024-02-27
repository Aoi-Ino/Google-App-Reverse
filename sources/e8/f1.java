package e8;

import b8.a;

public class f1 extends i1 {

    /* renamed from: g  reason: collision with root package name */
    private double f10663g;

    public f1(double d10) {
        super(2);
        this.f10663g = d10;
        j(f.E(d10));
    }

    public double m() {
        return this.f10663g;
    }

    public f1(float f10) {
        this((double) f10);
    }

    public f1(int i10) {
        super(2);
        this.f10663g = (double) i10;
        j(String.valueOf(i10));
    }

    public f1(String str) {
        super(2);
        try {
            this.f10663g = Double.parseDouble(str.trim());
            j(str);
        } catch (NumberFormatException e10) {
            throw new RuntimeException(a.b("1.is.not.a.valid.number.2", str, e10.toString()));
        }
    }
}
