package a2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import cm.l;
import pl.x;

public final class e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    private SurfaceTexture f73a;

    /* renamed from: b  reason: collision with root package name */
    private Surface f74b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f75c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f76d;

    /* renamed from: e  reason: collision with root package name */
    private h f77e;

    public e() {
        e();
    }

    private final void e() {
        h hVar = new h();
        this.f77e = hVar;
        hVar.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(hVar.d());
        this.f73a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f74b = new Surface(this.f73a);
    }

    public final void a() {
        synchronized (this.f75c) {
            while (!this.f76d) {
                try {
                    this.f75c.wait((long) 100);
                    if (!this.f76d) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.f76d = false;
            x xVar = x.f30437a;
        }
        h hVar = this.f77e;
        if (hVar != null) {
            hVar.a("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.f73a;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void b() {
        h hVar = this.f77e;
        if (hVar != null) {
            SurfaceTexture surfaceTexture = this.f73a;
            l.c(surfaceTexture);
            hVar.c(surfaceTexture);
        }
    }

    public final Surface c() {
        return this.f74b;
    }

    public final void d() {
        Surface surface = this.f74b;
        if (surface != null) {
            surface.release();
        }
        this.f77e = null;
        this.f74b = null;
        this.f73a = null;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f75c) {
            if (!this.f76d) {
                this.f76d = true;
                this.f75c.notifyAll();
                x xVar = x.f30437a;
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }
}
