package ql;

import java.util.Arrays;
import java.util.List;

abstract class l extends k {
    public static List c(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        List a10 = n.a(objArr);
        cm.l.e(a10, "asList(this)");
        return a10;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        cm.l.f(bArr, "<this>");
        cm.l.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static Object[] e(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        cm.l.f(objArr, "<this>");
        cm.l.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return e(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] h(byte[] bArr, int i10, int i11) {
        cm.l.f(bArr, "<this>");
        j.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        cm.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static Object[] i(Object[] objArr, int i10, int i11) {
        cm.l.f(objArr, "<this>");
        j.b(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        cm.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static void j(int[] iArr, int i10, int i11, int i12) {
        cm.l.f(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static void k(Object[] objArr, Object obj, int i10, int i11) {
        cm.l.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void l(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        k(objArr, obj, i10, i11);
    }

    public static float[] m(float[] fArr, float[] fArr2) {
        cm.l.f(fArr, "<this>");
        cm.l.f(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static int[] n(int[] iArr, int[] iArr2) {
        cm.l.f(iArr, "<this>");
        cm.l.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static long[] o(long[] jArr, long[] jArr2) {
        cm.l.f(jArr, "<this>");
        cm.l.f(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static Object[] p(Object[] objArr, Object obj) {
        cm.l.f(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static Object[] q(Object[] objArr, Object[] objArr2) {
        cm.l.f(objArr, "<this>");
        cm.l.f(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static boolean[] r(boolean[] zArr, boolean[] zArr2) {
        cm.l.f(zArr, "<this>");
        cm.l.f(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        cm.l.e(copyOf, "result");
        return copyOf;
    }

    public static final void s(Object[] objArr) {
        cm.l.f(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }
}
