package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f7292a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f7293b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7294c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f7295d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f7296e;

    public interface a {
    }

    public interface b {
    }

    public interface c {
        boolean a(int i10);
    }

    public interface d extends List, RandomAccess {
        boolean c0();

        void u();

        d z(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f7294c = bArr;
        f7295d = ByteBuffer.wrap(bArr);
        f7296e = i.f(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return o1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((o0) obj).c().n((o0) obj2).H();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f7292a);
    }
}
