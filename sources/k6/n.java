package k6;

import android.util.Log;
import androidx.lifecycle.p;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import v6.c;
import v6.d;

public class n implements d, q6.a {

    /* renamed from: i  reason: collision with root package name */
    private static final y6.b f12986i = new k();

    /* renamed from: a  reason: collision with root package name */
    private final Map f12987a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12988b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f12989c;

    /* renamed from: d  reason: collision with root package name */
    private final List f12990d;

    /* renamed from: e  reason: collision with root package name */
    private Set f12991e;

    /* renamed from: f  reason: collision with root package name */
    private final u f12992f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f12993g;

    /* renamed from: h  reason: collision with root package name */
    private final i f12994h;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f12995a;

        /* renamed from: b  reason: collision with root package name */
        private final List f12996b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List f12997c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private i f12998d = i.f12979a;

        b(Executor executor) {
            this.f12995a = executor;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c cVar) {
            this.f12997c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f12996b.add(new o(componentRegistrar));
            return this;
        }

        public b d(Collection collection) {
            this.f12996b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f12995a, this.f12996b, this.f12997c, this.f12998d);
        }

        public b g(i iVar) {
            this.f12998d = iVar;
            return this;
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f12987a = new HashMap();
        this.f12988b = new HashMap();
        this.f12989c = new HashMap();
        this.f12991e = new HashSet();
        this.f12993g = new AtomicReference();
        u uVar = new u(executor);
        this.f12992f = uVar;
        this.f12994h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(uVar, u.class, d.class, c.class));
        arrayList.add(c.s(this, q6.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f12990d = o(iterable);
        l(arrayList);
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f12990d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((y6.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f12994h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f12991e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f12991e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f12987a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f12987a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                c cVar = (c) it3.next();
                this.f12987a.put(cVar, new w(new j(this, cVar)));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        s();
    }

    private void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            y6.b bVar = (y6.b) entry.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                bVar.get();
            }
        }
        this.f12992f.c();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p(c cVar) {
        return cVar.h().a(new e0(cVar, this));
    }

    private void s() {
        Boolean bool = (Boolean) this.f12993g.get();
        if (bool != null) {
            m(this.f12987a, bool.booleanValue());
        }
    }

    private void t() {
        Map map;
        d0 b10;
        Object c10;
        for (c cVar : this.f12987a.keySet()) {
            Iterator it = cVar.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (qVar.f() && !this.f12989c.containsKey(qVar.b())) {
                        map = this.f12989c;
                        b10 = qVar.b();
                        c10 = x.b(Collections.emptySet());
                    } else if (this.f12988b.containsKey(qVar.b())) {
                        continue;
                    } else if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", new Object[]{cVar, qVar.b()}));
                    } else if (!qVar.f()) {
                        map = this.f12988b;
                        b10 = qVar.b();
                        c10 = b0.c();
                    }
                    map.put(b10, c10);
                }
            }
        }
    }

    private List u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                y6.b bVar = (y6.b) this.f12987a.get(cVar);
                for (d0 d0Var : cVar.j()) {
                    if (!this.f12988b.containsKey(d0Var)) {
                        this.f12988b.put(d0Var, bVar);
                    } else {
                        arrayList.add(new l((b0) ((y6.b) this.f12988b.get(d0Var)), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List v() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f12987a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                y6.b bVar = (y6.b) entry.getValue();
                for (d0 d0Var : cVar.j()) {
                    if (!hashMap.containsKey(d0Var)) {
                        hashMap.put(d0Var, new HashSet());
                    }
                    ((Set) hashMap.get(d0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f12989c.containsKey(entry2.getKey())) {
                this.f12989c.put((d0) entry2.getKey(), x.b((Collection) entry2.getValue()));
            } else {
                x xVar = (x) this.f12989c.get(entry2.getKey());
                for (y6.b mVar : (Set) entry2.getValue()) {
                    arrayList.add(new m(xVar, mVar));
                }
            }
        }
        return arrayList;
    }

    public synchronized y6.b e(d0 d0Var) {
        c0.c(d0Var, "Null interface requested.");
        return (y6.b) this.f12988b.get(d0Var);
    }

    public synchronized y6.b f(d0 d0Var) {
        x xVar = (x) this.f12989c.get(d0Var);
        if (xVar != null) {
            return xVar;
        }
        return f12986i;
    }

    public void n(boolean z10) {
        HashMap hashMap;
        if (p.a(this.f12993g, (Object) null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f12987a);
            }
            m(hashMap, z10);
        }
    }
}
