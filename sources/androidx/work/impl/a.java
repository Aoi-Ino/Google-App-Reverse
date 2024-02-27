package androidx.work.impl;

import android.content.Context;
import cm.l;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4121a = new a();

    private a() {
    }

    public final File a(Context context) {
        l.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        l.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
