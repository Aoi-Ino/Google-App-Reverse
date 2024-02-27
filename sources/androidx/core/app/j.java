package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public abstract class j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f2226a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f2227b;

        /* renamed from: c  reason: collision with root package name */
        private final q[] f2228c;

        /* renamed from: d  reason: collision with root package name */
        private final q[] f2229d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2230e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2231f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2232g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f2233h;

        /* renamed from: i  reason: collision with root package name */
        public int f2234i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f2235j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f2236k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2237l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2236k;
        }

        public boolean b() {
            return this.f2230e;
        }

        public Bundle c() {
            return this.f2226a;
        }

        public IconCompat d() {
            int i10;
            if (this.f2227b == null && (i10 = this.f2234i) != 0) {
                this.f2227b = IconCompat.c((Resources) null, "", i10);
            }
            return this.f2227b;
        }

        public q[] e() {
            return this.f2228c;
        }

        public int f() {
            return this.f2232g;
        }

        public boolean g() {
            return this.f2231f;
        }

        public CharSequence h() {
            return this.f2235j;
        }

        public boolean i() {
            return this.f2237l;
        }

        public boolean j() {
            return this.f2233h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (q[]) null, (q[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q[] qVarArr, q[] qVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2231f = true;
            this.f2227b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f2234i = iconCompat.e();
            }
            this.f2235j = e.d(charSequence);
            this.f2236k = pendingIntent;
            this.f2226a = bundle == null ? new Bundle() : bundle;
            this.f2228c = qVarArr;
            this.f2229d = qVarArr2;
            this.f2230e = z10;
            this.f2232g = i10;
            this.f2231f = z11;
            this.f2233h = z12;
            this.f2237l = z13;
        }
    }

    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f2238e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f2239f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2240g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f2241h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2242i;

        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.j$b$b  reason: collision with other inner class name */
        private static class C0025b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(i iVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c10 = a.c(a.b(iVar.a()), this.f2271b);
            IconCompat iconCompat = this.f2238e;
            Context context = null;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(c10, this.f2238e.m(iVar instanceof k ? ((k) iVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    c10 = a.a(c10, this.f2238e.d());
                }
            }
            if (this.f2240g) {
                if (this.f2239f == null) {
                    a.d(c10, (Bitmap) null);
                } else {
                    if (iVar instanceof k) {
                        context = ((k) iVar).f();
                    }
                    C0025b.a(c10, this.f2239f.m(context));
                }
            }
            if (this.f2273d) {
                a.e(c10, this.f2272c);
            }
            if (i10 >= 31) {
                c.c(c10, this.f2242i);
                c.b(c10, this.f2241h);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f2239f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f2240g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f2238e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f2243e;

        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(i iVar) {
            Notification.BigTextStyle a10 = a.a(a.c(a.b(iVar.a()), this.f2271b), this.f2243e);
            if (this.f2273d) {
                a.d(a10, this.f2272c);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f2243e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        public ArrayList U;

        /* renamed from: a  reason: collision with root package name */
        public Context f2244a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f2245b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f2246c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList f2247d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2248e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2249f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f2250g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f2251h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f2252i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f2253j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f2254k;

        /* renamed from: l  reason: collision with root package name */
        int f2255l;

        /* renamed from: m  reason: collision with root package name */
        int f2256m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2257n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2258o;

        /* renamed from: p  reason: collision with root package name */
        f f2259p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f2260q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f2261r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f2262s;

        /* renamed from: t  reason: collision with root package name */
        int f2263t;

        /* renamed from: u  reason: collision with root package name */
        int f2264u;

        /* renamed from: v  reason: collision with root package name */
        boolean f2265v;

        /* renamed from: w  reason: collision with root package name */
        String f2266w;

        /* renamed from: x  reason: collision with root package name */
        boolean f2267x;

        /* renamed from: y  reason: collision with root package name */
        String f2268y;

        /* renamed from: z  reason: collision with root package name */
        boolean f2269z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context) {
            this(context, (String) null);
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void n(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public e A(int i10) {
            this.F = i10;
            return this;
        }

        public e B(long j10) {
            this.R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2245b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e e(boolean z10) {
            n(16, z10);
            return this;
        }

        public e f(String str) {
            this.K = str;
            return this;
        }

        public e g(int i10) {
            this.E = i10;
            return this;
        }

        public e h(RemoteViews remoteViews) {
            this.R.contentView = remoteViews;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f2250g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f2249f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f2248e = d(charSequence);
            return this;
        }

        public e l(int i10) {
            Notification notification = this.R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bitmap bitmap) {
            this.f2253j = bitmap == null ? null : IconCompat.b(j.b(this.f2244a, bitmap));
            return this;
        }

        public e p(int i10, int i11, int i12) {
            Notification notification = this.R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e q(boolean z10) {
            this.f2269z = z10;
            return this;
        }

        public e r(int i10) {
            this.f2255l = i10;
            return this;
        }

        public e s(boolean z10) {
            n(8, z10);
            return this;
        }

        public e t(int i10) {
            this.f2256m = i10;
            return this;
        }

        public e u(boolean z10) {
            this.f2257n = z10;
            return this;
        }

        public e v(int i10) {
            this.R.icon = i10;
            return this;
        }

        public e w(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(e10);
            return this;
        }

        public e x(f fVar) {
            if (this.f2259p != fVar) {
                this.f2259p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e y(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e z(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e(Context context, String str) {
            this.f2245b = new ArrayList();
            this.f2246c = new ArrayList();
            this.f2247d = new ArrayList();
            this.f2257n = true;
            this.f2269z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f2244a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f2256m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected e f2270a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f2271b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f2272c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2273d = false;

        public void a(Bundle bundle) {
            if (this.f2273d) {
                bundle.putCharSequence("android.summaryText", this.f2272c);
            }
            CharSequence charSequence = this.f2271b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(i iVar);

        /* access modifiers changed from: protected */
        public abstract String c();

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f2270a != eVar) {
                this.f2270a = eVar;
                if (eVar != null) {
                    eVar.x(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(w.b.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(w.b.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
    }
}
