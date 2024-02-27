package s3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p3.c;
import s3.j;
import t3.a;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new b1();

    /* renamed from: s  reason: collision with root package name */
    static final Scope[] f15957s = new Scope[0];

    /* renamed from: t  reason: collision with root package name */
    static final c[] f15958t = new c[0];

    /* renamed from: e  reason: collision with root package name */
    final int f15959e;

    /* renamed from: f  reason: collision with root package name */
    final int f15960f;

    /* renamed from: g  reason: collision with root package name */
    int f15961g;

    /* renamed from: h  reason: collision with root package name */
    String f15962h;

    /* renamed from: i  reason: collision with root package name */
    IBinder f15963i;

    /* renamed from: j  reason: collision with root package name */
    Scope[] f15964j;

    /* renamed from: k  reason: collision with root package name */
    Bundle f15965k;

    /* renamed from: l  reason: collision with root package name */
    Account f15966l;

    /* renamed from: m  reason: collision with root package name */
    c[] f15967m;

    /* renamed from: n  reason: collision with root package name */
    c[] f15968n;

    /* renamed from: o  reason: collision with root package name */
    boolean f15969o;

    /* renamed from: p  reason: collision with root package name */
    int f15970p;

    /* renamed from: q  reason: collision with root package name */
    boolean f15971q;

    /* renamed from: r  reason: collision with root package name */
    private String f15972r;

    g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f15957s : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f15958t : cVarArr;
        cVarArr2 = cVarArr2 == null ? f15958t : cVarArr2;
        this.f15959e = i10;
        this.f15960f = i11;
        this.f15961g = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f15962h = "com.google.android.gms";
        } else {
            this.f15962h = str;
        }
        if (i10 < 2) {
            this.f15966l = iBinder != null ? a.j(j.a.d(iBinder)) : null;
        } else {
            this.f15963i = iBinder;
            this.f15966l = account;
        }
        this.f15964j = scopeArr;
        this.f15965k = bundle;
        this.f15967m = cVarArr;
        this.f15968n = cVarArr2;
        this.f15969o = z10;
        this.f15970p = i13;
        this.f15971q = z11;
        this.f15972r = str2;
    }

    public final String c() {
        return this.f15972r;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        b1.a(this, parcel, i10);
    }
}
