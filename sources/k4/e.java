package k4;

public abstract class e extends f4.e implements f {
    public e() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 != r6) goto L_0x0029
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x000b
            r3 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof k4.b
            if (r1 == 0) goto L_0x0019
            r3 = r0
            k4.b r3 = (k4.b) r3
            goto L_0x001f
        L_0x0019:
            k4.l r0 = new k4.l
            r0.<init>(r3)
            r3 = r0
        L_0x001f:
            f4.f.a(r4)
            r2.s(r3)
            r5.writeNoException()
            return r6
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.c(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
