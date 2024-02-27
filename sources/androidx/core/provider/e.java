package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.g;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2441b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2442c;

    /* renamed from: d  reason: collision with root package name */
    private final List f2443d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2444e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2445f;

    public e(String str, String str2, String str3, List list) {
        this.f2440a = (String) g.g(str);
        this.f2441b = (String) g.g(str2);
        this.f2442c = (String) g.g(str3);
        this.f2443d = (List) g.g(list);
        this.f2445f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f2443d;
    }

    public int c() {
        return this.f2444e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f2445f;
    }

    public String e() {
        return this.f2440a;
    }

    public String f() {
        return this.f2441b;
    }

    public String g() {
        return this.f2442c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f2440a + ", mProviderPackage: " + this.f2441b + ", mQuery: " + this.f2442c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f2443d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f2443d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f2444e);
        return sb2.toString();
    }
}
