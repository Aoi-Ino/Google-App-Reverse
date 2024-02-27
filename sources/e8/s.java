package e8;

import java.util.Arrays;

public class s implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private transient a[] f11008e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f11009f;

    /* renamed from: g  reason: collision with root package name */
    private int f11010g;

    /* renamed from: h  reason: collision with root package name */
    private float f11011h;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f11012a;

        /* renamed from: b  reason: collision with root package name */
        int f11013b;

        /* renamed from: c  reason: collision with root package name */
        int f11014c;

        /* renamed from: d  reason: collision with root package name */
        a f11015d;

        protected a(int i10, int i11, int i12, a aVar) {
            this.f11012a = i10;
            this.f11013b = i11;
            this.f11014c = i12;
            this.f11015d = aVar;
        }

        /* access modifiers changed from: protected */
        public Object clone() {
            int i10 = this.f11012a;
            int i11 = this.f11013b;
            int i12 = this.f11014c;
            a aVar = this.f11015d;
            return new a(i10, i11, i12, aVar != null ? (a) aVar.clone() : null);
        }
    }

    public s() {
        this(150, 0.75f);
    }

    public boolean a(int i10) {
        a[] aVarArr = this.f11008e;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i10) % aVarArr.length]; aVar != null; aVar = aVar.f11015d) {
            if (aVar.f11012a == i10 && aVar.f11013b == i10) {
                return true;
            }
        }
        return false;
    }

    public int b(int i10) {
        a[] aVarArr = this.f11008e;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i10) % aVarArr.length]; aVar != null; aVar = aVar.f11015d) {
            if (aVar.f11012a == i10 && aVar.f11013b == i10) {
                return aVar.f11014c;
            }
        }
        return 0;
    }

    public int[] c() {
        int i10;
        int[] iArr = new int[this.f11009f];
        int length = this.f11008e.length;
        int i11 = 0;
        a aVar = null;
        while (true) {
            if (aVar == null) {
                while (true) {
                    i10 = length - 1;
                    if (length <= 0 || (aVar = this.f11008e[i10]) != null) {
                        length = i10;
                    } else {
                        length = i10;
                    }
                }
                length = i10;
            }
            if (aVar == null) {
                return iArr;
            }
            a aVar2 = aVar.f11015d;
            iArr[i11] = aVar.f11013b;
            aVar = aVar2;
            i11++;
        }
    }

    public Object clone() {
        try {
            s sVar = (s) super.clone();
            sVar.f11008e = new a[this.f11008e.length];
            int length = this.f11008e.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    return sVar;
                }
                a[] aVarArr = sVar.f11008e;
                a aVar = this.f11008e[i10];
                aVarArr[i10] = aVar != null ? (a) aVar.clone() : null;
                length = i10;
            }
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int d(int i10, int i11) {
        a[] aVarArr = this.f11008e;
        int i12 = Integer.MAX_VALUE & i10;
        int length = i12 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.f11015d) {
            if (aVar.f11012a == i10 && aVar.f11013b == i10) {
                int i13 = aVar.f11014c;
                aVar.f11014c = i11;
                return i13;
            }
        }
        if (this.f11009f >= this.f11010g) {
            e();
            aVarArr = this.f11008e;
            length = i12 % aVarArr.length;
        }
        aVarArr[length] = new a(i10, i10, i11, aVarArr[length]);
        this.f11009f++;
        return 0;
    }

    /* access modifiers changed from: protected */
    public void e() {
        a[] aVarArr = this.f11008e;
        int length = aVarArr.length;
        int i10 = (length * 2) + 1;
        a[] aVarArr2 = new a[i10];
        this.f11010g = (int) (((float) i10) * this.f11011h);
        this.f11008e = aVarArr2;
        while (true) {
            int i11 = length - 1;
            if (length > 0) {
                a aVar = aVarArr[i11];
                while (aVar != null) {
                    a aVar2 = aVar.f11015d;
                    int i12 = (aVar.f11012a & Integer.MAX_VALUE) % i10;
                    aVar.f11015d = aVarArr2[i12];
                    aVarArr2[i12] = aVar;
                    aVar = aVar2;
                }
                length = i11;
            } else {
                return;
            }
        }
    }

    public int[] f() {
        int[] c10 = c();
        Arrays.sort(c10);
        return c10;
    }

    public s(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b8.a.a("illegal.capacity.1", i10));
        } else if (f10 > 0.0f) {
            i10 = i10 == 0 ? 1 : i10;
            this.f11011h = f10;
            this.f11008e = new a[i10];
            this.f11010g = (int) (((float) i10) * f10);
        } else {
            throw new IllegalArgumentException(b8.a.b("illegal.load.1", String.valueOf(f10)));
        }
    }
}
