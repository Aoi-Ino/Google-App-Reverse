package j2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final BufferedOutputStream f12693a;

    /* renamed from: b  reason: collision with root package name */
    private final FileDescriptor f12694b;

    /* renamed from: c  reason: collision with root package name */
    private final RandomAccessFile f12695c;

    private b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f12695c = randomAccessFile;
        this.f12694b = randomAccessFile.getFD();
        this.f12693a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public static a d(File file) {
        return new b(file);
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f12693a.write(bArr, i10, i11);
    }

    public void b() {
        this.f12693a.flush();
        this.f12694b.sync();
    }

    public void c(long j10) {
        this.f12695c.seek(j10);
    }

    public void close() {
        this.f12693a.close();
        this.f12695c.close();
    }
}
