package s3;

import android.content.ComponentName;
import android.net.Uri;

public final class c1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f15919f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f15920a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15921b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f15922c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f15923d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15924e;

    public c1(String str, String str2, int i10, boolean z10) {
        o.e(str);
        this.f15920a = str;
        o.e(str2);
        this.f15921b = str2;
        this.f15923d = i10;
        this.f15924e = z10;
    }

    public final int a() {
        return this.f15923d;
    }

    public final ComponentName b() {
        return this.f15922c;
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent c(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f15920a
            if (r1 == 0) goto L_0x0061
            boolean r1 = r5.f15924e
            r2 = 0
            if (r1 == 0) goto L_0x0050
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "serviceActionBundleKey"
            java.lang.String r4 = r5.f15920a
            r1.putString(r3, r4)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0024 }
            android.net.Uri r3 = f15919f     // Catch:{ IllegalArgumentException -> 0x0024 }
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch:{ IllegalArgumentException -> 0x0024 }
            goto L_0x0033
        L_0x0024:
            r6 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
            r6 = r2
        L_0x0033:
            if (r6 != 0) goto L_0x0036
            goto L_0x003f
        L_0x0036:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
        L_0x003f:
            if (r2 != 0) goto L_0x0050
            java.lang.String r6 = r5.f15920a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            goto L_0x006c
        L_0x0053:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = r5.f15920a
            r6.<init>(r0)
            java.lang.String r0 = r5.f15921b
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        L_0x0061:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f15922c
            android.content.Intent r2 = r6.setComponent(r0)
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.c1.c(android.content.Context):android.content.Intent");
    }

    public final String d() {
        return this.f15921b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return n.a(this.f15920a, c1Var.f15920a) && n.a(this.f15921b, c1Var.f15921b) && n.a(this.f15922c, c1Var.f15922c) && this.f15923d == c1Var.f15923d && this.f15924e == c1Var.f15924e;
    }

    public final int hashCode() {
        return n.b(this.f15920a, this.f15921b, this.f15922c, Integer.valueOf(this.f15923d), Boolean.valueOf(this.f15924e));
    }

    public final String toString() {
        String str = this.f15920a;
        if (str != null) {
            return str;
        }
        o.i(this.f15922c);
        return this.f15922c.flattenToString();
    }
}
