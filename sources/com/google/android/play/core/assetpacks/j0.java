package com.google.android.play.core.assetpacks;

final class j0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    private final String f6752a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6753b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6754c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6755d;

    /* renamed from: e  reason: collision with root package name */
    private final long f6756e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6757f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6758g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6759h;

    /* renamed from: i  reason: collision with root package name */
    private final String f6760i;

    j0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        if (str != null) {
            this.f6752a = str;
            this.f6753b = i10;
            this.f6754c = i11;
            this.f6755d = j10;
            this.f6756e = j11;
            this.f6757f = i12;
            this.f6758g = i13;
            if (str2 != null) {
                this.f6759h = str2;
                if (str3 != null) {
                    this.f6760i = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    public final long a() {
        return this.f6755d;
    }

    public final int b() {
        return this.f6754c;
    }

    public final String c() {
        return this.f6752a;
    }

    public final int d() {
        return this.f6753b;
    }

    public final long e() {
        return this.f6756e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f6752a.equals(assetPackState.c()) && this.f6753b == assetPackState.d() && this.f6754c == assetPackState.b() && this.f6755d == assetPackState.a() && this.f6756e == assetPackState.e() && this.f6757f == assetPackState.f() && this.f6758g == assetPackState.g() && this.f6759h.equals(assetPackState.j()) && this.f6760i.equals(assetPackState.k());
        }
    }

    public final int f() {
        return this.f6757f;
    }

    public final int g() {
        return this.f6758g;
    }

    public final int hashCode() {
        int hashCode = this.f6752a.hashCode();
        int i10 = this.f6753b;
        int i11 = this.f6754c;
        long j10 = this.f6755d;
        long j11 = this.f6756e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f6757f) * 1000003) ^ this.f6758g) * 1000003) ^ this.f6759h.hashCode()) * 1000003) ^ this.f6760i.hashCode();
    }

    public final String j() {
        return this.f6759h;
    }

    public final String k() {
        return this.f6760i;
    }

    public final String toString() {
        String str = this.f6752a;
        int i10 = this.f6753b;
        int i11 = this.f6754c;
        long j10 = this.f6755d;
        long j11 = this.f6756e;
        int i12 = this.f6757f;
        int i13 = this.f6758g;
        String str2 = this.f6759h;
        String str3 = this.f6760i;
        StringBuilder sb2 = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append(", updateAvailability=");
        sb2.append(i13);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
