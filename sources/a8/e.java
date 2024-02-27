package a8;

import e8.u;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class e implements d {

    /* renamed from: a  reason: collision with root package name */
    protected v f259a;

    /* renamed from: b  reason: collision with root package name */
    protected f f260b;

    /* renamed from: c  reason: collision with root package name */
    protected u f261c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f262d = false;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f263e = false;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f264f = true;

    protected e(f fVar, OutputStream outputStream) {
        this.f260b = fVar;
        this.f261c = new u(new BufferedOutputStream(outputStream));
    }

    public static final byte[] f(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public void a() {
        this.f262d = true;
    }

    public boolean b(h hVar) {
        return false;
    }

    public boolean c(v vVar) {
        this.f259a = vVar;
        return true;
    }

    public void close() {
        this.f262d = false;
        try {
            this.f261c.flush();
            if (this.f264f) {
                this.f261c.close();
            }
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public boolean d() {
        return this.f262d;
    }

    public boolean e(float f10, float f11, float f12, float f13) {
        return false;
    }

    public boolean g() {
        return this.f263e;
    }
}
