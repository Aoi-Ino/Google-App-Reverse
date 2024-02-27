package com.google.android.play.core.assetpacks;

final class l0 extends a3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f6773a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6774b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6775c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6776d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6777e;

    l0(int i10, String str, long j10, long j11, int i11) {
        this.f6773a = i10;
        this.f6774b = str;
        this.f6775c = j10;
        this.f6776d = j11;
        this.f6777e = i11;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6773a;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f6777e;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f6775c;
    }

    /* access modifiers changed from: package-private */
    public final long d() {
        return this.f6776d;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.f6774b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f6774b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.a3
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.a3 r8 = (com.google.android.play.core.assetpacks.a3) r8
            int r1 = r7.f6773a
            int r3 = r8.a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f6774b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.e()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f6775c
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f6776d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f6777e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.l0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = (this.f6773a ^ 1000003) * 1000003;
        String str = this.f6774b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f6775c;
        long j11 = this.f6776d;
        return ((((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f6777e;
    }

    public final String toString() {
        int i10 = this.f6773a;
        String str = this.f6774b;
        long j10 = this.f6775c;
        long j11 = this.f6776d;
        int i11 = this.f6777e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
