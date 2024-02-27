package t0;

import android.content.Intent;
import android.net.Uri;
import cm.g;
import cm.l;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f16413a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16414b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16415c;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0220a f16416d = new C0220a((g) null);

        /* renamed from: a  reason: collision with root package name */
        private Uri f16417a;

        /* renamed from: b  reason: collision with root package name */
        private String f16418b;

        /* renamed from: c  reason: collision with root package name */
        private String f16419c;

        /* renamed from: t0.o$a$a  reason: collision with other inner class name */
        public static final class C0220a {
            private C0220a() {
            }

            public /* synthetic */ C0220a(g gVar) {
                this();
            }

            public final a a(Uri uri) {
                l.f(uri, "uri");
                a aVar = new a((g) null);
                aVar.b(uri);
                return aVar;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final o a() {
            return new o(this.f16417a, this.f16418b, this.f16419c);
        }

        public final a b(Uri uri) {
            l.f(uri, "uri");
            this.f16417a = uri;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        l.f(intent, "intent");
    }

    public String a() {
        return this.f16414b;
    }

    public String b() {
        return this.f16415c;
    }

    public Uri c() {
        return this.f16413a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    public o(Uri uri, String str, String str2) {
        this.f16413a = uri;
        this.f16414b = str;
        this.f16415c = str2;
    }
}
