package pn;

import nn.a;

class e extends a implements a {

    /* renamed from: n  reason: collision with root package name */
    Class f30495n;

    e(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f30495n = cls2;
    }

    /* access modifiers changed from: protected */
    public String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f30514b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f30514b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f30495n == null) {
            this.f30495n = d(6);
        }
        return this.f30495n;
    }
}
