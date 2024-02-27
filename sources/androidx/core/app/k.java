package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2274a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f2275b;

    /* renamed from: c  reason: collision with root package name */
    private final j.e f2276c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f2277d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f2278e;

    /* renamed from: f  reason: collision with root package name */
    private final List f2279f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f2280g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f2281h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f2282i;

    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: androidx.core.app.k$k  reason: collision with other inner class name */
    static class C0026k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    k(j.e eVar) {
        int i10;
        this.f2276c = eVar;
        Context context = eVar.f2244a;
        this.f2274a = context;
        this.f2275b = Build.VERSION.SDK_INT >= 26 ? h.a(context, eVar.K) : new Notification.Builder(eVar.f2244a);
        Notification notification = eVar.R;
        this.f2275b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2252i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2248e).setContentText(eVar.f2249f).setContentInfo(eVar.f2254k).setContentIntent(eVar.f2250g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2251h, (notification.flags & 128) != 0).setNumber(eVar.f2255l).setProgress(eVar.f2263t, eVar.f2264u, eVar.f2265v);
        Notification.Builder builder = this.f2275b;
        IconCompat iconCompat = eVar.f2253j;
        f.b(builder, iconCompat == null ? null : iconCompat.m(context));
        a.b(a.d(a.c(this.f2275b, eVar.f2260q), eVar.f2258o), eVar.f2256m);
        Iterator it = eVar.f2245b.iterator();
        while (it.hasNext()) {
            b((j.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f2280g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f2277d = eVar.H;
        this.f2278e = eVar.I;
        b.a(this.f2275b, eVar.f2257n);
        d.i(this.f2275b, eVar.f2269z);
        d.g(this.f2275b, eVar.f2266w);
        d.j(this.f2275b, eVar.f2268y);
        d.h(this.f2275b, eVar.f2267x);
        this.f2281h = eVar.O;
        e.b(this.f2275b, eVar.C);
        e.c(this.f2275b, eVar.E);
        e.f(this.f2275b, eVar.F);
        e.d(this.f2275b, eVar.G);
        e.e(this.f2275b, notification.sound, notification.audioAttributes);
        List<String> e10 = i11 < 28 ? e(g(eVar.f2246c), eVar.U) : eVar.U;
        if (e10 != null && !e10.isEmpty()) {
            for (String a10 : e10) {
                e.a(this.f2275b, a10);
            }
        }
        this.f2282i = eVar.J;
        if (eVar.f2247d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f2247d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), l.a((j.a) eVar.f2247d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f2280g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            f.c(this.f2275b, obj);
        }
        c.a(this.f2275b, eVar.D);
        g.e(this.f2275b, eVar.f2262s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            g.c(this.f2275b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            g.b(this.f2275b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            g.d(this.f2275b, remoteViews3);
        }
        if (i13 >= 26) {
            h.b(this.f2275b, eVar.L);
            h.e(this.f2275b, eVar.f2261r);
            h.f(this.f2275b, eVar.M);
            h.g(this.f2275b, eVar.N);
            h.d(this.f2275b, eVar.O);
            if (eVar.B) {
                h.c(this.f2275b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f2275b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i13 >= 28) {
            Iterator it2 = eVar.f2246c.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        if (i13 >= 29) {
            j.a(this.f2275b, eVar.Q);
            j.b(this.f2275b, j.d.a((j.d) null));
        }
        if (i13 >= 31 && (i10 = eVar.P) != 0) {
            C0026k.b(this.f2275b, i10);
        }
        if (eVar.S) {
            if (this.f2276c.f2267x) {
                this.f2281h = 2;
            } else {
                this.f2281h = 1;
            }
            this.f2275b.setVibrate((long[]) null);
            this.f2275b.setSound((Uri) null);
            int i14 = notification.defaults & -4;
            notification.defaults = i14;
            this.f2275b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f2276c.f2266w)) {
                    d.g(this.f2275b, "silent");
                }
                h.d(this.f2275b, this.f2281h);
            }
        }
    }

    private void b(j.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = f.a(d10 != null ? d10.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput c10 : q.b(aVar.e())) {
                d.c(a10, c10);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        g.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            i.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            j.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            C0026k.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a10, bundle);
        d.a(this.f2275b, d.d(a10));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        o.b bVar = new o.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Notification.Builder a() {
        return this.f2275b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        j.f fVar = this.f2276c.f2259p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e10 = fVar != null ? fVar.e(this) : null;
        Notification d11 = d();
        if (!(e10 == null && (e10 = this.f2276c.H) == null)) {
            d11.contentView = e10;
        }
        if (!(fVar == null || (d10 = fVar.d(this)) == null)) {
            d11.bigContentView = d10;
        }
        if (!(fVar == null || (f10 = this.f2276c.f2259p.f(this)) == null)) {
            d11.headsUpContentView = f10;
        }
        if (!(fVar == null || (a10 = j.a(d11)) == null)) {
            fVar.a(a10);
        }
        return d11;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f2275b);
        }
        Notification a10 = a.a(this.f2275b);
        if (this.f2281h != 0) {
            if (!(d.f(a10) == null || (a10.flags & 512) == 0 || this.f2281h != 2)) {
                h(a10);
            }
            if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f2281h == 1) {
                h(a10);
            }
        }
        return a10;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f2274a;
    }
}
