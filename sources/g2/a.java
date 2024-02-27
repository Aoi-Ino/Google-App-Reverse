package g2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f11596a;

    public a(Context context) {
        this.f11596a = new b(context).getWritableDatabase();
    }

    public void a(d dVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(dVar.e()));
            contentValues.put("url", dVar.h());
            contentValues.put("etag", dVar.c());
            contentValues.put("dir_path", dVar.a());
            contentValues.put("file_name", dVar.d());
            contentValues.put("total_bytes", Long.valueOf(dVar.g()));
            contentValues.put("downloaded_bytes", Long.valueOf(dVar.b()));
            contentValues.put("last_modified_at", Long.valueOf(dVar.f()));
            this.f11596a.insert("prdownloader", (String) null, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(int i10, long j10, long j11) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloaded_bytes", Long.valueOf(j10));
            contentValues.put("last_modified_at", Long.valueOf(j11));
            this.f11596a.update("prdownloader", contentValues, "id = ? ", new String[]{String.valueOf(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: g2.d} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0085, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0086, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0085 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g2.d c(int r6) {
        /*
            r5 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.f11596a     // Catch:{ Exception -> 0x0096 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
            r2.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = "SELECT * FROM prdownloader WHERE id = "
            r2.append(r3)     // Catch:{ Exception -> 0x0096 }
            r2.append(r6)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0096 }
            android.database.Cursor r1 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0096 }
            if (r1 == 0) goto L_0x008e
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x008b, all -> 0x0085 }
            if (r2 == 0) goto L_0x008e
            g2.d r2 = new g2.d     // Catch:{ Exception -> 0x008b, all -> 0x0085 }
            r2.<init>()     // Catch:{ Exception -> 0x008b, all -> 0x0085 }
            r2.m(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "url"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.p(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "etag"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.k(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "dir_path"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.i(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "file_name"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.l(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "total_bytes"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = r1.getLong(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.o(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "downloaded_bytes"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = r1.getLong(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.j(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = "last_modified_at"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = r1.getLong(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.n(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r0 = r2
            goto L_0x008e
        L_0x0085:
            r6 = move-exception
            r0 = r1
            goto L_0x00a2
        L_0x0088:
            r6 = move-exception
        L_0x0089:
            r0 = r1
            goto L_0x0098
        L_0x008b:
            r6 = move-exception
            r2 = r0
            goto L_0x0089
        L_0x008e:
            if (r1 == 0) goto L_0x00a1
            r1.close()
            goto L_0x00a1
        L_0x0094:
            r6 = move-exception
            goto L_0x00a2
        L_0x0096:
            r6 = move-exception
            r2 = r0
        L_0x0098:
            r6.printStackTrace()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x00a0
            r0.close()
        L_0x00a0:
            r0 = r2
        L_0x00a1:
            return r0
        L_0x00a2:
            if (r0 == 0) goto L_0x00a7
            r0.close()
        L_0x00a7:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a.c(int):g2.d");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ad, code lost:
        if (r7 == 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00af, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b6, code lost:
        if (r7 == 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b9, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List d(int r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 86400(0x15180, float:1.21072E-40)
            int r7 = r7 * r1
            long r1 = (long) r7
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7 = 0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ab }
            long r3 = r3 - r1
            android.database.sqlite.SQLiteDatabase r1 = r6.f11596a     // Catch:{ Exception -> 0x00ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r2.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r5 = "SELECT * FROM prdownloader WHERE last_modified_at <= "
            r2.append(r5)     // Catch:{ Exception -> 0x00ab }
            r2.append(r3)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ab }
            android.database.Cursor r7 = r1.rawQuery(r2, r7)     // Catch:{ Exception -> 0x00ab }
            if (r7 == 0) goto L_0x00ad
            boolean r1 = r7.moveToFirst()     // Catch:{ Exception -> 0x00ab }
            if (r1 == 0) goto L_0x00ad
        L_0x0032:
            g2.d r1 = new g2.d     // Catch:{ Exception -> 0x00ab }
            r1.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "id"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            int r2 = r7.getInt(r2)     // Catch:{ Exception -> 0x00ab }
            r1.m(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "url"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x00ab }
            r1.p(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "etag"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x00ab }
            r1.k(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "dir_path"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x00ab }
            r1.i(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "file_name"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x00ab }
            r1.l(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "total_bytes"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            long r2 = r7.getLong(r2)     // Catch:{ Exception -> 0x00ab }
            r1.o(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "downloaded_bytes"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            long r2 = r7.getLong(r2)     // Catch:{ Exception -> 0x00ab }
            r1.j(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = "last_modified_at"
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ab }
            long r2 = r7.getLong(r2)     // Catch:{ Exception -> 0x00ab }
            r1.n(r2)     // Catch:{ Exception -> 0x00ab }
            r0.add(r1)     // Catch:{ Exception -> 0x00ab }
            boolean r1 = r7.moveToNext()     // Catch:{ Exception -> 0x00ab }
            if (r1 != 0) goto L_0x0032
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ba
        L_0x00ab:
            r1 = move-exception
            goto L_0x00b3
        L_0x00ad:
            if (r7 == 0) goto L_0x00b9
        L_0x00af:
            r7.close()
            goto L_0x00b9
        L_0x00b3:
            r1.printStackTrace()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00b9
            goto L_0x00af
        L_0x00b9:
            return r0
        L_0x00ba:
            if (r7 == 0) goto L_0x00bf
            r7.close()
        L_0x00bf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a.d(int):java.util.List");
    }

    public void remove(int i10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f11596a;
            sQLiteDatabase.execSQL("DELETE FROM prdownloader WHERE id = " + i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
