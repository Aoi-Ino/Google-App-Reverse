package a1;

import a1.d;
import android.database.Cursor;
import cm.l;
import d1.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import zl.b;

public abstract class e {
    private static final Map a(g gVar, String str) {
        Throwable th2;
        Cursor w02 = gVar.w0("PRAGMA table_info(`" + str + "`)");
        try {
            if (w02.getColumnCount() <= 0) {
                Map g10 = i0.g();
                b.a(w02, (Throwable) null);
                return g10;
            }
            int columnIndex = w02.getColumnIndex("name");
            int columnIndex2 = w02.getColumnIndex("type");
            int columnIndex3 = w02.getColumnIndex("notnull");
            int columnIndex4 = w02.getColumnIndex("pk");
            int columnIndex5 = w02.getColumnIndex("dflt_value");
            Map c10 = h0.c();
            while (w02.moveToNext()) {
                String string = w02.getString(columnIndex);
                String string2 = w02.getString(columnIndex2);
                boolean z10 = w02.getInt(columnIndex3) != 0;
                int i10 = w02.getInt(columnIndex4);
                String string3 = w02.getString(columnIndex5);
                l.e(string, "name");
                l.e(string2, "type");
                d.a aVar = r11;
                d.a aVar2 = new d.a(string, string2, z10, i10, string3, 2);
                c10.put(string, aVar);
            }
            Map b10 = h0.b(c10);
            b.a(w02, (Throwable) null);
            return b10;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            b.a(w02, th2);
            throw th4;
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c10 = p.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l.e(string2, "cursor.getString(toColumnIndex)");
            c10.add(new d.C0002d(i10, i11, string, string2));
        }
        return y.o0(p.a(c10));
    }

    private static final Set c(g gVar, String str) {
        Cursor w02 = gVar.w0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = w02.getColumnIndex("id");
            int columnIndex2 = w02.getColumnIndex("seq");
            int columnIndex3 = w02.getColumnIndex("table");
            int columnIndex4 = w02.getColumnIndex("on_delete");
            int columnIndex5 = w02.getColumnIndex("on_update");
            List b10 = b(w02);
            w02.moveToPosition(-1);
            Set b11 = p0.b();
            while (w02.moveToNext()) {
                if (w02.getInt(columnIndex2) == 0) {
                    int i10 = w02.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<d.C0002d> arrayList3 = new ArrayList<>();
                    for (Object next : b10) {
                        if (((d.C0002d) next).c() == i10) {
                            arrayList3.add(next);
                        }
                    }
                    for (d.C0002d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = w02.getString(columnIndex3);
                    l.e(string, "cursor.getString(tableColumnIndex)");
                    String string2 = w02.getString(columnIndex4);
                    l.e(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = w02.getString(columnIndex5);
                    l.e(string3, "cursor.getString(onUpdateColumnIndex)");
                    b11.add(new d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a10 = p0.a(b11);
            b.a(w02, (Throwable) null);
            return a10;
        } catch (Throwable th2) {
            b.a(w02, th);
            throw th2;
        }
    }

    private static final d.e d(g gVar, String str, boolean z10) {
        Cursor w02 = gVar.w0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = w02.getColumnIndex("seqno");
            int columnIndex2 = w02.getColumnIndex("cid");
            int columnIndex3 = w02.getColumnIndex("name");
            int columnIndex4 = w02.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (w02.moveToNext()) {
                        if (w02.getInt(columnIndex2) >= 0) {
                            int i10 = w02.getInt(columnIndex);
                            String string = w02.getString(columnIndex3);
                            String str2 = w02.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            Integer valueOf = Integer.valueOf(i10);
                            l.e(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i10), str2);
                        }
                    }
                    Collection values = treeMap.values();
                    l.e(values, "columnsMap.values");
                    List t02 = y.t0(values);
                    Collection values2 = treeMap2.values();
                    l.e(values2, "ordersMap.values");
                    d.e eVar = new d.e(str, z10, t02, y.t0(values2));
                    b.a(w02, (Throwable) null);
                    return eVar;
                }
            }
            b.a(w02, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            b.a(w02, th);
            throw th2;
        }
    }

    private static final Set e(g gVar, String str) {
        Cursor w02 = gVar.w0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = w02.getColumnIndex("name");
            int columnIndex2 = w02.getColumnIndex("origin");
            int columnIndex3 = w02.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set b10 = p0.b();
                    while (w02.moveToNext()) {
                        if (l.a("c", w02.getString(columnIndex2))) {
                            String string = w02.getString(columnIndex);
                            boolean z10 = true;
                            if (w02.getInt(columnIndex3) != 1) {
                                z10 = false;
                            }
                            l.e(string, "name");
                            d.e d10 = d(gVar, string, z10);
                            if (d10 == null) {
                                b.a(w02, (Throwable) null);
                                return null;
                            }
                            b10.add(d10);
                        }
                    }
                    Set a10 = p0.a(b10);
                    b.a(w02, (Throwable) null);
                    return a10;
                }
            }
            b.a(w02, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            b.a(w02, th);
            throw th2;
        }
    }

    public static final d f(g gVar, String str) {
        l.f(gVar, "database");
        l.f(str, "tableName");
        return new d(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
