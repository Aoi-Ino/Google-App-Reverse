package s7;

import java.util.Vector;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f16062a;

    /* renamed from: b  reason: collision with root package name */
    private final Vector f16063b;

    public c(a aVar) {
        if (a.f16054e.equals(aVar)) {
            this.f16062a = aVar;
            Vector vector = new Vector();
            this.f16063b = vector;
            vector.addElement(new b(aVar, new int[]{1}));
            return;
        }
        throw new IllegalArgumentException("Only QR Code is supported at this time");
    }

    private b a(int i10) {
        if (i10 >= this.f16063b.size()) {
            Vector vector = this.f16063b;
            b bVar = (b) vector.elementAt(vector.size() - 1);
            for (int size = this.f16063b.size(); size <= i10; size++) {
                a aVar = this.f16062a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c(size - 1)}));
                this.f16063b.addElement(bVar);
            }
        }
        return (b) this.f16063b.elementAt(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                b a10 = a(i10);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d10 = new b(this.f16062a, iArr2).h(i10, 1).b(a10)[1].d();
                int length2 = i10 - d10.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    iArr[length + i11] = 0;
                }
                System.arraycopy(d10, 0, iArr, length + length2, d10.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
