package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import s2.b;

class b {

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue f5125a;

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue f5126b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5127c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5128d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final a f5129e;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(p2.a aVar, p2.a aVar2) {
            if (aVar.a() == aVar2.a()) {
                return 0;
            }
            return aVar.a() > aVar2.a() ? 1 : -1;
        }
    }

    public b() {
        a aVar = new a();
        this.f5129e = aVar;
        this.f5126b = new PriorityQueue(b.a.f15881a, aVar);
        this.f5125a = new PriorityQueue(b.a.f15881a, aVar);
        this.f5127c = new ArrayList();
    }

    private static p2.a d(PriorityQueue priorityQueue, p2.a aVar) {
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            p2.a aVar2 = (p2.a) it.next();
            if (aVar2.equals(aVar)) {
                return aVar2;
            }
        }
        return null;
    }

    private void g() {
        synchronized (this.f5128d) {
            while (this.f5126b.size() + this.f5125a.size() >= b.a.f15881a && !this.f5125a.isEmpty()) {
                try {
                    ((p2.a) this.f5125a.poll()).e().recycle();
                } finally {
                }
            }
            while (this.f5126b.size() + this.f5125a.size() >= b.a.f15881a && !this.f5126b.isEmpty()) {
                ((p2.a) this.f5126b.poll()).e().recycle();
            }
        }
    }

    public void a(p2.a aVar) {
        synchronized (this.f5128d) {
            g();
            this.f5126b.offer(aVar);
        }
    }

    public void b(p2.a aVar) {
        synchronized (this.f5127c) {
            try {
                if (this.f5127c.size() >= b.a.f15882b) {
                    ((p2.a) this.f5127c.remove(0)).e().recycle();
                }
                this.f5127c.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c(int i10, int i11, float f10, float f11, RectF rectF) {
        p2.a aVar = new p2.a(i10, i11, (Bitmap) null, f10, f11, rectF, true, 0);
        synchronized (this.f5127c) {
            try {
                for (p2.a equals : this.f5127c) {
                    if (equals.equals(aVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List e() {
        ArrayList arrayList;
        synchronized (this.f5128d) {
            arrayList = new ArrayList(this.f5125a);
            arrayList.addAll(this.f5126b);
        }
        return arrayList;
    }

    public List f() {
        List list;
        synchronized (this.f5127c) {
            list = this.f5127c;
        }
        return list;
    }

    public void h() {
        synchronized (this.f5128d) {
            this.f5125a.addAll(this.f5126b);
            this.f5126b.clear();
        }
    }

    public void i() {
        synchronized (this.f5128d) {
            try {
                Iterator it = this.f5125a.iterator();
                while (it.hasNext()) {
                    ((p2.a) it.next()).e().recycle();
                }
                this.f5125a.clear();
                Iterator it2 = this.f5126b.iterator();
                while (it2.hasNext()) {
                    ((p2.a) it2.next()).e().recycle();
                }
                this.f5126b.clear();
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.f5127c) {
            try {
                for (p2.a e10 : this.f5127c) {
                    e10.e().recycle();
                }
                this.f5127c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(int r12, int r13, float r14, float r15, android.graphics.RectF r16, int r17) {
        /*
            r11 = this;
            r1 = r11
            p2.a r0 = new p2.a
            r5 = 0
            r9 = 0
            r10 = 0
            r2 = r0
            r3 = r12
            r4 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r1.f5128d
            monitor-enter(r2)
            java.util.PriorityQueue r3 = r1.f5125a     // Catch:{ all -> 0x002d }
            p2.a r3 = d(r3, r0)     // Catch:{ all -> 0x002d }
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.util.PriorityQueue r0 = r1.f5125a     // Catch:{ all -> 0x002d }
            r0.remove(r3)     // Catch:{ all -> 0x002d }
            r0 = r17
            r3.i(r0)     // Catch:{ all -> 0x002d }
            java.util.PriorityQueue r0 = r1.f5126b     // Catch:{ all -> 0x002d }
            r0.offer(r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r0 = move-exception
            goto L_0x003b
        L_0x002f:
            java.util.PriorityQueue r3 = r1.f5126b     // Catch:{ all -> 0x002d }
            p2.a r0 = d(r3, r0)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r4
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.b.j(int, int, float, float, android.graphics.RectF, int):boolean");
    }
}
