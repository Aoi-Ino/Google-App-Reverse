package cn;

import cm.g;
import java.util.List;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f20455a = new a.C0269a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f20456b = new a((g) null);

    public static final class a {

        /* renamed from: cn.l$a$a  reason: collision with other inner class name */
        private static final class C0269a implements l {
            public boolean a(int i10, List list) {
                cm.l.f(list, "requestHeaders");
                return true;
            }

            public boolean b(int i10, List list, boolean z10) {
                cm.l.f(list, "responseHeaders");
                return true;
            }

            public boolean c(int i10, in.g gVar, int i11, boolean z10) {
                cm.l.f(gVar, "source");
                gVar.skip((long) i11);
                return true;
            }

            public void d(int i10, b bVar) {
                cm.l.f(bVar, "errorCode");
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    boolean a(int i10, List list);

    boolean b(int i10, List list, boolean z10);

    boolean c(int i10, in.g gVar, int i11, boolean z10);

    void d(int i10, b bVar);
}
