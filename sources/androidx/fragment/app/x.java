package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.k;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import o0.c;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private final m f3205a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f3206b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList f3207c;

    /* renamed from: d  reason: collision with root package name */
    int f3208d;

    /* renamed from: e  reason: collision with root package name */
    int f3209e;

    /* renamed from: f  reason: collision with root package name */
    int f3210f;

    /* renamed from: g  reason: collision with root package name */
    int f3211g;

    /* renamed from: h  reason: collision with root package name */
    int f3212h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3213i;

    /* renamed from: j  reason: collision with root package name */
    boolean f3214j;

    /* renamed from: k  reason: collision with root package name */
    String f3215k;

    /* renamed from: l  reason: collision with root package name */
    int f3216l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f3217m;

    /* renamed from: n  reason: collision with root package name */
    int f3218n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f3219o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList f3220p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList f3221q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3222r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList f3223s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f3224a;

        /* renamed from: b  reason: collision with root package name */
        i f3225b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3226c;

        /* renamed from: d  reason: collision with root package name */
        int f3227d;

        /* renamed from: e  reason: collision with root package name */
        int f3228e;

        /* renamed from: f  reason: collision with root package name */
        int f3229f;

        /* renamed from: g  reason: collision with root package name */
        int f3230g;

        /* renamed from: h  reason: collision with root package name */
        k.b f3231h;

        /* renamed from: i  reason: collision with root package name */
        k.b f3232i;

        a() {
        }

        a(int i10, i iVar) {
            this.f3224a = i10;
            this.f3225b = iVar;
            this.f3226c = false;
            k.b bVar = k.b.RESUMED;
            this.f3231h = bVar;
            this.f3232i = bVar;
        }

        a(int i10, i iVar, boolean z10) {
            this.f3224a = i10;
            this.f3225b = iVar;
            this.f3226c = z10;
            k.b bVar = k.b.RESUMED;
            this.f3231h = bVar;
            this.f3232i = bVar;
        }

        a(a aVar) {
            this.f3224a = aVar.f3224a;
            this.f3225b = aVar.f3225b;
            this.f3226c = aVar.f3226c;
            this.f3227d = aVar.f3227d;
            this.f3228e = aVar.f3228e;
            this.f3229f = aVar.f3229f;
            this.f3230g = aVar.f3230g;
            this.f3231h = aVar.f3231h;
            this.f3232i = aVar.f3232i;
        }
    }

    x(m mVar, ClassLoader classLoader) {
        this.f3207c = new ArrayList();
        this.f3214j = true;
        this.f3222r = false;
        this.f3205a = mVar;
        this.f3206b = classLoader;
    }

    public x b(int i10, i iVar) {
        m(i10, iVar, (String) null, 1);
        return this;
    }

    public x c(int i10, i iVar, String str) {
        m(i10, iVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public x d(ViewGroup viewGroup, i iVar, String str) {
        iVar.L = viewGroup;
        return c(viewGroup.getId(), iVar, str);
    }

    public x e(i iVar, String str) {
        m(0, iVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f3207c.add(aVar);
        aVar.f3227d = this.f3208d;
        aVar.f3228e = this.f3209e;
        aVar.f3229f = this.f3210f;
        aVar.f3230g = this.f3211g;
    }

    public x g(String str) {
        if (this.f3214j) {
            this.f3213i = true;
            this.f3215k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public x l() {
        if (!this.f3213i) {
            this.f3214j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, i iVar, String str, int i11) {
        String str2 = iVar.V;
        if (str2 != null) {
            c.f(iVar, str2);
        }
        Class<?> cls = iVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = iVar.D;
            if (str3 == null || str.equals(str3)) {
                iVar.D = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + iVar + ": was " + iVar.D + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = iVar.B;
                if (i12 == 0 || i12 == i10) {
                    iVar.B = i10;
                    iVar.C = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + iVar + ": was " + iVar.B + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + iVar + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i11, iVar));
    }

    public x n(i iVar) {
        f(new a(3, iVar));
        return this;
    }

    public x o(int i10, i iVar) {
        return p(i10, iVar, (String) null);
    }

    public x p(int i10, i iVar, String str) {
        if (i10 != 0) {
            m(i10, iVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public x q(int i10, int i11, int i12, int i13) {
        this.f3208d = i10;
        this.f3209e = i11;
        this.f3210f = i12;
        this.f3211g = i13;
        return this;
    }

    public x r(i iVar) {
        f(new a(8, iVar));
        return this;
    }

    public x s(boolean z10) {
        this.f3222r = z10;
        return this;
    }

    x(m mVar, ClassLoader classLoader, x xVar) {
        this(mVar, classLoader);
        Iterator it = xVar.f3207c.iterator();
        while (it.hasNext()) {
            this.f3207c.add(new a((a) it.next()));
        }
        this.f3208d = xVar.f3208d;
        this.f3209e = xVar.f3209e;
        this.f3210f = xVar.f3210f;
        this.f3211g = xVar.f3211g;
        this.f3212h = xVar.f3212h;
        this.f3213i = xVar.f3213i;
        this.f3214j = xVar.f3214j;
        this.f3215k = xVar.f3215k;
        this.f3218n = xVar.f3218n;
        this.f3219o = xVar.f3219o;
        this.f3216l = xVar.f3216l;
        this.f3217m = xVar.f3217m;
        if (xVar.f3220p != null) {
            ArrayList arrayList = new ArrayList();
            this.f3220p = arrayList;
            arrayList.addAll(xVar.f3220p);
        }
        if (xVar.f3221q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3221q = arrayList2;
            arrayList2.addAll(xVar.f3221q);
        }
        this.f3222r = xVar.f3222r;
    }
}
