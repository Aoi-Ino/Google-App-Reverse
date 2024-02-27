package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class m1 extends AbstractList implements d0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final d0 f7130e;

    class a implements ListIterator {

        /* renamed from: e  reason: collision with root package name */
        ListIterator f7131e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7132f;

        a(int i10) {
            this.f7132f = i10;
            this.f7131e = m1.this.f7130e.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f7131e.next();
        }

        /* renamed from: d */
        public String previous() {
            return (String) this.f7131e.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f7131e.hasNext();
        }

        public boolean hasPrevious() {
            return this.f7131e.hasPrevious();
        }

        public int nextIndex() {
            return this.f7131e.nextIndex();
        }

        public int previousIndex() {
            return this.f7131e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        Iterator f7134e;

        b() {
            this.f7134e = m1.this.f7130e.iterator();
        }

        /* renamed from: a */
        public String next() {
            return (String) this.f7134e.next();
        }

        public boolean hasNext() {
            return this.f7134e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public m1(d0 d0Var) {
        this.f7130e = d0Var;
    }

    public void I(h hVar) {
        throw new UnsupportedOperationException();
    }

    public d0 N() {
        return this;
    }

    public Object S(int i10) {
        return this.f7130e.S(i10);
    }

    public List W() {
        return this.f7130e.W();
    }

    public Iterator iterator() {
        return new b();
    }

    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    /* renamed from: n */
    public String get(int i10) {
        return (String) this.f7130e.get(i10);
    }

    public int size() {
        return this.f7130e.size();
    }
}
