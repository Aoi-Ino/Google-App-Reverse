package oo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import oo.g;
import oo.i;
import oo.j;
import qn.u;

public final class a implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private transient k f30210e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30211f;

    /* renamed from: g  reason: collision with root package name */
    private final List f30212g;

    /* renamed from: h  reason: collision with root package name */
    private int f30213h;

    /* renamed from: i  reason: collision with root package name */
    private u f30214i;

    /* renamed from: j  reason: collision with root package name */
    private List f30215j;

    /* renamed from: k  reason: collision with root package name */
    private Map f30216k;

    /* renamed from: l  reason: collision with root package name */
    private Stack f30217l;

    /* renamed from: m  reason: collision with root package name */
    private Map f30218m;

    /* renamed from: n  reason: collision with root package name */
    private int f30219n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30220o;

    /* renamed from: p  reason: collision with root package name */
    private transient int f30221p;

    a(a aVar) {
        this.f30210e = new k(aVar.f30210e.d());
        this.f30211f = aVar.f30211f;
        this.f30213h = aVar.f30213h;
        this.f30214i = aVar.f30214i;
        ArrayList arrayList = new ArrayList();
        this.f30215j = arrayList;
        arrayList.addAll(aVar.f30215j);
        this.f30216k = new TreeMap();
        for (Integer num : aVar.f30216k.keySet()) {
            this.f30216k.put(num, (LinkedList) ((LinkedList) aVar.f30216k.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f30217l = stack;
        stack.addAll(aVar.f30217l);
        this.f30212g = new ArrayList();
        for (c a10 : aVar.f30212g) {
            this.f30212g.add(a10.clone());
        }
        this.f30218m = new TreeMap(aVar.f30218m);
        this.f30219n = aVar.f30219n;
        this.f30221p = aVar.f30221p;
        this.f30220o = aVar.f30220o;
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f30212g) {
            if (!cVar2.f() && cVar2.g()) {
                if (cVar == null || cVar2.b() < cVar.b() || (cVar2.b() == cVar.b() && cVar2.c() < cVar.c())) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
            g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
            for (int i10 = 0; i10 < (1 << this.f30211f); i10++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i10).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                k kVar = this.f30210e;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                n e10 = this.f30210e.e(jVar);
                iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i10).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
                u a10 = v.a(this.f30210e, e10, iVar);
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i10).f(gVar.a())).k();
                while (!this.f30217l.isEmpty() && ((u) this.f30217l.peek()).a() == a10.a()) {
                    int a11 = i10 / (1 << a10.a());
                    if (a11 == 1) {
                        this.f30215j.add(a10);
                    }
                    if (a11 == 3 && a10.a() < this.f30211f - this.f30213h) {
                        ((c) this.f30212g.get(a10.a())).h(a10);
                    }
                    if (a11 >= 3 && (a11 & 1) == 1 && a10.a() >= this.f30211f - this.f30213h && a10.a() <= this.f30211f - 2) {
                        if (this.f30216k.get(Integer.valueOf(a10.a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a10);
                            this.f30216k.put(Integer.valueOf(a10.a()), linkedList);
                        } else {
                            ((LinkedList) this.f30216k.get(Integer.valueOf(a10.a()))).add(a10);
                        }
                    }
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b10 = v.b(this.f30210e, (u) this.f30217l.pop(), a10, gVar2);
                    u uVar = new u(b10.a() + 1, b10.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a10 = uVar;
                }
                this.f30217l.push(a10);
            }
            this.f30214i = (u) this.f30217l.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object removeFirst;
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (!this.f30220o) {
            int i10 = this.f30219n;
            if (i10 <= this.f30221p - 1) {
                int b10 = a0.b(i10, this.f30211f);
                if (((this.f30219n >> (b10 + 1)) & 1) == 0 && b10 < this.f30211f - 1) {
                    this.f30218m.put(Integer.valueOf(b10), this.f30215j.get(b10));
                }
                i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
                g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
                if (b10 == 0) {
                    jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f30219n).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                    k kVar = this.f30210e;
                    kVar.h(kVar.g(bArr2, jVar), bArr);
                    this.f30215j.set(0, v.a(this.f30210e, this.f30210e.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f30219n).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
                } else {
                    int i11 = b10 - 1;
                    k kVar2 = this.f30210e;
                    kVar2.h(kVar2.g(bArr2, jVar), bArr);
                    u b11 = v.b(this.f30210e, (u) this.f30215j.get(i11), (u) this.f30218m.get(Integer.valueOf(i11)), (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i11).n(this.f30219n >> b10).f(gVar.a())).k());
                    this.f30215j.set(b10, new u(b11.a() + 1, b11.b()));
                    this.f30218m.remove(Integer.valueOf(i11));
                    for (int i12 = 0; i12 < b10; i12++) {
                        if (i12 < this.f30211f - this.f30213h) {
                            list = this.f30215j;
                            removeFirst = ((c) this.f30212g.get(i12)).d();
                        } else {
                            list = this.f30215j;
                            removeFirst = ((LinkedList) this.f30216k.get(Integer.valueOf(i12))).removeFirst();
                        }
                        list.set(i12, removeFirst);
                    }
                    int min = Math.min(b10, this.f30211f - this.f30213h);
                    for (int i13 = 0; i13 < min; i13++) {
                        int i14 = this.f30219n + 1 + ((1 << i13) * 3);
                        if (i14 < (1 << this.f30211f)) {
                            ((c) this.f30212g.get(i13)).e(i14);
                        }
                    }
                }
                for (int i15 = 0; i15 < ((this.f30211f - this.f30213h) >> 1); i15++) {
                    c a10 = a();
                    if (a10 != null) {
                        a10.i(this.f30217l, this.f30210e, bArr, bArr2, jVar);
                    }
                }
                this.f30219n++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        } else {
            throw new IllegalStateException("index already used");
        }
    }

    private void g() {
        if (this.f30215j == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.f30216k == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.f30217l == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.f30212g == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (this.f30218m == null) {
            throw new IllegalStateException("keep == null");
        } else if (!a0.l(this.f30211f, (long) this.f30219n)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    /* access modifiers changed from: protected */
    public int b() {
        return this.f30219n;
    }

    public int c() {
        return this.f30221p;
    }

    public a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new a(this, bArr, bArr2, jVar);
    }

    public a h(u uVar) {
        return new a(this, uVar);
    }

    private a(a aVar, u uVar) {
        this.f30210e = new k(new m(uVar));
        this.f30211f = aVar.f30211f;
        this.f30213h = aVar.f30213h;
        this.f30214i = aVar.f30214i;
        ArrayList arrayList = new ArrayList();
        this.f30215j = arrayList;
        arrayList.addAll(aVar.f30215j);
        this.f30216k = new TreeMap();
        for (Integer num : aVar.f30216k.keySet()) {
            this.f30216k.put(num, (LinkedList) ((LinkedList) aVar.f30216k.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f30217l = stack;
        stack.addAll(aVar.f30217l);
        this.f30212g = new ArrayList();
        for (c a10 : aVar.f30212g) {
            this.f30212g.add(a10.clone());
        }
        this.f30218m = new TreeMap(aVar.f30218m);
        this.f30219n = aVar.f30219n;
        this.f30221p = aVar.f30221p;
        this.f30220o = aVar.f30220o;
        g();
    }

    private a(a aVar, byte[] bArr, byte[] bArr2, j jVar) {
        this.f30210e = new k(aVar.f30210e.d());
        this.f30211f = aVar.f30211f;
        this.f30213h = aVar.f30213h;
        this.f30214i = aVar.f30214i;
        ArrayList arrayList = new ArrayList();
        this.f30215j = arrayList;
        arrayList.addAll(aVar.f30215j);
        this.f30216k = new TreeMap();
        for (Integer num : aVar.f30216k.keySet()) {
            this.f30216k.put(num, (LinkedList) ((LinkedList) aVar.f30216k.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f30217l = stack;
        stack.addAll(aVar.f30217l);
        this.f30212g = new ArrayList();
        for (c a10 : aVar.f30212g) {
            this.f30212g.add(a10.clone());
        }
        this.f30218m = new TreeMap(aVar.f30218m);
        this.f30219n = aVar.f30219n;
        this.f30221p = aVar.f30221p;
        this.f30220o = false;
        f(bArr, bArr2, jVar);
    }

    private a(k kVar, int i10, int i11, int i12) {
        this.f30210e = kVar;
        this.f30211f = i10;
        this.f30221p = i12;
        this.f30213h = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = i10 - i11;
            if (i13 % 2 == 0) {
                this.f30215j = new ArrayList();
                this.f30216k = new TreeMap();
                this.f30217l = new Stack();
                this.f30212g = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f30212g.add(new c(i14));
                }
                this.f30218m = new TreeMap();
                this.f30219n = 0;
                this.f30220o = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    a(x xVar, int i10, int i11) {
        this(xVar.i(), xVar.b(), xVar.c(), i11);
        this.f30221p = i10;
        this.f30219n = i11;
        this.f30220o = true;
    }

    a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i10) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f30219n < i10) {
            f(bArr, bArr2, jVar);
            this.f30220o = false;
        }
    }
}
