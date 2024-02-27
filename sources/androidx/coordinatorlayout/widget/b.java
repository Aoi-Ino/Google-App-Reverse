package androidx.coordinatorlayout.widget;

import androidx.core.util.d;
import androidx.core.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f2190a = new e(10);

    /* renamed from: b  reason: collision with root package name */
    private final g f2191b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f2192c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet f2193d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f2191b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f2190a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f2190a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f2191b.containsKey(obj) || !this.f2191b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f2191b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f2191b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (!this.f2191b.containsKey(obj)) {
            this.f2191b.put(obj, (Object) null);
        }
    }

    public void c() {
        int size = this.f2191b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2191b.m(i10);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f2191b.clear();
    }

    public boolean d(Object obj) {
        return this.f2191b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f2191b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f2191b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f2191b.m(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2191b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f2192c.clear();
        this.f2193d.clear();
        int size = this.f2191b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f2191b.i(i10), this.f2192c, this.f2193d);
        }
        return this.f2192c;
    }

    public boolean j(Object obj) {
        int size = this.f2191b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f2191b.m(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
