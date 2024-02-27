package go;

import ap.c;
import java.util.Arrays;

class j implements c {

    /* renamed from: e  reason: collision with root package name */
    private final int f24042e;

    /* renamed from: f  reason: collision with root package name */
    private final f f24043f;

    /* renamed from: g  reason: collision with root package name */
    private final k f24044g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[][] f24045h;

    public j(int i10, f fVar, k kVar, byte[][] bArr) {
        this.f24042e = i10;
        this.f24043f = fVar;
        this.f24044g = kVar;
        this.f24045h = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.j a(java.lang.Object r7) {
        /*
            boolean r0 = r7 instanceof go.j
            if (r0 == 0) goto L_0x0007
            go.j r7 = (go.j) r7
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x003b
            r0 = r7
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            go.f r7 = go.f.a(r7)
            int r2 = r0.readInt()
            go.k r2 = go.k.e(r2)
            int r3 = r2.c()
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0035
            int r6 = r2.d()
            byte[] r6 = new byte[r6]
            r4[r5] = r6
            r0.readFully(r6)
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0035:
            go.j r0 = new go.j
            r0.<init>(r1, r7, r2, r4)
            return r0
        L_0x003b:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x005e
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0057 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0057 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0057 }
            r2.<init>(r7)     // Catch:{ all -> 0x0057 }
            r1.<init>(r2)     // Catch:{ all -> 0x0057 }
            go.j r7 = a(r1)     // Catch:{ all -> 0x0054 }
            r1.close()
            return r7
        L_0x0054:
            r7 = move-exception
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r7 = move-exception
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.close()
        L_0x005d:
            throw r7
        L_0x005e:
            boolean r0 = r7 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x006d
            java.io.InputStream r7 = (java.io.InputStream) r7
            byte[] r7 = cp.a.c(r7)
            go.j r7 = a(r7)
            return r7
        L_0x006d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: go.j.a(java.lang.Object):go.j");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f24042e != jVar.f24042e) {
            return false;
        }
        f fVar = this.f24043f;
        if (fVar == null ? jVar.f24043f != null : !fVar.equals(jVar.f24043f)) {
            return false;
        }
        k kVar = this.f24044g;
        if (kVar == null ? jVar.f24044g == null : kVar.equals(jVar.f24044g)) {
            return Arrays.deepEquals(this.f24045h, jVar.f24045h);
        }
        return false;
    }

    public byte[] getEncoded() {
        return a.f().i(this.f24042e).d(this.f24043f.getEncoded()).i(this.f24044g.f()).e(this.f24045h).b();
    }

    public int hashCode() {
        int i10 = this.f24042e * 31;
        f fVar = this.f24043f;
        int i11 = 0;
        int hashCode = (i10 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        k kVar = this.f24044g;
        if (kVar != null) {
            i11 = kVar.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.deepHashCode(this.f24045h);
    }
}
