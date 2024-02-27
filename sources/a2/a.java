package a2;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import cm.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f52a = 12610;

    /* renamed from: b  reason: collision with root package name */
    private final int f53b = 4;

    /* renamed from: c  reason: collision with root package name */
    private EGLDisplay f54c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f55d;

    /* renamed from: e  reason: collision with root package name */
    private EGLSurface f56e;

    /* renamed from: f  reason: collision with root package name */
    private Surface f57f;

    public a(Surface surface) {
        surface.getClass();
        this.f57f = surface;
        b();
    }

    private final void a() {
        boolean z10 = false;
        while (EGL14.eglGetError() != 12288) {
            z10 = true;
        }
        if (z10) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private final void b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f54c = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12352, this.f53b, this.f52a, 1, 12344};
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f54c, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    this.f55d = EGL14.eglCreateContext(this.f54c, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    a();
                    if (this.f55d != null) {
                        this.f56e = EGL14.eglCreateWindowSurface(this.f54c, eGLConfigArr[0], this.f57f, new int[]{12344}, 0);
                        a();
                        if (this.f56e == null) {
                            throw new RuntimeException("surface was null");
                        }
                        return;
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.f54c = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f54c;
        EGLSurface eGLSurface = this.f56e;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f55d)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void d() {
        if (l.a(EGL14.eglGetCurrentContext(), this.f55d)) {
            EGLDisplay eGLDisplay = this.f54c;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f54c, this.f56e);
        EGL14.eglDestroyContext(this.f54c, this.f55d);
        Surface surface = this.f57f;
        if (surface != null) {
            surface.release();
        }
        this.f54c = null;
        this.f55d = null;
        this.f56e = null;
        this.f57f = null;
    }

    public final void e(long j10) {
        EGLExt.eglPresentationTimeANDROID(this.f54c, this.f56e, j10);
    }

    public final boolean f() {
        return EGL14.eglSwapBuffers(this.f54c, this.f56e);
    }
}
