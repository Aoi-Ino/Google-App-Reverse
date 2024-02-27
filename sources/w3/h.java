package w3;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f17866a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f17867b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        int i10 = 0;
        while (i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0)) {
            char[] cArr = f17866a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
            i10++;
        }
        return sb2.toString();
    }
}
