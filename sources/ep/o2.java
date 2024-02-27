package ep;

import dp.o;
import fp.b;
import gp.d;
import gp.e;
import hp.g0;
import hp.i;
import hp.v;
import ip.z;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class o2 implements o {

    /* renamed from: a  reason: collision with root package name */
    private final e3 f23357a;

    /* renamed from: b  reason: collision with root package name */
    private final d f23358b;

    /* renamed from: c  reason: collision with root package name */
    private final n3 f23359c;

    /* renamed from: d  reason: collision with root package name */
    private final i f23360d;

    public o2() {
        this((Map) new HashMap());
    }

    private Object c(Class cls, hp.o oVar, w wVar) {
        return new w3(wVar).e(oVar, cls);
    }

    private Object d(Class cls, hp.o oVar, d3 d3Var) {
        return c(cls, oVar, new k3(this.f23358b, this.f23359c, d3Var));
    }

    private void g(Object obj, g0 g0Var, w wVar) {
        new w3(wVar).g(g0Var, obj);
    }

    private void h(Object obj, g0 g0Var, d3 d3Var) {
        g(obj, g0Var, new k3(this.f23358b, this.f23359c, d3Var));
    }

    public Object a(Class cls, Reader reader, boolean z10) {
        return e(cls, v.b(reader), z10);
    }

    public void b(Object obj, Writer writer) {
        f(obj, v.c(writer, this.f23360d));
    }

    public Object e(Class cls, hp.o oVar, boolean z10) {
        try {
            return d(cls, oVar, this.f23357a.d(z10));
        } finally {
            this.f23357a.a();
        }
    }

    public void f(Object obj, g0 g0Var) {
        try {
            h(obj, g0Var, this.f23357a.c());
        } finally {
            this.f23357a.a();
        }
    }

    public o2(b bVar) {
        this(new e(), bVar);
    }

    public o2(d dVar, b bVar) {
        this(dVar, bVar, new i());
    }

    public o2(d dVar, b bVar, i iVar) {
        this(dVar, bVar, new v0(), iVar);
    }

    public o2(d dVar, b bVar, z zVar, i iVar) {
        this.f23359c = new n3(bVar, zVar, iVar);
        this.f23357a = new e3();
        this.f23358b = dVar;
        this.f23360d = iVar;
    }

    public o2(Map map) {
        this((b) new fp.d(map));
    }
}
