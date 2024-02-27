package d1;

import android.content.Context;
import cm.l;
import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f9666a = new d();

    private d() {
    }

    public static final File a(Context context) {
        l.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        l.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
