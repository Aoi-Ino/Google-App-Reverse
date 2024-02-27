package a1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import cm.l;
import d1.g;
import d1.j;
import java.util.List;
import pl.x;
import y0.u;

public abstract class b {
    public static final void a(g gVar) {
        l.f(gVar, "db");
        List c10 = p.c();
        Cursor w02 = gVar.w0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (w02.moveToNext()) {
            try {
                c10.add(w02.getString(0));
            } catch (Throwable th2) {
                zl.b.a(w02, th);
                throw th2;
            }
        }
        x xVar = x.f30437a;
        zl.b.a(w02, (Throwable) null);
        for (String str : p.a(c10)) {
            l.e(str, "triggerName");
            if (p.A(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.w("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(u uVar, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        l.f(uVar, "db");
        l.f(jVar, "sqLiteQuery");
        Cursor x10 = uVar.x(jVar, cancellationSignal);
        if (!z10 || !(x10 instanceof AbstractWindowedCursor)) {
            return x10;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x10;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(x10) : x10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        zl.b.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            cm.l.f(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0033 }
            r2 = 60
            r4 = 4
            r6 = 1
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x0033 }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x0033 }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0033 }
            if (r1 != r0) goto L_0x0035
            r7.rewind()     // Catch:{ all -> 0x0033 }
            int r0 = r7.getInt()     // Catch:{ all -> 0x0033 }
            r1 = 0
            zl.b.a(r8, r1)
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003d
        L_0x0035:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            zl.b.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.c(java.io.File):int");
    }
}
