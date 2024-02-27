package ho;

import zo.a;
import zo.c;
import zo.h;
import zo.i;
import zo.k;

public class b extends a {

    /* renamed from: g  reason: collision with root package name */
    private int f24192g;

    /* renamed from: h  reason: collision with root package name */
    private int f24193h;

    /* renamed from: i  reason: collision with root package name */
    private zo.b f24194i;

    /* renamed from: j  reason: collision with root package name */
    private i f24195j;

    /* renamed from: k  reason: collision with root package name */
    private h f24196k;

    /* renamed from: l  reason: collision with root package name */
    private a f24197l;

    /* renamed from: m  reason: collision with root package name */
    private i[] f24198m;

    public b(int i10, int i11, zo.b bVar, i iVar, a aVar, h hVar, String str) {
        super(true, str);
        this.f24192g = i10;
        this.f24193h = i11;
        this.f24194i = bVar;
        this.f24195j = iVar;
        this.f24197l = aVar;
        this.f24196k = hVar;
        this.f24198m = new k(bVar, iVar).c();
    }

    public zo.b b() {
        return this.f24194i;
    }

    public i c() {
        return this.f24195j;
    }

    public a d() {
        return this.f24197l;
    }

    public int e() {
        return this.f24193h;
    }

    public int f() {
        return this.f24192g;
    }

    public h g() {
        return this.f24196k;
    }

    public b(int i10, int i11, zo.b bVar, i iVar, h hVar, String str) {
        this(i10, i11, bVar, iVar, c.a(bVar, iVar), hVar, str);
    }
}
