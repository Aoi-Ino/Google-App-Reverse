package h6;

import android.content.Context;
import android.text.TextUtils;
import s3.n;
import s3.o;
import s3.r;
import w3.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f12045a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12046b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12047c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12048d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12049e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12050f;

    /* renamed from: g  reason: collision with root package name */
    private final String f12051g;

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.l(!l.a(str), "ApplicationId must be set.");
        this.f12046b = str;
        this.f12045a = str2;
        this.f12047c = str3;
        this.f12048d = str4;
        this.f12049e = str5;
        this.f12050f = str6;
        this.f12051g = str7;
    }

    public static k a(Context context) {
        r rVar = new r(context);
        String a10 = rVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new k(a10, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f12045a;
    }

    public String c() {
        return this.f12046b;
    }

    public String d() {
        return this.f12049e;
    }

    public String e() {
        return this.f12051g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n.a(this.f12046b, kVar.f12046b) && n.a(this.f12045a, kVar.f12045a) && n.a(this.f12047c, kVar.f12047c) && n.a(this.f12048d, kVar.f12048d) && n.a(this.f12049e, kVar.f12049e) && n.a(this.f12050f, kVar.f12050f) && n.a(this.f12051g, kVar.f12051g);
    }

    public int hashCode() {
        return n.b(this.f12046b, this.f12045a, this.f12047c, this.f12048d, this.f12049e, this.f12050f, this.f12051g);
    }

    public String toString() {
        return n.c(this).a("applicationId", this.f12046b).a("apiKey", this.f12045a).a("databaseUrl", this.f12047c).a("gcmSenderId", this.f12049e).a("storageBucket", this.f12050f).a("projectId", this.f12051g).toString();
    }
}
