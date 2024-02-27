package qn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class u extends z {

    /* renamed from: g  reason: collision with root package name */
    static final m0 f30996g = new a(u.class, 6);

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentMap f30997h = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final String f30998e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f30999f;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return u.j0(q1Var.l0(), false);
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f31000a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f31001b;

        b(byte[] bArr) {
            this.f31000a = ap.a.j(bArr);
            this.f31001b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ap.a.a(this.f31001b, ((b) obj).f31001b);
            }
            return false;
        }

        public int hashCode() {
            return this.f31000a;
        }
    }

    public u(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        } else if (p0(str)) {
            this.f30998e = str;
        } else {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
    }

    static u j0(byte[] bArr, boolean z10) {
        u uVar = (u) f30997h.get(new b(bArr));
        return uVar == null ? new u(bArr, z10) : uVar;
    }

    private void k0(ByteArrayOutputStream byteArrayOutputStream) {
        u2 u2Var = new u2(this.f30998e);
        int parseInt = Integer.parseInt(u2Var.b()) * 40;
        String b10 = u2Var.b();
        if (b10.length() <= 18) {
            b0.n0(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(b10));
        } else {
            b0.o0(byteArrayOutputStream, new BigInteger(b10).add(BigInteger.valueOf((long) parseInt)));
        }
        while (u2Var.a()) {
            String b11 = u2Var.b();
            if (b11.length() <= 18) {
                b0.n0(byteArrayOutputStream, Long.parseLong(b11));
            } else {
                b0.o0(byteArrayOutputStream, new BigInteger(b11));
            }
        }
    }

    private synchronized byte[] l0() {
        try {
            if (this.f30999f == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                k0(byteArrayOutputStream);
                this.f30999f = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f30999f;
    }

    public static u n0(Object obj) {
        if (obj == null || (obj instanceof u)) {
            return (u) obj;
        }
        if (obj instanceof f) {
            z n10 = ((f) obj).n();
            if (n10 instanceof u) {
                return (u) n10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (u) f30996g.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean p0(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return b0.m0(str, 2);
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 6, l0());
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, l0().length);
    }

    public int hashCode() {
        return this.f30998e.hashCode();
    }

    public u i0(String str) {
        return new u(this, str);
    }

    public String m0() {
        return this.f30998e;
    }

    public u o0() {
        b bVar = new b(l0());
        ConcurrentMap concurrentMap = f30997h;
        u uVar = (u) concurrentMap.get(bVar);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = (u) concurrentMap.putIfAbsent(bVar, this);
        return uVar2 == null ? this : uVar2;
    }

    public boolean q0(u uVar) {
        String m02 = m0();
        String m03 = uVar.m0();
        return m02.length() > m03.length() && m02.charAt(m03.length()) == '.' && m02.startsWith(m03);
    }

    public String toString() {
        return m0();
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (zVar == this) {
            return true;
        }
        if (!(zVar instanceof u)) {
            return false;
        }
        return this.f30998e.equals(((u) zVar).f30998e);
    }

    u(u uVar, String str) {
        if (b0.m0(str, 0)) {
            this.f30998e = uVar.m0() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }

    u(byte[] bArr, boolean z10) {
        int i10;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        BigInteger bigInteger = null;
        int i11 = 0;
        long j10 = 0;
        while (i11 != bArr2.length) {
            byte b10 = bArr2[i11];
            if (j10 <= 72057594037927808L) {
                i10 = i11;
                long j11 = j10 + ((long) (b10 & Byte.MAX_VALUE));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        if (j11 < 40) {
                            stringBuffer.append('0');
                        } else if (j11 < 80) {
                            stringBuffer.append('1');
                            j11 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j11 -= 80;
                        }
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                } else {
                    j10 = j11 << 7;
                    i11 = i10 + 1;
                }
            } else {
                i10 = i11;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf((long) (b10 & Byte.MAX_VALUE)));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                    i11 = i10 + 1;
                }
            }
            j10 = 0;
            i11 = i10 + 1;
        }
        this.f30998e = stringBuffer.toString();
        this.f30999f = z10 ? ap.a.d(bArr) : bArr2;
    }
}
