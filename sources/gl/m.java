package gl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

public class m implements d {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap f23861a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23862b;

    /* renamed from: c  reason: collision with root package name */
    private int f23863c;

    /* renamed from: d  reason: collision with root package name */
    private int f23864d;

    /* renamed from: e  reason: collision with root package name */
    private int f23865e;

    /* renamed from: f  reason: collision with root package name */
    private int f23866f;

    /* renamed from: g  reason: collision with root package name */
    private int f23867g;

    public m(int i10) {
        if (i10 > 0) {
            this.f23862b = i10;
            this.f23861a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f23863c     // Catch:{ all -> 0x0012 }
            if (r0 < 0) goto L_0x0055
            java.util.LinkedHashMap r0 = r3.f23861a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            int r0 = r3.f23863c     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0014
        L_0x0012:
            r4 = move-exception
            goto L_0x0074
        L_0x0014:
            int r0 = r3.f23863c     // Catch:{ all -> 0x0012 }
            if (r0 <= r4) goto L_0x0053
            java.util.LinkedHashMap r0 = r3.f23861a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            java.util.LinkedHashMap r0 = r3.f23861a     // Catch:{ all -> 0x0012 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0012 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0012 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0012 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r2 = r3.f23861a     // Catch:{ all -> 0x0012 }
            r2.remove(r1)     // Catch:{ all -> 0x0012 }
            int r1 = r3.f23863c     // Catch:{ all -> 0x0012 }
            int r0 = gl.e0.k(r0)     // Catch:{ all -> 0x0012 }
            int r1 = r1 - r0
            r3.f23863c = r1     // Catch:{ all -> 0x0012 }
            int r0 = r3.f23865e     // Catch:{ all -> 0x0012 }
            int r0 = r0 + 1
            r3.f23865e = r0     // Catch:{ all -> 0x0012 }
            monitor-exit(r3)     // Catch:{ all -> 0x0012 }
            goto L_0x0000
        L_0x0053:
            monitor-exit(r3)     // Catch:{ all -> 0x0012 }
            return
        L_0x0055:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0012 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r0.<init>()     // Catch:{ all -> 0x0012 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0012 }
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0012 }
            r4.<init>(r0)     // Catch:{ all -> 0x0012 }
            throw r4     // Catch:{ all -> 0x0012 }
        L_0x0074:
            monitor-exit(r3)     // Catch:{ all -> 0x0012 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.m.c(int):void");
    }

    public final synchronized int a() {
        return this.f23862b;
    }

    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            try {
                this.f23864d++;
                this.f23863c += e0.k(bitmap);
                Bitmap bitmap2 = (Bitmap) this.f23861a.put(str, bitmap);
                if (bitmap2 != null) {
                    this.f23863c -= e0.k(bitmap2);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        c(this.f23862b);
    }

    public Bitmap i(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    Bitmap bitmap = (Bitmap) this.f23861a.get(str);
                    if (bitmap != null) {
                        this.f23866f++;
                        return bitmap;
                    }
                    this.f23867g++;
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final synchronized int size() {
        return this.f23863c;
    }

    public m(Context context) {
        this(e0.b(context));
    }
}
