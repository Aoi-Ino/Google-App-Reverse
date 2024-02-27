package oo;

import ap.f;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private final int f30275a;

    /* renamed from: b  reason: collision with root package name */
    private final long f30276b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30277c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30278d;

    protected static abstract class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f30279a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f30280b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f30281c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f30282d = 0;

        protected a(int i10) {
            this.f30279a = i10;
        }

        /* access modifiers changed from: protected */
        public abstract a e();

        /* access modifiers changed from: protected */
        public a f(int i10) {
            this.f30282d = i10;
            return e();
        }

        /* access modifiers changed from: protected */
        public a g(int i10) {
            this.f30280b = i10;
            return e();
        }

        /* access modifiers changed from: protected */
        public a h(long j10) {
            this.f30281c = j10;
            return e();
        }
    }

    protected o(a aVar) {
        this.f30275a = aVar.f30280b;
        this.f30276b = aVar.f30281c;
        this.f30277c = aVar.f30279a;
        this.f30278d = aVar.f30282d;
    }

    public final int a() {
        return this.f30278d;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return this.f30275a;
    }

    /* access modifiers changed from: protected */
    public final long c() {
        return this.f30276b;
    }

    /* access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        f.c(this.f30275a, bArr, 0);
        f.h(this.f30276b, bArr, 4);
        f.c(this.f30277c, bArr, 12);
        f.c(this.f30278d, bArr, 28);
        return bArr;
    }
}
