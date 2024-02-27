package i3;

import a3.h;
import a3.i;
import a3.o;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import d3.a;
import d3.c;
import d3.e;
import d3.f;
import j3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class m0 implements d, j3.b, c {

    /* renamed from: j  reason: collision with root package name */
    private static final y2.c f12287j = y2.c.b("proto");

    /* renamed from: e  reason: collision with root package name */
    private final t0 f12288e;

    /* renamed from: f  reason: collision with root package name */
    private final k3.a f12289f;

    /* renamed from: g  reason: collision with root package name */
    private final k3.a f12290g;

    /* renamed from: h  reason: collision with root package name */
    private final e f12291h;

    /* renamed from: i  reason: collision with root package name */
    private final nl.a f12292i;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f12293a;

        /* renamed from: b  reason: collision with root package name */
        final String f12294b;

        private c(String str, String str2) {
            this.f12293a = str;
            this.f12294b = str2;
        }
    }

    interface d {
        Object a();
    }

    m0(k3.a aVar, k3.a aVar2, e eVar, t0 t0Var, nl.a aVar3) {
        this.f12288e = t0Var;
        this.f12289f = aVar;
        this.f12290g = aVar2;
        this.f12291h = eVar;
        this.f12292i = aVar3;
    }

    private static y2.c A1(String str) {
        return str == null ? f12287j : y2.c.b(str);
    }

    private static String B1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object C1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b I0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.a()) {
            return bVar7;
        }
        e3.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void J0(SQLiteDatabase sQLiteDatabase) {
        z1(new g0(sQLiteDatabase), new h0());
    }

    private long K0(SQLiteDatabase sQLiteDatabase, o oVar) {
        Long R0 = R0(sQLiteDatabase, oVar);
        if (R0 != null) {
            return R0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(l3.a.a(oVar.d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private d3.b N0() {
        return d3.b.b().b(e.c().b(L0()).c(e.f12272a.f()).a()).a();
    }

    private long O0() {
        return M0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long P0() {
        return M0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f Q0() {
        return (f) S0(new c0(this.f12289f.a()));
    }

    private Long R0(SQLiteDatabase sQLiteDatabase, o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.b(), String.valueOf(l3.a.a(oVar.d()))}));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) C1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new b0());
    }

    private boolean T0() {
        return O0() * P0() >= this.f12291h.f();
    }

    private List U0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a l10 = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    l10.c(cVar.f12293a, cVar.f12294b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), l10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object V0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            c((long) i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer W0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        C1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new q(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object Y0(Throwable th2) {
        throw new j3.a("Timed out while trying to acquire the lock.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase Z0(Throwable th2) {
        throw new j3.a("Timed out while trying to open db.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f c1(long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) C1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new d0(j10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long d1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean e1(o oVar, SQLiteDatabase sQLiteDatabase) {
        Long R0 = R0(sQLiteDatabase, oVar);
        return R0 == null ? Boolean.FALSE : (Boolean) C1(M0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{R0.toString()}), new x());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List f1(SQLiteDatabase sQLiteDatabase) {
        return (List) C1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new j0());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List g1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(o.a().b(cursor.getString(1)).d(l3.a.b(cursor.getInt(2))).c(w1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List h1(o oVar, SQLiteDatabase sQLiteDatabase) {
        List u12 = u1(sQLiteDatabase, oVar, this.f12291h.d());
        for (y2.e eVar : y2.e.values()) {
            if (eVar != oVar.d()) {
                int d10 = this.f12291h.d() - u12.size();
                if (d10 <= 0) {
                    break;
                }
                u12.addAll(u1(sQLiteDatabase, oVar.f(eVar), d10));
            }
        }
        return U0(u12, v1(sQLiteDatabase, u12));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ d3.a i1(Map map, a.C0129a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b I0 = I0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(d3.c.c().c(I0).b(j10).a());
        }
        x1(aVar, map);
        aVar.e(Q0());
        aVar.d(N0());
        aVar.c((String) this.f12292i.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ d3.a j1(String str, Map map, a.C0129a aVar, SQLiteDatabase sQLiteDatabase) {
        return (d3.a) C1(sQLiteDatabase.rawQuery(str, new String[0]), new z(this, map, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object k1(List list, o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a k10 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k10.h(z10 ? new h(A1(cursor.getString(4)), cursor.getBlob(5)) : new h(A1(cursor.getString(4)), y1(j10)));
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object l1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long m1(i iVar, o oVar, SQLiteDatabase sQLiteDatabase) {
        if (T0()) {
            c(1, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long K0 = K0(sQLiteDatabase, oVar);
        int e10 = this.f12291h.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(K0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] n1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            c((long) i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        C1(sQLiteDatabase.rawQuery(str2, (String[]) null), new u(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean q1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) C1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new t())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object s1(long j10, o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(l3.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(l3.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object t1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f12289f.a()).execute();
        return null;
    }

    private List u1(SQLiteDatabase sQLiteDatabase, o oVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long R0 = R0(sQLiteDatabase, oVar);
        if (R0 == null) {
            return arrayList;
        }
        C1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{R0.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new v(this, arrayList, oVar));
        return arrayList;
    }

    private Map v1(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        C1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new r(hashMap));
        return hashMap;
    }

    private static byte[] w1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void x1(a.C0129a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(d3.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] y1(long j10) {
        return (byte[]) C1(M0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), new y());
    }

    private Object z1(d dVar, b bVar) {
        long a10 = this.f12290g.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f12290g.a() >= ((long) this.f12291h.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public void F(o oVar, long j10) {
        S0(new m(j10, oVar));
    }

    /* access modifiers changed from: package-private */
    public long L0() {
        return O0() * P0();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase M0() {
        t0 t0Var = this.f12288e;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) z1(new w(t0Var), new e0());
    }

    public long O(o oVar) {
        return ((Long) C1(M0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(l3.a.a(oVar.d()))}), new f0())).longValue();
    }

    /* access modifiers changed from: package-private */
    public Object S0(b bVar) {
        SQLiteDatabase M0 = M0();
        M0.beginTransaction();
        try {
            Object apply = bVar.apply(M0);
            M0.setTransactionSuccessful();
            return apply;
        } finally {
            M0.endTransaction();
        }
    }

    public k U(o oVar, i iVar) {
        e3.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) S0(new a0(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    public Iterable V() {
        return (Iterable) S0(new l());
    }

    public void c(long j10, c.b bVar, String str) {
        S0(new l0(str, bVar, j10));
    }

    public void close() {
        this.f12288e.close();
    }

    public d3.a e() {
        return (d3.a) S0(new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), d3.a.e()));
    }

    public void f() {
        S0(new n(this));
    }

    public Object g(b.a aVar) {
        SQLiteDatabase M0 = M0();
        J0(M0);
        try {
            Object execute = aVar.execute();
            M0.setTransactionSuccessful();
            return execute;
        } finally {
            M0.endTransaction();
        }
    }

    public int k() {
        return ((Integer) S0(new i0(this, this.f12289f.a() - this.f12291h.c()))).intValue();
    }

    public void m(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            M0().compileStatement("DELETE FROM events WHERE _id in " + B1(iterable)).execute();
        }
    }

    public void o0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            S0(new p(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + B1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public Iterable p(o oVar) {
        return (Iterable) S0(new o(this, oVar));
    }

    public boolean t(o oVar) {
        return ((Boolean) S0(new k0(this, oVar))).booleanValue();
    }
}
