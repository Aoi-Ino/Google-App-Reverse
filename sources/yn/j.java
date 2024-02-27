package yn;

import ap.f;

public class j extends c {
    public int a(byte[] bArr, int i10) {
        n();
        f.h(this.f33100e, bArr, i10);
        f.h(this.f33101f, bArr, i10 + 8);
        f.h(this.f33102g, bArr, i10 + 16);
        f.h(this.f33103h, bArr, i10 + 24);
        f.h(this.f33104i, bArr, i10 + 32);
        f.h(this.f33105j, bArr, i10 + 40);
        f.h(this.f33106k, bArr, i10 + 48);
        f.h(this.f33107l, bArr, i10 + 56);
        r();
        return 64;
    }

    public String b() {
        return "SHA-512";
    }

    public int c() {
        return 64;
    }

    public void r() {
        super.r();
        this.f33100e = 7640891576956012808L;
        this.f33101f = -4942790177534073029L;
        this.f33102g = 4354685564936845355L;
        this.f33103h = -6534734903238641935L;
        this.f33104i = 5840696475078001361L;
        this.f33105j = -7276294671716946913L;
        this.f33106k = 2270897969802886507L;
        this.f33107l = 6620516959819538809L;
    }
}
