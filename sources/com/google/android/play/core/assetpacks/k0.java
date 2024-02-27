package com.google.android.play.core.assetpacks;

import java.util.Map;

final class k0 extends c {

    /* renamed from: a  reason: collision with root package name */
    private final long f6765a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6766b;

    k0(long j10, Map map) {
        this.f6765a = j10;
        this.f6766b = map;
    }

    public final Map a() {
        return this.f6766b;
    }

    public final long b() {
        return this.f6765a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f6765a == cVar.b() && this.f6766b.equals(cVar.a());
        }
    }

    public final int hashCode() {
        long j10 = this.f6765a;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6766b.hashCode();
    }

    public final String toString() {
        long j10 = this.f6765a;
        String obj = this.f6766b.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j10);
        sb2.append(", packStates=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
