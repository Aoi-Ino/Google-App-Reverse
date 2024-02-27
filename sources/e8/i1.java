package e8;

import java.io.OutputStream;

public abstract class i1 {

    /* renamed from: e  reason: collision with root package name */
    protected byte[] f10819e;

    /* renamed from: f  reason: collision with root package name */
    protected int f10820f;

    protected i1(int i10) {
        this.f10820f = i10;
    }

    public boolean a() {
        switch (this.f10820f) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public byte[] b() {
        return this.f10819e;
    }

    public v c() {
        return null;
    }

    public boolean d() {
        return this.f10820f == 5;
    }

    public boolean e() {
        return this.f10820f == 6;
    }

    public boolean f() {
        return this.f10820f == 10;
    }

    public boolean g() {
        return this.f10820f == 4;
    }

    public boolean h() {
        return this.f10820f == 8;
    }

    public boolean i() {
        return this.f10820f == 2;
    }

    /* access modifiers changed from: protected */
    public void j(String str) {
        this.f10819e = o0.c(str, (String) null);
    }

    public void k(c2 c2Var, OutputStream outputStream) {
        byte[] bArr = this.f10819e;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public int l() {
        return this.f10820f;
    }

    public String toString() {
        byte[] bArr = this.f10819e;
        return bArr == null ? super.toString() : o0.d(bArr, (String) null);
    }

    protected i1(int i10, String str) {
        this.f10820f = i10;
        this.f10819e = o0.c(str, (String) null);
    }

    protected i1(int i10, byte[] bArr) {
        this.f10819e = bArr;
        this.f10820f = i10;
    }
}
