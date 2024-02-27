package l0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final e[] Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f13195a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f13196b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e[] f13197c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f13198d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e f13199e0 = new e("StripOffsets", 273, 3);

    /* renamed from: f0  reason: collision with root package name */
    private static final e[] f13200f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f13201g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final e[] f13202h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f13203i0;

    /* renamed from: j0  reason: collision with root package name */
    static final e[][] f13204j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final e[] f13205k0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: l0  reason: collision with root package name */
    private static final e f13206l0 = new e("JPEGInterchangeFormat", 513, 4);

    /* renamed from: m0  reason: collision with root package name */
    private static final e f13207m0 = new e("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: n0  reason: collision with root package name */
    private static final HashMap[] f13208n0;

    /* renamed from: o0  reason: collision with root package name */
    private static final HashMap[] f13209o0;

    /* renamed from: p0  reason: collision with root package name */
    private static final HashSet f13210p0 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: q0  reason: collision with root package name */
    private static final HashMap f13211q0 = new HashMap();

    /* renamed from: r0  reason: collision with root package name */
    static final Charset f13212r0;

    /* renamed from: s0  reason: collision with root package name */
    static final byte[] f13213s0;

    /* renamed from: t0  reason: collision with root package name */
    private static final byte[] f13214t0;

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f13215u0 = Pattern.compile(".*[1-9].*");

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f13216v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f13217v0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: w  reason: collision with root package name */
    private static final List f13218w = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: w0  reason: collision with root package name */
    private static final Pattern f13219w0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: x  reason: collision with root package name */
    private static final List f13220x = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: x0  reason: collision with root package name */
    private static final Pattern f13221x0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f13222y = {8, 8, 8};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f13223z = {4};

    /* renamed from: a  reason: collision with root package name */
    private String f13224a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f13225b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f13226c;

    /* renamed from: d  reason: collision with root package name */
    private int f13227d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13228e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap[] f13229f;

    /* renamed from: g  reason: collision with root package name */
    private Set f13230g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f13231h = ByteOrder.BIG_ENDIAN;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13232i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13233j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13234k;

    /* renamed from: l  reason: collision with root package name */
    private int f13235l;

    /* renamed from: m  reason: collision with root package name */
    private int f13236m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f13237n;

    /* renamed from: o  reason: collision with root package name */
    private int f13238o;

    /* renamed from: p  reason: collision with root package name */
    private int f13239p;

    /* renamed from: q  reason: collision with root package name */
    private int f13240q;

    /* renamed from: r  reason: collision with root package name */
    private int f13241r;

    /* renamed from: s  reason: collision with root package name */
    private int f13242s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13243t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f13244u;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    class C0176a extends MediaDataSource {

        /* renamed from: e  reason: collision with root package name */
        long f13245e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f13246f;

        C0176a(b bVar) {
            this.f13246f = bVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f13245e;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f13246f.available())) {
                        return -1;
                    }
                    this.f13246f.g(j10);
                    this.f13245e = j10;
                }
                if (i11 > this.f13246f.available()) {
                    i11 = this.f13246f.available();
                }
                int read = this.f13246f.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f13245e += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f13245e = -1;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: i  reason: collision with root package name */
        private static final ByteOrder f13248i = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: j  reason: collision with root package name */
        private static final ByteOrder f13249j = ByteOrder.BIG_ENDIAN;

        /* renamed from: e  reason: collision with root package name */
        private DataInputStream f13250e;

        /* renamed from: f  reason: collision with root package name */
        private ByteOrder f13251f;

        /* renamed from: g  reason: collision with root package name */
        final int f13252g;

        /* renamed from: h  reason: collision with root package name */
        int f13253h;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int available() {
            return this.f13250e.available();
        }

        public int c() {
            return this.f13252g;
        }

        public int e() {
            return this.f13253h;
        }

        public long f() {
            return ((long) readInt()) & 4294967295L;
        }

        public void g(long j10) {
            int i10 = this.f13253h;
            if (((long) i10) > j10) {
                this.f13253h = 0;
                this.f13250e.reset();
                this.f13250e.mark(this.f13252g);
            } else {
                j10 -= (long) i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void h(ByteOrder byteOrder) {
            this.f13251f = byteOrder;
        }

        public synchronized void mark(int i10) {
            this.f13250e.mark(i10);
        }

        public int read() {
            this.f13253h++;
            return this.f13250e.read();
        }

        public boolean readBoolean() {
            this.f13253h++;
            return this.f13250e.readBoolean();
        }

        public byte readByte() {
            int i10 = this.f13253h + 1;
            this.f13253h = i10;
            if (i10 <= this.f13252g) {
                int read = this.f13250e.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f13253h += 2;
            return this.f13250e.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            int length = this.f13253h + bArr.length;
            this.f13253h = length;
            if (length > this.f13252g) {
                throw new EOFException();
            } else if (this.f13250e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i10 = this.f13253h + 4;
            this.f13253h = i10;
            if (i10 <= this.f13252g) {
                int read = this.f13250e.read();
                int read2 = this.f13250e.read();
                int read3 = this.f13250e.read();
                int read4 = this.f13250e.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f13251f;
                    if (byteOrder == f13248i) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f13249j) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f13251f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            int i10 = this.f13253h + 8;
            this.f13253h = i10;
            if (i10 <= this.f13252g) {
                int read = this.f13250e.read();
                int read2 = this.f13250e.read();
                int read3 = this.f13250e.read();
                int read4 = this.f13250e.read();
                int read5 = this.f13250e.read();
                int read6 = this.f13250e.read();
                int read7 = this.f13250e.read();
                int read8 = this.f13250e.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f13251f;
                    if (byteOrder == f13248i) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i11 = read2;
                    if (byteOrder == f13249j) {
                        return (((long) read) << 56) + (((long) i11) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f13251f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i10 = this.f13253h + 2;
            this.f13253h = i10;
            if (i10 <= this.f13252g) {
                int read = this.f13250e.read();
                int read2 = this.f13250e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f13251f;
                    if (byteOrder == f13248i) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f13249j) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f13251f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f13253h += 2;
            return this.f13250e.readUTF();
        }

        public int readUnsignedByte() {
            this.f13253h++;
            return this.f13250e.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i10 = this.f13253h + 2;
            this.f13253h = i10;
            if (i10 <= this.f13252g) {
                int read = this.f13250e.read();
                int read2 = this.f13250e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f13251f;
                    if (byteOrder == f13248i) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f13249j) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f13251f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i10) {
            int min = Math.min(i10, this.f13252g - this.f13253h);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f13250e.skipBytes(min - i11);
            }
            this.f13253h += i11;
            return i11;
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f13251f = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f13250e = dataInputStream;
            int available = dataInputStream.available();
            this.f13252g = available;
            this.f13253h = 0;
            this.f13250e.mark(available);
            this.f13251f = byteOrder;
        }

        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f13250e.read(bArr, i10, i11);
            this.f13253h += read;
            return read;
        }

        public void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f13253h + i11;
            this.f13253h = i12;
            if (i12 > this.f13252g) {
                throw new EOFException();
            } else if (this.f13250e.read(bArr, i10, i11) != i11) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public b(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    private static class c extends FilterOutputStream {

        /* renamed from: e  reason: collision with root package name */
        final OutputStream f13254e;

        /* renamed from: f  reason: collision with root package name */
        private ByteOrder f13255f;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f13254e = outputStream;
            this.f13255f = byteOrder;
        }

        public void c(ByteOrder byteOrder) {
            this.f13255f = byteOrder;
        }

        public void e(int i10) {
            this.f13254e.write(i10);
        }

        public void f(int i10) {
            OutputStream outputStream;
            ByteOrder byteOrder = this.f13255f;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f13254e.write(i10 & 255);
                this.f13254e.write((i10 >>> 8) & 255);
                this.f13254e.write((i10 >>> 16) & 255);
                outputStream = this.f13254e;
                i10 >>>= 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f13254e.write((i10 >>> 24) & 255);
                this.f13254e.write((i10 >>> 16) & 255);
                this.f13254e.write((i10 >>> 8) & 255);
                outputStream = this.f13254e;
            } else {
                return;
            }
            outputStream.write(i10 & 255);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: short} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(short r3) {
            /*
                r2 = this;
                java.nio.ByteOrder r0 = r2.f13255f
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                if (r0 != r1) goto L_0x0017
                java.io.OutputStream r0 = r2.f13254e
                r1 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.f13254e
                int r3 = r3 >>> 8
            L_0x0011:
                r3 = r3 & 255(0xff, float:3.57E-43)
                r0.write(r3)
                goto L_0x0027
            L_0x0017:
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                if (r0 != r1) goto L_0x0027
                java.io.OutputStream r0 = r2.f13254e
                int r1 = r3 >>> 8
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                java.io.OutputStream r0 = r2.f13254e
                goto L_0x0011
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.a.c.g(short):void");
        }

        public void h(long j10) {
            f((int) j10);
        }

        public void l(int i10) {
            g((short) i10);
        }

        public void write(byte[] bArr) {
            this.f13254e.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            this.f13254e.write(bArr, i10, i11);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13256a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13257b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13258c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f13259d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f13256a = i10;
            this.f13257b = i11;
            this.f13258c = j10;
            this.f13259d = bArr;
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.f13212r0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f13264a);
                wrap.putInt((int) fVar.f13265b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + 0).getBytes(a.f13212r0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f13264a);
                wrap.putInt((int) fVar.f13265b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.X[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof double[]) {
                    double[] dArr = (double[]) o10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof f[]) {
                    f[] fVarArr = (f[]) o10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(o10 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f13264a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f13265b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0199 A[SYNTHETIC, Splitter:B:163:0x0199] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                l0.a$b r3 = new l0.a$b     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                byte[] r4 = r10.f13259d     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0185, all -> 0x0183 }
                r3.h(r11)     // Catch:{ IOException -> 0x0033 }
                int r11 = r10.f13256a     // Catch:{ IOException -> 0x0033 }
                r4 = 0
                switch(r11) {
                    case 1: goto L_0x0152;
                    case 2: goto L_0x010a;
                    case 3: goto L_0x00f0;
                    case 4: goto L_0x00d6;
                    case 5: goto L_0x00b3;
                    case 6: goto L_0x0152;
                    case 7: goto L_0x010a;
                    case 8: goto L_0x0099;
                    case 9: goto L_0x007f;
                    case 10: goto L_0x005a;
                    case 11: goto L_0x003f;
                    case 12: goto L_0x001e;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r3.close()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x001d:
                return r2
            L_0x001e:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x0022:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0036
                double r5 = r3.readDouble()     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x0022
            L_0x002f:
                r11 = move-exception
                r2 = r3
                goto L_0x0197
            L_0x0033:
                r11 = move-exception
                goto L_0x0187
            L_0x0036:
                r3.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003e
            L_0x003a:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x003e:
                return r11
            L_0x003f:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x0043:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0051
                float r5 = r3.readFloat()     // Catch:{ IOException -> 0x0033 }
                double r5 = (double) r5     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x0043
            L_0x0051:
                r3.close()     // Catch:{ IOException -> 0x0055 }
                goto L_0x0059
            L_0x0055:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0059:
                return r11
            L_0x005a:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                l0.a$f[] r11 = new l0.a.f[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x005e:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0076
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x0033 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0033 }
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x0033 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x0033 }
                l0.a$f r9 = new l0.a$f     // Catch:{ IOException -> 0x0033 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r9     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x005e
            L_0x0076:
                r3.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x007e:
                return r11
            L_0x007f:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x0083:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0090
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x0083
            L_0x0090:
                r3.close()     // Catch:{ IOException -> 0x0094 }
                goto L_0x0098
            L_0x0094:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0098:
                return r11
            L_0x0099:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x009d:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x00aa
                short r5 = r3.readShort()     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x009d
            L_0x00aa:
                r3.close()     // Catch:{ IOException -> 0x00ae }
                goto L_0x00b2
            L_0x00ae:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00b2:
                return r11
            L_0x00b3:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                l0.a$f[] r11 = new l0.a.f[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x00b7:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x00cd
                long r5 = r3.f()     // Catch:{ IOException -> 0x0033 }
                long r7 = r3.f()     // Catch:{ IOException -> 0x0033 }
                l0.a$f r9 = new l0.a$f     // Catch:{ IOException -> 0x0033 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r9     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x00b7
            L_0x00cd:
                r3.close()     // Catch:{ IOException -> 0x00d1 }
                goto L_0x00d5
            L_0x00d1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00d5:
                return r11
            L_0x00d6:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x00da:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x00e7
                long r5 = r3.f()     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x00da
            L_0x00e7:
                r3.close()     // Catch:{ IOException -> 0x00eb }
                goto L_0x00ef
            L_0x00eb:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00ef:
                return r11
            L_0x00f0:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0033 }
            L_0x00f4:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0101
                int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0033 }
                r11[r4] = r5     // Catch:{ IOException -> 0x0033 }
                int r4 = r4 + 1
                goto L_0x00f4
            L_0x0101:
                r3.close()     // Catch:{ IOException -> 0x0105 }
                goto L_0x0109
            L_0x0105:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0109:
                return r11
            L_0x010a:
                int r11 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                byte[] r5 = l0.a.Y     // Catch:{ IOException -> 0x0033 }
                int r5 = r5.length     // Catch:{ IOException -> 0x0033 }
                if (r11 < r5) goto L_0x0124
                r11 = r4
            L_0x0112:
                byte[] r5 = l0.a.Y     // Catch:{ IOException -> 0x0033 }
                int r6 = r5.length     // Catch:{ IOException -> 0x0033 }
                if (r11 >= r6) goto L_0x0123
                byte[] r6 = r10.f13259d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0033 }
                byte r5 = r5[r11]     // Catch:{ IOException -> 0x0033 }
                if (r6 == r5) goto L_0x0120
                goto L_0x0124
            L_0x0120:
                int r11 = r11 + 1
                goto L_0x0112
            L_0x0123:
                int r4 = r5.length     // Catch:{ IOException -> 0x0033 }
            L_0x0124:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033 }
                r11.<init>()     // Catch:{ IOException -> 0x0033 }
            L_0x0129:
                int r5 = r10.f13257b     // Catch:{ IOException -> 0x0033 }
                if (r4 >= r5) goto L_0x0145
                byte[] r5 = r10.f13259d     // Catch:{ IOException -> 0x0033 }
                byte r5 = r5[r4]     // Catch:{ IOException -> 0x0033 }
                if (r5 != 0) goto L_0x0134
                goto L_0x0145
            L_0x0134:
                r6 = 32
                if (r5 < r6) goto L_0x013d
                char r5 = (char) r5     // Catch:{ IOException -> 0x0033 }
                r11.append(r5)     // Catch:{ IOException -> 0x0033 }
                goto L_0x0142
            L_0x013d:
                r5 = 63
                r11.append(r5)     // Catch:{ IOException -> 0x0033 }
            L_0x0142:
                int r4 = r4 + 1
                goto L_0x0129
            L_0x0145:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0033 }
                r3.close()     // Catch:{ IOException -> 0x014d }
                goto L_0x0151
            L_0x014d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0151:
                return r11
            L_0x0152:
                byte[] r11 = r10.f13259d     // Catch:{ IOException -> 0x0033 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0033 }
                r6 = 1
                if (r5 != r6) goto L_0x0173
                byte r5 = r11[r4]     // Catch:{ IOException -> 0x0033 }
                if (r5 < 0) goto L_0x0173
                if (r5 > r6) goto L_0x0173
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0033 }
                int r5 = r5 + 48
                char r5 = (char) r5     // Catch:{ IOException -> 0x0033 }
                r6[r4] = r5     // Catch:{ IOException -> 0x0033 }
                r11.<init>(r6)     // Catch:{ IOException -> 0x0033 }
                r3.close()     // Catch:{ IOException -> 0x016e }
                goto L_0x0172
            L_0x016e:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0172:
                return r11
            L_0x0173:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                java.nio.charset.Charset r5 = l0.a.f13212r0     // Catch:{ IOException -> 0x0033 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0033 }
                r3.close()     // Catch:{ IOException -> 0x017e }
                goto L_0x0182
            L_0x017e:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0182:
                return r4
            L_0x0183:
                r11 = move-exception
                goto L_0x0197
            L_0x0185:
                r11 = move-exception
                r3 = r2
            L_0x0187:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x002f }
                if (r3 == 0) goto L_0x0196
                r3.close()     // Catch:{ IOException -> 0x0192 }
                goto L_0x0196
            L_0x0192:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0196:
                return r2
            L_0x0197:
                if (r2 == 0) goto L_0x01a1
                r2.close()     // Catch:{ IOException -> 0x019d }
                goto L_0x01a1
            L_0x019d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a1:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f13256a] * this.f13257b;
        }

        public String toString() {
            return "(" + a.W[this.f13256a] + ", data length:" + this.f13259d.length + ")";
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1, bArr);
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f13260a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13261b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13262c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13263d;

        e(String str, int i10, int i11) {
            this.f13261b = str;
            this.f13260a = i10;
            this.f13262c = i11;
            this.f13263d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i10) {
            int i11;
            int i12 = this.f13262c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f13263d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        e(String str, int i10, int i11, int i12) {
            this.f13261b = str;
            this.f13260a = i10;
            this.f13262c = i11;
            this.f13263d = i12;
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f13264a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13265b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000);
        }

        public double a() {
            return ((double) this.f13264a) / ((double) this.f13265b);
        }

        public String toString() {
            return this.f13264a + "/" + this.f13265b;
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f13264a = 0;
                this.f13265b = 1;
                return;
            }
            this.f13264a = j10;
            this.f13265b = j11;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f13195a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f13196b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f13197c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f13198d0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f13200f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f13201g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f13202h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f13203i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f13204j0 = eVarArr10;
        f13208n0 = new HashMap[eVarArr10.length];
        f13209o0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f13212r0 = forName;
        f13213s0 = "Exif\u0000\u0000".getBytes(forName);
        f13214t0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f13204j0;
            if (i10 < eVarArr11.length) {
                f13208n0[i10] = new HashMap();
                f13209o0[i10] = new HashMap();
                for (e eVar : eVarArr11[i10]) {
                    f13208n0[i10].put(Integer.valueOf(eVar.f13260a), eVar);
                    f13209o0[i10].put(eVar.f13261b, eVar);
                }
                i10++;
            } else {
                HashMap hashMap = f13211q0;
                e[] eVarArr12 = f13205k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f13260a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f13260a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f13260a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f13260a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f13260a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f13260a), 8);
                return;
            }
        }
    }

    public a(File file) {
        e[][] eVarArr = f13204j0;
        this.f13229f = new HashMap[eVarArr.length];
        this.f13230g = new HashSet(eVarArr.length);
        if (file != null) {
            A(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    private void A(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f13226c = null;
            this.f13224a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (H(fileInputStream2.getFD())) {
                        this.f13225b = fileInputStream2.getFD();
                    } else {
                        this.f13225b = null;
                    }
                    M(fileInputStream2);
                    d(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                d(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0093 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            l0.a$b r2 = new l0.a$b     // Catch:{ Exception -> 0x008e }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008e }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r2.read(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            byte[] r6 = C     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x003b
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r2.close()
            return r0
        L_0x0034:
            r15 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x0038:
            r15 = move-exception
            r1 = r2
            goto L_0x008f
        L_0x003b:
            r10 = r8
        L_0x003c:
            int r7 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0044
            int r15 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r15
        L_0x0044:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r2.close()
            return r0
        L_0x004d:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x0053:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0088
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r11 == r1) goto L_0x0065
            r2.close()
            return r0
        L_0x0065:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006a
            goto L_0x0086
        L_0x006a:
            byte[] r11 = D     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r12 = 1
            if (r11 == 0) goto L_0x0075
            r9 = r12
            goto L_0x007e
        L_0x0075:
            byte[] r11 = E     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r11 == 0) goto L_0x007e
            r10 = r12
        L_0x007e:
            if (r9 == 0) goto L_0x0086
            if (r10 == 0) goto L_0x0086
            r2.close()
            return r12
        L_0x0086:
            long r7 = r7 + r5
            goto L_0x0053
        L_0x0088:
            r2.close()
            goto L_0x009f
        L_0x008c:
            r15 = move-exception
            goto L_0x00a0
        L_0x008e:
            r15 = move-exception
        L_0x008f:
            boolean r2 = f13216v     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008c }
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            r1.close()
        L_0x009f:
            return r0
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.close()
        L_0x00a5:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.B(byte[]):boolean");
    }

    private static boolean C(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean D(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            l0.a$b r2 = new l0.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.P(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f13231h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.h(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.D(byte[]):boolean");
    }

    private boolean E(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean F(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            l0.a$b r2 = new l0.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.P(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f13231h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.h(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.G(byte[]):boolean");
    }

    private static boolean H(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f13216v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean I(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f13231h);
            int[] iArr2 = f13222y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f13227d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f13231h)) == 1 && Arrays.equals(iArr, A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f13216v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean J() {
        int i10 = this.f13227d;
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean K(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f13231h) <= 512 && dVar2.m(this.f13231h) <= 512;
    }

    private boolean L(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    private void M(InputStream inputStream) {
        if (inputStream != null) {
            int i10 = 0;
            while (i10 < f13204j0.length) {
                try {
                    this.f13229f[i10] = new HashMap();
                    i10++;
                } catch (IOException e10) {
                    boolean z10 = f13216v;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z10) {
                        return;
                    }
                } catch (Throwable th2) {
                    a();
                    if (f13216v) {
                        O();
                    }
                    throw th2;
                }
            }
            if (!this.f13228e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f13227d = n(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            b bVar = new b(inputStream);
            if (!this.f13228e) {
                switch (this.f13227d) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11:
                        r(bVar);
                        break;
                    case 4:
                        m(bVar, 0, 0);
                        a();
                        if (f13216v) {
                            O();
                            return;
                        }
                        return;
                    case 7:
                        o(bVar);
                        break;
                    case 9:
                        q(bVar);
                        a();
                        if (f13216v) {
                            O();
                            return;
                        }
                        return;
                    case 10:
                        s(bVar);
                        a();
                        if (f13216v) {
                            O();
                            return;
                        }
                        return;
                    case 12:
                        l(bVar);
                        break;
                    case 13:
                        p(bVar);
                        a();
                        if (f13216v) {
                            O();
                            return;
                        }
                        return;
                    case 14:
                        w(bVar);
                        a();
                        if (f13216v) {
                            O();
                            return;
                        }
                        return;
                }
            } else {
                t(bVar);
            }
            bVar.g((long) this.f13239p);
            Z(bVar);
            a();
            if (!f13216v) {
                return;
            }
            O();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    private void N(b bVar, int i10) {
        ByteOrder P2 = P(bVar);
        this.f13231h = P2;
        bVar.h(P2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f13227d;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i10) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i12 = readInt - 8;
            if (i12 > 0 && bVar.skipBytes(i12) != i12) {
                throw new IOException("Couldn't jump to first Ifd: " + i12);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void O() {
        for (int i10 = 0; i10 < this.f13229f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f13229f[i10].size());
            for (Map.Entry entry : this.f13229f[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f13231h) + "'");
            }
        }
    }

    private ByteOrder P(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f13216v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f13216v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void Q(byte[] bArr, int i10) {
        b bVar = new b(bArr);
        N(bVar, bArr.length);
        R(bVar, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0357, code lost:
        if (r14.m(r0.f13231h) == 65535) goto L_0x0359;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0366 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x027d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void R(l0.a.b r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set r3 = r0.f13230g
            int r4 = r1.f13253h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f13253h
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f13252g
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r30.readShort()
            boolean r5 = f13216v
            java.lang.String r6 = "ExifInterface"
            if (r5 == 0) goto L_0x0038
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "numberOfDirectoryEntry: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L_0x0038:
            int r5 = r1.f13253h
            int r7 = r3 * 12
            int r5 = r5 + r7
            int r7 = r1.f13252g
            if (r5 > r7) goto L_0x03ed
            if (r3 > 0) goto L_0x0045
            goto L_0x03ed
        L_0x0045:
            r5 = 0
            r7 = r5
        L_0x0047:
            r8 = 5
            if (r7 >= r3) goto L_0x0371
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.e()
            long r9 = (long) r14
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap[] r14 = f13208n0
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            l0.a$e r11 = (l0.a.e) r11
            boolean r14 = f13216v
            r4 = 3
            r22 = 1
            if (r14 == 0) goto L_0x00a5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r8[r5] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r12)
            r8[r22] = r23
            if (r11 == 0) goto L_0x0089
            java.lang.String r5 = r11.f13261b
        L_0x0086:
            r21 = 2
            goto L_0x008b
        L_0x0089:
            r5 = 0
            goto L_0x0086
        L_0x008b:
            r8[r21] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r8[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r8[r20] = r5
            java.lang.String r5 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            android.util.Log.d(r6, r5)
            goto L_0x00a7
        L_0x00a5:
            r21 = 2
        L_0x00a7:
            r5 = 7
            if (r11 != 0) goto L_0x00c5
            if (r14 == 0) goto L_0x00c0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "Skip the tag entry since tag number is not defined: "
            r8.append(r4)
            r8.append(r12)
            java.lang.String r4 = r8.toString()
        L_0x00bd:
            android.util.Log.d(r6, r4)
        L_0x00c0:
            r25 = r9
            r9 = r6
            goto L_0x014b
        L_0x00c5:
            if (r13 <= 0) goto L_0x00cc
            int[] r4 = X
            int r8 = r4.length
            if (r13 < r8) goto L_0x00d0
        L_0x00cc:
            r25 = r9
            r9 = r6
            goto L_0x0135
        L_0x00d0:
            boolean r8 = r11.a(r13)
            if (r8 != 0) goto L_0x00f8
            if (r14 == 0) goto L_0x00c0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Skip the tag entry since data format ("
            r4.append(r8)
            java.lang.String[] r8 = W
            r8 = r8[r13]
            r4.append(r8)
            java.lang.String r8 = ") is unexpected for tag: "
            r4.append(r8)
            java.lang.String r8 = r11.f13261b
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L_0x00bd
        L_0x00f8:
            if (r13 != r5) goto L_0x00fc
            int r13 = r11.f13262c
        L_0x00fc:
            r24 = r6
            long r5 = (long) r15
            r4 = r4[r13]
            r25 = r9
            long r8 = (long) r4
            long r4 = r5 * r8
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0117
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0114
            goto L_0x0117
        L_0x0114:
            r9 = r24
            goto L_0x014e
        L_0x0117:
            if (r14 == 0) goto L_0x0130
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r8)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r9 = r24
            android.util.Log.d(r9, r6)
            goto L_0x0132
        L_0x0130:
            r9 = r24
        L_0x0132:
            r22 = 0
            goto L_0x014e
        L_0x0135:
            if (r14 == 0) goto L_0x014b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r9, r4)
        L_0x014b:
            r4 = 0
            goto L_0x0132
        L_0x014e:
            if (r22 != 0) goto L_0x015b
            r10 = r25
            r1.g(r10)
            r22 = r3
            r24 = r7
            goto L_0x0366
        L_0x015b:
            r6 = r11
            r10 = r25
            int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            java.lang.String r8 = "Compression"
            r22 = r3
            if (r18 <= 0) goto L_0x0218
            int r3 = r30.readInt()
            r24 = r7
            if (r14 == 0) goto L_0x0185
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r18 = r13
            java.lang.String r13 = "seek to data offset: "
            r7.append(r13)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r9, r7)
            goto L_0x0187
        L_0x0185:
            r18 = r13
        L_0x0187:
            int r7 = r0.f13227d
            r13 = 7
            if (r7 != r13) goto L_0x0198
            java.lang.String r7 = r6.f13261b
            java.lang.String r13 = "MakerNote"
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x019f
            r0.f13240q = r3
        L_0x0198:
            r26 = r10
            r19 = r12
            r25 = r15
            goto L_0x01e9
        L_0x019f:
            r7 = 6
            if (r2 != r7) goto L_0x0198
            java.lang.String r13 = "ThumbnailImage"
            java.lang.String r7 = r6.f13261b
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x0198
            r0.f13241r = r3
            r0.f13242s = r15
            java.nio.ByteOrder r7 = r0.f13231h
            r13 = 6
            l0.a$d r7 = l0.a.d.j(r13, r7)
            int r13 = r0.f13241r
            r19 = r12
            long r12 = (long) r13
            r25 = r15
            java.nio.ByteOrder r15 = r0.f13231h
            l0.a$d r12 = l0.a.d.f(r12, r15)
            int r13 = r0.f13242s
            r26 = r10
            long r10 = (long) r13
            java.nio.ByteOrder r13 = r0.f13231h
            l0.a$d r10 = l0.a.d.f(r10, r13)
            java.util.HashMap[] r11 = r0.f13229f
            r13 = 4
            r11 = r11[r13]
            r11.put(r8, r7)
            java.util.HashMap[] r7 = r0.f13229f
            r7 = r7[r13]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r7.put(r11, r12)
            java.util.HashMap[] r7 = r0.f13229f
            r7 = r7[r13]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r7.put(r11, r10)
        L_0x01e9:
            long r10 = (long) r3
            long r12 = r10 + r4
            int r7 = r1.f13252g
            r28 = r8
            long r7 = (long) r7
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x01fb
            r1.g(r10)
            r7 = r26
            goto L_0x0223
        L_0x01fb:
            if (r14 == 0) goto L_0x0211
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data offset is invalid: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r9, r3)
        L_0x0211:
            r7 = r26
        L_0x0213:
            r1.g(r7)
            goto L_0x0366
        L_0x0218:
            r24 = r7
            r28 = r8
            r7 = r10
            r19 = r12
            r18 = r13
            r25 = r15
        L_0x0223:
            java.util.HashMap r3 = f13211q0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r3.get(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x024d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "nextIfdType: "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = " byteCount: "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r9, r10)
        L_0x024d:
            r10 = 8
            r13 = r18
            if (r3 == 0) goto L_0x02ef
            r11 = 3
            if (r13 == r11) goto L_0x0276
            r4 = 4
            if (r13 == r4) goto L_0x0271
            if (r13 == r10) goto L_0x026c
            r4 = 9
            if (r13 == r4) goto L_0x0266
            r4 = 13
            if (r13 == r4) goto L_0x0266
            r4 = -1
            goto L_0x027b
        L_0x0266:
            int r4 = r30.readInt()
        L_0x026a:
            long r4 = (long) r4
            goto L_0x027b
        L_0x026c:
            short r4 = r30.readShort()
            goto L_0x026a
        L_0x0271:
            long r4 = r30.f()
            goto L_0x027b
        L_0x0276:
            int r4 = r30.readUnsignedShort()
            goto L_0x026a
        L_0x027b:
            if (r14 == 0) goto L_0x0290
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            java.lang.String r6 = r6.f13261b
            java.lang.Object[] r6 = new java.lang.Object[]{r10, r6}
            java.lang.String r10 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r10, r6)
            android.util.Log.d(r9, r6)
        L_0x0290:
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x02db
            int r6 = r1.f13252g
            long r10 = (long) r6
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x02db
            java.util.Set r6 = r0.f13230g
            int r10 = (int) r4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r6 = r6.contains(r10)
            if (r6 != 0) goto L_0x02b6
            r1.g(r4)
            int r3 = r3.intValue()
            r0.R(r1, r3)
            goto L_0x0213
        L_0x02b6:
            if (r14 == 0) goto L_0x0213
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r10)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L_0x02d6:
            android.util.Log.d(r9, r3)
            goto L_0x0213
        L_0x02db:
            if (r14 == 0) goto L_0x0213
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x02d6
        L_0x02ef:
            int r3 = r30.e()
            int r11 = r0.f13239p
            int r3 = r3 + r11
            int r4 = (int) r4
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            l0.a$d r5 = new l0.a$d
            long r11 = (long) r3
            r14 = r5
            r3 = r25
            r15 = r13
            r16 = r3
            r17 = r11
            r19 = r4
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r2]
            java.lang.String r4 = r6.f13261b
            r3.put(r4, r5)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r4 = r6.f13261b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0322
            r3 = 3
            r0.f13227d = r3
        L_0x0322:
            java.lang.String r3 = "Make"
            java.lang.String r4 = r6.f13261b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0336
            java.lang.String r3 = "Model"
            java.lang.String r4 = r6.f13261b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0344
        L_0x0336:
            java.nio.ByteOrder r3 = r0.f13231h
            java.lang.String r3 = r5.n(r3)
            java.lang.String r4 = "PENTAX"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0359
        L_0x0344:
            java.lang.String r3 = r6.f13261b
            r4 = r28
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x035b
            java.nio.ByteOrder r3 = r0.f13231h
            int r3 = r5.m(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x035b
        L_0x0359:
            r0.f13227d = r10
        L_0x035b:
            int r3 = r30.e()
            long r3 = (long) r3
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0366
            goto L_0x0213
        L_0x0366:
            int r7 = r24 + 1
            short r7 = (short) r7
            r6 = r9
            r4 = r21
            r3 = r22
            r5 = 0
            goto L_0x0047
        L_0x0371:
            r9 = r6
            int r2 = r30.e()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f13252g
            if (r2 > r3) goto L_0x03ed
            int r2 = r30.readInt()
            boolean r3 = f13216v
            if (r3 == 0) goto L_0x0395
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r9, r4)
        L_0x0395:
            long r4 = (long) r2
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x03e3
            int r6 = r1.f13252g
            if (r2 >= r6) goto L_0x03e3
            java.util.Set r6 = r0.f13230g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x03cc
            r1.g(r4)
            java.util.HashMap[] r2 = r0.f13229f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03be
            r0.R(r1, r3)
            goto L_0x03ed
        L_0x03be:
            java.util.HashMap[] r2 = r0.f13229f
            r2 = r2[r8]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03ed
            r0.R(r1, r8)
            goto L_0x03ed
        L_0x03cc:
            if (r3 == 0) goto L_0x03ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
        L_0x03d5:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r9, r1)
            goto L_0x03ed
        L_0x03e3:
            if (r3 == 0) goto L_0x03ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            goto L_0x03d5
        L_0x03ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.R(l0.a$b, int):void");
    }

    private void S(String str) {
        for (int i10 = 0; i10 < f13204j0.length; i10++) {
            this.f13229f[i10].remove(str);
        }
    }

    private void T(b bVar, int i10) {
        d dVar = (d) this.f13229f[i10].get("ImageLength");
        d dVar2 = (d) this.f13229f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f13229f[i10].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f13229f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m10 = dVar3.m(this.f13231h);
                int m11 = dVar3.m(this.f13231h);
                bVar.g((long) m10);
                byte[] bArr = new byte[m11];
                bVar.read(bArr);
                m(new b(bArr), m10, i10);
            }
        }
    }

    private void V(InputStream inputStream, OutputStream outputStream) {
        if (f13216v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.e(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.e(-40);
                d dVar = (j("Xmp") == null || !this.f13244u) ? null : (d) this.f13229f[0].remove("Xmp");
                cVar.e(-1);
                cVar.e(-31);
                e0(cVar);
                if (dVar != null) {
                    this.f13229f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.e(-1);
                        cVar.e(readByte);
                        f(dataInputStream, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.e(-1);
                        cVar.e(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.l(readUnsignedShort);
                        int i10 = readUnsignedShort - 2;
                        if (i10 >= 0) {
                            while (i10 > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i10, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i10 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        int i11 = readUnsignedShort2 - 2;
                        if (i11 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (i11 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f13213s0)) {
                                    int i12 = readUnsignedShort2 - 8;
                                    if (dataInputStream.skipBytes(i12) != i12) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            cVar.e(-1);
                            cVar.e(readByte);
                            cVar.l(readUnsignedShort2);
                            if (i11 >= 6) {
                                i11 = readUnsignedShort2 - 8;
                                cVar.write(bArr2);
                            }
                            while (i11 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(i11, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                i11 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void W(InputStream inputStream, OutputStream outputStream) {
        if (f13216v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        g(dataInputStream, cVar, bArr.length);
        int i10 = this.f13239p;
        if (i10 == 0) {
            int readInt = dataInputStream.readInt();
            cVar.f(readInt);
            g(dataInputStream, cVar, readInt + 8);
        } else {
            g(dataInputStream, cVar, (i10 - bArr.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                e0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f13254e).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.f((int) crc32.getValue());
                d(byteArrayOutputStream2);
                f(dataInputStream, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d(byteArrayOutputStream);
            throw th;
        }
    }

    private void X(InputStream inputStream, OutputStream outputStream) {
        int i10;
        int i11;
        int i12;
        int i13;
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (f13216v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream2 + ", outputStream: " + outputStream2 + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream2, byteOrder);
        c cVar = new c(outputStream2, byteOrder);
        byte[] bArr = L;
        g(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                int i14 = this.f13239p;
                if (i14 != 0) {
                    g(bVar, cVar2, (i14 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.skipBytes(4);
                    bVar.skipBytes(bVar.readInt());
                } else {
                    byte[] bArr3 = new byte[4];
                    if (bVar.read(bArr3) == 4) {
                        byte[] bArr4 = P;
                        boolean z10 = false;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int readInt = bVar.readInt();
                            byte[] bArr5 = new byte[(readInt % 2 == 1 ? readInt + 1 : readInt)];
                            bVar.read(bArr5);
                            byte b10 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b10;
                            if (((b10 >> 1) & 1) == 1) {
                                z10 = true;
                            }
                            cVar2.write(bArr4);
                            cVar2.f(readInt);
                            cVar2.write(bArr5);
                            if (z10) {
                                h(bVar, cVar2, S, (byte[]) null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream2.read(bArr6);
                                    if (!Arrays.equals(bArr6, T)) {
                                        break;
                                    }
                                    i(bVar, cVar2, bArr6);
                                }
                            } else {
                                h(bVar, cVar2, R, Q);
                            }
                        } else {
                            byte[] bArr7 = R;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, Q)) {
                                int readInt2 = bVar.readInt();
                                int i15 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(O, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i13 = bVar.readInt();
                                    i12 = (i13 << 18) >> 18;
                                    i11 = (i13 << 2) >> 18;
                                    i15 -= 10;
                                    i10 = 0;
                                } else if (!Arrays.equals(bArr3, Q)) {
                                    i13 = 0;
                                    i12 = 0;
                                    i11 = 0;
                                    i10 = 0;
                                } else if (bVar.readByte() == 47) {
                                    i13 = bVar.readInt();
                                    i10 = i13 & 8;
                                    i15 -= 5;
                                    i11 = ((i13 << 4) >> 18) + 1;
                                    i12 = ((i13 << 18) >> 18) + 1;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                                cVar2.write(bArr4);
                                cVar2.f(10);
                                byte[] bArr10 = new byte[10];
                                byte b11 = (byte) (bArr10[0] | 8);
                                bArr10[0] = b11;
                                bArr10[0] = (byte) (b11 | (i10 << 4));
                                int i16 = i12 - 1;
                                int i17 = i11 - 1;
                                bArr10[4] = (byte) i16;
                                bArr10[5] = (byte) (i16 >> 8);
                                bArr10[6] = (byte) (i16 >> 16);
                                bArr10[7] = (byte) i17;
                                bArr10[8] = (byte) (i17 >> 8);
                                bArr10[9] = (byte) (i17 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.f(readInt2);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(O);
                                } else {
                                    if (Arrays.equals(bArr3, Q)) {
                                        cVar2.write(47);
                                    }
                                    g(bVar, cVar2, i15);
                                }
                                cVar2.f(i13);
                                g(bVar, cVar2, i15);
                            }
                            f(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr11 = M;
                            cVar.f(size + bArr11.length);
                            cVar.write(bArr11);
                            byteArrayOutputStream2.writeTo(cVar);
                            d(byteArrayOutputStream2);
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                e0(cVar2);
                f(bVar, cVar2);
                int size2 = byteArrayOutputStream2.size();
                byte[] bArr112 = M;
                cVar.f(size2 + bArr112.length);
                cVar.write(bArr112);
                byteArrayOutputStream2.writeTo(cVar);
                d(byteArrayOutputStream2);
            } catch (Exception e10) {
                e = e10;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                d(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    private void Z(b bVar) {
        HashMap hashMap = this.f13229f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f13231h);
            this.f13238o = m10;
            if (m10 != 1) {
                if (m10 != 6) {
                    if (m10 != 7) {
                        return;
                    }
                }
            }
            if (I(hashMap)) {
                z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f13238o = 6;
        y(bVar, hashMap);
    }

    private void a() {
        String j10 = j("DateTimeOriginal");
        if (j10 != null && j("DateTime") == null) {
            this.f13229f[0].put("DateTime", d.e(j10));
        }
        if (j("ImageWidth") == null) {
            this.f13229f[0].put("ImageWidth", d.f(0, this.f13231h));
        }
        if (j("ImageLength") == null) {
            this.f13229f[0].put("ImageLength", d.f(0, this.f13231h));
        }
        if (j("Orientation") == null) {
            this.f13229f[0].put("Orientation", d.f(0, this.f13231h));
        }
        if (j("LightSource") == null) {
            this.f13229f[1].put("LightSource", d.f(0, this.f13231h));
        }
    }

    private static boolean a0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte valueOf : bArr) {
            sb2.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return sb2.toString();
    }

    private void b0(int i10, int i11) {
        String str;
        if (!this.f13229f[i10].isEmpty() && !this.f13229f[i11].isEmpty()) {
            d dVar = (d) this.f13229f[i10].get("ImageLength");
            d dVar2 = (d) this.f13229f[i10].get("ImageWidth");
            d dVar3 = (d) this.f13229f[i11].get("ImageLength");
            d dVar4 = (d) this.f13229f[i11].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f13216v) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m10 = dVar.m(this.f13231h);
                int m11 = dVar2.m(this.f13231h);
                int m12 = dVar3.m(this.f13231h);
                int m13 = dVar4.m(this.f13231h);
                if (m10 < m12 && m11 < m13) {
                    HashMap[] hashMapArr = this.f13229f;
                    HashMap hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                    return;
                }
                return;
            } else if (f13216v) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (f13216v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterface", "Error closing fd.");
        }
    }

    private void c0(b bVar, int i10) {
        d dVar;
        d dVar2;
        StringBuilder sb2;
        String arrays;
        d dVar3 = (d) this.f13229f[i10].get("DefaultCropSize");
        d dVar4 = (d) this.f13229f[i10].get("SensorTopBorder");
        d dVar5 = (d) this.f13229f[i10].get("SensorLeftBorder");
        d dVar6 = (d) this.f13229f[i10].get("SensorBottomBorder");
        d dVar7 = (d) this.f13229f[i10].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f13256a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f13231h);
                if (fVarArr == null || fVarArr.length != 2) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(fVarArr);
                } else {
                    dVar2 = d.h(fVarArr[0], this.f13231h);
                    dVar = d.h(fVarArr[1], this.f13231h);
                    this.f13229f[i10].put("ImageWidth", dVar2);
                    this.f13229f[i10].put("ImageLength", dVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar3.o(this.f13231h);
                if (iArr == null || iArr.length != 2) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    dVar2 = d.j(iArr[0], this.f13231h);
                    dVar = d.j(iArr[1], this.f13231h);
                    this.f13229f[i10].put("ImageWidth", dVar2);
                    this.f13229f[i10].put("ImageLength", dVar);
                    return;
                }
            }
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            T(bVar, i10);
        } else {
            int m10 = dVar4.m(this.f13231h);
            int m11 = dVar6.m(this.f13231h);
            int m12 = dVar7.m(this.f13231h);
            int m13 = dVar5.m(this.f13231h);
            if (m11 > m10 && m12 > m13) {
                d j10 = d.j(m11 - m10, this.f13231h);
                d j11 = d.j(m12 - m13, this.f13231h);
                this.f13229f[i10].put("ImageLength", j10);
                this.f13229f[i10].put("ImageWidth", j11);
            }
        }
    }

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private void d0() {
        b0(0, 5);
        b0(0, 4);
        b0(5, 4);
        d dVar = (d) this.f13229f[1].get("PixelXDimension");
        d dVar2 = (d) this.f13229f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f13229f[0].put("ImageWidth", dVar);
            this.f13229f[0].put("ImageLength", dVar2);
        }
        if (this.f13229f[4].isEmpty() && K(this.f13229f[5])) {
            HashMap[] hashMapArr = this.f13229f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!K(this.f13229f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private static long[] e(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private int e0(c cVar) {
        c cVar2 = cVar;
        e[][] eVarArr = f13204j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f13205k0) {
            S(eVar.f13261b);
        }
        S(f13206l0.f13261b);
        S(f13207m0.f13261b);
        for (int i10 = 0; i10 < f13204j0.length; i10++) {
            for (Object obj : this.f13229f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f13229f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f13229f[1].isEmpty()) {
            this.f13229f[0].put(f13205k0[1].f13261b, d.f(0, this.f13231h));
        }
        if (!this.f13229f[2].isEmpty()) {
            this.f13229f[0].put(f13205k0[2].f13261b, d.f(0, this.f13231h));
        }
        if (!this.f13229f[3].isEmpty()) {
            this.f13229f[1].put(f13205k0[3].f13261b, d.f(0, this.f13231h));
        }
        if (this.f13232i) {
            this.f13229f[4].put(f13206l0.f13261b, d.f(0, this.f13231h));
            this.f13229f[4].put(f13207m0.f13261b, d.f((long) this.f13236m, this.f13231h));
        }
        for (int i11 = 0; i11 < f13204j0.length; i11++) {
            int i12 = 0;
            for (Map.Entry value : this.f13229f[i11].entrySet()) {
                int p10 = ((d) value.getValue()).p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f13204j0.length; i14++) {
            if (!this.f13229f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f13229f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f13232i) {
            this.f13229f[4].put(f13206l0.f13261b, d.f((long) i13, this.f13231h));
            this.f13235l = i13;
            i13 += this.f13236m;
        }
        if (this.f13227d == 4) {
            i13 += 8;
        }
        if (f13216v) {
            for (int i15 = 0; i15 < f13204j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f13229f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)}));
            }
        }
        if (!this.f13229f[1].isEmpty()) {
            this.f13229f[0].put(f13205k0[1].f13261b, d.f((long) iArr[1], this.f13231h));
        }
        if (!this.f13229f[2].isEmpty()) {
            this.f13229f[0].put(f13205k0[2].f13261b, d.f((long) iArr[2], this.f13231h));
        }
        if (!this.f13229f[3].isEmpty()) {
            this.f13229f[1].put(f13205k0[3].f13261b, d.f((long) iArr[3], this.f13231h));
        }
        int i16 = this.f13227d;
        if (i16 == 4) {
            cVar2.l(i13);
            cVar2.write(f13213s0);
        } else if (i16 == 13) {
            cVar2.f(i13);
            cVar2.write(I);
        } else if (i16 == 14) {
            cVar2.write(N);
            cVar2.f(i13);
        }
        cVar2.g(this.f13231h == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar2.c(this.f13231h);
        cVar2.l(42);
        cVar2.h(8);
        for (int i17 = 0; i17 < f13204j0.length; i17++) {
            if (!this.f13229f[i17].isEmpty()) {
                cVar2.l(this.f13229f[i17].size());
                int size = iArr[i17] + 2 + (this.f13229f[i17].size() * 12) + 4;
                for (Map.Entry entry2 : this.f13229f[i17].entrySet()) {
                    int i18 = ((e) f13209o0[i17].get(entry2.getKey())).f13260a;
                    d dVar = (d) entry2.getValue();
                    int p11 = dVar.p();
                    cVar2.l(i18);
                    cVar2.l(dVar.f13256a);
                    cVar2.f(dVar.f13257b);
                    if (p11 > 4) {
                        cVar2.h((long) size);
                        size += p11;
                    } else {
                        cVar2.write(dVar.f13259d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar2.e(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f13229f[4].isEmpty()) {
                    cVar2.h(0);
                } else {
                    cVar2.h((long) iArr[4]);
                }
                for (Map.Entry value2 : this.f13229f[i17].entrySet()) {
                    byte[] bArr = ((d) value2.getValue()).f13259d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f13232i) {
            cVar2.write(v());
        }
        if (this.f13227d == 14 && i13 % 2 == 1) {
            cVar2.e(0);
        }
        cVar2.c(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private static int f(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i10;
            }
            i10 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private static void g(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int min = Math.min(i10, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i10 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f13212r0;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.f(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        g(bVar, cVar, readInt);
    }

    private d k(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f13216v) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i10 = 0; i10 < f13204j0.length; i10++) {
                d dVar = (d) this.f13229f[i10].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void l(b bVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0176a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f13229f[0].put("ImageWidth", d.j(Integer.parseInt(str3), this.f13231h));
            }
            if (str2 != null) {
                this.f13229f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f13231h));
            }
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                this.f13229f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f13231h));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.g((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i10 = parseInt2 + 6;
                        int i11 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f13213s0)) {
                            byte[] bArr2 = new byte[i11];
                            if (bVar.read(bArr2) == i11) {
                                this.f13239p = i10;
                                Q(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f13216v) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m(l0.a.b r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = f13216v
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            r3 = 0
            r1.mark(r3)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.h(r5)
            byte r5 = r21.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r5 != r7) goto L_0x01dc
            byte r8 = r21.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x01c1
            r5 = 2
        L_0x003b:
            byte r6 = r21.readByte()
            if (r6 != r7) goto L_0x01a4
            byte r6 = r21.readByte()
            boolean r8 = f13216v
            if (r8 == 0) goto L_0x0063
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.append(r10)
            r10 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L_0x0063:
            r9 = -39
            if (r6 == r9) goto L_0x019e
            r9 = -38
            if (r6 != r9) goto L_0x006d
            goto L_0x019e
        L_0x006d:
            int r9 = r21.readUnsignedShort()
            int r10 = r9 + -2
            int r5 = r5 + 4
            if (r8 == 0) goto L_0x009e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "JPEG segment: "
            r8.append(r11)
            r11 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r8.append(r11)
            java.lang.String r11 = " (length: "
            r8.append(r11)
            r8.append(r9)
            java.lang.String r11 = ")"
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x009e:
            java.lang.String r8 = "Invalid length"
            if (r10 < 0) goto L_0x0198
            r11 = -31
            r12 = 1
            if (r6 == r11) goto L_0x011f
            r11 = -2
            if (r6 == r11) goto L_0x00f3
            switch(r6) {
                case -64: goto L_0x00ba;
                case -63: goto L_0x00ba;
                case -62: goto L_0x00ba;
                case -61: goto L_0x00ba;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r6) {
                case -59: goto L_0x00ba;
                case -58: goto L_0x00ba;
                case -57: goto L_0x00ba;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r6) {
                case -55: goto L_0x00ba;
                case -54: goto L_0x00ba;
                case -53: goto L_0x00ba;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r6) {
                case -51: goto L_0x00ba;
                case -50: goto L_0x00ba;
                case -49: goto L_0x00ba;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r19 = r4
            goto L_0x017b
        L_0x00ba:
            int r6 = r1.skipBytes(r12)
            if (r6 != r12) goto L_0x00eb
            java.util.HashMap[] r6 = r0.f13229f
            r6 = r6[r2]
            int r10 = r21.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f13231h
            l0.a$d r10 = l0.a.d.f(r10, r12)
            java.lang.String r11 = "ImageLength"
            r6.put(r11, r10)
            java.util.HashMap[] r6 = r0.f13229f
            r6 = r6[r2]
            int r10 = r21.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f13231h
            l0.a$d r10 = l0.a.d.f(r10, r12)
            java.lang.String r11 = "ImageWidth"
            r6.put(r11, r10)
            int r10 = r9 + -7
            goto L_0x00b6
        L_0x00eb:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00f3:
            byte[] r6 = new byte[r10]
            int r9 = r1.read(r6)
            if (r9 != r10) goto L_0x0117
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.j(r9)
            if (r10 != 0) goto L_0x0115
            java.util.HashMap[] r10 = r0.f13229f
            r10 = r10[r12]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = f13212r0
            r11.<init>(r6, r12)
            l0.a$d r6 = l0.a.d.e(r11)
            r10.put(r9, r6)
        L_0x0115:
            r10 = r3
            goto L_0x00b6
        L_0x0117:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x011f:
            byte[] r6 = new byte[r10]
            r1.readFully(r6)
            int r9 = r5 + r10
            byte[] r11 = f13213s0
            boolean r13 = a0(r6, r11)
            if (r13 == 0) goto L_0x0147
            int r12 = r11.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r12, r10)
            int r5 = r22 + r5
            int r10 = r11.length
            int r5 = r5 + r10
            r0.f13239p = r5
            r0.Q(r6, r2)
            l0.a$b r5 = new l0.a$b
            r5.<init>((byte[]) r6)
            r0.Z(r5)
        L_0x0144:
            r19 = r4
            goto L_0x0179
        L_0x0147:
            byte[] r11 = f13214t0
            boolean r13 = a0(r6, r11)
            if (r13 == 0) goto L_0x0144
            int r13 = r11.length
            int r5 = r5 + r13
            int r11 = r11.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r11, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r11 = r0.j(r10)
            if (r11 != 0) goto L_0x0144
            java.util.HashMap[] r11 = r0.f13229f
            r11 = r11[r3]
            l0.a$d r15 = new l0.a$d
            r14 = 1
            int r13 = r6.length
            r19 = r4
            long r3 = (long) r5
            r5 = r13
            r13 = r15
            r7 = r15
            r15 = r5
            r16 = r3
            r18 = r6
            r13.<init>(r14, r15, r16, r18)
            r11.put(r10, r7)
            r0.f13244u = r12
        L_0x0179:
            r5 = r9
            r10 = 0
        L_0x017b:
            if (r10 < 0) goto L_0x0192
            int r3 = r1.skipBytes(r10)
            if (r3 != r10) goto L_0x018a
            int r5 = r5 + r10
            r4 = r19
            r3 = 0
            r7 = -1
            goto L_0x003b
        L_0x018a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0192:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x0198:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r8)
            throw r1
        L_0x019e:
            java.nio.ByteOrder r2 = r0.f13231h
            r1.h(r2)
            return
        L_0x01a4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c1:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01dc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.m(l0.a$b, int, int):void");
    }

    private int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (C(bArr)) {
            return 4;
        }
        if (F(bArr)) {
            return 9;
        }
        if (B(bArr)) {
            return 12;
        }
        if (D(bArr)) {
            return 7;
        }
        if (G(bArr)) {
            return 10;
        }
        if (E(bArr)) {
            return 13;
        }
        return L(bArr) ? 14 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(l0.a.b r6) {
        /*
            r5 = this;
            r5.r(r6)
            java.util.HashMap[] r6 = r5.f13229f
            r0 = 1
            r6 = r6[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r6 = r6.get(r1)
            l0.a$d r6 = (l0.a.d) r6
            if (r6 == 0) goto L_0x00ed
            l0.a$b r1 = new l0.a$b
            byte[] r6 = r6.f13259d
            r1.<init>((byte[]) r6)
            java.nio.ByteOrder r6 = r5.f13231h
            r1.h(r6)
            byte[] r6 = F
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.g(r3)
            byte[] r3 = G
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.g(r2)
            goto L_0x0048
        L_0x003f:
            boolean r6 = java.util.Arrays.equals(r4, r3)
            if (r6 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r6 = 6
            r5.R(r1, r6)
            java.util.HashMap[] r6 = r5.f13229f
            r1 = 7
            r6 = r6[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r6 = r6.get(r2)
            l0.a$d r6 = (l0.a.d) r6
            java.util.HashMap[] r2 = r5.f13229f
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            l0.a$d r1 = (l0.a.d) r1
            if (r6 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap[] r2 = r5.f13229f
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r6)
            java.util.HashMap[] r6 = r5.f13229f
            r6 = r6[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r6.put(r2, r1)
        L_0x007c:
            java.util.HashMap[] r6 = r5.f13229f
            r1 = 8
            r6 = r6[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r6 = r6.get(r1)
            l0.a$d r6 = (l0.a.d) r6
            if (r6 == 0) goto L_0x00ed
            java.nio.ByteOrder r1 = r5.f13231h
            java.lang.Object r6 = r6.o(r1)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L_0x00d3
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r1 = 2
            r1 = r6[r1]
            r2 = 0
            r3 = r6[r2]
            if (r1 <= r3) goto L_0x00ed
            r4 = 3
            r4 = r6[r4]
            r6 = r6[r0]
            if (r4 <= r6) goto L_0x00ed
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r4 = r4 - r6
            int r4 = r4 + r0
            if (r1 >= r4) goto L_0x00b4
            int r1 = r1 + r4
            int r4 = r1 - r4
            int r1 = r1 - r4
        L_0x00b4:
            java.nio.ByteOrder r6 = r5.f13231h
            l0.a$d r6 = l0.a.d.j(r1, r6)
            java.nio.ByteOrder r0 = r5.f13231h
            l0.a$d r0 = l0.a.d.j(r4, r0)
            java.util.HashMap[] r1 = r5.f13229f
            r1 = r1[r2]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r6)
            java.util.HashMap[] r6 = r5.f13229f
            r6 = r6[r2]
            java.lang.String r1 = "ImageLength"
            r6.put(r1, r0)
            goto L_0x00ed
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r6)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.o(l0.a$b):void");
    }

    private void p(b bVar) {
        if (f13216v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.h(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i10 = length + 8;
                    if (i10 == 16) {
                        if (!Arrays.equals(bArr2, J)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, K)) {
                        if (Arrays.equals(bArr2, I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f13239p = i10;
                                    Q(bArr3, 0);
                                    d0();
                                    Z(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i11 = readInt + 4;
                        bVar.skipBytes(i11);
                        length = i10 + i11;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void q(b bVar) {
        boolean z10 = f13216v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.g((long) i10);
        bVar.read(bArr4);
        m(new b(bArr4), i10, 5);
        bVar.g((long) i12);
        bVar.h(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f13199e0.f13260a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f13231h);
                d j11 = d.j(readShort2, this.f13231h);
                this.f13229f[0].put("ImageLength", j10);
                this.f13229f[0].put("ImageWidth", j11);
                if (f13216v) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void r(b bVar) {
        d dVar;
        N(bVar, bVar.available());
        R(bVar, 0);
        c0(bVar, 0);
        c0(bVar, 5);
        c0(bVar, 4);
        d0();
        if (this.f13227d == 8 && (dVar = (d) this.f13229f[1].get("MakerNote")) != null) {
            b bVar2 = new b(dVar.f13259d);
            bVar2.h(this.f13231h);
            bVar2.g(6);
            R(bVar2, 9);
            d dVar2 = (d) this.f13229f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f13229f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void s(b bVar) {
        if (f13216v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        r(bVar);
        d dVar = (d) this.f13229f[0].get("JpgFromRaw");
        if (dVar != null) {
            m(new b(dVar.f13259d), (int) dVar.f13258c, 5);
        }
        d dVar2 = (d) this.f13229f[0].get("ISO");
        d dVar3 = (d) this.f13229f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f13229f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    private void t(b bVar) {
        byte[] bArr = f13213s0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f13239p = bArr.length;
        Q(bArr2, 0);
    }

    private void w(b bVar) {
        if (f13216v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.h(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(L.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(M.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 8;
                    if (Arrays.equals(N, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f13239p = i10;
                            Q(bArr2, 0);
                            Z(new b(bArr2));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 != readInt) {
                        if (i11 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i10 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair x(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = x(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = x(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r12 < 0) goto L_0x00f5
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r12 > 0) goto L_0x00eb
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r2 = 4
            if (r1 < 0) goto L_0x0130
            long r3 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.x(java.lang.String):android.util.Pair");
    }

    private void y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m10 = dVar.m(this.f13231h);
            int m11 = dVar2.m(this.f13231h);
            if (this.f13227d == 7) {
                m10 += this.f13240q;
            }
            int min = Math.min(m11, bVar.c() - m10);
            if (m10 > 0 && min > 0) {
                this.f13232i = true;
                if (this.f13224a == null && this.f13226c == null && this.f13225b == null) {
                    byte[] bArr = new byte[min];
                    bVar.skip((long) m10);
                    bVar.read(bArr);
                    this.f13237n = bArr;
                }
                this.f13235l = m10;
                this.f13236m = min;
            }
            if (f13216v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + min);
            }
        }
    }

    private void z(b bVar, HashMap hashMap) {
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        d dVar = (d) hashMap2.get("StripOffsets");
        d dVar2 = (d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] e10 = e(dVar.o(this.f13231h));
            long[] e11 = e(dVar2.o(this.f13231h));
            if (e10 == null || e10.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (e11 == null || e11.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (e10.length != e11.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j10 = 0;
                for (long j11 : e11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                this.f13234k = true;
                this.f13233j = true;
                this.f13232i = true;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < e10.length; i13++) {
                    int i14 = (int) e10[i13];
                    int i15 = (int) e11[i13];
                    if (i13 < e10.length - 1 && ((long) (i14 + i15)) != e10[i13 + 1]) {
                        this.f13234k = false;
                    }
                    int i16 = i14 - i11;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = (long) i16;
                    if (bVar2.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    if (bVar2.read(bArr2) != i15) {
                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                        return;
                    }
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                }
                this.f13237n = bArr;
                if (this.f13234k) {
                    this.f13235l = (int) e10[0];
                    this.f13236m = i10;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        r8 = null;
        r9 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c7, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        r9 = null;
        r1 = r6;
        r6 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00da, code lost:
        android.system.Os.lseek(r13.f13225b, 0, android.system.OsConstants.SEEK_SET);
        r1 = new java.io.FileOutputStream(r13.f13225b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ef, code lost:
        r1 = new java.io.FileOutputStream(r13.f13224a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x013b, code lost:
        r2.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A[Catch:{ Exception -> 0x0071, all -> 0x006d }, ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[Catch:{ Exception -> 0x00ed, all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ef A[Catch:{ Exception -> 0x00ed, all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U() {
        /*
            r13 = this;
            boolean r0 = r13.J()
            if (r0 == 0) goto L_0x015b
            java.io.FileDescriptor r0 = r13.f13225b
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r13.f13224a
            if (r0 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0017:
            r0 = 1
            r13.f13243t = r0
            byte[] r1 = r13.u()
            r13.f13237n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            java.lang.String r3 = r13.f13224a     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            r4 = 0
            if (r3 == 0) goto L_0x003f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            java.lang.String r6 = r13.f13224a     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            goto L_0x004d
        L_0x0037:
            r0 = move-exception
            r6 = r1
            goto L_0x0154
        L_0x003b:
            r0 = move-exception
            r6 = r1
            goto L_0x014b
        L_0x003f:
            java.io.FileDescriptor r3 = r13.f13225b     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            android.system.Os.lseek(r3, r4, r6)     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            java.io.FileDescriptor r6 = r13.f13225b     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0037 }
        L_0x004d:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0148, all -> 0x0145 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0148, all -> 0x0145 }
            f(r3, r6)     // Catch:{ Exception -> 0x0142, all -> 0x013f }
            d(r3)
            d(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cd, all -> 0x006d }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00cd, all -> 0x006d }
            java.lang.String r7 = r13.f13224a     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            if (r7 == 0) goto L_0x0079
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            java.lang.String r8 = r13.f13224a     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            goto L_0x0087
        L_0x006d:
            r0 = move-exception
            r9 = r1
            goto L_0x0133
        L_0x0071:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
        L_0x0075:
            r6 = r7
            r7 = r9
            goto L_0x00d1
        L_0x0079:
            java.io.FileDescriptor r7 = r13.f13225b     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            int r8 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            android.system.Os.lseek(r7, r4, r8)     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            java.io.FileDescriptor r8 = r13.f13225b     // Catch:{ Exception -> 0x0071, all -> 0x006d }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0071, all -> 0x006d }
        L_0x0087:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00c7, all -> 0x006d }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00c7, all -> 0x006d }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            int r10 = r13.f13227d     // Catch:{ Exception -> 0x009e }
            r11 = 4
            if (r10 != r11) goto L_0x00a3
            r13.V(r8, r9)     // Catch:{ Exception -> 0x009e }
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
        L_0x009b:
            r1 = r8
            goto L_0x0133
        L_0x009e:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto L_0x00d1
        L_0x00a3:
            r11 = 13
            if (r10 != r11) goto L_0x00ab
            r13.W(r8, r9)     // Catch:{ Exception -> 0x009e }
            goto L_0x00b2
        L_0x00ab:
            r11 = 14
            if (r10 != r11) goto L_0x00b2
            r13.X(r8, r9)     // Catch:{ Exception -> 0x009e }
        L_0x00b2:
            d(r8)
            d(r9)
            r2.delete()
            r13.f13237n = r1
            return
        L_0x00be:
            r0 = move-exception
            r9 = r1
            goto L_0x009b
        L_0x00c1:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto L_0x00d1
        L_0x00c7:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto L_0x00d1
        L_0x00cd:
            r7 = move-exception
            r8 = r1
            r9 = r8
            goto L_0x0075
        L_0x00d1:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x010a, all -> 0x0108 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x010a, all -> 0x0108 }
            java.lang.String r1 = r13.f13224a     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            if (r1 != 0) goto L_0x00ef
            java.io.FileDescriptor r1 = r13.f13225b     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            android.system.Os.lseek(r1, r4, r11)     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            java.io.FileDescriptor r4 = r13.f13225b     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
        L_0x00e8:
            r7 = r1
            goto L_0x00f7
        L_0x00ea:
            r0 = move-exception
        L_0x00eb:
            r1 = r10
            goto L_0x012c
        L_0x00ed:
            r1 = move-exception
            goto L_0x010d
        L_0x00ef:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            java.lang.String r4 = r13.f13224a     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            goto L_0x00e8
        L_0x00f7:
            f(r10, r7)     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            d(r10)     // Catch:{ all -> 0x009a }
            d(r7)     // Catch:{ all -> 0x009a }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x0108:
            r0 = move-exception
            goto L_0x012c
        L_0x010a:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L_0x010d:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r4.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ all -> 0x0128 }
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0128 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0128 }
            throw r3     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x00eb
        L_0x012c:
            d(r1)     // Catch:{ all -> 0x009a }
            d(r7)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x0133:
            d(r1)
            d(r9)
            if (r3 != 0) goto L_0x013e
            r2.delete()
        L_0x013e:
            throw r0
        L_0x013f:
            r0 = move-exception
        L_0x0140:
            r1 = r3
            goto L_0x0154
        L_0x0142:
            r0 = move-exception
        L_0x0143:
            r1 = r3
            goto L_0x014b
        L_0x0145:
            r0 = move-exception
            r6 = r1
            goto L_0x0140
        L_0x0148:
            r0 = move-exception
            r6 = r1
            goto L_0x0143
        L_0x014b:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0153 }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0153 }
            throw r2     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
        L_0x0154:
            d(r1)
            d(r6)
            throw r0
        L_0x015b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.U():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c7, code lost:
        r3.put(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0269, code lost:
        r3.put(r1, r4);
        r15 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 == 0) goto L_0x032d
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            java.lang.String r6 = "ExifInterface"
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x006d
        L_0x0026:
            if (r2 == 0) goto L_0x006d
            java.util.regex.Pattern r3 = f13219w0
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r7 = f13221x0
            java.util.regex.Matcher r7 = r7.matcher(r2)
            boolean r7 = r7.find()
            int r8 = r19.length()
            r9 = 19
            if (r8 != r9) goto L_0x0054
            if (r3 != 0) goto L_0x0049
            if (r7 != 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            if (r7 == 0) goto L_0x006d
            java.lang.String r3 = "-"
            java.lang.String r7 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r7)
            goto L_0x006d
        L_0x0054:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0059:
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x006d:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            boolean r1 = f13216v
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r6, r1)
        L_0x007e:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0080:
            r3 = 2
            r7 = 1
            if (r2 == 0) goto L_0x00f4
            java.util.HashSet r8 = f13210p0
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L_0x00f4
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00df
            java.util.regex.Pattern r8 = f13217v0
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r9 = r8.find()
            if (r9 != 0) goto L_0x00a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0059
        L_0x00a6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.group(r7)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1,"
            r2.append(r4)
            java.lang.String r5 = r8.group(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            r2.append(r4)
            r4 = 3
            java.lang.String r4 = r8.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x00f4
        L_0x00df:
            double r8 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00ed }
            l0.a$f r10 = new l0.a$f     // Catch:{ NumberFormatException -> 0x00ed }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x00ed }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x00ed }
            goto L_0x00f4
        L_0x00ed:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0059
        L_0x00f4:
            r4 = 0
            r5 = r4
        L_0x00f6:
            l0.a$e[][] r8 = f13204j0
            int r8 = r8.length
            if (r5 >= r8) goto L_0x032c
            r8 = 4
            if (r5 != r8) goto L_0x0105
            boolean r8 = r0.f13232i
            if (r8 != 0) goto L_0x0105
        L_0x0102:
            r15 = r7
            goto L_0x0325
        L_0x0105:
            java.util.HashMap[] r8 = f13209o0
            r8 = r8[r5]
            java.lang.Object r8 = r8.get(r1)
            l0.a$e r8 = (l0.a.e) r8
            if (r8 == 0) goto L_0x0102
            if (r2 != 0) goto L_0x011b
            java.util.HashMap[] r8 = r0.f13229f
            r8 = r8[r5]
            r8.remove(r1)
            goto L_0x0102
        L_0x011b:
            android.util.Pair r9 = x(r2)
            int r10 = r8.f13262c
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x01eb
            int r10 = r8.f13262c
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x013a
            goto L_0x01eb
        L_0x013a:
            int r10 = r8.f13263d
            if (r10 == r12) goto L_0x0158
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x0154
            int r10 = r8.f13263d
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x0158
        L_0x0154:
            int r8 = r8.f13263d
            goto L_0x01ed
        L_0x0158:
            int r10 = r8.f13262c
            if (r10 == r7) goto L_0x01e9
            r11 = 7
            if (r10 == r11) goto L_0x01e9
            if (r10 != r3) goto L_0x0163
            goto L_0x01e9
        L_0x0163:
            boolean r10 = f13216v
            if (r10 == 0) goto L_0x0102
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Given tag ("
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ") value didn't match with one of expected formats: "
            r10.append(r11)
            java.lang.String[] r11 = W
            int r13 = r8.f13262c
            r13 = r11[r13]
            r10.append(r13)
            int r13 = r8.f13263d
            java.lang.String r14 = ", "
            java.lang.String r15 = ""
            if (r13 != r12) goto L_0x018c
            r8 = r15
            goto L_0x019f
        L_0x018c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            int r8 = r8.f13263d
            r8 = r11[r8]
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x019f:
            r10.append(r8)
            java.lang.String r8 = " (guess: "
            r10.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r11[r8]
            r10.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x01bf
            goto L_0x01d8
        L_0x01bf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r11[r9]
            r8.append(r9)
            java.lang.String r15 = r8.toString()
        L_0x01d8:
            r10.append(r15)
            java.lang.String r8 = ")"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
        L_0x01e4:
            android.util.Log.d(r6, r8)
            goto L_0x0102
        L_0x01e9:
            r8 = r10
            goto L_0x01ed
        L_0x01eb:
            int r8 = r8.f13262c
        L_0x01ed:
            java.lang.String r9 = "/"
            java.lang.String r10 = ","
            switch(r8) {
                case 1: goto L_0x031b;
                case 2: goto L_0x0311;
                case 3: goto L_0x02ee;
                case 4: goto L_0x02cb;
                case 5: goto L_0x0290;
                case 6: goto L_0x01f4;
                case 7: goto L_0x0311;
                case 8: goto L_0x01f4;
                case 9: goto L_0x026f;
                case 10: goto L_0x022f;
                case 11: goto L_0x01f4;
                case 12: goto L_0x020a;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            boolean r9 = f13216v
            if (r9 == 0) goto L_0x0102
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Data format isn't one of expected formats: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            goto L_0x01e4
        L_0x020a:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r10 = r4
        L_0x0212:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x0220
            r11 = r8[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0212
        L_0x0220:
            java.util.HashMap[] r8 = r0.f13229f
            r8 = r8[r5]
            java.nio.ByteOrder r10 = r0.f13231h
            l0.a$d r9 = l0.a.d.b(r9, r10)
            r8.put(r1, r9)
            goto L_0x0102
        L_0x022f:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r10 = r8.length
            l0.a$f[] r10 = new l0.a.f[r10]
            r11 = r4
        L_0x0237:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x025f
            r13 = r8[r11]
            java.lang.String[] r13 = r13.split(r9, r12)
            l0.a$f r14 = new l0.a$f
            r15 = r13[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r13 = r13[r7]
            r16 = r8
            double r7 = java.lang.Double.parseDouble(r13)
            long r7 = (long) r7
            r14.<init>(r3, r7)
            r10[r11] = r14
            int r11 = r11 + 1
            r8 = r16
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x0237
        L_0x025f:
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            java.nio.ByteOrder r4 = r0.f13231h
            l0.a$d r4 = l0.a.d.d(r10, r4)
        L_0x0269:
            r3.put(r1, r4)
            r15 = 1
            goto L_0x0325
        L_0x026f:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x0277:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0285
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0277
        L_0x0285:
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f13231h
            l0.a$d r4 = l0.a.d.c(r4, r7)
            goto L_0x0269
        L_0x0290:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            l0.a$f[] r4 = new l0.a.f[r4]
            r7 = 0
        L_0x0298:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02bc
            r8 = r3[r7]
            java.lang.String[] r8 = r8.split(r9, r12)
            l0.a$f r10 = new l0.a$f
            r11 = 0
            r13 = r8[r11]
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = (long) r13
            r15 = 1
            r8 = r8[r15]
            double r11 = java.lang.Double.parseDouble(r8)
            long r11 = (long) r11
            r10.<init>(r13, r11)
            r4[r7] = r10
            int r7 = r7 + 1
            r12 = -1
            goto L_0x0298
        L_0x02bc:
            r15 = 1
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f13231h
            l0.a$d r4 = l0.a.d.i(r4, r7)
        L_0x02c7:
            r3.put(r1, r4)
            goto L_0x0325
        L_0x02cb:
            r15 = r7
            r3 = r12
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r7 = 0
        L_0x02d5:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02e3
            r8 = r3[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02d5
        L_0x02e3:
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f13231h
            l0.a$d r4 = l0.a.d.g(r4, r7)
            goto L_0x02c7
        L_0x02ee:
            r15 = r7
            r3 = r12
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x02f8:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0306
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02f8
        L_0x0306:
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f13231h
            l0.a$d r4 = l0.a.d.k(r4, r7)
            goto L_0x02c7
        L_0x0311:
            r15 = r7
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            l0.a$d r4 = l0.a.d.e(r2)
            goto L_0x02c7
        L_0x031b:
            r15 = r7
            java.util.HashMap[] r3 = r0.f13229f
            r3 = r3[r5]
            l0.a$d r4 = l0.a.d.a(r2)
            goto L_0x02c7
        L_0x0325:
            int r5 = r5 + 1
            r7 = r15
            r3 = 2
            r4 = 0
            goto L_0x00f6
        L_0x032c:
            return
        L_0x032d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.Y(java.lang.String, java.lang.String):void");
    }

    public String j(String str) {
        String str2;
        if (str != null) {
            d k10 = k(str);
            if (k10 != null) {
                if (!f13210p0.contains(str)) {
                    return k10.n(this.f13231h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i10 = k10.f13256a;
                    if (i10 == 5 || i10 == 10) {
                        f[] fVarArr = (f[]) k10.o(this.f13231h);
                        if (fVarArr == null || fVarArr.length != 3) {
                            str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                        } else {
                            f fVar = fVarArr[0];
                            Integer valueOf = Integer.valueOf((int) (((float) fVar.f13264a) / ((float) fVar.f13265b)));
                            f fVar2 = fVarArr[1];
                            Integer valueOf2 = Integer.valueOf((int) (((float) fVar2.f13264a) / ((float) fVar2.f13265b)));
                            f fVar3 = fVarArr[2];
                            return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) fVar3.f13264a) / ((float) fVar3.f13265b)))});
                        }
                    } else {
                        str2 = "GPS Timestamp format is not rational. format=" + k10.f13256a;
                    }
                    Log.w("ExifInterface", str2);
                    return null;
                }
                try {
                    return Double.toString(k10.l(this.f13231h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public byte[] u() {
        int i10 = this.f13238o;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[SYNTHETIC, Splitter:B:38:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0090 A[Catch:{ Exception -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] v() {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f13232i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r9.f13237n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f13226c     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            if (r1 == 0) goto L_0x002f
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            if (r3 == 0) goto L_0x0026
            r1.reset()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
        L_0x001a:
            r3 = r2
            goto L_0x0059
        L_0x001c:
            r0 = move-exception
            r3 = r2
        L_0x001e:
            r2 = r1
            goto L_0x00ab
        L_0x0021:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x009d
        L_0x0026:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            d(r1)
            return r2
        L_0x002f:
            java.lang.String r1 = r9.f13224a     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            if (r1 == 0) goto L_0x0044
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            java.lang.String r3 = r9.f13224a     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            r1.<init>(r3)     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            goto L_0x001a
        L_0x003b:
            r0 = move-exception
            r3 = r2
            goto L_0x00ab
        L_0x003f:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L_0x009d
        L_0x0044:
            java.io.FileDescriptor r1 = r9.f13225b     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch:{ Exception -> 0x003f, all -> 0x003b }
            int r3 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            r8 = r3
            r3 = r1
            r1 = r8
        L_0x0059:
            int r4 = r9.f13235l     // Catch:{ Exception -> 0x0088 }
            int r5 = r9.f13239p     // Catch:{ Exception -> 0x0088 }
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch:{ Exception -> 0x0088 }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x0088 }
            int r6 = r9.f13235l     // Catch:{ Exception -> 0x0088 }
            int r7 = r9.f13239p     // Catch:{ Exception -> 0x0088 }
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L_0x0090
            int r4 = r9.f13236m     // Catch:{ Exception -> 0x0088 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0088 }
            int r6 = r1.read(r4)     // Catch:{ Exception -> 0x0088 }
            int r7 = r9.f13236m     // Catch:{ Exception -> 0x0088 }
            if (r6 != r7) goto L_0x008a
            r9.f13237n = r4     // Catch:{ Exception -> 0x0088 }
            d(r1)
            if (r3 == 0) goto L_0x0085
            c(r3)
        L_0x0085:
            return r4
        L_0x0086:
            r0 = move-exception
            goto L_0x001e
        L_0x0088:
            r4 = move-exception
            goto L_0x009d
        L_0x008a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0088 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0088 }
            throw r4     // Catch:{ Exception -> 0x0088 }
        L_0x0090:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0088 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0088 }
            throw r4     // Catch:{ Exception -> 0x0088 }
        L_0x0096:
            r0 = move-exception
            r3 = r1
            goto L_0x00ab
        L_0x0099:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L_0x009d:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x0086 }
            d(r1)
            if (r3 == 0) goto L_0x00aa
            c(r3)
        L_0x00aa:
            return r2
        L_0x00ab:
            d(r2)
            if (r3 == 0) goto L_0x00b3
            c(r3)
        L_0x00b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.v():byte[]");
    }

    public a(String str) {
        e[][] eVarArr = f13204j0;
        this.f13229f = new HashMap[eVarArr.length];
        this.f13230g = new HashSet(eVarArr.length);
        if (str != null) {
            A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }
}
