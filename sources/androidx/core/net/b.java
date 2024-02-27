package androidx.core.net;

import android.net.Uri;
import cm.l;
import java.io.File;

public abstract class b {
    public static final File a(Uri uri) {
        if (l.a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }
}
