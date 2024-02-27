package com.google.android.play.core.assetpacks;

final class i0 extends b {

    /* renamed from: b  reason: collision with root package name */
    private final int f6743b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6744c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6745d;

    i0(int i10, String str, String str2) {
        this.f6743b = i10;
        this.f6744c = str;
        this.f6745d = str2;
    }

    public final String a() {
        return this.f6745d;
    }

    public final int b() {
        return this.f6743b;
    }

    public final String c() {
        return this.f6744c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f6743b == bVar.b() && ((str = this.f6744c) != null ? str.equals(bVar.c()) : bVar.c() == null)) {
                String str2 = this.f6745d;
                String a10 = bVar.a();
                if (str2 != null ? str2.equals(a10) : a10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f6743b ^ 1000003) * 1000003;
        String str = this.f6744c;
        int i11 = 0;
        int hashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6745d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode ^ i11;
    }

    public final String toString() {
        int i10 = this.f6743b;
        String str = this.f6744c;
        String str2 = this.f6745d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
