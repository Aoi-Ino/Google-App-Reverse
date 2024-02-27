package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class h implements Iterable, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final h f7078f = new j(z.f7294c);

    /* renamed from: g  reason: collision with root package name */
    private static final f f7079g = (d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator f7080h = new b();

    /* renamed from: e  reason: collision with root package name */
    private int f7081e = 0;

    class a extends c {

        /* renamed from: e  reason: collision with root package name */
        private int f7082e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final int f7083f;

        a() {
            this.f7083f = h.this.size();
        }

        public byte c() {
            int i10 = this.f7082e;
            if (i10 < this.f7083f) {
                this.f7082e = i10 + 1;
                return h.this.E(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f7082e < this.f7083f;
        }
    }

    class b implements Comparator {
        b() {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g H = hVar.iterator();
            g H2 = hVar2.iterator();
            while (H.hasNext() && H2.hasNext()) {
                int compare = Integer.compare(h.j0(H.c()), h.j0(H2.c()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    static abstract class c implements g {
        c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    private static final class e extends j {

        /* renamed from: j  reason: collision with root package name */
        private final int f7085j;

        /* renamed from: k  reason: collision with root package name */
        private final int f7086k;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.r(i10, i10 + i11, bArr.length);
            this.f7085j = i10;
            this.f7086k = i11;
        }

        /* access modifiers changed from: protected */
        public void B(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7089i, s0() + i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte E(int i10) {
            return this.f7089i[this.f7085j + i10];
        }

        public byte n(int i10) {
            h.o(i10, size());
            return this.f7089i[this.f7085j + i10];
        }

        /* access modifiers changed from: protected */
        public int s0() {
            return this.f7085j;
        }

        public int size() {
            return this.f7086k;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface g extends Iterator {
        byte c();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h  reason: collision with other inner class name */
    static final class C0106h {

        /* renamed from: a  reason: collision with root package name */
        private final k f7087a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f7088b;

        private C0106h(int i10) {
            byte[] bArr = new byte[i10];
            this.f7088b = bArr;
            this.f7087a = k.U(bArr);
        }

        public h a() {
            this.f7087a.c();
            return new j(this.f7088b);
        }

        public k b() {
            return this.f7087a;
        }

        /* synthetic */ C0106h(int i10, a aVar) {
            this(i10);
        }
    }

    static abstract class i extends h {
        i() {
        }
    }

    private static class j extends i {

        /* renamed from: i  reason: collision with root package name */
        protected final byte[] f7089i;

        j(byte[] bArr) {
            bArr.getClass();
            this.f7089i = bArr;
        }

        /* access modifiers changed from: protected */
        public void B(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7089i, i10, bArr, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public byte E(int i10) {
            return this.f7089i[i10];
        }

        public final boolean F() {
            int s02 = s0();
            return o1.n(this.f7089i, s02, size() + s02);
        }

        public final i Y() {
            return i.h(this.f7089i, s0(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int e0(int i10, int i11, int i12) {
            return z.i(i10, this.f7089i, s0() + i11, i12);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int g02 = g0();
            int g03 = jVar.g0();
            if (g02 == 0 || g03 == 0 || g02 == g03) {
                return r0(jVar, 0, size());
            }
            return false;
        }

        public final h h0(int i10, int i11) {
            int r10 = h.r(i10, i11, size());
            return r10 == 0 ? h.f7078f : new e(this.f7089i, s0() + i10, r10);
        }

        /* access modifiers changed from: protected */
        public final String l0(Charset charset) {
            return new String(this.f7089i, s0(), size(), charset);
        }

        public byte n(int i10) {
            return this.f7089i[i10];
        }

        /* access modifiers changed from: package-private */
        public final void q0(g gVar) {
            gVar.a(this.f7089i, s0(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean r0(h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
                } else if (!(hVar instanceof j)) {
                    return hVar.h0(i10, i12).equals(h0(0, i11));
                } else {
                    j jVar = (j) hVar;
                    byte[] bArr = this.f7089i;
                    byte[] bArr2 = jVar.f7089i;
                    int s02 = s0() + i11;
                    int s03 = s0();
                    int s04 = jVar.s0() + i10;
                    while (s03 < s02) {
                        if (bArr[s03] != bArr2[s04]) {
                            return false;
                        }
                        s03++;
                        s04++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int s0() {
            return 0;
        }

        public int size() {
            return this.f7089i.length;
        }
    }

    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    h() {
    }

    static C0106h T(int i10) {
        return new C0106h(i10, (a) null);
    }

    /* access modifiers changed from: private */
    public static int j0(byte b10) {
        return b10 & 255;
    }

    private String n0() {
        if (size() <= 50) {
            return h1.a(this);
        }
        return h1.a(h0(0, 47)) + "...";
    }

    static void o(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static h o0(byte[] bArr) {
        return new j(bArr);
    }

    static h p0(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static h s(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static h v(byte[] bArr, int i10, int i11) {
        r(i10, i10 + i11, bArr.length);
        return new j(f7079g.a(bArr, i10, i11));
    }

    public static h y(String str) {
        return new j(str.getBytes(z.f7292a));
    }

    /* access modifiers changed from: protected */
    public abstract void B(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract byte E(int i10);

    public abstract boolean F();

    /* renamed from: H */
    public g iterator() {
        return new a();
    }

    public abstract i Y();

    /* access modifiers changed from: protected */
    public abstract int e0(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    public final int g0() {
        return this.f7081e;
    }

    public abstract h h0(int i10, int i11);

    public final int hashCode() {
        int i10 = this.f7081e;
        if (i10 == 0) {
            int size = size();
            i10 = e0(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7081e = i10;
        }
        return i10;
    }

    public final byte[] i0() {
        int size = size();
        if (size == 0) {
            return z.f7294c;
        }
        byte[] bArr = new byte[size];
        B(bArr, 0, 0, size);
        return bArr;
    }

    public final String k0(Charset charset) {
        return size() == 0 ? "" : l0(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String l0(Charset charset);

    public final String m0() {
        return k0(z.f7292a);
    }

    public abstract byte n(int i10);

    /* access modifiers changed from: package-private */
    public abstract void q0(g gVar);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), n0()});
    }
}
