package com.google.android.play.core.install;

final class a extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    private final int f7030a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7031b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7032c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7033d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7034e;

    a(int i10, long j10, long j11, int i11, String str) {
        this.f7030a = i10;
        this.f7031b = j10;
        this.f7032c = j11;
        this.f7033d = i11;
        if (str != null) {
            this.f7034e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long a() {
        return this.f7031b;
    }

    public final int b() {
        return this.f7033d;
    }

    public final int c() {
        return this.f7030a;
    }

    public final String d() {
        return this.f7034e;
    }

    public final long e() {
        return this.f7032c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f7030a == installState.c() && this.f7031b == installState.a() && this.f7032c == installState.e() && this.f7033d == installState.b() && this.f7034e.equals(installState.d());
        }
    }

    public final int hashCode() {
        int i10 = this.f7030a;
        long j10 = this.f7031b;
        long j11 = this.f7032c;
        return ((((((((i10 ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f7033d) * 1000003) ^ this.f7034e.hashCode();
    }

    public final String toString() {
        int i10 = this.f7030a;
        long j10 = this.f7031b;
        long j11 = this.f7032c;
        int i11 = this.f7033d;
        String str = this.f7034e;
        StringBuilder sb2 = new StringBuilder(str.length() + 164);
        sb2.append("InstallState{installStatus=");
        sb2.append(i10);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", installErrorCode=");
        sb2.append(i11);
        sb2.append(", packageName=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
