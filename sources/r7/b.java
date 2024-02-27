package r7;

import java.lang.reflect.Array;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f15609a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15610b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15611c;

    public b(int i10, int i11) {
        this.f15609a = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{i10, i11});
        this.f15610b = i10;
        this.f15611c = i11;
    }

    public void a(byte b10) {
        for (int i10 = 0; i10 < this.f15610b; i10++) {
            for (int i11 = 0; i11 < this.f15611c; i11++) {
                this.f15609a[i10][i11] = b10;
            }
        }
    }

    public byte b(int i10, int i11) {
        return this.f15609a[i10][i11];
    }

    public byte[][] c() {
        return this.f15609a;
    }

    public int d() {
        return this.f15610b;
    }

    public void e(int i10, int i11, int i12) {
        this.f15609a[i10][i11] = (byte) i12;
    }

    public int f() {
        return this.f15611c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.f15610b; i10++) {
            for (int i11 = 0; i11 < this.f15611c; i11++) {
                byte b10 = this.f15609a[i10][i11];
                stringBuffer.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }
}
