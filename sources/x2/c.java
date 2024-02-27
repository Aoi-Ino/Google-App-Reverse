package x2;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import cm.l;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import km.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18193a = new c();

    private c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r9 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r9 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String a(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r8 = this;
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            if (r9 == 0) goto L_0x002f
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x002d }
            if (r10 == 0) goto L_0x002f
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ Exception -> 0x002d }
            r9.close()
            return r10
        L_0x002a:
            r10 = move-exception
            r7 = r9
            goto L_0x0040
        L_0x002d:
            r10 = move-exception
            goto L_0x0039
        L_0x002f:
            if (r9 == 0) goto L_0x003f
        L_0x0031:
            r9.close()
            goto L_0x003f
        L_0x0035:
            r10 = move-exception
            goto L_0x0040
        L_0x0037:
            r10 = move-exception
            r9 = r7
        L_0x0039:
            r10.printStackTrace()     // Catch:{ all -> 0x002a }
            if (r9 == 0) goto L_0x003f
            goto L_0x0031
        L_0x003f:
            return r7
        L_0x0040:
            if (r7 == 0) goto L_0x0045
            r7.close()
        L_0x0045:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            java.lang.String r0 = r9.c(r10, r11)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "/Download/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r11)
            java.lang.String r11 = "id"
            cm.l.e(r2, r11)
            r11 = 0
            r0 = 2
            java.lang.String r1 = ":"
            r8 = 0
            boolean r11 = km.q.F(r2, r1, r11, r0, r8)
            if (r11 == 0) goto L_0x0056
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r11 = km.q.l0(r2, r3, r4, r5, r6, r7)
            r0 = 1
            java.lang.Object r11 = r11.get(r0)
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
        L_0x0056:
            java.lang.String r11 = "content://downloads/public_downloads"
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r1 = "java.lang.Long.valueOf(id)"
            cm.l.e(r0, r1)
            long r0 = r0.longValue()
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r11, r0)
            java.lang.String r0 = "ContentUris.withAppended…ong.valueOf(id)\n        )"
            cm.l.e(r11, r0)
            java.lang.String r10 = r9.a(r10, r11, r8, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.b(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String c(android.content.Context r9, android.net.Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ all -> 0x0030 }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0030 }
            if (r9 == 0) goto L_0x002a
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0027 }
            if (r10 == 0) goto L_0x002a
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0027 }
            r9.close()
            return r10
        L_0x0027:
            r10 = move-exception
            r7 = r9
            goto L_0x0031
        L_0x002a:
            if (r9 == 0) goto L_0x002f
            r9.close()
        L_0x002f:
            return r7
        L_0x0030:
            r10 = move-exception
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            r7.close()
        L_0x0036:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.c(android.content.Context, android.net.Uri):java.lang.String");
    }

    private final String d(Context context, Uri uri) {
        List list;
        String documentId = DocumentsContract.getDocumentId(uri);
        l.e(documentId, "docId");
        List d10 = new f(":").d(documentId, 0);
        if (!d10.isEmpty()) {
            ListIterator listIterator = d10.listIterator(d10.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = y.p0(d10, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = q.i();
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            String str = strArr[0];
            return a(context, l.a("image", str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : l.a("video", str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : l.a("audio", str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null, "_id=?", new String[]{strArr[1]});
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final String e(Context context, Uri uri) {
        List list;
        StringBuilder sb2;
        String str;
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String scheme = uri.getScheme();
            l.c(scheme);
            if (p.o("content", scheme, true)) {
                return j(uri) ? uri.getLastPathSegment() : a(context, uri, (String) null, (String[]) null);
            }
            String scheme2 = uri.getScheme();
            l.c(scheme2);
            if (p.o("file", scheme2, true)) {
                return uri.getPath();
            }
        } else if (i(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            l.e(documentId, "docId");
            List d10 = new f(":").d(documentId, 0);
            if (!d10.isEmpty()) {
                ListIterator listIterator = d10.listIterator(d10.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = y.p0(d10, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = q.i();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (!p.o("primary", strArr[0], true)) {
                    String str2 = "storage/" + p.w(documentId, ":", "/", false, 4, (Object) null);
                    if (new File(str2).exists()) {
                        return str2;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("/storage/sdcard/");
                    str = strArr[1];
                } else if (strArr.length > 1) {
                    sb2 = new StringBuilder();
                    sb2.append(Environment.getExternalStorageDirectory().toString());
                    sb2.append("/");
                    str = strArr[1];
                } else {
                    return Environment.getExternalStorageDirectory().toString() + "/";
                }
                sb2.append(str);
                return sb2.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (h(uri)) {
            return b(context, uri);
        } else {
            if (k(uri)) {
                return d(context, uri);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        r6 = null;
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0052 A[SYNTHETIC, Splitter:B:38:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC, Splitter:B:42:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x005d A[SYNTHETIC, Splitter:B:48:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0062 A[SYNTHETIC, Splitter:B:52:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String f(android.content.Context r6, android.net.Uri r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            x2.e r2 = x2.e.f18194a     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.String r3 = r2.d(r7)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.io.InputStream r7 = r4.openInputStream(r7)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            java.lang.String r4 = "context.cacheDir"
            cm.l.e(r6, r4)     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            java.io.File r6 = r2.f(r6, r3)     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            if (r6 != 0) goto L_0x0025
            if (r7 == 0) goto L_0x0024
            r7.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return r0
        L_0x0025:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            if (r7 == 0) goto L_0x0036
            r3 = 4096(0x1000, float:5.74E-42)
            zl.a.a(r7, r2, r3)     // Catch:{ IOException -> 0x005b, all -> 0x0033 }
            r3 = 1
            goto L_0x0037
        L_0x0033:
            r6 = move-exception
        L_0x0034:
            r0 = r7
            goto L_0x0050
        L_0x0036:
            r3 = r1
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r2.close()     // Catch:{ IOException -> 0x0065 }
            r1 = r3
            goto L_0x0065
        L_0x0041:
            r6 = move-exception
            r2 = r0
            goto L_0x0034
        L_0x0044:
            r2 = r0
            goto L_0x005b
        L_0x0046:
            r6 = r0
            r2 = r6
            goto L_0x005b
        L_0x0049:
            r6 = move-exception
            r2 = r0
            goto L_0x0050
        L_0x004c:
            r6 = r0
            r7 = r6
            r2 = r7
            goto L_0x005b
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            throw r6
        L_0x005b:
            if (r7 == 0) goto L_0x0060
            r7.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            if (r1 == 0) goto L_0x006e
            cm.l.c(r6)
            java.lang.String r0 = r6.getPath()
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.f(android.content.Context, android.net.Uri):java.lang.String");
    }

    private final boolean h(Uri uri) {
        return l.a("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean i(Uri uri) {
        return l.a("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean j(Uri uri) {
        return l.a("com.google.android.apps.photos.content", uri.getAuthority());
    }

    private final boolean k(Uri uri) {
        return l.a("com.android.providers.media.documents", uri.getAuthority());
    }

    public final String g(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        String e10 = e(context, uri);
        return e10 == null ? f(context, uri) : e10;
    }
}
