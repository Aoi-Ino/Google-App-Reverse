package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o5.h;
import p5.b;
import t5.a;
import t5.t;
import t5.y;
import w5.e;
import w5.g;
import w5.p;

final class d2 implements u3 {

    /* renamed from: i  reason: collision with root package name */
    private static final a f6643i = new a("FakeAssetPackService");

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicInteger f6644j = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    private final String f6645a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6646b;

    /* renamed from: c  reason: collision with root package name */
    private final h1 f6647c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6648d;

    /* renamed from: e  reason: collision with root package name */
    private final r2 f6649e;

    /* renamed from: f  reason: collision with root package name */
    private final y f6650f;

    /* renamed from: g  reason: collision with root package name */
    private final p2 f6651g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f6652h = new Handler(Looper.getMainLooper());

    d2(File file, y yVar, h1 h1Var, Context context, r2 r2Var, y yVar2, p2 p2Var) {
        this.f6645a = file.getAbsolutePath();
        this.f6646b = yVar;
        this.f6647c = h1Var;
        this.f6648d = context;
        this.f6649e = r2Var;
        this.f6650f = yVar2;
        this.f6651g = p2Var;
    }

    static long a(int i10, long j10) {
        if (i10 == 2) {
            return j10 / 2;
        }
        if (i10 == 3 || i10 == 4) {
            return j10;
        }
        return 0;
    }

    private final Bundle d(int i10, String str, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f6649e.a());
        bundle.putInt("session_id", i10);
        File[] f10 = f(str);
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        for (File file : f10) {
            j10 += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i11 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a10 = t.a(file);
            bundle.putParcelableArrayList(b.b("chunk_intents", str, a10), arrayList2);
            bundle.putString(b.b("uncompressed_hash_sha256", str, a10), e(file));
            bundle.putLong(b.b("uncompressed_size", str, a10), file.length());
            arrayList.add(a10);
        }
        bundle.putStringArrayList(b.a("slice_ids", str), arrayList);
        bundle.putLong(b.a("pack_version", str), (long) this.f6649e.a());
        bundle.putInt(b.a("status", str), i11);
        bundle.putInt(b.a("error_code", str), 0);
        bundle.putLong(b.a("bytes_downloaded", str), a(i11, j10));
        bundle.putLong(b.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", a(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        this.f6652h.post(new c2(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        return bundle;
    }

    private static String e(File file) {
        try {
            return f2.a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e10) {
            throw new q5.b("SHA256 algorithm not supported.", e10);
        } catch (IOException e11) {
            throw new q5.b(String.format("Could not digest file: %s.", new Object[]{file}), e11);
        }
    }

    private final File[] f(String str) {
        File file = new File(this.f6645a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new h(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a10 : listFiles) {
                        if (t.a(a10).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new q5.b(String.format("No main slice available for pack '%s'.", new Object[]{str}));
                }
                throw new q5.b(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new q5.b(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new q5.b(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Intent intent) {
        this.f6646b.a(this.f6648d, intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i10, String str) {
        try {
            d(i10, str, 4);
        } catch (q5.b e10) {
            f6643i.e("notifyModuleCompleted failed", e10);
        }
    }

    public final void g() {
        f6643i.d("keepAlive", new Object[0]);
    }

    public final void h(int i10, String str, String str2, int i11) {
        f6643i.d("notifyChunkTransferred", new Object[0]);
    }

    public final void i(int i10) {
        f6643i.d("notifySessionFailed", new Object[0]);
    }

    public final void j(int i10, String str) {
        f6643i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f6650f.a()).execute(new b2(this, i10, str));
    }

    public final e k(Map map) {
        f6643i.d("syncPacks()", new Object[0]);
        return g.c(new ArrayList());
    }

    public final e l(int i10, String str, String str2, int i11) {
        f6643i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i10), str, str2, Integer.valueOf(i11));
        p pVar = new p();
        try {
            for (File file : f(str)) {
                if (t.a(file).equals(str2)) {
                    pVar.c(ParcelFileDescriptor.open(file, 268435456));
                    return pVar.a();
                }
            }
            throw new q5.b(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e10) {
            f6643i.e("getChunkFileDescriptor failed", e10);
            pVar.b(new q5.b("Asset Slice file not found.", e10));
        } catch (q5.b e11) {
            f6643i.e("getChunkFileDescriptor failed", e11);
            pVar.b(e11);
        }
    }

    public final void m(List list) {
        f6643i.d("cancelDownload(%s)", list);
    }
}
