package qm;

import bm.l;
import cm.m;
import lm.c0;
import pl.x;
import tl.g;

public abstract class z {

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f30871e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f30872f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f30873g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, Object obj, g gVar) {
            super(1);
            this.f30871e = lVar;
            this.f30872f = obj;
            this.f30873g = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x.f30437a;
        }

        public final void invoke(Throwable th2) {
            z.b(this.f30871e, this.f30872f, this.f30873g);
        }
    }

    public static final l a(l lVar, Object obj, g gVar) {
        return new a(lVar, obj, gVar);
    }

    public static final void b(l lVar, Object obj, g gVar) {
        q0 c10 = c(lVar, obj, (q0) null);
        if (c10 != null) {
            c0.a(gVar, c10);
        }
    }

    public static final q0 c(l lVar, Object obj, q0 q0Var) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th2) {
            if (q0Var == null || q0Var.getCause() == th2) {
                return new q0("Exception in undelivered element handler for " + obj, th2);
            }
            b.a(q0Var, th2);
        }
        return q0Var;
    }

    public static /* synthetic */ q0 d(l lVar, Object obj, q0 q0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q0Var = null;
        }
        return c(lVar, obj, q0Var);
    }
}
