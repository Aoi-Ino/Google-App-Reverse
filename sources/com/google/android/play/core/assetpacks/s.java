package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.n;
import t5.a;
import t5.g;
import t5.m;
import t5.p;
import t5.r;
import w5.e;

final class s implements u3 {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final a f6869g = new a("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    private static final Intent f6870h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f6871a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f6872b;

    /* renamed from: c  reason: collision with root package name */
    private final p2 f6873c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public m f6874d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public m f6875e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f6876f = new AtomicBoolean();

    s(Context context, h1 h1Var, p2 p2Var) {
        this.f6871a = context.getPackageName();
        this.f6872b = h1Var;
        this.f6873c = p2Var;
        if (r.b(context)) {
            Context a10 = p.a(context);
            a aVar = f6869g;
            Intent intent = f6870h;
            n nVar = n.f14445a;
            this.f6874d = new m(a10, aVar, "AssetPackService", intent, nVar, (g) null);
            this.f6875e = new m(p.a(context), aVar, "AssetPackService-keepAlive", intent, nVar, (g) null);
        }
        f6869g.a("AssetPackService initiated.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static Bundle b(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    private static e c() {
        f6869g.b("onError(%d)", -11);
        return w5.g.b(new a(-11));
    }

    /* access modifiers changed from: private */
    public final void d(int i10, String str, int i11) {
        if (this.f6874d != null) {
            f6869g.d("notifyModuleCompleted", new Object[0]);
            w5.p pVar = new w5.p();
            this.f6874d.q(new g(this, pVar, i10, str, pVar, i11), pVar);
            return;
        }
        throw new d1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    static /* bridge */ /* synthetic */ Bundle e(int i10, String str, String str2, int i11) {
        Bundle y10 = y(i10, str);
        y10.putString("slice_id", str2);
        y10.putInt("chunk_number", i11);
        return y10;
    }

    static /* bridge */ /* synthetic */ Bundle o(Map map) {
        Bundle a10 = a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        a10.putParcelableArrayList("installed_asset_module", arrayList);
        return a10;
    }

    static /* bridge */ /* synthetic */ ArrayList u(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ List v(s sVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState assetPackState = (AssetPackState) c.c((Bundle) it.next(), sVar.f6872b, sVar.f6873c).a().values().iterator().next();
            if (assetPackState == null) {
                f6869g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (d0.a(assetPackState.d())) {
                arrayList.add(assetPackState.c());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static Bundle y(int i10, String str) {
        Bundle b10 = b(i10);
        b10.putString("module_name", str);
        return b10;
    }

    public final synchronized void g() {
        if (this.f6875e == null) {
            f6869g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        a aVar = f6869g;
        aVar.d("keepAlive", new Object[0]);
        if (!this.f6876f.compareAndSet(false, true)) {
            aVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        w5.p pVar = new w5.p();
        this.f6875e.q(new j(this, pVar, pVar), pVar);
    }

    public final void h(int i10, String str, String str2, int i11) {
        if (this.f6874d != null) {
            f6869g.d("notifyChunkTransferred", new Object[0]);
            w5.p pVar = new w5.p();
            this.f6874d.q(new f(this, pVar, i10, str, str2, i11, pVar), pVar);
            return;
        }
        throw new d1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    public final void i(int i10) {
        if (this.f6874d != null) {
            f6869g.d("notifySessionFailed", new Object[0]);
            w5.p pVar = new w5.p();
            this.f6874d.q(new h(this, pVar, i10, pVar), pVar);
            return;
        }
        throw new d1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    public final void j(int i10, String str) {
        d(i10, str, 10);
    }

    public final e k(Map map) {
        if (this.f6874d == null) {
            return c();
        }
        f6869g.d("syncPacks", new Object[0]);
        w5.p pVar = new w5.p();
        this.f6874d.q(new e(this, pVar, map, pVar), pVar);
        return pVar.a();
    }

    public final e l(int i10, String str, String str2, int i11) {
        if (this.f6874d == null) {
            return c();
        }
        f6869g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        w5.p pVar = new w5.p();
        this.f6874d.q(new i(this, pVar, i10, str, str2, i11, pVar), pVar);
        return pVar.a();
    }

    public final void m(List list) {
        if (this.f6874d != null) {
            f6869g.d("cancelDownloads(%s)", list);
            w5.p pVar = new w5.p();
            this.f6874d.q(new d(this, pVar, list, pVar), pVar);
        }
    }
}
