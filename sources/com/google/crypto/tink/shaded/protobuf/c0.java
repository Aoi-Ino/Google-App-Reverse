package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class c0 extends c implements d0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    private static final c0 f7059g;

    /* renamed from: h  reason: collision with root package name */
    public static final d0 f7060h;

    /* renamed from: f  reason: collision with root package name */
    private final List f7061f;

    static {
        c0 c0Var = new c0();
        f7059g = c0Var;
        c0Var.u();
        f7060h = c0Var;
    }

    public c0() {
        this(10);
    }

    private static String o(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof h ? ((h) obj).m0() : z.j((byte[]) obj);
    }

    public void I(h hVar) {
        l();
        this.f7061f.add(hVar);
        this.modCount++;
    }

    public d0 N() {
        return c0() ? new m1(this) : this;
    }

    public Object S(int i10) {
        return this.f7061f.get(i10);
    }

    public List W() {
        return Collections.unmodifiableList(this.f7061f);
    }

    public boolean addAll(int i10, Collection collection) {
        l();
        if (collection instanceof d0) {
            collection = ((d0) collection).W();
        }
        boolean addAll = this.f7061f.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    public void clear() {
        l();
        this.f7061f.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: n */
    public void add(int i10, String str) {
        l();
        this.f7061f.add(i10, str);
        this.modCount++;
    }

    /* renamed from: r */
    public String get(int i10) {
        Object obj = this.f7061f.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String m02 = hVar.m0();
            if (hVar.F()) {
                this.f7061f.set(i10, m02);
            }
            return m02;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = z.j(bArr);
        if (z.g(bArr)) {
            this.f7061f.set(i10, j10);
        }
        return j10;
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public c0 z(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7061f);
            return new c0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public int size() {
        return this.f7061f.size();
    }

    /* renamed from: v */
    public String remove(int i10) {
        l();
        Object remove = this.f7061f.remove(i10);
        this.modCount++;
        return o(remove);
    }

    /* renamed from: y */
    public String set(int i10, String str) {
        l();
        return o(this.f7061f.set(i10, str));
    }

    public c0(int i10) {
        this(new ArrayList(i10));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private c0(ArrayList arrayList) {
        this.f7061f = arrayList;
    }
}
