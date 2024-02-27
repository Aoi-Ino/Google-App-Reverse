package qn;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

class r2 implements Enumeration {

    /* renamed from: a  reason: collision with root package name */
    private o f30985a;

    /* renamed from: b  reason: collision with root package name */
    private Object f30986b = a();

    public r2(byte[] bArr) {
        this.f30985a = new o(bArr, true);
    }

    private Object a() {
        try {
            return this.f30985a.s();
        } catch (IOException e10) {
            throw new y("malformed ASN.1: " + e10, e10);
        }
    }

    public boolean hasMoreElements() {
        return this.f30986b != null;
    }

    public Object nextElement() {
        Object obj = this.f30986b;
        if (obj != null) {
            this.f30986b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
