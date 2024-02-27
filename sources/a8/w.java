package a8;

import b8.a;

public class w extends v {
    public w(float f10, float f11) {
        super(0.0f, 0.0f, f10, f11);
    }

    private void M() {
        throw new UnsupportedOperationException(a.b("rectanglereadonly.this.rectangle.is.read.only", new Object[0]));
    }

    public void D(b bVar) {
        M();
    }

    public void H(float f10) {
        M();
    }

    public void I(float f10) {
        M();
    }

    public void J(float f10) {
        M();
    }

    public void L(float f10) {
        M();
    }

    public void a(v vVar) {
        M();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RectangleReadOnly: ");
        stringBuffer.append(z());
        stringBuffer.append('x');
        stringBuffer.append(o());
        stringBuffer.append(" (rot: ");
        stringBuffer.append(this.f365i);
        stringBuffer.append(" degrees)");
        return stringBuffer.toString();
    }

    public w(float f10, float f11, int i10) {
        super(0.0f, 0.0f, f10, f11);
        super.K(i10);
    }
}
