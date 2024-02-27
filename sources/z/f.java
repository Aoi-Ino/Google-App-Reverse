package z;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f18705a;

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f18706a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18706a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public Object a() {
            return this.f18706a;
        }

        public Uri b() {
            return this.f18706a.getContentUri();
        }

        public void c() {
            this.f18706a.requestPermission();
        }

        public Uri d() {
            return this.f18706a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f18706a.getDescription();
        }

        a(Object obj) {
            this.f18706a = (InputContentInfo) obj;
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f18707a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f18708b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f18709c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18707a = uri;
            this.f18708b = clipDescription;
            this.f18709c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.f18707a;
        }

        public void c() {
        }

        public Uri d() {
            return this.f18709c;
        }

        public ClipDescription getDescription() {
            return this.f18708b;
        }
    }

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f18705a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f18705a.b();
    }

    public ClipDescription b() {
        return this.f18705a.getDescription();
    }

    public Uri c() {
        return this.f18705a.d();
    }

    public void d() {
        this.f18705a.c();
    }

    public Object e() {
        return this.f18705a.a();
    }

    private f(c cVar) {
        this.f18705a = cVar;
    }
}
