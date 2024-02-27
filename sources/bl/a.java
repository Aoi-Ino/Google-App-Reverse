package bl;

import android.graphics.Canvas;
import android.graphics.Paint;
import cl.b;
import cl.c;
import cl.d;
import cl.e;
import cl.f;
import cl.g;
import cl.h;
import cl.i;
import cl.j;
import cl.k;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private b f19985a;

    /* renamed from: b  reason: collision with root package name */
    private c f19986b;

    /* renamed from: c  reason: collision with root package name */
    private g f19987c;

    /* renamed from: d  reason: collision with root package name */
    private k f19988d;

    /* renamed from: e  reason: collision with root package name */
    private h f19989e;

    /* renamed from: f  reason: collision with root package name */
    private e f19990f;

    /* renamed from: g  reason: collision with root package name */
    private j f19991g;

    /* renamed from: h  reason: collision with root package name */
    private d f19992h;

    /* renamed from: i  reason: collision with root package name */
    private i f19993i;

    /* renamed from: j  reason: collision with root package name */
    private f f19994j;

    /* renamed from: k  reason: collision with root package name */
    private int f19995k;

    /* renamed from: l  reason: collision with root package name */
    private int f19996l;

    /* renamed from: m  reason: collision with root package name */
    private int f19997m;

    public a(al.a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f19985a = new b(paint, aVar);
        this.f19986b = new c(paint, aVar);
        this.f19987c = new g(paint, aVar);
        this.f19988d = new k(paint, aVar);
        this.f19989e = new h(paint, aVar);
        this.f19990f = new e(paint, aVar);
        this.f19991g = new j(paint, aVar);
        this.f19992h = new d(paint, aVar);
        this.f19993i = new i(paint, aVar);
        this.f19994j = new f(paint, aVar);
    }

    public void a(Canvas canvas, boolean z10) {
        if (this.f19986b != null) {
            this.f19985a.a(canvas, this.f19995k, z10, this.f19996l, this.f19997m);
        }
    }

    public void b(Canvas canvas, vk.a aVar) {
        c cVar = this.f19986b;
        if (cVar != null) {
            cVar.a(canvas, aVar, this.f19995k, this.f19996l, this.f19997m);
        }
    }

    public void c(Canvas canvas, vk.a aVar) {
        d dVar = this.f19992h;
        if (dVar != null) {
            dVar.a(canvas, aVar, this.f19996l, this.f19997m);
        }
    }

    public void d(Canvas canvas, vk.a aVar) {
        e eVar = this.f19990f;
        if (eVar != null) {
            eVar.a(canvas, aVar, this.f19995k, this.f19996l, this.f19997m);
        }
    }

    public void e(Canvas canvas, vk.a aVar) {
        g gVar = this.f19987c;
        if (gVar != null) {
            gVar.a(canvas, aVar, this.f19995k, this.f19996l, this.f19997m);
        }
    }

    public void f(Canvas canvas, vk.a aVar) {
        f fVar = this.f19994j;
        if (fVar != null) {
            fVar.a(canvas, aVar, this.f19995k, this.f19996l, this.f19997m);
        }
    }

    public void g(Canvas canvas, vk.a aVar) {
        h hVar = this.f19989e;
        if (hVar != null) {
            hVar.a(canvas, aVar, this.f19996l, this.f19997m);
        }
    }

    public void h(Canvas canvas, vk.a aVar) {
        i iVar = this.f19993i;
        if (iVar != null) {
            iVar.a(canvas, aVar, this.f19995k, this.f19996l, this.f19997m);
        }
    }

    public void i(Canvas canvas, vk.a aVar) {
        j jVar = this.f19991g;
        if (jVar != null) {
            jVar.a(canvas, aVar, this.f19996l, this.f19997m);
        }
    }

    public void j(Canvas canvas, vk.a aVar) {
        k kVar = this.f19988d;
        if (kVar != null) {
            kVar.a(canvas, aVar, this.f19996l, this.f19997m);
        }
    }

    public void k(int i10, int i11, int i12) {
        this.f19995k = i10;
        this.f19996l = i11;
        this.f19997m = i12;
    }
}
