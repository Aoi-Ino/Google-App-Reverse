package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import t5.a;

final class e0 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f6657c = new a("AssetPackStorage");

    /* renamed from: d  reason: collision with root package name */
    private static final long f6658d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f6659e;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6660a;

    /* renamed from: b  reason: collision with root package name */
    private final r2 f6661b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f6658d = timeUnit.toMillis(14);
        f6659e = timeUnit.toMillis(28);
    }

    e0(Context context, r2 r2Var) {
        this.f6660a = context;
        this.f6661b = r2Var;
    }

    private static long g(File file, boolean z10) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z10 && file.listFiles().length > 1) {
            f6657c.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            f6657c.c(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private final File h(String str) {
        return new File(k(), str);
    }

    private final File i(String str, int i10, long j10) {
        return new File(w(str, i10, j10), "merge.tmp");
    }

    private final File j(String str, int i10, long j10) {
        return new File(new File(new File(l(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    private final File k() {
        return new File(this.f6660a.getFilesDir(), "assetpacks");
    }

    private final File l() {
        return new File(k(), "_tmp");
    }

    private final List m() {
        ArrayList arrayList = new ArrayList();
        try {
            if (k().exists()) {
                if (k().listFiles() != null) {
                    for (File file : k().listFiles()) {
                        if (!file.getCanonicalPath().equals(l().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e10) {
            f6657c.b("Could not process directory while scanning installed packs. %s", e10);
        }
    }

    private static void n(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long g10 = g(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(g10)) && !file2.getName().equals("stale.tmp")) {
                    o(file2);
                }
            }
        }
    }

    private static boolean o(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File o10 : listFiles) {
                z10 &= o(o10);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final File A(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    public final File B(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10), str2);
    }

    /* access modifiers changed from: package-private */
    public final File C(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final File D(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final String E(String str) {
        int length;
        File file = new File(k(), str);
        if (!file.exists()) {
            f6657c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f6661b.a()));
        if (!file2.exists()) {
            f6657c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f6661b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f6657c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f6661b.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f6657c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f6661b.a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map F() {
        HashMap hashMap = new HashMap();
        for (File name : m()) {
            String name2 = name.getName();
            int g10 = (int) g(h(name2), true);
            long g11 = g(t(name2, g10), true);
            if (u(name2, g10, g11).exists()) {
                hashMap.put(name2, Long.valueOf(g11));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final Map G() {
        HashMap hashMap = new HashMap();
        for (String str : H().keySet()) {
            hashMap.put(str, Long.valueOf(r(str)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final Map H() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m()) {
                b s10 = s(file.getName());
                if (s10 != null) {
                    hashMap.put(file.getName(), s10);
                }
            }
        } catch (IOException e10) {
            f6657c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void I() {
        for (File file : m()) {
            if (file.listFiles() != null) {
                n(file);
                long g10 = g(file, false);
                if (((long) this.f6661b.a()) != g10) {
                    try {
                        new File(new File(file, String.valueOf(g10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f6657c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File n10 : file.listFiles()) {
                    n(n10);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void J() {
        o(k());
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i10, long j10, int i11) {
        File i12 = i(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        i12.getParentFile().mkdirs();
        i12.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(i12);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, int i10, long j10) {
        File h10 = h(str);
        if (h10.exists()) {
            for (File file : h10.listFiles()) {
                if (!file.getName().equals(String.valueOf(i10)) && !file.getName().equals("stale.tmp")) {
                    o(file);
                } else if (file.getName().equals(String.valueOf(i10))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            o(file2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(List list) {
        int a10 = this.f6661b.a();
        for (File file : m()) {
            if (!list.contains(file.getName()) && g(file, true) != ((long) a10)) {
                o(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str, int i10, long j10) {
        if (!j(str, i10, j10).exists()) {
            return true;
        }
        return o(j(str, i10, j10));
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str, int i10, long j10) {
        if (!u(str, i10, j10).exists()) {
            return true;
        }
        return o(u(str, i10, j10));
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        try {
            return E(str) != null;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final int p(String str) {
        return (int) g(h(str), true);
    }

    /* access modifiers changed from: package-private */
    public final int q(String str, int i10, long j10) {
        File i11 = i(str, i10, j10);
        if (!i11.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(i11);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e10) {
                    throw new d1("Merge checkpoint file corrupt.", (Exception) e10);
                }
            } else {
                throw new d1("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final long r(String str) {
        return g(t(str, (int) g(h(str), true)), true);
    }

    /* access modifiers changed from: package-private */
    public final b s(String str) {
        String E = E(str);
        if (E == null) {
            return null;
        }
        File file = new File(E, "assets");
        if (file.isDirectory()) {
            return new i0(0, E, file.getCanonicalPath());
        }
        f6657c.b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final File t(String str, int i10) {
        return new File(h(str), String.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public final File u(String str, int i10, long j10) {
        return new File(t(str, i10), String.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    public final File v(String str, int i10, long j10) {
        return new File(u(str, i10, j10), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File w(String str, int i10, long j10) {
        return new File(j(str, i10, j10), "_packs");
    }

    /* access modifiers changed from: package-private */
    public final File x(String str, int i10, long j10) {
        return new File(v(str, i10, j10), "properties.dat");
    }

    /* access modifiers changed from: package-private */
    public final File y(String str, int i10, long j10) {
        return new File(new File(j(str, i10, j10), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File z(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint_ext.dat");
    }
}
