package com.nic.mparivahan.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RecentSearch;
import i7.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DatabaseHelper extends SQLiteOpenHelper {

    /* renamed from: f  reason: collision with root package name */
    private static DatabaseHelper f8087f;

    /* renamed from: g  reason: collision with root package name */
    private static SQLiteDatabase f8088g;

    /* renamed from: e  reason: collision with root package name */
    private Context f8089e;

    /* renamed from: com.nic.mparivahan.DB.DatabaseHelper$10  reason: invalid class name */
    class AnonymousClass10 extends TypeToken<DldetobjX> {
    }

    /* renamed from: com.nic.mparivahan.DB.DatabaseHelper$11  reason: invalid class name */
    class AnonymousClass11 extends TypeToken<DldetobjX> {
    }

    public DatabaseHelper(Context context) {
        super(context, "M_PARIVAHAN_DB", (SQLiteDatabase.CursorFactory) null, 31);
        this.f8089e = context;
        f8087f = this;
    }

    public static DatabaseHelper A0(Context context) {
        if (f8087f == null) {
            f8087f = new DatabaseHelper(context);
            J0();
        }
        return f8087f;
    }

    private static void J0() {
        if (f8088g == null) {
            f8088g = f8087f.getWritableDatabase();
        }
    }

    public void B(String str) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("RECENT_SEARCH_TABLE", "RECENT_SEARCH_NUMBER = ?", new String[]{str});
            sQLiteDatabase.close();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th2;
        }
        sQLiteDatabase.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int B0() {
        /*
            r4 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.lang.String r2 = "select RC_ID from RC_DETAILS_TABLE"
            android.database.Cursor r0 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0015 }
            int r0 = r0.getCount()     // Catch:{ Exception -> 0x0015 }
            r1.close()
            return r0
        L_0x0013:
            r0 = move-exception
            goto L_0x002a
        L_0x0015:
            r0 = move-exception
            goto L_0x0020
        L_0x0017:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x002a
        L_0x001c:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0020:
            r0.printStackTrace()     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            r0 = 0
            return r0
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.B0():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0077=Splitter:B:33:0x0077, B:44:0x008e=Splitter:B:44:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.nic.mparivahan.RC.Model.NrvDetails C0(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r10 = r14.getReadableDatabase()     // Catch:{ CursorIndexOutOfBoundsException -> 0x008b, Exception -> 0x0074, all -> 0x006f }
            i7.d r11 = new i7.d     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            r11.<init>()     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            java.lang.String r2 = "RC_DETAILS_TABLE"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            java.lang.String r1 = "RC_ID"
            r4 = 0
            r3[r4] = r1     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            java.lang.String r1 = "RC_DETAILS"
            r12 = 1
            r3[r12] = r1     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            java.lang.String r5 = "RC_ID=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            r6[r4] = r15     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r4 = r5
            r5 = r6
            r6 = r15
            android.database.Cursor r15 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ CursorIndexOutOfBoundsException -> 0x006c, Exception -> 0x0069, all -> 0x0064 }
            if (r15 == 0) goto L_0x003c
            r15.moveToFirst()     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            goto L_0x003c
        L_0x0035:
            r0 = move-exception
            goto L_0x00a2
        L_0x0038:
            r1 = move-exception
            goto L_0x0077
        L_0x003a:
            r1 = move-exception
            goto L_0x008e
        L_0x003c:
            byte[] r1 = r15.getBlob(r12)     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            if (r1 == 0) goto L_0x0057
            java.lang.String r2 = new java.lang.String     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            r2.<init>(r1)     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            com.nic.mparivahan.DB.DatabaseHelper$1 r1 = new com.nic.mparivahan.DB.DatabaseHelper$1     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            r1.<init>()     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            java.lang.reflect.Type r1 = r1.getType()     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            java.lang.Object r1 = r11.k(r2, r1)     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            com.nic.mparivahan.RC.Model.NrvDetails r1 = (com.nic.mparivahan.RC.Model.NrvDetails) r1     // Catch:{ CursorIndexOutOfBoundsException -> 0x003a, Exception -> 0x0038 }
            r0 = r1
        L_0x0057:
            boolean r1 = r15.isClosed()
            if (r1 != 0) goto L_0x0060
            r15.close()
        L_0x0060:
            r10.close()
            return r0
        L_0x0064:
            r15 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
            goto L_0x00a2
        L_0x0069:
            r1 = move-exception
            r15 = r0
            goto L_0x0077
        L_0x006c:
            r1 = move-exception
            r15 = r0
            goto L_0x008e
        L_0x006f:
            r15 = move-exception
            r10 = r0
            r0 = r15
            r15 = r10
            goto L_0x00a2
        L_0x0074:
            r1 = move-exception
            r15 = r0
            r10 = r15
        L_0x0077:
            r1.printStackTrace()     // Catch:{ all -> 0x0035 }
            if (r15 == 0) goto L_0x0085
            boolean r1 = r15.isClosed()
            if (r1 != 0) goto L_0x0085
            r15.close()
        L_0x0085:
            if (r10 == 0) goto L_0x008a
            r10.close()
        L_0x008a:
            return r0
        L_0x008b:
            r1 = move-exception
            r15 = r0
            r10 = r15
        L_0x008e:
            r1.printStackTrace()     // Catch:{ all -> 0x0035 }
            if (r15 == 0) goto L_0x009c
            boolean r1 = r15.isClosed()
            if (r1 != 0) goto L_0x009c
            r15.close()
        L_0x009c:
            if (r10 == 0) goto L_0x00a1
            r10.close()
        L_0x00a1:
            return r0
        L_0x00a2:
            if (r15 == 0) goto L_0x00ad
            boolean r1 = r15.isClosed()
            if (r1 != 0) goto L_0x00ad
            r15.close()
        L_0x00ad:
            if (r10 == 0) goto L_0x00b2
            r10.close()
        L_0x00b2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.C0(java.lang.String):com.nic.mparivahan.RC.Model.NrvDetails");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList D0() {
        /*
            r8 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r8.getReadableDatabase()     // Catch:{ Exception -> 0x0063, all -> 0x005e }
            java.lang.String r2 = "select RC_ID, RC_DETAILS from RC_DETAILS_TABLE"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
            if (r2 == 0) goto L_0x0047
            i7.d r3 = new i7.d     // Catch:{ Exception -> 0x003e }
            r3.<init>()     // Catch:{ Exception -> 0x003e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x003e }
            r4.<init>()     // Catch:{ Exception -> 0x003e }
            boolean r5 = r2.moveToFirst()     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x0046
        L_0x001d:
            r5 = 1
            byte[] r5 = r2.getBlob(r5)     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x0040
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x003e }
            r6.<init>(r5)     // Catch:{ Exception -> 0x003e }
            com.nic.mparivahan.DB.DatabaseHelper$2 r5 = new com.nic.mparivahan.DB.DatabaseHelper$2     // Catch:{ Exception -> 0x003e }
            r5.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.reflect.Type r5 = r5.getType()     // Catch:{ Exception -> 0x003e }
            java.lang.Object r5 = r3.k(r6, r5)     // Catch:{ Exception -> 0x003e }
            com.nic.mparivahan.RC.Model.NrvDetails r5 = (com.nic.mparivahan.RC.Model.NrvDetails) r5     // Catch:{ Exception -> 0x003e }
            r4.add(r5)     // Catch:{ Exception -> 0x003e }
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            goto L_0x007a
        L_0x003e:
            r3 = move-exception
            goto L_0x0066
        L_0x0040:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x003e }
            if (r5 != 0) goto L_0x001d
        L_0x0046:
            r0 = r4
        L_0x0047:
            if (r2 == 0) goto L_0x0052
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0052
            r2.close()
        L_0x0052:
            r1.close()
            return r0
        L_0x0056:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x007a
        L_0x005b:
            r3 = move-exception
            r2 = r0
            goto L_0x0066
        L_0x005e:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x007a
        L_0x0063:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0066:
            r3.printStackTrace()     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0074
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0074
            r2.close()
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r1.close()
        L_0x0079:
            return r0
        L_0x007a:
            if (r2 == 0) goto L_0x0085
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0085
            r2.close()
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            r1.close()
        L_0x008a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.D0():java.util.ArrayList");
    }

    public void E() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DL_DETAILS_TABLE");
            sQLiteDatabase.execSQL("create table DL_DETAILS_TABLE ( ID integer primary key autoincrement, DL_ID text NOT NULL unique, DL_DETAILS blob, DL_DOC_Id text, DL_DOB text);");
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th2) {
            sQLiteDatabase.close();
            throw th2;
        }
        sQLiteDatabase.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList E0() {
        /*
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch:{ Exception -> 0x006e, all -> 0x0069 }
            java.lang.String r2 = "select RC_ID, RC_DETAILS from RC_DETAILS_TABLE"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0066, all -> 0x0061 }
            if (r2 == 0) goto L_0x0052
            i7.d r3 = new i7.d     // Catch:{ Exception -> 0x0041 }
            r3.<init>()     // Catch:{ Exception -> 0x0041 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0041 }
            r4.<init>()     // Catch:{ Exception -> 0x0041 }
            boolean r5 = r2.moveToFirst()     // Catch:{ Exception -> 0x0041 }
            if (r5 == 0) goto L_0x0051
            r5 = r0
        L_0x001e:
            r6 = 0
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0041 }
            r7 = 1
            byte[] r7 = r2.getBlob(r7)     // Catch:{ Exception -> 0x0041 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0041 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.DB.DatabaseHelper$5 r7 = new com.nic.mparivahan.DB.DatabaseHelper$5     // Catch:{ Exception -> 0x0041 }
            r7.<init>()     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Type r7 = r7.getType()     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r3.k(r5, r7)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.RC.Model.NrvDetails r5 = (com.nic.mparivahan.RC.Model.NrvDetails) r5     // Catch:{ Exception -> 0x0041 }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            goto L_0x0085
        L_0x0041:
            r3 = move-exception
            goto L_0x0071
        L_0x0043:
            com.nic.mparivahan.RC.Model.Document r7 = new com.nic.mparivahan.RC.Model.Document     // Catch:{ Exception -> 0x0041 }
            r7.<init>(r5, r6)     // Catch:{ Exception -> 0x0041 }
            r4.add(r7)     // Catch:{ Exception -> 0x0041 }
            boolean r6 = r2.moveToNext()     // Catch:{ Exception -> 0x0041 }
            if (r6 != 0) goto L_0x001e
        L_0x0051:
            r0 = r4
        L_0x0052:
            if (r2 == 0) goto L_0x005d
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x005d
            r2.close()
        L_0x005d:
            r1.close()
            return r0
        L_0x0061:
            r2 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0085
        L_0x0066:
            r3 = move-exception
            r2 = r0
            goto L_0x0071
        L_0x0069:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x0085
        L_0x006e:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0071:
            r3.printStackTrace()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x007f
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x007f
            r2.close()
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            return r0
        L_0x0085:
            if (r2 == 0) goto L_0x0090
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x0090
            r2.close()
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.close()
        L_0x0095:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.E0():java.util.ArrayList");
    }

    public ArrayList F0(String str) {
        ArrayList arrayList = null;
        try {
            f8088g = getReadableDatabase();
            Cursor rawQuery = f8088g.rawQuery("Select RECENT_SEARCH_NUMBER , RECENT_SEARCH_USER_NAME , RECENT_SEARCH_IMAGE from RECENT_SEARCH_TABLE WHERE RECENT_SEARCH_TYPE = '" + str + "' ORDER BY " + "ID" + " DESC limit 5;", (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                do {
                    RecentSearch recentSearch = new RecentSearch();
                    recentSearch.setSearchNumber(rawQuery.getString(0));
                    recentSearch.setSearchUserName(rawQuery.getString(1));
                    recentSearch.setDriverImage(rawQuery.getString(2));
                    arrayList2.add(recentSearch);
                } while (rawQuery.moveToNext());
                arrayList = arrayList2;
            }
            SQLiteDatabase sQLiteDatabase = f8088g;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            SQLiteDatabase sQLiteDatabase2 = f8088g;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            return null;
        } catch (Throwable th2) {
            SQLiteDatabase sQLiteDatabase3 = f8088g;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.nic.mparivahan.RC.Model.NrvDetails G0(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.getReadableDatabase()     // Catch:{ Exception -> 0x006f, all -> 0x006a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            r2.<init>()     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            java.lang.String r3 = "select RC_ID, RC_DETAILS from RC_DETAILS_TABLE WHERE RC_ID ='"
            r2.append(r3)     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            r2.append(r7)     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            java.lang.String r7 = "'"
            r2.append(r7)     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            android.database.Cursor r7 = r1.rawQuery(r7, r0)     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
            if (r7 == 0) goto L_0x0053
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x004b }
            r2.<init>()     // Catch:{ Exception -> 0x004b }
            boolean r3 = r7.moveToFirst()     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x0053
        L_0x002c:
            r3 = 1
            byte[] r3 = r7.getBlob(r3)     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x004d
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x004b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.DB.DatabaseHelper$4 r3 = new com.nic.mparivahan.DB.DatabaseHelper$4     // Catch:{ Exception -> 0x004b }
            r3.<init>()     // Catch:{ Exception -> 0x004b }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x004b }
            java.lang.Object r3 = r2.k(r4, r3)     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.RC.Model.NrvDetails r3 = (com.nic.mparivahan.RC.Model.NrvDetails) r3     // Catch:{ Exception -> 0x004b }
            r0 = r3
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            goto L_0x0086
        L_0x004b:
            r2 = move-exception
            goto L_0x0072
        L_0x004d:
            boolean r3 = r7.moveToNext()     // Catch:{ Exception -> 0x004b }
            if (r3 != 0) goto L_0x002c
        L_0x0053:
            if (r7 == 0) goto L_0x005e
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto L_0x005e
            r7.close()
        L_0x005e:
            r1.close()
            return r0
        L_0x0062:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0086
        L_0x0067:
            r2 = move-exception
            r7 = r0
            goto L_0x0072
        L_0x006a:
            r7 = move-exception
            r1 = r0
            r0 = r7
            r7 = r1
            goto L_0x0086
        L_0x006f:
            r2 = move-exception
            r7 = r0
            r1 = r7
        L_0x0072:
            r2.printStackTrace()     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0080
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto L_0x0080
            r7.close()
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            return r0
        L_0x0086:
            if (r7 == 0) goto L_0x0091
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto L_0x0091
            r7.close()
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.G0(java.lang.String):com.nic.mparivahan.RC.Model.NrvDetails");
    }

    public void H() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RC_DETAILS_TABLE");
            sQLiteDatabase.execSQL("create table RC_DETAILS_TABLE ( ID integer primary key autoincrement, RC_ID text NOT NULL unique, RC_DOC_Id text NOT NULL unique, RC_DETAILS blob, RC_STATUS integer DEFAULT 0);");
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th2) {
            sQLiteDatabase.close();
            throw th2;
        }
        sQLiteDatabase.close();
    }

    public int H0(Date date, Date date2) {
        try {
            long time = date.getTime();
            long time2 = date2.getTime();
            return (int) ((time > time2 ? time - time2 : time2 - time) / 86400000);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean I0(String str) {
        return str.equals((Object) null) || str.equals("null") || str.equals(" ") || str.equals("") || str.equalsIgnoreCase("NA") || str.isEmpty();
    }

    public int K0(String str, String str2, String str3) {
        SQLiteClosable sQLiteClosable = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("RECENT_SEARCH_TIME_STAMP", str2);
            contentValues.put("RECENT_SEARCH_USER_NAME", str3);
            int update = writableDatabase.update("RECENT_SEARCH_TABLE", contentValues, "RECENT_SEARCH_NUMBER=?", new String[]{String.valueOf(str)});
            writableDatabase.close();
            return update;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f A[Catch:{ Exception -> 0x0033, all -> 0x002f }, ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long L0(java.lang.String r9, com.nic.mparivahan.Dl.Model.DldetobjX r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r8.getWritableDatabase()     // Catch:{ Exception -> 0x00b4 }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r4.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            java.lang.String r6 = "DL_ID"
            java.lang.String r7 = r9.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            java.lang.String r6 = "DL_DOC_Id"
            java.lang.String r11 = r11.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r6, r11)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            if (r12 == 0) goto L_0x0037
            java.lang.String r11 = "DL_DOB"
            java.lang.String r12 = r12.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r11, r12)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r9 = move-exception
            r0 = r3
            goto L_0x00be
        L_0x0033:
            r9 = move-exception
            r0 = r3
            goto L_0x00b5
        L_0x0037:
            if (r10 == 0) goto L_0x0046
            java.lang.String r11 = "DL_DETAILS"
            java.lang.String r10 = r4.t(r10)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            byte[] r10 = r10.getBytes()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r11, r10)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
        L_0x0046:
            android.database.sqlite.SQLiteDatabase r10 = r8.getReadableDatabase()     // Catch:{ Exception -> 0x00a7, all -> 0x002f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r11.<init>()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "select * from DL_DETAILS_TABLE WHERE DL_ID ='"
            r11.append(r12)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r11.append(r9)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            android.database.Cursor r11 = r10.rawQuery(r11, r0)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "DL_DETAILS_TABLE"
            if (r11 == 0) goto L_0x009f
            int r11 = r11.getCount()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            if (r11 <= 0) goto L_0x0083
            java.lang.String r11 = "DL_ID=?"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            int r9 = r10.update(r12, r5, r11, r9)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            long r11 = (long) r9
            r10.close()
            return r11
        L_0x007d:
            r9 = move-exception
            r0 = r10
            goto L_0x00be
        L_0x0080:
            r9 = move-exception
            r0 = r10
            goto L_0x00a9
        L_0x0083:
            long r1 = r10.insert(r12, r0, r5)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r9.<init>()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r11 = "Count : "
            r9.append(r11)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r9.append(r1)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            android.util.Log.v(r12, r9)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r10.close()
            return r1
        L_0x009f:
            long r11 = r10.insert(r12, r0, r5)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r10.close()
            return r11
        L_0x00a7:
            r9 = move-exception
            r0 = r3
        L_0x00a9:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00b1
            r0.close()
        L_0x00b1:
            return r1
        L_0x00b2:
            r9 = move-exception
            goto L_0x00be
        L_0x00b4:
            r9 = move-exception
        L_0x00b5:
            r9.printStackTrace()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00bd
            r0.close()
        L_0x00bd:
            return r1
        L_0x00be:
            if (r0 == 0) goto L_0x00c3
            r0.close()
        L_0x00c3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.L0(java.lang.String, com.nic.mparivahan.Dl.Model.DldetobjX, java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0093, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r10.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e5, code lost:
        if (r0 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0092 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v1 android.database.sqlite.SQLiteDatabase) = (r3v0 android.database.sqlite.SQLiteDatabase), (r3v0 android.database.sqlite.SQLiteDatabase), (r3v0 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:3:0x000c, B:4:?, B:5:0x0039, B:25:0x00c8, B:9:0x005d, B:20:0x009a, B:21:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long M0(java.lang.String r10, com.nic.mparivahan.Dl.Model.DldetobjX r11) {
        /*
            r9 = this;
            java.lang.String r0 = "DB_DL_DETAILS-1"
            android.util.Log.v(r0, r10)
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r9.getWritableDatabase()     // Catch:{ Exception -> 0x00ed }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            r4.<init>()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            r5.<init>()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            java.lang.String r6 = "DL_ID"
            java.lang.String r7 = r10.trim()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            java.lang.String r6 = "DL_DOB"
            com.nic.mparivahan.Dl.Model.BioObjX r7 = r11.getBioObj()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            java.lang.String r7 = r7.getBioDob()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            java.lang.String r6 = "DL_DETAILS"
            java.lang.String r7 = r4.t(r11)     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            byte[] r7 = r7.getBytes()     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x00ef, all -> 0x0092 }
            android.database.sqlite.SQLiteDatabase r3 = r9.getReadableDatabase()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r6.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r7 = "select * from DL_DETAILS_TABLE WHERE DL_ID ='"
            r6.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r6.append(r10)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r7 = "'"
            r6.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.database.Cursor r6 = r3.rawQuery(r6, r0)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r7 = "Count : "
            java.lang.String r8 = "DL_DETAILS_TABLE"
            if (r6 == 0) goto L_0x00c6
            int r6 = r6.getCount()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            if (r6 <= 0) goto L_0x0098
            java.lang.String r0 = "DL_ID=?"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            int r10 = r3.update(r8, r5, r0, r10)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = (long) r10     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r10 = "update--"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r0.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r0.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r0.append(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r5 = "  "
            r0.append(r5)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r11 = r4.t(r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r0.append(r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r11 = r0.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.util.Log.v(r10, r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r3.close()
            return r1
        L_0x0092:
            r10 = move-exception
            r0 = r3
            goto L_0x00fa
        L_0x0095:
            r10 = move-exception
            r0 = r3
            goto L_0x00e2
        L_0x0098:
            java.lang.String r10 = "update else"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.append(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.util.Log.v(r10, r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = r3.insert(r8, r0, r5)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r10.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r10.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r10.append(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.util.Log.v(r8, r10)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r3.close()
            return r1
        L_0x00c6:
            java.lang.String r10 = "update insert"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.append(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.append(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.util.Log.v(r10, r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r10 = r3.insert(r8, r0, r5)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r3.close()
            return r10
        L_0x00e2:
            r10.printStackTrace()     // Catch:{ Exception -> 0x00ed }
            if (r0 == 0) goto L_0x00ea
            r0.close()
        L_0x00ea:
            return r1
        L_0x00eb:
            r10 = move-exception
            goto L_0x00fa
        L_0x00ed:
            r10 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r10 = move-exception
            r0 = r3
        L_0x00f1:
            r10.printStackTrace()     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00f9
            r0.close()
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r0 == 0) goto L_0x00ff
            r0.close()
        L_0x00ff:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.M0(java.lang.String, com.nic.mparivahan.Dl.Model.DldetobjX):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f A[Catch:{ Exception -> 0x0033, all -> 0x002f }, ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long N0(java.lang.String r8, com.nic.mparivahan.Dl.Model.DldetobjX r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00a1 }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r4.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            java.lang.String r6 = "DL_ID"
            java.lang.String r8 = r8.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r6, r8)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            java.lang.String r8 = "DL_DOC_Id"
            java.lang.String r6 = r10.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r8, r6)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            if (r11 == 0) goto L_0x0037
            java.lang.String r8 = "DL_DOB"
            java.lang.String r11 = r11.trim()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r8, r11)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r8 = move-exception
            r0 = r3
            goto L_0x00ab
        L_0x0033:
            r8 = move-exception
            r0 = r3
            goto L_0x00a2
        L_0x0037:
            if (r9 == 0) goto L_0x0046
            java.lang.String r8 = "DL_DETAILS"
            java.lang.String r9 = r4.t(r9)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x0033, all -> 0x002f }
            r5.put(r8, r9)     // Catch:{ Exception -> 0x0033, all -> 0x002f }
        L_0x0046:
            android.database.sqlite.SQLiteDatabase r8 = r7.getReadableDatabase()     // Catch:{ Exception -> 0x0094, all -> 0x002f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r11 = "select * from DL_DETAILS_TABLE WHERE DL_DOC_Id ='"
            r9.append(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.append(r10)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r11 = "'"
            r9.append(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.database.Cursor r9 = r8.rawQuery(r9, r0)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r11 = "DL_DETAILS_TABLE"
            if (r9 == 0) goto L_0x008c
            int r9 = r9.getCount()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r9 <= 0) goto L_0x0084
            java.lang.String r9 = "DL_DOC_Id=?"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r9 = r8.update(r11, r5, r9, r10)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            long r9 = (long) r9
            r8.close()
            return r9
        L_0x007d:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ab
        L_0x0081:
            r9 = move-exception
            r0 = r8
            goto L_0x0096
        L_0x0084:
            long r9 = r8.insert(r11, r0, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r8.close()
            return r9
        L_0x008c:
            long r9 = r8.insert(r11, r0, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r8.close()
            return r9
        L_0x0094:
            r9 = move-exception
            r0 = r3
        L_0x0096:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x009e
            r0.close()
        L_0x009e:
            return r1
        L_0x009f:
            r8 = move-exception
            goto L_0x00ab
        L_0x00a1:
            r8 = move-exception
        L_0x00a2:
            r8.printStackTrace()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x00aa
            r0.close()
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            r0.close()
        L_0x00b0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.N0(java.lang.String, com.nic.mparivahan.Dl.Model.DldetobjX, java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c5, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c A[Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }, ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0008] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x00a4=Splitter:B:48:0x00a4, B:53:0x00ba=Splitter:B:53:0x00ba} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long O0(java.lang.String r9, java.lang.String r10, com.nic.mparivahan.RC.Model.NrvDetails r11, int r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = -1
            android.database.sqlite.SQLiteDatabase r4 = r8.getWritableDatabase()     // Catch:{ SQLiteConstraintException -> 0x00a2, Exception -> 0x00a0 }
            i7.d r5 = new i7.d     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            r5.<init>()     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            r6.<init>()     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            java.lang.String r7 = "RC_ID"
            r6.put(r7, r9)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            java.lang.String r7 = "RC_DOC_Id"
            r6.put(r7, r10)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            if (r11 == 0) goto L_0x0038
            java.lang.String r10 = "RC_DETAILS"
            java.lang.String r11 = r5.t(r11)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            byte[] r11 = r11.getBytes()     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            r6.put(r10, r11)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            goto L_0x0038
        L_0x002c:
            r9 = move-exception
            r1 = r4
            goto L_0x00c3
        L_0x0030:
            r9 = move-exception
            r1 = r4
            goto L_0x00a4
        L_0x0034:
            r9 = move-exception
            r1 = r4
            goto L_0x00ba
        L_0x0038:
            java.lang.String r10 = "RC_STATUS"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            r6.put(r10, r11)     // Catch:{ SQLiteConstraintException -> 0x0034, Exception -> 0x0030, all -> 0x002c }
            android.database.sqlite.SQLiteDatabase r10 = r8.getReadableDatabase()     // Catch:{ Exception -> 0x0093, all -> 0x002c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r11.<init>()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "select * from RC_DETAILS_TABLE WHERE RC_ID ='"
            r11.append(r12)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r11.append(r9)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            android.database.Cursor r11 = r10.rawQuery(r11, r1)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r12 = "RC_DETAILS_TABLE"
            if (r11 == 0) goto L_0x008b
            int r11 = r11.getCount()     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            if (r11 <= 0) goto L_0x0083
            java.lang.String r11 = "RC_ID=?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r1[r0] = r9     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            int r9 = r10.update(r12, r6, r11, r1)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            long r11 = (long) r9
            r10.close()
            return r11
        L_0x007d:
            r9 = move-exception
            r1 = r10
            goto L_0x00c3
        L_0x0080:
            r9 = move-exception
            r1 = r10
            goto L_0x0095
        L_0x0083:
            long r11 = r10.insert(r12, r1, r6)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r10.close()
            return r11
        L_0x008b:
            long r11 = r10.insert(r12, r1, r6)     // Catch:{ Exception -> 0x0080, all -> 0x007d }
            r10.close()
            return r11
        L_0x0093:
            r9 = move-exception
            r1 = r4
        L_0x0095:
            r9.printStackTrace()     // Catch:{ SQLiteConstraintException -> 0x00a2, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r2
        L_0x009e:
            r9 = move-exception
            goto L_0x00c3
        L_0x00a0:
            r9 = move-exception
            goto L_0x00a4
        L_0x00a2:
            r9 = move-exception
            goto L_0x00ba
        L_0x00a4:
            android.content.Context r10 = r8.f8089e     // Catch:{ all -> 0x009e }
            java.lang.String r11 = r9.getMessage()     // Catch:{ all -> 0x009e }
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r0)     // Catch:{ all -> 0x009e }
            r10.show()     // Catch:{ all -> 0x009e }
            r9.printStackTrace()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x00b9
            r1.close()
        L_0x00b9:
            return r2
        L_0x00ba:
            r9.printStackTrace()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x00c2
            r1.close()
        L_0x00c2:
            return r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.O0(java.lang.String, java.lang.String, com.nic.mparivahan.RC.Model.NrvDetails, int):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0080=Splitter:B:14:0x0080, B:19:0x0098=Splitter:B:19:0x0098} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P0(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            java.lang.String r0 = "Count : "
            java.lang.String r1 = "RECENT_SEARCH_COUNT"
            java.lang.String r2 = " "
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r7.getWritableDatabase()     // Catch:{ SQLiteConstraintException -> 0x0097, Exception -> 0x007f }
            i7.d r5 = new i7.d     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r5.<init>()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r5.<init>()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r6 = "RECENT_SEARCH_NUMBER"
            r5.put(r6, r8)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r6 = "RECENT_SEARCH_USER_NAME"
            r5.put(r6, r9)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r6 = "RECENT_SEARCH_TYPE"
            r5.put(r6, r10)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r6 = "RECENT_SEARCH_TIME_STAMP"
            r5.put(r6, r11)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r6 = "RECENT_SEARCH_IMAGE"
            r5.put(r6, r12)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.<init>()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r0)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r8)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r2)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r9)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r2)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r10)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r2)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r11)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r2)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r6.append(r12)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r8 = r6.toString()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            android.util.Log.v(r1, r8)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r8 = "RECENT_SEARCH_TABLE"
            long r8 = r4.insert(r8, r3, r5)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r10.<init>()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r10.append(r0)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r10.append(r8)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r8 = r10.toString()     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            android.util.Log.v(r1, r8)     // Catch:{ SQLiteConstraintException -> 0x007a, Exception -> 0x0077, all -> 0x0074 }
            r4.close()
            goto L_0x009e
        L_0x0074:
            r8 = move-exception
            r3 = r4
            goto L_0x009f
        L_0x0077:
            r8 = move-exception
            r3 = r4
            goto L_0x0080
        L_0x007a:
            r8 = move-exception
            r3 = r4
            goto L_0x0098
        L_0x007d:
            r8 = move-exception
            goto L_0x009f
        L_0x007f:
            r8 = move-exception
        L_0x0080:
            android.content.Context r9 = r7.f8089e     // Catch:{ all -> 0x007d }
            java.lang.String r10 = r8.getMessage()     // Catch:{ all -> 0x007d }
            r11 = 0
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r11)     // Catch:{ all -> 0x007d }
            r9.show()     // Catch:{ all -> 0x007d }
            r8.printStackTrace()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x009e
        L_0x0093:
            r3.close()
            goto L_0x009e
        L_0x0097:
            r8 = move-exception
        L_0x0098:
            r8.printStackTrace()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x009e
            goto L_0x0093
        L_0x009e:
            return
        L_0x009f:
            if (r3 == 0) goto L_0x00a4
            r3.close()
        L_0x00a4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.P0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Q0(java.lang.String r8, com.nic.mparivahan.Dl.Model.DldetobjX r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r7.getWritableDatabase()     // Catch:{ Exception -> 0x00a2 }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r4.<init>()     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r5.<init>()     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            java.lang.String r6 = "DL_ID"
            r5.put(r6, r8)     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            if (r9 == 0) goto L_0x002e
            java.lang.String r6 = "DL_DETAILS"
            java.lang.String r9 = r4.t(r9)     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            r5.put(r6, r9)     // Catch:{ Exception -> 0x002a, all -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r8 = move-exception
            r0 = r3
            goto L_0x00ac
        L_0x002a:
            r8 = move-exception
            r0 = r3
            goto L_0x00a3
        L_0x002e:
            android.database.sqlite.SQLiteDatabase r9 = r7.getReadableDatabase()     // Catch:{ Exception -> 0x0095, all -> 0x0026 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r3.<init>()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r4 = "select * from DL_DETAILS_TABLE WHERE DL_ID ='"
            r3.append(r4)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r3.append(r8)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            android.database.Cursor r3 = r9.rawQuery(r3, r0)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r4 = "DL_DETAILS_TABLE"
            if (r3 == 0) goto L_0x008d
            int r3 = r3.getCount()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            if (r3 <= 0) goto L_0x0071
            java.lang.String r0 = "DL_ID=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r6 = 0
            r3[r6] = r8     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            int r8 = r9.update(r4, r5, r0, r3)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            long r0 = (long) r8
            r9.close()
            return r0
        L_0x006b:
            r8 = move-exception
            r0 = r9
            goto L_0x00ac
        L_0x006e:
            r8 = move-exception
            r0 = r9
            goto L_0x0097
        L_0x0071:
            long r1 = r9.insert(r4, r0, r5)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r8.<init>()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r0 = "Count : "
            r8.append(r0)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r8.append(r1)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            android.util.Log.v(r4, r8)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r9.close()
            return r1
        L_0x008d:
            long r0 = r9.insert(r4, r0, r5)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r9.close()
            return r0
        L_0x0095:
            r8 = move-exception
            r0 = r3
        L_0x0097:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00a2 }
            if (r0 == 0) goto L_0x009f
            r0.close()
        L_0x009f:
            return r1
        L_0x00a0:
            r8 = move-exception
            goto L_0x00ac
        L_0x00a2:
            r8 = move-exception
        L_0x00a3:
            r8.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x00ab
            r0.close()
        L_0x00ab:
            return r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b1
            r0.close()
        L_0x00b1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.Q0(java.lang.String, com.nic.mparivahan.Dl.Model.DldetobjX):long");
    }

    public void R() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RC_DETAILS_TABLE");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RC_SHARING_TABLE");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DL_DETAILS_TABLE");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RECENT_SEARCH_TABLE");
            sQLiteDatabase.execSQL("create table RC_DETAILS_TABLE ( ID integer primary key autoincrement, RC_ID text NOT NULL unique, RC_DOC_Id text NOT NULL unique, RC_DETAILS blob, RC_STATUS integer DEFAULT 0);");
            sQLiteDatabase.execSQL("create table RC_SHARING_TABLE ( ID integer primary key autoincrement, RC_ID text NOT NULL, RC_SHARING_DETAILS blob, IS_RC_SHARED integer DEFAULT 0, SHARED_MOBILE_NO text NOT NULL, RC_STATUS integer DEFAULT 0);");
            sQLiteDatabase.execSQL("create table DL_DETAILS_TABLE ( ID integer primary key autoincrement, DL_ID text NOT NULL unique, DL_DETAILS blob, DL_DOC_Id text, DL_DOB text);");
            sQLiteDatabase.execSQL("create table RECENT_SEARCH_TABLE ( ID integer primary key autoincrement, RECENT_SEARCH_NUMBER text NOT NULL, RECENT_SEARCH_USER_NAME text NOT NULL, RECENT_SEARCH_TYPE text, RECENT_SEARCH_IMAGE text NOT NULL, RECENT_SEARCH_TIME_STAMP text NOT NULL);");
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable th2) {
            sQLiteDatabase.close();
            throw th2;
        }
        sQLiteDatabase.close();
    }

    public int R0(String str, NrvDetails nrvDetails) {
        SQLiteClosable sQLiteClosable = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            d dVar = new d();
            ContentValues contentValues = new ContentValues();
            contentValues.put("RC_DETAILS", dVar.t(nrvDetails).getBytes());
            int update = writableDatabase.update("RC_DETAILS_TABLE", contentValues, "RC_ID=?", new String[]{String.valueOf(str)});
            writableDatabase.close();
            return update;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            throw th2;
        }
    }

    public void X(String str) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("RC_DETAILS_TABLE", "RC_ID = ?", new String[]{str});
            sQLiteDatabase.close();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th2;
        }
        sQLiteDatabase.close();
    }

    public void Y(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            sQLiteDatabase.delete("RECENT_SEARCH_TABLE", "RECENT_SEARCH_NUMBER = ? and RECENT_SEARCH_TYPE = ?", new String[]{str, str2});
            sQLiteDatabase.close();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th2;
        }
        sQLiteDatabase.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.nic.mparivahan.Dl.Model.DldetobjX Z() {
        /*
            r14 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r10 = r14.getReadableDatabase()     // Catch:{ Exception -> 0x007e, all -> 0x0079 }
            i7.d r11 = new i7.d     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            r11.<init>()     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            java.lang.String r2 = "DL_DETAILS_TABLE"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            java.lang.String r1 = "DL_ID"
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            java.lang.String r1 = "DL_DETAILS"
            r12 = 1
            r3[r12] = r1     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0076, all -> 0x0071 }
            int r2 = r1.getCount()     // Catch:{ Exception -> 0x004e }
            if (r2 <= 0) goto L_0x0064
            boolean r2 = r1.moveToLast()     // Catch:{ Exception -> 0x004e }
            if (r2 == 0) goto L_0x0057
            r2 = r0
        L_0x0031:
            byte[] r3 = r1.getBlob(r12)     // Catch:{ Exception -> 0x004e }
            if (r3 == 0) goto L_0x0050
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x004e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004e }
            com.nic.mparivahan.DB.DatabaseHelper$3 r3 = new com.nic.mparivahan.DB.DatabaseHelper$3     // Catch:{ Exception -> 0x004e }
            r3.<init>()     // Catch:{ Exception -> 0x004e }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x004e }
            java.lang.Object r2 = r11.k(r2, r3)     // Catch:{ Exception -> 0x004e }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            goto L_0x009c
        L_0x004e:
            r2 = move-exception
            goto L_0x0081
        L_0x0050:
            boolean r3 = r1.moveToNext()     // Catch:{ Exception -> 0x004e }
            if (r3 != 0) goto L_0x0031
            r0 = r2
        L_0x0057:
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x0060
            r1.close()
        L_0x0060:
            r10.close()
            return r0
        L_0x0064:
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x006d
            r1.close()
        L_0x006d:
            r10.close()
            return r0
        L_0x0071:
            r1 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x009c
        L_0x0076:
            r2 = move-exception
            r1 = r0
            goto L_0x0081
        L_0x0079:
            r1 = move-exception
            r10 = r0
            r0 = r1
            r1 = r10
            goto L_0x009c
        L_0x007e:
            r2 = move-exception
            r1 = r0
            r10 = r1
        L_0x0081:
            java.lang.String r3 = "Count-->Exception "
            java.lang.String r4 = "null"
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x004c }
            r2.printStackTrace()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0096
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x0096
            r1.close()
        L_0x0096:
            if (r10 == 0) goto L_0x009b
            r10.close()
        L_0x009b:
            return r0
        L_0x009c:
            if (r1 == 0) goto L_0x00a7
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x00a7
            r1.close()
        L_0x00a7:
            if (r10 == 0) goto L_0x00ac
            r10.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.Z():com.nic.mparivahan.Dl.Model.DldetobjX");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c0, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0008] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00b5=Splitter:B:53:0x00b5, B:48:0x009f=Splitter:B:48:0x009f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c(java.lang.String r9, com.nic.mparivahan.RC.Model.NrvDetails r10, int r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = -1
            android.database.sqlite.SQLiteDatabase r4 = r8.getWritableDatabase()     // Catch:{ SQLiteConstraintException -> 0x009d, Exception -> 0x009b }
            i7.d r5 = new i7.d     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            r5.<init>()     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            r6.<init>()     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            java.lang.String r7 = "RC_ID"
            r6.put(r7, r9)     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            if (r10 == 0) goto L_0x0033
            java.lang.String r7 = "RC_DETAILS"
            java.lang.String r10 = r5.t(r10)     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            byte[] r10 = r10.getBytes()     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            r6.put(r7, r10)     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            r9 = move-exception
            r1 = r4
            goto L_0x00be
        L_0x002b:
            r9 = move-exception
            r1 = r4
            goto L_0x009f
        L_0x002f:
            r9 = move-exception
            r1 = r4
            goto L_0x00b5
        L_0x0033:
            java.lang.String r10 = "RC_STATUS"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            r6.put(r10, r11)     // Catch:{ SQLiteConstraintException -> 0x002f, Exception -> 0x002b, all -> 0x0027 }
            android.database.sqlite.SQLiteDatabase r10 = r8.getReadableDatabase()     // Catch:{ Exception -> 0x008e, all -> 0x0027 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r11.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.lang.String r4 = "select * from RC_DETAILS_TABLE WHERE RC_ID ='"
            r11.append(r4)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r11.append(r9)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.lang.String r4 = "'"
            r11.append(r4)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            android.database.Cursor r11 = r10.rawQuery(r11, r1)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.lang.String r4 = "RC_DETAILS_TABLE"
            if (r11 == 0) goto L_0x0086
            int r11 = r11.getCount()     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            if (r11 <= 0) goto L_0x007e
            java.lang.String r11 = "RC_ID=?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r1[r0] = r9     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            int r9 = r10.update(r4, r6, r11, r1)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            long r0 = (long) r9
            r10.close()
            return r0
        L_0x0078:
            r9 = move-exception
            r1 = r10
            goto L_0x00be
        L_0x007b:
            r9 = move-exception
            r1 = r10
            goto L_0x0090
        L_0x007e:
            long r0 = r10.insert(r4, r1, r6)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r10.close()
            return r0
        L_0x0086:
            long r0 = r10.insert(r4, r1, r6)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r10.close()
            return r0
        L_0x008e:
            r9 = move-exception
            r1 = r4
        L_0x0090:
            r9.printStackTrace()     // Catch:{ SQLiteConstraintException -> 0x009d, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0098
            r1.close()
        L_0x0098:
            return r2
        L_0x0099:
            r9 = move-exception
            goto L_0x00be
        L_0x009b:
            r9 = move-exception
            goto L_0x009f
        L_0x009d:
            r9 = move-exception
            goto L_0x00b5
        L_0x009f:
            android.content.Context r10 = r8.f8089e     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = r9.getMessage()     // Catch:{ all -> 0x0099 }
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r0)     // Catch:{ all -> 0x0099 }
            r10.show()     // Catch:{ all -> 0x0099 }
            r9.printStackTrace()     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x00b4
            r1.close()
        L_0x00b4:
            return r2
        L_0x00b5:
            r9.printStackTrace()     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x00bd
            r1.close()
        L_0x00bd:
            return r2
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            r1.close()
        L_0x00c3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.c(java.lang.String, com.nic.mparivahan.RC.Model.NrvDetails, int):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList c0() {
        /*
            r15 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r11 = r15.getReadableDatabase()     // Catch:{ Exception -> 0x00a8, all -> 0x00a5 }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            r0.<init>()     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r3 = "DL_DETAILS_TABLE"
            r2 = 4
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r2 = "DL_ID"
            r12 = 0
            r4[r12] = r2     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r2 = "DL_DETAILS"
            r13 = 1
            r4[r13] = r2     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r2 = "DL_DOC_Id"
            r5 = 2
            r4[r5] = r2     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r2 = "DL_DOB"
            r14 = 3
            r4[r14] = r2     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            int r3 = r2.getCount()     // Catch:{ Exception -> 0x0066 }
            if (r3 <= 0) goto L_0x0093
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0066 }
            r3.<init>()     // Catch:{ Exception -> 0x0066 }
            boolean r4 = r2.moveToLast()     // Catch:{ Exception -> 0x0066 }
            if (r4 == 0) goto L_0x0086
            r4 = r1
        L_0x0040:
            java.lang.String r5 = r2.getString(r12)     // Catch:{ Exception -> 0x0066 }
            byte[] r6 = r2.getBlob(r13)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r2.getString(r14)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0066 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0066 }
            com.nic.mparivahan.DB.DatabaseHelper$8 r6 = new com.nic.mparivahan.DB.DatabaseHelper$8     // Catch:{ Exception -> 0x0066 }
            r6.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r4 = r0.k(r4, r6)     // Catch:{ Exception -> 0x0066 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = (com.nic.mparivahan.Dl.Model.DldetobjX) r4     // Catch:{ Exception -> 0x0066 }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r1 = r2
            goto L_0x00bf
        L_0x0066:
            r0 = move-exception
            goto L_0x00ab
        L_0x0068:
            if (r7 == 0) goto L_0x0079
            com.nic.mparivahan.Dl.Model.DLDocument r6 = new com.nic.mparivahan.Dl.Model.DLDocument     // Catch:{ Exception -> 0x0066 }
            r6.<init>(r5, r4, r7)     // Catch:{ Exception -> 0x0066 }
            r3.add(r6)     // Catch:{ Exception -> 0x0066 }
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0066 }
            if (r5 != 0) goto L_0x0040
            goto L_0x0086
        L_0x0079:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0082
            r2.close()
        L_0x0082:
            r11.close()
            return r1
        L_0x0086:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x008f
            r2.close()
        L_0x008f:
            r11.close()
            return r3
        L_0x0093:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x009c
            r2.close()
        L_0x009c:
            r11.close()
            return r1
        L_0x00a0:
            r0 = move-exception
            goto L_0x00bf
        L_0x00a2:
            r0 = move-exception
            r2 = r1
            goto L_0x00ab
        L_0x00a5:
            r0 = move-exception
            r11 = r1
            goto L_0x00bf
        L_0x00a8:
            r0 = move-exception
            r2 = r1
            r11 = r2
        L_0x00ab:
            r0.printStackTrace()     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x00b9
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x00b9
            r2.close()
        L_0x00b9:
            if (r11 == 0) goto L_0x00be
            r11.close()
        L_0x00be:
            return r1
        L_0x00bf:
            if (r1 == 0) goto L_0x00ca
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x00ca
            r1.close()
        L_0x00ca:
            if (r11 == 0) goto L_0x00cf
            r11.close()
        L_0x00cf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.c0():java.util.ArrayList");
    }

    public boolean e(NrvDetails nrvDetails) {
        try {
            return y(nrvDetails.getRc_insurance_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean f(NrvDetails nrvDetails) {
        try {
            return y(nrvDetails.getRc_tax_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean g(NrvDetails nrvDetails) {
        try {
            if (I0(nrvDetails.getRc_np_upto())) {
                return false;
            }
            return y(nrvDetails.getRc_np_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean h(NrvDetails nrvDetails) {
        try {
            if (I0(nrvDetails.getRc_permit_valid_upto())) {
                return false;
            }
            return y(nrvDetails.getRc_permit_valid_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList i0() {
        /*
            r15 = this;
            r1 = 0
            android.database.sqlite.SQLiteDatabase r11 = r15.getReadableDatabase()     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r0.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r3 = "DL_DETAILS_TABLE"
            r2 = 4
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r2 = "DL_ID"
            r12 = 0
            r4[r12] = r2     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r2 = "DL_DETAILS"
            r13 = 1
            r4[r13] = r2     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r2 = "DL_DOC_Id"
            r5 = 2
            r4[r5] = r2     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r2 = "DL_DOB"
            r14 = 3
            r4[r14] = r2     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            int r3 = r2.getCount()     // Catch:{ Exception -> 0x0066 }
            if (r3 <= 0) goto L_0x0083
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0066 }
            r3.<init>()     // Catch:{ Exception -> 0x0066 }
            boolean r4 = r2.moveToLast()     // Catch:{ Exception -> 0x0066 }
            if (r4 == 0) goto L_0x0076
            r4 = r1
        L_0x0040:
            java.lang.String r5 = r2.getString(r12)     // Catch:{ Exception -> 0x0066 }
            byte[] r6 = r2.getBlob(r13)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = r2.getString(r14)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0066 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0066 }
            com.nic.mparivahan.DB.DatabaseHelper$9 r6 = new com.nic.mparivahan.DB.DatabaseHelper$9     // Catch:{ Exception -> 0x0066 }
            r6.<init>()     // Catch:{ Exception -> 0x0066 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r4 = r0.k(r4, r6)     // Catch:{ Exception -> 0x0066 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = (com.nic.mparivahan.Dl.Model.DldetobjX) r4     // Catch:{ Exception -> 0x0066 }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r1 = r2
            goto L_0x00af
        L_0x0066:
            r0 = move-exception
            goto L_0x009b
        L_0x0068:
            com.nic.mparivahan.Dl.Model.DLDocument r6 = new com.nic.mparivahan.Dl.Model.DLDocument     // Catch:{ Exception -> 0x0066 }
            r6.<init>(r5, r4, r7)     // Catch:{ Exception -> 0x0066 }
            r3.add(r6)     // Catch:{ Exception -> 0x0066 }
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0066 }
            if (r5 != 0) goto L_0x0040
        L_0x0076:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x007f
            r2.close()
        L_0x007f:
            r11.close()
            return r3
        L_0x0083:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x008c
            r2.close()
        L_0x008c:
            r11.close()
            return r1
        L_0x0090:
            r0 = move-exception
            goto L_0x00af
        L_0x0092:
            r0 = move-exception
            r2 = r1
            goto L_0x009b
        L_0x0095:
            r0 = move-exception
            r11 = r1
            goto L_0x00af
        L_0x0098:
            r0 = move-exception
            r2 = r1
            r11 = r2
        L_0x009b:
            r0.printStackTrace()     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x00a9
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x00a9
            r2.close()
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
            r11.close()
        L_0x00ae:
            return r1
        L_0x00af:
            if (r1 == 0) goto L_0x00ba
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            if (r11 == 0) goto L_0x00bf
            r11.close()
        L_0x00bf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.i0():java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String j0(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r10 = r13.getReadableDatabase()     // Catch:{ Exception -> 0x0084, all -> 0x007f }
            java.lang.String r2 = "DL_DETAILS_TABLE"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            java.lang.String r1 = "DL_ID"
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            java.lang.String r1 = "DL_DOC_Id"
            r11 = 1
            r3[r11] = r1     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            java.lang.String r5 = "DL_ID=?"
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            r6[r4] = r14     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x007c, all -> 0x0077 }
            java.lang.String r1 = "0"
            if (r14 == 0) goto L_0x0068
            int r2 = r14.getCount()     // Catch:{ Exception -> 0x0059 }
            if (r2 <= 0) goto L_0x005b
            r14.moveToFirst()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = r14.getString(r11)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x004a
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x0046
            r14.close()
        L_0x0046:
            r10.close()
            return r0
        L_0x004a:
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L_0x0053
            r14.close()
        L_0x0053:
            r10.close()
            return r1
        L_0x0057:
            r0 = move-exception
            goto L_0x009b
        L_0x0059:
            r1 = move-exception
            goto L_0x0087
        L_0x005b:
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L_0x0064
            r14.close()
        L_0x0064:
            r10.close()
            return r1
        L_0x0068:
            if (r14 == 0) goto L_0x0073
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L_0x0073
            r14.close()
        L_0x0073:
            r10.close()
            return r1
        L_0x0077:
            r14 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L_0x009b
        L_0x007c:
            r1 = move-exception
            r14 = r0
            goto L_0x0087
        L_0x007f:
            r14 = move-exception
            r10 = r0
            r0 = r14
            r14 = r10
            goto L_0x009b
        L_0x0084:
            r1 = move-exception
            r14 = r0
            r10 = r14
        L_0x0087:
            r1.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r14 == 0) goto L_0x0095
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x0095
            r14.close()
        L_0x0095:
            if (r10 == 0) goto L_0x009a
            r10.close()
        L_0x009a:
            return r0
        L_0x009b:
            if (r14 == 0) goto L_0x00a6
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x00a6
            r14.close()
        L_0x00a6:
            if (r10 == 0) goto L_0x00ab
            r10.close()
        L_0x00ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.j0(java.lang.String):java.lang.String");
    }

    public boolean l(NrvDetails nrvDetails) {
        try {
            return y(nrvDetails.getRc_pucc_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList n() {
        /*
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            java.lang.String r2 = "select RC_ID, RC_DETAILS from RC_DETAILS_TABLE"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            if (r2 == 0) goto L_0x0083
            int r3 = r2.getCount()     // Catch:{ Exception -> 0x0059 }
            if (r3 <= 0) goto L_0x0076
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0059 }
            r3.<init>()     // Catch:{ Exception -> 0x0059 }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x0059 }
            r4.<init>()     // Catch:{ Exception -> 0x0059 }
            boolean r5 = r2.moveToFirst()     // Catch:{ Exception -> 0x0059 }
            if (r5 == 0) goto L_0x0069
        L_0x0023:
            r5 = 0
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0059 }
            r6 = 1
            byte[] r6 = r2.getBlob(r6)     // Catch:{ Exception -> 0x0059 }
            if (r6 == 0) goto L_0x0063
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0059 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0059 }
            com.nic.mparivahan.DB.DatabaseHelper$6 r6 = new com.nic.mparivahan.DB.DatabaseHelper$6     // Catch:{ Exception -> 0x0059 }
            r6.<init>()     // Catch:{ Exception -> 0x0059 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r6 = r4.k(r7, r6)     // Catch:{ Exception -> 0x0059 }
            com.nic.mparivahan.RC.Model.NrvDetails r6 = (com.nic.mparivahan.RC.Model.NrvDetails) r6     // Catch:{ Exception -> 0x0059 }
            boolean r7 = r9.e(r6)     // Catch:{ Exception -> 0x0059 }
            if (r7 != 0) goto L_0x005b
            boolean r7 = r9.f(r6)     // Catch:{ Exception -> 0x0059 }
            if (r7 != 0) goto L_0x005b
            boolean r7 = r9.l(r6)     // Catch:{ Exception -> 0x0059 }
            if (r7 == 0) goto L_0x0063
            goto L_0x005b
        L_0x0056:
            r0 = move-exception
            goto L_0x00b6
        L_0x0059:
            r3 = move-exception
            goto L_0x00a2
        L_0x005b:
            com.nic.mparivahan.RC.Model.Document r7 = new com.nic.mparivahan.RC.Model.Document     // Catch:{ Exception -> 0x0059 }
            r7.<init>(r6, r5)     // Catch:{ Exception -> 0x0059 }
            r3.add(r7)     // Catch:{ Exception -> 0x0059 }
        L_0x0063:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0059 }
            if (r5 != 0) goto L_0x0023
        L_0x0069:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x0072
            r2.close()
        L_0x0072:
            r1.close()
            return r3
        L_0x0076:
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x007f
            r2.close()
        L_0x007f:
            r1.close()
            return r0
        L_0x0083:
            if (r2 == 0) goto L_0x008e
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x008e
            r2.close()
        L_0x008e:
            r1.close()
            return r0
        L_0x0092:
            r2 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x00b6
        L_0x0097:
            r3 = move-exception
            r2 = r0
            goto L_0x00a2
        L_0x009a:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x00b6
        L_0x009f:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x00a2:
            r3.printStackTrace()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x00b0
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            if (r1 == 0) goto L_0x00b5
            r1.close()
        L_0x00b5:
            return r0
        L_0x00b6:
            if (r2 == 0) goto L_0x00c1
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x00c1
            r2.close()
        L_0x00c1:
            if (r1 == 0) goto L_0x00c6
            r1.close()
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.n():java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList o() {
        /*
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()     // Catch:{ Exception -> 0x00ab, all -> 0x00a6 }
            java.lang.String r2 = "select RC_ID, RC_DETAILS from RC_DETAILS_TABLE"
            android.database.Cursor r2 = r1.rawQuery(r2, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009e }
            if (r2 == 0) goto L_0x008f
            int r3 = r2.getCount()     // Catch:{ Exception -> 0x0065 }
            if (r3 <= 0) goto L_0x0082
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0065 }
            r3.<init>()     // Catch:{ Exception -> 0x0065 }
            i7.d r4 = new i7.d     // Catch:{ Exception -> 0x0065 }
            r4.<init>()     // Catch:{ Exception -> 0x0065 }
            boolean r5 = r2.moveToFirst()     // Catch:{ Exception -> 0x0065 }
            if (r5 == 0) goto L_0x0075
        L_0x0023:
            r5 = 0
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0065 }
            r6 = 1
            byte[] r6 = r2.getBlob(r6)     // Catch:{ Exception -> 0x0065 }
            if (r6 == 0) goto L_0x006f
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0065 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0065 }
            com.nic.mparivahan.DB.DatabaseHelper$7 r6 = new com.nic.mparivahan.DB.DatabaseHelper$7     // Catch:{ Exception -> 0x0065 }
            r6.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Type r6 = r6.getType()     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r6 = r4.k(r7, r6)     // Catch:{ Exception -> 0x0065 }
            com.nic.mparivahan.RC.Model.NrvDetails r6 = (com.nic.mparivahan.RC.Model.NrvDetails) r6     // Catch:{ Exception -> 0x0065 }
            boolean r7 = r9.e(r6)     // Catch:{ Exception -> 0x0065 }
            if (r7 != 0) goto L_0x0067
            boolean r7 = r9.f(r6)     // Catch:{ Exception -> 0x0065 }
            if (r7 != 0) goto L_0x0067
            boolean r7 = r9.l(r6)     // Catch:{ Exception -> 0x0065 }
            if (r7 != 0) goto L_0x0067
            boolean r7 = r9.g(r6)     // Catch:{ Exception -> 0x0065 }
            if (r7 != 0) goto L_0x0067
            boolean r7 = r9.h(r6)     // Catch:{ Exception -> 0x0065 }
            if (r7 == 0) goto L_0x006f
            goto L_0x0067
        L_0x0062:
            r0 = move-exception
            goto L_0x00c2
        L_0x0065:
            r3 = move-exception
            goto L_0x00ae
        L_0x0067:
            com.nic.mparivahan.RC.Model.Document r7 = new com.nic.mparivahan.RC.Model.Document     // Catch:{ Exception -> 0x0065 }
            r7.<init>(r6, r5)     // Catch:{ Exception -> 0x0065 }
            r3.add(r7)     // Catch:{ Exception -> 0x0065 }
        L_0x006f:
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x0065 }
            if (r5 != 0) goto L_0x0023
        L_0x0075:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x007e
            r2.close()
        L_0x007e:
            r1.close()
            return r3
        L_0x0082:
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x008b
            r2.close()
        L_0x008b:
            r1.close()
            return r0
        L_0x008f:
            if (r2 == 0) goto L_0x009a
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x009a
            r2.close()
        L_0x009a:
            r1.close()
            return r0
        L_0x009e:
            r2 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x00c2
        L_0x00a3:
            r3 = move-exception
            r2 = r0
            goto L_0x00ae
        L_0x00a6:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x00c2
        L_0x00ab:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x00ae:
            r3.printStackTrace()     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00bc
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x00bc
            r2.close()
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            r1.close()
        L_0x00c1:
            return r0
        L_0x00c2:
            if (r2 == 0) goto L_0x00cd
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L_0x00cd
            r2.close()
        L_0x00cd:
            if (r1 == 0) goto L_0x00d2
            r1.close()
        L_0x00d2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.o():java.util.ArrayList");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table RC_DETAILS_TABLE ( ID integer primary key autoincrement, RC_ID text NOT NULL unique, RC_DOC_Id text NOT NULL unique, RC_DETAILS blob, RC_STATUS integer DEFAULT 0);");
        sQLiteDatabase.execSQL("create table DL_DETAILS_TABLE ( ID integer primary key autoincrement, DL_ID text NOT NULL unique, DL_DETAILS blob, DL_DOC_Id text, DL_DOB text);");
        sQLiteDatabase.execSQL("create table RC_SHARING_TABLE ( ID integer primary key autoincrement, RC_ID text NOT NULL, RC_SHARING_DETAILS blob, IS_RC_SHARED integer DEFAULT 0, SHARED_MOBILE_NO text NOT NULL, RC_STATUS integer DEFAULT 0);");
        sQLiteDatabase.execSQL("create table RECENT_SEARCH_TABLE ( ID integer primary key autoincrement, RECENT_SEARCH_NUMBER text NOT NULL, RECENT_SEARCH_USER_NAME text NOT NULL, RECENT_SEARCH_TYPE text, RECENT_SEARCH_IMAGE text NOT NULL, RECENT_SEARCH_TIME_STAMP text NOT NULL);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RC_DETAILS_TABLE");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RC_SHARING_TABLE");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DL_DETAILS_TABLE");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RECENT_SEARCH_TABLE");
        onCreate(sQLiteDatabase);
    }

    public int s(String str) {
        SQLiteClosable sQLiteClosable = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            int count = readableDatabase.query("RECENT_SEARCH_TABLE", (String[]) null, "RECENT_SEARCH_NUMBER=?", new String[]{String.valueOf(str)}, (String) null, (String) null, (String) null, (String) null).getCount();
            readableDatabase.close();
            return count;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (sQLiteClosable != null) {
                sQLiteClosable.close();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String s0(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r10 = r13.getReadableDatabase()     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            java.lang.String r2 = "RC_DETAILS_TABLE"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r1 = "RC_ID"
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r1 = "RC_DOC_Id"
            r11 = 1
            r3[r11] = r1     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r5 = "RC_ID=?"
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r14 = r14.trim()     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r6[r4] = r14     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006d, all -> 0x0068 }
            java.lang.String r1 = "0"
            if (r14 == 0) goto L_0x0059
            int r2 = r14.getCount()     // Catch:{ Exception -> 0x004a }
            if (r2 <= 0) goto L_0x004c
            r14.moveToFirst()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = r14.getString(r11)     // Catch:{ Exception -> 0x004a }
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x0044
            r14.close()
        L_0x0044:
            r10.close()
            return r0
        L_0x0048:
            r0 = move-exception
            goto L_0x008c
        L_0x004a:
            r1 = move-exception
            goto L_0x0078
        L_0x004c:
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L_0x0055
            r14.close()
        L_0x0055:
            r10.close()
            return r1
        L_0x0059:
            if (r14 == 0) goto L_0x0064
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L_0x0064
            r14.close()
        L_0x0064:
            r10.close()
            return r1
        L_0x0068:
            r14 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L_0x008c
        L_0x006d:
            r1 = move-exception
            r14 = r0
            goto L_0x0078
        L_0x0070:
            r14 = move-exception
            r10 = r0
            r0 = r14
            r14 = r10
            goto L_0x008c
        L_0x0075:
            r1 = move-exception
            r14 = r0
            r10 = r14
        L_0x0078:
            r1.printStackTrace()     // Catch:{ all -> 0x0048 }
            if (r14 == 0) goto L_0x0086
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x0086
            r14.close()
        L_0x0086:
            if (r10 == 0) goto L_0x008b
            r10.close()
        L_0x008b:
            return r0
        L_0x008c:
            if (r14 == 0) goto L_0x0097
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L_0x0097
            r14.close()
        L_0x0097:
            if (r10 == 0) goto L_0x009c
            r10.close()
        L_0x009c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.s0(java.lang.String):java.lang.String");
    }

    public boolean y(String str) {
        try {
            Date date = new Date();
            Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (!parse.before(date)) {
                return parse.after(date) && H0(parse, date) < 30;
            }
            return true;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
