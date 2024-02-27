package com.google.android.play.core.assetpacks;

import java.io.InputStream;

final class g0 extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    private final InputStream f6708e;

    /* renamed from: f  reason: collision with root package name */
    private long f6709f;

    g0(InputStream inputStream, long j10) {
        this.f6708e = inputStream;
        this.f6709f = j10;
    }

    public final void close() {
        super.close();
        this.f6708e.close();
        this.f6709f = 0;
    }

    public final int read() {
        long j10 = this.f6709f;
        if (j10 <= 0) {
            return -1;
        }
        this.f6709f = j10 - 1;
        return this.f6708e.read();
    }

    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f6709f;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f6708e.read(bArr, i10, (int) Math.min((long) i11, j10));
        if (read != -1) {
            this.f6709f -= (long) read;
        }
        return read;
    }
}
