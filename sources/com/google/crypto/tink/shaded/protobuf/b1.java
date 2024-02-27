package com.google.crypto.tink.shaded.protobuf;

final class b1 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f7054a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7055b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f7056c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7057d;

    b1(o0 o0Var, String str, Object[] objArr) {
        char charAt;
        this.f7054a = o0Var;
        this.f7055b = str;
        this.f7056c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c10 = charAt2 & 8191;
            int i10 = 13;
            int i11 = 1;
            while (true) {
                int i12 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                c10 |= (charAt & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
            charAt2 = c10 | (charAt << i10);
        }
        this.f7057d = charAt2;
    }

    public boolean a() {
        return (this.f7057d & 2) == 2;
    }

    public y0 b() {
        return (this.f7057d & 1) == 1 ? y0.PROTO2 : y0.PROTO3;
    }

    public o0 c() {
        return this.f7054a;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f7056c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f7055b;
    }
}
