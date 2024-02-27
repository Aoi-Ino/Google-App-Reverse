package t5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class v {
    public static long a(w wVar, InputStream inputStream, OutputStream outputStream, long j10) {
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new u(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j11 = 0;
            while (true) {
                long j12 = j10 - j11;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    b(bArr, wVar, outputStream, readUnsignedShort, read2, j12);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                b(bArr, wVar, outputStream, readUnsignedShort2, read2, j12);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, readUnsignedShort3, read2, j12);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    b(bArr, wVar, outputStream, readInt2, read2, j12);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                b(bArr, wVar, outputStream, readInt3, read2, j12);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, readInt4, read2, j12);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, readLong, read2, j12);
                                break;
                            default:
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                        }
                        j11 += (long) read2;
                    } else {
                        outputStream.flush();
                        return j11;
                    }
                } catch (Throwable th2) {
                    outputStream.flush();
                    throw th2;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new u(sb2.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(byte[] r7, t5.w r8, java.io.OutputStream r9, long r10, int r12, long r13) {
        /*
            if (r12 < 0) goto L_0x0061
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            long r5 = (long) r12
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0051
            t5.x r13 = new t5.x     // Catch:{ EOFException -> 0x0043 }
            r1 = r13
            r2 = r8
            r3 = r10
            r1.<init>(r2, r3, r5)     // Catch:{ EOFException -> 0x0043 }
            java.io.InputStream r8 = r13.f()     // Catch:{ EOFException -> 0x0043 }
        L_0x0019:
            if (r12 <= 0) goto L_0x0045
            r10 = 16384(0x4000, float:2.2959E-41)
            int r10 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x0038 }
            r11 = 0
            r13 = r11
        L_0x0023:
            if (r13 >= r10) goto L_0x003a
            int r14 = r10 - r13
            int r14 = r8.read(r7, r13, r14)     // Catch:{ all -> 0x0038 }
            r0 = -1
            if (r14 == r0) goto L_0x0030
            int r13 = r13 + r14
            goto L_0x0023
        L_0x0030:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r9 = "truncated input stream"
            r7.<init>(r9)     // Catch:{ all -> 0x0038 }
            throw r7     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r7 = move-exception
            goto L_0x003f
        L_0x003a:
            r9.write(r7, r11, r10)     // Catch:{ all -> 0x0038 }
            int r12 = r12 - r10
            goto L_0x0019
        L_0x003f:
            r8.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r7     // Catch:{ EOFException -> 0x0043 }
        L_0x0043:
            r7 = move-exception
            goto L_0x0049
        L_0x0045:
            r8.close()     // Catch:{ EOFException -> 0x0043 }
            return
        L_0x0049:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "patch underrun"
            r8.<init>(r9, r7)
            throw r8
        L_0x0051:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Output length overrun"
            r7.<init>(r8)
            throw r7
        L_0x0059:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "inputOffset negative"
            r7.<init>(r8)
            throw r7
        L_0x0061:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "copyLength negative"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.v.b(byte[], t5.w, java.io.OutputStream, long, int, long):void");
    }

    private static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i10) <= j10) {
            while (i10 > 0) {
                try {
                    int min = Math.min(i10, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i10 -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
