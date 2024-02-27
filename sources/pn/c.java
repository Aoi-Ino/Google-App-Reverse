package pn;

import mn.a;
import nn.b;

class c implements mn.a {

    /* renamed from: a  reason: collision with root package name */
    Object f30487a;

    /* renamed from: b  reason: collision with root package name */
    Object f30488b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f30489c;

    /* renamed from: d  reason: collision with root package name */
    a.C0323a f30490d;

    static class a implements a.C0323a {

        /* renamed from: a  reason: collision with root package name */
        String f30491a;

        /* renamed from: b  reason: collision with root package name */
        mn.c f30492b;

        /* renamed from: c  reason: collision with root package name */
        b f30493c;

        /* renamed from: d  reason: collision with root package name */
        private int f30494d;

        public a(int i10, String str, mn.c cVar, b bVar) {
            this.f30491a = str;
            this.f30492b = cVar;
            this.f30493c = bVar;
            this.f30494d = i10;
        }

        public String a() {
            return this.f30491a;
        }

        public mn.c b() {
            return this.f30492b;
        }

        /* access modifiers changed from: package-private */
        public String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        public final String toString() {
            return c(h.f30511k);
        }
    }

    public c(a.C0323a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f30490d = aVar;
        this.f30487a = obj;
        this.f30488b = obj2;
        this.f30489c = objArr;
    }

    public Object getTarget() {
        return this.f30488b;
    }

    public final String toString() {
        return this.f30490d.toString();
    }
}
