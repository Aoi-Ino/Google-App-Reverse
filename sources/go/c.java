package go;

import java.util.Collections;
import java.util.List;

public class c extends g {

    /* renamed from: f  reason: collision with root package name */
    private final int f24001f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f24002g;

    /* renamed from: h  reason: collision with root package name */
    private List f24003h;

    /* renamed from: i  reason: collision with root package name */
    private List f24004i;

    /* renamed from: j  reason: collision with root package name */
    private final long f24005j;

    /* renamed from: k  reason: collision with root package name */
    private long f24006k = 0;

    /* renamed from: l  reason: collision with root package name */
    private d f24007l;

    private c(int i10, List list, List list2, long j10, long j11, boolean z10) {
        super(true);
        this.f24001f = i10;
        this.f24003h = Collections.unmodifiableList(list);
        this.f24004i = Collections.unmodifiableList(list2);
        this.f24006k = j10;
        this.f24005j = j11;
        this.f24002g = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static go.c a(java.lang.Object r11) {
        /*
            boolean r0 = r11 instanceof go.c
            if (r0 == 0) goto L_0x0007
            go.c r11 = (go.c) r11
            return r11
        L_0x0007:
            boolean r0 = r11 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0059
            r0 = r11
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0051
            int r3 = r0.readInt()
            long r6 = r0.readLong()
            long r8 = r0.readLong()
            boolean r10 = r0.readBoolean()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r1 = r0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            go.h r2 = go.h.e(r11)
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r3 + -1
            if (r0 >= r1) goto L_0x004a
            go.j r1 = go.j.a(r11)
            r5.add(r1)
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004a:
            go.c r11 = new go.c
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            return r11
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown version for hss private key"
            r11.<init>(r0)
            throw r11
        L_0x0059:
            boolean r0 = r11 instanceof byte[]
            if (r0 == 0) goto L_0x007c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0075 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0075 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x0075 }
            r2.<init>(r11)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            go.c r11 = a(r1)     // Catch:{ all -> 0x0072 }
            r1.close()
            return r11
        L_0x0072:
            r11 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0075:
            r11 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()
        L_0x007b:
            throw r11
        L_0x007c:
            boolean r0 = r11 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r11 = (java.io.InputStream) r11
            byte[] r11 = cp.a.c(r11)
            go.c r11 = a(r11)
            return r11
        L_0x008b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: go.c.a(java.lang.Object):go.c");
    }

    public static c b(byte[] bArr, byte[] bArr2) {
        c a10 = a(bArr);
        a10.f24007l = d.a(bArr2);
        return a10;
    }

    private static c f(c cVar) {
        try {
            return a(cVar.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public int c() {
        return this.f24001f;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        return f(this);
    }

    public synchronized d d() {
        return new d(this.f24001f, e().i());
    }

    /* access modifiers changed from: package-private */
    public h e() {
        return (h) this.f24003h.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24001f == cVar.f24001f && this.f24002g == cVar.f24002g && this.f24005j == cVar.f24005j && this.f24006k == cVar.f24006k && this.f24003h.equals(cVar.f24003h)) {
            return this.f24004i.equals(cVar.f24004i);
        }
        return false;
    }

    public synchronized byte[] getEncoded() {
        a a10;
        try {
            a10 = a.f().i(0).i(this.f24001f).j(this.f24006k).j(this.f24005j).a(this.f24002g);
            for (h c10 : this.f24003h) {
                a10.c(c10);
            }
            for (j c11 : this.f24004i) {
                a10.c(c11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10.b();
    }

    public int hashCode() {
        long j10 = this.f24005j;
        long j11 = this.f24006k;
        return (((((((((this.f24001f * 31) + (this.f24002g ? 1 : 0)) * 31) + this.f24003h.hashCode()) * 31) + this.f24004i.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }
}
