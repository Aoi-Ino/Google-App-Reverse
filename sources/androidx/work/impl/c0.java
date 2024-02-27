package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m1.f;
import m1.m;
import m1.q;
import m1.w;
import m1.z;
import s1.c;

public class c0 extends w {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4197j = m.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final p0 f4198a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4199b;

    /* renamed from: c  reason: collision with root package name */
    private final f f4200c;

    /* renamed from: d  reason: collision with root package name */
    private final List f4201d;

    /* renamed from: e  reason: collision with root package name */
    private final List f4202e;

    /* renamed from: f  reason: collision with root package name */
    private final List f4203f;

    /* renamed from: g  reason: collision with root package name */
    private final List f4204g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4205h;

    /* renamed from: i  reason: collision with root package name */
    private q f4206i;

    public c0(p0 p0Var, String str, f fVar, List list, List list2) {
        this.f4198a = p0Var;
        this.f4199b = str;
        this.f4200c = fVar;
        this.f4201d = list;
        this.f4204g = list2;
        this.f4202e = new ArrayList(list.size());
        this.f4203f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f4203f.addAll(((c0) it.next()).f4203f);
            }
        }
        int i10 = 0;
        while (i10 < list.size()) {
            if (fVar != f.REPLACE || ((z) list.get(i10)).d().e() == Long.MAX_VALUE) {
                String b10 = ((z) list.get(i10)).b();
                this.f4202e.add(b10);
                this.f4203f.add(b10);
                i10++;
            } else {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
        }
    }

    private static boolean i(c0 c0Var, Set set) {
        set.addAll(c0Var.c());
        Set l10 = l(c0Var);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l10.contains((String) it.next())) {
                return true;
            }
        }
        List<c0> e10 = c0Var.e();
        if (e10 != null && !e10.isEmpty()) {
            for (c0 i10 : e10) {
                if (i(i10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(c0Var.c());
        return false;
    }

    public static Set l(c0 c0Var) {
        HashSet hashSet = new HashSet();
        List<c0> e10 = c0Var.e();
        if (e10 != null && !e10.isEmpty()) {
            for (c0 c10 : e10) {
                hashSet.addAll(c10.c());
            }
        }
        return hashSet;
    }

    public q a() {
        if (!this.f4205h) {
            c cVar = new c(this);
            this.f4198a.o().c(cVar);
            this.f4206i = cVar.d();
        } else {
            m e10 = m.e();
            String str = f4197j;
            e10.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f4202e) + ")");
        }
        return this.f4206i;
    }

    public f b() {
        return this.f4200c;
    }

    public List c() {
        return this.f4202e;
    }

    public String d() {
        return this.f4199b;
    }

    public List e() {
        return this.f4204g;
    }

    public List f() {
        return this.f4201d;
    }

    public p0 g() {
        return this.f4198a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f4205h;
    }

    public void k() {
        this.f4205h = true;
    }

    public c0(p0 p0Var, List list) {
        this(p0Var, (String) null, f.KEEP, list, (List) null);
    }
}
