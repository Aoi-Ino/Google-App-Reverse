package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.o;
import t3.a;
import t3.c;
import w3.d;
import w3.f;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: r  reason: collision with root package name */
    public static d f5214r = f.b();

    /* renamed from: e  reason: collision with root package name */
    final int f5215e;

    /* renamed from: f  reason: collision with root package name */
    private String f5216f;

    /* renamed from: g  reason: collision with root package name */
    private String f5217g;

    /* renamed from: h  reason: collision with root package name */
    private String f5218h;

    /* renamed from: i  reason: collision with root package name */
    private String f5219i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f5220j;

    /* renamed from: k  reason: collision with root package name */
    private String f5221k;

    /* renamed from: l  reason: collision with root package name */
    private long f5222l;

    /* renamed from: m  reason: collision with root package name */
    private String f5223m;

    /* renamed from: n  reason: collision with root package name */
    List f5224n;

    /* renamed from: o  reason: collision with root package name */
    private String f5225o;

    /* renamed from: p  reason: collision with root package name */
    private String f5226p;

    /* renamed from: q  reason: collision with root package name */
    private Set f5227q = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f5215e = i10;
        this.f5216f = str;
        this.f5217g = str2;
        this.f5218h = str3;
        this.f5219i = str4;
        this.f5220j = uri;
        this.f5221k = str5;
        this.f5222l = j10;
        this.f5223m = str6;
        this.f5224n = list;
        this.f5225o = str7;
        this.f5226p = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), o.e(str7), new ArrayList((Collection) o.i(set)), str5, str6);
    }

    public static GoogleSignInAccount m(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount l10 = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        l10.f5221k = str2;
        return l10;
    }

    public String c() {
        return this.f5219i;
    }

    public String d() {
        return this.f5218h;
    }

    public String e() {
        return this.f5226p;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5223m.equals(this.f5223m) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.f5225o;
    }

    public String g() {
        return this.f5216f;
    }

    public String h() {
        return this.f5217g;
    }

    public int hashCode() {
        return ((this.f5223m.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.f5220j;
    }

    public Set j() {
        HashSet hashSet = new HashSet(this.f5224n);
        hashSet.addAll(this.f5227q);
        return hashSet;
    }

    public String k() {
        return this.f5221k;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f5215e);
        c.o(parcel, 2, g(), false);
        c.o(parcel, 3, h(), false);
        c.o(parcel, 4, d(), false);
        c.o(parcel, 5, c(), false);
        c.n(parcel, 6, i(), i10, false);
        c.o(parcel, 7, k(), false);
        c.m(parcel, 8, this.f5222l);
        c.o(parcel, 9, this.f5223m, false);
        c.r(parcel, 10, this.f5224n, false);
        c.o(parcel, 11, f(), false);
        c.o(parcel, 12, e(), false);
        c.b(parcel, a10);
    }
}
