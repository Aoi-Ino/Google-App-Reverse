package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b1.d;
import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import om.m;
import pl.t;

public final class j0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3289f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class[] f3290g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map f3291a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f3292b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f3293c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f3294d;

    /* renamed from: e  reason: collision with root package name */
    private final d.c f3295e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final j0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ClassLoader classLoader = j0.class.getClassLoader();
                l.c(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state".toString());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    l.d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new j0(linkedHashMap);
            } else if (bundle2 == null) {
                return new j0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    l.e(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new j0(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : j0.f3290g) {
                l.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this.f3291a = new LinkedHashMap();
        this.f3292b = new LinkedHashMap();
        this.f3293c = new LinkedHashMap();
        this.f3294d = new LinkedHashMap();
        this.f3295e = new i0(this);
    }

    /* access modifiers changed from: private */
    public static final Bundle d(j0 j0Var) {
        l.f(j0Var, "this$0");
        for (Map.Entry entry : i0.p(j0Var.f3292b).entrySet()) {
            j0Var.e((String) entry.getKey(), ((d.c) entry.getValue()).a());
        }
        Set<String> keySet = j0Var.f3291a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(j0Var.f3291a.get(str));
        }
        return androidx.core.os.d.a(t.a("keys", arrayList), t.a("values", arrayList2));
    }

    public final d.c c() {
        return this.f3295e;
    }

    public final void e(String str, Object obj) {
        l.f(str, "key");
        if (f3289f.b(obj)) {
            Object obj2 = this.f3293c.get(str);
            a0 a0Var = obj2 instanceof a0 ? (a0) obj2 : null;
            if (a0Var != null) {
                a0Var.m(obj);
            } else {
                this.f3291a.put(str, obj);
            }
            m mVar = (m) this.f3294d.get(str);
            if (mVar != null) {
                mVar.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        l.c(obj);
        sb2.append(obj.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public j0(Map map) {
        l.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3291a = linkedHashMap;
        this.f3292b = new LinkedHashMap();
        this.f3293c = new LinkedHashMap();
        this.f3294d = new LinkedHashMap();
        this.f3295e = new i0(this);
        linkedHashMap.putAll(map);
    }
}
