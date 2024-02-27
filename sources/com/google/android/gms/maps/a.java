package com.google.android.gms.maps;

import android.os.Parcelable;

public final class a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            r25 = this;
            r0 = r26
            int r1 = t3.b.v(r26)
            r2 = 0
            r3 = -1
            r4 = 0
            r9 = r2
            r19 = r9
            r20 = r19
            r21 = r20
            r23 = r21
            r24 = r23
            r6 = r3
            r7 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r22 = r18
            r8 = r4
        L_0x0025:
            int r2 = r26.dataPosition()
            if (r2 >= r1) goto L_0x00a4
            int r2 = t3.b.o(r26)
            int r3 = t3.b.i(r2)
            switch(r3) {
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                case 4: goto L_0x0095;
                case 5: goto L_0x008b;
                case 6: goto L_0x0086;
                case 7: goto L_0x0081;
                case 8: goto L_0x007c;
                case 9: goto L_0x0077;
                case 10: goto L_0x0072;
                case 11: goto L_0x006d;
                case 12: goto L_0x0068;
                case 13: goto L_0x0036;
                case 14: goto L_0x0063;
                case 15: goto L_0x005e;
                case 16: goto L_0x0059;
                case 17: goto L_0x0054;
                case 18: goto L_0x0049;
                case 19: goto L_0x0044;
                case 20: goto L_0x003f;
                case 21: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            t3.b.u(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r24 = t3.b.d(r0, r2)
            goto L_0x0025
        L_0x003f:
            java.lang.Integer r23 = t3.b.r(r0, r2)
            goto L_0x0025
        L_0x0044:
            byte r22 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0049:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r3 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r2 = t3.b.c(r0, r2, r3)
            r21 = r2
            com.google.android.gms.maps.model.LatLngBounds r21 = (com.google.android.gms.maps.model.LatLngBounds) r21
            goto L_0x0025
        L_0x0054:
            java.lang.Float r20 = t3.b.n(r0, r2)
            goto L_0x0025
        L_0x0059:
            java.lang.Float r19 = t3.b.n(r0, r2)
            goto L_0x0025
        L_0x005e:
            byte r18 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0063:
            byte r17 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0068:
            byte r16 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x006d:
            byte r15 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0072:
            byte r14 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0077:
            byte r13 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x007c:
            byte r12 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0081:
            byte r11 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x0086:
            byte r10 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x008b:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r3 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r2 = t3.b.c(r0, r2, r3)
            r9 = r2
            com.google.android.gms.maps.model.CameraPosition r9 = (com.google.android.gms.maps.model.CameraPosition) r9
            goto L_0x0025
        L_0x0095:
            int r8 = t3.b.q(r0, r2)
            goto L_0x0025
        L_0x009a:
            byte r7 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x009f:
            byte r6 = t3.b.k(r0, r2)
            goto L_0x0025
        L_0x00a4:
            t3.b.h(r0, r1)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
