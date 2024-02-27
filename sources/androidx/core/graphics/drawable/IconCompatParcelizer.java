package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2362a = aVar.p(iconCompat.f2362a, 1);
        iconCompat.f2364c = aVar.j(iconCompat.f2364c, 2);
        iconCompat.f2365d = aVar.r(iconCompat.f2365d, 3);
        iconCompat.f2366e = aVar.p(iconCompat.f2366e, 4);
        iconCompat.f2367f = aVar.p(iconCompat.f2367f, 5);
        iconCompat.f2368g = (ColorStateList) aVar.r(iconCompat.f2368g, 6);
        iconCompat.f2370i = aVar.t(iconCompat.f2370i, 7);
        iconCompat.f2371j = aVar.t(iconCompat.f2371j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f2362a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f2364c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2365d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f2366e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f2367f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2368g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2370i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2371j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
