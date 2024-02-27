package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import s3.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5274a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5275b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f5276c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f5277a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5278b;

        a(Object obj, String str) {
            this.f5277a = obj;
            this.f5278b = str;
        }

        public String a() {
            String str = this.f5278b;
            int identityHashCode = System.identityHashCode(this.f5277a);
            return str + "@" + identityHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5277a == aVar.f5277a && this.f5278b.equals(aVar.f5278b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5277a) * 31) + this.f5278b.hashCode();
        }
    }

    public interface b {
        void a(Object obj);

        void b();
    }

    c(Looper looper, Object obj, String str) {
        this.f5274a = new x3.a(looper);
        this.f5275b = o.j(obj, "Listener must not be null");
        this.f5276c = new a(obj, o.e(str));
    }

    public void a() {
        this.f5275b = null;
        this.f5276c = null;
    }

    public a b() {
        return this.f5276c;
    }

    public void c(b bVar) {
        o.j(bVar, "Notifier must not be null");
        this.f5274a.execute(new u(this, bVar));
    }

    /* access modifiers changed from: package-private */
    public final void d(b bVar) {
        Object obj = this.f5275b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
