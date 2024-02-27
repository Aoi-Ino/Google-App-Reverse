package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class g1 extends OutputStream {

    /* renamed from: e  reason: collision with root package name */
    private final g2 f6710e = new g2();

    /* renamed from: f  reason: collision with root package name */
    private final File f6711f;

    /* renamed from: g  reason: collision with root package name */
    private final b3 f6712g;

    /* renamed from: h  reason: collision with root package name */
    private long f6713h;

    /* renamed from: i  reason: collision with root package name */
    private long f6714i;

    /* renamed from: j  reason: collision with root package name */
    private FileOutputStream f6715j;

    /* renamed from: k  reason: collision with root package name */
    private h3 f6716k;

    g1(File file, b3 b3Var) {
        this.f6711f = file;
        this.f6712g = b3Var;
    }

    public final void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        while (i11 > 0) {
            if (this.f6713h == 0 && this.f6714i == 0) {
                int b10 = this.f6710e.b(bArr, i10, i11);
                if (b10 != -1) {
                    i10 += b10;
                    i11 -= b10;
                    h3 c10 = this.f6710e.c();
                    this.f6716k = c10;
                    if (c10.d()) {
                        this.f6713h = 0;
                        this.f6712g.l(this.f6716k.f(), 0, this.f6716k.f().length);
                        this.f6714i = (long) this.f6716k.f().length;
                    } else if (!this.f6716k.h() || this.f6716k.g()) {
                        byte[] f10 = this.f6716k.f();
                        this.f6712g.l(f10, 0, f10.length);
                        this.f6713h = this.f6716k.b();
                    } else {
                        this.f6712g.j(this.f6716k.f());
                        File file = new File(this.f6711f, this.f6716k.c());
                        file.getParentFile().mkdirs();
                        this.f6713h = this.f6716k.b();
                        this.f6715j = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f6716k.g()) {
                if (this.f6716k.d()) {
                    this.f6712g.e(this.f6714i, bArr, i10, i11);
                    this.f6714i += (long) i11;
                    i12 = i11;
                } else if (this.f6716k.h()) {
                    i12 = (int) Math.min((long) i11, this.f6713h);
                    this.f6715j.write(bArr, i10, i12);
                    long j10 = this.f6713h - ((long) i12);
                    this.f6713h = j10;
                    if (j10 == 0) {
                        this.f6715j.close();
                    }
                } else {
                    i12 = (int) Math.min((long) i11, this.f6713h);
                    int length = this.f6716k.f().length;
                    this.f6712g.e((((long) length) + this.f6716k.b()) - this.f6713h, bArr, i10, i12);
                    this.f6713h -= (long) i12;
                }
                i10 += i12;
                i11 -= i12;
            }
        }
    }
}
