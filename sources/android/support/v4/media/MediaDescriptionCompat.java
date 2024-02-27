package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f403e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f404f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f405g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f406h;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap f407i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f408j;

    /* renamed from: k  reason: collision with root package name */
    private final Bundle f409k;

    /* renamed from: l  reason: collision with root package name */
    private final Uri f410l;

    /* renamed from: m  reason: collision with root package name */
    private Object f411m;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.c(a.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f412a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f413b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f414c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f415d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f416e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f417f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f418g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f419h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f412a, this.f413b, this.f414c, this.f415d, this.f416e, this.f417f, this.f418g, this.f419h);
        }

        public b b(CharSequence charSequence) {
            this.f415d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f418g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f416e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f417f = uri;
            return this;
        }

        public b f(String str) {
            this.f412a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f419h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f414c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f413b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f403e = str;
        this.f404f = charSequence;
        this.f405g = charSequence2;
        this.f406h = charSequence3;
        this.f407i = bitmap;
        this.f408j = uri;
        this.f409k = bundle;
        this.f410l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat c(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0074
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.a.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.a.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.a.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.a.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0044
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0057
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005d:
            r0 = r2
        L_0x005e:
            r1.c(r0)
            if (r4 == 0) goto L_0x0067
            r1.g(r4)
            goto L_0x006e
        L_0x0067:
            android.net.Uri r0 = android.support.v4.media.b.a(r8)
            r1.g(r0)
        L_0x006e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f411m = r8
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.c(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object d() {
        Object obj = this.f411m;
        if (obj != null) {
            return obj;
        }
        Object b10 = a.C0009a.b();
        a.C0009a.g(b10, this.f403e);
        a.C0009a.i(b10, this.f404f);
        a.C0009a.h(b10, this.f405g);
        a.C0009a.c(b10, this.f406h);
        a.C0009a.e(b10, this.f407i);
        a.C0009a.f(b10, this.f408j);
        a.C0009a.d(b10, this.f409k);
        b.a.a(b10, this.f410l);
        Object a10 = a.C0009a.a(b10);
        this.f411m = a10;
        return a10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f404f + ", " + this.f405g + ", " + this.f406h;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        a.i(d(), parcel, i10);
    }
}
