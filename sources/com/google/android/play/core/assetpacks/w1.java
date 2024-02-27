package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import p5.b;
import t5.a;
import t5.y;

final class w1 {

    /* renamed from: g  reason: collision with root package name */
    private static final a f6954g = new a("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6955a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6956b;

    /* renamed from: c  reason: collision with root package name */
    private final h1 f6957c;

    /* renamed from: d  reason: collision with root package name */
    private final y f6958d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f6959e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f6960f = new ReentrantLock();

    w1(e0 e0Var, y yVar, h1 h1Var, y yVar2) {
        this.f6955a = e0Var;
        this.f6956b = yVar;
        this.f6957c = h1Var;
        this.f6958d = yVar2;
    }

    private final t1 o(int i10) {
        Map map = this.f6959e;
        Integer valueOf = Integer.valueOf(i10);
        t1 t1Var = (t1) map.get(valueOf);
        if (t1Var != null) {
            return t1Var;
        }
        throw new d1(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i10);
    }

    private final Object p(v1 v1Var) {
        try {
            this.f6960f.lock();
            return v1Var.a();
        } finally {
            this.f6960f.unlock();
        }
    }

    private static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new d1("Session without pack received.");
    }

    private static List r(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    private final Map s(List list) {
        return (Map) p(new p1(this, list));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map map = this.f6959e;
        Integer valueOf = Integer.valueOf(i10);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        t1 t1Var = (t1) this.f6959e.get(valueOf);
        if (t1Var.f6891c.f6881d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!d0.c(t1Var.f6891c.f6881d, bundle.getInt(b.a("status", q(bundle)))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean b(Bundle bundle) {
        u1 u1Var;
        Bundle bundle2 = bundle;
        int i10 = bundle2.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map map = this.f6959e;
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = true;
        if (map.containsKey(valueOf)) {
            t1 o10 = o(i10);
            int i11 = bundle2.getInt(b.a("status", o10.f6891c.f6878a));
            s1 s1Var = o10.f6891c;
            int i12 = s1Var.f6881d;
            if (d0.c(i12, i11)) {
                f6954g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i12));
                s1 s1Var2 = o10.f6891c;
                String str = s1Var2.f6878a;
                int i13 = s1Var2.f6881d;
                if (i13 == 4) {
                    ((u3) this.f6956b.a()).j(i10, str);
                } else if (i13 == 5) {
                    ((u3) this.f6956b.a()).i(i10);
                } else if (i13 == 6) {
                    ((u3) this.f6956b.a()).m(Arrays.asList(new String[]{str}));
                }
            } else {
                s1Var.f6881d = i11;
                if (d0.d(i11)) {
                    l(i10);
                    this.f6957c.c(o10.f6891c.f6878a);
                } else {
                    for (u1 u1Var2 : s1Var.f6883f) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(b.b("chunk_intents", o10.f6891c.f6878a, u1Var2.f6907a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (!(parcelableArrayList.get(i14) == null || ((Intent) parcelableArrayList.get(i14)).getData() == null)) {
                                    ((q1) u1Var2.f6910d.get(i14)).f6856a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q10 = q(bundle);
            long j10 = bundle2.getLong(b.a("pack_version", q10));
            String string = bundle2.getString(b.a("pack_version_tag", q10), "");
            int i15 = bundle2.getInt(b.a("status", q10));
            long j11 = bundle2.getLong(b.a("total_bytes_to_download", q10));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(b.a("slice_ids", q10));
            ArrayList arrayList = new ArrayList();
            for (String str2 : r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(b.b("chunk_intents", q10, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : r(parcelableArrayList2)) {
                    if (intent == null) {
                        z10 = false;
                    }
                    arrayList2.add(new q1(z10));
                    z10 = true;
                }
                String string2 = bundle2.getString(b.b("uncompressed_hash_sha256", q10, str2));
                long j12 = bundle2.getLong(b.b("uncompressed_size", q10, str2));
                int i16 = bundle2.getInt(b.b("patch_format", q10, str2), 0);
                if (i16 != 0) {
                    u1Var = new u1(str2, string2, j12, arrayList2, 0, i16);
                } else {
                    u1Var = new u1(str2, string2, j12, arrayList2, bundle2.getInt(b.b("compression_format", q10, str2), 0), 0);
                }
                arrayList.add(u1Var);
                z10 = true;
            }
            this.f6959e.put(Integer.valueOf(i10), new t1(i10, bundle2.getInt("app_version_code"), new s1(q10, j10, i15, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(String str, int i10, long j10) {
        t1 t1Var = (t1) s(Arrays.asList(new String[]{str})).get(str);
        if (t1Var == null || d0.d(t1Var.f6891c.f6881d)) {
            f6954g.b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f6955a.d(str, i10, j10);
        t1Var.f6891c.f6881d = 4;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(int i10, int i11) {
        o(i10).f6891c.f6881d = 5;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(int i10) {
        t1 o10 = o(i10);
        s1 s1Var = o10.f6891c;
        if (d0.d(s1Var.f6881d)) {
            this.f6955a.d(s1Var.f6878a, o10.f6890b, s1Var.f6879b);
            s1 s1Var2 = o10.f6891c;
            int i11 = s1Var2.f6881d;
            if (i11 != 5 && i11 != 6) {
                return null;
            }
            this.f6955a.e(s1Var2.f6878a, o10.f6890b, s1Var2.f6879b);
            return null;
        }
        throw new d1(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i10)}), i10);
    }

    /* access modifiers changed from: package-private */
    public final Map f() {
        return this.f6959e;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map g(List list) {
        HashMap hashMap = new HashMap();
        for (t1 t1Var : this.f6959e.values()) {
            String str = t1Var.f6891c.f6878a;
            if (list.contains(str)) {
                t1 t1Var2 = (t1) hashMap.get(str);
                if ((t1Var2 == null ? -1 : t1Var2.f6889a) < t1Var.f6889a) {
                    hashMap.put(str, t1Var);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.f6960f.lock();
    }

    /* access modifiers changed from: package-private */
    public final void i(String str, int i10, long j10) {
        p(new o1(this, str, i10, j10));
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.f6960f.unlock();
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10, int i11) {
        p(new l1(this, i10, 5));
    }

    /* access modifiers changed from: package-private */
    public final void l(int i10) {
        p(new k1(this, i10));
    }

    /* access modifiers changed from: package-private */
    public final boolean m(Bundle bundle) {
        return ((Boolean) p(new m1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean n(Bundle bundle) {
        return ((Boolean) p(new n1(this, bundle))).booleanValue();
    }
}
