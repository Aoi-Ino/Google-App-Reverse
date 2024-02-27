package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9627a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Map f9628b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f9629c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    ArrayList f9630d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final transient Map f9631e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    final Map f9632f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Bundle f9633g = new Bundle();

    class a implements o {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f9634e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9635f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e.a f9636g;

        a(String str, b bVar, e.a aVar) {
            this.f9634e = str;
            this.f9635f = bVar;
            this.f9636g = aVar;
        }

        public void d(s sVar, k.a aVar) {
            if (k.a.ON_START.equals(aVar)) {
                d.this.f9631e.put(this.f9634e, new C0123d(this.f9635f, this.f9636g));
                if (d.this.f9632f.containsKey(this.f9634e)) {
                    Object obj = d.this.f9632f.get(this.f9634e);
                    d.this.f9632f.remove(this.f9634e);
                    this.f9635f.a(obj);
                }
                a aVar2 = (a) d.this.f9633g.getParcelable(this.f9634e);
                if (aVar2 != null) {
                    d.this.f9633g.remove(this.f9634e);
                    this.f9635f.a(this.f9636g.c(aVar2.d(), aVar2.c()));
                }
            } else if (k.a.ON_STOP.equals(aVar)) {
                d.this.f9631e.remove(this.f9634e);
            } else if (k.a.ON_DESTROY.equals(aVar)) {
                d.this.l(this.f9634e);
            }
        }
    }

    class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f9639b;

        b(String str, e.a aVar) {
            this.f9638a = str;
            this.f9639b = aVar;
        }

        public void b(Object obj, androidx.core.app.c cVar) {
            Integer num = (Integer) d.this.f9628b.get(this.f9638a);
            if (num != null) {
                d.this.f9630d.add(this.f9638a);
                try {
                    d.this.f(num.intValue(), this.f9639b, obj, cVar);
                } catch (Exception e10) {
                    d.this.f9630d.remove(this.f9638a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f9639b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            d.this.l(this.f9638a);
        }
    }

    class c extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f9642b;

        c(String str, e.a aVar) {
            this.f9641a = str;
            this.f9642b = aVar;
        }

        public void b(Object obj, androidx.core.app.c cVar) {
            Integer num = (Integer) d.this.f9628b.get(this.f9641a);
            if (num != null) {
                d.this.f9630d.add(this.f9641a);
                try {
                    d.this.f(num.intValue(), this.f9642b, obj, cVar);
                } catch (Exception e10) {
                    d.this.f9630d.remove(this.f9641a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f9642b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            d.this.l(this.f9641a);
        }
    }

    /* renamed from: d.d$d  reason: collision with other inner class name */
    private static class C0123d {

        /* renamed from: a  reason: collision with root package name */
        final b f9644a;

        /* renamed from: b  reason: collision with root package name */
        final e.a f9645b;

        C0123d(b bVar, e.a aVar) {
            this.f9644a = bVar;
            this.f9645b = aVar;
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        final k f9646a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList f9647b = new ArrayList();

        e(k kVar) {
            this.f9646a = kVar;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar) {
            this.f9646a.a(oVar);
            this.f9647b.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator it = this.f9647b.iterator();
            while (it.hasNext()) {
                this.f9646a.d((o) it.next());
            }
            this.f9647b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f9627a.put(Integer.valueOf(i10), str);
        this.f9628b.put(str, Integer.valueOf(i10));
    }

    private void d(String str, int i10, Intent intent, C0123d dVar) {
        if (dVar == null || dVar.f9644a == null || !this.f9630d.contains(str)) {
            this.f9632f.remove(str);
            this.f9633g.putParcelable(str, new a(i10, intent));
            return;
        }
        dVar.f9644a.a(dVar.f9645b.c(i10, intent));
        this.f9630d.remove(str);
    }

    private int e() {
        int d10 = fm.c.f23593e.d(2147418112);
        while (true) {
            int i10 = d10 + 65536;
            if (!this.f9627a.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            d10 = fm.c.f23593e.d(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f9628b.get(str)) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = (String) this.f9627a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, (C0123d) this.f9631e.get(str));
        return true;
    }

    public final boolean c(int i10, Object obj) {
        b bVar;
        String str = (String) this.f9627a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        C0123d dVar = (C0123d) this.f9631e.get(str);
        if (dVar == null || (bVar = dVar.f9644a) == null) {
            this.f9633g.remove(str);
            this.f9632f.put(str, obj);
            return true;
        } else if (!this.f9630d.remove(str)) {
            return true;
        } else {
            bVar.a(obj);
            return true;
        }
    }

    public abstract void f(int i10, e.a aVar, Object obj, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f9630d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f9633g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f9628b.containsKey(str)) {
                        Integer num = (Integer) this.f9628b.remove(str);
                        if (!this.f9633g.containsKey(str)) {
                            this.f9627a.remove(num);
                        }
                    }
                    a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f9628b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f9628b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f9630d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f9633g.clone());
    }

    public final c i(String str, s sVar, e.a aVar, b bVar) {
        k d02 = sVar.d0();
        if (!d02.b().b(k.b.STARTED)) {
            k(str);
            e eVar = (e) this.f9629c.get(str);
            if (eVar == null) {
                eVar = new e(d02);
            }
            eVar.a(new a(str, bVar, aVar));
            this.f9629c.put(str, eVar);
            return new b(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + sVar + " is attempting to register while current state is " + d02.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final c j(String str, e.a aVar, b bVar) {
        k(str);
        this.f9631e.put(str, new C0123d(bVar, aVar));
        if (this.f9632f.containsKey(str)) {
            Object obj = this.f9632f.get(str);
            this.f9632f.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f9633g.getParcelable(str);
        if (aVar2 != null) {
            this.f9633g.remove(str);
            bVar.a(aVar.c(aVar2.d(), aVar2.c()));
        }
        return new c(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer num;
        if (!this.f9630d.contains(str) && (num = (Integer) this.f9628b.remove(str)) != null) {
            this.f9627a.remove(num);
        }
        this.f9631e.remove(str);
        if (this.f9632f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f9632f.get(str));
            this.f9632f.remove(str);
        }
        if (this.f9633g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f9633g.getParcelable(str));
            this.f9633g.remove(str);
        }
        e eVar = (e) this.f9629c.get(str);
        if (eVar != null) {
            eVar.b();
            this.f9629c.remove(str);
        }
    }
}
