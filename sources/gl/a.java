package gl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gl.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    final t f23752a;

    /* renamed from: b  reason: collision with root package name */
    final w f23753b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference f23754c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f23755d;

    /* renamed from: e  reason: collision with root package name */
    final int f23756e;

    /* renamed from: f  reason: collision with root package name */
    final int f23757f;

    /* renamed from: g  reason: collision with root package name */
    final int f23758g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable f23759h;

    /* renamed from: i  reason: collision with root package name */
    final String f23760i;

    /* renamed from: j  reason: collision with root package name */
    final Object f23761j;

    /* renamed from: k  reason: collision with root package name */
    boolean f23762k;

    /* renamed from: l  reason: collision with root package name */
    boolean f23763l;

    /* renamed from: gl.a$a  reason: collision with other inner class name */
    static class C0294a extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        final a f23764a;

        public C0294a(a aVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f23764a = aVar;
        }
    }

    a(t tVar, Object obj, w wVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj2, boolean z10) {
        this.f23752a = tVar;
        this.f23753b = wVar;
        this.f23754c = obj == null ? null : new C0294a(this, obj, tVar.f23904j);
        this.f23756e = i10;
        this.f23757f = i11;
        this.f23755d = z10;
        this.f23758g = i12;
        this.f23759h = drawable;
        this.f23760i = str;
        this.f23761j = obj2 == null ? this : obj2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f23763l = true;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, t.e eVar);

    /* access modifiers changed from: package-private */
    public abstract void c();

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f23760i;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f23756e;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f23757f;
    }

    /* access modifiers changed from: package-private */
    public t g() {
        return this.f23752a;
    }

    /* access modifiers changed from: package-private */
    public t.f h() {
        return this.f23753b.f23959r;
    }

    /* access modifiers changed from: package-private */
    public w i() {
        return this.f23753b;
    }

    /* access modifiers changed from: package-private */
    public Object j() {
        return this.f23761j;
    }

    /* access modifiers changed from: package-private */
    public Object k() {
        WeakReference weakReference = this.f23754c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f23763l;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f23762k;
    }
}
