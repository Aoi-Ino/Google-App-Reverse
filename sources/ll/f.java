package ll;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f24924b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f24925c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a  reason: collision with root package name */
    private final b f24926a;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f24927a;

        public a(byte[] bArr, int i10) {
            this.f24927a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            return this.f24927a.getShort(i10);
        }

        public int b(int i10) {
            return this.f24927a.getInt(i10);
        }

        public int c() {
            return this.f24927a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.f24927a.order(byteOrder);
        }
    }

    private interface b {
        int a(byte[] bArr, int i10);

        short b();

        int c();

        long skip(long j10);
    }

    private static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f24928a;

        public c(InputStream inputStream) {
            this.f24928a = inputStream;
        }

        public int a(byte[] bArr, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                int read = this.f24928a.read(bArr, i10 - i11, i11);
                if (read == -1) {
                    break;
                }
                i11 -= read;
            }
            return i10 - i11;
        }

        public short b() {
            return (short) (this.f24928a.read() & 255);
        }

        public int c() {
            return ((this.f24928a.read() << 8) & 65280) | (this.f24928a.read() & 255);
        }

        public long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f24928a.skip(j11);
                if (skip <= 0) {
                    if (this.f24928a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public f(InputStream inputStream) {
        this.f24926a = new c(inputStream);
    }

    private static int a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static void b(l0.a aVar, int i10, int i11, String str) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            l0.a aVar2 = new l0.a(str);
            for (int i12 = 0; i12 < 22; i12++) {
                String str2 = strArr[i12];
                String j10 = aVar.j(str2);
                if (!TextUtils.isEmpty(j10)) {
                    aVar2.Y(str2, j10);
                }
            }
            aVar2.Y("ImageWidth", String.valueOf(i10));
            aVar2.Y("ImageLength", String.valueOf(i11));
            aVar2.Y("Orientation", "0");
            aVar2.U();
        } catch (IOException e10) {
            Log.d("ImageHeaderParser", e10.getMessage());
        }
    }

    private static boolean d(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean e(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f24924b.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f24924b;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    return false;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    private int f() {
        short b10;
        int c10;
        long j10;
        long skip;
        do {
            short b11 = this.f24926a.b();
            if (b11 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + b11);
                }
                return -1;
            }
            b10 = this.f24926a.b();
            if (b10 == 218) {
                return -1;
            }
            if (b10 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c10 = this.f24926a.c() - 2;
            if (b10 == 225) {
                return c10;
            }
            j10 = (long) c10;
            skip = this.f24926a.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + b10 + ", wanted to skip: " + c10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(ll.f.a r12) {
        /*
            r0 = 6
            short r1 = r12.a(r0)
            r2 = 19789(0x4d4d, float:2.773E-41)
            r3 = 3
            java.lang.String r4 = "ImageHeaderParser"
            if (r1 != r2) goto L_0x000f
        L_0x000c:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L_0x0031
        L_0x000f:
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L_0x0016
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L_0x0031
        L_0x0016:
            boolean r2 = android.util.Log.isLoggable(r4, r3)
            if (r2 == 0) goto L_0x000c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Unknown endianness = "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.d(r4, r1)
            goto L_0x000c
        L_0x0031:
            r12.d(r1)
            r1 = 10
            int r1 = r12.b(r1)
            int r1 = r1 + r0
            short r0 = r12.a(r1)
            r2 = 0
        L_0x0040:
            if (r2 >= r0) goto L_0x0125
            int r5 = a(r1, r2)
            short r6 = r12.a(r5)
            r7 = 274(0x112, float:3.84E-43)
            if (r6 == r7) goto L_0x0050
            goto L_0x0121
        L_0x0050:
            int r7 = r5 + 2
            short r7 = r12.a(r7)
            r8 = 1
            if (r7 < r8) goto L_0x0113
            r8 = 12
            if (r7 <= r8) goto L_0x005f
            goto L_0x0113
        L_0x005f:
            int r8 = r5 + 4
            int r8 = r12.b(r8)
            if (r8 >= 0) goto L_0x0074
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L_0x0121
            java.lang.String r5 = "Negative tiff component count"
        L_0x006f:
            android.util.Log.d(r4, r5)
            goto L_0x0121
        L_0x0074:
            boolean r9 = android.util.Log.isLoggable(r4, r3)
            java.lang.String r10 = " tagType="
            if (r9 == 0) goto L_0x00a6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Got tagIndex="
            r9.append(r11)
            r9.append(r2)
            r9.append(r10)
            r9.append(r6)
            java.lang.String r11 = " formatCode="
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = " componentCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x00a6:
            int[] r9 = f24925c
            r9 = r9[r7]
            int r8 = r8 + r9
            r9 = 4
            if (r8 <= r9) goto L_0x00c6
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L_0x0121
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got byte count > 4, not orientation, continuing, formatCode="
        L_0x00bb:
            r5.append(r6)
            r5.append(r7)
        L_0x00c1:
            java.lang.String r5 = r5.toString()
            goto L_0x006f
        L_0x00c6:
            int r5 = r5 + 8
            if (r5 < 0) goto L_0x00f4
            int r7 = r12.c()
            if (r5 <= r7) goto L_0x00d1
            goto L_0x00f4
        L_0x00d1:
            if (r8 < 0) goto L_0x00e0
            int r8 = r8 + r5
            int r7 = r12.c()
            if (r8 <= r7) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            short r12 = r12.a(r5)
            return r12
        L_0x00e0:
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L_0x0121
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Illegal number of bytes for TI tag data tagType="
            r5.append(r7)
            r5.append(r6)
            goto L_0x00c1
        L_0x00f4:
            boolean r7 = android.util.Log.isLoggable(r4, r3)
            if (r7 == 0) goto L_0x0121
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal tagValueOffset="
            r7.append(r8)
            r7.append(r5)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            goto L_0x006f
        L_0x0113:
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L_0x0121
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got invalid format code = "
            goto L_0x00bb
        L_0x0121:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0125:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.f.g(ll.f$a):int");
    }

    private int h(byte[] bArr, int i10) {
        int a10 = this.f24926a.a(bArr, i10);
        if (a10 != i10) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + a10);
            }
            return -1;
        } else if (e(bArr, i10)) {
            return g(new a(bArr, i10));
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    public int c() {
        int c10 = this.f24926a.c();
        if (!d(c10)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + c10);
            }
            return -1;
        }
        int f10 = f();
        if (f10 != -1) {
            return h(new byte[f10], f10);
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
        }
        return -1;
    }
}
