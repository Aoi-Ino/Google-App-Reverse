package e8;

import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class f2 implements DataInput {

    /* renamed from: e  reason: collision with root package name */
    t f10664e;

    /* renamed from: f  reason: collision with root package name */
    RandomAccessFile f10665f;

    /* renamed from: g  reason: collision with root package name */
    boolean f10666g;

    /* renamed from: h  reason: collision with root package name */
    String f10667h;

    /* renamed from: i  reason: collision with root package name */
    byte[] f10668i;

    /* renamed from: j  reason: collision with root package name */
    int f10669j;

    /* renamed from: k  reason: collision with root package name */
    byte f10670k;

    /* renamed from: l  reason: collision with root package name */
    boolean f10671l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f10672m = 0;

    public f2(f2 f2Var) {
        this.f10667h = f2Var.f10667h;
        this.f10668i = f2Var.f10668i;
        this.f10672m = f2Var.f10672m;
        this.f10666g = f2Var.f10666g;
    }

    public static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 1) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean b(IOException iOException) {
        return iOException.getMessage().indexOf("Map failed") >= 0;
    }

    public int c() {
        int i10;
        d();
        boolean z10 = this.f10671l;
        if (this.f10668i == null) {
            i10 = (int) (this.f10666g ? this.f10665f.getFilePointer() : this.f10664e.c());
        } else {
            i10 = this.f10669j;
        }
        return (i10 - (z10 ? 1 : 0)) - this.f10672m;
    }

    public void close() {
        this.f10671l = false;
        t tVar = this.f10664e;
        if (tVar != null) {
            tVar.b();
            this.f10664e = null;
            this.f10666g = true;
            return;
        }
        RandomAccessFile randomAccessFile = this.f10665f;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f10665f = null;
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.f10667h != null && this.f10664e == null && this.f10665f == null) {
            f();
        }
    }

    public int e() {
        int length;
        byte[] bArr = this.f10668i;
        if (bArr == null) {
            d();
            length = (int) (this.f10666g ? this.f10665f.length() : this.f10664e.e());
        } else {
            length = bArr.length;
        }
        return length - this.f10672m;
    }

    public void f() {
        String str = this.f10667h;
        if (str != null && this.f10664e == null && this.f10665f == null) {
            if (this.f10666g) {
                this.f10665f = new RandomAccessFile(this.f10667h, "r");
            } else {
                this.f10664e = new t(str, "r");
            }
        }
        j(0);
    }

    public final int g() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        throw new EOFException();
    }

    public final short h() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read2 << 8) + read);
        }
        throw new EOFException();
    }

    public final int i() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read2 << 8) + read;
        }
        throw new EOFException();
    }

    public void j(int i10) {
        int i11 = i10 + this.f10672m;
        this.f10671l = false;
        if (this.f10668i == null) {
            d();
            if (this.f10666g) {
                this.f10665f.seek((long) i11);
            } else {
                this.f10664e.h((long) i11);
            }
        } else {
            this.f10669j = i11;
        }
    }

    public int read() {
        byte b10;
        if (this.f10671l) {
            this.f10671l = false;
            b10 = this.f10670k;
        } else {
            byte[] bArr = this.f10668i;
            if (bArr == null) {
                return this.f10666g ? this.f10665f.read() : this.f10664e.f();
            }
            int i10 = this.f10669j;
            if (i10 >= bArr.length) {
                return -1;
            }
            this.f10669j = i10 + 1;
            b10 = bArr[i10];
        }
        return b10 & 255;
    }

    public boolean readBoolean() {
        int read = read();
        if (read >= 0) {
            return read != 0;
        }
        throw new EOFException();
    }

    public byte readByte() {
        int read = read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public char readChar() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (char) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public int readInt() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    public String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = false;
        int i10 = -1;
        while (!z10) {
            i10 = read();
            if (!(i10 == -1 || i10 == 10)) {
                if (i10 != 13) {
                    stringBuffer.append((char) i10);
                } else {
                    int c10 = c();
                    if (read() != 10) {
                        j(c10);
                    }
                }
            }
            z10 = true;
        }
        if (i10 == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public long readLong() {
        return (((long) readInt()) << 32) + (((long) readInt()) & 4294967295L);
    }

    public short readShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    public String readUTF() {
        return DataInputStream.readUTF(this);
    }

    public int readUnsignedByte() {
        int read = read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new EOFException();
    }

    public int skipBytes(int i10) {
        int i11 = 0;
        if (i10 <= 0) {
            return 0;
        }
        if (this.f10671l) {
            this.f10671l = false;
            i11 = 1;
            if (i10 == 1) {
                return 1;
            }
            i10--;
        }
        int c10 = c();
        int e10 = e();
        int i12 = i10 + c10;
        if (i12 <= e10) {
            e10 = i12;
        }
        j(e10);
        return (e10 - c10) + i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[SYNTHETIC, Splitter:B:50:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f2(java.lang.String r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f10671l = r0
            r3.f10672m = r0
            r3.f10666g = r6
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.canRead()
            if (r1 != 0) goto L_0x007b
            java.lang.String r5 = "file:/"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "http://"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "https://"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "jar:"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "wsjar:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x003e
            goto L_0x0063
        L_0x003e:
            java.io.InputStream r5 = e8.c.q(r4)
            if (r5 == 0) goto L_0x0053
            byte[] r4 = a(r5)     // Catch:{ all -> 0x004e }
            r3.f10668i = r4     // Catch:{ all -> 0x004e }
            r5.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            return
        L_0x004e:
            r4 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r4
        L_0x0053:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "1.not.found.as.file.or.resource"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = b8.a.b(r6, r4)
            r5.<init>(r4)
            throw r5
        L_0x0063:
            java.net.URL r5 = new java.net.URL
            r5.<init>(r4)
            java.io.InputStream r4 = r5.openStream()
            byte[] r5 = a(r4)     // Catch:{ all -> 0x0076 }
            r3.f10668i = r5     // Catch:{ all -> 0x0076 }
            r4.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            return
        L_0x0076:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            throw r5
        L_0x007b:
            if (r5 == 0) goto L_0x0099
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x008f }
            r5.<init>(r0)     // Catch:{ all -> 0x008f }
            byte[] r4 = a(r5)     // Catch:{ all -> 0x008d }
            r3.f10668i = r4     // Catch:{ all -> 0x008d }
            r5.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            return
        L_0x008d:
            r4 = move-exception
            goto L_0x0093
        L_0x008f:
            r5 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0093:
            if (r5 == 0) goto L_0x0098
            r5.close()     // Catch:{ Exception -> 0x0098 }
        L_0x0098:
            throw r4
        L_0x0099:
            r3.f10667h = r4
            java.lang.String r5 = "r"
            if (r6 == 0) goto L_0x00a7
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r5)
        L_0x00a4:
            r3.f10665f = r6
            goto L_0x00bf
        L_0x00a7:
            e8.t r6 = new e8.t     // Catch:{ IOException -> 0x00af }
            r6.<init>(r4, r5)     // Catch:{ IOException -> 0x00af }
            r3.f10664e = r6     // Catch:{ IOException -> 0x00af }
            goto L_0x00bf
        L_0x00af:
            r6 = move-exception
            boolean r0 = b(r6)
            if (r0 == 0) goto L_0x00c0
            r6 = 1
            r3.f10666g = r6
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r5)
            goto L_0x00a4
        L_0x00bf:
            return
        L_0x00c0:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.f2.<init>(java.lang.String, boolean, boolean):void");
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (this.f10671l) {
            this.f10671l = false;
            i12 = 1;
            if (i11 == 1) {
                bArr[i10] = this.f10670k;
                return 1;
            }
            bArr[i10] = this.f10670k;
            i11--;
            i10++;
        }
        byte[] bArr2 = this.f10668i;
        if (bArr2 == null) {
            return (this.f10666g ? this.f10665f.read(bArr, i10, i11) : this.f10664e.g(bArr, i10, i11)) + i12;
        }
        int i13 = this.f10669j;
        if (i13 >= bArr2.length) {
            return -1;
        }
        if (i13 + i11 > bArr2.length) {
            i11 = bArr2.length - i13;
        }
        System.arraycopy(bArr2, i13, bArr, i10, i11);
        this.f10669j += i11;
        return i11 + i12;
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int read = read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
            } else {
                throw new EOFException();
            }
        } while (i12 < i11);
    }

    public f2(byte[] bArr) {
        this.f10668i = bArr;
    }
}
