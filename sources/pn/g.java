package pn;

import nn.b;

class g implements b {

    /* renamed from: a  reason: collision with root package name */
    Class f30507a;

    /* renamed from: b  reason: collision with root package name */
    String f30508b;

    /* renamed from: c  reason: collision with root package name */
    int f30509c;

    g(Class cls, String str, int i10) {
        this.f30507a = cls;
        this.f30508b = str;
        this.f30509c = i10;
    }

    public String a() {
        return this.f30508b;
    }

    public int b() {
        return this.f30509c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a());
        stringBuffer.append(":");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }
}
