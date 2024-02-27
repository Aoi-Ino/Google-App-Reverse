package go;

import ap.c;
import java.util.Arrays;

class f implements c {

    /* renamed from: e  reason: collision with root package name */
    private final e f24022e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f24023f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f24024g;

    public f(e eVar, byte[] bArr, byte[] bArr2) {
        this.f24022e = eVar;
        this.f24023f = bArr;
        this.f24024g = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.f a(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof go.f
            if (r0 == 0) goto L_0x0007
            go.f r4 = (go.f) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0032
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            go.e r0 = go.e.e(r0)
            int r1 = r0.c()
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            int r2 = r0.d()
            int r3 = r0.c()
            int r2 = r2 * r3
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            go.f r4 = new go.f
            r4.<init>(r0, r1, r2)
            return r4
        L_0x0032:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0055
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004e }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004e }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004e }
            r2.<init>(r4)     // Catch:{ all -> 0x004e }
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            go.f r4 = a(r1)     // Catch:{ all -> 0x004b }
            r1.close()
            return r4
        L_0x004b:
            r4 = move-exception
            r0 = r1
            goto L_0x004f
        L_0x004e:
            r4 = move-exception
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.close()
        L_0x0054:
            throw r4
        L_0x0055:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0064
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = cp.a.c(r4)
            go.f r4 = a(r4)
            return r4
        L_0x0064:
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
        throw new UnsupportedOperationException("Method not decompiled: go.f.a(java.lang.Object):go.f");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        e eVar = this.f24022e;
        if (eVar == null ? fVar.f24022e != null : !eVar.equals(fVar.f24022e)) {
            return false;
        }
        if (!Arrays.equals(this.f24023f, fVar.f24023f)) {
            return false;
        }
        return Arrays.equals(this.f24024g, fVar.f24024g);
    }

    public byte[] getEncoded() {
        return a.f().i(this.f24022e.f()).d(this.f24023f).d(this.f24024g).b();
    }

    public int hashCode() {
        e eVar = this.f24022e;
        return ((((eVar != null ? eVar.hashCode() : 0) * 31) + Arrays.hashCode(this.f24023f)) * 31) + Arrays.hashCode(this.f24024g);
    }
}
