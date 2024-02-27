package go;

public class d extends g {

    /* renamed from: f  reason: collision with root package name */
    private final int f24008f;

    /* renamed from: g  reason: collision with root package name */
    private final i f24009g;

    public d(int i10, i iVar) {
        super(false);
        this.f24008f = i10;
        this.f24009g = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.d a(java.lang.Object r3) {
        /*
            boolean r0 = r3 instanceof go.d
            if (r0 == 0) goto L_0x0007
            go.d r3 = (go.d) r3
            return r3
        L_0x0007:
            boolean r0 = r3 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x001c
            r0 = r3
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
            go.i r3 = go.i.a(r3)
            go.d r1 = new go.d
            r1.<init>(r0, r3)
            return r1
        L_0x001c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x003f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0038 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0038 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            go.d r3 = a(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r3
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r3
        L_0x003f:
            boolean r0 = r3 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x004e
            java.io.InputStream r3 = (java.io.InputStream) r3
            byte[] r3 = cp.a.c(r3)
            go.d r3 = a(r3)
            return r3
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: go.d.a(java.lang.Object):go.d");
    }

    public int b() {
        return this.f24008f;
    }

    public i c() {
        return this.f24009g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24008f != dVar.f24008f) {
            return false;
        }
        return this.f24009g.equals(dVar.f24009g);
    }

    public byte[] getEncoded() {
        return a.f().i(this.f24008f).d(this.f24009g.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f24008f * 31) + this.f24009g.hashCode();
    }
}
