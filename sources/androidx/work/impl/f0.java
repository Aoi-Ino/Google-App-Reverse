package androidx.work.impl;

import android.content.Context;
import cm.l;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import m1.m;
import pl.o;
import pl.t;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f4212a = new f0();

    private f0() {
    }

    private final File c(Context context) {
        return new File(a.f4121a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        StringBuilder sb2;
        l.f(context, "context");
        f0 f0Var = f4212a;
        if (f0Var.b(context).exists()) {
            m.e().a(g0.f4242a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : f0Var.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        m e10 = m.e();
                        String b10 = g0.f4242a;
                        e10.k(b10, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        sb2 = new StringBuilder();
                        sb2.append("Migrated ");
                        sb2.append(file);
                        sb2.append("to ");
                        sb2.append(file2);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("Renaming ");
                        sb2.append(file);
                        sb2.append(" to ");
                        sb2.append(file2);
                        sb2.append(" failed");
                    }
                    m.e().a(g0.f4242a, sb2.toString());
                }
            }
        }
    }

    public final File a(Context context) {
        l.f(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        l.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        l.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        l.f(context, "context");
        File b10 = b(context);
        File a10 = a(context);
        String[] a11 = g0.f4243b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.b(h0.d(a11.length), 16));
        for (String str : a11) {
            o a12 = t.a(new File(b10.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a12.c(), a12.d());
        }
        return i0.k(linkedHashMap, t.a(b10, a10));
    }
}
