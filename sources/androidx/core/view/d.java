package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final f f2567a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f2568a;

        public a(ClipData clipData, int i10) {
            this.f2568a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new C0041d(clipData, i10);
        }

        public d a() {
            return this.f2568a.a();
        }

        public a b(Bundle bundle) {
            this.f2568a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f2568a.c(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f2568a.b(uri);
            return this;
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f2569a;

        b(ClipData clipData, int i10) {
            this.f2569a = g.a(clipData, i10);
        }

        public d a() {
            return new d(new e(this.f2569a.build()));
        }

        public void b(Uri uri) {
            ContentInfo.Builder unused = this.f2569a.setLinkUri(uri);
        }

        public void c(int i10) {
            ContentInfo.Builder unused = this.f2569a.setFlags(i10);
        }

        public void setExtras(Bundle bundle) {
            ContentInfo.Builder unused = this.f2569a.setExtras(bundle);
        }
    }

    private interface c {
        d a();

        void b(Uri uri);

        void c(int i10);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d  reason: collision with other inner class name */
    private static final class C0041d implements c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f2570a;

        /* renamed from: b  reason: collision with root package name */
        int f2571b;

        /* renamed from: c  reason: collision with root package name */
        int f2572c;

        /* renamed from: d  reason: collision with root package name */
        Uri f2573d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f2574e;

        C0041d(ClipData clipData, int i10) {
            this.f2570a = clipData;
            this.f2571b = i10;
        }

        public d a() {
            return new d(new g(this));
        }

        public void b(Uri uri) {
            this.f2573d = uri;
        }

        public void c(int i10) {
            this.f2572c = i10;
        }

        public void setExtras(Bundle bundle) {
            this.f2574e = bundle;
        }
    }

    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f2575a;

        e(ContentInfo contentInfo) {
            this.f2575a = c.a(androidx.core.util.g.g(contentInfo));
        }

        public int a() {
            return this.f2575a.getSource();
        }

        public ClipData b() {
            return this.f2575a.getClip();
        }

        public int c() {
            return this.f2575a.getFlags();
        }

        public ContentInfo d() {
            return this.f2575a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2575a + "}";
        }
    }

    private interface f {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f2576a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2577b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2578c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f2579d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f2580e;

        g(C0041d dVar) {
            this.f2576a = (ClipData) androidx.core.util.g.g(dVar.f2570a);
            this.f2577b = androidx.core.util.g.c(dVar.f2571b, 0, 5, "source");
            this.f2578c = androidx.core.util.g.f(dVar.f2572c, 1);
            this.f2579d = dVar.f2573d;
            this.f2580e = dVar.f2574e;
        }

        public int a() {
            return this.f2577b;
        }

        public ClipData b() {
            return this.f2576a;
        }

        public int c() {
            return this.f2578c;
        }

        public ContentInfo d() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f2576a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f2577b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f2578c));
            String str2 = "";
            if (this.f2579d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f2579d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f2580e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f2567a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2567a.b();
    }

    public int c() {
        return this.f2567a.c();
    }

    public int d() {
        return this.f2567a.a();
    }

    public ContentInfo f() {
        ContentInfo d10 = this.f2567a.d();
        Objects.requireNonNull(d10);
        return c.a(d10);
    }

    public String toString() {
        return this.f2567a.toString();
    }
}
