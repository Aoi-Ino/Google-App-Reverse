package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class w {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f3201a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f3202b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f3203c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private t f3204d;

    w() {
    }

    /* access modifiers changed from: package-private */
    public void A(t tVar) {
        this.f3204d = tVar;
    }

    /* access modifiers changed from: package-private */
    public Bundle B(String str, Bundle bundle) {
        return (Bundle) (bundle != null ? this.f3203c.put(str, bundle) : this.f3203c.remove(str));
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        if (!this.f3201a.contains(iVar)) {
            synchronized (this.f3201a) {
                this.f3201a.add(iVar);
            }
            iVar.f3058p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + iVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3202b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f3202b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        for (v vVar : this.f3202b.values()) {
            if (vVar != null) {
                vVar.s(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3202b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (v vVar : this.f3202b.values()) {
                printWriter.print(str);
                if (vVar != null) {
                    i k10 = vVar.k();
                    printWriter.println(k10);
                    k10.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3201a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((i) this.f3201a.get(i10)).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public i f(String str) {
        v vVar = (v) this.f3202b.get(str);
        if (vVar != null) {
            return vVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public i g(int i10) {
        for (int size = this.f3201a.size() - 1; size >= 0; size--) {
            i iVar = (i) this.f3201a.get(size);
            if (iVar != null && iVar.B == i10) {
                return iVar;
            }
        }
        for (v vVar : this.f3202b.values()) {
            if (vVar != null) {
                i k10 = vVar.k();
                if (k10.B == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public i h(String str) {
        if (str != null) {
            for (int size = this.f3201a.size() - 1; size >= 0; size--) {
                i iVar = (i) this.f3201a.get(size);
                if (iVar != null && str.equals(iVar.D)) {
                    return iVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (v vVar : this.f3202b.values()) {
            if (vVar != null) {
                i k10 = vVar.k();
                if (str.equals(k10.D)) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public i i(String str) {
        i p10;
        for (v vVar : this.f3202b.values()) {
            if (vVar != null && (p10 = vVar.k().p(str)) != null) {
                return p10;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(i iVar) {
        View view;
        View view2;
        ViewGroup viewGroup = iVar.L;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3201a.indexOf(iVar);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            i iVar2 = (i) this.f3201a.get(i10);
            if (iVar2.L == viewGroup && (view2 = iVar2.M) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3201a.size()) {
                return -1;
            }
            i iVar3 = (i) this.f3201a.get(indexOf);
            if (iVar3.L == viewGroup && (view = iVar3.M) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List k() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.f3202b.values()) {
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List l() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.f3202b.values()) {
            arrayList.add(vVar != null ? vVar.k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public HashMap m() {
        return this.f3203c;
    }

    /* access modifiers changed from: package-private */
    public v n(String str) {
        return (v) this.f3202b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List o() {
        ArrayList arrayList;
        if (this.f3201a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3201a) {
            arrayList = new ArrayList(this.f3201a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public t p() {
        return this.f3204d;
    }

    /* access modifiers changed from: package-private */
    public Bundle q(String str) {
        return (Bundle) this.f3203c.get(str);
    }

    /* access modifiers changed from: package-private */
    public void r(v vVar) {
        i k10 = vVar.k();
        if (!c(k10.f3052j)) {
            this.f3202b.put(k10.f3052j, vVar);
            if (k10.H) {
                if (k10.G) {
                    this.f3204d.g(k10);
                } else {
                    this.f3204d.q(k10);
                }
                k10.H = false;
            }
            if (q.J0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(v vVar) {
        i k10 = vVar.k();
        if (k10.G) {
            this.f3204d.q(k10);
        }
        if (this.f3202b.get(k10.f3052j) == vVar && ((v) this.f3202b.put(k10.f3052j, (Object) null)) != null && q.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        Iterator it = this.f3201a.iterator();
        while (it.hasNext()) {
            v vVar = (v) this.f3202b.get(((i) it.next()).f3052j);
            if (vVar != null) {
                vVar.m();
            }
        }
        for (v vVar2 : this.f3202b.values()) {
            if (vVar2 != null) {
                vVar2.m();
                i k10 = vVar2.k();
                if (k10.f3059q && !k10.p0()) {
                    if (k10.f3060r && !this.f3203c.containsKey(k10.f3052j)) {
                        B(k10.f3052j, vVar2.q());
                    }
                    s(vVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(i iVar) {
        synchronized (this.f3201a) {
            this.f3201a.remove(iVar);
        }
        iVar.f3058p = false;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f3202b.clear();
    }

    /* access modifiers changed from: package-private */
    public void w(List list) {
        this.f3201a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                i f10 = f(str);
                if (f10 != null) {
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(HashMap hashMap) {
        this.f3203c.clear();
        this.f3203c.putAll(hashMap);
    }

    /* access modifiers changed from: package-private */
    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f3202b.size());
        for (v vVar : this.f3202b.values()) {
            if (vVar != null) {
                i k10 = vVar.k();
                B(k10.f3052j, vVar.q());
                arrayList.add(k10.f3052j);
                if (q.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.f3047f);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList z() {
        synchronized (this.f3201a) {
            try {
                if (this.f3201a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f3201a.size());
                Iterator it = this.f3201a.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    arrayList.add(iVar.f3052j);
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + iVar.f3052j + "): " + iVar);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
