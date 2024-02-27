package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.b;
import com.google.crypto.tink.shaded.protobuf.x;
import java.util.Collections;
import java.util.Map;

public class p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7163b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile p f7164c;

    /* renamed from: d  reason: collision with root package name */
    static final p f7165d = new p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f7166a = Collections.emptyMap();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7167a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7168b;

        a(Object obj, int i10) {
            this.f7167a = obj;
            this.f7168b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7167a == aVar.f7167a && this.f7168b == aVar.f7168b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7167a) * 65535) + this.f7168b;
        }
    }

    p(boolean z10) {
    }

    public static p b() {
        p pVar = f7164c;
        if (pVar == null) {
            synchronized (p.class) {
                try {
                    pVar = f7164c;
                    if (pVar == null) {
                        pVar = f7163b ? o.a() : f7165d;
                        f7164c = pVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return pVar;
    }

    public x.c a(o0 o0Var, int i10) {
        b.a(this.f7166a.get(new a(o0Var, i10)));
        return null;
    }
}
