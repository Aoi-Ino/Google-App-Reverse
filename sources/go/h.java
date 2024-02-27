package go;

import java.util.Map;
import java.util.WeakHashMap;

public class h extends g {

    /* renamed from: p  reason: collision with root package name */
    private static a f24025p;

    /* renamed from: q  reason: collision with root package name */
    private static a[] f24026q;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f24027f;

    /* renamed from: g  reason: collision with root package name */
    private final k f24028g;

    /* renamed from: h  reason: collision with root package name */
    private final e f24029h;

    /* renamed from: i  reason: collision with root package name */
    private final int f24030i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f24031j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f24032k = new WeakHashMap();

    /* renamed from: l  reason: collision with root package name */
    private final int f24033l;

    /* renamed from: m  reason: collision with root package name */
    private final xn.a f24034m;

    /* renamed from: n  reason: collision with root package name */
    private int f24035n;

    /* renamed from: o  reason: collision with root package name */
    private i f24036o;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f24037a;

        a(int i10) {
            this.f24037a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f24037a == this.f24037a;
        }

        public int hashCode() {
            return this.f24037a;
        }
    }

    static {
        a aVar = new a(1);
        f24025p = aVar;
        a[] aVarArr = new a[129];
        f24026q = aVarArr;
        aVarArr[1] = aVar;
        int i10 = 2;
        while (true) {
            a[] aVarArr2 = f24026q;
            if (i10 < aVarArr2.length) {
                aVarArr2[i10] = new a(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    public h(k kVar, e eVar, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f24028g = kVar;
        this.f24029h = eVar;
        this.f24035n = i10;
        this.f24027f = ap.a.d(bArr);
        this.f24030i = i11;
        this.f24031j = ap.a.d(bArr2);
        this.f24033l = 1 << (kVar.c() + 1);
        this.f24034m = b.a(kVar.b());
    }

    private byte[] a(int i10) {
        int c10 = 1 << j().c();
        if (i10 >= c10) {
            m.a(d(), this.f24034m);
            m.c(i10, this.f24034m);
            m.b(-32126, this.f24034m);
            m.a(l.a(h(), d(), i10 - c10, g()), this.f24034m);
            byte[] bArr = new byte[this.f24034m.c()];
            this.f24034m.a(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] b10 = b(i11);
        byte[] b11 = b(i11 + 1);
        m.a(d(), this.f24034m);
        m.c(i10, this.f24034m);
        m.b(-31869, this.f24034m);
        m.a(b10, this.f24034m);
        m.a(b11, this.f24034m);
        byte[] bArr2 = new byte[this.f24034m.c()];
        this.f24034m.a(bArr2, 0);
        return bArr2;
    }

    private byte[] c(a aVar) {
        synchronized (this.f24032k) {
            try {
                byte[] bArr = (byte[]) this.f24032k.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a10 = a(aVar.f24037a);
                this.f24032k.put(aVar, a10);
                return a10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.h e(java.lang.Object r8) {
        /*
            boolean r0 = r8 instanceof go.h
            if (r0 == 0) goto L_0x0007
            go.h r8 = (go.h) r8
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0075
            java.io.DataInputStream r8 = (java.io.DataInputStream) r8
            int r0 = r8.readInt()
            if (r0 != 0) goto L_0x006d
            int r0 = r8.readInt()
            go.k r2 = go.k.e(r0)
            int r0 = r8.readInt()
            go.e r3 = go.e.e(r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            int r4 = r8.readInt()
            int r6 = r8.readInt()
            int r0 = r8.readInt()
            if (r0 < 0) goto L_0x0065
            int r1 = r8.available()
            if (r0 > r1) goto L_0x004a
            byte[] r7 = new byte[r0]
            r8.readFully(r7)
            go.h r8 = new go.h
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "secret length exceeded "
            r1.append(r2)
            int r8 = r8.available()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0065:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "secret length less than zero"
            r8.<init>(r0)
            throw r8
        L_0x006d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "expected version 0 lms private key"
            r8.<init>(r0)
            throw r8
        L_0x0075:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x0098
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0091 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0091 }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0091 }
            r2.<init>(r8)     // Catch:{ all -> 0x0091 }
            r1.<init>(r2)     // Catch:{ all -> 0x0091 }
            go.h r8 = e(r1)     // Catch:{ all -> 0x008e }
            r1.close()
            return r8
        L_0x008e:
            r8 = move-exception
            r0 = r1
            goto L_0x0092
        L_0x0091:
            r8 = move-exception
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            throw r8
        L_0x0098:
            boolean r0 = r8 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x00a7
            java.io.InputStream r8 = (java.io.InputStream) r8
            byte[] r8 = cp.a.c(r8)
            go.h r8 = e(r8)
            return r8
        L_0x00a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: go.h.e(java.lang.Object):go.h");
    }

    public static h f(byte[] bArr, byte[] bArr2) {
        h e10 = e(bArr);
        e10.f24036o = i.a(bArr2);
        return e10;
    }

    /* access modifiers changed from: package-private */
    public byte[] b(int i10) {
        if (i10 >= this.f24033l) {
            return a(i10);
        }
        a[] aVarArr = f24026q;
        return c(i10 < aVarArr.length ? aVarArr[i10] : new a(i10));
    }

    public byte[] d() {
        return ap.a.d(this.f24027f);
    }

    public boolean equals(Object obj) {
        i iVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f24035n != hVar.f24035n || this.f24030i != hVar.f24030i || !ap.a.a(this.f24027f, hVar.f24027f)) {
            return false;
        }
        k kVar = this.f24028g;
        if (kVar == null ? hVar.f24028g != null : !kVar.equals(hVar.f24028g)) {
            return false;
        }
        e eVar = this.f24029h;
        if (eVar == null ? hVar.f24029h != null : !eVar.equals(hVar.f24029h)) {
            return false;
        }
        if (!ap.a.a(this.f24031j, hVar.f24031j)) {
            return false;
        }
        i iVar2 = this.f24036o;
        if (iVar2 == null || (iVar = hVar.f24036o) == null) {
            return true;
        }
        return iVar2.equals(iVar);
    }

    public byte[] g() {
        return ap.a.d(this.f24031j);
    }

    public byte[] getEncoded() {
        return a.f().i(0).i(this.f24028g.f()).i(this.f24029h.f()).d(this.f24027f).i(this.f24035n).i(this.f24030i).i(this.f24031j.length).d(this.f24031j).b();
    }

    public e h() {
        return this.f24029h;
    }

    public int hashCode() {
        int j10 = ((this.f24035n * 31) + ap.a.j(this.f24027f)) * 31;
        k kVar = this.f24028g;
        int i10 = 0;
        int hashCode = (j10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e eVar = this.f24029h;
        int hashCode2 = (((((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f24030i) * 31) + ap.a.j(this.f24031j)) * 31;
        i iVar = this.f24036o;
        if (iVar != null) {
            i10 = iVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public i i() {
        i iVar;
        synchronized (this) {
            try {
                if (this.f24036o == null) {
                    this.f24036o = new i(this.f24028g, this.f24029h, c(f24025p), this.f24027f);
                }
                iVar = this.f24036o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public k j() {
        return this.f24028g;
    }
}
