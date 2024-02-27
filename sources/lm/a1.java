package lm;

import bm.l;
import cm.g;
import cm.m;
import java.io.Closeable;
import tl.b;
import tl.g;

public abstract class a1 extends a0 implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final a f24942g = new a((g) null);

    public static final class a extends b {

        /* renamed from: lm.a1$a$a  reason: collision with other inner class name */
        static final class C0319a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0319a f24943e = new C0319a();

            C0319a() {
                super(1);
            }

            /* renamed from: b */
            public final a1 invoke(g.b bVar) {
                if (bVar instanceof a1) {
                    return (a1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(a0.f24940f, C0319a.f24943e);
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }
}
