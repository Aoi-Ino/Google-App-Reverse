package go;

import ap.a;

public class i extends g {

    /* renamed from: f  reason: collision with root package name */
    private final k f24038f;

    /* renamed from: g  reason: collision with root package name */
    private final e f24039g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f24040h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f24041i;

    public i(k kVar, e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f24038f = kVar;
        this.f24039g = eVar;
        this.f24040h = a.d(bArr2);
        this.f24041i = a.d(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.i a(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof go.i
            if (r0 == 0) goto L_0x0007
            go.i r4 = (go.i) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0033
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            go.k r0 = go.k.e(r0)
            int r1 = r4.readInt()
            go.e r1 = go.e.e(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            int r3 = r0.d()
            byte[] r3 = new byte[r3]
            r4.readFully(r3)
            go.i r4 = new go.i
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0033:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0056
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004f }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004f }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004f }
            r2.<init>(r4)     // Catch:{ all -> 0x004f }
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            go.i r4 = a(r1)     // Catch:{ all -> 0x004c }
            r1.close()
            return r4
        L_0x004c:
            r4 = move-exception
            r0 = r1
            goto L_0x0050
        L_0x004f:
            r4 = move-exception
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()
        L_0x0055:
            throw r4
        L_0x0056:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0065
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = cp.a.c(r4)
            go.i r4 = a(r4)
            return r4
        L_0x0065:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: go.i.a(java.lang.Object):go.i");
    }

    /* access modifiers changed from: package-private */
    public byte[] b() {
        return a.f().i(this.f24038f.f()).i(this.f24039g.f()).d(this.f24040h).d(this.f24041i).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f24038f.equals(iVar.f24038f) && this.f24039g.equals(iVar.f24039g) && a.a(this.f24040h, iVar.f24040h)) {
            return a.a(this.f24041i, iVar.f24041i);
        }
        return false;
    }

    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.f24038f.hashCode() * 31) + this.f24039g.hashCode()) * 31) + a.j(this.f24040h)) * 31) + a.j(this.f24041i);
    }
}
