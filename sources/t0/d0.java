package t0;

import android.os.Bundle;
import cm.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import om.f;
import om.m;
import om.t;
import om.v;
import pl.x;

public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f16256a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    private final m f16257b;

    /* renamed from: c  reason: collision with root package name */
    private final m f16258c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16259d;

    /* renamed from: e  reason: collision with root package name */
    private final t f16260e;

    /* renamed from: f  reason: collision with root package name */
    private final t f16261f;

    public d0() {
        m a10 = v.a(q.i());
        this.f16257b = a10;
        m a11 = v.a(q0.d());
        this.f16258c = a11;
        this.f16260e = f.b(a10);
        this.f16261f = f.b(a11);
    }

    public abstract h a(p pVar, Bundle bundle);

    public final t b() {
        return this.f16260e;
    }

    public final t c() {
        return this.f16261f;
    }

    public final boolean d() {
        return this.f16259d;
    }

    public void e(h hVar) {
        l.f(hVar, "entry");
        m mVar = this.f16258c;
        mVar.setValue(r0.h((Set) mVar.getValue(), hVar));
    }

    public void f(h hVar) {
        int i10;
        l.f(hVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f16256a;
        reentrantLock.lock();
        try {
            List v02 = y.v0((Collection) this.f16260e.getValue());
            ListIterator listIterator = v02.listIterator(v02.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (l.a(((h) listIterator.previous()).f(), hVar.f())) {
                        i10 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            v02.set(i10, hVar);
            this.f16257b.setValue(v02);
            x xVar = x.f30437a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void g(h hVar) {
        l.f(hVar, "backStackEntry");
        List list = (List) this.f16260e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            h hVar2 = (h) listIterator.previous();
            if (l.a(hVar2.f(), hVar.f())) {
                m mVar = this.f16258c;
                mVar.setValue(r0.i(r0.i((Set) mVar.getValue(), hVar2), hVar));
                f(hVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(h hVar, boolean z10) {
        l.f(hVar, "popUpTo");
        ReentrantLock reentrantLock = this.f16256a;
        reentrantLock.lock();
        try {
            m mVar = this.f16257b;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) mVar.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!l.a((h) next, hVar))) {
                    break;
                }
                arrayList.add(next);
            }
            mVar.setValue(arrayList);
            x xVar = x.f30437a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void i(h hVar, boolean z10) {
        Object obj;
        l.f(hVar, "popUpTo");
        Iterable iterable = (Iterable) this.f16258c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h) it.next()) == hVar) {
                    Iterable<h> iterable2 = (Iterable) this.f16260e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (h hVar2 : iterable2) {
                            if (hVar2 == hVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        m mVar = this.f16258c;
        mVar.setValue(r0.i((Set) mVar.getValue(), hVar));
        List list = (List) this.f16260e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            h hVar3 = (h) obj;
            if (!l.a(hVar3, hVar) && ((List) this.f16260e.getValue()).lastIndexOf(hVar3) < ((List) this.f16260e.getValue()).lastIndexOf(hVar)) {
                break;
            }
        }
        h hVar4 = (h) obj;
        if (hVar4 != null) {
            m mVar2 = this.f16258c;
            mVar2.setValue(r0.i((Set) mVar2.getValue(), hVar4));
        }
        h(hVar, z10);
    }

    public void j(h hVar) {
        l.f(hVar, "entry");
        m mVar = this.f16258c;
        mVar.setValue(r0.i((Set) mVar.getValue(), hVar));
    }

    public void k(h hVar) {
        l.f(hVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f16256a;
        reentrantLock.lock();
        try {
            m mVar = this.f16257b;
            mVar.setValue(y.j0((Collection) mVar.getValue(), hVar));
            x xVar = x.f30437a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(h hVar) {
        l.f(hVar, "backStackEntry");
        Iterable iterable = (Iterable) this.f16258c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h) it.next()) == hVar) {
                    Iterable<h> iterable2 = (Iterable) this.f16260e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (h hVar2 : iterable2) {
                            if (hVar2 == hVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        h hVar3 = (h) y.f0((List) this.f16260e.getValue());
        if (hVar3 != null) {
            m mVar = this.f16258c;
            mVar.setValue(r0.i((Set) mVar.getValue(), hVar3));
        }
        m mVar2 = this.f16258c;
        mVar2.setValue(r0.i((Set) mVar2.getValue(), hVar));
        k(hVar);
    }

    public final void m(boolean z10) {
        this.f16259d = z10;
    }
}
