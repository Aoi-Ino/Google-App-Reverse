package com.google.android.play.core.assetpacks;

import f.j;
import java.util.Arrays;

final class m0 extends h3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6793a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6794b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6795c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6796d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6797e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f6798f;

    m0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f6793a = str;
        this.f6794b = j10;
        this.f6795c = i10;
        this.f6796d = z10;
        this.f6797e = z11;
        this.f6798f = bArr;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6795c;
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.f6794b;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f6793a;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.f6797e;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.f6796d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            String str = this.f6793a;
            if (str != null ? str.equals(h3Var.c()) : h3Var.c() == null) {
                if (this.f6794b == h3Var.b() && this.f6795c == h3Var.a() && this.f6796d == h3Var.e() && this.f6797e == h3Var.d()) {
                    if (Arrays.equals(this.f6798f, h3Var instanceof m0 ? ((m0) h3Var).f6798f : h3Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final byte[] f() {
        return this.f6798f;
    }

    public final int hashCode() {
        String str = this.f6793a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f6794b;
        int i10 = 1231;
        int i11 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f6795c) * 1000003) ^ (true != this.f6796d ? 1237 : 1231)) * 1000003;
        if (true != this.f6797e) {
            i10 = 1237;
        }
        return ((i11 ^ i10) * 1000003) ^ Arrays.hashCode(this.f6798f);
    }

    public final String toString() {
        String str = this.f6793a;
        long j10 = this.f6794b;
        int i10 = this.f6795c;
        boolean z10 = this.f6796d;
        boolean z11 = this.f6797e;
        String arrays = Arrays.toString(this.f6798f);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + j.M0 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
