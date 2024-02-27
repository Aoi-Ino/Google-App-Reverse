package yo;

import java.security.spec.KeySpec;

public class b implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private short[][] f33151a;

    /* renamed from: b  reason: collision with root package name */
    private short[][] f33152b;

    /* renamed from: c  reason: collision with root package name */
    private short[] f33153c;

    /* renamed from: d  reason: collision with root package name */
    private int f33154d;

    public b(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f33154d = i10;
        this.f33151a = sArr;
        this.f33152b = sArr2;
        this.f33153c = sArr3;
    }

    public short[][] a() {
        return this.f33151a;
    }

    public short[] b() {
        return this.f33153c;
    }

    public short[][] c() {
        return this.f33152b;
    }

    public int d() {
        return this.f33154d;
    }
}
