package y0;

import a1.b;
import a1.c;
import android.content.Context;
import android.util.Log;
import cm.l;
import d1.g;
import d1.h;
import f1.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

public final class y implements h, g {

    /* renamed from: e  reason: collision with root package name */
    private final Context f18451e;

    /* renamed from: f  reason: collision with root package name */
    private final String f18452f;

    /* renamed from: g  reason: collision with root package name */
    private final File f18453g;

    /* renamed from: h  reason: collision with root package name */
    private final Callable f18454h;

    /* renamed from: i  reason: collision with root package name */
    private final int f18455i;

    /* renamed from: j  reason: collision with root package name */
    private final h f18456j;

    /* renamed from: k  reason: collision with root package name */
    private f f18457k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f18458l;

    public y(Context context, String str, File file, Callable callable, int i10, h hVar) {
        l.f(context, "context");
        l.f(hVar, "delegate");
        this.f18451e = context;
        this.f18452f = str;
        this.f18453g = file;
        this.f18454h = callable;
        this.f18455i = i10;
        this.f18456j = hVar;
    }

    private final void e(File file, boolean z10) {
        ReadableByteChannel newChannel;
        String str;
        if (this.f18452f != null) {
            newChannel = Channels.newChannel(this.f18451e.getAssets().open(this.f18452f));
            str = "newChannel(context.assets.open(copyFromAssetPath))";
        } else if (this.f18453g != null) {
            newChannel = new FileInputStream(this.f18453g).getChannel();
            str = "FileInputStream(copyFromFile).channel";
        } else {
            Callable callable = this.f18454h;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel((InputStream) callable.call());
                    str = "newChannel(inputStream)";
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        l.e(newChannel, str);
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f18451e.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        l.e(channel, "output");
        c.a(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            l.e(createTempFile, "intermediateFile");
            f(createTempFile, z10);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    private final void f(File file, boolean z10) {
        f fVar = this.f18457k;
        if (fVar == null) {
            l.v("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void h(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f18451e.getDatabasePath(databaseName);
            f fVar = this.f18457k;
            f fVar2 = null;
            if (fVar == null) {
                l.v("databaseConfiguration");
                fVar = null;
            }
            boolean z11 = fVar.f18330s;
            File filesDir = this.f18451e.getFilesDir();
            l.e(filesDir, "context.filesDir");
            a aVar = new a(databaseName, filesDir, z11);
            try {
                a.c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    l.e(databasePath, "databaseFile");
                    e(databasePath, z10);
                    aVar.d();
                    return;
                }
                try {
                    l.e(databasePath, "databaseFile");
                    int c10 = b.c(databasePath);
                    if (c10 == this.f18455i) {
                        aVar.d();
                        return;
                    }
                    f fVar3 = this.f18457k;
                    if (fVar3 == null) {
                        l.v("databaseConfiguration");
                    } else {
                        fVar2 = fVar3;
                    }
                    if (fVar2.a(c10, this.f18455i)) {
                        aVar.d();
                        return;
                    }
                    if (this.f18451e.deleteDatabase(databaseName)) {
                        try {
                            e(databasePath, z10);
                        } catch (IOException e10) {
                            Log.w("ROOM", "Unable to copy database file.", e10);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar.d();
                }
            } catch (IOException e12) {
                throw new RuntimeException("Unable to copy database file.", e12);
            } catch (Throwable th2) {
                aVar.d();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public h c() {
        return this.f18456j;
    }

    public synchronized void close() {
        c().close();
        this.f18458l = false;
    }

    public final void g(f fVar) {
        l.f(fVar, "databaseConfiguration");
        this.f18457k = fVar;
    }

    public String getDatabaseName() {
        return c().getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        c().setWriteAheadLoggingEnabled(z10);
    }

    public g u0() {
        if (!this.f18458l) {
            h(true);
            this.f18458l = true;
        }
        return c().u0();
    }
}
